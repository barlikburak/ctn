package model;

/**
 *
 * @author burak
 */
public class Loglar extends AbstractMenu {

    public Loglar(Menu menu) {
        super(menu,"loglar");
        altkategori = new String[0];
        eventHandler(menu);
    }
    
    @Override
    public void altKategoriEventHandler() {

    }

}