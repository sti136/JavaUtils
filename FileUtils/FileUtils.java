package FileUtils;

import java.io.File;

public interface FileUtils {
	
    boolean read(File file);
    boolean write(File file, String writtenStr);
    
}
