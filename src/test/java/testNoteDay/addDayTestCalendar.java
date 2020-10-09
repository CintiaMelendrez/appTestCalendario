package testNoteDay;

import activity.MainActivity;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import sessionManager.Session;

import java.net.MalformedURLException;

public class addDayTestCalendar {
    MainActivity mainActivity =new MainActivity();

    @Test
    public void addFootBallDay() throws MalformedURLException{
        String note="Reunion en la cancha";
        mainActivity.dayButton.click();
        mainActivity.noteDay.type(note);
        mainActivity.imageDay.click();
        mainActivity.imageFoot.click();
        mainActivity.imageSave.click();


        String noteMessage = mainActivity.noteRegister.getText();
        String noteMessageExpected="10 Octubre 2020 : Fiesta de la Candelaria";
        Assert.assertEquals("ERROR ! No Registro correctamante",noteMessageExpected,noteMessage);


    }
    @After
    public void after() throws MalformedURLException{
        Session.getInstance().closeSession();
    }

}
