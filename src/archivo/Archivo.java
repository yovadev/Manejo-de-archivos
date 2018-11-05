package archivo;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Archivo {


    public static void main(String[] args) {
        File archivo = new File("C://prueba//archivo.txt");
        final Formatter nuevoarchivo;
        if (archivo.exists()) {
            if (archivo.canWrite()) {
                 System.out.println("archivo existe y se puede escribir");
            } else {
                 System.out.println("archivo existe y no se puede escribir");
            }
        }else{
            try {
                nuevoarchivo = new Formatter("C://prueba//archivo.txt");
                System.out.println("El archivo a sido creado con exito");
                nuevoarchivo.format("%s%s%s","yova ","macua ","25");
                nuevoarchivo.close();
            } catch (FileNotFoundException e) {
                System.out.println("El archivo no existe, Error " + e);
            }
        }
        
        
    }

}
