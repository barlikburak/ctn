package model;

import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 *
 * @author burak
 */
public class CekSenet extends AbstractMenu {

    public CekSenet(Menu menu) {
        super(menu, "cek-senet");
        altkategori = new String[5];
        altkategori[0] = "kendi-cekim.png";
        altkategori[1] = "kendi-senedim.png";
        altkategori[2] = "musteri-cek.png";
        altkategori[3] = "musteri-senet.png";
        altkategori[4] = "cek-senet-cirola.png";
        eventHandler(menu);
    }

    @Override
    public void altKategoriEventHandler() {
        getvBox().getChildren().get(0).addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent event) -> {
            start(new Stage(), "FXMLKendiCekim", "Kendi Çekim");
        });
        getvBox().getChildren().get(1).addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent event) -> {
            start(new Stage(), "FXMLKendiSenedim", "Kendi Senedim");
        });
        getvBox().getChildren().get(2).addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent event) -> {
            start(new Stage(), "FXMLMusteriCeki", "Müşteri Çeki");
        });
        getvBox().getChildren().get(3).addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent event) -> {
            start(new Stage(), "FXMLMusteriSenedi", "Müşteri Senedi");
        });
        getvBox().getChildren().get(4).addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent event) -> {
            start(new Stage(), "FXMLCekSenetCirola","Çek-Senet ile Alış ve Satış İşlemi");
        });
    }

}
