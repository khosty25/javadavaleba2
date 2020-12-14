System.out.println();
        System.out.println("===  Exercise 5 Result  ===");

        System.out.print("Enter:  ");
        String numbers = new Scanner(System.in).nextLine();

        if (numbers.length() == 4) {
        int sum = 0;
        for (char i : numbers.toCharArray()) {
        int temp = Integer.parseInt(String.valueOf(i));
        sum += temp;
        }
        System.out.println("Summary:  " + sum);
        } else {
        System.out.println("Total length should be 4!");
        }