import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;



public class SILab2Test {

    private List<String> createList(String [] input)
    {
        return  Arrays.asList(input);
    }

    String[] array1 = {};
    String[] array2 = {"#", "0", "#"};
    String[] array3 = {"#", "0", "#", "#", "0", "#", "#", "0" ,"#"};
    String[] array4 = {"#", "0", "#", "#", "0", "#", "#", "#" ,"#"};
    String[] array5 = {"#", "#", "#", "#", "0", "#", "#", "0" ,"#"};
    String[] array6 = {"#", "#", "0", "#", "#", "0", "#", "#" ,"0"};
    String[] array7 = {"0", "0", "0", "#", "#", "#", "#", "#" ,"#"};

    String[] resultArray3 = {"#", "2", "#", "#", "2", "#", "#", "2" ,"#"};
    String[] resultArray4 = {"#", "2", "#", "#", "3", "#", "#", "#" ,"#"};
    String[] resultArray5 = {"#", "#", "#", "#", "3", "#", "#", "2" ,"#"};
    String[] resultArray6 = {"#", "#", "1", "#", "#", "1", "#", "#" ,"1"};
    String[] resultArray7 = {"1", "1", "1", "#", "#", "#", "#", "#" ,"#"};

    @Test
    void testEveryStatement(){
        IllegalArgumentException ex;

        // 1, 2, 4, 5, 6, 24

        ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(createList(array1)));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));

        // 1, 2, 4, 5, 6, 24
        ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(createList(array2)));
        assertTrue(ex.getMessage().contains("List length should be a perfect square"));

        assertTrue(Arrays.equals(resultArray3, (SILab2.function(createList(array3))).stream().toArray(String[]::new)));

        assertTrue(Arrays.equals(resultArray4, (SILab2.function(createList(array4))).stream().toArray(String[]::new)));

        assertTrue(Arrays.equals(resultArray5, (SILab2.function(createList(array5))).stream().toArray(String[]::new)));

        assertTrue(Arrays.equals(resultArray6, (SILab2.function(createList(array6))).stream().toArray(String[]::new)));

    }

    @Test
    void testEveryBranch(){
        IllegalArgumentException ex;

        // 1, 2, 4, 5, 6, 24

        ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(createList(array1)));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));

        // 1, 2, 4, 5, 6, 24
        ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(createList(array2)));
        assertTrue(ex.getMessage().contains("List length should be a perfect square"));

        assertTrue(Arrays.equals(resultArray3, (SILab2.function(createList(array3))).stream().toArray(String[]::new)));

        assertTrue(Arrays.equals(resultArray4, (SILab2.function(createList(array4))).stream().toArray(String[]::new)));

        assertTrue(Arrays.equals(resultArray5, (SILab2.function(createList(array5))).stream().toArray(String[]::new)));

        assertTrue(Arrays.equals(resultArray6, (SILab2.function(createList(array6))).stream().toArray(String[]::new)));

        assertTrue(Arrays.equals(resultArray7, (SILab2.function(createList(array7))).stream().toArray(String[]::new)));

    }
}
