public class TriangleClassifier {
    public static String getTypeOfTriangle(int side1, int side2, int side3) {
        boolean side1EqualSide2 = side1 == side2;
        boolean side2EqualSide3 = side2 == side3;
        boolean side3EqualSide1 = side1 == side3;
        if (side1EqualSide2 && side2EqualSide3 && side3EqualSide1) {
            return "tam giac deu";
        } else if (side1EqualSide2 || side2EqualSide3 || side3EqualSide1) {
            return "tam giac can";
        }
        return null;
    }
}
