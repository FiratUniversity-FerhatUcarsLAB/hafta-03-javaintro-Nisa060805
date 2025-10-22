public class DonusumTablosu {
    public static void main(String[] args) {
        double milToKm = 1.609;
        int[] mil = {1,5,10,20,50};

        System.out.println("Mil\tKilometre");
        for(int m : mil){
            System.out.println(m + "\t" + (m * milToKm));
        }
    }
}
