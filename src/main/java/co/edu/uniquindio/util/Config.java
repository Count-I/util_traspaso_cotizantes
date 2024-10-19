package co.edu.uniquindio.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config {
    private static final Properties properties = new Properties();
    private static final String fileName = "app.properties";
    static {
        try (InputStream input = Config.class.getClassLoader().getResourceAsStream(fileName)) {
            if (input == null) {
                System.out.println("No se pudo encontrar el archivo " + fileName);
            } else {
                properties.load(input);
            }
        } catch (IOException ex) {
            throw new RuntimeException("Error al intentar leer el archivo de propiedades");
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}