import org.junit.Test;
import static org.junit.Assert.*;
//LUNGA TSHILA
public class ObjectEqualityTest {
    @Test
    public void testStringObjectAgainstIntegerObject(){
        Float number = 77f;
        Integer number2 = 77;
        ObjectEquality objectEquality = new ObjectEquality();
        objectEquality.equals(number);
        assertEquals(number2, number);
    }

    @Test
    public void testFloatObjectAgainstIntegerObject(){
        Integer number = 23;
        Integer number2 = 23;
        ObjectEquality objectEquality = new ObjectEquality();
        objectEquality.equals(number);
        assertEquals(number2, number);
    }
}