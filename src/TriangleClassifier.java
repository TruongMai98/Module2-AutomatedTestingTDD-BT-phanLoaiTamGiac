public class TriangleClassifier {
    public static String getTypeOfTriangle(int side1, int side2, int side3) {
        boolean side1EqualSide2EqualSide3 = side1 == side2 && side2 == side3 && side1 == side3;
        if (side1EqualSide2EqualSide3) {
            return "tam giac deu";
        }
        return null;
    }
}
