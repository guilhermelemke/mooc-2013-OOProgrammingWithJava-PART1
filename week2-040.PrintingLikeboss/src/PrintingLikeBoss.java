
public class PrintingLikeBoss {

    public static void main(String[] args) {
        xmasTree(10);

    }

    public static void printStars(int size) {
        int i = 0;
        while (i < size) {
            System.out.print("*");
            i++;
        }
        System.out.println();
    }

    public static void printWhitespaces(int size) {
        int i = 0;
        while (i < size) {
            System.out.print(" ");
            i++;
        }
    }
    
    public static void printTriangle (int size) {
        int i = 0;
        int sizeA = size;
        while (i < size) {
            printWhitespaces(sizeA - 1);
            printStars(i + 1);
            i++;
            sizeA--;
        }
    }

    public static void xmasTree(int height) {
        int i = 1;
        int altura = 0;
        int heightArvore = height;
        while (altura < height) {
            printWhitespaces(heightArvore);
            printStars(i);
            i += 2;
            heightArvore--;
            altura++;
        }
        printWhitespaces(height - 1);
        printStars(3);
        printWhitespaces(height - 1);
        printStars(3);
    }
}
