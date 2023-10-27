/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */

package pwo;
import java.io.FileWriter;
import java.io.IOException;
public class LucasGenerator {

    public static long[] generateLucasSequence(int n) {
        long[] lucas = new long[n];
        lucas[0] = 2;
        lucas[1] = 1;
        for (int i = 2; i < n; i++) {
            lucas[i] = lucas[i - 1] + lucas[i - 2];
        }
        
        return lucas;
    }

    public static void main(String[] args) {
        int n = 100;
        long[] lucasNumbers = generateLucasSequence(n);
        try (FileWriter writer = new FileWriter("ciag_lucasa.txt")) {
            for (int i = 0; i < n; i++) {
                writer.write(String.valueOf(lucasNumbers[i]) + "\n");
            }

            System.out.println("Pierwsze " + n + " wyrazów ciągu Lucasa zostały zapisane do pliku 'ciag_lucasa.txt'.");
        } catch (IOException e) {

            System.err.println("Błąd podczas zapisywania do pliku: " + e.getMessage());
        }
    }
}
