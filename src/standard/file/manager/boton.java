//https://www.youtube.com/watch?v=G7bunrDCXx0
package standard.file.manager;

import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.RoundRectangle2D;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author rinal
 */
public class boton extends javax.swing.JButton {

    private Color Linea = Color.WHITE;
    private Color relleno = new java.awt.Color(5, 23, 45);
    private Color colorLinea = Color.white;
    private java.awt.Color Color1 = new java.awt.Color(255, 0, 0);
    private java.awt.Color Color2 = new java.awt.Color(0, 255, 0);
    private float alpha = 1.0f;

    public boton GetAncestor() {
        return this;
    }

    public boton() {
        this.setOpaque(true);
        //this.setContentAreaFilled(false);
        this.setPreferredSize(new Dimension(100, 30));
        this.setFocusPainted(false);
        this.setContentAreaFilled(false);
        this.setFont(new Font("Tahoma", 0, 18));
        this.setForeground(Color.WHITE);
        this.setText("");
        this.addMouseListener(new Adaptador());
//        this.setBackground(Color.RED);
//        this.setForeground(Color.WHITE);
    }

    @Override
    //Metodo para los botones a modificar
    protected void paintComponent(java.awt.Graphics grphcs) {
        //int y_Relativo = this.getHeight()/;
        Graphics2D g2 = (Graphics2D) grphcs;
        int margen = 1; // Margen entre el botón y el rectángulo
        int anchoBoton = getWidth() - 2 * margen;
        int alturaBoton = getHeight() - 2 * margen;

        int anchoRectangulo = anchoBoton * 3 / 4;
        int alturaRectangulo = alturaBoton * 3 / 4;

        int x = margen + (anchoBoton - anchoRectangulo) / 2;
        int y = margen + (alturaBoton - alturaRectangulo) / 2;

        int arcWidth = 10; // Ancho del arco para los bordes circulares del rectángulo
        int arcHeight = 10; // Altura del arco para los bordes circulares del rectángulo

        RoundRectangle2D rectangulo = new RoundRectangle2D.Double(x, y, anchoRectangulo, alturaRectangulo, arcWidth, arcHeight);

        //[5,23,45]
        g2.setColor(relleno);
        g2.fill(rectangulo);
        float grosorTrazo = 2.0f;
        g2.setStroke(new BasicStroke(grosorTrazo));
        g2.setColor(Linea);
        g2.draw(rectangulo);
//        String direccion="/";   
//        Image imagen;
//        imagen = new ImageIcon(direccion).getImage();
//        g2.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        // Antialiasing para bordes suaves

//        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//        g2.setColor(Color.white);
//        RoundRectangle2D rectangulo = new RoundRectangle2D.Double(0, 0, this.getWidth(), this.getHeight(), this.getWidth() / 4, this.getHeight() / 4);
//        g2.draw(rectangulo);
        //g2.drawRect(0, 0, this.getWidth(), getHeight());
        //g2.draw
//
//        // Fondo sólido
//        g2.setColor(new Color(173, 216, 230)); // Azul claro
//        g2.fillRect(0, 0, getWidth(), getHeight());
//
//        // Gradiente
//        GradientPaint gradient = new GradientPaint(0, 0, new Color(135, 206, 250), 0, getHeight(), new Color(70, 130, 180));
//        g2.setPaint(gradient);
//        g2.fillRect(0, 0, getWidth(), getHeight());
        // Transparencia
        g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.8f));

        // Llamada al método paintComponent de la clase padre
        super.paintComponent(g2);
    }

    public void setAlpha(float alpha) {
        this.alpha = alpha;
        repaint();
    }

    public class Adaptador extends MouseAdapter {

        @Override
        public void mouseExited(MouseEvent me) {
            new Thread(new Runnable() {
                @Override
                public void run() {

                    for (float i = 1f; i >= .7f; i -= .03f) {
                        setAlpha(i);

                        Linea = colorLinea;
                        try {
                            Thread.sleep(10);
                        } catch (Exception e) {
                        }
                    }
                }
            }).start();
        }

        @Override
        public void mouseEntered(MouseEvent me) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    boton origen = (boton) me.getSource();
                    for (float i = .7f; i <= 1f; i += .03f) {
                        setAlpha(i);
                        if (origen.isEnabled()) {
                            Linea = Color.yellow;
                        } else {
                            Linea = Color.RED;
                        }
                        try {
                            Thread.sleep(10);
                        } catch (Exception e) {
                        }
                    }
                }
            }).start();
        }

        @Override
        public void mousePressed(MouseEvent me) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (float i = 1f; i >= 0.7f; i -= .1f) {
                        setAlpha(i);
                        //Linea = Color.yellow;
                        try {
                            Thread.sleep(1);
                        } catch (Exception e) {
                        }
                    }
                }
            }).start();
        }
    }
}


/*public class panel extends javax.swing.JPanel {

    private java.awt.Color Color0 = new java.awt.Color(0, 0, 255);
    private java.awt.Color Color1 = new java.awt.Color(255, 0, 0);
    private java.awt.Color Color2 = new java.awt.Color(0, 255, 0);
    private float alpha = 1.0f;

    public panel() {
        this.setOpaque(false);
        this.setPreferredSize(new Dimension(100, 30));
    }

    @Override
    protected void paintComponent(java.awt.Graphics grphcs) {
        Graphics2D g2d = (Graphics2D) grphcs;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(this.Color0);
        g2d.fillRect(0, 0, getWidth(), 3);
        GradientPaint gp = new GradientPaint(0.0F, 0.0F, this.Color1, 0.0F, getHeight(), this.Color2, false);
        g2d.setPaint(gp);
        g2d.fillRect(0, 3, getWidth(), getHeight() - 3);
        super.paintComponent(grphcs);
    }
}*/
