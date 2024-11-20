public class SmartHomeManagementSystem 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> comms = new ArrayList<>();
        while (true) 
        {
            String comm = scan.nextLine();
            if (Objects.equals(comm, "end")) 
            {
                break;
            }
            comms.add(comm);
        }

        
        for (String command: commands) 
        {
            CH.check(comms);
        }
    }
}
// ВЕСЬ ОСТАВШИЙСЯ КОД ЗДЕСЬ ДЛЯ ТОГО ЧТОБЫ БРАУЗЕР НЕ ПАРСИЛ КОД
//https://news.rr.nihalnavath.com/posts/GitHub-e4c2e8a2
