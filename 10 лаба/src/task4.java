import java.io.*;
import java.util.*;

public class task4 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String line;
        ArrayList<Object> list = new ArrayList<>();
        File file1= new File("C:\\Users\\Hacker\\Desktop\\1 курс\\Информатика\\10 лаба\\t4_1.txt");
        File file2= new File("C:\\Users\\Hacker\\Desktop\\1 курс\\Информатика\\10 лаба\\t4_2.txt");
        FileInputStream file1_In_Str  = new FileInputStream(file1);
        InputStreamReader fRe=new InputStreamReader(file1_In_Str);
        FileWriter fWr=new FileWriter(file2);
        BufferedWriter file2_BW=new BufferedWriter(fWr);
        BufferedReader file_BR = new BufferedReader(fRe);
        while((line = file_BR.readLine()) != null) {
            String[] str=line.split(" ");
            Collections.addAll(list, str);
        }
        String[] array = list.toArray(new String[list.size()]);
        for (int i=0;i<array.length-1;i++){
            for (int j=array[i].length()-1;j>0;j--){
                if (array[i].charAt(j)==',' || array[i].charAt(j)=='_'|| array[i].charAt(j)=='.'|| array[i].charAt(j)==';'|| array[i].charAt(j)==':' || array[i].charAt(j)=='!' || array[i].charAt(j)=='?' || array[i].charAt(j)=='\\'){
                    file2_BW.write(array[i]);
                    file2_BW.newLine();
                    file2_BW.write(array[i+1]);
                    file2_BW.newLine();
                    i++;
                    break;
                }
                else if (((array[i].charAt(j)>='а' && array[i].charAt(j)<='я') && (array[i].charAt(j-1)>='a' && array[i].charAt(j-1)<='z')) || ((array[i].charAt(j)>='a' && array[i].charAt(j)<='z') && (array[i].charAt(j-1)>='а' && array[i].charAt(j-1)<='я')) || ((array[i].charAt(j)>='А' && array[i].charAt(j)<='Я') && (array[i].charAt(j-1)>='A' && array[i].charAt(j-1)<='Z')) || ((array[i].charAt(j)>='A' && array[i].charAt(j)<='Z') && (array[i].charAt(j-1)>='А' && array[i].charAt(j-1)<='Я')) || ((array[i].charAt(j)>='а' && array[i].charAt(j)<='я') && (array[i].charAt(j-1)>='A' && array[i].charAt(j-1)<='Z')) || ((array[i].charAt(j)>='A' && array[i].charAt(j)<='Z') && (array[i].charAt(j-1)>='а' && array[i].charAt(j-1)<='я')) || ((array[i].charAt(j)>='А' && array[i].charAt(j)<='Я') && (array[i].charAt(j-1)>='a' && array[i].charAt(j-1)<='z')) || ((array[i].charAt(j)>='a' && array[i].charAt(j)<='z') && (array[i].charAt(j-1)>='А' && array[i].charAt(j-1)<='Я'))){
                    file2_BW.write(array[i]);
                    file2_BW.newLine();
                    break;
               }
            }
        }
        file2_BW.close();
    }
}
