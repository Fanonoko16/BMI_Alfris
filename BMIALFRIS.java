package bmialfris;

public class BMIALFRIS {
    public static void main(String[] args) {
        float tinggiBadan = 1.7f;
        float beratBadan = 60;
        float bmi = beratBadan / (tinggiBadan * tinggiBadan);

        System.out.println("BMI SAYA ADALAH\t:" + bmi);

        if (bmi < 18.5) {
            System.out.println("BERAT BADAN SAYA KURANG");
        } else if (bmi < 24.9) {
            System.out.println("BERAT BADAN SAYA NORMAL/IDEAL");
        } else if (bmi < 29.9) {
            System.out.println("BERAT BADAN SAYA LEBIH");
        } else {
            System.out.println("OBESITAS");
        }
    }
}