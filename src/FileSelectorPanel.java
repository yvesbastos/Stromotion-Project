import java.awt.*;
import java.io.File;
import javafx.stage.FileChooser;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * @author yvesbastos 
 */
class FileSelectorPanel extends JFrame {
    
    private static final long serialVersionUID = 1L;
    private JPanel panel3;
    
    /**
     * Constructor: window to select video file for edition
     * @param fileType filter for type of file to be selected
     */
    public FileSelectorPanel(String fileType) {
    	selectFile(null, fileType);
    	
    }
    
    /**
     * Constructor: file path passed as argument, does not show file selector.
     * @param filePath
     * @param fileType
     */
    public FileSelectorPanel(String filePath, String fileType) {
    	selectFile(filePath, fileType);
    }
    
    private int selectFile(String filePath, String fileType) {
    	if (filePath != null) {
  		  VideoProcessor videoProcessor = new VideoProcessor(filePath);
  		  return 1;
    	}
    	
    	JFileChooser fileChooser = new JFileChooser();
    	String fileExtension = "." + fileType;
    	
        FileNameExtensionFilter mp4Filter = new FileNameExtensionFilter(fileExtension,fileType);
        fileChooser.setFileFilter(mp4Filter);
        
    	fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
    	int result = fileChooser.showOpenDialog(this);
    	if (result == JFileChooser.APPROVE_OPTION) {
    		  File selectedFile = fileChooser.getSelectedFile();
    		  VideoProcessor videoProcessor = new VideoProcessor(selectedFile.getAbsolutePath());
    		  System.out.println("Selected file: " + selectedFile.getAbsolutePath());
    		  //TODO ...
    	}
    	return 1;
    }
}