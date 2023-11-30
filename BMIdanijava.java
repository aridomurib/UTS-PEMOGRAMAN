/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class BMIdanijava {
   public static void main(String[] arga) {
       int beratbadan = 42;
       float tinggibadan =1.70f;
       float bmi = (beratbadan/(tinggibadan*tinggibadan));
        
        System.out.println("BMI SAYA ADALAH\t:"+bmi);
        
        if (bmi<18.5){
           System.out.println("BERAT BADAN SAYA KURANG");
        }
        else if (bmi<24.9){
            System.out.println("BERAT BADAN SAYA NORMAL/IDEAL");
        }
        else if (bmi<29.9){
            System.out.println("BERAT BADAN SAYA LEBIH");
        }
        else {
            System.out.println("OBESITAS");
        }
    }
}
