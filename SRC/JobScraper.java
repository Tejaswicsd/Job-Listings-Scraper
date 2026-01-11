package src;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JobScraper {

    public static void main(String[] args) throws Exception {

        String url = "https://realpython.github.io/fake-jobs/";

        Document doc = Jsoup.connect(url).get();

        Elements jobs = doc.select("div.card-content");

        for (Element job : jobs) {
            String title = job.select("h2.title").text();
            String company = job.select("h3.company").text();
            String location = job.select("p.location").text();

            System.out.println(title);
            System.out.println(company);
            System.out.println(location);
            System.out.println("---------------------");
        }
    }
}
