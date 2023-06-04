import java.io.*;
import java.util.*;

public class task3 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String line;
        ArrayList<Object> list = new ArrayList<>();
        File file= new File("C:\\Users\\Hacker\\Desktop\\1 курс\\Информатика\\10 лаба\\t3.txt");
        FileInputStream file_In_Str  = new FileInputStream(file);
        InputStreamReader fRe=new InputStreamReader(file_In_Str);
        BufferedReader file_BR = new BufferedReader(fRe);
        System.out.print("Массив символов: ");
        while((line = file_BR.readLine()) != null) {
            System.out.println(line);
            char[] chr=line.toCharArray();
            for (char c : chr) {
                list.add(c);
            }
        }
        String string=list.toString().replaceAll(",", "");
        char[] array = string.substring(1, string.length()-1).replaceAll(" ", "").toCharArray();
        System.out.print("Прописные латинские буквы: ");
        for (int i = 0; i < list.size()-1; i++) {
            if (array[i] >= 'A' && array[i] <= 'Z') System.out.print(array[i]);
        }
    }
}