package hu.nive.ujratervezes.adddigits;



/**
 Hozd létre az AddDigits osztályt, és annak az addDigits(String input) metódusát.

 A metódus feladata, hogy a paraméterben kapott Stringben található összes számjegyet adja össze,
 és ennek az összegét adja vissza. Ha a bemeneti String üres, vagy null, adjon vissza -1 -et.
 */

public class AddDigits {

    public int addDigits(String number) {
        if (number == null || number == "") {
            return -1;
        }
        int result = 0;
        for (int i = 0; i < number.length(); i++) {
            char digit = number.charAt(i);
            if (digit <= '9' && digit >= '0')
                result += (int) digit - 48;
        }
        return result;
    }
}
