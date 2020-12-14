System.out.println();
        System.out.println("===  Exercise 11 - 12 Result  ===");

        int[] randArr = new int[8];

        for (int i = 0; i < randArr.length; i++) {
        randArr[i] = new Random().nextInt();
        }

        System.out.print("Random Array:  ");
        for (int i : randArr) {
        System.out.print(i + "  ");
        }
        System.out.println();

        int size = randArr.length;
        int tempN = 0;
        for(int i=0; i < size; i++){
        for(int j=1; j < (size-i); j++){
        if(randArr[j-1] < randArr[j]){
        tempN = randArr[j-1];
        randArr[j-1] = randArr[j];
        randArr[j] = tempN;
        }
        }
        }

        System.out.print("Sorted Array:  ");
        for (int i : randArr) {
        System.out.print(i + "  ");
        }
        System.out.println();
        }
        }