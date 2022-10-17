import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    @DisplayName("tam giac deu")
    void getTypeOfTriangle0() {
        int a = 2;
        int b = 2;
        int c = 2;

        String excepted = "tam giac deu";
        String result = TriangleClassifier.getTypeOfTriangle(a, b, c);
        assertEquals(excepted, result);
    }
}