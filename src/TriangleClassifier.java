public class TriangleClassifier {
    public static String getTypeOfTriangle(int a, int b, int c) {
        if (a == b && b == c && a == c) {
            return "tam giac deu";
        }
        return null;
    }
}
