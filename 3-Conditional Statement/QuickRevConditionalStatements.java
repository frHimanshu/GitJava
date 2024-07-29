public class QuickRevConditionalStatements {

    public static void main(String[] args) {
        // if statement
        int number = 10;
        if (number > 0) {
            System.out.println("Number is positive");
        }

        // if-else statement
        number = -10;
        if (number > 0) {
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is not positive");
        }

        // else-if ladder
        number = 0;
        if (number > 0) {
            System.out.println("Number is positive");
        } else if (number < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
        }

        // Nested if statement
        int year = 2020;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is a leap year");
                } else {
                    System.out.println(year + " is not a leap year");
                }
            } else {
                System.out.println(year + " is a leap year");
            }
        } else {
            System.out.println(year + " is not a leap year");
        }

        // switch statement
        int dayOfWeek = 3;
        switch (dayOfWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }

        // Ternary operator
        int age = 18;
        String result = (age >= 18) ? "Adult" : "Minor";
        System.out.println("The person is an " + result);
    }
}
