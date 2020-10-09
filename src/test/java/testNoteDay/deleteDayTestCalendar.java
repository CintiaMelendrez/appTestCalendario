package testNoteDay;

import activity.MainActivity;
import org.junit.Assert;
import org.junit.Test;

import java.net.MalformedURLException;

public class deleteDayTestCalendar {
    MainActivity mainActivity=new MainActivity();

    @Test
    public void removeDay() throws MalformedURLException{
        mainActivity.dayButton.click();
        mainActivity.imageRemove.click();

        String noteMessage = mainActivity.noteRegister.getText();
        Assert.assertEquals("ERROR ! No Registro correctamante","10 Octubre 2020 : Fiesta de la Candelaria",noteMessage);

    }
}
