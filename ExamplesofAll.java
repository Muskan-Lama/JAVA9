import java.util.function.Function;

public class ExamplesofAll {


    public static void main(String[] args) {

    //indent
    String s = "Muskan Lama is a SE";
    String s1 = s.indent(10);
    System.out.println(s1);


    //repeat
        System.out.println( s.repeat(5));

    //strip
        System.out.println( s.strip());

    //isBlank
        System.out.println(s.isBlank());

    //stripIndent
        String html =
                "\t<html>\n"+
                        "\t\t<body>\n"+
                        "\t\t\t<p>Hello World</p>\n"+
                        "\t\t</body>\n"+
                        "\t</html>";

        System.out.println(html);
        System.out.println(html.stripIndent());


    //transform
        Function<String,String> reverseString = stringToReverse ->
                new StringBuilder(stringToReverse).reverse().toString();

        System.out.println(s.transform(reverseString));

    //translateEscapes
        System.out.println("\"Hello \\n world \"".translateEscapes());

    //formatted
        System.out.println("Java %s".formatted("17"));
}







}

