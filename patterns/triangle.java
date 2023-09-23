public class triangle {
    static void printPartten(int n,int k)

        { 
        
            if (n < 0) // Base condition 
                return; 
          
            // Recursive call 
            printPartten(n - 1, k + 1); 
          
            int i; 
            for (i = 0; i < k; i++) // it makes spaces 
                System.out.printf(" "); 
            for (i = 0; i < n; i++) // for print * 
                System.out.printf("* "); 
            System.out.printf("\n"); // for next line 
        } 
          
        public static void main(String[]args) 
        { 
            int n = 7; 
          
            // Call to printPartten function 
            printPartten(n, 0); 
        } 
        } 
 
