public class Self {
    static String[] myself = {
        "public class Self {",
        "   static String[] myself = {",
        "   };",
        "   static char quote = '\"';",
        "   public static void main(String args[]) {",
        "       for (int i = 0; i < 2; i++) {",
        "           System.out.println(myself[i]);",
        "       }",
        "       int j = 0;",
        "       while(true) {",
        "           if (j == myself.length) {",
        "               System.out.println();",
        "               break;",
        "           }",
        "           for (int space = 0; space < 8; space++) {",
        "               System.out.print(' ');",
        "           }",
        "           System.out.println(quote + myself[j] + quote);",
        "           if (!(j == myself.length - 1)) {",
        "               System.out.println(',');",
        "           }",
        "           j++;",
        "       }",
        "       for (int k = 2; k <= myself.length; k++) {",
        "           System.out.println(myself[k]);",
        "       }",
        "   }",
        "}"
    };
    static char quote = '\"';
    public static void main(String args[]) {
        for (int i = 0; i < 2; i++) {
            System.out.println(myself[i]);
        }
        int j = 0;
        while (true) {
            if (j == myself.length) {
                System.out.println();
                break;
            }
            for (int space = 0; space < 8; space++) {
                System.out.print(' ');
            }
            System.out.print(quote + myself[j] + quote);
            if (!(j == myself.length - 1)) {
                System.out.println(',');
            }
            j++;
        }
        for (int k = 2; k < myself.length; k++) {
            System.out.println(myself[k]);
        }
    }
}
