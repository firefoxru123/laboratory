import static java.lang.Math.*;

class first {
    public static void main(String args[]){
    double c = 1, t = 9, L;
    
    L = pow(cos(c), 2)+((3*(t*t)+4)/sqrt(c+t));
    System.out.println(L);
  }
}
class second {
    public static void main(String args[]){
    double c = 6, U, y=8, b=14, a=12, x=6;
    U = (pow(tan(y), 3)+ pow(sin(x), 5)*(sqrt(b-c)))/(sqrt(a-b+c)+pow(x, y-x));
    System.out.println(U);
  }
}
