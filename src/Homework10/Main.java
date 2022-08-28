package Homework10;

public class Main {
    public static void main(String[] args) {
        String number = "1234-abc-5678-abc-1a2b";
        System.out.println(number.substring(0, 4) + number.substring(9, 13));
        System.out.println(number.replace("a", "*"));
        String number2 = number.toUpperCase();
        System.out.println("Letters: " + number2.substring(5, 8) + number2.substring(15, 17) + number2.charAt(19) + number2.charAt(21));
        if (number.contains("abcd") || number2.contains("ABCD")) {
            System.out.println("Soderzhit abcd");
        } else
            System.out.println("Ne soderzhit abcd");
        System.out.println("Nachinaetsya s 5555? " + number.startsWith("5555"));
        System.out.println("Zacanchivaetsya na 1a2b? " + number.endsWith("1a2b"));

        StringBuilder sb = new StringBuilder("1234-abc-5678-abc-1a2b");
        System.out.println("Zadom napered cherez StringBuilder: " + sb.reverse());

        char[] array = number.toCharArray();
        String result = "";
        for (int i = array.length - 1; i >= 0; i--) {
            result = result + array[i];
        }
        System.out.println("Zadom napered cherez massiv: " + result);
    }
}
