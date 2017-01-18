package logger;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Veneziano Giuseppe
 */
public class Logger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s;
        FileWriter out;

        Scanner lettore = new Scanner(System.in);
        System.out.println("Inserisci la frase");
        s = lettore.nextLine();

        try {
            out = new FileWriter("data/log.txt");
            out.write(s);
            out.close();
        } catch (IOException ex) {
            System.out.println("Errore:  " + ex.getMessage());
        }

    }

}
