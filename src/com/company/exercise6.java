System.out.println();
        System.out.println("===  Exercise 6 Result  ===");

        System.out.print("Enter:  ");
        String nums = new Scanner(System.in).nextLine();

        int sum = 0;
        for (char i : numbers.toCharArray()) {
        int temp = Integer.parseInt(String.valueOf(i));
        sum += temp;
        }
        System.out.println("Summary:  " + sum);
