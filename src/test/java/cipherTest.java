import org.junit.*;
import static org.junit.Assert.*;

public class cipherTest {

    @Test
    public void new_cipher() {
        cipher newData = new cipher("George Stephen");
        assertEquals(true, newData instanceof cipher);
    }
    @Test
    public void obtain_cipher(){
        cipher newData = new cipher("George Stephen");
        assertEquals("George Stephen",newData.getEntry());

    }
    @Test
    public void encrypt_cipher(){
        cipher newData = new cipher("George Stephen");
    }
}