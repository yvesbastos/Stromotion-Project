
public class Main {

    // this is where my quest starts. Now, I would like to work with the file
    // chosen...
    // for my ordinary 'popup' fileChoosers the code below works, so I tried the
    // code below

    // int returnVal = fileChooser.showOpenDialog(panel3);
    // if (returnVal == JFileChooser.APPROVE_OPTION)
    // fileName = fileChooser.getSelectedFile().getPath();
    // System.out.println(fileName);

    // but in this case it messes everything up..., after uncommenting I lose
    // the frames, and get a popup again...
    // anybody a suggestion how to actually get the users chosen file?
	
	public static void main(String[] args) {
        FileSelectorPanel mainFrame = new FileSelectorPanel("mp4");
        mainFrame.pack();
        mainFrame.setVisible(true);
	}

}
