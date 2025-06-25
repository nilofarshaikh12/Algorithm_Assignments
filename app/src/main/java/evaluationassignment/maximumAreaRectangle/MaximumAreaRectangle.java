package evaluationassignment.maximumAreaRectangle;

import java.util.Scanner;

public class MaximumAreaRectangle {

    public static int calculateArea(Rectangle rect[], int n) {
        int maxArea = 0;
        for (int i = 0; i < rect.length; i++) {
            if (rect[i] != null) {
                int area = rect[i].area();
                if (area > maxArea) {
                    maxArea = area;
                }
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rectangle:");
        int no = sc.nextInt();

        Rectangle[] rects = new Rectangle[no];

        for (int i = 0; i < rects.length; i++) {
            System.out.println("Enter length and breadth of rectangle " + (i + 1) + " :");
            int length = sc.nextInt();
            int breadth = sc.nextInt();

            if (length <= 0 || breadth <= 0) {
                System.out.println("Invalid input");
                continue;
            }
            rects[i] = new Rectangle(length, breadth);
        }

        int result = calculateArea(rects, no);
        System.out.println("Maximum Area:" + result);
    }
}
