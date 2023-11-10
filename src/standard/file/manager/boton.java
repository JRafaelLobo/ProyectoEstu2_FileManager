//https://www.youtube.com/watch?v=G7bunrDCXx0
package standard.file.manager;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author rinal
 */
public class boton extends javax.swing.JButton {

    private Color Linea = Color.yellow;
    private Color colorLinea = new Color(0, 0, 255);
    private java.awt.Color Color1 = new java.awt.Color(255, 0, 0);
    private java.awt.Color Color2 = new java.awt.Color(0, 255, 0);
    private float alpha = 1.0f;

    public boton() {
        this.setOpaque(true);
        //this.setContentAreaFilled(false);
        this.setPreferredSize(new Dimension(100, 30));
        this.setFocusPainted(false);
        this.setContentAreaFilled(false);
        this.setFont(new Font("Tahoma", 0, 18));
        this.setForeground(Color.black);
        this.setText("");
        //addMouseListener( new Adaptador());
    }

    @Override
    protected void paintComponent(java.awt.Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(Linea);
        g2.fillRect(0, 0, getWidth(), getHeight());
        GradientPaint gradient = new GradientPaint(0.0F, 0.0F, this.Color1, 0.0F, getHeight(), this.Color2, false);
        g2.setPaint(gradient);
        g2.fillRect(0, 3, getWidth(), getHeight() - 3);
        g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha));
        super.paintComponent(g2);
    }

    public void setAlpha(float alpha) {
        this.alpha = alpha;
        repaint();
    }

    /*public class Adaptador extends MouseAdapter {

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
                    for (float i = .7f; i <= 1f; i += .03f) {
                        setAlpha(i);
                        Linea = Color.yellow;
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
                        Linea = Color.yellow;
                        try {
                            Thread.sleep(1);
                        } catch (Exception e) {
                        }
                    }
                }
            }).start();
        }
    }*/
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