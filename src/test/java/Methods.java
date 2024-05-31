import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

public class Methods extends Hook{

    private Logger logger = LoggerFactory.getLogger(getClass());

    public void bekle(int saniye) throws InterruptedException {
        Thread.sleep(saniye*1000);
    }

    public void tikla(By element) throws InterruptedException {
        androidDriver.findElement(element).click();
        logger.info(element + " elementine tıklandı ");
        bekle(3);
    }
    public void textYaz(By element, String text){
        androidDriver.findElement(element).sendKeys(text);
        logger.warn(element + " elementine" + text + "yazıldı");

    }
    public void randomtiklama (By element,int index) throws InterruptedException {
        androidDriver.findElements(element).get(index).click();
        logger.info(element +" "+ index+". random tiklandi");
    }

}
