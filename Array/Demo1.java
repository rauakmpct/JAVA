
// public class Demo1 {
//     public static void main(String[] args) {
//         int i,j;
//         int nums [][] = {{3,9},{1,5},{8,4}};
        
//         for(i=0;i<=2;i++)
//         {
//             for(j=0;j<=1;j++)
//             {
//                 System.out.print(nums [i][j] +" ");
//             }
//             System.out.println();
//         }
//     }
    
// }




public class Demo1 {
    public static void main(String[] args) {
        int i,j;
        int nums [][] = {{3,9,5},{1,5,4,4},{8,4,7,8,9}};
        
        for(i=0;i<=2;i++)
        {
            for(j=0;j<nums[i].length;j++)
            {
                System.out.print(nums [i][j] +" ");
            }
            System.out.println();
        }
    }
    
}

