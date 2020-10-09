package activity;

import appiumControl.Button;
import appiumControl.TextBox;
import org.openqa.selenium.By;

public class MainActivity {

    public Button dayButton;
    public TextBox noteDay;
    public Button imageDay;
    public Button imageFoot;
    public Button imageSave;
    public TextBox noteRegister;
    public Button imageRemove;
    public MainActivity(){
        dayButton= new Button(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[20]"));
        noteDay= new TextBox(By.id("com.agus.bolivia.calendario:id/editTextTitle"));
        imageDay= new Button(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ImageButton[1]"));
        imageFoot=new Button(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[19]/android.widget.ImageView"));
        imageSave=new Button(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ImageButton[3]"));
        noteRegister=new TextBox(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.webkit.WebView/android.webkit.WebView/android.view.View[3]/android.view.View[2]"));
        
        imageRemove = new Button(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ImageButton[4]"));
    }

}
