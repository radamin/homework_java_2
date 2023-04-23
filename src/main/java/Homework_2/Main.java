package Homework_2;

import java.io.File;

public class Main {

    private static void getAllFiles(String path) {
        File[] allFiles = new File(path).listFiles();
        if (allFiles != null) {
            for (File file : allFiles) {
                String fileName = file.toString();
                int index = fileName.lastIndexOf('.');
                if (index > 0) {
                    String extension = fileName.substring(index + 1);
                    System.out.println("Расширение файла:" + extension);
                }
            }
        }
    }

    public static void main(String[] args) {
        String path = "C:\\Users\\rvdam\\Documents\\GeekBrainse\\Introduction to programming\\Java_GeekBrains\\HW_2";
        getAllFiles(path);


    }
}