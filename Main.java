
import java.util.*;
public class Main {

    public static void main(String[] args) {
	Scanner Sc = new Scanner(System.in);
    String name;
    System.out.println("Enter your full name");
    name = Sc.nextLine();
    Map<String,Integer> map = new HashMap<>();
    map.put("O",10);
    map.put("A+",9);
    map.put("A",8);
    map.put("B+",7);
    map.put("B",6);
    map.put("C+",5);
    map.put("C",4);
    map.put("F",0);
    map.put("Q",0);
    System.out.println("Enter number of Subjects");
    double tc=0;
    double z =0;
    String C;
    int c = 0;
    int n = Sc.nextInt();
    for(int i=1;i<=n;i++)
    {
       System.out.println("Enter credit of"+" "+i+" "+"Subject");
       c = Sc.nextInt();
       System.out.println("Enter grade of"+" "+i+" "+"Subject");
       C= Sc.next();
       C = C.toUpperCase();
       z = z +( c * map.get(C) );
       tc = tc +c;
    }
    double result = z/tc;
    System.out.println();
System.out.println("Here is your Sgpa"+" "+name+"\n"+result+"\n"+"Best wishes for your future");
    }
}
