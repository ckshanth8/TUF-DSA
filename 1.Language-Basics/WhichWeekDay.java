class WhichWeekDay {
    public void whichWeekDay(int day) {
        if (day < 1 || day > 7) {
            System.out.print("Invalid");
            return;
        }

        // Print the corresponding day of the week
        switch (day) {
            case 1:
                System.out.print("Monday");
                break;
            case 2:
                System.out.print("Tuesday");
                break;
            case 3:
                System.out.print("Wednesday");
                break;
            case 4:
                System.out.print("Thursday");
                break;
            case 5:
                System.out.print("Friday");
                break;
            case 6:
                System.out.print("Saturday");
                break;
            case 7:
                System.out.print("Sunday");
                break;
        }
    }
}