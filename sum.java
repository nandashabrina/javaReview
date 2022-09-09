public class sum {
    public static void main(String[] args) {
        System.out.println("===PROGRAM MENGHITUNG JUMLAH ELEMEN===");
        int[] array = {2, 1, 4, 1, 7, 6, 2, 0, 6, 4};
        int sum = 0;
        for(int i=0 ; i<array.length ; i++){
            sum += array[i];
        }
        System.out.println("Total penjumlahan bilangan nim = " + sum);
    }
}
