// public class conditional {
//     public static void main (String[]args){
//         int age = 18;
//         if(age>=18)
//         {
//             System.out.println("Legal Adult");
//         }
//         else 
//         {
//             System.out.println("Illegal");
//         }
//     }

// }

// public class conditional{
//     public static void main (String[]args){
//         int age = 61;
//         if(age>=18 && age<=60)
//         {
//             System.out.println("Legal Adult");
//         }
//         else if(age>=60)
//         {
//             System.out.println("Old Age");
//         }
//         else 
//         {
//             System.out.println("You're a kid");
//         }
//     }
// }

public class conditional {
    public static void main (String[]args){
        int age = 15;
        if(age>=18 && age<=60)
        {
        if(age>=20 && age<=30)
        {
            System.out.println("You're in 20's");
        }
        else if (age>30 && age<=60)
        {
            System.out.println("You're in 30's");
        }
        else{
            System.out.println("You're still teen");
        }
        }
        else if (age>=60)
        {
            System.out.println("You are 60 plus old man");
        }
        else
        {
            System.out.println("You're a kid");
        }
    }
}
