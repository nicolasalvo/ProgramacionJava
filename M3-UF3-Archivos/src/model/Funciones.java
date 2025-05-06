package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import java.io.FileOutputStream;
import javax.swing.text.Document;

public class Funciones {

    static Scanner lector = new Scanner(System.in);

    public static void main(String[] args) {
        lector.useDelimiter("\n");

    }

    public static void createFolder(String fileName) {
        String path = System.getProperty("user.dir");
        String separador = File.separator;
        String rutaCarpeta = path + separador + fileName;
        File carpeta = new File(rutaCarpeta);
        if (!carpeta.exists()) {
            carpeta.mkdir();
        }
    }

    public static void createFile(String path, String fileName, String content) {

        File archivo = new File(path + File.separator + fileName);


        try (FileWriter fw = new FileWriter(archivo)) {
            fw.write(content);
            System.out.println("Archivo creado y contenido escrito correctamente.");
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }

    public static String[] showListFiles(String path) {
        File carpeta = new File(path);
        return carpeta.list(); 
    }

    public static String showFile(String path, String fileName) {
        File archivo = new File(path + File.separator + fileName);

        if (!archivo.exists()) {
            System.out.println("El archivo no existe.");
            return null;
        }

        StringBuilder contenido = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                contenido.append(linea).append(System.lineSeparator());
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
            return null;
        }

        return contenido.toString();
    }
    
    public static boolean overWriteFile(String path, String fileName, String newContent) {
        File archivo = new File(path + File.separator + fileName);
        
        if (!archivo.exists()) {
            return false;
        }

        try (FileWriter fw = new FileWriter(archivo)) {
            fw.write(newContent);
            System.out.println("Contenido sobrescrito correctamente.");
            return true;
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
            return false;
        }
    }

    public static void deleteFile(String path, String fileName) {
        File fichero = new File(path + File.separator + fileName);

        if (fichero.exists()) {
            if (fichero.delete()) {
                System.out.println("Archivo eliminado correctamente.");
            } else {
                System.out.println("No se pudo eliminar el archivo.");
            }
        } else {
            System.out.println("El archivo no existe.");
        }
    }

    public static int countChars(String path, String fileName) {
        int count = 0;
        File archivoChar = new File(path + File.separator + fileName); 

        try (BufferedReader reader = new BufferedReader(new FileReader(archivoChar))) {
            int c;
            while ((c = reader.read()) != -1) {
                count++;
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        return count;
    }

    public static int countWords(String path, String fileName) {
        int count = 0;
        File archivo = new File(path + File.separator + fileName);

        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.isBlank()) {
                    String[] words = line.trim().split("\\s+");
                    count += words.length;
                }
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        return count;
    }

    public static String swapWords(String path, String fileName, String oldWord, String newWord) {
        StringBuilder nuevoContenido = new StringBuilder();
        File archivo = new File(path + File.separator + fileName);

        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                linea = linea.replace(oldWord, newWord);
                nuevoContenido.append(linea).append(System.lineSeparator());
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        return nuevoContenido.toString();
    }
    
    public static void printPDF(String path, String fileName) {
    File inputFile = new File(path + File.separator + fileName);
    File outputFile = new File(path + File.separator + "output.pdf");

    try (
        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        FileOutputStream fos = new FileOutputStream(outputFile)
    ) {
        Document document = new Document();
        PdfWriter.getInstance(document, fos);
        document.open();

        String line;
        while ((line = reader.readLine()) != null) {
            document.add(new Paragraph(line));
        }

        document.close();
        System.out.println("PDF creado correctamente en: " + outputFile.getAbsolutePath());
    } catch (Exception e) {
        System.out.println("Error al crear el PDF: " + e.getMessage());
    }
    }
}
