package standard.file.manager;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        this.setIconImage(new ImageIcon("./Imagenes\\Icono.jpeg").getImage());
        Portadita.setIconImage(new ImageIcon("./Imagenes\\Icono.jpeg").getImage());
        Music = playMusic("./Musica\\SonidoBoton.wav");
        Music.start();
        //Music.loop(Clip.LOOP_CONTINUOUSLY);
        Portadita.pack();
        Portadita.setLocationRelativeTo(null);
        Portadita.setVisible(true);
        CambiarPantallaTiempo CPT2 = new CambiarPantallaTiempo(this, Portadita, 4000);
        CPT2.set(this, Portadita, 4000, 700, 400);
        CPT2.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Portadita = new javax.swing.JFrame();
        I_PortadaFondo = new FondoPanel("./Imagenes\\Portada.jpg");
        I_Icono_Main = new FondoPanel("./Imagenes\\Icono.jpeg");
        B_Archivos = new javax.swing.JButton();
        B_Campos = new javax.swing.JButton();
        B_Registros = new javax.swing.JButton();
        B_Indices = new javax.swing.JButton();
        B_Estandarizacion = new javax.swing.JButton();
        I_Fondo_Main = new javax.swing.JPanel();

        Portadita.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        Portadita.setTitle("Standard File Manager");
        Portadita.setResizable(false);

        javax.swing.GroupLayout I_PortadaFondoLayout = new javax.swing.GroupLayout(I_PortadaFondo);
        I_PortadaFondo.setLayout(I_PortadaFondoLayout);
        I_PortadaFondoLayout.setHorizontalGroup(
            I_PortadaFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        I_PortadaFondoLayout.setVerticalGroup(
            I_PortadaFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PortaditaLayout = new javax.swing.GroupLayout(Portadita.getContentPane());
        Portadita.getContentPane().setLayout(PortaditaLayout);
        PortaditaLayout.setHorizontalGroup(
            PortaditaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(I_PortadaFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PortaditaLayout.setVerticalGroup(
            PortaditaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(I_PortadaFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Standard File Manager");
        setMinimumSize(new java.awt.Dimension(400, 400));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });
        getContentPane().setLayout(null);

        javax.swing.GroupLayout I_Icono_MainLayout = new javax.swing.GroupLayout(I_Icono_Main);
        I_Icono_Main.setLayout(I_Icono_MainLayout);
        I_Icono_MainLayout.setHorizontalGroup(
            I_Icono_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        I_Icono_MainLayout.setVerticalGroup(
            I_Icono_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 199, Short.MAX_VALUE)
        );

        getContentPane().add(I_Icono_Main);
        I_Icono_Main.setBounds(242, 31, 200, 199);

        B_Archivos.setText("Archivos");
        getContentPane().add(B_Archivos);
        B_Archivos.setBounds(77, 268, 109, 25);

        B_Campos.setText("Campos");
        getContentPane().add(B_Campos);
        B_Campos.setBounds(278, 268, 109, 25);

        B_Registros.setText("Registros");
        getContentPane().add(B_Registros);
        B_Registros.setBounds(514, 268, 109, 25);

        B_Indices.setText("Indices");
        getContentPane().add(B_Indices);
        B_Indices.setBounds(153, 335, 112, 25);

        B_Estandarizacion.setText("Estandarizacion");
        getContentPane().add(B_Estandarizacion);
        B_Estandarizacion.setBounds(382, 335, 112, 25);

        I_Fondo_Main.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout I_Fondo_MainLayout = new javax.swing.GroupLayout(I_Fondo_Main);
        I_Fondo_Main.setLayout(I_Fondo_MainLayout);
        I_Fondo_MainLayout.setHorizontalGroup(
            I_Fondo_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        I_Fondo_MainLayout.setVerticalGroup(
            I_Fondo_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(I_Fondo_Main);
        I_Fondo_Main.setBounds(0, 0, 100, 100);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        // Este metodo es para hacer la ventana principal relativa
        int y = this.getHeight();
        int x = this.getWidth();
        //localidad de icono y su tamano
        //se usa esa condicional para setear el tamano de los botones
        Font f;
        if (x > y) {
            I_Icono_Main.setSize((int) (y / 2.2), (int) (y / 2.2));
            f = new Font("Dialog", 0, (int) y / 33);

        } else {
            I_Icono_Main.setSize((int) (x / 2.2), (int) (x / 2.2));
            f = new Font("Dialog", 0, (int) x / 33);
        }
        I_Icono_Main.setLocation((int) ((x / 2) - (I_Icono_Main.getWidth() / 2)), (int) ((y / 3) - (I_Icono_Main.getHeight() / 2)));

        I_Fondo_Main.setSize(x, y);

        //tamano de boton
        B_Archivos.setSize((int) (x / 5), (int) (y / 9));
        B_Campos.setSize((int) (x / 5), (int) (y / 9));
        B_Registros.setSize((int) (x / 5), (int) (y / 9));
        B_Indices.setSize((int) (x / 5), (int) (y / 9));
        B_Estandarizacion.setSize((int) (x / 5), (int) (y / 9));

        //Poniendo los Fonts
        B_Archivos.setFont(f);
        B_Campos.setFont(f);
        B_Registros.setFont(f);
        B_Indices.setFont(f);
        B_Estandarizacion.setFont(f);

        //localidad de Botones
        B_Archivos.setLocation((int) ((x / 6) - (B_Archivos.getWidth() / 2)), (int) ((4 * y / 6) - (B_Archivos.getHeight() / 2)));
        B_Campos.setLocation((int) ((3 * x / 6) - (B_Campos.getWidth() / 2)), (int) ((4 * y / 6) - (B_Campos.getHeight() / 2)));
        B_Registros.setLocation((int) ((5 * x / 6) - (B_Registros.getWidth() / 2)), (int) ((4 * y / 6) - (B_Registros.getHeight() / 2)));
        B_Indices.setLocation((int) ((1 * x / 3) - (B_Indices.getWidth() / 2)), (int) ((5 * y / 6) - (B_Indices.getHeight() / 2)));
        B_Estandarizacion.setLocation((int) ((2 * x / 3) - (B_Estandarizacion.getWidth() / 2)), (int) ((5 * y / 6) - (B_Estandarizacion.getHeight() / 2)));


    }//GEN-LAST:event_formComponentResized

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_Archivos;
    private javax.swing.JButton B_Campos;
    private javax.swing.JButton B_Estandarizacion;
    private javax.swing.JButton B_Indices;
    private javax.swing.JButton B_Registros;
    private javax.swing.JPanel I_Fondo_Main;
    private javax.swing.JPanel I_Icono_Main;
    private javax.swing.JPanel I_PortadaFondo;
    private javax.swing.JFrame Portadita;
    // End of variables declaration//GEN-END:variables

    //Este metodo es para reproducir sonidos en el programa
    public Clip Music;

    public static Clip playMusic(String filepath) {
        try {
            File music = new File(filepath);
            AudioInputStream AudioImput = AudioSystem.getAudioInputStream(music);
            Clip clip = AudioSystem.getClip();
            clip.open(AudioImput);
            return clip;
        } catch (Exception e) {
            System.out.println("El Archivo no Existe");
            e.printStackTrace();
        }
        return null;
    }

    //Esta Clase se utiliza para Poner Imagenes dentro de paneles
    class FondoPanel extends JPanel {

        public FondoPanel(String direccion) {
            this.direccion = direccion;
        }

        private String direccion;
        private Image imagen;

        public void paint(Graphics g) {
            imagen = new ImageIcon(direccion).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }
}
