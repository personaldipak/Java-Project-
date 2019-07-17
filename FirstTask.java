/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firsttask;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javafx.scene.control.TextField;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Side;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;


public class FirstTask extends Application {
      public Button btnSubmit = new Button("Submit");
      public TextField txtSearch = new TextField();
      public TextField txtSearch1 = new TextField();
      public TextField txtSearch2 = new TextField();
      public TextField txtSearch3 = new TextField();
      
     String keyword1 = "";
     String keyword2 = "";
     String keyword3 = "";
    
    private PieChart PieChart;
    
    HashMap<String, Integer> map = new HashMap<>();
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        BorderPane border = new BorderPane();

        HBox hbox = addHBox();
        border.setTop(hbox);
        
        border.setLeft(addVBox());
        
        HBox hbox2 = addHBox2();
        border.setCenter(hbox2);
        
        Scene scene = new Scene(border);
        stage.setScene(scene);
        stage.setTitle("Block 3 Task 1");
        stage.show();
    }

    private HBox addHBox() {
        
        HBox hbox = new HBox();
        hbox.setPadding(new Insets(15, 12, 15, 12));
        hbox.setSpacing(10);   // Gap between nodes
       
        ////<<<Enter API key to run configuraiton >>>
        ConfigurationBuilder configBuilder = new ConfigurationBuilder();
        configBuilder.setOAuthConsumerKey("xxx");
        configBuilder.setOAuthConsumerSecret("xxx");
        configBuilder.setOAuthAccessToken("xxx");
        configBuilder.setOAuthAccessTokenSecret("xxx");

        //Create instance of Twitter for searching etc.
        TwitterFactory tf = new TwitterFactory(configBuilder.build());
        Twitter twitter = tf.getInstance();
        
        btnSubmit.setOnAction((javafx.event.ActionEvent e) -> {
            Query query = new Query(txtSearch.getText());
            keyword1 = txtSearch1.getText();
            keyword2 = txtSearch2.getText();
            keyword3 = txtSearch3.getText();
            query.setLang("en");//Language codes listed here: https://en.wikipedia.org/wiki/ISO_639-1
            QueryResult result;
            query.setCount(100);
            
            int count = 0;
            
            try {
                result = twitter.search(query);
                ArrayList tweets = (ArrayList) result.getTweets();
                for (Object tweet : tweets) {
                    Status t = (Status) tweet;
                    String userName = t.getUser().getName();
                    long userId = t.getUser().getId();
                    Date creationDate = t.getCreatedAt();
                    String tweetText = t.getText();
                    count++;
                    System.out.println(userName + " / " + userId + " / " +
                            creationDate + " / " + tweetText + " / " + count);
                    
                    //hashmap with split to split the twitter tweet
                    String[] input = tweetText.split("[ \n\t\r.,;:!?()]");
                    for (String keyword : input) {
                        if (map.containsKey(keyword.trim())){
                            int tmpCnt = map.get(keyword.trim());
                            map.put(keyword.trim().toLowerCase(), tmpCnt +1);
                        }
                        else
                            map.put(keyword.trim().toLowerCase(), 1);
                    }
                }
            }
            catch(TwitterException ex){
            }
            
            map.keySet().stream().forEach((keyword) -> {
                System.out.println(keyword + " : " + map.get(keyword));    
            });
            
            ///get data from hashmap and show as pie chart
             PieChart.setData(ChartData(map, keyword1, keyword2, keyword3));
             map.clear();
        }); 

        hbox.getChildren().addAll(txtSearch);
           
        return hbox;
    }

    
    private VBox addVBox() {
        
        VBox vbox = new VBox();
        vbox.setPadding(new Insets(10)); // Set all sides to 10
        vbox.setSpacing(8);              // Gap between nodes

        Text title = new Text("Keywords");
        title.setFont(Font.font("Arial", FontWeight.BOLD, 14));
        vbox.getChildren().add(title);
        
        vbox.getChildren().addAll(txtSearch1, txtSearch2, txtSearch3, btnSubmit);

        return vbox;
    }

    private HBox addHBox2() {

        HBox hbox2 = new HBox();
       
        PieChart = new PieChart();
        PieChart.setTitle("Twitter Analysis");
        PieChart.setLabelLineLength(20);
        PieChart.setLegendSide(Side.BOTTOM);
      
        hbox2.getChildren().addAll(PieChart);
      
        return hbox2;
    }
    
    private ObservableList<PieChart.Data> ChartData(Map<String, Integer> data, String keyword1, String keyword2, String keyword3 ){

             String s1 = keyword1;
             String s2 = keyword2;
             String s3 = keyword3;
     
        ObservableList<PieChart.Data> answer = FXCollections.observableArrayList();
        
        System.out.println("Final Result: " + map.size());
        
        if (map.containsKey(keyword1)) {
        answer.add(new PieChart.Data(s1, map.get(s1)));
        System.out.println(keyword1 + " " + map.get(s1));  
        }
        
        if (map.containsKey(keyword2)) {
         answer.add(new PieChart.Data(s2, map.get(s2)));
         System.out.println(keyword2 + " " + map.get(s2));
        }
        
        if (map.containsKey(keyword3)) {
         answer.add(new PieChart.Data(s3, map.get(s3)));
           System.out.println(keyword3 + " " + map.get(s3));
        }
             
        return answer;   
    }

    private int getCount(String key) {
    if(map.containsKey(key))
        return map.get(key);
    else 
        return 0;
    }
}
