package pkg1.pkg1d.aed;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Utils {

    public static void contarVocales() {

    }

    public static void contarPalabras() {

    }

    public static String leerContenidoArchivo(File archivo) throws falloFicheroException {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(archivo));
            StringBuilder contenido = new StringBuilder();
            String linea;
            while ((linea = reader.readLine()) != null) {
                contenido.append(linea).append("\n");
            }
            reader.close();
            return contenido.toString();
        } catch (IOException e) {
            e.printStackTrace();
            mostrarMensajeDeError("ERROR AL LEER EL FICHERO");
            return null;
        }
    }

    public static String openTextFile(File file) {
        try {
            StringBuilder content = new StringBuilder();
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                content.append(line).append("\n");
            }

            reader.close();
            return content.toString();
        } catch (IOException e) {

            return ""; // Retorna una cadena vacía en caso de error.
        }
    }

    public static void createTextFile(File file) {
        try {
            String contenido = openTextFile(file);
            FileWriter writer = new FileWriter(file);

            writer.write(contenido);
            writer.close();

            System.out.println("Archivo creado con éxito: " + file.getAbsolutePath());
        } catch (IOException e) {
            System.err.println("Error al crear el archivo: " + e.getMessage());
        }
    }

    public static int countWords(String text) {
        String[] words = text.split("\\s+");
        return words.length;
    }

    public static int[] countVowels(String text) {
        int[] vowelCounts = new int[5]; // [a, e, i, o, u]

        text = text.toLowerCase(); // Convertir el texto a minúsculas para que coincidan las vocales

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            switch (c) {
                case 'a':
                    vowelCounts[0]++;
                    break;
                case 'e':
                    vowelCounts[1]++;
                    break;
                case 'i':
                    vowelCounts[2]++;
                    break;
                case 'o':
                    vowelCounts[3]++;
                    break;
                case 'u':
                    vowelCounts[4]++;
                    break;
            }
        }

        return vowelCounts;
    }

    public static void createTextFile(File file, String contenido) {
        try {

            FileWriter writer = new FileWriter(file);

            writer.write(contenido);
            writer.close();

            mostrarMensajeDeInformacion("Achivo creado/abierto con exito");
        } catch (IOException e) {
            System.err.println("Error al crear el archivo: " + e.getMessage());
        }
    }

    public static void mostrarMensajeDeError(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }

    public static void mostrarMensajeDeInformacion(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Info", JOptionPane.INFORMATION_MESSAGE);
    }
}
