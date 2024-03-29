import java.util.concurrent.TimeUnit;

public class Me_14_Chor_Lyrics {
    public static void main(String[] args) 
    { 
        System.out.println();

        String lyrics = "Meri Jeet Bhi Leja....\n" +
                        "Meri Haar Bhi Le Ja....\n" +
                        "Mera Dar Bhi Leja....\n" +
                        "Mera Ghar Bhi Le Ja....\n" +
                        "\n" +
                        "Mere Khwaab Bhi Le Ja....\n" +
                        "Mere Raaz Bhi Le Ja....\n" +
                        "Mera Gham Bhi Le Ja....\n" +
                        "Har Zakhm Bhi Le Ja....\n" +
                        "\n" +
                        "Meri Jaat Bhi Le Ja....\n" +
                        "Aukaat Bhi Le Ja....\n" +
                        "Meri Baat Bhi Le Ja....\n" +
                        "Haalaat Bhi Le Ja....\n" +
                        "\n" +
                        "Le Ja Mera....\n" +
                        "Jo Bhi Dikhe....\n" +
                        "Jo Na Dikhe....\n" +
                        "Woh Bhi Le Ja....\n\n";
               

        displayLyricsWithDelay(lyrics, 2000); // 2000 milliseconds delay
    }

    public static void displayLyricsWithDelay(String lyrics, long delayMillis) 
    {
        String[] sentences = lyrics.split("\\n");

        for (String sentence : sentences) 
        {
            System.out.println(sentence);
            try 
            {
                TimeUnit.MILLISECONDS.sleep(delayMillis);
            } 
            catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
        }
    }
}