import java.util.Scanner;

import static deshifrator.Encryption.deEncrypt;
import static deshifrator.Encryption.encrypt;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Шифрователь текса.");
        System.out.print("Введите текст: ");
        String andrew = scanner.nextLine();
        System.out.print("Введите ключ: ");
        String key = scanner.nextLine();
        System.out.println(encrypt(andrew, key));
        andrew = encrypt(andrew, key);
        System.out.println(deEncrypt(andrew, key));


    }
}