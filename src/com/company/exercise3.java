System.out.println();
        System.out.println("===  Exercise 3 Result  ===");
        System.out.print("Enter first number:  ");
        int num1 = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.print("Enter second number:  ");
        int num2 = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.print("Enter third number:  ");
        int num3 = Integer.parseInt(new Scanner(System.in).nextLine());

        int summary = num1 + num2 + num3;
        int multipliedResult = num1 * num2 * num3;

        System.out.println("Summary:  " + summary);
        System.out.println("Multiplied Result:  " + multipliedResult);