public class LinearEquation
{
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public LinearEquation(int x1, int y1, int x2, int y2) {



    }

    public double distance()
    {
        return Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
    }

    public double yIntercept()
    {
        return (double) ;
    }

    public double slope()
    {
        return (double) (y2 - y1)/(x2- x1);
    }

    public String equation()
    {
        int i = y2 - y1;
        int O = x2 - x1;
        double P = yIntercept();
        return "y = " + i + "/" + O + " + " +   ;
    }

}
