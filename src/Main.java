
public class Main {

	//TODO update FileSelectorPanel to FileSelectorPanel2. FileSelectorPanel2 uses the native OS interface for selecting files. 
	public static void main(String[] args) {
        FileSelectorPanel mainFrame = new FileSelectorPanel("mp4");
        mainFrame.pack();
        mainFrame.setVisible(true);
	}

}
