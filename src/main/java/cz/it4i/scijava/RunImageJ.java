package cz.it4i.scijava;

import net.imagej.ImageJ;

public class RunImageJ {

	public static void main(String[] args) {
		ImageJ ij = new ImageJ();
		ij.ui().showUI();
	}

}
