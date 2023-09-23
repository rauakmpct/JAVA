public class RAHULKUSHWAHA {
    public static void main(String[] args) {
        int n = 8;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j < (n - 1) / 2 || j == 0 || i + j == (n - 1) / 2 || i - j == (n - 1) / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }

            int a = 9;
            for (int j = 0; j < a; j++) {
                if (i == 0 && j > 0 && j < (n - 1) / 2 || j == 0 && i > 0 || i == (n - 1) / 2 && j <= (n - 1) / 2
                        || j == (n - 1) / 2 && i > 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            int c = 8;
            for (int j = 0; j < c; j++) {
                if (j == 0 || j == c - 1 || i == (c - 1) / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("    ");
            int e = 8;
            for (int j = 0; j < e; j++) {
                if (j == 0 || j == e - 1 || i == e - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("    ");
            int f = 8;
            for (int j = 0; j < f; j++) {
                if (j == 0 || i == f - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println("    ");

        int g = 9;
        for (int i = 0; i < g; i++) {
            for (int j = 0; j < g; j++) {
                if (j == 0 || i + j == (g - 1) / 2 || i - j == (g - 1) / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            int h = 9;
            for (int j = 0; j < h; j++) {
                if (j == 0 || j == h - 1 || i == h - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("    ");
            int k = 9;
            for (int j = 0; j < k; j++) {
                if (i == 0 || i == j || i == k - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("    ");
            int l = 8;
            for (int j = 0; j < l; j++) {
                if (j == 0 || j == l - 1 || i == (l - 1) / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("    ");
            int m = 9;
            for (int j = 0; j < m; j++) {
                if (i == 0 && j > 0 && j < (m - 1) / 2 || j == 0 && i > 0 || i == (m - 1) / 2 && j <= (m - 1) / 2 ||
                        j == (m - 1) / 2 && i > 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            int o = 8;
            {
                for (int j = 0; j < o; j++) {
                    if (j == 0 || j == o - 1 || i == (o - 1) / 2) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }

            System.out.print("    ");
            int p = 9;
            for (int j = 0; j < p; j++) {
                if (i == 0 && j > 0 && j < (p - 1) / 2 || j == 0 && i > 0 || i == (p - 1) / 2 && j <= (p - 1) / 2 ||
                        j == (p - 1) / 2 && i > 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }


    }
}
