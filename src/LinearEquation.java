public class LinearEquation
{
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double distance()
    {
        return Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
    }

    public double yIntercept()
    {
        double slope = slope();
        double m = slope * x1;
        double y = y1;
        return y - m;
    }


    public double slope()
    {
        return (double)  (y2 - y1)/(x2- x1);
    }

    public String equation()
    {
        int i = y2 - y1;
        int O = x2 - x1;
        double y = yIntercept();
        String equation = "";
        if(O < 0)
        {
            O = Math.abs(O);
            i = i - i * 2;
            equation = "y = " + i + "/" + O + "x" + " + " + y;
        }
        return equation ;
    }



}
