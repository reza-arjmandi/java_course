import java.io.*;
import java.util.*;
import java.security.MessageDigest;
import java.nio.charset.Charset;
import java.util.Scanner;

public class JavaSHA_256 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String message = in.nextLine();
        in.close();

        try {
            MessageDigest messageDigest 
                = MessageDigest.getInstance("SHA-256");
            messageDigest.update(message.getBytes());
            byte[] hash = messageDigest.digest();

            for (byte b : hash) {
                System.out.printf("%02x", b);
            }
        } catch (Exception e) {}
    }
}