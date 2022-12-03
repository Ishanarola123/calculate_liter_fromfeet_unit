import java.util.Scanner;

public class liter {
    float calculatecube(float l, float b, float h){
        float cube=l*b*h;
        float finalcube= (float) (0.3048*0.3048*0.3048*cube);
        System.out.println("here your m^3 is:" + finalcube);
        return finalcube;
    }

    void calculatelit(float cube){

        float lit=1000*cube;
        System.out.println("here your liter is:");
        System.out.println(lit);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the length in foot:");
        float l=sc.nextFloat();


        System.out.println("enter the width in foot:");
        float b=sc.nextFloat();

        System.out.println("enter the height in foot:");
        float h=sc.nextFloat();


        liter obj1=new liter();
        float c=obj1.calculatecube(l,b,h);

        obj1.calculatelit(c);







    }
}
