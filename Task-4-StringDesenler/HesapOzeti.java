public class HesapOzeti {
    public static void main(String[] args) {
        String[] urun = {"Elma", "Armut", "Sut"};
        int[] miktar = {3, 2, 1};
        double[] fiyat = {5.0, 7.0, 8.5};

        System.out.println("Urun\tMiktar\tFiyat");
        for(int i=0;i<urun.length;i++){
            System.out.println(urun[i] + "\t" + miktar[i] + "\t" + fiyat[i]);
        }
    }
}
