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
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Main extends javax.swing.JFrame {
    //El Archivo tiene nombre,lista de campos(Arraylist),AvailList(LinkedList)
    //Campo: Nombre,Tipo,Tamano
    //Registro: Lista de Campus
    //Indices:
    //Estandarizacion

    public Main() {
        initComponents();
        this.setIconImage(new ImageIcon("./Imagenes\\Icono.jpeg").getImage());
        JF_Archivos.setIconImage(new ImageIcon("./Imagenes\\Icono.jpeg").getImage());
        
        
        Portadita.setIconImage(new ImageIcon("./Imagenes\\Icono.jpeg").getImage());
        Music = playMusic("./Musica\\SonidoBoton.wav");
        Music.start();
        //Music.loop(Clip.LOOP_CONTINUOUSLY);
        Portadita.pack();
        Portadita.setLocationRelativeTo(null);
        Portadita.setVisible(true);
        CambiarPantallaTiempo CPT2 = new CambiarPantallaTiempo(this, Portadita, 4000);
        CPT2.set(this, Portadita, 100, 700, 400);
        CPT2.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Portadita = new javax.swing.JFrame();
        I_PortadaFondo = new FondoPanel("./Imagenes\\Portada.jpg");
        JF_Archivos = new javax.swing.JFrame();
        lb_Archivo_Titulo = new javax.swing.JLabel();
        Datos_Achivos = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        B_CrearArchivo = new javax.swing.JButton();
        B_AbrirArchivo = new javax.swing.JButton();
        B_SalvarArchivo = new javax.swing.JButton();
        B_CerrarArchivo = new javax.swing.JButton();
        B_SalirArchivo = new javax.swing.JButton();
        B_CrearCampo = new javax.swing.JButton();
        B_ListarCampo = new javax.swing.JButton();
        B_ModificarCampo = new javax.swing.JButton();
        B_BorrarCampo = new javax.swing.JButton();
        I_Fondo_Archivos = new javax.swing.JPanel();
        I_Icono_Main = new FondoPanel("./Imagenes\\Icono.jpeg");
        B_Campos = new javax.swing.JButton();
        B_Registros = new javax.swing.JButton();
        B_Indices = new javax.swing.JButton();
        B_Estandarizacion = new javax.swing.JButton();
        B_Archivos = new boton();
        I_Fondo_Main = new javax.swing.JPanel();

        Portadita.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        Portadita.setTitle("Standard File Manager");
        Portadita.setUndecorated(true);
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

        JF_Archivos.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        JF_Archivos.setTitle("Standard File Manager");
        JF_Archivos.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                JF_ArchivosComponentResized(evt);
            }
        });
        JF_Archivos.getContentPane().setLayout(null);

        lb_Archivo_Titulo.setText("Datos Del Archivo");
        JF_Archivos.getContentPane().add(lb_Archivo_Titulo);
        lb_Archivo_Titulo.setBounds(60, 260, 150, 15);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        Datos_Achivos.setViewportView(jList1);

        JF_Archivos.getContentPane().add(Datos_Achivos);
        Datos_Achivos.setBounds(310, 80, 220, 160);

        B_CrearArchivo.setText("Crear Archivo");
        JF_Archivos.getContentPane().add(B_CrearArchivo);
        B_CrearArchivo.setBounds(130, 30, 102, 25);

        B_AbrirArchivo.setText("Abrir Archivo");
        JF_Archivos.getContentPane().add(B_AbrirArchivo);
        B_AbrirArchivo.setBounds(230, 30, 98, 25);

        B_SalvarArchivo.setText("Salvar Archivo");
        JF_Archivos.getContentPane().add(B_SalvarArchivo);
        B_SalvarArchivo.setBounds(330, 30, 104, 25);

        B_CerrarArchivo.setText("Cerrar Archivo");
        JF_Archivos.getContentPane().add(B_CerrarArchivo);
        B_CerrarArchivo.setBounds(430, 30, 106, 25);

        B_SalirArchivo.setText("Salir");
        B_SalirArchivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_SalirArchivoMouseClicked(evt);
            }
        });
        JF_Archivos.getContentPane().add(B_SalirArchivo);
        B_SalirArchivo.setBounds(130, 80, 56, 25);

        B_CrearCampo.setText("Crear");
        JF_Archivos.getContentPane().add(B_CrearCampo);
        B_CrearCampo.setBounds(180, 260, 62, 25);

        B_ListarCampo.setText("Listar");
        JF_Archivos.getContentPane().add(B_ListarCampo);
        B_ListarCampo.setBounds(270, 260, 61, 25);

        B_ModificarCampo.setText("Modificar");
        JF_Archivos.getContentPane().add(B_ModificarCampo);
        B_ModificarCampo.setBounds(370, 260, 79, 25);

        B_BorrarCampo.setText("Borrar");
        JF_Archivos.getContentPane().add(B_BorrarCampo);
        B_BorrarCampo.setBounds(460, 260, 65, 25);

        I_Fondo_Archivos.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout I_Fondo_ArchivosLayout = new javax.swing.GroupLayout(I_Fondo_Archivos);
        I_Fondo_Archivos.setLayout(I_Fondo_ArchivosLayout);
        I_Fondo_ArchivosLayout.setHorizontalGroup(
            I_Fondo_ArchivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        I_Fondo_ArchivosLayout.setVerticalGroup(
            I_Fondo_ArchivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        JF_Archivos.getContentPane().add(I_Fondo_Archivos);
        I_Fondo_Archivos.setBounds(0, 0, 100, 100);

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

        B_Archivos.setText("Archivos");
        B_Archivos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_ArchivosMouseClicked(evt);
            }
        });
        getContentPane().add(B_Archivos);
        B_Archivos.setBounds(100, 270, 110, 25);

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
//        for(int i=0;i<this.getComponentCount();i++){
//            if(this.getComponent(i) instanceof javax.swing.JButton){
//                this.getComponent(i).setFont(f);
//            }
//        }
       B_Archivos.setFont(f);
        //B_Archivos.setForeground(Color.white);
        //B_Archivos_Texto.setLocation(0,0);
        //B_Archivos_Texto.setSize(B_Archivos.getWidth(), B_Archivos.getHeight());
        //B_Archivos_Texto.setHorizontalAlignment(10);
        //B_Archivos_Texto.setLocation((int)(B_Archivos.getWidth()-B_Archivos_Texto.getWidth()/2), (int)(B_Archivos.getHeight()-B_Archivos_Texto.getHeight()/2));
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

    private void B_ArchivosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_ArchivosMouseClicked
        // TODO add your handling code here:
        
        JF_Archivos.pack();
        JF_Archivos.setVisible(true);
        JF_Archivos.setSize(this.getWidth(), this.getHeight());
        JF_Archivos.setLocationRelativeTo(this);
        this.setVisible(false);
    }//GEN-LAST:event_B_ArchivosMouseClicked

    private void JF_ArchivosComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_JF_ArchivosComponentResized
        // TODO add your handling code here:
        
        int x=JF_Archivos.getWidth();
        int y = JF_Archivos.getHeight();
        Font f;
        if (x > y) {
            f = new Font("Dialog", 0, (int) y / 33);

        } else {
            f = new Font("Dialog", 0, (int) x / 33);
        }
//        for(int i=0;i<JF_Archivos.getComponentCount();i++){
//            if(JF_Archivos.getComponent(i) instanceof javax.swing.JButton){
//                JF_Archivos.getComponent(i).setFont(f);
//            }
//        }

        B_CrearArchivo.setFont(f);
        B_AbrirArchivo.setFont(f);
        B_CerrarArchivo.setFont(f);
        B_SalirArchivo.setFont(f);
        B_SalvarArchivo.setFont(f);
        B_CrearCampo.setFont(f);
        B_ModificarCampo.setFont(f);
        B_ListarCampo.setFont(f);
        B_BorrarCampo.setFont(f);
        
        
        I_Fondo_Archivos.setSize(x, y);
        
        
        //Botones de Archivo
        B_CrearArchivo.setSize(2*x/12, 2*y/20);
        B_CrearArchivo.setLocation((int) ((2*x / 12) - (B_CrearArchivo.getWidth() / 2)), (int) ((2*y / 13) - (B_CrearArchivo.getHeight() / 2)));
        B_AbrirArchivo.setSize(2*x/12, 2*y/20);
        B_AbrirArchivo.setLocation((int) ((2*x / 12) - (B_CrearArchivo.getWidth() / 2)), (int) ((4*y / 13) - (B_CrearArchivo.getHeight() / 2)));
        B_CerrarArchivo.setSize(2*x/12, 2*y/20);
        B_CerrarArchivo.setLocation((int) ((2*x / 12) - (B_CrearArchivo.getWidth() / 2)), (int) ((6*y / 13) - (B_CrearArchivo.getHeight() / 2)));
        B_SalvarArchivo.setSize(2*x/12, 2*y/20);
        B_SalvarArchivo.setLocation((int) ((2*x / 12) - (B_CrearArchivo.getWidth() / 2)), (int) ((8*y / 13) - (B_CrearArchivo.getHeight() / 2)));
        B_SalirArchivo.setSize(2*x/12, 2*y/20);
        B_SalirArchivo.setLocation((int) ((2*x / 12) - (B_CrearArchivo.getWidth() / 2)), (int) ((10*y / 13) - (B_CrearArchivo.getHeight() / 2)));
        
        
        //Botones de la lista
        Datos_Achivos.setSize(x/2, y/2);
        Datos_Achivos.setLocation((int) ((2*x / 3) - (Datos_Achivos.getWidth() / 2)), (int) ((5*y / 12) - (Datos_Achivos.getHeight() / 2)));
        lb_Archivo_Titulo.setSize(x/2, y/2);
        lb_Archivo_Titulo.setFont(f);
        lb_Archivo_Titulo.setLocation((int) ((5*x / 6) - (lb_Archivo_Titulo.getWidth() / 2)), (int) ((y / 12) - (lb_Archivo_Titulo.getHeight() / 2)));
        
        //Botones Campo
         B_CrearCampo.setSize(2*x/15, 2*y/20);
         B_ModificarCampo.setSize(2*x/15, 2*y/20);
         B_BorrarCampo.setSize(2*x/15, 2*y/20);
         B_ListarCampo.setSize(2*x/15, 2*y/20);
         B_CrearCampo.setLocation((int) ((5*x / 12) - (B_CrearCampo.getWidth() / 2)), (int) ((10*y / 13) - (B_CrearCampo.getHeight() / 2)));

        
    }//GEN-LAST:event_JF_ArchivosComponentResized

    private void B_SalirArchivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_SalirArchivoMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_B_SalirArchivoMouseClicked

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
    private javax.swing.JButton B_AbrirArchivo;
    private javax.swing.JButton B_Archivos;
    private javax.swing.JButton B_BorrarCampo;
    private javax.swing.JButton B_Campos;
    private javax.swing.JButton B_CerrarArchivo;
    private javax.swing.JButton B_CrearArchivo;
    private javax.swing.JButton B_CrearCampo;
    private javax.swing.JButton B_Estandarizacion;
    private javax.swing.JButton B_Indices;
    private javax.swing.JButton B_ListarCampo;
    private javax.swing.JButton B_ModificarCampo;
    private javax.swing.JButton B_Registros;
    private javax.swing.JButton B_SalirArchivo;
    private javax.swing.JButton B_SalvarArchivo;
    private javax.swing.JScrollPane Datos_Achivos;
    private javax.swing.JPanel I_Fondo_Archivos;
    private javax.swing.JPanel I_Fondo_Main;
    private javax.swing.JPanel I_Icono_Main;
    private javax.swing.JPanel I_PortadaFondo;
    private javax.swing.JFrame JF_Archivos;
    private javax.swing.JFrame Portadita;
    private javax.swing.JList<String> jList1;
    private javax.swing.JLabel lb_Archivo_Titulo;
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
