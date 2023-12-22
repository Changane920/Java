import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;

public class getData {
	private static String imgPath;
	private static BufferedImage img;
	public String getImgPath() {
		return this.imgPath;
	}
	public void setImgPath(String getPath) {
		this.imgPath = getPath;
	}
	public BufferedImage getImg() {
		return this.img;
	}
	public void setImg(BufferedImage i) {
		this.img = i;
	}
}
