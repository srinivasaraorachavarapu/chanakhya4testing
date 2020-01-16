package reporting;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class ReportImage
{
	int x;
	int y;
	int w;
	int h;
	int Xcoordinate = 0;
	int Ycoordinate = 0;
	int Width=0;
	int Height=0;
	public ReportImage()
	{
		x=Xcoordinate;
		y=Ycoordinate;
		w=Width;
		h=Height;
		int z=w*h;
	}
	public File getTitleScreenshot(String filePath) throws Exception
	{
		File dest=new File(filePath);
		Robot r=new Robot();
		Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rect=new Rectangle(d);
		BufferedImage i=r.createScreenCapture(rect);
		ImageIO.write(i,"png",dest);
		BufferedImage sImage=i.getSubimage(18, 12, 257, 38);
		ImageIO.write(sImage, "png", dest);
		return(dest);
	}
	public File getTitleScreenshotMax(String filePath) throws Exception
	{
		File dest=new File(filePath);
		Robot r=new Robot();
		Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rect=new Rectangle(d);
		BufferedImage i=r.createScreenCapture(rect);
		ImageIO.write(i,"png",dest);
		BufferedImage sImage=i.getSubimage(0, 0, 257, 36);
		ImageIO.write(sImage, "png", dest);
		return(dest);
	}
	public File getTitleScreenshot(String filePath, int Xcoordinate, int Ycoordinate, int Width, int Height) throws Exception
	{
		File dest=new File(filePath);
		Robot r=new Robot();
		Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rect=new Rectangle(d);
		BufferedImage i=r.createScreenCapture(rect);
		ImageIO.write(i,"png",dest);
		BufferedImage sImage=i.getSubimage(Xcoordinate, Ycoordinate, Width, Height);
		ImageIO.write(sImage, "png", dest);
		return(dest);

	}
}
