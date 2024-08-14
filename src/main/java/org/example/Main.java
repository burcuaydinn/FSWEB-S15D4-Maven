package org.example;


public class Main {
    public static boolean checkForPalindrome(String input) {
        // Verilen string'i temizle: Harf ve sayı dışındaki karakterleri filtrele, büyük/küçük harf duyarlılığını kaldır.
        StringBuilder filteredInput = new StringBuilder();
        String lowerCaseInput = input.toLowerCase();

        // Sadece harf ve rakamları ekleyelim
        for (char c : lowerCaseInput.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                filteredInput.append(c);
            }
        }

        // Tersini alıp kontrol et
        String filteredString = filteredInput.toString();
        String reversedString = filteredInput.reverse().toString();

        // Original string vs Reversed string comparison
        return filteredString.equals(reversedString);
    }


    public static String convertDecimalToBinary(int decimalNumber) {
        StringBuilder binary = new StringBuilder();

        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            binary.insert(0, remainder);
            decimalNumber /= 2;
        }

        return binary.length() > 0 ? binary.toString() : "0";
    }

    public static void main(String[] args) {
        // Test örnekleri
        System.out.println(checkForPalindrome("I did, did I?")); // true
        System.out.println(checkForPalindrome("Racecar"));       // true
        System.out.println(checkForPalindrome("hello"));         // false
        System.out.println(checkForPalindrome("Was it a car or a cat I saw ?")); // true
        System.out.println(convertDecimalToBinary(5));  // 101
        System.out.println(convertDecimalToBinary(6));  // 110
        System.out.println(convertDecimalToBinary(13)); // 1101
    }

}