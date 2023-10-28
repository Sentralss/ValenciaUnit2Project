public class LinearEquation {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        // Checks if the x values are equal if they arent it prints out what line they lie on and ends the program
        if (x1 == x2) {

            System.out.println("These points are on a vertical line: x = " + x1);
            System.exit(x1);
        }
    }

    public double distance() {
        double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return roundedToHundredth(distance);
    }

    public double yIntercept() {
        double slope = slope();
        double m = slope * x1;
        double y = y1;
        double ans = y - m;
        return roundedToHundredth(ans);
    }


    public double slope() {
        double slope = (double) (y2 - y1) / (x2 - x1);
        return roundedToHundredth(slope);
    }

    public String equation() {
        int i = y2 - y1;
        int O = x2 - x1;
        double y = yIntercept();
        String equation = "";
        if (O < 0 || i < 0) {
            equation = "y = -" + Math.abs(i) + "/" + Math.abs(O) + "x" + " + " + Math.abs(y);
            if (y < 0.0) {
                equation = "y = -" + Math.abs(i) + "/" + Math.abs(O) + "x" + " - " + Math.abs(y);
                if (i % O == 0) {
                    equation = "y = -" + Math.abs(i)/ Math.abs(O) + "x" + " - " + Math.abs(y);
                    if(Math.abs(i) / Math.abs(O) == 1){
                        equation = "y = -" + "x" + " - " + Math.abs(y);
                    }
                }
                if (O == 1 || O == -1) {
                    equation = "y = " + "x" + " - " + Math.abs(y);
                    if (i == -1 || i == 1) {
                        equation = "y = " + "x" + " - " + Math.abs(y);

                    }
                }
                if (O == i) {
                    equation = "y = -x" + " - " + Math.abs(y);
                }

            }
            if (i % O == 0) {
                equation = "y = -" + Math.abs(i)/ Math.abs(O) +  "x" + " - " + Math.abs(y);
                if (y == 0.0) {
                    equation = "y = -" + Math.abs(i) + "/" + Math.abs(O) + "x";
                    if(Math.abs(i) / Math.abs(O) == 1) {
                        equation = "y = " + "-x" + " + " + Math.abs(y);
                    }
                }
                if(Math.abs(i) / Math.abs(O) == 1) {
                    equation = "y = " + "-x" + " + " + Math.abs(y);
                }

            }
            if (O == 1 || O == -1) {
                equation = "y = -" + "x" + " + " + Math.abs(y);
                if (i == -1 || i == 1) {
                    equation = "y = -" + "x" + " + " + Math.abs(y);

                }
            }
            if (O == i) {
                equation = "y = -x" + " + " + Math.abs(y);
            }
            if (x1 == y1 && x2 == y2){
                equation = "y = x";
            }
        }
        if (O < 0 && i < 0 || O > 0 && i > 0) {
            equation = "y = " + Math.abs(i) + "/" + Math.abs(O) + "x" + " + " + y;
            if (y < 0.0) {
                equation = "y = " + Math.abs(i) + "/" + Math.abs(O) + "x" + " - " + Math.abs(y);
                if (i % O == 0) {
                    equation = "y = " + Math.abs(i)/Math.abs(O) + "x" + " - " + Math.abs(y);
                    if(Math.abs(i) / Math.abs(O) == 1){
                        equation = "y = " + "x" + " - " + Math.abs(y);
                    }
                }
                if (O == 1 || O == -1) {
                    equation = "y = " + "x" + " - " + Math.abs(y);
                    if (i == -1 || i == 1) {
                        equation = "y = " + "x" + " - " + Math.abs(y);

                    }
                }
                if (O == i) {
                    equation = "y = x" + " - " + Math.abs(y);
                }

            }

            if (i % O == 0) {
                equation = "y = " + Math.abs(i)/Math.abs(O) + "x" + " + " + Math.abs(y);
                if (y == 0.0) {
                    equation = "y = " + Math.abs(i) + "/" + Math.abs(O) + "x";
                    if(Math.abs(i) / Math.abs(O) == 1) {
                        equation = "y = " + "x" + " + " + Math.abs(y);
                    }
                }

            }
            if (O == 1 || O == -1) {
                equation = "y = " + "x" + " + " + Math.abs(y);
                if (i == -1 || i == 1) {
                    equation = "y = " + "x" + " + " + Math.abs(y);

                }
            }
            if (O == i) {
                equation = "y = x" + " + " + Math.abs(y);
            }
            if (y1 == y2) {
                equation = "y = " + Math.round(y);
            }
            if (x1 == y1 && x2 == y2){
                equation = "y = x";
            }
        }

        return equation;

    }

    public String coordinateForX(double xValue) {
        double ycord = roundedToHundredth(((slope() * xValue) + yIntercept()));
        return "\nThe point on the line is (" + xValue + ", " + ycord + ")";
    }

    public double roundedToHundredth(double toRound) {
        return Math.round(toRound * 100.0) / 100.0;
    }


    public String lineInfo() {
        return "The two points are: (" + x1 +", " + y1 + ") and (" + x1 +", " + y1 +")\nTHe equation of the line between these points is: " + equation() +"\nThe slope of this line is: " + slope() + "\nThe y-intercept of the line is: " + yIntercept() + "\nThe distance between the two points is: " + distance();
    }
}
