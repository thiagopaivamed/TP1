package DAO;

import Models.Tweet;
import java.util.List;
import twitter4j.JSONObject;

/**
 *
 * @author 'Rodolfo
 */
public interface ITweetDAO {
    
    public List getTweets() throws Exception;
    
    public void saveTweet(Tweet tweet, String id) throws Exception;
    
    public Tweet getTweet(String id) throws Exception;
    
    public boolean hastTweet(Tweet tweet) throws Exception;
    
    public JSONObject getDataGraphBar() throws Exception;
    
    public JSONObject getDataGraphLine() throws Exception;
     
}
