public class Numbers {
        static void main(String[]args) {
            int number = (int) (Math.random() * 100) + 1;
            if (number % 2 == 0) {
                System.out.println("even "+number);}
            else{System.out.println("odd " +number);}
        }
    }
