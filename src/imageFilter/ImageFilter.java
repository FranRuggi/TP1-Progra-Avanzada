package imageFilter;

import java.io.IOException;

import pgmImage.PGMImage;

public class ImageFilter {
	
    public static PGMImage applyFilter(PGMImage img, int[][] kernel) {
        int height = img.height;
        int width = img.width;
        int[][] newPixels = new int[height][width];

        // Aplicamos convolución
        for (int i = 1; i < height - 1; i++) {
            for (int j = 1; j < width - 1; j++) {
                int sum = 0;
                for (int ki = -1; ki <= 1; ki++) {
                    for (int kj = -1; kj <= 1; kj++) {
                        sum += kernel[ki + 1][kj + 1] * img.pixels[i + ki][j + kj];
                    }
                }
                sum = Math.max(0, Math.min(img.maxValue, sum));
                newPixels[i][j] = sum;
            }
        }

        PGMImage result = new PGMImage(img.width, img.height, img.maxValue, newPixels);
        return result;
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
