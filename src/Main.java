import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;


public class Main {

	//TODO update FileSelectorPanel to FileSelectorPanel2. FileSelectorPanel2 uses the native OS interface for selecting files. 
	public static void main(String[] args) {
        FileSelectorPanel mainFrame = new FileSelectorPanel("mp4");
        mainFrame.pack();
        mainFrame.setVisible(true);
        
        openCVExample();
        
	}
	
	//TODO simple example to check if OpenCV is running on all machines. Delete afterwards.
	private static void openCVExample() {
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        Mat mat = Mat.eye(3, 3, CvType.CV_8UC1);
        System.out.println("mat = " + mat.dump());
	}

}
