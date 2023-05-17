package features.text;

public class TextBlocks {

    public static void main(String[] args) {
        jsonMovedEndQuoteBlock();
        oldStyle();
        emptyBlock();

    }
    private static void jsonMovedEndQuoteBlock() {
        String text = """
              {
                "name": "John Doe",
                "age": 45,
                "address": "Doe Street, 23, Java Town"
              }
        
                """;
        System.out.println(text);
    }

    private static void emptyBlock() {
        String text = """
            berat
            """;
        System.out.println("||" + text + "||");
    }
    private static void oldStyle() {
        String text = "{\n" +
                "  \"name\": \"John Doe\",\n" +
                "  \"age\": 45,\n" +
                "  \"address\": \"Doe Street, 23, Java Town\"\n" +
                "}";
        System.out.println(text);
    }
}
