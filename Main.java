import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("masuikkan panjang sisi segitiga");
        double sisi = input.nextDouble();
        double keliling = hitungKelilingSegitiga(sisi);
        double Luas = hitungLuasSegitiga(sisi);
         input.close();

        }
        public static double hitungKelilingSegitiga(double sisi){
        return 3 * sisi;
    }
    public static double hitungLuasSegitiga(double sisi){

        return (Math.sqrt(3)/14) * sisi * sisi;
        }
    }



