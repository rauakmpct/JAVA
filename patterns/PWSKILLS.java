
public class PWSKILLS {
    public static void main(String[] args) {

        {
            int height = 7;
            int width = (2 * height) - 1;
            int i, j;
            for (i = 0; i < height; i++) {
                System.out.print("*");
                for (j = 0; j < height; j++) {
                    if ((i == 0 || i == height / 2)
                            && j < height - 1)
                        System.out.print("*");
                    else if (i < height / 2
                            && j == height - 1 && i != 0)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.print("\n");

            }

            {

                int counter = height / 2;
                System.out.println();
                for (i = 0; i < height; i++) {
                    System.out.print("*");
                    for (j = 0; j <= height; j++) {
                        if (j == height)
                            System.out.print("*");
                        else if ((i >= height / 2)
                                && (j == counter
                                        || j == height - counter - 1))
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                    if (i >= height / 2) {
                        counter++;
                    }
                    System.out.print("\n");
                }
            }

            {
                System.out.println();
                for (i = 0; i < height; i++) {
                    for (j = 0; j < height; j++) {
                        if ((i == 0 || i == height / 2
                                || i == height - 1))
                            System.out.printf("*");
                        else if (i < height / 2
                                && j == 0)
                            System.out.printf("*");
                        else if (i > height / 2
                                && j == height - 1)
                            System.out.printf("*");
                        else
                            System.out.printf(" ");
                    }
                    System.out.printf("\n");
                }
            }

            System.out.println();
            int n = 8;
            for (int a = 0; a < n; a++) {
                for (int b = 0; b < n; b++) {
                    if (b == 0 || a+b==(n-1)/2 || a-b==(n-1)/2 ) {
                        System.out.print("* ");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }


              System.out.println();
            for (int a = 0; a < n; a++) {
                for (int b = 0; b < n; b++) {
                    if (a==0 || b==(n-1)/2 || a==n-1 ) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }


                System.out.println();
            for (int a = 0; a < n; a++) {
                for (int b = 0; b < n; b++) {
                    if (b==0 || a==n-1 ) {
                        System.out.print("* ");
                    } else {
                        System.out.print("");
                    }
                }
                System.out.println();
            }


                System.out.println();
            for (int a = 0; a < n; a++) {
                for (int b = 0; b < n; b++) {
                    if (b==0 || a==n-1 ) {
                        System.out.print("* ");
                    } else {
                        System.out.print("");
                    }
                }
                System.out.println();
            }

             {
                System.out.println();
                for (i = 0; i < height; i++) {
                    for (j = 0; j < height; j++) {
                        if ((i == 0 || i == height / 2
                                || i == height - 1))
                            System.out.printf("*");
                        else if (i < height / 2
                                && j == 0)
                            System.out.printf("*");
                        else if (i > height / 2
                                && j == height - 1)
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
