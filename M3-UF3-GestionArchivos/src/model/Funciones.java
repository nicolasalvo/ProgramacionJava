package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Funciones {

    static Scanner lector = new Scanner(System.in);

    public static void main(String[] args) {
        lector.useDelimiter("\n");

    }

    public static void createFolder(String fileName) {
        String path = System.getProperty("user.dir"); /** Para obtener el directorio del trabajo actual **/
        String separador = File.separator; 
        String rutaCarpeta = path + separador + fileName;
        File carpeta = new File(rutaCarpeta);
        if (!carpeta.exists()) {
            carpeta.mkdir(); /** El mkdir hace que se cree, y en el caso que la carpeta no exista se crea **/
        }
    }

    public static void createFile(String path, String fileName, String content) {

        File archivo = new File(path + File.separator + fileName); 


        try (FileWriter fw = new FileWriter(archivo)) {
            fw.write(content);
            System.out.println("Archivo creado y contenido escrito correctamente.");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage()); /** Tratamos el error con el catch por si entra la excepcion de IOException **/
        }
    }

    public static String[] showListFiles(String path) {
        File carpeta = new File(path);
        return carpeta.list(); /** Con el .list te devuelve un array de String con los nombres de los archivos y directorios que hay dentro de la carpeta representada por el objeto file  **/
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
            System.out.println("Error al leer el archivo: " + e.getMessage()); /** Tratamos la excepcion y enseño un mensaje por pantalla con el error **/
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
            return true;
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage()); /** Tratamos la excepcion y enseño un mensaje por pantalla con el error **/
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
            System.out.println("Error: " + e.getMessage()); /** Tratamos la excepcion y enseño un mensaje por pantalla con el error **/
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
                    String[] words = line.trim().split("\\s+"); /** el .trim es para eliminar los espacios en blanco, el .split divide la cadena line en un array de subcadenas**/
                    count += words.length;
                }
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage()); /** Tratamos la excepcion y enseño un mensaje por pantalla con el error **/
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
        
    }
}
