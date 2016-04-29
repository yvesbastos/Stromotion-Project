import java.awt.*;
import java.io.File;
	
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * @author yvesbastos 
 */
class FileSelectorPanel extends JFrame {
    
    private static final long serialVersionUID = 1L;
    private JPanel panel3;
    
    /**
     * Window to select video file for edition
     * @param fileType filter for type of file to be selected
     */
    //ehehehehee
    //hahahahaha
    //kkkkk
    public FileSelectorPanel(String fileType) {
    	JFileChooser fileChooser = new JFileChooser();
    	String fileExtension = "." + fileType;
    	
        FileNameExtensionFilter mp4Filter = new FileNameExtensionFilter(fileExtension,fileType);
        fileChooser.setFileFilter(mp4Filter);
        
    	fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
    	int result = fileChooser.showOpenDialog(this);
    	if (result == JFileChooser.APPROVE_OPTION) {
    		  File selectedFile = fileChooser.getSelectedFile();
    		  VideoProcessor videoProcessor = new VideoProcessor(selectedFile);
    		  System.out.println("Selected file: " + selectedFile.getAbsolutePath());
    		  //TODO ...
    	}	
    }
}