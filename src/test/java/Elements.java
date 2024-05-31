import org.openqa.selenium.By;

import java.util.List;

public class Elements {

    static By araButonu = By.id("com.mobisoft.kitapyurdu:id/navigation_search");
    static By aramaInput= By.id("com.mobisoft.kitapyurdu:id/searchEditText");
    static By laterButton = By.id("com.mobisoft.kitapyurdu:id/btnLaterOn");
    static By harryPotter = By.xpath("//android.widget.TextView[@resource-id=\"com.mobisoft.kitapyurdu:id/list_content\" and @text=\"harry potter\"]");
    static By sirala = By.id("com.mobisoft.kitapyurdu:id/sortButton");
    static By degerlendirilenler = By.xpath("(//android.widget.ImageView[@resource-id=\"com.mobisoft.kitapyurdu:id/imageViewSelected\"])[8]");
    static By kitap = By.xpath("(//android.widget.ImageView[@content-desc=\"Ürün görseli\"])");
    static By paylas = By.id("com.mobisoft.kitapyurdu:id/btn_right_logo");
    static By sepeteEkle = By.id("com.mobisoft.kitapyurdu:id/addToCartNormalView");
    static By fiyat = By.id("com.mobisoft.kitapyurdu:id/textViewSellPriceBottom");
    static By girisYap = By.xpath("//android.widget.RelativeLayout[@content-desc=\"Giriş Yap / Üye Ol\"]");
    static By email = By.id("com.mobisoft.kitapyurdu:id/textview_mail");
    static By password = By.id("com.mobisoft.kitapyurdu:id/textview_password");
    static By login = By.id("com.mobisoft.kitapyurdu:id/loginButton");
    static By sepetim = By.xpath("//android.widget.FrameLayout[@content-desc=\"Sepetim\"]/android.widget.FrameLayout");
    static By fiyat1 = By.id("com.mobisoft.kitapyurdu:id/textViewTotalPrice");
    static By sil = By.xpath("//android.widget.LinearLayout[@resource-id=\"com.mobisoft.kitapyurdu:id/buttonDelete\"]/android.widget.ImageView");
    static By sil1 = By.xpath("//android.widget.RelativeLayout[@content-desc=\"Sil\"]");
    static By sepetinizBos = By.id("com.mobisoft.kitapyurdu:id/textViewErrorMessage");
    static By anaSayfa = By.id("com.mobisoft.kitapyurdu:id/navigation_home");
    static By profil = By.id("com.mobisoft.kitapyurdu:id/btn_ic_header_account");
    static By cikisyap = By.id("com.mobisoft.kitapyurdu:id/ln_logout");
    static By tamam = By.id("com.mobisoft.kitapyurdu:id/confirmButton");
}
