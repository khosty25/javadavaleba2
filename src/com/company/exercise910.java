System.out.println();
        System.out.println("===  Exercise 9 - 10 Result  ===");

        int[] arrNums = new int[] { 4, 6, 9, 3, 5, 7, 8, 4 };
        System.out.println("=> Array Items:");

        for (int i : arrNums) {
        System.out.println(i);
        }

        System.out.println("- - -");

        int n = arrNums.length;
        int temp = 0;
        for(int i=0; i < n; i++){
        for(int j=1; j < (n-i); j++){
        if(arrNums[j-1] > arrNums[j]){
        temp = arrNums[j-1];
        arrNums[j-1] = arrNums[j];
        arrNums[j] = temp;
        }

        }
        }

        for (int i : arrNums) {
        System.out.print(i + "  ");
        }
        System.out.println();

        System.out.println("Greatest:  " + arrNums[arrNums.length - 1]);
        System.out.println("Lowest:  " + arrNums[0]);