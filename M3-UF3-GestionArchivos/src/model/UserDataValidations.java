package model;

import exceptions.InvalidPathException;
import exceptions.InvalidFileNameException;

public class UserDataValidations {

    public static void validatePath(String path) throws InvalidPathException {
        if (path == null || path.trim().isEmpty() || !path.matches("[a-zA-Z0-9_/\\\\.:-]+")) {
            throw new InvalidPathException("La ruta especificada no es válida.");
        }
    }

    public static void validateFileName(String name) throws InvalidFileNameException {
        if (name == null || name.trim().isEmpty() || !name.matches("[\\w,\\s-]+\\.[A-Za-z]")) {
            throw new InvalidFileNameException("El nombre del archivo no es válido.");
        }
    }
}
