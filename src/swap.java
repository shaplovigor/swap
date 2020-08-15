public class swap {
    public static void main(String[] args) {
        int[] ExampleArray={3, 9, 11, 15};
        swap(ExampleArray, 2, 3);
        for (int value : ExampleArray) {
            System.out.println(value);
        }
    }

    public static void swap(int[] Array, int i1, int i2) {
        boolean checkZeroIdx = i1 >= 0 && i2 >= 0;
        boolean checkLastIdx = i1 < Array.length && i2 < Array.length;

        if (checkZeroIdx && checkLastIdx) {
            int temp = Array[i1];
            Array[i1]=Array[i2];
            Array[i2]=temp;
        } else {
            System.out.println("BadIdx!");
        }
    }
}
