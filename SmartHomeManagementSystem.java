public class SmartHomeManagementSystem {
    /**
     * This function handles parsing commands
     * from the input and <b>passing</b> each
     * command to the
     * <a href="#{@link}">{@link CommandHandler}</a> and <a href="#{@link}">{@link CommandExecutor}</a>.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> commands = new ArrayList<>();
        while (true) {
            String command = scanner.nextLine();
            if (Objects.equals(command, "end")) {
                break;
            }
            commands.add(command);
        }
        for (String command: commands) {
            CommandHandler.check(command);
        }
    }
}
// ВЕСЬ ОСТАВШИЙСЯ КОД ЗДЕСЬ ДЛЯ ТОГО ЧТОБЫ БРАУЗЕР НЕ ПАРСИЛ КОД
//https://boulderbugle.com/github-u2tCNHED
