package AtbashCipher;

public class AtbashCipher{

    /*
     * The Atbash cipher is an encryption method in which each letter of a word is 
     * replaced with its "mirror" letter in the alphabet: A <=> Z; B <=> Y; C <=> X; etc.
     * 11/4/22
     */
    public static String ApplyCipher(String str) {
        StringBuilder ret = new StringBuilder();
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') { 
                ret.append((char)('Z'-(chars[i]-'A')));
            } else if (chars[i] >= 'a' && chars[i] <= 'z') { 
                ret.append((char)('z'-(chars[i]-'a')));
            } else { 
                ret.append(chars[i]);
            }
        }

        return ret.toString();
    }
    
    public static void main(String[] args) {
        System.out.println(ApplyCipher("apple"));
        System.out.println(ApplyCipher("Hello World!"));
        System.out.println(ApplyCipher("Christmans is the 21st of December"));
    }
}