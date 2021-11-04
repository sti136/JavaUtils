package FileUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.LinkedList;

public abstract class FileUtilsAbstract implements FileUtils {
	public static final Charset utf8 = Charset.forName("UTF-8");
	public abstract LinkedList<String> filterRead(LinkedList<String> rawList);
    public LinkedList<String> read(File file) {
    	LinkedList<String> result = new LinkedList<>();
    	
    	try(FileInputStream fis = new FileInputStream(file);BufferedReader br = new BufferedReader(new InputStreamReader(fis))){
    		while(true) {
    			String s = br.readLine();
    			if(s==null) break;
    			result.add(s);
    		}
    		
    	} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
    	
    }
    public boolean write(File file, String writtenStr) {
    	try(FileOutputStream fos = new FileOutputStream(file);OutputStreamWriter osw = new OutputStreamWriter(fos)){
    		osw.write(writtenStr);
    		return true;
    	} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
    }
}
