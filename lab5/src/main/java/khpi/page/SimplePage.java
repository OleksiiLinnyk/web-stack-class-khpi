package khpi.page;

public class SimplePage extends Page {

    private String title;
    private String content;

    public SimplePage(String title, String content) {
        this.title = title;
        this.content = content;
    }

    @Override
    public String getHeader() {
        return title;
    }

    @Override
    public String getBody() {
        return content;
    }

    @Override
    public String getFooter() {
        return "";
    }
}
