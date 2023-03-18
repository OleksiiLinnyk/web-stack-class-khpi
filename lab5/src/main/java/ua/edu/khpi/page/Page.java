package ua.edu.khpi.page;

public class Page {

    private String header;

    private String body;

    private String footer;


    public Page() {
    }

    public Page(String header, String body, String footer) {
        this.header = header;
        this.body = body;
        this.footer = footer;
    }

    public String getHeader() {
        return header;
    }

    public String getBody() {
        return body;
    }

    public String getFooter() {
        return footer;
    }
}
