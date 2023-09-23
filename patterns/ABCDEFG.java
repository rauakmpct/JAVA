public class ABCDEFG {
    public static void main(String args []) {
        {

            int height =5;
            int width =(2*height)-1;
        //     int n = width / 2, i, j;
        //     for (i = 0; i < height; i++) 
        //     {
        //         for (j = 0; j <= width; j++)
        //         {
        //             if (j == n || j == (width - n)
        //                 || (i == height / 2 && j > n
        //                     && j < (width - n)))
        //                 System.out.printf("*");
        //             else
        //                 System.out.printf(" ");
        //         }
        //         System.out.printf("\n");
        //         n--;
        //     }
        // }





        // {
        //     int i, j, half = (height / 2);
        //     for (i = 0; i < height; i++)
        //     {
        //         System.out.printf("*");
        //         for (j = 0; j < width; j++)
        //         {
        //             if ((i == 0 || i == height - 1 || i == half)
        //                 && j < (width - 2))
        //                 System.out.printf("*");
        //             else if (j == (width - 2)
        //                     && !(i == 0 || i == height - 1
        //                         || i == half))
        //                 System.out.printf("*");
        //             else
        //                 System.out.printf(" ");
        //         }
        //         System.out.printf("\n");
        //     }
        // }





        // {
        //     int i, j;
        //     for (i = 0; i < height; i++)
        //     {
        //         System.out.printf("*");
        //         for (j = 0; j < (height - 1); j++) 
        //         {
        //             if (i == 0 || i == height - 1)
        //                 System.out.printf("*");
        //             else
        //                 continue;
        //         }
        //         System.out.printf("\n");
        //     }
        // }



        // {
        //     int i, j;
        //     for (i = 0; i < height; i++) 
        //     {
        //         System.out.printf("*");
        //         for (j = 0; j < height; j++) 
        //         {
        //             if ((i == 0 || i == height - 1)
        //                 && j < height - 1)
        //                 System.out.printf("*");
        //             else if (j == height - 1 && i != 0
        //                     && i != height - 1)
        //                 System.out.printf("*");
        //             else
        //                 System.out.printf(" ");
        //         }
        //         System.out.printf("\n");
        //     }
        // }


        // {
        //     int i, j;
        //     for (i = 0; i < height; i++) 
        //     {
        //         System.out.printf("*");
        //         for (j = 0; j < height; j++) 
        //         {
        //             if ((i == 0 || i == height - 1)
        //                 || (i == height / 2
        //                     && j <= height / 2))
        //                 System.out.printf("*");
        //             else
        //                 continue;
        //         }
        //         System.out.printf("\n");
        //     }
        // }


        // {
        //     int i, j;
        //     for (i = 0; i < height; i++) 
        //     {
        //         System.out.printf("*");
        //         for (j = 0; j < height; j++)
        //         {
        //             if ((i == 0) || (i == height / 2
        //                         && j <= height / 2))
        //                 System.out.printf("*");
        //             else
        //                 continue;
        //         }
        //         System.out.printf("\n");
        //     }
        // }


        // {
        //     int i, j;
        //     width--;
        //     for (i = 0; i < height; i++) 
        //     {
        //         for (j = 0; j < width; j++)
        //         {
        //             if ((i == 0 || i == height - 1)
        //                 && (j == 0 || j == width - 1))
        //                 System.out.printf(" ");
        //             else if (j == 0)
        //                 System.out.printf("*");
        //             else if (i == 0 && j <= height)
        //                 System.out.printf("*");
        //             else if (i == height / 2
        //                     && j > height / 2)
        //                 System.out.printf("*");
        //             else if (i > height / 2
        //                     && j == width - 1)
        //                 System.out.printf("*");
        //             else if (i == height - 1
        //                     && j < width)
        //                 System.out.printf("*");
        //             else
        //                 System.out.printf(" ");
        //         }
        //         System.out.printf("\n");
        //     }
        // }


        {
            int i, j;
            for (i = 0; i < height; i++) 
            {
                System.out.printf("*");
                for (j = 0; j < height; j++)
                {
                    if ((j == height - 1)
                        || (i == height / 2))
                        System.out.printf("*");
                    else
                        System.out.printf(" ");
                }
                System.out.printf("\n");
            }
        }
    }

    }
    
}
