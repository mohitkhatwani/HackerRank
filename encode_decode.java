import java.util.*;
public class Codec {

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        Hashtable<Character,Character> hash = new Hashtable<Character,Character>();
        for (int i=0;i<longUrl.length();i++) {
            hash.put(longUrl.charAt(i),(char)((int)longUrl.charAt(i) + 5));
        }
        String out = new String("");
        for(int i=0;i<longUrl.length();i++) {
            out += hash.get(longUrl.charAt(i));
        }
        System.out.println(out);
        return out;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        Hashtable<Character,Character> hash = new Hashtable<Character,Character>();
        for (int i=0;i<shortUrl.length();i++) {
            hash.put(shortUrl.charAt(i),(char)(shortUrl.charAt(i) - 5));
        }
        String out1 = new String("");
        for(int i=0;i<shortUrl.length();i++) {
            out1 += hash.get(shortUrl.charAt(i));
        }
        return out1;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));
