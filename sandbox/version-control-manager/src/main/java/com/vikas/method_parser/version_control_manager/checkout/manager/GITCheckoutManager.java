package com.vikas.method_parser.version_control_manager.checkout.manager;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/** Used to checkout git repositories. */
public class GITCheckoutManager implements CheckoutManager {
  /**
   * Used to checkout a list of git repos.
   *
   * @param repoURLs : List of git repos.
   * @param checkoutPath : parent path were the repos will be cloned.
   */
  @Override
  public void checkout(List<String> repoURLs, String checkoutPath) {
    repoURLs.forEach(
        repo -> {
          try {
            Git.cloneRepository()
                .setURI(repo)
                .setDirectory(new File(getIndividualCheckoutPath(repo, checkoutPath)))
                .call();
          } catch (GitAPIException e) {
            // Todo: Implement the logger and handle this.
            e.printStackTrace();
          }
        });
  }

  /**
   * Gets full checkout path for each repo.
   *
   * @param repo : repo url of the git repo being checked out.
   * @param checkoutPath : parent checkout path.
   * @return {@link String} representing full checkout path for each repo.
   */
  private String getIndividualCheckoutPath(String repo, String checkoutPath) {
    String repoName = repo.substring(repo.lastIndexOf("/") + 1, repo.lastIndexOf("."));
    Path filePath = Paths.get(checkoutPath.toString(), repoName);
    return filePath.toString();
  }
}
