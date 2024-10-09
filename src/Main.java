import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean validValue = false;
        double sideOne = 0;
        double sideTwo = 0;
        double diagonal;
        double rectanglePerimeter;
        double rectangleArea;

        do {
            System.out.println("Enter a length for side 1");
            if (scan.hasNextDouble()) {
                sideOne = scan.nextDouble();
                if (sideOne > 0) {
                    validValue = true;
                } else {
                    System.out.println("You have entered an invalid integer");
                }
            } else {
                System.out.println("You have entered an invalid integer");
            }
        }while (!validValue);

                validValue = false;
                do {
                    System.out.println("Enter a length for side 2");
                    if (scan.hasNextDouble()) {
                        sideTwo = scan.nextDouble();
                        if (sideTwo > 0) {
                            validValue = true;
                        } else {
                            System.out.println("You have entered an invalid integer");
                        }
                    } else {
                        System.out.println("You have entered an invalid integer");
                    }
                    scan.nextLine();
                }while (!validValue);
                rectangleArea = sideOne * sideTwo;
                rectanglePerimeter = (sideOne * 2) + (sideTwo * 2);
                diagonal = Math.sqrt((Math.pow(sideOne,2) + Math.pow(sideTwo,2)));

                System.out.printf("%-15s %10.2f", "Side1:", sideOne);
                System.out.printf("\n%-15s %10.2f", "Side2:", sideTwo);
                System.out.printf("\n%-15s %10.2f", "Area:", rectangleArea);
                System.out.printf("\n%-15s %10.2f", "Perimeter:", rectanglePerimeter);
                System.out.printf("\n%-15s %10.2f", "diagonal", diagonal);
                    }
                }
