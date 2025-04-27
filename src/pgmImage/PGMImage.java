package pgmImage;
import java.io.*;
import java.util.*;

public class PGMImage {
    public int width;
    public int height;
    public int maxValue;
    public int[][] pixels;

    public PGMImage(String filename) throws IOException {
        read(filename);
    }

 // Constructor manual para crear una imagen nueva
    public PGMImage(int width, int height, int maxValue, int[][] pixels) {
        this.width = width;
        this.height = height;
        this.maxValue = maxValue;
        this.pixels = pixels;
    }

	private void read(String filename) throws IOException {
        Scanner sc = new Scanner(new FileInputStream(filename));

        String format = sc.next();
        if (!format.equals("P2")) {
            sc.close();
            throw new IOException("Formato PGM no soportado: " + format);
        }

        while (sc.hasNext("#")) { // Saltear comentarios
            sc.nextLine();
        }
        //Traemos el ancho, alto y el maximo valor de caracter que tendra la imagen
        width = sc.nextInt();
        height = sc.nextInt();
        maxValue = sc.nextInt();
        //Luego cargamos cada uno de esos valores en una matriz bidimensional
        pixels = new int[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                pixels[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }

	//Escribimos la imagen teniendo en cuenta los parametros de las imagenes PGM P2
    public void write(String filename) throws IOException {
        PrintWriter pw = new PrintWriter(new FileOutputStream(filename));
        pw.println("P2");
        pw.println(width + " " + height);
        pw.println(maxValue);

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                pw.print(pixels[i][j] + " ");
            }
            pw.println();
        }
        pw.close();
    }
}
