package cpe200;

public class PhotoPost extends Post {
    private String filename;
    private String caption;

    public PhotoPost() {
        super();
        this.filename = null;
        this.caption = null;
    }

    public PhotoPost(String u) {
        super(u);
        this.filename = null;
        this.caption = null;
    }

    public PhotoPost(String u, String f, String c) {
        super(u);
        this.filename = isValidateFile(f)?f:null;
        this.caption = c;
    }

    public String getFilename() {
        return this.filename;
    }

    public void setFilename(String filename) {
        this.filename = isValidateFile(filename)?filename:this.filename;
    }

    public String getCaption() {
        return this.caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    private boolean isValidateFile(String f) {
        // only allow JPEG and PNG file
        String pattern = "^[a-zA-Z0-9]+(.jpg|.png)";
        if (f.matches(pattern)) return true;
        else return false;
    }

    @Override
    public void display() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        String o = this.username + " (posted: " + this.timestamp + ")\n";
        o += "[ " + this.filename + " ]\n";
        o += "Caption: " + this.caption + "\n";
        o += this.likes + " people like this.\n";
        if (this.comments.size() == 0) {
            o += "\tNo comments.\n";
        }
        else{
            for (int i = 0; i < this.comments.size(); i++) {
                o += "\t" + comments.get(i) + "\n";
            }
        }
        return o;
    }

}
