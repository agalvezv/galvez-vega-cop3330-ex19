package challenge19;

import java.util.Scanner;

class BMI{
    double w,h;
    double bmiCheck;
    String wS,hS;
    String response;
    String bmiS;

    public BMI(){

    }
}

public class Challenge19 {
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);

        BMI aCheck = new BMI();
        aCheck.response = "What is your weight? (In pounds!)";
        Output(aCheck.response);
        aCheck.wS = inputs.nextLine();
        aCheck.w = numberCheck(aCheck.w, aCheck.wS);

        aCheck.response = "What is your height? (In inches!)";
        Output(aCheck.response);
        aCheck.hS = inputs.nextLine();
        aCheck.h = numberCheck(aCheck.h, aCheck.hS);

        Calculations(aCheck);

    }
    public static void Output(String proxy)
    {

        System.out.println(proxy);
    }

    public static void Calculations(BMI bCheck)
    {
        bCheck.bmiCheck = (bCheck.w / (bCheck.h * bCheck.h)) * 703;
        bCheck.bmiCheck = Math.round(bCheck.bmiCheck*100);
        bCheck.bmiCheck = bCheck.bmiCheck/100;
        bCheck.bmiS = bCheck.bmiS.valueOf(bCheck.bmiCheck);

        //String outcome = ((bCheck.bmiCheck >= 18.5)&&(bCheck.bmiCheck <= 18.5)) ? responseTwo : responseOne : response4;
        if(bCheck.bmiCheck>25)
        {
            bCheck.response = "Your BMI is " + bCheck.bmiS +"\nYou are overweight. You should see your doctor.";
            Output(bCheck.response);
        }
        else if((bCheck.bmiCheck >= 18.5)&&(bCheck.bmiCheck <= 25))
        {
            bCheck.response = "Your BMI is " + bCheck.bmiS +"\nYou are within the ideal weight range.";
            Output(bCheck.response);
        }
        else if((bCheck.bmiCheck < 18.5))
        {
            bCheck.response = "Your BMI is " + bCheck.bmiS +"\nYou are underweight. You should see your doctor.";
            Output(bCheck.response);
        }


    }

    public static double numberCheck(Double p, String pS) {
        boolean numBool;
        Scanner inputs2 = new Scanner(System.in);
        try {
            p = Double.parseDouble(pS);
            //aCheck.w=numberCheck(aCheck.w);
            //System.out.println(aCheck.w);
        } catch (NumberFormatException rec) {
            numBool = false;
            System.out.println("Input unacceptable. Please enter a numerical value.");
            if(numBool==false)
            {
                while (numBool==false) {
                    pS = inputs2.nextLine();
                    try {
                        p = Double.parseDouble(pS);
                        numBool=true;
                        //aCheck.w=numberCheck(aCheck.w);
                        //System.out.println(aCheck.w);
                    } catch (NumberFormatException rec2) {
                        System.out.println("Input unacceptable. Please enter a numerical value.");

                    }


                }

            }



        }
        return p;
    }
}