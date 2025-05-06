
package view.console;
import model.Funciones;
import java.util.Scanner;

public class Main {
    static Scanner lector = new Scanner(System.in);
    public static void main(String[] args) {
        int miEleccion;
        lector.useDelimiter("\n");
        do {
            System.out.println("MENU");
            System.out.println("------");
            System.out.println("1.- Crear carpeta");
            System.out.println("2.- Crear archivo");
            System.out.println("3.- Listado de archivos");
            System.out.println("4.- Contenido del archivo seleccionado");
            System.out.println("5.- Modificar un archivo");
            System.out.println("6.- Borrar un archivo");
            System.out.println("7.- Número de caracteres de un archivo");
            System.out.println("8.- Número de palabras de un archivo");
            System.out.println("9.- Intercambio de palabras");
            System.out.println("10.- Crear un PDF");
            System.out.println("11.- Salir");
            String choice = lector.next();
            miEleccion = Integer.parseInt(choice);
            switch (miEleccion) {
                case 1:
                    System.out.println("Nombre de la carpeta que quieres crear? ");
                    String carpeta = lector.next();
                    Funciones.createFolder(carpeta);
                    break;
                case 2:
                    System.out.println("Nombre de la ruta: ");
                    String ruta = lector.next();
                    System.out.println("Nombre del archivo: ");
                    String archivo = lector.next();
                    System.out.println("Que te gustaria escribir en el archivo " + archivo + " ?");
                    String contenido = lector.next();
                    Funciones.createFile(ruta, archivo, contenido);
                    break;
                case 3:
                    System.out.println("Ruta del directorio que quieres listar: ");
                    String dirPath = lector.next();
                    String[] archivos = Funciones.showListFiles(dirPath);

                    if (archivos != null && archivos.length > 0) {
                        System.out.println("Archivos encontrados:");
                        for (String nombre : archivos) {
                            System.out.println("- " + nombre);
                        }
                    } else {
                        System.out.println("No se encontraron archivos o la ruta no es válida.");
                    }
                    break;
                case 4:
                    System.out.println("Escriba la ruta del archivo que quiere ver: ");
                    lector.nextLine();
                    String rutaLeer = lector.nextLine();
                    System.out.println("Escriba el nombre del archivo: ");
                    String archivoNombre = lector.nextLine();
                    String contenidoArchivo = Funciones.showFile(rutaLeer, archivoNombre);
                    if (contenidoArchivo != null) {
                        System.out.println("Contenido del archivo:");
                        System.out.println(contenidoArchivo);
                    } else {
                        System.out.println("No se pudo leer el archivo (verifique que exista y la ruta sea correcta).");
                    }
                    break;
                case 5:
                    System.out.println("Escriba la ruta del archivo que quiere modificar: ");
                    String directorio = lector.next();
                    System.out.println("Escriba el nombre del archivo: ");
                    String archivoModificar = lector.next();
                    System.out.println("Que te gustaria escribir en ese archivo? ");
                    String contenidoModificado = lector.next();
                    Funciones.overWriteFile(directorio,archivoModificar, contenidoModificado);
                    break;
                case 6:
                    System.out.println("Ruta del directorio en el que esta el archivo que quieres eliminar: ");
                    String rutaArchivo = lector.next();
                    System.out.println("Nombre del archivo que quieres eliminar: ");
                    String nombreArchivo = lector.next();
                    Funciones.deleteFile(rutaArchivo, nombreArchivo);
                    break;
                case 7:
                    System.out.print("Ingresa la ruta del archivo: ");
                    String rutaChars = lector.next();
                    System.out.print("Ingresa el nombre del archivo: ");
                    String fileNameChars = lector.next();
                    int total = Funciones.countChars(rutaChars, fileNameChars);
                    System.out.println("El archivo tiene " + total + " caracteres.");
                    break;
                case 8:
                    System.out.print("Ingresa la ruta del archivo: ");
                    String path2 = lector.next();
                    System.out.print("Ingresa el nombre del archivo: ");
                    String fileName2 = lector.next();
                    int totalWords = Funciones.countWords(path2, fileName2);
                    System.out.println("El archivo tiene " + totalWords + " palabras.");
                    break;
                case 9:
                    System.out.print("Ruta del archivo: ");
                    String ruta9 = lector.next();
                    System.out.print("Nombre del archivo: ");
                    String archivo9 = lector.next();
                    System.out.print("Palabra a reemplazar: ");
                    String vieja = lector.next();
                    System.out.print("Nueva palabra: ");
                    String nueva = lector.next();

                    String resultado = Funciones.swapWords(ruta9, archivo9, vieja, nueva);
                    System.out.println("Contenido modificado:\n");
                    System.out.println(resultado);
                    break;
//                case 10:
//                    
//                    break;
                case 11:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Eleccion incorrecta.");
            }
        } while (miEleccion != 11);
    }
    
}
