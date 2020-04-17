import java.util.*;

public class cipher {
    private String entry;


    public cipher(String entry) {
        this.entry = entry;
    }

    public String getEntry() {
        return this.entry;
    }
    public String encrypt() {
        String entryData = this.entry;
        String upperCLass = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerClass = "abcdefghijklmnopqrstuvwxyz";
        String special = "!@#$%^&*()?/<>,.+-";
        String numbers = "0123456789";
        for( int i = 0;i<entryData.length();i++){
            for(int j = 0; j<26;j++){
                if( j<special.length() && entryData.charAt(i)==special.charAt(j)){
                    System.out.print(special.charAt(j));


                }

            }

        }

    }


}
