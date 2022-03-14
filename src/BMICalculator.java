import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BMICalculator {
    public static void main(String[] args) throws IOException {

        float heightYohannes, weightYohannes, bmiYohannes;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("This program will calculate your BMI.");
        System.out.println("Enter your height in cm (and press Enter): ");
        heightYohannes = Float.parseFloat(br.readLine())/100;
        System.out.println("Enter your weight (and press Enter): ");
        weightYohannes = Float.parseFloat(br.readLine());

        bmiYohannes = (float) (weightYohannes / (Math.pow(heightYohannes, 2)));
        System.out.printf("Your BMI is: " + "%2.2f, \n", bmiYohannes);

        if(bmiYohannes<16){
            System.out.println("You are starving.");
        } else if ((bmiYohannes>=16) && (bmiYohannes<16.99)){
            System.out.println("You are emaciated.");
        } else if ((bmiYohannes>=17) && (bmiYohannes<18.49)){
            System.out.println("You are underweight.");
        } else if ((bmiYohannes>=18.50) && (bmiYohannes<22.99)){
            System.out.println("You are in the low range of the norm.");
        } else if ((bmiYohannes>=23) && (bmiYohannes<24.99)) {
            System.out.println("You are in the high range of the norm.");
        } else if ((bmiYohannes>=25) && (bmiYohannes<27.49)){
            System.out.println("You are overweight (low range).");
        } else if ((bmiYohannes>=27.50) && (bmiYohannes<29.99)) {
            System.out.println("You are overweight (high range).");
        } else if ((bmiYohannes>=30) && (bmiYohannes<34.9)) {
            System.out.println("You have 1st degree obesity.");
        } else if ((bmiYohannes>=35) && (bmiYohannes<39.9)) {
            System.out.println("You have 2nd degree obesity.");
        } else if (bmiYohannes>40) {
            System.out.println("You have 3rd degree obesity.");
        }
    }
}
