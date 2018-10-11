package com.company;

class BlogPost {
    String authorName;
    String title;
    String text;
    String date;

    public BlogPost(String authorName, String title, String text, String date){
        authorName = authorName;
        title = title;
        text = text;
        date = date;
    }

    public static void main(String[] args) {
        BlogPost Lorem_Ipsum = new BlogPost(
                "John Doe", "Lorem Ipsum",
                "Lorem ipsum dolor sit amet.\n",
                "2000.04.04"
        );
        BlogPost Wait_but_why = new BlogPost(
                "Tim Urban",
                "Wait but why",
                "A popular long-form, " +
                        "stick-figure-illustrated blog about almost everything.",
                "2010.10.10."
        );
        BlogPost One_Engineer = new BlogPost(
          "William Turton",
                "One Engineer Is Trying to Get IBM to Reckon With Trump",
                "Daniel Hanley, a cybersecurity engineer at IBM, " +
                        "doesn’t want to be the center of attention. " +
                        "When I asked to take his picture outside one of IBM’s " +
                        "New York City offices, he told me that he wasn’t really " +
                        "into the whole organizer profile thing.",
                "2-17.03.28"
        );
    }
}
