import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    @DisplayName("tam giac deu")
    void getTypeOfTriangle0() {
        int side1 = 2;
        int side2 = 2;
        int side3 = 2;

        String excepted = "tam giac deu";
        String result = TriangleClassifier.getTypeOfTriangle(side1, side2, side3);
        assertEquals(excepted, result);
    }

    @Test
    @DisplayName("tam giac can")
    void getTypeOfTriangle1() {
        int side1 = 2;
        int side2 = 2;
        int side3 = 3;

        String excepted = "tam giac can";
        String result = TriangleClassifier.getTypeOfTriangle(side1, side2, side3);
        assertEquals(excepted, result);
    }

    @Test
    @DisplayName("tam giac thuong")
    void getTypeOfTriangle2() {
        int side1 = 3;
        int side2 = 4;
        int side3 = 5;

        String excepted = "tam giac thuong";
        String result = TriangleClassifier.getTypeOfTriangle(side1, side2, side3);
        assertEquals(excepted, result);
    }

    @Test
    @DisplayName("khong phai tam giac")
    void getTypeOfTriangle3() {
        int side1 = 8;
        int side2 = 2;
        int side3 = 3;

        String excepted = "khong phai tam giac";
        String result = TriangleClassifier.getTypeOfTriangle(side1, side2, side3);
        assertEquals(excepted, result);
    }
}