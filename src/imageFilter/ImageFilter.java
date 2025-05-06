package imageFilter;

import java.io.IOException;

import pgmImage.PGMImage;

public class ImageFilter {

	public static PGMImage applyFilter(PGMImage img, int[][] kernel) {
		int height = img.height;
		int width = img.width;

		int kSize = kernel.length;
		int kOffset = kSize / 2;

		int kernelSum = calcularSumaKernel(kernel);

		int[][] newPixels = new int[height][width];

		for (int i = kOffset; i < height - kOffset; i++) {
			for (int j = kOffset; j < width - kOffset; j++) {
				int sum = 0;
				for (int ki = -kOffset; ki <= kOffset; ki++) {
					for (int kj = -kOffset; kj <= kOffset; kj++) {
						int pixel = img.pixels[i + ki][j + kj];
						int kernelValue = kernel[ki + kOffset][kj + kOffset];
						sum += kernelValue * pixel;
					}
				}
				// Normalizamos si el kernel suma algo (ej: blur) y evitamos dividir por 0
				if (kernelSum != 0) {
					sum /= kernelSum;
				}

				// Clipping al rango válido
				sum = Math.max(0, Math.min(img.maxValue, sum));
				newPixels[i][j] = sum;
			}
		}

		return new PGMImage(img.width, img.height, img.maxValue, newPixels);
	}

	public static int calcularSumaKernel(int[][] kernel) {
		int suma = 0;
		for (int i = 0; i < kernel.length; i++) {
			for (int j = 0; j < kernel[0].length; j++) {
				suma += kernel[i][j];
			}
		}
		return suma;
	}
}

class PGMImageManual extends PGMImage {
	public PGMImageManual(int width, int height, int maxValue, int[][] pixels) throws IOException {
		super("");
		this.width = width;
		this.height = height;
		this.maxValue = maxValue;
		this.pixels = pixels;
	}
}
