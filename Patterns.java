import java.util.*;
class Pattern1 {
    void display() {
        for(int i=0;i<5;i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
class Pattern2{
    void display(){
        for(int i=5;i>0;i--){
            for(int j=i;j<6;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
class Pattern3{
    void display(){
        for(int i=5;i>0;i--){
            for(int j=i;j<6;j++){
                System.out.print(j-i+1);
            }
            System.out.println();
        }
    }
}
class Pattern4{
    void display(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
class Pattern5{
    void display(){
        for(int i=5;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
class Pattern6{
    void display(){
        for(int i=5;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
public class Patterns{
    public static void main(String[]args){
        Pattern1 p1=new Pattern1();
        p1.display();
        Pattern2 p2=new Pattern2();
        p2.display();
        Pattern3 p3=new Pattern3();
        p3.display();
        Pattern4 p4=new Pattern4();
        p4.display();
        Pattern5 p5=new Pattern5();
        p5.display();
        Pattern6 p6=new Pattern6();
        p6.display();
    }
}