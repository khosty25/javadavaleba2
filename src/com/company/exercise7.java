System.out.println();
        System.out.println("===  Exercise 7 Result  ===");

        System.out.print("Enter:  ");
        int numOne = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.print("Enter:  ");
        int numTwo = Integer.parseInt(new Scanner(System.in).nextLine());

        do  {
        if (numTwo == 0) {
        System.out.println(numOne);
        } else {
        numTwo = numOne % numTwo;
        }
        } while (numTwo != 0);