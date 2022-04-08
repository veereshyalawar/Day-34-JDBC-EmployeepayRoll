
import java.io.File;

/**
 * created class FileUtils
 * 
 * @author user -Veeresh
 *
 */
public class FileUtils {

	/**
	 * created boolean method deleteFiles for deleting files
	 * 
	 * @param contentsToDelete
	 * @return
	 */
	public static boolean deleteFiles(File contentsToDelete) {
		File[] allContents = contentsToDelete.listFiles();
		if (allContents != null) {
			for (File file : allContents) {
				deleteFiles(file);
			}
		}
		return contentsToDelete.delete();
	}
}