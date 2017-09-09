package kim.Beat3;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class DynamicBeat extends JFrame{
	private Image screenImage;
	private Graphics screenGraphics;
	
	private Image introBackground;
	
	public DynamicBeat(){
		setTitle("Dynamic Beat!");
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		introBackground = new ImageIcon(Main.class.getResource("../images/intro.jpg")).getImage();
		Music introMusic = new Music("weAre.mp3", true);
		introMusic.start();
		
	}

	public void paint(Graphics g){
		screenImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		screenGraphics = screenImage.getGraphics();
		screeanDraw(screenGraphics);
		g.drawImage(screenImage, 0, 0, null);
	}
	
	public void screeanDraw(Graphics g){
		g.drawImage(introBackground, 0, 0, null);
		this.repaint();
	}
}
