
package main;
import java.io.IOException;

import imageFilter.ImageFilter;
import pgmImage.PGMImage;

public class Main {

    public static void main(String[] args) throws IOException {
    	String ruta = new String("C:/Users/living/Downloads/imagenes/");
    	
        PGMImage originalImage = new PGMImage(ruta + "Ajedrez.pgm");

        // Definimos los kernels
        int[][] blurKernel = {
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1}
        };

        int[][] sobelHorizontalKernel = {
        		{-1, 0, 1},
                {-2, 0, 2},
                {-1, 0, 1}
        };

        int[][] sobelVerticalKernel = {
                {-1, -2, -1},
                {0, 0, 0},
                {1, 2, 1}
        };

        int[][] prewittHorizontalKernel = {
        		{-1, 0, 1},
                {-1, 0, 1},
                {-1, 0, 1}
        };

        int[][] prewittVerticalKernel = {
        		{-2, -2, -4,-2, -2},
                {-1, -1, -2, -1, -1},
                {0, 0, 0, 0, 0},
                {1, 1, 2, 1, 1},
                {2, 2, 4, 2, 2}
        };

        int[][] laplacianKernel = {
                {0, 1, 0},
                {1, -4, 1},
                {0, 1, 0}
        };

        int[][] embossKernel = {
                {-2, -1, 0},
                {-1, 1, 1},
                {0, 1, 2}
        };

        // Aplicamos cada filtro y guardamos la imagen resultante
        PGMImage blurredImage = ImageFilter.applyFilter(originalImage, blurKernel);
        blurredImage.write(ruta + "imagetest_blur.pgm");
        System.out.println("Imagen con filtro de suavizado guardada como 'C:/Users/living/Downloads/imagenes/imagetest_blur.pgm'.");

        PGMImage sobelHorizontalImage = ImageFilter.applyFilter(originalImage, sobelHorizontalKernel);
        sobelHorizontalImage.write(ruta + "imagetest_sobel_horizontal.pgm");
        System.out.println("Imagen con filtro Sobel horizontal guardada como 'C:/Users/living/Downloads/imagenes/imagetest_sobel_horizontal.pgm'.");

        PGMImage sobelVerticalImage = ImageFilter.applyFilter(originalImage, sobelVerticalKernel);
        sobelVerticalImage.write(ruta + "imagetest_sobel_vertical.pgm");
        System.out.println("Imagen con filtro Sobel vertical guardada como 'C:/Users/living/Downloads/imagenes/imagetest_sobel_vertical.pgm'.");

        PGMImage prewittHorizontalImage = ImageFilter.applyFilter(originalImage, prewittHorizontalKernel);
        prewittHorizontalImage.write(ruta + "imagetest_prewitt_horizontal.pgm");
        System.out.println("Imagen con filtro Prewitt horizontal guardada como 'C:/Users/living/Downloads/imagenes/imagetest_prewitt_horizontal.pgm'.");

        PGMImage prewittVerticalImage = ImageFilter.applyFilter(originalImage, prewittVerticalKernel);
        prewittVerticalImage.write(ruta + "imagetest_prewitt_vertical.pgm");
        System.out.println("Imagen con filtro Prewitt vertical guardada como 'C:/Users/living/Downloads/imagenes/imagetest_prewitt_vertical.pgm'.");

        PGMImage laplacianImage = ImageFilter.applyFilter(originalImage, laplacianKernel);
        laplacianImage.write(ruta + "imagetest_laplacian.pgm");
        System.out.println("Imagen con filtro Laplaciano guardada como 'C:/Users/living/Downloads/imagenes/imagetest_laplacian.pgm'.");

        PGMImage embossImage = ImageFilter.applyFilter(originalImage, embossKernel);
        embossImage.write(ruta + "imagetest_emboss.pgm");
        System.out.println("Imagen con filtro de repujado guardada como 'C:/Users/living/Downloads/imagenes/imagetest_emboss.pgm'.");
    }
}