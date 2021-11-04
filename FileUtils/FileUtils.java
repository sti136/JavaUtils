package FileUtils;

import java.io.File;
import java.util.LinkedList;

public interface FileUtils {
	
    LinkedList<String> read(File file);
    boolean write(File file, String writtenStr);
    
}
