import java.util.Scanner;
public class LinearEquationRunner
{
    public static void main(String[] args)
    {
       Scanner scan = new Scanner(System.in);

       System.out.println("Welcome!");
       System.out.print("Enter coordinate 1: ");
       String xycord1 = scan.nextLine();
       String x1 = xycord1.substring(1,xycord1.indexOf(","));
       String y1 = xycord1.substring(xycord1.indexOf(",") + 2, xycord1.length() - 1);
       System.out.print("Enter coordinate 2: ");
       String xycord2 = scan.nextLine();
       String x2 = xycord2.substring(1,xycord2.indexOf(","));
       String y2 = xycord2.substring(xycord2.indexOf(",") + 2, xycord2.length() - 1);
       System.out.println();

       int xcords1 = Integer.parseInt(x1);
       int ycords1 = Integer.parseInt(y1);
       int xcords2 = Integer.parseInt(x2);
       int ycords2 = Integer.parseInt(y2);

       LinearEquation equa = new LinearEquation(xcords1, ycords1, xcords2, ycords2);
       System.out.println(equa.distance());
       System.out.println(equa.slope());
       System.out.println(equa.yIntercept());
       System.out.println(equa.equation());

    }
}
