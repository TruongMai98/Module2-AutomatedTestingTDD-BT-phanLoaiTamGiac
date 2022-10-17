public class TriangleClassifier {
    public static String getTypeOfTriangle(int side1, int side2, int side3) {
        boolean side1EqualSide2 = side1 == side2;
        boolean side2EqualSide3 = side2 == side3;
        boolean side3EqualSide1 = side1 == side3;
        if (side1EqualSide2 && side2EqualSide3) {
            return "tam giac deu";
        } else if (side1EqualSide2 || side2EqualSide3 || side3EqualSide1) {
            return "tam giac can";
        } else if (isTriangle(side1, side2, side3)) {
            return "tam giac thuong";
        } else {
            return "khong phai tam giac";
        }
    }

    private static boolean isTriangle(int side1, int side2, int side3) {
        return Math.abs(side1 - side2) < side3 &&
                Math.abs(side1 - side2) < (side1 + side2) &&
                side3 < (side1 + side2);
    }
}
