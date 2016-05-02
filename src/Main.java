import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;

public class Main {

	//TODO update FileSelectorPanel to FileSelectorPanel2. FileSelectorPanel2 uses the native OS interface for selecting files. 
	public static void main(String[] args) {
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);

		FileSelectorPanel mainFrame = new FileSelectorPanel("data/1/clip1.mp4", "mp4");
        mainFrame.pack();
        mainFrame.setVisible(true);
        
        
	}
}
