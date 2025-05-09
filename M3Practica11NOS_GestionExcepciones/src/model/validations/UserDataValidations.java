package model.validations;

import exceptions.InvalidDniException;
import exceptions.InvalidPostalCodeException;

public class UserDataValidations {

    /**
     * Debe valida si el documento indentificativo recibido es correcto o no
     *
     * @param typeDoc indica el tipo de documento identificativo (NIF - 1,...)
     * @param id contiene el documento identificativo a validar
     * @return devuelve true si el formato del documento identificativo si es
     * correcto. Si es false en el caso contrario
     */

    public static void checkId(int typeDoc, String id) {
        if (id == null || id.length() != 9) {
            throw new InvalidDniException("El NIF debe tener exactamente 9 caracteres.");
        }

        for (int i = 0; i < 8; i++) {
            if (!Character.isDigit(id.charAt(i))) {
                throw new InvalidDniException("Los primeros 8 caracteres del NIF deben ser dígitos.");
            }
        }

        char lastChar = id.charAt(8);
        if (!Character.isLetter(lastChar)) {
            throw new InvalidDniException("El último carácter del NIF debe ser una letra.");
        }

        int dniNumber = Integer.parseInt(id.substring(0, 8));
        char calculatedLetter = calculateDNILetter(dniNumber);
        if (Character.toUpperCase(lastChar) != calculatedLetter) {
            throw new InvalidDniException("La letra del NIF no es válida.");
        }
    }


    private static char calculateDNILetter(int dniNumber) {
        char[] letters = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        return letters[dniNumber % 23];
    }


    public static boolean checkFormatDate(String date) {
        if (date == null) {
            return false;
        }
        String[] fragmentos = date.split("/");
        if (fragmentos.length != 3) {
            return false;
        }
        for (String fragmento : fragmentos) {
            if (!isNumeric(fragmento)) {
                return false;
            }
        }
        return true;

    }

    public static int calculateAge(String birthDate) {
        String[] fragmentos = birthDate.split("/");
        int dia = Integer.parseInt(fragmentos[0]);
        int mes = Integer.parseInt(fragmentos[1]);
        int año = Integer.parseInt(fragmentos[2]);

        java.util.Calendar ahora = java.util.Calendar.getInstance();
        int añoActual = ahora.get(java.util.Calendar.YEAR);
        int mesActual = ahora.get(java.util.Calendar.MONTH) + 1; 
        int diaActual = ahora.get(java.util.Calendar.DAY_OF_MONTH);

        int edad = añoActual - año;

        if (mes > mesActual || (mes == mesActual && dia > diaActual)) {
            edad--;
        }
        return edad;
    }

    public static void checkPostalCode(String zip) {
        if (zip == null || zip.length() != 5) {
            throw new InvalidPostalCodeException("El código postal debe tener exactamente 5 dígitos.");
        }
        for (int i = 0; i < 5; i++) {
            if (!Character.isDigit(zip.charAt(i))) {
                throw new InvalidPostalCodeException("El código postal solo puede contener dígitos.");
            }
        }
    }
    public static boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }


    public static boolean isAlphabetic(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }

    public static boolean checkEmail(String email) {
        if (email.length() > 5
                && (email.contains("@hotmail") || email.contains("@gmail") || email.contains("@yahoo"))
                && (email.contains(".com") || email.contains(".es"))) {
            return true;
        }
        return false;
    }


    public static boolean checkName(String name) {
        if (name.length() <= 20 && name.length() > 3) {
            for (int i = 0; i < name.length(); i++) {
                if (!Character.isDigit(name.charAt(i))) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

}
