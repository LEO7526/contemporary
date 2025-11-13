import java.awt.*;
import java.awt.event.*;

//implements separate inner Command classes as extensions of
//Button and Menu items

public class tCommand extends Frame
   implements ActionListener
{
   Menu mnuFile;
   MenuItem mnuOpen;
   MenuItem mnuExit;
   Button btnRed;
   Panel p;
   Frame fr;
   //-----------------------------------------
   public tCommand()
   {
      super("Frame with commands");
      fr = this;     //save frame object
      MenuBar mbar = new MenuBar();
      setMenuBar(mbar);

      mnuFile = new Menu("File", true);
      mbar.add(mnuFile);

      mnuOpen = new MenuItem("Open...");
      mnuFile.add(mnuOpen);
      mnuExit = new MenuItem("Exit");
      mnuFile.add(mnuExit);

      mnuOpen.addActionListener(this);
      mnuExit.addActionListener(this);

      btnRed = new Button("Red");
      p = new Panel();
      add(p);
      p.add(btnRed);

      btnRed.addActionListener(this);
      setBounds(100,100,200,100);
      setVisible(true);
   }

	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj == mnuOpen)
			fileOpen(); //open file
		if (obj == mnuExit)
			exitClicked(); //exit from program
		if (obj == btnRed)
			redClicked(); //turn red
	}
	//-----------------------------------------
	private void exitClicked() {
		System.exit(0);
	}
	//-----------------------------------------
	private void fileOpen() {
		FileDialog fDlg = new FileDialog(this, "Open a file",
		FileDialog.LOAD);
		fDlg.show();
	}
	//-----------------------------------------
	private void redClicked() {
		p.setBackground(Color.red);
	}
	//-----------------------------------------
   static public void main(String argv[])
   {
      new tCommand();
   }
}


//==========================================


