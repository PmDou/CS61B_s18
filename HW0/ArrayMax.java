public class ArrayMax {
    /** Returns the maximum value from m. while循环*/
    /** public static int max(int[] m) {
        int i = 0;
        int max = 0;
        while (i < m.length) {
            if (m[i] > max) {
                max = m[i];
            }
            i = i + 1;
        }
        return max;
    }
    */
    /** Returns the maximum value from m. for循环*/
    public static int max(int[] m) {
        int max = 0;
        for(int j = 0; j < m.length; j++){
            if(m[j] > max){
                max = m[j];
            }
        }
        return max;
    }

    public static void main(String[] args) {
       int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
       System.out.println(max(numbers));
    }
}