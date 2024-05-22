public class MessageDisguiser {
    public static String disguiseMessage(String message) {
        String[] sentences = message.split("[.\\!]");
        StringBuilder result = new StringBuilder();

        for (String sentence : sentences) {
            String[] words = sentence.trim().split("\\s");
            StringBuilder reversedSentence = new StringBuilder();

            for (int i = 0; i < words.length; i++) {
                String reversedWord = "";

                for (int j = words[i].length() - 1; j >= 0; j--) {
                    reversedWord += words[i].charAt(j);
                }
                words[i] = reversedWord;
                // System.out.println(word);
            }

            for (int i = words.length - 1; i >= 0; i--) {
                reversedSentence.append(words[i]);
                if (i > 0) {
                    reversedSentence.append(" ");
                }
            }

            result.append(reversedSentence);
            if (sentence.endsWith("!")) {
                result.append("!");
            } else {
                result.append(".");
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "URGENT NOTICE: Security breach detected! Change passwords now and enable two-factor authentication.";
        String output = disguiseMessage(input);
        System.out.println(output);
    }
}