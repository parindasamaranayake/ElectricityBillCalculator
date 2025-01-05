import java.util.InputMismatchException;
import java.util.Scanner;

public class ElectricityBillCalculator {

    public static void main (String[] args) {

        int u;
        // u = number of input units
        double a, b, c, d, e, f, g, ec, sscl, total;
        //ec = Energy Charge
        //sscl = Social Security Contribution Levy
        //total = total amount

        Scanner unit = new Scanner(System.in);
        System.out.println(); //line break
        System.out.println("           *** Electicity Bill Calculator ***" + "\n             (For domestic consumers only)"); //caption
        System.out.println("Kindly consider electricity bill is generated for 30 days. \n");

        try{
            System.out.print("Enter units   = "); //get input
            u = unit.nextInt();
            System.out.println();

            if (u >= 0 ) {

                //units less than or equal to 30
                if (u <= 30) {
                    a = u * 8;
                    sscl = (a + 150) * 2.5/100; //calculate sscl
                    total = a + 150 + sscl; //calculate total amount
                    System.out.println("Your total Energy Charge for respective unit charge = Rs." + a); //print energy charge
                    System.out.println("Fixed Charge  = Rs." + 150.00); //print fixed charge
                    System.out.println("SSCL          = Rs." + sscl); //print sscl
                    System.out.println("Total amount  = Rs." + total); //print total amount
                }

                //units less than or equal to 60
                else if (u <= 60) {
                    a = 30 * 8;
                    b = (u - 30) * 20;
                    ec = a + b; //calculate energy charge
                    sscl = (ec + 300) * 2.5/100;
                    total = ec + 300 + sscl;
                    System.out.println("Your total Energy Charge for respective unit charge = Rs." + ec);
                    System.out.println("Fixed Charge  = Rs." + 300.00);
                    System.out.println("SSCL          = Rs." + sscl);
                    System.out.println("Total amount  = Rs." + total);
                }

                //units greater than to 60
                //units less than or equal to 90
                else if (u <= 90) {
                    c = 60 * 25;
                    d = (u - 60) * 30;
                    ec = c + d;
                    sscl = (ec + 400) * 2.5/100;
                    total = ec + 400 + sscl;
                    System.out.println("Your total Energy Charge for respective unit charge = Rs." + ec);
                    System.out.println("Fixed Charge  = Rs." + 400.00);
                    System.out.println("SSCL          = Rs." + sscl);
                    System.out.println("Total amount  = Rs." + total);
                }

                //units less than or equal to 120
                else if (u <= 120) {
                    c = 60 * 25;
                    d = 30 * 30;
                    e = (u - 90) * 50;
                    ec = c + d + e;
                    sscl = (ec + 1000) * 2.5/100;
                    total = ec + 1000 + sscl;
                    System.out.println("Your total Energy Charge for respective unit charge = Rs." + ec);
                    System.out.println("Fixed Charge  = Rs." + 1000.00);
                    System.out.println("SSCL          = Rs." + sscl);
                    System.out.println("Total amount  = Rs." + total);
                }

                //units less than or equal to 180
                else if (u <= 180) {
                    c = 60 * 25;
                    d = 30 * 30;
                    e = 30 * 50;
                    f = (u - 120) * 50;
                    ec = c + d + e + f;
                    sscl = (ec + 1500) * 2.5/100;
                    total = ec + 1500 + sscl;
                    System.out.println("Your total Energy Charge for respective unit charge = Rs." + ec);
                    System.out.println("Fixed Charge  = Rs." + 1500.00);
                    System.out.println("SSCL          = Rs." + sscl);
                    System.out.println("Total amount  = Rs." + total);
                }

                //units greater than to 180
                else {
                    c = 60 * 25;
                    d = 30 * 30;
                    e = 30 * 50;
                    f = 60 * 50;
                    g = (u - 180) * 75;
                    ec = c + d + e + f + g;
                    sscl = (ec + 2000) * 2.5/100;
                    total = ec + 2000 + sscl;
                    System.out.println("Your total Energy Charge for respective unit charge = Rs." + ec);
                    System.out.println("Fixed Charge  = Rs." + 2000.00);
                    System.out.println("SSCL          = Rs." + sscl);
                    System.out.println("Total amount  = Rs." + total);
                }
            }
            //negative values
            else {
                System.out.println("Sorry, you have entered an invaild value. Please enter the correct number of units.");
            }
        }
        //decimals, letters, symbols
        catch(InputMismatchException h){
            System.out.println("Sorry,you have entered an invaild value. Please enter the correct number of units.");
        }

       unit.close ();
    }
}
