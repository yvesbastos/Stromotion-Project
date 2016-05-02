import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import org.opencv.core.Mat;
import org.opencv.videoio.VideoCapture;


public class VideoProcessor {

	//private File video;
	VideoCapture videoCapture;
	
	public VideoProcessor(String video) {
		//this.video = video;
		videoCapture = new VideoCapture();
		videoCapture.open(video);
	    
		/*Mat frame = new Mat();
		JFrame jframe = new JFrame("Title");
	    jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    JLabel vidpanel = new JLabel();
	    jframe.setContentPane(vidpanel);
	    jframe.setVisible(true);*/
	    
	    
	   
	}
	
	private void startProcessing() {
		//TODO Integrate with OpenCV
	}

}
