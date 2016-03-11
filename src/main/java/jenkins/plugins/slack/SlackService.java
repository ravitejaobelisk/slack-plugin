package jenkins.plugins.slack;

import java.util.List;
import java.io.File;

public interface SlackService {
    boolean publish(String message);

    boolean publish(String message, String color);

    boolean publish(String message, String color, List<File> filesToUpload, String uploadFilesUserToken);
}
