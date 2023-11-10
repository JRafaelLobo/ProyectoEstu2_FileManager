package standard.file.manager;

import javax.sound.sampled.Clip;
import javax.swing.JFrame;

/**
 *
 * @author rinal
 */
public class CambiarPantallaTiempo extends Thread {

    private JFrame Cambio, Anterior;
    private int milisegundos;
    private Clip Music;
    private boolean CambiarTam = false;
    private int x, y;

    public CambiarPantallaTiempo(JFrame Cambio, JFrame Anterior, int milisegundos) {
        this.Cambio = Cambio;
        this.Anterior = Anterior;
        this.milisegundos = milisegundos;
        CambiarTam = false;

    }

    public CambiarPantallaTiempo(JFrame Cambio, JFrame Anterior, int milisegundos, int x, int y) {
        this.Cambio = Cambio;
        this.Anterior = Anterior;
        this.milisegundos = milisegundos;
        this.x = x;
        this.y = y;
        CambiarTam = true;
    }

    public void set(JFrame Cambio, JFrame Anterior, int milisegundos, int x, int y) {
        this.Cambio = Cambio;
        this.Anterior = Anterior;
        this.milisegundos = milisegundos;
        this.x = x;
        this.y = y;
        CambiarTam = true;
    }

    public void set(JFrame Cambio, JFrame Anterior, int milisegundos) {
        this.Cambio = Cambio;
        this.Anterior = Anterior;
        this.milisegundos = milisegundos;
        CambiarTam = false;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(milisegundos);
        } catch (InterruptedException ex) {
        }
        Cambio.pack();
        Cambio.setVisible(true);
        if (CambiarTam) {
            Cambio.setSize(x, y);
        }
        Cambio.setLocationRelativeTo(Anterior);
        Anterior.setVisible(false);

    }
}
