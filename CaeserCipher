/**
 * CaesarCipher.java
 *
 * A simple implementation of the Caesar Cipher in Java.
 * Supports encryption, decryption, brute-force decryption,
 * and basic frequency analysis to guess the encryption key.
 *
 * This code is part of a personal Java learning repository.
 * It demonstrates string manipulation, character encoding,
 * and basic command-line interaction in Java.
 *
 * Author: Tanisha Fonseca
 * Created: 2nd september 2025
 */

import java.util.Scanner;
public class CaeserCipher {
public static String encrypt(String text, int shift) {
    StringBuilder result = new StringBuilder();

    for (char character : text.toCharArray()) {
        if (Character.isLetter(character)) {
            char base = Character.isLowerCase(character) ? 'a' : 'A';
            char shifted = (char) ((character - base + shift) % 26 + base);
            result.append(shifted);
        } else {
            result.append(character);
        }
    }

    return result.toString();
}

    // Decrypts the text by shifting letters backward
    public static String decrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();

        for (char character : text.toCharArray()) {
            if (Character.isLetter(character)) {
                char base = Character.isLowerCase(character) ? 'a' : 'A';
                char shifted = (char) ((character - base - shift + 26) % 26 + base);
                result.append(shifted);
            } else {
                result.append(character); // Leave non-letters unchanged
            }
        }

        return result.toString();
    }

    // Try all 26 possible shift values
    public static void bruteForceDecrypt(String text) {
        System.out.println("\nAttempting all possible decryptions (0–25):");
        for (int i = 0; i < 26; i++) {
            String attempt = decrypt(text, i);
            System.out.printf("Key %2d: %s%n", i, attempt);
        }
    }

    // Guess likely key using letter frequency (assumes 'E' is most common)
    public static int guessKey(String encrypted) {
        int[] freq = new int[26];

        for (char c : encrypted.toCharArray()) {
            if (Character.isLetter(c)) {
                c = Character.toUpperCase(c);
                freq[c - 'A']++;
            }
        }

        int maxIndex = 0;
        for (int i = 1; i < 26; i++) {
            if (freq[i] > freq[maxIndex]) {
                maxIndex = i;
            }
        }

        // Assume most frequent letter is actually 'E'
        int guessedKey = (maxIndex - ('E' - 'A') + 26) % 26;
        return guessedKey;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("\nEnter 'e' to encrypt, 'd' to decrypt, 'g' to guess key, or 'q' to quit: ");
            String mode = scanner.nextLine().trim().toLowerCase();

            if (mode.equals("e")) {
                System.out.print("Enter text to encrypt: ");
                String inputText = scanner.nextLine();

                System.out.print("Enter shift key (0-25): ");
                int shiftKey = Integer.parseInt(scanner.nextLine());

                String encrypted = encrypt(inputText, shiftKey);
                System.out.println("Encrypted text: " + encrypted);

            } else if (mode.equals("d")) {
                System.out.print("Enter text to decrypt: ");
                String encryptedText = scanner.nextLine();

                System.out.print("Enter shift key (0-25): ");
                int shiftKey = Integer.parseInt(scanner.nextLine());

                String decrypted = decrypt(encryptedText, shiftKey);
                System.out.println("Decrypted text: " + decrypted);

                bruteForceDecrypt(encryptedText);

            } else if (mode.equals("g")) {
                System.out.print("Enter encrypted text to guess key: ");
                String encryptedText = scanner.nextLine();

                int guessedKey = guessKey(encryptedText);
                String guessedDecryption = decrypt(encryptedText, guessedKey);

                System.out.println("Guessed key: " + guessedKey);
                System.out.println("Decrypted text (guessed): " + guessedDecryption);

            } else if (mode.equals("q")) {
                System.out.println("Exiting...");
                break;

            } else {
                System.out.println("Invalid option. Please enter 'e', 'd', 'g', or 'q'.");
            }
        }

        scanner.close();
    }
}
