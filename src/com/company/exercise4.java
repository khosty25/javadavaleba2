System.out.println();
        System.out.println("===  Exercise 4 Result  ===");
        System.out.print("Enter:  ");
        String input = new Scanner(System.in).nextLine();

        if (input.length() == 3) {
        for (char i : input.toCharArray()) {
        System.out.println(i);
        }
        } else {
        System.out.println("Total length should be 3!");
        }