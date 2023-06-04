import java.io.*;

public class task9{
    public static void main(String[] args) throws IOException {
        int count=0;
        boolean est=false;
        File file= new File("C:\\Users\\Hacker\\Desktop\\1 курс\\Информатика\\10 лаба\\9t.txt");
        FileInputStream file_In_Str  = new FileInputStream(file);
        InputStreamReader fRe=new InputStreamReader(file_In_Str);
        BufferedReader file_BR = new BufferedReader(fRe);
        StringBuffer sBuf = new StringBuffer(file_BR.readLine());
        FileOutputStream file_Out_Str = new FileOutputStream(file,true);
        OutputStreamWriter fWr = new OutputStreamWriter(file_Out_Str);
        BufferedWriter file_BW = new BufferedWriter(fWr);
        file_BW.newLine();
        for (int i=0;i<sBuf.length()-1;i++){
            if (((sBuf.charAt(i)=='О') && (sBuf.charAt(i+1)=='О') && (sBuf.charAt(i+2)=='О'))){
                count=i+3;
                while (sBuf.charAt(count)!='О') count++;
                if (((sBuf.charAt(count)=='О') && (sBuf.charAt(count+1)=='О') && (sBuf.charAt(count+2)=='О')) ){
                    sBuf.delete(i,count+3);
                    est=true;
                }
            }
            else if (((sBuf.charAt(i)=='А') && (sBuf.charAt(i+1)=='А') && (sBuf.charAt(i+2)=='А'))){
                count=i+3;
                while (sBuf.charAt(count)!='А') count++;
                if (((sBuf.charAt(count)=='А') && (sBuf.charAt(count+1)=='А') && (sBuf.charAt(count+2)=='А')) ){
                    sBuf.delete(i,count+3);
                    est=true;
                }
            }
            else if (((sBuf.charAt(i)=='Б') && (sBuf.charAt(i+1)=='Б') && (sBuf.charAt(i+2)=='Б'))){
                count=i+3;
                while (sBuf.charAt(count)!='Б') count++;
                if (((sBuf.charAt(count)=='Б') && (sBuf.charAt(count+1)=='Б') && (sBuf.charAt(count+2)=='Б')) ){
                    sBuf.delete(i,count+3);
                    est=true;
                }
            }
        }
        if (!est) file_BW.write("\nКомментариев вида ААА...ААА, ООО...ООО, БББ...БББ в тексте нет");
        else {
            file_BW.write("\nСтрока после изменения: ");
            file_BW.write(String.valueOf(sBuf));
        }
        file_BW.close();
    }
}
