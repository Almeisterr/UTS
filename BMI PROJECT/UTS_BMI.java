import java.util.Scanner;
public class UTS_BMI {
    public static void main(String[] args) {
            try (Scanner input = new Scanner(System.in)) {
                int jenis_kelamin, hasil;
                float berat, tinggi, bmi, meter;
                double broca;

                //main menu
                System.out.println(" UTS Java Menghitung Berat Badan Ideal ");
                System.out.println("        Mochammad Aldi Priyanta");
                System.out.println("              22083000074");
                System.out.println("=======================================");
                System.out.println("Jenis Kelamin: ");
                System.out.println("1. Laki-Laki");
                System.out.println("2. Perempuan");
                System.out.println("=======================================");

                //logic
                System.out.println("Masukan Jenis Kelamin: ");
                jenis_kelamin = input.nextInt();
                System.out.println("Masukan Berat Badan: ");
                berat = input.nextFloat();
                System.out.println("Masukan Tinggi Badan: ");
                tinggi = input.nextFloat();
                meter = tinggi / 100;

                //rumus BMI=
                bmi = (berat/(meter * meter));

                //mencetak BMI
                System.out.println("BMI: "+ bmi +" ");

                if (bmi <18.5){
                    System.out.println("Berat Badan Anda Kurus");
                } else if (bmi <= 22.9){
                    System.out.println("Berat Badan Anda Normal");
                } else if (bmi < 24.9){
                    System.out.println("Berat Badan Anda Berlebihan");
                } else {
                    System.out.println("Berat Badan Anda Obesitas");
                }

                //Menghitung dengan rumus Broca
                switch (jenis_kelamin)
                {
                    case 1 : broca = ((tinggi-100)-(0.10 * (tinggi-100))); break;
                    case 2 : broca = ((tinggi-100)-(0.15 * (tinggi-100))); break;
                    default : broca = 0;
                }

                hasil = (int) broca;
                System.out.println("Berat Badan Anda Ideal Menurut Broca " + hasil + " Kg");
            } 

          
        }    
    }