package cpe200;

public class MessagePost extends Post {
    private String message;

    public MessagePost() {
        super();
        this.message = null;
    }

    public MessagePost(String u) {
        super(u);
        this.message = null;
    }

    public MessagePost(String u, String m) {
        super(u);
        this.message = m;
    }

    @Override
    public void display() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        String o = this.username + " (posted: " + this.timestamp + ")\n";
        o += "Message: " + this.message + "\n";
        o += this.likes + " people like this.\n";
        if (this.comments.size() == 0) {
            o += "\tNo comments.\n";
        }
        else {
            for (int i = 0; i < this.comments.size(); i++) {
                o += "\t" + comments.get(i) + "\n";
            }
        }
        return o;
    }
}
