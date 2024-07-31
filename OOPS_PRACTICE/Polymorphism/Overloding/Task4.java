// Scenario 2: Social Media Analytics
// In a social media analytics system, implement method overloading for analyzing user engagement. Create different methods with different parameter types, such as analyzing engagement based on likes, analyzing engagement based on comments, and analyzing engagement based on shares.

class SocialMediaAnalytics {
  public void analyzingEngagement(int like) {
      System.out.println("Analyzing engagement based on likes: "+like);
  }

  public void analyzingEngagement(int like,int comments) {
    System.out.println("Analyzing engagement based on likes  and comments: "+like+", "+comments);
  }

  public void analyzingEngagement(int like,int comments,int shares) {
    System.out.println("Analyzing engagement based on likes , comments and Shares: "+like+", "+comments+", "+shares);
  }
}

public class Task4 {
  public static void main(String[] args) {
    SocialMediaAnalytics socialMediaAnalytics =new SocialMediaAnalytics();
    socialMediaAnalytics.analyzingEngagement(150);
    socialMediaAnalytics.analyzingEngagement(150, 45);
    socialMediaAnalytics.analyzingEngagement(150, 45, 30);
  }
}
