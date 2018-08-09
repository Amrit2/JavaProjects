import twitter4j.PagableResponseList;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.User;
import twitter4j.conf.ConfigurationBuilder;

public class Mobile {
	private Twitter twitter;

	public Mobile() {
		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setDebugEnabled(true).
		setOAuthConsumerKey("Poyadz3Cibhv7EqVYCZrILtV6").
		setOAuthConsumerSecret("gw3ooFFw2sURQYW7k7NJEN4TbCv6PPAxgkR5n26iCljxa8ox8u").
		setOAuthAccessToken("777049239847182336-bcnSZZJv9nowcHxZyLHAkq4qgZ85dRP").
		setOAuthAccessTokenSecret("vnMdKOorO8O1zHRLtJNyWWqYBdbNeZvVNDWJRyyZNqnsv");

		TwitterFactory tf = new TwitterFactory(cb.build());
		this.twitter = tf.getInstance();

	}

	public String showLatestTweetFrom(String user) {
		try {
			return twitter.showUser(user).getStatus().getText();
		} 
		catch (TwitterException e) {
			e.printStackTrace();
			return "";
		}
	}

	public String showUserInfo (String user) {
		try {
			return twitter.showUser(user).toString();
		} 
		catch (TwitterException e) {
			e.printStackTrace();
			return "";
		}
	}

	public String getFollowers(String user) {
		try {
			String twitterScreenName = twitter.getScreenName();
			String followers = "";
			int count = 0;
			for(int i = 0;i<=3;i++)
			{
				followers += "i = "+i+"\n";

				//PagableResponseList<User> statuse = twitter.getFollowersList(twitterScreenName, -1);
				PagableResponseList<User> statuse = twitter.getFollowersList(twitterScreenName, -1, 20);
				for (User follower : statuse) {

					
					followers += count+": "+follower.getName() + "\n"; 
					count++;
				}
			}
			return followers;
		} 
		catch (TwitterException e) {
			e.printStackTrace();
			return "";
		}
	}

	public static void main (String[] args) {
		Mobile mobile = new Mobile();
		System.out.println(mobile.showLatestTweetFrom("Amrit_Kaur24"));
		System.out.println(mobile.showUserInfo("Amrit_Kaur24"));
		System.out.println(mobile.getFollowers("Amrit_Kaur24"));
	}


}
