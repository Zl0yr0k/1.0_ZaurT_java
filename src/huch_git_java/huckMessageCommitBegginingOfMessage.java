package huch_git_java;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class huckMessageCommitBegginingOfMessage {


        // Регулярное выражение для проверки формата сообщения коммита
        // По умолчанию проверяет, что сообщение начинается с типа коммита:
        // feat:, fix:, docs:, style:, refactor:, test:, chore:
        private static final String COMMIT_MSG_PATTERN =
                "^(feat|fix|docs|style|refactor|test|chore)(\\(.+\\))?: .+";

        // Пример сообщения, показывающее правильный формат
        private static final String EXAMPLE_MESSAGE =
                "feat: add new feature\n" +
                        "fix(parser): fix parsing error\n" +
                        "docs: update documentation";

        public static void main(String[] args) {
            if (args.length < 1) {
                System.err.println("Error: No commit message file specified");
                System.exit(1);
            }

            String commitMsgFile = args[0];

            try {
                // Читаем сообщение коммита из файла
                String commitMessage = readCommitMessage(commitMsgFile);

                // Проверяем соответствие шаблону
                if (!isValidCommitMessage(commitMessage)) {
                    System.err.println("\nERROR: Commit message doesn't match the required pattern!");
                    System.err.println("\nExpected pattern: " + COMMIT_MSG_PATTERN);
                    System.err.println("\nExamples:");
                    System.err.println(EXAMPLE_MESSAGE);
                    System.err.println("\nYour message was:");
                    System.err.println(commitMessage);
                    System.exit(1);
                }

                System.out.println("Commit message is valid!");
                System.exit(0);

            } catch (IOException e) {
                System.err.println("Error reading commit message file: " + e.getMessage());
                System.exit(1);
            }
        }

        private static String readCommitMessage(String filename) throws IOException {
            StringBuilder content = new StringBuilder();
            File file = new File(filename);

            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    content.append(line).append("\n");
                }
            }

            return content.toString().trim();
        }

        private static boolean isValidCommitMessage(String message) {
            if (message == null || message.isEmpty()) {
                return false;
            }

            // Берем только первую строку сообщения
            String firstLine = message.split("\n")[0].trim();

            // Проверяем соответствие шаблону
            return Pattern.matches(COMMIT_MSG_PATTERN, firstLine);
        }

        /**
         * Метод для установки пользовательского шаблона
         */
        public static void setCustomPattern(String pattern) {
            // В реальном проекте можно читать из конфигурационного файла
            // COMMIT_MSG_PATTERN = pattern;
        }

}
