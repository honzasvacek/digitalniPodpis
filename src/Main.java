import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        byte[] vstup = new byte[10];
        byte[] arr = new byte[10];
        for (int i = 0; i < vstup.length; i++) {
            vstup[i] = (byte) (i*2);
        }

        for (int i = 0; i < vstup.length; i++) {
            System.out.print(vstup[i] + " ");
        }

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < vstup.length; i++) {
            arr[i] = sc.nextByte();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        Files.write(Paths.get("vstup.data"), vstup);
    }
}