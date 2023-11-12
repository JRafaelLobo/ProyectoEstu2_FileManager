package standard.file.manager;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.UIDefaults;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        this.setIconImage(new ImageIcon("./Imagenes\\Icono.jpeg").getImage());
        JF_Campos.setIconImage(new ImageIcon("./Imagenes\\Icono.jpeg").getImage());
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
        //05172d
        //FF7048
        //font Moncerath,Bethicai
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Portadita = new javax.swing.JFrame();
        I_PortadaFondo = new FondoPanel("./Imagenes\\Portada_inicial.png");
        JF_Campos = new javax.swing.JFrame();
        lb_Archivo_Titulo = new javax.swing.JLabel();
        Datos_Achivos = new javax.swing.JScrollPane();
        JLista_Campos = new javax.swing.JList<>();
        B_CrearCampo = new boton();
        B_ListarCampo = new boton();
        B_ModificarCampo = new boton();
        B_BorrarCampo = new boton();
        I_Campo_Decoracion = new FondoPanel("./Imagenes\\Icono.jpeg");
        I_Fondo_Archivos = new javax.swing.JPanel();
        Dialog_Abrir = new javax.swing.JDialog(this, "Abrir", true);
        ListOfFiles = new javax.swing.JComboBox<>();
        D_Abrir_Archivo = new javax.swing.JButton();
        JF_CrearCampo = new javax.swing.JFrame();
        PanelCrearCampo = new javax.swing.JPanel();
        JL_Nombre = new javax.swing.JLabel();
        nombreCampo = new javax.swing.JTextField();
        JL_Tipo = new javax.swing.JLabel();
        tipoCampo = new javax.swing.JComboBox<>();
        JL_Longitud = new javax.swing.JLabel();
        longitudCampo = new javax.swing.JTextField();
        BotonGuardarCampo = new javax.swing.JButton();
        BotonRegresar = new javax.swing.JButton();
        TituloCrear = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        JF_ModificarCampo = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        I_Icono_Main = new FondoPanel("./Imagenes\\Icono2.png");
        B_Campos = new boton();
        B_Registros = new boton();
        B_Indices = new boton();
        B_Estandarizacion = new boton();
        I_Fondo_Main = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        B_Archivo_Nuevo = new javax.swing.JMenuItem();
        B_Archivo_Abrir = new javax.swing.JMenuItem();
        B_Archivo_Guardar = new javax.swing.JMenuItem();
        B_Archivo_Cerrar = new javax.swing.JMenuItem();
        B_Archivo_Salir = new javax.swing.JMenuItem();

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

        JF_Campos.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        JF_Campos.setTitle("Standard File Manager");
        JF_Campos.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                JF_CamposComponentResized(evt);
            }
        });
        JF_Campos.getContentPane().setLayout(null);

        lb_Archivo_Titulo.setText("Datos Del Archivo");
        JF_Campos.getContentPane().add(lb_Archivo_Titulo);
        lb_Archivo_Titulo.setBounds(60, 260, 150, 14);

        JLista_Campos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        Datos_Achivos.setViewportView(JLista_Campos);

        JF_Campos.getContentPane().add(Datos_Achivos);
        Datos_Achivos.setBounds(310, 80, 220, 160);

        B_CrearCampo.setText("Crear");
        B_CrearCampo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_CrearCampoMouseClicked(evt);
            }
        });
        B_CrearCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_CrearCampoActionPerformed(evt);
            }
        });
        JF_Campos.getContentPane().add(B_CrearCampo);
        B_CrearCampo.setBounds(180, 260, 59, 23);

        B_ListarCampo.setText("Listar");
        JF_Campos.getContentPane().add(B_ListarCampo);
        B_ListarCampo.setBounds(270, 260, 59, 23);

        B_ModificarCampo.setText("Modificar");
        B_ModificarCampo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_ModificarCampoMouseClicked(evt);
            }
        });
        B_ModificarCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_ModificarCampoActionPerformed(evt);
            }
        });
        JF_Campos.getContentPane().add(B_ModificarCampo);
        B_ModificarCampo.setBounds(370, 260, 75, 23);

        B_BorrarCampo.setText("Borrar");
        JF_Campos.getContentPane().add(B_BorrarCampo);
        B_BorrarCampo.setBounds(460, 260, 63, 23);

        javax.swing.GroupLayout I_Campo_DecoracionLayout = new javax.swing.GroupLayout(I_Campo_Decoracion);
        I_Campo_Decoracion.setLayout(I_Campo_DecoracionLayout);
        I_Campo_DecoracionLayout.setHorizontalGroup(
            I_Campo_DecoracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        I_Campo_DecoracionLayout.setVerticalGroup(
            I_Campo_DecoracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        JF_Campos.getContentPane().add(I_Campo_Decoracion);
        I_Campo_Decoracion.setBounds(130, 130, 70, 60);

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

        JF_Campos.getContentPane().add(I_Fondo_Archivos);
        I_Fondo_Archivos.setBounds(0, 0, 100, 100);

        ListOfFiles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        D_Abrir_Archivo.setText("Abrir Archivo");
        D_Abrir_Archivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D_Abrir_ArchivoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Dialog_AbrirLayout = new javax.swing.GroupLayout(Dialog_Abrir.getContentPane());
        Dialog_Abrir.getContentPane().setLayout(Dialog_AbrirLayout);
        Dialog_AbrirLayout.setHorizontalGroup(
            Dialog_AbrirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Dialog_AbrirLayout.createSequentialGroup()
                .addGroup(Dialog_AbrirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Dialog_AbrirLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(ListOfFiles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Dialog_AbrirLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(D_Abrir_Archivo)))
                .addContainerGap(221, Short.MAX_VALUE))
        );
        Dialog_AbrirLayout.setVerticalGroup(
            Dialog_AbrirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Dialog_AbrirLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(ListOfFiles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(D_Abrir_Archivo)
                .addContainerGap(217, Short.MAX_VALUE))
        );

        JF_CrearCampo.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                JF_CrearCampoComponentResized(evt);
            }
        });

        PanelCrearCampo.setBackground(new java.awt.Color(204, 255, 255));
        PanelCrearCampo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JL_Nombre.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        JL_Nombre.setText("Nombre del Campo:");
        PanelCrearCampo.add(JL_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 119, 108, -1));

        nombreCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreCampoActionPerformed(evt);
            }
        });
        PanelCrearCampo.add(nombreCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 108, 240, 40));

        JL_Tipo.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        JL_Tipo.setText("Tipo de Dato:");
        PanelCrearCampo.add(JL_Tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 202, 81, 42));

        tipoCampo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "String", "Char", "Int", "Double", " " }));
        tipoCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoCampoActionPerformed(evt);
            }
        });
        PanelCrearCampo.add(tipoCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 202, 240, 42));

        JL_Longitud.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        JL_Longitud.setText("Longitud:");
        PanelCrearCampo.add(JL_Longitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 325, 81, -1));
        PanelCrearCampo.add(longitudCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 314, 240, 40));

        BotonGuardarCampo.setBackground(new java.awt.Color(0, 153, 255));
        BotonGuardarCampo.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        BotonGuardarCampo.setForeground(new java.awt.Color(0, 0, 204));
        BotonGuardarCampo.setText("Guardar");
        BotonGuardarCampo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonGuardarCampoMouseClicked(evt);
            }
        });
        PanelCrearCampo.add(BotonGuardarCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 406, 248, 54));

        BotonRegresar.setBackground(new java.awt.Color(0, 153, 255));
        BotonRegresar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        BotonRegresar.setForeground(new java.awt.Color(0, 0, 204));
        BotonRegresar.setText("Regresar");
        PanelCrearCampo.add(BotonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 128, 44));

        TituloCrear.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        TituloCrear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TituloCrear.setText("Crear Campo");
        PanelCrearCampo.add(TituloCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 248, 57));

        jPanel1.setBackground(new java.awt.Color(51, 102, 0));
        jPanel1.setForeground(new java.awt.Color(51, 102, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout JF_CrearCampoLayout = new javax.swing.GroupLayout(JF_CrearCampo.getContentPane());
        JF_CrearCampo.getContentPane().setLayout(JF_CrearCampoLayout);
        JF_CrearCampoLayout.setHorizontalGroup(
            JF_CrearCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelCrearCampo, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE)
        );
        JF_CrearCampoLayout.setVerticalGroup(
            JF_CrearCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JF_CrearCampoLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelCrearCampo, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE))
        );

        JF_ModificarCampo.setBackground(new java.awt.Color(240, 240, 24));

        jPanel2.setBackground(new java.awt.Color(51, 102, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, -1, -1));

        jLabel2.setText("Campo a Modificar:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 48, 648, 430));

        javax.swing.GroupLayout JF_ModificarCampoLayout = new javax.swing.GroupLayout(JF_ModificarCampo.getContentPane());
        JF_ModificarCampo.getContentPane().setLayout(JF_ModificarCampoLayout);
        JF_ModificarCampoLayout.setHorizontalGroup(
            JF_ModificarCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        JF_ModificarCampoLayout.setVerticalGroup(
            JF_ModificarCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JF_ModificarCampoLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

        B_Campos.setText("Campos");
        B_Campos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_CamposMouseClicked(evt);
            }
        });
        getContentPane().add(B_Campos);
        B_Campos.setBounds(278, 268, 109, 23);

        B_Registros.setText("Registros");
        getContentPane().add(B_Registros);
        B_Registros.setBounds(514, 268, 109, 23);

        B_Indices.setText("Indices");
        getContentPane().add(B_Indices);
        B_Indices.setBounds(153, 335, 112, 23);

        B_Estandarizacion.setText("Estandarizacion");
        getContentPane().add(B_Estandarizacion);
        B_Estandarizacion.setBounds(382, 335, 107, 23);

        I_Fondo_Main.setBackground(new java.awt.Color(5, 23, 45));

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

        jMenuBar1.setBackground(new java.awt.Color(19, 73, 60));
        jMenuBar1.setForeground(new java.awt.Color(19, 73, 60));
        jMenuBar1.setFont(new java.awt.Font("Century", 1, 11)); // NOI18N

        jMenu1.setForeground(new java.awt.Color(255, 255, 255));
        jMenu1.setText("Archivos");

        B_Archivo_Nuevo.setText("Nuevo");
        B_Archivo_Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_Archivo_NuevoActionPerformed(evt);
            }
        });
        jMenu1.add(B_Archivo_Nuevo);

        B_Archivo_Abrir.setText("Abrir");
        B_Archivo_Abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_Archivo_AbrirActionPerformed(evt);
            }
        });
        jMenu1.add(B_Archivo_Abrir);

        B_Archivo_Guardar.setText("Guardar");
        B_Archivo_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_Archivo_GuardarActionPerformed(evt);
            }
        });
        jMenu1.add(B_Archivo_Guardar);

        B_Archivo_Cerrar.setText("Cerrar");
        B_Archivo_Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_Archivo_CerrarActionPerformed(evt);
            }
        });
        jMenu1.add(B_Archivo_Cerrar);

        B_Archivo_Salir.setText("Salir");
        B_Archivo_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_Archivo_SalirActionPerformed(evt);
            }
        });
        jMenu1.add(B_Archivo_Salir);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

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
        B_Campos.setLocation((int) ((x / 6) - (B_Campos.getWidth() / 2)), (int) ((4 * y / 6) - (B_Campos.getHeight() / 2)));
        B_Registros.setLocation((int) ((2.3 * x / 6) - (B_Registros.getWidth() / 2)), (int) ((4 * y / 6) - (B_Registros.getHeight() / 2)));
        B_Indices.setLocation((int) ((3.6 * x / 6) - (B_Indices.getWidth() / 2)), (int) ((4 * y / 6) - (B_Indices.getHeight() / 2)));
        B_Estandarizacion.setLocation((int) ((4.9 * x / 6) - (B_Estandarizacion.getWidth() / 2)), (int) ((4 * y / 6) - (B_Estandarizacion.getHeight() / 2)));

        //Desactivando los botones
        B_Campos.setEnabled(false);
        B_Registros.setEnabled(false);
        B_Indices.setEnabled(false);
        B_Estandarizacion.setEnabled(false);
        System.out.println("x=" + x + " , y= " + y);

    }//GEN-LAST:event_formComponentResized

    private void JF_CamposComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_JF_CamposComponentResized
        // TODO add your handling code here:

        int y_decorated = JF_Campos.getInsets().top + JF_Campos.getInsets().bottom;
        int y_JFMenuBar = JF_Campos.getJMenuBar().getHeight();
        int x = JF_Campos.getWidth() - JF_Campos.getInsets().right - JF_Campos.getInsets().left;
        int y = JF_Campos.getHeight() - y_decorated - y_JFMenuBar;
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
//Hola amigo

        B_CrearCampo.setFont(f);
        B_ModificarCampo.setFont(f);
        B_ListarCampo.setFont(f);
        B_BorrarCampo.setFont(f);

        I_Fondo_Archivos.setSize(x, y);

        //Botones de la lista
        Datos_Achivos.setSize(3 * x / 4, y / 2);
        Datos_Achivos.setLocation((int) ((x / 2) - (Datos_Achivos.getWidth() / 2)), (int) ((5 * y / 12) - (Datos_Achivos.getHeight() / 2)));

        //Botones Campo
        B_CrearCampo.setSize(3 * x / 16, 2 * y / 18);
        B_ModificarCampo.setSize(3 * x / 16, 2 * y / 18);
        B_BorrarCampo.setSize(3 * x / 16, 2 * y / 18);
        B_ListarCampo.setSize(3 * x / 16, 2 * y / 18);

        B_CrearCampo.setLocation((int) ((1 * x / 8) - (B_CrearCampo.getWidth() / 2)), (int) ((11 * y / 13) - (B_CrearCampo.getHeight() / 2)));
        B_ModificarCampo.setLocation((int) ((3 * x / 8) - (B_CrearCampo.getWidth() / 2)), (int) ((11 * y / 13) - (B_CrearCampo.getHeight() / 2)));
        B_BorrarCampo.setLocation((int) ((5 * x / 8) - (B_CrearCampo.getWidth() / 2)), (int) ((11 * y / 13) - (B_CrearCampo.getHeight() / 2)));
        B_ListarCampo.setLocation((int) ((7 * x / 8) - (B_CrearCampo.getWidth() / 2)), (int) ((11 * y / 13) - (B_CrearCampo.getHeight() / 2)));

        //titulo
        if (x > y) {
            f = new Font("Dialog", 1, (int) y / 16);

        } else {
            f = new Font("Dialog", 1, (int) x / 16);
        }
        lb_Archivo_Titulo.setFont(f);
        FontMetrics fontMetrics = lb_Archivo_Titulo.getFontMetrics(lb_Archivo_Titulo.getFont());
        int anchoTexto = fontMetrics.stringWidth(lb_Archivo_Titulo.getText());
        lb_Archivo_Titulo.setSize(anchoTexto, y / 2);
        lb_Archivo_Titulo.setLocation((int) ((x / 2) - (lb_Archivo_Titulo.getWidth() / 2)), (int) ((y / 12) - (lb_Archivo_Titulo.getHeight() / 2)));

        //logito de al lado
        I_Campo_Decoracion.setSize(lb_Archivo_Titulo.getHeight() / 4, lb_Archivo_Titulo.getHeight() / 4);
        I_Campo_Decoracion.setLocation((int) ((x / 2) - (I_Campo_Decoracion.getWidth() / 2)) + lb_Archivo_Titulo.getWidth(), (int) ((y / 12) - (I_Campo_Decoracion.getHeight() / 2)));
    }//GEN-LAST:event_JF_CamposComponentResized

    private void B_CamposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_CamposMouseClicked
        // TODO add your handling code here:
        if (!B_Campos.isEnabled()) {
            return;
        }
        this.setVisible(false);
        JF_Campos.setJMenuBar(jMenuBar1);
        JF_Campos.pack();
        JF_Campos.setVisible(true);
        JF_Campos.setSize(this.getWidth(), this.getHeight());
        JF_Campos.setLocationRelativeTo(this);
    }//GEN-LAST:event_B_CamposMouseClicked

    private void B_Archivo_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_Archivo_SalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_B_Archivo_SalirActionPerformed

    private void B_Archivo_NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_Archivo_NuevoActionPerformed
        // TODO add your handling code here:
        String nameOfFile = JOptionPane.showInputDialog(rootPane, "Ingrese el nombre o identidad del archivo ha crear");
        if (nameOfFile == null) {
            return;
        }
        boolean isCreated = files.Nuevo(nameOfFile);
        if (isCreated)
            JOptionPane.showMessageDialog(null, "El archivo se creo con exito", "Notificación", JOptionPane.INFORMATION_MESSAGE);
        else
            JOptionPane.showMessageDialog(null, "Hubo un error el archivo no se pudo crear o el archivo ya existe", "Notificación", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_B_Archivo_NuevoActionPerformed

    private void B_Archivo_AbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_Archivo_AbrirActionPerformed
        // TODO add your handling code here:
        if (!this.isVisible() || !this.OpenFileName.equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor antes de abrir un archivo cierre el actual", "Notificación", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        String[] namesFiles = files.getNameFiles();
        ListOfFiles.setModel(new javax.swing.DefaultComboBoxModel<>(namesFiles));
        Dialog_Abrir.setSize(300, 150);
        Dialog_Abrir.setLocationRelativeTo(null);
        Dialog_Abrir.setResizable(false);
        Dialog_Abrir.setVisible(true);
    }//GEN-LAST:event_B_Archivo_AbrirActionPerformed

    private void D_Abrir_ArchivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D_Abrir_ArchivoMouseClicked
        // TODO add your handling code here:
        OpenFileName = (String) ListOfFiles.getSelectedItem();
        Campos = files.LecturaCampos(OpenFileName);
        if (Campos.equals("Hubo un error al leer campos")) {
            JOptionPane.showMessageDialog(null, "Hubo un error no se pudo leer campos", "Notificación", JOptionPane.ERROR_MESSAGE);
            Campos = "";
            return;
        }
        Dialog_Abrir.setVisible(false);
        //Activando los botones
        B_Campos.setEnabled(true);
        B_Registros.setEnabled(true);
        B_Indices.setEnabled(true);
        B_Estandarizacion.setEnabled(true);
    }//GEN-LAST:event_D_Abrir_ArchivoMouseClicked

    private void B_Archivo_CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_Archivo_CerrarActionPerformed
        // TODO add your handling code here:
        if (OpenFileName.equals("")) {
            JOptionPane.showMessageDialog(null, "No hay ningun archivo abierto para cerrar", "Notificación", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (this.isVisible()) {
            Campos = "";
            OpenFileName = "";
            B_Campos.setEnabled(false);
            B_Registros.setEnabled(false);
            B_Indices.setEnabled(false);
            B_Estandarizacion.setEnabled(false);
            JOptionPane.showMessageDialog(null, "Se ha cerrado el archivo", "Notificación", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        int option = JOptionPane.showOptionDialog(null,
                "Esta seguro de cerrar el archivo",
                "Cerrar el archivo",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                new Object[]{"OK", "Cancel"},
                "OK");
        if (option == JOptionPane.OK_OPTION) {
            OpenFileName = "";
            Campos = "";
            //Desactivando JFrames
            JF_Campos.setVisible(false);

            this.setVisible(true);
            this.setJMenuBar(jMenuBar1);
            //Desactivando
            B_Campos.setEnabled(false);
            B_Registros.setEnabled(false);
            B_Indices.setEnabled(false);
            B_Estandarizacion.setEnabled(false);
        }

    }//GEN-LAST:event_B_Archivo_CerrarActionPerformed

    private void B_Archivo_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_Archivo_GuardarActionPerformed
        // TODO add your handling code here:
        if (OpenFileName.equals("")) {
            JOptionPane.showMessageDialog(null, "No hay ningun archivo abierto para guardar", "Notificación", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (this.isVisible()) {
            JOptionPane.showMessageDialog(null, "No se ha realizado ningun cambio", "Notificación", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        boolean IsSaved = false;

        if (JF_Campos.isVisible()) {
            IsSaved = files.GuardarCampos(OpenFileName, Campos);
        }
        if (IsSaved) {
            JOptionPane.showMessageDialog(null, "El archivo se guardo con exito", "Notificación", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        JOptionPane.showMessageDialog(null, "El archivo no se guardo o no hubo un cambio realizado", "Notificación", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_B_Archivo_GuardarActionPerformed

    private void B_CrearCampoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_CrearCampoMouseClicked
        // TODO add your handling code here:
        if (!B_CrearCampo.isEnabled()) {
            return;
        }
        this.setVisible(false);
        //JF_CrearCampo.setJMenuBar(jMenuBar1);
        JF_CrearCampo.pack();
        JF_CrearCampo.setVisible(true);
        JF_CrearCampo.setSize(this.getWidth(), this.getHeight());
        JF_CrearCampo.setLocationRelativeTo(this);
    }//GEN-LAST:event_B_CrearCampoMouseClicked

    private void B_CrearCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_CrearCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B_CrearCampoActionPerformed

    private void nombreCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreCampoActionPerformed

    private void tipoCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoCampoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tipoCampoActionPerformed

    private void BotonGuardarCampoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonGuardarCampoMouseClicked
        // TODO add your handling code here:
        String nombre = nombreCampo.getText();
        Object tipo = tipoCampo.getSelectedItem();
        int longitud = Integer.parseInt(longitudCampo.getText());
        
        Campo campoNuevo = new Campo(nombre, longitud,tipo);
        //listaCampos.add(campoNuevo);
        nombreCampo.setText("");
        longitudCampo.setText("");
        tipoCampo.setSelectedIndex(0);
        JOptionPane.showMessageDialog(this, "Campo agregado con exito!");
    }//GEN-LAST:event_BotonGuardarCampoMouseClicked

    private void JF_CrearCampoComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_JF_CrearCampoComponentResized
        // TODO add your handling code here:
//        int x = JF_CrearCampo.getWidth();
//        int y = JF_CrearCampo.getHeight();
//        Font f;
//        if (x > y) {
//            f = new Font("Dialog", 0, (int) y / 33);
//
//        } else {
//            f = new Font("Dialog", 0, (int) x / 33);
//        }
//        
//        
//
//        Botones Campo
//        BotonGuardarCampo.setSize(3 * x / 16, 2 * y / 18);
//        BotonRegresar.setSize(3 * x / 16, 2 * y / 18);
//        
//        BotonGuardarCampo.setLocation((int) ((1 * x / 8) - (BotonGuardarCampo.getWidth() / 2)), (int) ((11 * y / 13) - (BotonGuardarCampo.getHeight() / 2)));
//        BotonRegresar.setLocation((int) ((3 * x / 8) - (BotonRegresar.getWidth() / 2)), (int) ((11 * y / 13) - (BotonRegresar.getHeight() / 2)));
//
//        titulo
//        if (x > y) {
//            f = new Font("Dialog", 1, (int) y / 16);
//
//        } else {
//            f = new Font("Dialog", 1, (int) x / 16);
//        }
//        BotonGuardarCampo.setFont(f);
//        BotonRegresar.setFont(f);
//        TituloCrear.setFont(f);
//        FontMetrics fontMetrics = TituloCrear.getFontMetrics(TituloCrear.getFont());
//        int anchoTexto = fontMetrics.stringWidth(TituloCrear.getText());
//        TituloCrear.setSize(anchoTexto, y / 2);
//        TituloCrear.setLocation((int) ((x / 2) - (TituloCrear.getWidth() / 2)), (int) ((y / 12) - (TituloCrear.getHeight() / 2)));
//
//        tamano de boton
//        BotonGuardarCampo.setSize((int) (x / 5), (int) (y / 9));
//        BotonRegresar.setSize((int) (x / 5), (int) (y / 9));
//        
//        localidad de Botones
//        BotonGuardarCampo.setLocation((int) ((x / 6) - (B_Campos.getWidth() / 2)), (int) ((4 * y / 6) - (B_Campos.getHeight() / 2)));
//        BotonRegresar.setLocation((int) ((2.3 * x / 6) - (B_Registros.getWidth() / 2)), (int) ((4 * y / 6) - (B_Registros.getHeight() / 2)));
//        
    }//GEN-LAST:event_JF_CrearCampoComponentResized

    private void B_ModificarCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_ModificarCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B_ModificarCampoActionPerformed

    private void B_ModificarCampoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_ModificarCampoMouseClicked
        // TODO add your handling code here:
        int index = JLista_Campos.getSelectedIndex();
        String modificacion = JOptionPane.showInputDialog(rootPane, "Que desea modificar?\n 1. Nombre\n 2. Tipo\n 3. Longitud");
        
        if (modificacion.equals("Nombre") || Integer.parseInt(modificacion) == 1) {
            String nombreNuevo = JOptionPane.showInputDialog(rootPane, "Ingrese el nuevo nombre: ");
            //Codigo para Modificar
            
            boolean modificado = true;
            if (modificado == true) {
                JOptionPane.showMessageDialog(null, "El campo se modifico con exito", "Notificación", JOptionPane.INFORMATION_MESSAGE);
            } else {
            JOptionPane.showMessageDialog(null, "Error! El nombre del campo no se pudo modificar", "Notificación", JOptionPane.ERROR_MESSAGE);
            }
        } 
        
        if (modificacion.equals("Tipo") || Integer.parseInt(modificacion) == 2) {
            String tipoNuevo = JOptionPane.showInputDialog(rootPane, "Ingrese el nuevo Tipo: ");
            //Codigo para Modificar
            boolean modificado = true;
            if (modificado == true) {
                JOptionPane.showMessageDialog(null, "El campo se modifico con exito", "Notificación", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Error! El tipo del campo no se pudo modificar", "Notificación", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        if (modificacion.equals("Longitud") || Integer.parseInt(modificacion) == 3) {
            String longitudNueva = JOptionPane.showInputDialog(rootPane, "Ingrese la nueva Longitud: ");
            //Codigo para Modificar
            boolean modificado = true;
            if (modificado == true) {
                JOptionPane.showMessageDialog(null, "El campo se modifico con exito", "Notificación", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Error! La longitud del campo no se pudo modificar", "Notificación", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_B_ModificarCampoMouseClicked

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
    private javax.swing.JMenuItem B_Archivo_Abrir;
    private javax.swing.JMenuItem B_Archivo_Cerrar;
    private javax.swing.JMenuItem B_Archivo_Guardar;
    private javax.swing.JMenuItem B_Archivo_Nuevo;
    private javax.swing.JMenuItem B_Archivo_Salir;
    private javax.swing.JButton B_BorrarCampo;
    private javax.swing.JButton B_Campos;
    private javax.swing.JButton B_CrearCampo;
    private javax.swing.JButton B_Estandarizacion;
    private javax.swing.JButton B_Indices;
    private javax.swing.JButton B_ListarCampo;
    private javax.swing.JButton B_ModificarCampo;
    private javax.swing.JButton B_Registros;
    private javax.swing.JButton BotonGuardarCampo;
    private javax.swing.JButton BotonRegresar;
    private javax.swing.JButton D_Abrir_Archivo;
    private javax.swing.JScrollPane Datos_Achivos;
    private javax.swing.JDialog Dialog_Abrir;
    private javax.swing.JPanel I_Campo_Decoracion;
    private javax.swing.JPanel I_Fondo_Archivos;
    private javax.swing.JPanel I_Fondo_Main;
    private javax.swing.JPanel I_Icono_Main;
    private javax.swing.JPanel I_PortadaFondo;
    private javax.swing.JFrame JF_Campos;
    private javax.swing.JFrame JF_CrearCampo;
    private javax.swing.JFrame JF_ModificarCampo;
    private javax.swing.JLabel JL_Longitud;
    private javax.swing.JLabel JL_Nombre;
    private javax.swing.JLabel JL_Tipo;
    private javax.swing.JList<String> JLista_Campos;
    private javax.swing.JComboBox<String> ListOfFiles;
    private javax.swing.JPanel PanelCrearCampo;
    private javax.swing.JFrame Portadita;
    private javax.swing.JLabel TituloCrear;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lb_Archivo_Titulo;
    private javax.swing.JTextField longitudCampo;
    private javax.swing.JTextField nombreCampo;
    private javax.swing.JComboBox<String> tipoCampo;
    // End of variables declaration//GEN-END:variables
//variables personales

    private String OpenFileName = "";
    private Archivos files = new Archivos();
    private String Campos = "";
    public ArrayList<Campo> listaCampos;
    private Clip Music;
    public Campo campo;
    //El Archivo tiene nombre,lista de campos(Arraylist),AvailList(LinkedList)
    //Campo: Nombre,Tipo,Tamano
    //Registro: Lista de Campus
    //Indices:
    //Estandarizacion

    //Este metodo es para reproducir sonidos en el programa
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
