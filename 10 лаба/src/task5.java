import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class task5 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String line;
        boolean cyril=false,latin=false;
        ArrayList<Object> list = new ArrayList<>();
        File file1= new File("C:\\Users\\Hacker\\Desktop\\1 курс\\Информатика\\10 лаба\\t5_1.txt");
        File file2= new File("C:\\Users\\Hacker\\Desktop\\1 курс\\Информатика\\10 лаба\\t5_2.txt");
        FileInputStream file1_In_Str  = new FileInputStream(file1);
        InputStreamReader fRe=new InputStreamReader(file1_In_Str);
        BufferedReader file_BR = new BufferedReader(fRe);
        FileOutputStream file2_Out_Str  = new FileOutputStream(file2,true);
        OutputStreamWriter fWr=new OutputStreamWriter(file2_Out_Str);
        BufferedWriter file2_BW=new BufferedWriter(fWr);
        while((line = file_BR.readLine()) != null) {
            String[] str=line.split("\\.");
            Collections.addAll(list, str);
        }

        file2_BW.newLine();
        String[] array = list.toArray(new String[list.size()]);
        for (int i=0;i<array.length;i++){

            cyril=false; latin=false;
            String [] subArray = array[i].split(" ");
            for (int j=0;j<subArray.length;j++){
                if (Pattern.matches(".*\\p{IsLatin}.*", subArray[j])){
                    latin=true;
                }
                if (Pattern.matches(".*\\p{InCyrillic}.*", subArray[j])){
                    cyril=true;
                }
                if (latin && cyril){
                    file2_BW.write(array[i]);
                    file2_BW.write('.');
                    file2_BW.newLine();
                    break;
                }
            }
        }
        file2_BW.close();
    }
}
