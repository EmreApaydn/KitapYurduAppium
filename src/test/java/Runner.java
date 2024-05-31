import org.junit.Assert;
import org.junit.Test;

import java.util.Random;


public class Runner extends Hook {

    Methods methods = new Methods();

    @Test
    public void startTest() throws InterruptedException {
        methods.bekle(15);
        methods.tikla(Elements.laterButton);
        methods.bekle(10);
        methods.tikla(Elements.laterButton);
        methods.tikla(Elements.araButonu);
        methods.tikla(Elements.aramaInput);
        methods.textYaz(Elements.aramaInput, "harry potter");
        methods.bekle(6);
        Assert.assertEquals("harry potter",androidDriver.findElement(Elements.harryPotter).getText());
        methods.tikla(Elements.harryPotter);
        methods.tikla(Elements.sirala);
        methods.tikla(Elements.degerlendirilenler);
        methods.bekle(5);
        int resimSayisi = androidDriver.findElements(Elements.kitap).size(); //Ekranda kaç resim oldugunu verir
        Random random = new Random();
        int randomNumber = random.nextInt(resimSayisi);
        methods.randomtiklama(Elements.kitap,randomNumber);
        methods.bekle(5);
        Assert.assertTrue(androidDriver.findElement(Elements.paylas).isDisplayed());
        String fiyat = androidDriver.findElement(Elements.fiyat).getText();
        methods.tikla(Elements.sepeteEkle);
        methods.tikla(Elements.girisYap);
        methods.tikla(Elements.email);
        methods.textYaz(Elements.email,"emreapaydn224@gmail.com");
        methods.tikla(Elements.password);
        methods.textYaz(Elements.password,"ea1234567ea");
        methods.tikla(Elements.login);
        methods.bekle(5);
        methods.tikla(Elements.sepetim);
        String fiyat1 = androidDriver.findElement(Elements.fiyat1).getText();
        Assert.assertEquals(fiyat1,fiyat);
        methods.tikla(Elements.sil);
        methods.tikla(Elements.sil1);
        Assert.assertTrue(androidDriver.findElement(Elements.sepetinizBos).isDisplayed());
        methods.tikla(Elements.anaSayfa);
        methods.tikla(Elements.profil);
        methods.tikla(Elements.cikisyap);
        methods.tikla(Elements.tamam);

    }

}
