import java.nio.charset.Charset;

public class Main {
    public static void main(String[] args) {
        for (String encoding : Charset.availableCharsets().keySet()) {
            try {
                // 當初是哪個位元組陣列被解釋為 UTF-8 的？一個一個嘗試！
                byte[] binary = "123".getBytes(encoding);
                System.out.printf("%s %s %n", encoding, new String(binary, "Big5"));
            } catch (Exception e) {
            }
        }
    }
}