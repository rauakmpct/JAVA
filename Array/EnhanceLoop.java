
// public class EnhanceLoop {
//     public static void main(String[] args) {
//         int nums [] = {5,8,7,4,6,4,};
//         for(int n:nums)
//         {
//             System.out.print(n + " ");
//         }
//     }

// }

public class EnhanceLoop {
    public static void main(String[] args) {
        int nums[][] = { { 3, 9, 5 }, { 1, 5, 4, 4 }, { 8, 4, 7, 8, 9 } };
        for (int a[] : nums) {
            for (int b : a) {
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }

}
