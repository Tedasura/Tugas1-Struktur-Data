public class Array {
    public static void main(String[] args) {
        int[] x = {20, 15, 90, 13, 26};
        for (int j = 0; j < x.length - 1; j++) {
            int min =999999;
            int index =j;
             
            //Loop cari nilai terkecil
            for (int i = j; i < x.length; i++) {
                if (x [i] < min) {
                    min = x[i];
                    index = i;
                }
            }
            
            //Proses swap
            if(x[j] > x[index]) {
                int temp = 0;
                temp = x[j];
                x[j] = x[index];
                x[index]= temp;
            }
            
            //Cetak per iterasi
            System.out.print("Iterasi " + (j+1) + " : ");
            for (int i=0; i < x.length; i++) {
                System.out.print(x [i] + " ");
            }
            System.out.println();
        }
    }
}