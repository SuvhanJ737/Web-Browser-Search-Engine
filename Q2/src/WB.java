
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
        
public class WB {
   //Creating frame
    public static void main(String[] args) {
        final JFrame frame = new JFrame("Search Engine");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(620,440);
        final JFXPanel fxpanel = new JFXPanel();
        frame.add(fxpanel);
        Platform.runLater(new Runnable(){
        @Override 
        public void run(){
        WebEngine engine;
        WebView wv = new WebView();
        engine = wv.getEngine();
        fxpanel.setScene(new Scene (wv));
        engine.load("https://www.bing.com"); //Search engine link
        }
        });
        frame.setVisible(true);
    }
    
}

