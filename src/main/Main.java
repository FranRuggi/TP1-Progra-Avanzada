
package main;
import java.io.IOException;

import Filtros.FiltroKernel;
import imageFilter.ImageFilter;
import pgmImage.PGMImage;

public class Main {

    public static void main(String[] args) throws IOException {
    	String ruta = new String("C:/Users/Francisco/Mi unidad/Programación Avanzada/TP1-Progra-Avanzada/TP1-Progra-Avanzada/imagenes/");
    	
        PGMImage originalImage360 = new PGMImage(ruta + "Darth_Vader_360x360.pgm");
        PGMImage originalImage720 = new PGMImage(ruta + "Darth_Vader_1280x720.pgm");
        PGMImage originalImage1080 = new PGMImage(ruta + "Darth_Vader_1980x1080.pgm");

        //Para tomar tiempos
        
        double inicio;
        double fin;
        double duracion;
        
        // Aplicamos cada filtro y guardamos la imagen resultante
        
        //SOBEL
        
        inicio = System.nanoTime();
        PGMImage sobelHorizontalImage = ImageFilter.applyFilter(originalImage360, FiltroKernel.getSobelHorizontalKernel3x3());
        sobelHorizontalImage.write(ruta + "Z_imagen360_sobel_horizontal3x3.pgm");
        fin = System.nanoTime();
        duracion = (fin - inicio)/1000000000;
        System.out.println("Imagen con filtro Sobel horizontal guardada como 'Z_imagen360_sobel_horizontal3x3.pgm'. Tiempo: " + duracion + "s");

        inicio = System.nanoTime();
        PGMImage sobelVerticalImage = ImageFilter.applyFilter(originalImage360, FiltroKernel.getSobelVerticalKernel3x3());
        sobelVerticalImage.write(ruta + "Z_imagen360_sobel_vertical3x3.pgm");
        fin = System.nanoTime();
        duracion = (fin - inicio)/1000000000;
        System.out.println("Imagen con filtro Sobel vertical guardada como 'Z_imagen360_sobel_vertical3x3.pgm'. Tiempo: " + duracion + "s");

        //PREWITT
        
        inicio = System.nanoTime();
        PGMImage prewittHorizontalImage = ImageFilter.applyFilter(originalImage360, FiltroKernel.getPrewittHorizontalKernel3x3());
        prewittHorizontalImage.write(ruta + "Z_imagen360_prewitt_horizontal3x3.pgm");
        fin = System.nanoTime();
        duracion = (fin - inicio)/1000000000;
        System.out.println("Imagen con filtro Prewitt horizontal guardada como 'Z_imagen360_prewitt_horizontal3x3.pgm'. Tiempo: " + duracion + "s");

        inicio = System.nanoTime();
        PGMImage prewittVerticalImage = ImageFilter.applyFilter(originalImage360, FiltroKernel.getPrewittVerticalKernel5x5());
        prewittVerticalImage.write(ruta + "Z_imagen360_prewitt_vertical5x5.pgm");
        fin = System.nanoTime();
        duracion = (fin - inicio)/1000000000;
        System.out.println("Imagen con filtro Prewitt vertical guardada como 'Z_imagen360_prewitt_vertical5x5.pgm'. Tiempo: " + duracion + "s");

        //LAPLACIAN
        
        inicio = System.nanoTime();
        PGMImage laplacianImage = ImageFilter.applyFilter(originalImage360, FiltroKernel.getLaplacianKernel3x3());
        laplacianImage.write(ruta + "Z_imagen360_laplacian3x3.pgm");
        fin = System.nanoTime();
        duracion = (fin - inicio)/1000000000;
        System.out.println("Imagen con filtro Laplaciano guardada como 'Z_imagen360_laplacian3x3.pgm'. Tiempo: " + duracion + "s");        
        
        //BLUR 360x360
        
        inicio = System.nanoTime();
        PGMImage blurredImage = ImageFilter.applyFilter(originalImage360, FiltroKernel.getBlurKernel3x3());
        blurredImage.write(ruta + "Z_imagen360_blur3x3.pgm");
        fin = System.nanoTime();
        duracion = (fin - inicio)/1000000000;
        System.out.println("Imagen con filtro de suavizado guardada como 'Z_imagen360_blur3x3.pgm'. Tiempo: " + duracion + "s");

        inicio = System.nanoTime();
        blurredImage = ImageFilter.applyFilter(originalImage360, FiltroKernel.getBlurKernel5x5());
        blurredImage.write(ruta + "Z_imagen360_blur5x5.pgm");
        fin = System.nanoTime();
        duracion = (fin - inicio)/1000000000;
        System.out.println("Imagen con filtro de suavizado guardada como 'Z_imagen360_blur5x5.pgm'. Tiempo: " + duracion + "s");
                
        inicio = System.nanoTime();
        blurredImage = ImageFilter.applyFilter(originalImage360, FiltroKernel.getBlurKernel9x9());
        blurredImage.write(ruta + "Z_imagen360_blur9x9.pgm");
        fin = System.nanoTime();
        duracion = (fin - inicio)/1000000000;
        System.out.println("Imagen con filtro de suavizado guardada como 'Z_imagen360_blur9x9.pgm'. Tiempo: " + duracion + "s");

        //BLURR 1280x720 9x9
        
        inicio = System.nanoTime();
        blurredImage = ImageFilter.applyFilter(originalImage720, FiltroKernel.getBlurKernel9x9());
        blurredImage.write(ruta + "Z_imagen720_blur9x9.pgm");
        fin = System.nanoTime();
        duracion = (fin - inicio)/1000000000;
        System.out.println("Imagen con filtro de suavizado guardada como 'Z_imagen720_blur9x9.pgm'. Tiempo: " + duracion + "s");
        
        //BLURR 1920x1080 9x9
        
        inicio = System.nanoTime();
        blurredImage = ImageFilter.applyFilter(originalImage1080, FiltroKernel.getBlurKernel9x9());
        blurredImage.write(ruta + "Z_imagen1080_blur9x9.pgm");
        fin = System.nanoTime();
        duracion = (fin - inicio)/1000000000;
        System.out.println("Imagen con filtro de suavizado guardada como 'Z_imagen1080_blur9x9.pgm'. Tiempo: " + duracion + "s");
        
        //EMBOSS 360x360
        
        inicio = System.nanoTime();
        PGMImage embossImage = ImageFilter.applyFilter(originalImage360, FiltroKernel.getEmbossKernel3x3());
        embossImage.write(ruta + "Z_imagen360_emboss3x3.pgm");
        fin = System.nanoTime();
        duracion = (fin - inicio)/1000000000;
        System.out.println("Imagen con filtro de repujado guardada como 'Z_imagen360_emboss3x3.pgm'. Tiempo: " + duracion + "s");
        
        inicio = System.nanoTime();
        embossImage = ImageFilter.applyFilter(originalImage360, FiltroKernel.getEmbossKernel5x5());
        embossImage.write(ruta + "Z_imagen360_emboss5x5.pgm");
        fin = System.nanoTime();
        duracion = (fin - inicio)/1000000000;
        System.out.println("Imagen con filtro de repujado guardada como 'Z_imagen360_emboss5x5.pgm'. Tiempo: " + duracion + "s");
        
        inicio = System.nanoTime();
        embossImage = ImageFilter.applyFilter(originalImage360, FiltroKernel.getEmbossKernel9x9());
        embossImage.write(ruta + "Z_imagen360_emboss9x9.pgm");
        fin = System.nanoTime();
        duracion = (fin - inicio)/1000000000;
        System.out.println("Imagen con filtro de repujado guardada como 'Z_imagen360_emboss9x9.pgm'. Tiempo: " + duracion + "s");

    }
}