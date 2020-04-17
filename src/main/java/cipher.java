import java.util.*;

public class cipher {
    private String entry;


    public cipher(String entry) {
        this.entry = entry;
    }

    public String getEntry() {
        return this.entry;
    }


    public int length() {
        return this.entry.length();
    }

    public char charAt(int i) {
        return this.entry.charAt(i);
    }
}

