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
        System.out.println(disguiseMessage(input));

        String input2 = "Immediate action is required to address a critical situation impacting our production system. Our services are experiencing unexpected disruptions due to a memory leak in the core application.";
        System.out.println(disguiseMessage(input2));

        String input3 = "I need your urgent assistance regarding a sensitive issue. Please meet me in person at [secure location] at [specific time]. This is critical.";
        System.out.println(disguiseMessage(input3));
    }
}