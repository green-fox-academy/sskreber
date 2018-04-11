public class UrlFixer {
    public static void main(String[] args) {
        String url = "https//www.reddit.com/r/nevertellmethebots";

        // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
        // Also, the URL is missing a crutial component, find out what it is and insert it too!
        // Try to solve it more than once using different String functions!

        // SOLUTION 1:
        url = url.replace("bots", "odds");
        url = url.replace("https", "https:");
        System.out.println(url);

        // SOLUTION 2 (the cheaty/shortcut-y one):
        url = url.replaceAll(url, "https://www.reddit.com/r/nevertellmetheodds");
        System.out.println(url);

        //SOLUTION 3:
        int urlLength = url.length() - 1;
        int indexBots = url.indexOf("bots") - 1;
        StringBuilder sb = new StringBuilder(url);

        sb = sb.delete(indexBots, urlLength);
        sb = sb.append("odds");
        int slashIndex = url.indexOf("//");

        sb = sb.insert(slashIndex, ":");
        System.out.println(sb);
    }
}