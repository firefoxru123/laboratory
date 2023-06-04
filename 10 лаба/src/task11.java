import static java.lang.Math.*;
import java.io.*;

public class task11 {
    public static void main(String[] args) throws IOException {
        double num=0;
        double[] arrayX=new double[31];
        double[] arrayY=new double[41];
        double[][] matrixZ=new double[31][41];
        File file= new File("C:\\Users\\Hacker\\Desktop\\1 курс\\Информатика\\10 лаба\\11t.txt");
        FileOutputStream file_Out_Str = new FileOutputStream(file,true);
        OutputStreamWriter fWr = new OutputStreamWriter(file_Out_Str);
        BufferedWriter file_BW = new BufferedWriter(fWr);
        file_BW.newLine();
        file_BW.write("\nМассив координат по х:");
        file_BW.newLine();
        for (int i=0;i<=arrayX.length-1;i++){
            arrayX[i]=Math.round(num*10.0)/10.0;
            file_BW.write(arrayX[i]+", ");
            num+=0.1;
        }
        num=0;
        file_BW.newLine();
        file_BW.write("\nМассив координат по y:");
        file_BW.newLine();
        for (int i=0;i<=arrayY.length-1;i++){
            arrayY[i]=Math.round(num*10.0)/10.0;
            file_BW.write(arrayY[i]+", ");
            num+=0.1;
        }
        file_BW.write("\nМатрица значений поверхности:");
        file_BW.newLine();
        for (int i=0;i<matrixZ.length;i++){
            for (int j=0;j<matrixZ[i].length;j++){
                matrixZ[i][j]=pow(arrayY[j],2)*sin(arrayX[i])+pow(arrayX[i],2)*sin(arrayY[j]);
                file_BW.write(matrixZ[i][j]+", ");
            }
            file_BW.newLine();
        }
        file_BW.close();
    }
}
