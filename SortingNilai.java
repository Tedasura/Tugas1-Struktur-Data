public class SortingNilai {
    static class Mahasiswa {
    String nama;
    String nim;
    int nilai;

    Mahasiswa(String nama, String nim, int nilai) {
        this.nama = nama;
        this.nim = nim;
        this.nilai = nilai;
    }
}



    // Bubble Sort
    static void bubbleSort(Mahasiswa[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            System.out.println("Iterasi ke-" + (i+1));
            for (int j = 0; j < data.length - i - 1; j++) {
                if (data[j].nilai < data[j + 1].nilai) {
                    Mahasiswa temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
            printData(data);
        }
    }

    // Insertion Sort
    static void insertionSort(Mahasiswa[] data) {
        for (int i = 1; i < data.length; i++) {
            Mahasiswa key = data[i];
            int j = i - 1;

            while (j >= 0 && data[j].nilai < key.nilai) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = key;

            System.out.println("Iterasi ke-" + i);
            printData(data);

        }
    }

    // Selection Sort
    static void selectionSort(Mahasiswa[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            int maxIndex = i;

            for (int j = i + 1; j < data.length; j++) {
                if (data[j].nilai > data[maxIndex].nilai) {
                    maxIndex = j;
                }
            }

            Mahasiswa temp = data[i];
            data[i] = data[maxIndex];
            data[maxIndex] = temp;

            System.out.println("Iterasi ke-" + i);
            printData(data);
            
        }
    }

    // Print Data
    static void printData(Mahasiswa[] data) {
        for (Mahasiswa m : data) {
            System.out.println(m.nama + " | " + m.nim + " | " + m.nilai);
        }
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {

        Mahasiswa[] data = {
            new Mahasiswa("Maya Sari", "2201013256", 85),
            new Mahasiswa("Sinta Dewi Lestari", "2201012567", 92),
            new Mahasiswa("Rizky Aditya", "2201013812", 78),
            new Mahasiswa("Rina Ayu Putri", "2201012910", 88),
            new Mahasiswa("Andi Pratama", "2201012345", 65),
            new Mahasiswa("Nadia Safira", "2201013690", 95),
            new Mahasiswa("Budi Santoso", "2201012789", 72),
            new Mahasiswa("Putri Nirmala", "2201014035", 81),
            new Mahasiswa("Dimas Prakoso", "2201013478", 90),
            new Mahasiswa("Eko Wijaya", "2201013034", 76)
        };

       // Bubble Sort
Mahasiswa[] bubbleData = new Mahasiswa[data.length];
for (int i = 0; i < data.length; i++) {
    bubbleData[i] = new Mahasiswa(data[i].nama, data[i].nim, data[i].nilai);
}

// Insertion Sort
Mahasiswa[] insertionData = new Mahasiswa[data.length];
for (int i = 0; i < data.length; i++) {
    insertionData[i] = new Mahasiswa(data[i].nama, data[i].nim, data[i].nilai);
}

// Selection Sort
Mahasiswa[] selectionData = new Mahasiswa[data.length];
for (int i = 0; i < data.length; i++) {
    selectionData[i] = new Mahasiswa(data[i].nama, data[i].nim, data[i].nilai);

    }

        bubbleSort(bubbleData);
        System.out.println("=== Bubble Sort ===");
        printData(bubbleData);

        insertionSort(insertionData);
        System.out.println("=== Insertion Sort ===");
        printData(insertionData);

        selectionSort(selectionData);
        System.out.println("=== Selection Sort ===");
        printData(selectionData);

        
    }
}

