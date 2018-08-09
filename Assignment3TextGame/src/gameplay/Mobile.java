package gameplay;

//import twitter4j.Twitter;
//import twitter4j.TwitterException;
//import twitter4j.TwitterFactory;
//import twitter4j.conf.ConfigurationBuilder;
/**
 * Sets the Mobile's description and the increase in healthpoints that occurs
 * due to admiring it
 * @author Amritpal Kaur, 14865526
 *
 */
public class Mobile extends Valuables {
//	private Twitter twitter;

	public Mobile(String description, int increaseInConfidence) {
		super(description, increaseInConfidence);
//		ConfigurationBuilder cb = new ConfigurationBuilder();
//		cb.setDebugEnabled(true).
//		setOAuthConsumerKey("").
//		setOAuthConsumerSecret("").
//		setOAuthAccessToken("").
//		setOAuthAccessTokenSecret("");
//
//		TwitterFactory tf = new TwitterFactory(cb.build());
//		this.twitter = tf.getInstance();

	}

	public String showLatestTweetFrom(String user) {
		if (user.equalsIgnoreCase("realDonaldTrump")) {
			return "I will be interviewed on @foxandfriends at 8:00 A.M. Enjoy!";
		}
		else if (user.equalsIgnoreCase("HamillHimself")) {
			return "RT @EmmanuelMacron: Let’s face it: there is not Planet B. https://t.co/vtP2NQYcv9\r\n";
		}
		else
			return "No tweet avaliable";
	}

}
