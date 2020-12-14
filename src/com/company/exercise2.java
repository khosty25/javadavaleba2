System.out.println();
        System.out.println("===  Exercise 2 Result  ===");
        System.out.print("Enter first number:  ");
        int input1 = Integer.parseInt(
        new Scanner(System.in).nextLine()
        );

        System.out.print("Enter second number:  ");
        int input2 = Integer.parseInt(
        new Scanner(System.in).nextLine()
        );

        int divisionResult = input1 / input2;
        int divisionResult1 = input2 % input1;

        System.out.println("Division Result 1:  " + divisionResult);
        System.out.println("Division Result 2:  " + divisionResult1);