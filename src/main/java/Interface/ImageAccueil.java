package Interface;

import javax.swing.*;

public enum ImageAccueil {
	MEDECIN("src/img/doctor.png");
	private ImageIcon imageIcon;
	ImageAccueil(String imagePath){
	imageIcon = new ImageIcon(imagePath);
	}
	
	public  ImageIcon getImageIcon() {
		return  imageIcon;
	}
}
