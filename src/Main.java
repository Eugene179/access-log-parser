import java.io.File;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        boolean kukuk =false;
        int count=0;
        do {
            count++;
            System.out.println("Введите путь к лог-файлу: ");
            String path = new Scanner(System.in).nextLine();
            File file = new File(path);
            boolean fileExists = file.exists();
            boolean isDirectory = file.isDirectory();
            if (!fileExists) System.out.println("Ошибка: файл не найден");
            if (isDirectory) System.out.println("Ошибка: Указан путь до папки");
            kukuk=fileExists&&!isDirectory;
        }  while (!kukuk);
        System.out.println("Путь указан верно! Файл с логами найден c "+count+" попытки");
    }
}