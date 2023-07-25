import java.util.Scanner;

class Sample{
public static void main(String args[]) {
    int x,y,z;
    System.out.println("Enter Value for x , y and z::");    
    Scanner sc=new Scanner(System.in);
    x=sc.nextInt();
    y=sc.nextInt();
    z=sc.nextInt();
    System.out.println("Maximum of "+x+","+y+" and "+z+" ::"+((x>y && x>z)?x:((y>z)?y:z)));
    System.out.println("Sum of x+y+z:"+(x+y+z));
}
}
