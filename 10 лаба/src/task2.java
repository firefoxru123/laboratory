import java.io.*;


public class task2 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        File file= new File("C:\\Users\\Hacker\\Desktop\\1 курс\\Информатика\\10 лаба\\t2.txt");
        FileReader fRe=new FileReader(file);
        FileWriter fWr=new FileWriter(file);
        BufferedReader file_BR=new BufferedReader(fRe);
        BufferedWriter file_BW=new BufferedWriter(fWr);
        for (int a=1; a<=9; a++){
            for (int i=1; i<=9; i++){
                if (i<9){
                    if(a*i<10){file_BW.write(a+" * "+i+" = "+a*i+"     ");}
                    if(a*i>=10){file_BW.write(a+" * "+i+" = "+a*i+"    ");}
                }
                if (i==9){
                    if (a*i<10){
                        file_BW.write(a+" * "+i+" = "+a*i+"      ");
                        file_BW.newLine();
                    }
                    if (a*i>=10){
                        file_BW.write(a+" * "+i+" = "+a*i+"      ");
                        file_BW.newLine();
                    }
                }
            }
        }
        file_BW.close();
        while (file_BR.ready()){
            System.out.println(file_BR.readLine());
        }
    }
}