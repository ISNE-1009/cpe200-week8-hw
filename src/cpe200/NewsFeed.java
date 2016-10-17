package cpe200;

import java.util.ArrayList;


public class NewsFeed {
    private String feedname;
    private ArrayList<Post> posts;

    public NewsFeed(String name) {
        feedname = name;
        posts = new ArrayList<Post>();
    }

    public void addPost(Post post) {
        this.posts.add(post);
    }

    public void deletePost(Post post) {
        this.posts.remove(post);
    }

    public Post getPost(int i) {
        return this.posts.get(i-1);
    }

    public void displayFeed() {
        System.out.println("\n******** News Topic: " + feedname + " ********\n");
        for (int i=0; i<this.posts.size();i++) {
            System.out.print(this.posts.get(i).toString());
        }
        System.out.println();
    }
}
