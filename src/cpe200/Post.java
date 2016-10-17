package cpe200;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Post {
    protected String username;
    protected LocalDateTime timestamp;
    protected int likes;
    protected ArrayList<String> comments;

    public Post() {
        this("anonymous");
        this.comments = new ArrayList<String>();
        this.likes = 0;
        this.timestamp = LocalDateTime.now();
    }

    public Post(String u) {
        this.username = isValidateUsername(u)?u:"anonymous";
        this.comments = new ArrayList<String>();
        this.likes = 0;
        this.timestamp = LocalDateTime.now();
    }

    public boolean addComment(String c) {
        if (isValidateComment(c)) {
            this.comments.add(c);
            return true;
        }
        return false;
    }

    public void addlike() {
        this.likes++;
    }

    public boolean removeComment(String c) {
        if (comments.remove(c)){
            return true;
        }
        return false;
    }

    public ArrayList<String> getComments() {
        return this.comments;
    }

    private boolean isValidateUsername(String u) {
        return (u==null || u.equalsIgnoreCase(""))?false:true;
    }

    protected boolean isValidateComment(String c) {
        return (c==null || c.equalsIgnoreCase(""))?false:true;
    }

    public void display() {
        System.out.print(toString());
    }

    @Override
    public String toString() {
        String o = this.username + " (posted: " + this.timestamp + ")\n";
        o += this.likes + " people like this.\n";
        if (this.comments.size() == 0) {
            o += "\tNo comments.";
        }
        else{
            for (int i = 0; i < this.comments.size(); i++) {
                o += "\t" + comments.get(i) + "\n";
            }
        }
        return o;
    }


}
