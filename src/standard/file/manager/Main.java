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
import java.util.Collection;
import javax.swing.DefaultListModel;

import javax.swing.JDialog;
import javax.swing.UIDefaults;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.tree.DefaultMutableTreeNode;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        this.setIconImage(new ImageIcon("./Imagenes\\Icono.jpeg").getImage());
        JF_Campos.setIconImage(new ImageIcon("./Imagenes\\Icono.jpeg").getImage());
        JF_CrearCampo.setIconImage(new ImageIcon("./Imagenes\\Icono.jpeg").getImage());
        Portadita.setIconImage(new ImageIcon("./Imagenes\\Icono.jpeg").getImage());
        Dialog_Introducir.setIconImage(new ImageIcon("./Imagenes\\Icono.jpeg").getImage());
        Dialog_Modificar.setIconImage(new ImageIcon("./Imagenes\\Icono.jpeg").getImage());
        Dialog_Buscar.setIconImage(new ImageIcon("./Imagenes\\Icono.jpeg").getImage());
        Dialog_Listar.setIconImage(new ImageIcon("./Imagenes\\Icono.jpeg").getImage());
        Dialog_Borrar.setIconImage(new ImageIcon("./Imagenes\\Icono.jpeg").getImage());
        Dialog_Cruzar.setIconImage(new ImageIcon("./Imagenes\\Icono.jpeg").getImage());

        Music = playMusic("./Musica\\SonidoBoton.wav");
        Music.start();
        //Music.loop(Clip.LOOP_CONTINUOUSLY);
        Portadita.pack();
        Portadita.setLocationRelativeTo(null);
        Portadita.setVisible(true);
        CambiarPantallaTiempo CPT2 = new CambiarPantallaTiempo(this, Portadita, 4000);
        CPT2.set(this, Portadita, 4000, 700, 400);
        CPT2.start();
        //Desactivando los botones
        B_Campos.setEnabled(false);
        B_Registros.setEnabled(false);
        B_Indices.setEnabled(false);
        B_Estandarizacion.setEnabled(false);
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
        Tabla_Camps = new javax.swing.JScrollPane();
        Datos_Campos = new javax.swing.JTable();
        lb_Archivo_Titulo = new javax.swing.JLabel();
        B_CrearCampo = new boton();
        B_ListarCampo = new boton();
        B_ModificarCampo = new boton();
        B_BorrarCampo = new boton();
        I_Campo_Decoracion = new FondoPanel("./Imagenes\\Icono2.png");
        I_Fondo_Archivos = new javax.swing.JPanel();
        JF_CrearCampo = new javax.swing.JFrame();
        P_CrearCapo_Decoracion = new javax.swing.JPanel();
        PanelCrearCampo = new javax.swing.JPanel();
        nombreCampo = new javax.swing.JTextField();
        longitudCampo = new javax.swing.JTextField();
        B_RegresarCrearCampo = new boton();
        B_GuardadCrearCampo = new boton();
        TituloCrear = new javax.swing.JLabel();
        JL_Longitud = new javax.swing.JLabel();
        tipoCampo = new javax.swing.JComboBox<>();
        JL_Nombre = new javax.swing.JLabel();
        JL_Tipo = new javax.swing.JLabel();
        JF_Registros = new javax.swing.JFrame();
        Tabla_Registro = new javax.swing.JScrollPane();
        Datos_Registro = new javax.swing.JTable();
        lb_Registro_Titulo = new javax.swing.JLabel();
        B_CruzarRegistro = new boton();
        B_ModificarRegistro = new boton();
        B_BuscarRegistro = new boton();
        B_BorrarRegistro = new boton();
        B_IntroducirRegistro = new boton();
        B_ListarRegistro = new boton();
        I_Registro_Decoracion = new FondoPanel("./Imagenes\\Icono2.png");
        I_Fondo_Registro = new javax.swing.JPanel();
        Menu_Regresar = new javax.swing.JMenuBar();
        Jmenu_Regresar = new javax.swing.JMenu();
        Dialog_Introducir = new javax.swing.JDialog();
        Panel_Decoracion_Introducir = new javax.swing.JPanel();
        Titulo_Introducir = new javax.swing.JLabel();
        Panel_Introducir = new javax.swing.JPanel();
        Regresar_Introducir = new javax.swing.JButton();
        TF_NuevoRegistro = new javax.swing.JTextField();
        J_OrdenCampoInt = new javax.swing.JLabel();
        Titulo_InstruccionIntroducir = new javax.swing.JLabel();
        B_Anterior = new javax.swing.JButton();
        B_Siguiente = new javax.swing.JButton();
        B_GuardarRegistro = new javax.swing.JButton();
        Dialog_Modificar = new javax.swing.JDialog();
        Panel_Decoracion_Modificar = new javax.swing.JPanel();
        Titulo_Modificar = new javax.swing.JLabel();
        Panel_Modificar = new javax.swing.JPanel();
        Regresar_Modificar = new javax.swing.JButton();
        TF_Modificacion = new javax.swing.JTextField();
        J_RegistroAnterior = new javax.swing.JLabel();
        Titulo_Instruccion = new javax.swing.JLabel();
        J_OrdenCampos = new javax.swing.JLabel();
        Titulo_RegistroAnt = new javax.swing.JLabel();
        B_AnteriorModif = new javax.swing.JButton();
        B_SiguienteModif = new javax.swing.JButton();
        B_GuardarModif = new javax.swing.JButton();
        Dialog_Buscar = new javax.swing.JDialog();
        Panel_Decoracion_Buscar = new javax.swing.JPanel();
        Titulo_Buscar = new javax.swing.JLabel();
        Panel_Buscar = new javax.swing.JPanel();
        Regresar_Buscar = new javax.swing.JButton();
        Instruccion7 = new javax.swing.JLabel();
        Instruccion8 = new javax.swing.JLabel();
        Dialog_Listar = new javax.swing.JDialog();
        Panel_Decoracion_Listar = new javax.swing.JPanel();
        Titulo_Listar = new javax.swing.JLabel();
        Panel_Listar = new javax.swing.JPanel();
        Regresar_Listar = new javax.swing.JButton();
        Instruccion9 = new javax.swing.JLabel();
        Instruccion10 = new javax.swing.JLabel();
        Dialog_Borrar = new javax.swing.JDialog();
        Panel_Decoracion_Borrar = new javax.swing.JPanel();
        Titulo_Borrar = new javax.swing.JLabel();
        Panel_Borrar = new javax.swing.JPanel();
        Regresar_Borrar = new javax.swing.JButton();
        Dialog_Cruzar = new javax.swing.JDialog();
        Panel_Decoracion_Cruzar = new javax.swing.JPanel();
        Titulo_Cruzar = new javax.swing.JLabel();
        Panel_Cruzar = new javax.swing.JPanel();
        Regresar_Cruzar = new javax.swing.JButton();
        Instruccion11 = new javax.swing.JLabel();
        Instruccion12 = new javax.swing.JLabel();
        Instruccion13 = new javax.swing.JLabel();
        B_DesplegarCamposRelacionados = new javax.swing.JButton();
        B_EnviarCamposTercerArchivo = new javax.swing.JButton();
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

        Datos_Campos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Tipo", "Tamano", "Es llave"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabla_Camps.setViewportView(Datos_Campos);

        JF_Campos.getContentPane().add(Tabla_Camps);
        Tabla_Camps.setBounds(210, 30, 260, 200);

        lb_Archivo_Titulo.setText("Datos Del Archivo");
        JF_Campos.getContentPane().add(lb_Archivo_Titulo);
        lb_Archivo_Titulo.setBounds(60, 260, 150, 16);

        B_CrearCampo.setText("Crear");
        B_CrearCampo.setBorderPainted(false);
        B_CrearCampo.setFocusPainted(false);
        B_CrearCampo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_CrearCampoMouseClicked(evt);
            }
        });
        JF_Campos.getContentPane().add(B_CrearCampo);
        B_CrearCampo.setBounds(180, 260, 72, 23);

        B_ListarCampo.setText("Listar");
        B_ListarCampo.setBorderPainted(false);
        B_ListarCampo.setFocusPainted(false);
        B_ListarCampo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_ListarCampoMouseClicked(evt);
            }
        });
        JF_Campos.getContentPane().add(B_ListarCampo);
        B_ListarCampo.setBounds(270, 260, 72, 23);

        B_ModificarCampo.setText("Modificar");
        B_ModificarCampo.setBorderPainted(false);
        B_ModificarCampo.setFocusPainted(false);
        B_ModificarCampo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_ModificarCampoMouseClicked(evt);
            }
        });
        JF_Campos.getContentPane().add(B_ModificarCampo);
        B_ModificarCampo.setBounds(370, 260, 81, 23);

        B_BorrarCampo.setText("Borrar");
        B_BorrarCampo.setBorderPainted(false);
        B_BorrarCampo.setFocusPainted(false);
        B_BorrarCampo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_BorrarCampoMouseClicked(evt);
            }
        });
        JF_Campos.getContentPane().add(B_BorrarCampo);
        B_BorrarCampo.setBounds(460, 260, 72, 23);

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

        I_Fondo_Archivos.setBackground(new java.awt.Color(5, 23, 45));

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
        I_Fondo_Archivos.setBounds(0, 0, 0, 0);

        JF_CrearCampo.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        JF_CrearCampo.setTitle("Standard File Manager");
        JF_CrearCampo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JF_CrearCampo.setUndecorated(true);
        JF_CrearCampo.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                JF_CrearCampoComponentResized(evt);
            }
        });
        JF_CrearCampo.getContentPane().setLayout(null);

        P_CrearCapo_Decoracion.setBackground(new java.awt.Color(19, 73, 60));
        P_CrearCapo_Decoracion.setForeground(new java.awt.Color(51, 102, 0));

        javax.swing.GroupLayout P_CrearCapo_DecoracionLayout = new javax.swing.GroupLayout(P_CrearCapo_Decoracion);
        P_CrearCapo_Decoracion.setLayout(P_CrearCapo_DecoracionLayout);
        P_CrearCapo_DecoracionLayout.setHorizontalGroup(
            P_CrearCapo_DecoracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );
        P_CrearCapo_DecoracionLayout.setVerticalGroup(
            P_CrearCapo_DecoracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        JF_CrearCampo.getContentPane().add(P_CrearCapo_Decoracion);
        P_CrearCapo_Decoracion.setBounds(0, 0, 740, 40);

        PanelCrearCampo.setBackground(new java.awt.Color(5, 23, 45));
        PanelCrearCampo.setLayout(null);

        nombreCampo.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 16)); // NOI18N
        nombreCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreCampoActionPerformed(evt);
            }
        });
        PanelCrearCampo.add(nombreCampo);
        nombreCampo.setBounds(230, 100, 280, 30);

        longitudCampo.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 16)); // NOI18N
        PanelCrearCampo.add(longitudCampo);
        longitudCampo.setBounds(230, 230, 280, 30);

        B_RegresarCrearCampo.setBackground(new java.awt.Color(255, 51, 51));
        B_RegresarCrearCampo.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        B_RegresarCrearCampo.setForeground(new java.awt.Color(255, 255, 255));
        B_RegresarCrearCampo.setText("Regresar");
        B_RegresarCrearCampo.setBorderPainted(false);
        B_RegresarCrearCampo.setFocusPainted(false);
        B_RegresarCrearCampo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_RegresarCrearCampoMouseClicked(evt);
            }
        });
        PanelCrearCampo.add(B_RegresarCrearCampo);
        B_RegresarCrearCampo.setBounds(230, 320, 120, 50);

        B_GuardadCrearCampo.setBackground(new java.awt.Color(0, 153, 255));
        B_GuardadCrearCampo.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        B_GuardadCrearCampo.setForeground(new java.awt.Color(255, 255, 255));
        B_GuardadCrearCampo.setText("Guardar");
        B_GuardadCrearCampo.setBorderPainted(false);
        B_GuardadCrearCampo.setFocusPainted(false);
        B_GuardadCrearCampo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_GuardadCrearCampoMouseClicked(evt);
            }
        });
        PanelCrearCampo.add(B_GuardadCrearCampo);
        B_GuardadCrearCampo.setBounds(400, 320, 110, 50);

        TituloCrear.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 28)); // NOI18N
        TituloCrear.setForeground(new java.awt.Color(255, 255, 255));
        TituloCrear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TituloCrear.setText("Crear Campo");
        PanelCrearCampo.add(TituloCrear);
        TituloCrear.setBounds(270, 20, 200, 30);

        JL_Longitud.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        JL_Longitud.setForeground(new java.awt.Color(255, 255, 255));
        JL_Longitud.setText("Longitud:");
        PanelCrearCampo.add(JL_Longitud);
        JL_Longitud.setBounds(90, 240, 90, 30);

        tipoCampo.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 16)); // NOI18N
        tipoCampo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "int", "double", "char" }));
        PanelCrearCampo.add(tipoCampo);
        tipoCampo.setBounds(230, 160, 280, 30);

        JL_Nombre.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        JL_Nombre.setForeground(new java.awt.Color(255, 255, 255));
        JL_Nombre.setText("Nombre del Campo:");
        PanelCrearCampo.add(JL_Nombre);
        JL_Nombre.setBounds(60, 100, 140, 20);

        JL_Tipo.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        JL_Tipo.setForeground(new java.awt.Color(255, 255, 255));
        JL_Tipo.setText("Tipo de Dato:");
        PanelCrearCampo.add(JL_Tipo);
        JL_Tipo.setBounds(80, 160, 100, 20);

        JF_CrearCampo.getContentPane().add(PanelCrearCampo);
        PanelCrearCampo.setBounds(0, 40, 740, 450);

        JF_Registros.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        JF_Registros.setTitle("Standard File Manager");
        JF_Registros.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                JF_RegistrosComponentResized(evt);
            }
        });
        JF_Registros.getContentPane().setLayout(null);

        Datos_Registro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Tipo", "Tamano", "Es llave"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabla_Registro.setViewportView(Datos_Registro);

        JF_Registros.getContentPane().add(Tabla_Registro);
        Tabla_Registro.setBounds(210, 30, 260, 200);

        lb_Registro_Titulo.setText("Datos Del Archivo");
        JF_Registros.getContentPane().add(lb_Registro_Titulo);
        lb_Registro_Titulo.setBounds(60, 260, 150, 16);

        B_CruzarRegistro.setText("Cruzar");
        B_CruzarRegistro.setBorderPainted(false);
        B_CruzarRegistro.setFocusPainted(false);
        B_CruzarRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_CruzarRegistroMouseClicked(evt);
            }
        });
        JF_Registros.getContentPane().add(B_CruzarRegistro);
        B_CruzarRegistro.setBounds(270, 290, 72, 23);

        B_ModificarRegistro.setText("Modificar");
        B_ModificarRegistro.setBorderPainted(false);
        B_ModificarRegistro.setFocusPainted(false);
        B_ModificarRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_ModificarRegistroMouseClicked(evt);
            }
        });
        JF_Registros.getContentPane().add(B_ModificarRegistro);
        B_ModificarRegistro.setBounds(370, 260, 81, 23);

        B_BuscarRegistro.setText("Buscar");
        B_BuscarRegistro.setBorderPainted(false);
        B_BuscarRegistro.setFocusPainted(false);
        B_BuscarRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_BuscarRegistroMouseClicked(evt);
            }
        });
        JF_Registros.getContentPane().add(B_BuscarRegistro);
        B_BuscarRegistro.setBounds(370, 290, 72, 23);

        B_BorrarRegistro.setText("Borrar");
        B_BorrarRegistro.setBorderPainted(false);
        B_BorrarRegistro.setFocusPainted(false);
        B_BorrarRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_BorrarRegistroMouseClicked(evt);
            }
        });
        JF_Registros.getContentPane().add(B_BorrarRegistro);
        B_BorrarRegistro.setBounds(460, 260, 72, 23);

        B_IntroducirRegistro.setText("Introducir");
        B_IntroducirRegistro.setBorderPainted(false);
        B_IntroducirRegistro.setFocusPainted(false);
        B_IntroducirRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_IntroducirRegistroMouseClicked(evt);
            }
        });
        JF_Registros.getContentPane().add(B_IntroducirRegistro);
        B_IntroducirRegistro.setBounds(170, 260, 81, 23);

        B_ListarRegistro.setText("Listar");
        B_ListarRegistro.setBorderPainted(false);
        B_ListarRegistro.setFocusPainted(false);
        B_ListarRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_ListarRegistroMouseClicked(evt);
            }
        });
        B_ListarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_ListarRegistroActionPerformed(evt);
            }
        });
        JF_Registros.getContentPane().add(B_ListarRegistro);
        B_ListarRegistro.setBounds(270, 260, 72, 23);

        javax.swing.GroupLayout I_Registro_DecoracionLayout = new javax.swing.GroupLayout(I_Registro_Decoracion);
        I_Registro_Decoracion.setLayout(I_Registro_DecoracionLayout);
        I_Registro_DecoracionLayout.setHorizontalGroup(
            I_Registro_DecoracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        I_Registro_DecoracionLayout.setVerticalGroup(
            I_Registro_DecoracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        JF_Registros.getContentPane().add(I_Registro_Decoracion);
        I_Registro_Decoracion.setBounds(130, 130, 70, 60);

        I_Fondo_Registro.setBackground(new java.awt.Color(5, 23, 45));

        javax.swing.GroupLayout I_Fondo_RegistroLayout = new javax.swing.GroupLayout(I_Fondo_Registro);
        I_Fondo_Registro.setLayout(I_Fondo_RegistroLayout);
        I_Fondo_RegistroLayout.setHorizontalGroup(
            I_Fondo_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        I_Fondo_RegistroLayout.setVerticalGroup(
            I_Fondo_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        JF_Registros.getContentPane().add(I_Fondo_Registro);
        I_Fondo_Registro.setBounds(0, 0, 0, 0);

        Jmenu_Regresar.setText("Regresar");
        Jmenu_Regresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Jmenu_RegresarMouseClicked(evt);
            }
        });
        Menu_Regresar.add(Jmenu_Regresar);

        JF_Registros.setJMenuBar(Menu_Regresar);

        Dialog_Introducir.getContentPane().setLayout(null);

        Panel_Decoracion_Introducir.setBackground(new java.awt.Color(19, 73, 60));
        Panel_Decoracion_Introducir.setForeground(new java.awt.Color(51, 102, 0));

        Titulo_Introducir.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 28)); // NOI18N
        Titulo_Introducir.setForeground(new java.awt.Color(255, 255, 255));
        Titulo_Introducir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo_Introducir.setText("Introducir Registro");

        javax.swing.GroupLayout Panel_Decoracion_IntroducirLayout = new javax.swing.GroupLayout(Panel_Decoracion_Introducir);
        Panel_Decoracion_Introducir.setLayout(Panel_Decoracion_IntroducirLayout);
        Panel_Decoracion_IntroducirLayout.setHorizontalGroup(
            Panel_Decoracion_IntroducirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_Decoracion_IntroducirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo_Introducir, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                .addContainerGap())
        );
        Panel_Decoracion_IntroducirLayout.setVerticalGroup(
            Panel_Decoracion_IntroducirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_Decoracion_IntroducirLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(Titulo_Introducir)
                .addContainerGap())
        );

        Dialog_Introducir.getContentPane().add(Panel_Decoracion_Introducir);
        Panel_Decoracion_Introducir.setBounds(0, 0, 600, 0);

        Panel_Introducir.setBackground(new java.awt.Color(5, 23, 45));

        Regresar_Introducir.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Regresar_Introducir.setText("Regresar");
        Regresar_Introducir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Regresar_IntroducirMouseClicked(evt);
            }
        });

        TF_NuevoRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_NuevoRegistroActionPerformed(evt);
            }
        });

        J_OrdenCampoInt.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        J_OrdenCampoInt.setForeground(new java.awt.Color(255, 255, 255));
        J_OrdenCampoInt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Titulo_InstruccionIntroducir.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        Titulo_InstruccionIntroducir.setForeground(new java.awt.Color(255, 255, 255));
        Titulo_InstruccionIntroducir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo_InstruccionIntroducir.setText("Ingrese el nuevo registro en el siguiente orden:");

        B_Anterior.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        B_Anterior.setText("Anterior");
        B_Anterior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_AnteriorMouseClicked(evt);
            }
        });

        B_Siguiente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        B_Siguiente.setText("Siguiente");
        B_Siguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_SiguienteMouseClicked(evt);
            }
        });

        B_GuardarRegistro.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        B_GuardarRegistro.setText("Guardar");
        B_GuardarRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_GuardarRegistroMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Panel_IntroducirLayout = new javax.swing.GroupLayout(Panel_Introducir);
        Panel_Introducir.setLayout(Panel_IntroducirLayout);
        Panel_IntroducirLayout.setHorizontalGroup(
            Panel_IntroducirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Titulo_InstruccionIntroducir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(J_OrdenCampoInt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Panel_IntroducirLayout.createSequentialGroup()
                .addGroup(Panel_IntroducirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_IntroducirLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Regresar_Introducir))
                    .addGroup(Panel_IntroducirLayout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(Panel_IntroducirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TF_NuevoRegistro)
                            .addGroup(Panel_IntroducirLayout.createSequentialGroup()
                                .addComponent(B_Anterior)
                                .addGap(180, 180, 180)
                                .addComponent(B_Siguiente))))
                    .addGroup(Panel_IntroducirLayout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(B_GuardarRegistro)))
                .addContainerGap(134, Short.MAX_VALUE))
        );
        Panel_IntroducirLayout.setVerticalGroup(
            Panel_IntroducirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_IntroducirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Regresar_Introducir)
                .addGap(40, 40, 40)
                .addComponent(Titulo_InstruccionIntroducir)
                .addGap(37, 37, 37)
                .addComponent(J_OrdenCampoInt)
                .addGap(44, 44, 44)
                .addComponent(TF_NuevoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(B_GuardarRegistro)
                .addGap(18, 18, 18)
                .addGroup(Panel_IntroducirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B_Anterior)
                    .addComponent(B_Siguiente))
                .addGap(69, 69, 69))
        );

        Dialog_Introducir.getContentPane().add(Panel_Introducir);
        Panel_Introducir.setBounds(0, 50, 600, 400);

        Dialog_Modificar.getContentPane().setLayout(null);

        Panel_Decoracion_Modificar.setBackground(new java.awt.Color(19, 73, 60));
        Panel_Decoracion_Modificar.setForeground(new java.awt.Color(51, 102, 0));

        Titulo_Modificar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 28)); // NOI18N
        Titulo_Modificar.setForeground(new java.awt.Color(255, 255, 255));
        Titulo_Modificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo_Modificar.setText("Modificar Registro");

        javax.swing.GroupLayout Panel_Decoracion_ModificarLayout = new javax.swing.GroupLayout(Panel_Decoracion_Modificar);
        Panel_Decoracion_Modificar.setLayout(Panel_Decoracion_ModificarLayout);
        Panel_Decoracion_ModificarLayout.setHorizontalGroup(
            Panel_Decoracion_ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(Panel_Decoracion_ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel_Decoracion_ModificarLayout.createSequentialGroup()
                    .addGap(0, 202, Short.MAX_VALUE)
                    .addComponent(Titulo_Modificar)
                    .addGap(0, 202, Short.MAX_VALUE)))
        );
        Panel_Decoracion_ModificarLayout.setVerticalGroup(
            Panel_Decoracion_ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(Panel_Decoracion_ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel_Decoracion_ModificarLayout.createSequentialGroup()
                    .addGap(0, 9, Short.MAX_VALUE)
                    .addComponent(Titulo_Modificar)
                    .addGap(0, 10, Short.MAX_VALUE)))
        );

        Dialog_Modificar.getContentPane().add(Panel_Decoracion_Modificar);
        Panel_Decoracion_Modificar.setBounds(0, 0, 600, 50);

        Panel_Modificar.setBackground(new java.awt.Color(5, 23, 45));

        Regresar_Modificar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Regresar_Modificar.setText("Regresar");
        Regresar_Modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Regresar_ModificarMouseClicked(evt);
            }
        });

        TF_Modificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_ModificacionActionPerformed(evt);
            }
        });

        J_RegistroAnterior.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        J_RegistroAnterior.setForeground(new java.awt.Color(255, 255, 255));
        J_RegistroAnterior.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        J_RegistroAnterior.setText(" Mostrar registro anterior*");

        Titulo_Instruccion.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        Titulo_Instruccion.setForeground(new java.awt.Color(255, 255, 255));
        Titulo_Instruccion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo_Instruccion.setText("Ingrese el registro modificado en el siguiente orden:");

        J_OrdenCampos.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        J_OrdenCampos.setForeground(new java.awt.Color(255, 255, 255));
        J_OrdenCampos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        J_OrdenCampos.setText("Mostrar orden de campos*");

        Titulo_RegistroAnt.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        Titulo_RegistroAnt.setForeground(new java.awt.Color(255, 255, 255));
        Titulo_RegistroAnt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo_RegistroAnt.setText("Registro anterior:");

        B_AnteriorModif.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        B_AnteriorModif.setText("Anterior");
        B_AnteriorModif.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_AnteriorModifMouseClicked(evt);
            }
        });

        B_SiguienteModif.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        B_SiguienteModif.setText("Siguiente");
        B_SiguienteModif.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_SiguienteModifMouseClicked(evt);
            }
        });

        B_GuardarModif.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        B_GuardarModif.setText("Guardar");
        B_GuardarModif.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_GuardarModifMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Panel_ModificarLayout = new javax.swing.GroupLayout(Panel_Modificar);
        Panel_Modificar.setLayout(Panel_ModificarLayout);
        Panel_ModificarLayout.setHorizontalGroup(
            Panel_ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(J_OrdenCampos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Titulo_RegistroAnt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(J_RegistroAnterior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Titulo_Instruccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Panel_ModificarLayout.createSequentialGroup()
                .addGroup(Panel_ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_ModificarLayout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addGroup(Panel_ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TF_Modificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Panel_ModificarLayout.createSequentialGroup()
                                .addComponent(B_AnteriorModif)
                                .addGap(50, 50, 50)
                                .addComponent(B_GuardarModif)
                                .addGap(41, 41, 41)
                                .addComponent(B_SiguienteModif))))
                    .addGroup(Panel_ModificarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Regresar_Modificar)))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        Panel_ModificarLayout.setVerticalGroup(
            Panel_ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_ModificarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Regresar_Modificar)
                .addGroup(Panel_ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_ModificarLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(Titulo_RegistroAnt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(J_RegistroAnterior)
                        .addGap(33, 33, 33)
                        .addComponent(Titulo_Instruccion)
                        .addGap(18, 18, 18)
                        .addComponent(J_OrdenCampos)
                        .addGap(27, 27, 27)
                        .addComponent(TF_Modificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addGroup(Panel_ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(B_AnteriorModif)
                            .addComponent(B_SiguienteModif))
                        .addContainerGap(71, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_ModificarLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(B_GuardarModif)
                        .addGap(95, 95, 95))))
        );

        Dialog_Modificar.getContentPane().add(Panel_Modificar);
        Panel_Modificar.setBounds(0, 50, 600, 400);

        Dialog_Buscar.getContentPane().setLayout(null);

        Panel_Decoracion_Buscar.setBackground(new java.awt.Color(19, 73, 60));
        Panel_Decoracion_Buscar.setForeground(new java.awt.Color(51, 102, 0));

        Titulo_Buscar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 28)); // NOI18N
        Titulo_Buscar.setForeground(new java.awt.Color(255, 255, 255));
        Titulo_Buscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo_Buscar.setText("Buscar Registro");

        javax.swing.GroupLayout Panel_Decoracion_BuscarLayout = new javax.swing.GroupLayout(Panel_Decoracion_Buscar);
        Panel_Decoracion_Buscar.setLayout(Panel_Decoracion_BuscarLayout);
        Panel_Decoracion_BuscarLayout.setHorizontalGroup(
            Panel_Decoracion_BuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(Panel_Decoracion_BuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Titulo_Buscar, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE))
        );
        Panel_Decoracion_BuscarLayout.setVerticalGroup(
            Panel_Decoracion_BuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(Panel_Decoracion_BuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_Decoracion_BuscarLayout.createSequentialGroup()
                    .addContainerGap(9, Short.MAX_VALUE)
                    .addComponent(Titulo_Buscar)
                    .addContainerGap(10, Short.MAX_VALUE)))
        );

        Dialog_Buscar.getContentPane().add(Panel_Decoracion_Buscar);
        Panel_Decoracion_Buscar.setBounds(0, 0, 600, 0);

        Panel_Buscar.setBackground(new java.awt.Color(5, 23, 45));

        Regresar_Buscar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Regresar_Buscar.setText("Regresar");
        Regresar_Buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Regresar_BuscarMouseClicked(evt);
            }
        });

        Instruccion7.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        Instruccion7.setForeground(new java.awt.Color(255, 255, 255));
        Instruccion7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Instruccion7.setText("Registro encontrado:");

        Instruccion8.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        Instruccion8.setForeground(new java.awt.Color(255, 255, 255));
        Instruccion8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Instruccion8.setText("Impresion formateada del registro*");

        javax.swing.GroupLayout Panel_BuscarLayout = new javax.swing.GroupLayout(Panel_Buscar);
        Panel_Buscar.setLayout(Panel_BuscarLayout);
        Panel_BuscarLayout.setHorizontalGroup(
            Panel_BuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Instruccion7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Panel_BuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Regresar_Buscar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(Instruccion8, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        Panel_BuscarLayout.setVerticalGroup(
            Panel_BuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_BuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Regresar_Buscar)
                .addGap(21, 21, 21)
                .addComponent(Instruccion7)
                .addGap(18, 18, 18)
                .addComponent(Instruccion8)
                .addContainerGap(289, Short.MAX_VALUE))
        );

        Dialog_Buscar.getContentPane().add(Panel_Buscar);
        Panel_Buscar.setBounds(0, 50, 600, 400);

        Dialog_Listar.getContentPane().setLayout(null);

        Panel_Decoracion_Listar.setBackground(new java.awt.Color(19, 73, 60));
        Panel_Decoracion_Listar.setForeground(new java.awt.Color(51, 102, 0));

        Titulo_Listar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 28)); // NOI18N
        Titulo_Listar.setForeground(new java.awt.Color(255, 255, 255));
        Titulo_Listar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo_Listar.setText("Listar Registros");

        javax.swing.GroupLayout Panel_Decoracion_ListarLayout = new javax.swing.GroupLayout(Panel_Decoracion_Listar);
        Panel_Decoracion_Listar.setLayout(Panel_Decoracion_ListarLayout);
        Panel_Decoracion_ListarLayout.setHorizontalGroup(
            Panel_Decoracion_ListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(Panel_Decoracion_ListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Titulo_Listar, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE))
        );
        Panel_Decoracion_ListarLayout.setVerticalGroup(
            Panel_Decoracion_ListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(Panel_Decoracion_ListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_Decoracion_ListarLayout.createSequentialGroup()
                    .addContainerGap(9, Short.MAX_VALUE)
                    .addComponent(Titulo_Listar)
                    .addContainerGap(10, Short.MAX_VALUE)))
        );

        Dialog_Listar.getContentPane().add(Panel_Decoracion_Listar);
        Panel_Decoracion_Listar.setBounds(0, 0, 600, 0);

        Panel_Listar.setBackground(new java.awt.Color(5, 23, 45));

        Regresar_Listar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Regresar_Listar.setText("Regresar");
        Regresar_Listar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Regresar_ListarMouseClicked(evt);
            }
        });

        Instruccion9.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        Instruccion9.setForeground(new java.awt.Color(255, 255, 255));
        Instruccion9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Instruccion9.setText("Registros existentes:");

        Instruccion10.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        Instruccion10.setForeground(new java.awt.Color(255, 255, 255));
        Instruccion10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Instruccion10.setText("Impresion formateada de los registros encontrados*");

        javax.swing.GroupLayout Panel_ListarLayout = new javax.swing.GroupLayout(Panel_Listar);
        Panel_Listar.setLayout(Panel_ListarLayout);
        Panel_ListarLayout.setHorizontalGroup(
            Panel_ListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_ListarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Regresar_Listar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(Instruccion9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Instruccion10, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        Panel_ListarLayout.setVerticalGroup(
            Panel_ListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_ListarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Regresar_Listar)
                .addGap(18, 18, 18)
                .addComponent(Instruccion9)
                .addGap(29, 29, 29)
                .addComponent(Instruccion10)
                .addContainerGap(281, Short.MAX_VALUE))
        );

        Dialog_Listar.getContentPane().add(Panel_Listar);
        Panel_Listar.setBounds(0, 50, 600, 400);

        Dialog_Borrar.getContentPane().setLayout(null);

        Panel_Decoracion_Borrar.setBackground(new java.awt.Color(19, 73, 60));
        Panel_Decoracion_Borrar.setForeground(new java.awt.Color(51, 102, 0));

        Titulo_Borrar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 28)); // NOI18N
        Titulo_Borrar.setForeground(new java.awt.Color(255, 255, 255));
        Titulo_Borrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo_Borrar.setText("Borrar Registros");

        javax.swing.GroupLayout Panel_Decoracion_BorrarLayout = new javax.swing.GroupLayout(Panel_Decoracion_Borrar);
        Panel_Decoracion_Borrar.setLayout(Panel_Decoracion_BorrarLayout);
        Panel_Decoracion_BorrarLayout.setHorizontalGroup(
            Panel_Decoracion_BorrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(Panel_Decoracion_BorrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel_Decoracion_BorrarLayout.createSequentialGroup()
                    .addGap(0, 212, Short.MAX_VALUE)
                    .addComponent(Titulo_Borrar)
                    .addGap(0, 213, Short.MAX_VALUE)))
        );
        Panel_Decoracion_BorrarLayout.setVerticalGroup(
            Panel_Decoracion_BorrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(Panel_Decoracion_BorrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel_Decoracion_BorrarLayout.createSequentialGroup()
                    .addGap(0, 9, Short.MAX_VALUE)
                    .addComponent(Titulo_Borrar)
                    .addGap(0, 10, Short.MAX_VALUE)))
        );

        Dialog_Borrar.getContentPane().add(Panel_Decoracion_Borrar);
        Panel_Decoracion_Borrar.setBounds(0, 0, 600, 0);

        Panel_Borrar.setBackground(new java.awt.Color(5, 23, 45));

        Regresar_Borrar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Regresar_Borrar.setText("Regresar");
        Regresar_Borrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Regresar_BorrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Panel_BorrarLayout = new javax.swing.GroupLayout(Panel_Borrar);
        Panel_Borrar.setLayout(Panel_BorrarLayout);
        Panel_BorrarLayout.setHorizontalGroup(
            Panel_BorrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_BorrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Regresar_Borrar)
                .addContainerGap(505, Short.MAX_VALUE))
        );
        Panel_BorrarLayout.setVerticalGroup(
            Panel_BorrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_BorrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Regresar_Borrar)
                .addContainerGap(368, Short.MAX_VALUE))
        );

        Dialog_Borrar.getContentPane().add(Panel_Borrar);
        Panel_Borrar.setBounds(0, 50, 600, 400);

        Dialog_Cruzar.getContentPane().setLayout(null);

        Panel_Decoracion_Cruzar.setBackground(new java.awt.Color(19, 73, 60));
        Panel_Decoracion_Cruzar.setForeground(new java.awt.Color(51, 102, 0));

        Titulo_Cruzar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 28)); // NOI18N
        Titulo_Cruzar.setForeground(new java.awt.Color(255, 255, 255));
        Titulo_Cruzar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo_Cruzar.setText("Cruzar Archivos");

        javax.swing.GroupLayout Panel_Decoracion_CruzarLayout = new javax.swing.GroupLayout(Panel_Decoracion_Cruzar);
        Panel_Decoracion_Cruzar.setLayout(Panel_Decoracion_CruzarLayout);
        Panel_Decoracion_CruzarLayout.setHorizontalGroup(
            Panel_Decoracion_CruzarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(Panel_Decoracion_CruzarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Titulo_Cruzar, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE))
        );
        Panel_Decoracion_CruzarLayout.setVerticalGroup(
            Panel_Decoracion_CruzarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(Panel_Decoracion_CruzarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_Decoracion_CruzarLayout.createSequentialGroup()
                    .addContainerGap(9, Short.MAX_VALUE)
                    .addComponent(Titulo_Cruzar)
                    .addContainerGap(10, Short.MAX_VALUE)))
        );

        Dialog_Cruzar.getContentPane().add(Panel_Decoracion_Cruzar);
        Panel_Decoracion_Cruzar.setBounds(0, 0, 600, 0);

        Panel_Cruzar.setBackground(new java.awt.Color(5, 23, 45));

        Regresar_Cruzar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Regresar_Cruzar.setText("Regresar");
        Regresar_Cruzar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Regresar_CruzarMouseClicked(evt);
            }
        });

        Instruccion11.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        Instruccion11.setForeground(new java.awt.Color(255, 255, 255));
        Instruccion11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Instruccion11.setText("Mostrar tabla de campos del archivo 1 (actual)*");

        Instruccion12.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        Instruccion12.setForeground(new java.awt.Color(255, 255, 255));
        Instruccion12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Instruccion12.setText("Mostrar tabla de campos del archivo 2 (seleccionado para cruzar)*");

        Instruccion13.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        Instruccion13.setForeground(new java.awt.Color(255, 255, 255));
        Instruccion13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Instruccion13.setText("Seleccionar campos para relacionar*");

        B_DesplegarCamposRelacionados.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        B_DesplegarCamposRelacionados.setText("Desplegar en pantalla");
        B_DesplegarCamposRelacionados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_DesplegarCamposRelacionadosMouseClicked(evt);
            }
        });
        B_DesplegarCamposRelacionados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_DesplegarCamposRelacionadosActionPerformed(evt);
            }
        });

        B_EnviarCamposTercerArchivo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        B_EnviarCamposTercerArchivo.setText("Enviar a un tercer archivo");
        B_EnviarCamposTercerArchivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_EnviarCamposTercerArchivoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Panel_CruzarLayout = new javax.swing.GroupLayout(Panel_Cruzar);
        Panel_Cruzar.setLayout(Panel_CruzarLayout);
        Panel_CruzarLayout.setHorizontalGroup(
            Panel_CruzarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_CruzarLayout.createSequentialGroup()
                .addGroup(Panel_CruzarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_CruzarLayout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(B_DesplegarCamposRelacionados)
                        .addGap(28, 28, 28)
                        .addComponent(B_EnviarCamposTercerArchivo))
                    .addGroup(Panel_CruzarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Regresar_Cruzar)))
                .addContainerGap(96, Short.MAX_VALUE))
            .addComponent(Instruccion11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Instruccion12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Instruccion13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Panel_CruzarLayout.setVerticalGroup(
            Panel_CruzarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_CruzarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Regresar_Cruzar)
                .addGap(50, 50, 50)
                .addComponent(Instruccion11)
                .addGap(31, 31, 31)
                .addComponent(Instruccion12)
                .addGap(29, 29, 29)
                .addComponent(Instruccion13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addGroup(Panel_CruzarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B_DesplegarCamposRelacionados)
                    .addComponent(B_EnviarCamposTercerArchivo))
                .addGap(81, 81, 81))
        );

        Dialog_Cruzar.getContentPane().add(Panel_Cruzar);
        Panel_Cruzar.setBounds(0, 50, 600, 400);

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
        B_Campos.setBorderPainted(false);
        B_Campos.setFocusPainted(false);
        B_Campos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_CamposMouseClicked(evt);
            }
        });
        getContentPane().add(B_Campos);
        B_Campos.setBounds(278, 268, 109, 23);

        B_Registros.setText("Registros");
        B_Registros.setBorderPainted(false);
        B_Registros.setFocusPainted(false);
        B_Registros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_RegistrosMouseClicked(evt);
            }
        });
        B_Registros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_RegistrosActionPerformed(evt);
            }
        });
        getContentPane().add(B_Registros);
        B_Registros.setBounds(514, 268, 109, 23);

        B_Indices.setBackground(new java.awt.Color(102, 102, 102));
        B_Indices.setText("Indices");
        B_Indices.setBorderPainted(false);
        B_Indices.setContentAreaFilled(false);
        B_Indices.setFocusPainted(false);
        getContentPane().add(B_Indices);
        B_Indices.setBounds(153, 335, 112, 23);

        B_Estandarizacion.setText("Estandarizacion");
        B_Estandarizacion.setBorderPainted(false);
        B_Estandarizacion.setFocusPainted(false);
        getContentPane().add(B_Estandarizacion);
        B_Estandarizacion.setBounds(382, 335, 113, 23);

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
        Tabla_Camps.setSize(3 * x / 4, y / 2);
        Tabla_Camps.setLocation((int) ((x / 2) - (Tabla_Camps.getWidth() / 2)), (int) ((5 * y / 12) - (Tabla_Camps.getHeight() / 2)));

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
        lb_Archivo_Titulo.setForeground(Color.white);
        lb_Archivo_Titulo.setSize(anchoTexto, y / 2);
        lb_Archivo_Titulo.setLocation((int) ((x / 2) - (lb_Archivo_Titulo.getWidth() / 2)), (int) ((y / 12) - (lb_Archivo_Titulo.getHeight() / 2)));

        //logito de al lado
        I_Campo_Decoracion.setSize(lb_Archivo_Titulo.getHeight() / 4, lb_Archivo_Titulo.getHeight() / 4);
        I_Campo_Decoracion.setLocation((int) ((x / 2) - (I_Campo_Decoracion.getWidth() / 2)) + lb_Archivo_Titulo.getWidth(), (int) ((y / 12) - (I_Campo_Decoracion.getHeight() / 2)));
    }//GEN-LAST:event_JF_CamposComponentResized

    private void B_CamposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_CamposMouseClicked
        // TODO add your handling code here:
        lb_Archivo_Titulo.setText(file.getNombre());
        if (!B_Campos.isEnabled()) {
            return;
        }
        this.setVisible(false);
        JF_Campos.setJMenuBar(jMenuBar1);
        JF_Campos.pack();
        JF_Campos.setVisible(true);
        JF_Campos.setSize(this.getWidth(), this.getHeight());
        JF_Campos.setLocationRelativeTo(this);

        //Limpia la lista
        DefaultTableModel T = (DefaultTableModel) Datos_Campos.getModel();
        T.setRowCount(0);

    }//GEN-LAST:event_B_CamposMouseClicked

    private void B_Archivo_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_Archivo_SalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_B_Archivo_SalirActionPerformed

    private void B_Archivo_NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_Archivo_NuevoActionPerformed
        // TODO add your handling code here:
        char isCreated = file.Nuevo();
        switch (isCreated) {
            case 'T':
                JOptionPane.showMessageDialog(null, "El archivo se creo con exito", "Notificación", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 'F':
                JOptionPane.showMessageDialog(null, "Hubo un error el archivo no se pudo crear", "Notificación", JOptionPane.ERROR_MESSAGE);
                break;
            case 'E':
                JOptionPane.showMessageDialog(null, "El archivo ya existe", "Notificación", JOptionPane.ERROR_MESSAGE);
                break;
        }
    }//GEN-LAST:event_B_Archivo_NuevoActionPerformed

    private void B_Archivo_AbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_Archivo_AbrirActionPerformed
        // TODO add your handling code here:
        if (!this.isVisible() || !file.getRutaArchivo().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor antes de abrir un archivo cierre el actual", "Notificación", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        file.LecturaPath();
        if (file.getRutaArchivo().equals("")) {
            return;
        }
        if (file.getRutaArchivo().equals("F")) {
            JOptionPane.showMessageDialog(null, "Hubo un error esta abriendo un archivo no permitido", "Error", JOptionPane.ERROR_MESSAGE);
            file.setRutaArchivo("");
            return;
        }
        boolean isOpen = file.Abrir();
        if (isOpen == false) {
            JOptionPane.showMessageDialog(null, "Hubo un error al cargar el archivo", "Notificación", JOptionPane.ERROR_MESSAGE);
            return;
        }
        //Activando los botones
        B_Campos.setEnabled(file.canBeEnableCampos());
        B_Registros.setEnabled(true);
        B_Indices.setEnabled(true);
        B_Estandarizacion.setEnabled(true);
        //Buen dias
    }//GEN-LAST:event_B_Archivo_AbrirActionPerformed

    private void B_Archivo_CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_Archivo_CerrarActionPerformed
        // TODO add your handling code here:
        if (file.getRutaArchivo().equals("")) {
            JOptionPane.showMessageDialog(null, "No hay ningun archivo abierto para cerrar", "Notificación", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (this.isVisible()) {
            file.setRutaArchivo("");
            B_Campos.setEnabled(false);
            B_Registros.setEnabled(false);
            B_Indices.setEnabled(false);
            B_Estandarizacion.setEnabled(false);
            JOptionPane.showMessageDialog(null, "Se ha cerrado el archivo", "Notificación", JOptionPane.INFORMATION_MESSAGE);
            file.clear();
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
            file.setRutaArchivo("");
            //Desactivando JFrames
            JF_Campos.setVisible(false);
            JF_Registros.setVisible(false);

            this.setVisible(true);
            this.setJMenuBar(jMenuBar1);
            //Desactivando
            B_Campos.setEnabled(false);
            B_Registros.setEnabled(false);
            B_Indices.setEnabled(false);
            B_Estandarizacion.setEnabled(false);
            file.clear();
        }

    }//GEN-LAST:event_B_Archivo_CerrarActionPerformed

    private void B_Archivo_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_Archivo_GuardarActionPerformed
        // TODO add your handling code here:
        if (file.getRutaArchivo().equals("")) {
            JOptionPane.showMessageDialog(null, "No hay ningun archivo abierto para guardar", "Notificación", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (this.isVisible()) {
            JOptionPane.showMessageDialog(null, "No se ha realizado ningun cambio", "Notificación", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (JF_Registros.isVisible()) {
            JOptionPane.showMessageDialog(null, "En esta pantalla no se puede realizar esta accion", "Notificación", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        boolean IsSaved = false;

        if (JF_Campos.isVisible()) {
            //metodo anadido
            ArrayList<Campo> C = file.getListaCampos();
            DefaultTableModel D = (DefaultTableModel) Datos_Campos.getModel();
            int count = 0;
            int pos = -1;
            for (int i = 0; i < C.size(); i++) {
                if (Boolean.parseBoolean(D.getValueAt(i, 3).toString())) {
                    count++;
                    pos = i;
                }

            }
            if (count > 1) {
                JOptionPane.showMessageDialog(JF_Campos, "No se puede guardar el Archivo con multiples llaves", "Error", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            if (count == 0 && !C.isEmpty()) {
                JOptionPane.showMessageDialog(JF_Campos, "Ocupa una llave para Guardar el Archivo", "Error", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            if (pos != -1) {
                for (int i = 0; i < C.size(); i++) {
                    if (pos == i) {
                        C.get(i).setEsLLave(true);
                    } else {
                        C.get(i).setEsLLave(false);
                    }
                }
            }
            IsSaved = file.Guardar(true);
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

        JF_CrearCampo.pack();
        JF_Campos.setVisible(false);
        JF_CrearCampo.pack();
        JF_CrearCampo.setSize(700, 450);
        JF_CrearCampo.setResizable(false);
        //JF_CrearCampo.setSize(JF_Campos.getWidth() * 2 / 3, JF_Campos.getHeight() * 2 / 3);
        JF_CrearCampo.setLocationRelativeTo(JF_Campos);
        JF_CrearCampo.setVisible(true);


    }//GEN-LAST:event_B_CrearCampoMouseClicked

    private void B_GuardadCrearCampoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_GuardadCrearCampoMouseClicked
        // TODO add your handling code here:
        try {
            for (int i = 0; i < file.getListaCampos().size(); i++) {
                if (file.getListaCampos().get(i).getNombre().toLowerCase().equals(nombreCampo.getText().toLowerCase())) {
                    JOptionPane.showMessageDialog(rootPane, "El nombre de ese campo ya existe", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }

            String nombre = nombreCampo.getText();
            if (!nombre.matches("^[^,\\\\{\\\\} \\[\\]\\|]+$")) {
                JOptionPane.showMessageDialog(rootPane, "En nombre por favor no ingresar espacios, llaves, corchetes ni comas", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            String tipo = tipoCampo.getSelectedItem().toString();
            int longitud = Integer.parseInt(longitudCampo.getText());
            if (longitud < 0) {
                JOptionPane.showMessageDialog(rootPane, "Entrada de datos inválida.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Campo campoNuevo = new Campo(nombre, tipo, longitud, false);
            //listaCampos.add(campoNuevo);
            file.getListaCampos().add(campoNuevo);

            listarTabla();

            nombreCampo.setText("");
            longitudCampo.setText("");
            tipoCampo.setSelectedIndex(0);
            JOptionPane.showMessageDialog(this, "Campo agregado con exito!");
            JF_CrearCampo.setVisible(false);
            JF_Campos.setVisible(true);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "Entrada de datos inválida.", "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }


    }//GEN-LAST:event_B_GuardadCrearCampoMouseClicked

    private void JF_CrearCampoComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_JF_CrearCampoComponentResized
        // TODO add your handling code here:

//        int y_decorated = JF_CrearCampo.getInsets().top + JF_CrearCampo.getInsets().bottom;
//        int x_original = JF_CrearCampo.getWidth() - JF_CrearCampo.getInsets().right - JF_CrearCampo.getInsets().left;
//        int y_original = JF_CrearCampo.getHeight() - y_decorated;
//
//        PanelCrearCampo.setLocation(0, y_original / 8);
//        PanelCrearCampo.setSize(x_original, y_original * 7 / 8);
//        P_CrearCapo_Decoracion.setLocation(0, 0);
//        P_CrearCapo_Decoracion.setSize(x_original, y_original / 8);
//
//        int x = PanelCrearCampo.getWidth();
//        int y = PanelCrearCampo.getHeight();
//
//        Font f;
//        int anchoTexto;
//
//        //titulo
//        if (x > y) {
//            f = new Font("Dialog", 1, (int) y_original / 16);
//
//        } else {
//            f = new Font("Dialog", 1, (int) x_original / 16);
//        }
//        TituloCrear.setFont(f);
//        FontMetrics fontMetrics = TituloCrear.getFontMetrics(TituloCrear.getFont());
//        anchoTexto = fontMetrics.stringWidth(TituloCrear.getText());
//        TituloCrear.setForeground(Color.white);
//        TituloCrear.setSize(anchoTexto, y * 2 / 3);
//        TituloCrear.setLocation((int) (x / 2) - (TituloCrear.getWidth() / 2), (int) ((y / 8) - (TituloCrear.getHeight() / 2)));
//
//        if (x > y) {
//            f = new Font("Dialog", 1, (int) y_original / 33);
//
//        } else {
//            f = new Font("Dialog", 1, (int) x_original / 33);
//        }
//        JL_Nombre.setFont(f);
//        fontMetrics = JL_Nombre.getFontMetrics(JL_Nombre.getFont());
//        anchoTexto = fontMetrics.stringWidth(JL_Nombre.getText());
//        JL_Nombre.setForeground(Color.white);
//        JL_Nombre.setSize(anchoTexto, y * 2 / 3);
//        JL_Nombre.setLocation((int) (x / 4) - (JL_Nombre.getWidth() / 2), (int) ((4 * y / 16) - (JL_Nombre.getHeight() / 2)));
//
////        nombreCampo.setForeground(Color.white);
////        nombreCampo.setSize(anchoTexto, y * 2 / 3);
////        nombreCampo.setLocation((int) (x / 4) - (nombreCampo.getWidth() / 2), (int) ((4 * y / 16) - (nombreCampo.getHeight() / 2)));
////        
////        longitudCampo.setForeground(Color.white);
////        longitudCampo.setSize(anchoTexto, y * 2 / 3);
////        longitudCampo.setLocation((int) (x / 4) - (longitudCampo.getWidth() / 2), (int) ((4 * y / 16) - (longitudCampo.getHeight() / 2)));
////        
////        tipoCampo.setForeground(Color.white);
////        tipoCampo.setSize(anchoTexto, y * 2 / 3);
////        tipoCampo.setLocation((int) (x / 4) - (tipoCampo.getWidth() / 2), (int) ((4 * y / 16) - (tipoCampo.getHeight() / 2)));
//        JL_Tipo.setFont(f);
//        fontMetrics = JL_Tipo.getFontMetrics(JL_Tipo.getFont());
//        anchoTexto = fontMetrics.stringWidth(JL_Tipo.getText());
//        JL_Tipo.setForeground(Color.white);
//        JL_Tipo.setSize(anchoTexto, y * 2 / 3);
//        JL_Tipo.setLocation((int) (x / 4) - (JL_Tipo.getWidth() / 2), (int) ((7 * y / 16) - (JL_Tipo.getHeight() / 2)));
//
//        JL_Longitud.setFont(f);
//        fontMetrics = JL_Longitud.getFontMetrics(JL_Longitud.getFont());
//        anchoTexto = fontMetrics.stringWidth(JL_Longitud.getText());
//        JL_Longitud.setForeground(Color.white);
//        JL_Longitud.setSize(anchoTexto, y * 2 / 3);
//        JL_Longitud.setLocation((int) (x / 4) - (JL_Longitud.getWidth() / 2), (int) ((10 * y / 16) - (JL_Longitud.getHeight() / 2)));
//
//        B_GuardadCrearCampo.setSize(2 * x_original / 16, 2 * y_original / 18);
//        B_GuardadCrearCampo.setLocation((int) (x * 7 / 9), (int) ((y * 15 / 16) - (B_CrearCampo.getWidth() / 2)));

    }//GEN-LAST:event_JF_CrearCampoComponentResized

    private void B_ModificarCampoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_ModificarCampoMouseClicked
        // TODO add your handling code here:
        try {
            if (Datos_Campos.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(rootPane, "Por favor, seleccione un elemento de la lista.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                int index = Datos_Campos.getSelectedRow();
                String modificacion = JOptionPane.showInputDialog(rootPane, "Que desea modificar?\n 1. Nombre\n 2. Tipo\n 3. Longitud");
                if (modificacion == null) {
                    return;
                }
                if (Integer.parseInt(modificacion) != 1 && Integer.parseInt(modificacion) != 2 && Integer.parseInt(modificacion) != 3) {
                    JOptionPane.showMessageDialog(rootPane, "Entrada de datos inválida.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                if (modificacion.equals("Nombre") || Integer.parseInt(modificacion) == 1) {
                    String nombreNuevo = JOptionPane.showInputDialog(rootPane, "Ingrese el nuevo nombre: ");
                    if (nombreNuevo == null) {
                        return;
                    }
                    if (!nombreNuevo.matches("^[^,\\\\{\\\\} \\[\\]\\|]+$")) {
                        JOptionPane.showMessageDialog(rootPane, "En nombre por favor no ingresar espacios, llaves, corchetes ni comas", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    for (int i = 0; i < file.getListaCampos().size(); i++) {
                        if (file.getListaCampos().get(i).getNombre().equals(nombreNuevo)) {
                            JOptionPane.showMessageDialog(rootPane, "El nombre de ese campo ya existe", "Error", JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                    }
                    //Codigo para Modificar
                    file.getListaCampos().get(index).setNombre(nombreNuevo);
                    JOptionPane.showMessageDialog(null, "El campo se modifico con exito", "Notificación", JOptionPane.INFORMATION_MESSAGE);

                }

                if (modificacion.equals("Tipo") || Integer.parseInt(modificacion) == 2) {
                    String tipoIngresado = JOptionPane.showInputDialog(rootPane, "Ingrese el nuevo Tipo:\n 1. int\n 2. double\n 3. char\n");
                    if (tipoIngresado == null) {
                        return;
                    }
                    int tipoNuevo = Integer.parseInt(tipoIngresado);
                    //Codigo para Modificar
                    String tipo;
                    if (tipoNuevo != 1 && tipoNuevo != 2 && tipoNuevo != 3) {
                        JOptionPane.showMessageDialog(rootPane, "Entrada de datos inválida.", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    switch (tipoNuevo) {
                        case 1:
                            tipo = "int";
                            break;
                        case 2:
                            tipo = "Double";
                            break;
                        case 3:
                            tipo = "char";
                            break;

                        default:
                            tipo = "Unknown";
                    }

                    file.getListaCampos().get(index).setTipo(tipo);
                    JOptionPane.showMessageDialog(null, "El campo se modifico con exito", "Notificación", JOptionPane.INFORMATION_MESSAGE);

                }

                if (modificacion.equals("Longitud") || Integer.parseInt(modificacion) == 3) {
                    String longitudIngresada = JOptionPane.showInputDialog(rootPane, "Ingrese la nueva Longitud: ");
                    if (longitudIngresada == null) {
                        return;
                    }
                    int longitudNueva = Integer.parseInt(longitudIngresada);
                    //Codigo para Modificar
                    if (longitudNueva < 0) {
                        JOptionPane.showMessageDialog(rootPane, "Entrada de datos inválida.", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }

                    file.getListaCampos().get(index).setTamano(longitudNueva);
                    JOptionPane.showMessageDialog(null, "El campo se modifico con exito", "Notificación", JOptionPane.INFORMATION_MESSAGE);

                }

                //listar
                listarTabla();

            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "Entrada de datos inválida.", "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_B_ModificarCampoMouseClicked

    private void B_ListarCampoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_ListarCampoMouseClicked
        // TODO add your handling code here:
        if (file.getListaCampos().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "El archivo esta vacio", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        listarTabla();
    }//GEN-LAST:event_B_ListarCampoMouseClicked

    private void B_BorrarCampoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_BorrarCampoMouseClicked
        // TODO add your handling code here:
        try {
            if (Datos_Campos.getSelectedRowCount() == 0) {
                JOptionPane.showMessageDialog(rootPane, "Por favor, seleccione un elemento de la lista.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                file.getListaCampos().remove(Datos_Campos.getSelectedRow());

                //listar
                listarTabla();

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_B_BorrarCampoMouseClicked

    private void B_RegresarCrearCampoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_RegresarCrearCampoMouseClicked
        // TODO add your handling code here:
        JF_CrearCampo.setVisible(false);
        JF_Campos.setVisible(true);
    }//GEN-LAST:event_B_RegresarCrearCampoMouseClicked

    private void nombreCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreCampoActionPerformed

    private void B_RegistrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_RegistrosMouseClicked
        // TODO add your handling code here:
        ArrayList<Campo> C = file.getListaCampos();
        String[] columnNames = new String[C.size()];
        for (int i = 0; i < C.size(); i++) {
            columnNames[i] = C.get(i).getNombre();
        }
        DefaultTableModel T = new DefaultTableModel(columnNames, 1);
        Datos_Registro.setModel(T);
        lb_Archivo_Titulo.setText(file.getNombre());
        if (!B_Registros.isEnabled()) {
            return;
        }
        this.setVisible(false);
        JF_Registros.pack();
        JF_Registros.setSize(this.getWidth(), this.getHeight());
        JF_Registros.setLocationRelativeTo(this);
        JF_Registros.setVisible(true);


    }//GEN-LAST:event_B_RegistrosMouseClicked

    private void B_IntroducirRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_IntroducirRegistroMouseClicked
        // TODO add your handling code here:

        Dialog_Introducir.setTitle("Standard File Manager");
        Dialog_Introducir.setModal(true);
        Dialog_Introducir.pack();
        Dialog_Introducir.setSize(600, 450);
        Dialog_Introducir.setResizable(false);
        Dialog_Introducir.setLocationRelativeTo(this);
        ArrayList<Campo> C = file.getListaCampos();
        currentIndex = 0;
        campoActual = C.get(currentIndex);
        J_OrdenCampoInt.setText("{" + campoActual.getNombre() + ',' + campoActual.getTipo() + ',' + campoActual.getTamano() + ',' + campoActual.isEsLLave() + "}");
        Dialog_Introducir.setVisible(true);

        Font f;
        int x = Dialog_Introducir.getWidth();
        int y = Dialog_Introducir.getHeight();
        if (x > y) {
            f = new Font("Dialog", 0, (int) y / 33);

        } else {
            f = new Font("Dialog", 0, (int) x / 33);
        }
        Regresar_Introducir.setSize(90, 25);
        Regresar_Introducir.setFont(f);


    }//GEN-LAST:event_B_IntroducirRegistroMouseClicked

    private void B_ListarRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_ListarRegistroMouseClicked
        // TODO add your handling code here:
        if (file.canBeEnableCampos()) {
            JOptionPane.showMessageDialog(null, "No hay ningun registro para mostrar", "Notificación", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        this.listarTablaRegistro(true);
    }//GEN-LAST:event_B_ListarRegistroMouseClicked

    private void B_ModificarRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_ModificarRegistroMouseClicked
        // TODO add your handling code here:
        String llaveprimaria = JOptionPane.showInputDialog(rootPane, "Ingrese la llave primaria del registro a modificar: ");
        rnn = 0;
        if (!file.buscarUnRegistro(rnn)) {
            JOptionPane.showMessageDialog(null, "No se encontro el registro", "Notificación", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        // buscar registro y setear en el Jlabel el registro anterior para que vea como estaba antes e ingrese la modificacion
        Dialog_Modificar.setTitle("Standard File Manager");
        Dialog_Modificar.pack();
        Dialog_Modificar.setSize(600, 450);
        Dialog_Modificar.setResizable(false);
        Dialog_Modificar.setLocationRelativeTo(this);
        ArrayList<Campo> C = file.getListaCampos();
        currentIndex = 0;
        campoActual = C.get(currentIndex);
        J_OrdenCampos.setText("{" + campoActual.getNombre() + ',' + campoActual.getTipo() + ',' + campoActual.getTamano() + ',' + campoActual.isEsLLave() + "}");
        registroModificar = file.getListaRegistro().get(0);

        J_RegistroAnterior.setText((String) registroModificar[currentIndex]);
        Font f;
        int x = Dialog_Modificar.getWidth();
        int y = Dialog_Modificar.getHeight();
        if (x > y) {
            f = new Font("Dialog", 0, (int) y / 33);

        } else {
            f = new Font("Dialog", 0, (int) x / 33);
        }
        Regresar_Modificar.setSize(90, 25);
        Regresar_Modificar.setFont(f);
        Dialog_Modificar.setModal(true);
        Dialog_Modificar.setVisible(true);
    }//GEN-LAST:event_B_ModificarRegistroMouseClicked

    private void B_BorrarRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_BorrarRegistroMouseClicked
        // TODO add your handling code here:
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(rootPane, "Como desea realizar la eliminacion?\n 1.Eliminar registro especifico\n 2. Eliminar registros segun un criterio "));
        if (opcion == 1) {
            String llavepimaria = JOptionPane.showInputDialog(rootPane, "Ingrese la llave primaria del registro a eliminar:");
        } else if (opcion == 2) {
            String criterio = JOptionPane.showInputDialog(rootPane, "Ingrese el criterio de eliminacion: ");
        }
        // buscar registro y borrarlo, luego actualizar la tabla
        Dialog_Borrar.setTitle("Standard File Manager");
        Dialog_Borrar.setModal(true);
        Dialog_Borrar.pack();
        Dialog_Borrar.setSize(600, 450);
        Dialog_Borrar.setResizable(false);
        Dialog_Borrar.setLocationRelativeTo(this);
        Dialog_Borrar.setVisible(true);

        Font f;
        int x = Dialog_Borrar.getWidth();
        int y = Dialog_Borrar.getHeight();
        if (x > y) {
            f = new Font("Dialog", 0, (int) y / 33);

        } else {
            f = new Font("Dialog", 0, (int) x / 33);
        }
        Regresar_Borrar.setSize(90, 25);
        Regresar_Borrar.setFont(f);
    }//GEN-LAST:event_B_BorrarRegistroMouseClicked

    private void JF_RegistrosComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_JF_RegistrosComponentResized

        DefaultMutableTreeNode J;
        int y_decorated = JF_Registros.getInsets().top + JF_Registros.getInsets().bottom;
        int y_JFMenuBar = JF_Registros.getJMenuBar().getHeight();
        int x = JF_Registros.getWidth() - JF_Registros.getInsets().right - JF_Registros.getInsets().left;
        int y = JF_Registros.getHeight() - y_decorated - y_JFMenuBar;
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
        B_IntroducirRegistro.setFont(f);
        B_ModificarRegistro.setFont(f);
        B_ListarRegistro.setFont(f);
        B_BorrarRegistro.setFont(f);
        B_CruzarRegistro.setFont(f);
        B_BuscarRegistro.setFont(f);
        //B_Regresar.setFont(f);

        I_Fondo_Registro.setSize(x, y);

        //Botones de la lista
        Tabla_Registro.setSize(3 * x / 4, y / 2);
        Tabla_Registro.setLocation((int) ((x / 2) - (Tabla_Registro.getWidth() / 2)), (int) ((5 * y / 12) - (Tabla_Registro.getHeight() / 2)));

        //Botones Campo
        B_IntroducirRegistro.setSize(3 * x / 17, 2 * y / 19);
        B_ModificarRegistro.setSize(3 * x / 17, 2 * y / 19);
        B_BorrarRegistro.setSize(3 * x / 17, 2 * y / 19);
        B_ListarRegistro.setSize(3 * x / 17, 2 * y / 19);
        B_CruzarRegistro.setSize(3 * x / 17, 2 * y / 19);
        B_BuscarRegistro.setSize(3 * x / 17, 2 * y / 19);
        //B_Regresar.setSize(3 * x / 15, 2 * y /16);

        B_IntroducirRegistro.setLocation((int) ((1 * x / 8) - (B_IntroducirRegistro.getWidth() / 2)), (int) ((11 * y / 13) - (B_IntroducirRegistro.getHeight() / 2)));
        B_ModificarRegistro.setLocation((int) ((2.16 * x / 8) - (B_IntroducirRegistro.getWidth() / 2)), (int) ((11 * y / 13) - (B_IntroducirRegistro.getHeight() / 2)));
        B_BuscarRegistro.setLocation((int) ((3.32 * x / 8) - (B_IntroducirRegistro.getWidth() / 2)), (int) ((11 * y / 13) - (B_IntroducirRegistro.getHeight() / 2)));
        B_ListarRegistro.setLocation((int) ((4.48 * x / 8) - (B_IntroducirRegistro.getWidth() / 2)), (int) ((11 * y / 13) - (B_IntroducirRegistro.getHeight() / 2)));
        B_CruzarRegistro.setLocation((int) ((5.64 * x / 8) - (B_IntroducirRegistro.getWidth() / 2)), (int) ((11 * y / 13) - (B_IntroducirRegistro.getHeight() / 2)));
        B_BorrarRegistro.setLocation((int) ((6.8 * x / 8) - (B_IntroducirRegistro.getWidth() / 2)), (int) ((11 * y / 13) - (B_IntroducirRegistro.getHeight() / 2)));
        //B_Regresar.setLocation((int) ((1.5 * x / 8) - (lb_Registro_Titulo.getWidth())), (int) ((y / 10) - (lb_Registro_Titulo.getHeight() / 2)));

        //titulo
        if (x > y) {
            f = new Font("Dialog", 1, (int) y / 16);

        } else {
            f = new Font("Dialog", 1, (int) x / 16);
        }

        lb_Registro_Titulo.setFont(f);
        FontMetrics fontMetrics = lb_Registro_Titulo.getFontMetrics(lb_Registro_Titulo.getFont());
        int anchoTexto = fontMetrics.stringWidth(lb_Registro_Titulo.getText());
        lb_Registro_Titulo.setForeground(Color.white);
        lb_Registro_Titulo.setSize(anchoTexto, y / 2);
        lb_Registro_Titulo.setLocation((int) ((x / 2) - (lb_Registro_Titulo.getWidth() / 2)), (int) ((y / 12) - (lb_Registro_Titulo.getHeight() / 2)));
        lb_Registro_Titulo.setText(file.getNombre());

        //logito de al lado
        I_Registro_Decoracion.setSize(lb_Registro_Titulo.getHeight() / 4, lb_Registro_Titulo.getHeight() / 4);
        I_Registro_Decoracion.setLocation((int) ((x / 2) - (I_Registro_Decoracion.getWidth() / 2)) + lb_Registro_Titulo.getWidth(), (int) ((y / 12) - (I_Registro_Decoracion.getHeight() / 2)));
    }//GEN-LAST:event_JF_RegistrosComponentResized

    private void B_CruzarRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_CruzarRegistroMouseClicked
        // TODO add your handling code here:
        //ArchivoCruzado = cruzado.LecturaPath();

        Dialog_Cruzar.setTitle("Standard File Manager");
        Dialog_Cruzar.setModal(true);
        Dialog_Cruzar.pack();
        Dialog_Cruzar.setSize(600, 450);
        Dialog_Cruzar.setResizable(false);
        Dialog_Cruzar.setLocationRelativeTo(this);
        Dialog_Cruzar.setVisible(true);

        Font f;
        int x = Dialog_Cruzar.getWidth();
        int y = Dialog_Cruzar.getHeight();
        if (x > y) {
            f = new Font("Dialog", 0, (int) y / 33);

        } else {
            f = new Font("Dialog", 0, (int) x / 33);
        }
        Regresar_Cruzar.setSize(90, 25);
        Regresar_Cruzar.setFont(f);
    }//GEN-LAST:event_B_CruzarRegistroMouseClicked

    private void B_BuscarRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_BuscarRegistroMouseClicked
        // TODO add your handling code here:
        String llaveprimaria = JOptionPane.showInputDialog(rootPane, "Ingrese la llave primaria del registro a buscar: ");

        Dialog_Buscar.setTitle("Standard File Manager");
        Dialog_Buscar.setModal(true);
        Dialog_Buscar.pack();
        Dialog_Buscar.setSize(600, 450);
        Dialog_Buscar.setResizable(false);
        Dialog_Buscar.setLocationRelativeTo(this);
        Dialog_Buscar.setVisible(true);
        //Comentado aproposito por Fer, mientras se implementa arbol

//        //Busqueda en el arbol mediante llave primaria
//        int rnn = 1;
//        //una vez encontro la posicion del registro lo lista en la tabla
//        file.buscarUnRegistro(rnn);
//        listarTablaRegistro(false);
    }//GEN-LAST:event_B_BuscarRegistroMouseClicked

    private void B_ListarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_ListarRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B_ListarRegistroActionPerformed

    private void B_RegistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_RegistrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B_RegistrosActionPerformed

    private void Regresar_CruzarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Regresar_CruzarMouseClicked
        // TODO add your handling code here:
        JF_Registros.setVisible(true);
        Dialog_Cruzar.setVisible(false);

    }//GEN-LAST:event_Regresar_CruzarMouseClicked

    private void Regresar_BorrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Regresar_BorrarMouseClicked
        // TODO add your handling code here:
        JF_Registros.setVisible(true);
        Dialog_Borrar.setVisible(false);
    }//GEN-LAST:event_Regresar_BorrarMouseClicked

    private void Regresar_ListarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Regresar_ListarMouseClicked
        // TODO add your handling code here:
        JF_Registros.setVisible(true);
        Dialog_Listar.setVisible(false);
    }//GEN-LAST:event_Regresar_ListarMouseClicked

    private void Regresar_BuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Regresar_BuscarMouseClicked
        // TODO add your handling code here:
        JF_Registros.setVisible(true);
        Dialog_Buscar.setVisible(false);
    }//GEN-LAST:event_Regresar_BuscarMouseClicked

    private void Regresar_ModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Regresar_ModificarMouseClicked
        // TODO add your handling code here:
        Dialog_Modificar.setVisible(false);
    }//GEN-LAST:event_Regresar_ModificarMouseClicked

    private void Regresar_IntroducirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Regresar_IntroducirMouseClicked
        // TODO add your handling code here:
        JF_Registros.setVisible(true);
        Dialog_Introducir.setVisible(false);
    }//GEN-LAST:event_Regresar_IntroducirMouseClicked

    private void TF_NuevoRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_NuevoRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_NuevoRegistroActionPerformed

    private void TF_ModificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_ModificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_ModificacionActionPerformed

    private void B_DesplegarCamposRelacionadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_DesplegarCamposRelacionadosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_B_DesplegarCamposRelacionadosMouseClicked

    private void B_EnviarCamposTercerArchivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_EnviarCamposTercerArchivoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_B_EnviarCamposTercerArchivoMouseClicked

    private void B_DesplegarCamposRelacionadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_DesplegarCamposRelacionadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B_DesplegarCamposRelacionadosActionPerformed

    private void B_AnteriorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_AnteriorMouseClicked
        // TODO add your handling code here:
        if (currentIndex == 0) {
            return;
        }
        TF_NuevoRegistro.setText("");
        ArrayList<Campo> C = file.getListaCampos();
        currentIndex = (currentIndex - 1 + C.size()) % C.size();
        registroIngresar.removeLast();
        campoActual = C.get(currentIndex);
        J_OrdenCampoInt.setText("{" + campoActual.getNombre() + ',' + campoActual.getTipo() + ',' + campoActual.getTamano() + ',' + campoActual.isEsLLave() + "}");
    }//GEN-LAST:event_B_AnteriorMouseClicked

    private void B_SiguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_SiguienteMouseClicked
        // TODO add your handling code here:
        if (currentIndex == file.getListaCampos().size() - 1) {
            JOptionPane.showMessageDialog(null, "No hay mas campos si desea puede guardar", "Notificación", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        String text = TF_NuevoRegistro.getText();

        switch (campoActual.getTipo()) {
            case "int":
                try {
                int numeroEntero = Integer.parseInt(text);
                System.out.println("Número entero: " + numeroEntero);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(rootPane, "Los datos ingresados no son de tipo int", "Error", JOptionPane.ERROR_MESSAGE);
                System.err.println("Error al convertir a entero: " + e.getMessage());
                return;
            }
            break;
            case "double":
                try {
                Double numeroDouble = Double.parseDouble(text);
                System.out.println("Número double: " + numeroDouble);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(rootPane, "Los datos ingresados no son de tipo double", "Error", JOptionPane.ERROR_MESSAGE);
                System.err.println("Error al convertir a double: " + e.getMessage());
                return;
            }
            break;
        }

        if (text.length() > campoActual.getTamano()) {
            JOptionPane.showMessageDialog(rootPane, "Los datos ingresados exceden la longitud estipulada", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (campoActual.isEsLLave() && text.length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "El campo es una llave primaria por favor ingresar los datos correpondientes", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        registroIngresar.add(currentIndex, text);
        TF_NuevoRegistro.setText("");
        ArrayList<Campo> C = file.getListaCampos();
        currentIndex = (currentIndex + 1) % C.size();
        campoActual = C.get(currentIndex);
        J_OrdenCampoInt.setText("{" + campoActual.getNombre() + ',' + campoActual.getTipo() + ',' + campoActual.getTamano() + ',' + campoActual.isEsLLave() + "}");
    }//GEN-LAST:event_B_SiguienteMouseClicked

    private void B_AnteriorModifMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_AnteriorModifMouseClicked
        // TODO add your handling code here:
        if (currentIndex == 0) {
            return;
        }
        TF_Modificacion.setText("");
        ArrayList<Campo> C = file.getListaCampos();
        currentIndex = (currentIndex - 1 + C.size()) % C.size();
        campoActual = C.get(currentIndex);
        registroIngresar.removeLast();
        J_OrdenCampos.setText("{" + campoActual.getNombre() + ',' + campoActual.getTipo() + ',' + campoActual.getTamano() + ',' + campoActual.isEsLLave() + "}");
        J_RegistroAnterior.setText((String) registroModificar[currentIndex]);
    }//GEN-LAST:event_B_AnteriorModifMouseClicked

    private void B_SiguienteModifMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_SiguienteModifMouseClicked
        // TODO add your handling code here:
        if (currentIndex == file.getListaCampos().size() - 1) {
            JOptionPane.showMessageDialog(null, "No hay mas campos si desea puede guardar", "Notificación", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        String text = TF_Modificacion.getText();
        if (text.length() == 0) {
            text = (String) registroModificar[currentIndex];
        }
        switch (campoActual.getTipo()) {
            case "int":
                try {
                int numeroEntero = Integer.parseInt(text);
                System.out.println("Número entero: " + numeroEntero);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(rootPane, "Los datos ingresados no son de tipo int", "Error", JOptionPane.ERROR_MESSAGE);
                System.err.println("Error al convertir a entero: " + e.getMessage());
                return;
            }
            break;
            case "double":
                try {
                Double numeroDouble = Double.parseDouble(text);
                System.out.println("Número double: " + numeroDouble);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(rootPane, "Los datos ingresados no son de tipo double", "Error", JOptionPane.ERROR_MESSAGE);
                System.err.println("Error al convertir a double: " + e.getMessage());
                return;
            }
            break;
        }

        if (text.length() > campoActual.getTamano()) {
            JOptionPane.showMessageDialog(rootPane, "Los datos ingresados exceden la longitud estipulada", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (campoActual.isEsLLave() && text.length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "El campo es una llave primaria por favor ingresar los datos correpondientes", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        registroIngresar.add(currentIndex, text);
        TF_Modificacion.setText("");
        ArrayList<Campo> C = file.getListaCampos();
        currentIndex = (currentIndex + 1) % C.size();
        campoActual = C.get(currentIndex);
        J_OrdenCampos.setText("{" + campoActual.getNombre() + ',' + campoActual.getTipo() + ',' + campoActual.getTamano() + ',' + campoActual.isEsLLave() + "}");
        J_RegistroAnterior.setText((String) registroModificar[currentIndex]);
    }//GEN-LAST:event_B_SiguienteModifMouseClicked

    private void B_GuardarRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_GuardarRegistroMouseClicked
        // TODO add your handling code here:
        if (currentIndex != file.getListaCampos().size() - 1) {
            return;
        }
        String text = TF_NuevoRegistro.getText();

        switch (campoActual.getTipo()) {
            case "int":
                try {
                int numeroEntero = Integer.parseInt(text);
                System.out.println("Número entero: " + numeroEntero);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(rootPane, "Los datos ingresados no son de tipo int", "Error", JOptionPane.ERROR_MESSAGE);
                System.err.println("Error al convertir a entero: " + e.getMessage());
                return;
            }
            break;
            case "double":
                try {
                Double numeroDouble = Double.parseDouble(text);
                System.out.println("Número double: " + numeroDouble);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(rootPane, "Los datos ingresados no son de tipo double", "Error", JOptionPane.ERROR_MESSAGE);
                System.err.println("Error al convertir a double: " + e.getMessage());
                return;
            }
            break;
        }

        if (text.length() > campoActual.getTamano()) {
            JOptionPane.showMessageDialog(rootPane, "Los datos ingresados exceden la longitud estipulada", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        registroIngresar.add(currentIndex, text);
        //Metodo para guardar registro
        String registro = "";
        for (int i = 0; i < registroIngresar.size(); i++) {
            registro += registroIngresar.get(i) + "|";
        }
        boolean isInserto = file.insertarRegistro(registro);
        if (!isInserto) {
            JOptionPane.showMessageDialog(null, "El registro no se pudo guardar", "Notificación", JOptionPane.INFORMATION_MESSAGE);
        }
        JOptionPane.showMessageDialog(null, "El registro se guardo con exito", "Notificación", JOptionPane.INFORMATION_MESSAGE);
        TF_NuevoRegistro.setText("");
        registroIngresar.clear();
        Dialog_Introducir.setVisible(false);
    }//GEN-LAST:event_B_GuardarRegistroMouseClicked

    private void B_GuardarModifMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_GuardarModifMouseClicked
        // TODO add your handling code here:
        //Metodo para guardar la modificacion
        if (currentIndex != file.getListaCampos().size() - 1) {
            return;
        }
        String text = TF_Modificacion.getText();

        if (text.length() == 0) {
            text = (String) registroModificar[currentIndex];
        }
        switch (campoActual.getTipo()) {
            case "int":
                try {
                int numeroEntero = Integer.parseInt(text);
                System.out.println("Número entero: " + numeroEntero);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(rootPane, "Los datos ingresados no son de tipo int", "Error", JOptionPane.ERROR_MESSAGE);
                System.err.println("Error al convertir a entero: " + e.getMessage());
                return;
            }
            break;
            case "double":
                try {
                Double numeroDouble = Double.parseDouble(text);
                System.out.println("Número double: " + numeroDouble);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(rootPane, "Los datos ingresados no son de tipo double", "Error", JOptionPane.ERROR_MESSAGE);
                System.err.println("Error al convertir a double: " + e.getMessage());
                return;
            }
            break;
        }

        if (text.length() > campoActual.getTamano()) {
            JOptionPane.showMessageDialog(rootPane, "Los datos ingresados exceden la longitud estipulada", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        registroIngresar.add(currentIndex, text);
        //Metodo para guardar registro
        String registro = "";
        for (int i = 0; i < registroIngresar.size(); i++) {
            registro += registroIngresar.get(i) + "|";
        }
        boolean isModifico = file.modificarRegistro(registro, rnn);
        if (!isModifico) {
            JOptionPane.showMessageDialog(null, "El registro no se pudo modificar", "Notificación", JOptionPane.INFORMATION_MESSAGE);
        }
        JOptionPane.showMessageDialog(null, "El registro se modifico con exito", "Notificación", JOptionPane.INFORMATION_MESSAGE);
        TF_Modificacion.setText("");        
        registroIngresar.clear();
        Dialog_Modificar.setVisible(false);
        rnn = -1;
    }//GEN-LAST:event_B_GuardarModifMouseClicked

    private void Jmenu_RegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jmenu_RegresarMouseClicked
        // TODO add your handling code here:
        JF_Registros.setVisible(false);
        B_Campos.setEnabled(file.canBeEnableCampos());
        this.setVisible(true);
    }//GEN-LAST:event_Jmenu_RegresarMouseClicked

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
    private javax.swing.JButton B_Anterior;
    private javax.swing.JButton B_AnteriorModif;
    private javax.swing.JMenuItem B_Archivo_Abrir;
    private javax.swing.JMenuItem B_Archivo_Cerrar;
    private javax.swing.JMenuItem B_Archivo_Guardar;
    private javax.swing.JMenuItem B_Archivo_Nuevo;
    private javax.swing.JMenuItem B_Archivo_Salir;
    private javax.swing.JButton B_BorrarCampo;
    private javax.swing.JButton B_BorrarRegistro;
    private javax.swing.JButton B_BuscarRegistro;
    private javax.swing.JButton B_Campos;
    private javax.swing.JButton B_CrearCampo;
    private javax.swing.JButton B_CruzarRegistro;
    private javax.swing.JButton B_DesplegarCamposRelacionados;
    private javax.swing.JButton B_EnviarCamposTercerArchivo;
    private javax.swing.JButton B_Estandarizacion;
    private javax.swing.JButton B_GuardadCrearCampo;
    private javax.swing.JButton B_GuardarModif;
    private javax.swing.JButton B_GuardarRegistro;
    private javax.swing.JButton B_Indices;
    private javax.swing.JButton B_IntroducirRegistro;
    private javax.swing.JButton B_ListarCampo;
    private javax.swing.JButton B_ListarRegistro;
    private javax.swing.JButton B_ModificarCampo;
    private javax.swing.JButton B_ModificarRegistro;
    private javax.swing.JButton B_Registros;
    private javax.swing.JButton B_RegresarCrearCampo;
    private javax.swing.JButton B_Siguiente;
    private javax.swing.JButton B_SiguienteModif;
    private javax.swing.JTable Datos_Campos;
    private javax.swing.JTable Datos_Registro;
    private javax.swing.JDialog Dialog_Borrar;
    private javax.swing.JDialog Dialog_Buscar;
    private javax.swing.JDialog Dialog_Cruzar;
    private javax.swing.JDialog Dialog_Introducir;
    private javax.swing.JDialog Dialog_Listar;
    private javax.swing.JDialog Dialog_Modificar;
    private javax.swing.JPanel I_Campo_Decoracion;
    private javax.swing.JPanel I_Fondo_Archivos;
    private javax.swing.JPanel I_Fondo_Main;
    private javax.swing.JPanel I_Fondo_Registro;
    private javax.swing.JPanel I_Icono_Main;
    private javax.swing.JPanel I_PortadaFondo;
    private javax.swing.JPanel I_Registro_Decoracion;
    private javax.swing.JLabel Instruccion10;
    private javax.swing.JLabel Instruccion11;
    private javax.swing.JLabel Instruccion12;
    private javax.swing.JLabel Instruccion13;
    private javax.swing.JLabel Instruccion7;
    private javax.swing.JLabel Instruccion8;
    private javax.swing.JLabel Instruccion9;
    private javax.swing.JFrame JF_Campos;
    private javax.swing.JFrame JF_CrearCampo;
    private javax.swing.JFrame JF_Registros;
    private javax.swing.JLabel JL_Longitud;
    private javax.swing.JLabel JL_Nombre;
    private javax.swing.JLabel JL_Tipo;
    private javax.swing.JLabel J_OrdenCampoInt;
    private javax.swing.JLabel J_OrdenCampos;
    private javax.swing.JLabel J_RegistroAnterior;
    private javax.swing.JMenu Jmenu_Regresar;
    private javax.swing.JMenuBar Menu_Regresar;
    private javax.swing.JPanel P_CrearCapo_Decoracion;
    private javax.swing.JPanel PanelCrearCampo;
    private javax.swing.JPanel Panel_Borrar;
    private javax.swing.JPanel Panel_Buscar;
    private javax.swing.JPanel Panel_Cruzar;
    private javax.swing.JPanel Panel_Decoracion_Borrar;
    private javax.swing.JPanel Panel_Decoracion_Buscar;
    private javax.swing.JPanel Panel_Decoracion_Cruzar;
    private javax.swing.JPanel Panel_Decoracion_Introducir;
    private javax.swing.JPanel Panel_Decoracion_Listar;
    private javax.swing.JPanel Panel_Decoracion_Modificar;
    private javax.swing.JPanel Panel_Introducir;
    private javax.swing.JPanel Panel_Listar;
    private javax.swing.JPanel Panel_Modificar;
    private javax.swing.JFrame Portadita;
    private javax.swing.JButton Regresar_Borrar;
    private javax.swing.JButton Regresar_Buscar;
    private javax.swing.JButton Regresar_Cruzar;
    private javax.swing.JButton Regresar_Introducir;
    private javax.swing.JButton Regresar_Listar;
    private javax.swing.JButton Regresar_Modificar;
    private javax.swing.JTextField TF_Modificacion;
    private javax.swing.JTextField TF_NuevoRegistro;
    private javax.swing.JScrollPane Tabla_Camps;
    private javax.swing.JScrollPane Tabla_Registro;
    private javax.swing.JLabel TituloCrear;
    private javax.swing.JLabel Titulo_Borrar;
    private javax.swing.JLabel Titulo_Buscar;
    private javax.swing.JLabel Titulo_Cruzar;
    private javax.swing.JLabel Titulo_Instruccion;
    private javax.swing.JLabel Titulo_InstruccionIntroducir;
    private javax.swing.JLabel Titulo_Introducir;
    private javax.swing.JLabel Titulo_Listar;
    private javax.swing.JLabel Titulo_Modificar;
    private javax.swing.JLabel Titulo_RegistroAnt;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lb_Archivo_Titulo;
    private javax.swing.JLabel lb_Registro_Titulo;
    private javax.swing.JTextField longitudCampo;
    private javax.swing.JTextField nombreCampo;
    private javax.swing.JComboBox<String> tipoCampo;
    // End of variables declaration//GEN-END:variables
//variables personales

    private String ArchivoCruzado = "";
    private Archivos file = new Archivos();
    private Archivos cruzado = new Archivos();
    private NodoArbol Arbol;
    //public ArrayList<Campo> listaCampos = new ArrayList<Campo>();
    private Clip Music;
    private Campo campoActual;
    private int currentIndex;
    Object[] registroModificar;
    int rnn = -1;
    private ArrayList<String> registroIngresar = new ArrayList();

    //El Archivo tiene nombre,lista de campos(Arraylist),AvailList(LinkedList)
    //Campo: Nombre,Tipo,Tamano
    //Registro: Lista de Campus
    //Indices:
    //Estandarizacion
    public void listarTabla() {
        DefaultTableModel T = (DefaultTableModel) Datos_Campos.getModel();

        // Limpiar la tabla
        T.setRowCount(0);

        ArrayList<Campo> C = file.getListaCampos();
        if (!C.isEmpty()) {

            for (Campo campo : C) {
                Object[] fila = {
                    campo.getNombre(),
                    campo.getTipo(),
                    campo.getTamano(),
                    campo.isEsLLave()
                };
                //T.setColumnClass(3, Boolean.class);
                T.addRow(fila);
            }
        }
    }

    public void listarTablaRegistro(boolean isListar) {
        DefaultTableModel T = (DefaultTableModel) Datos_Registro.getModel();

        // Limpiar la tabla
        T.setRowCount(0);
        if (isListar) {
            file.getRegisterTest();
        }

        if (!file.getListaRegistro().isEmpty()) {
            for (int i = 0; i < file.getListaRegistro().size(); i++) {
                T.addRow(file.getListaRegistro().get(i));
            }
            file.getListaRegistro().clear();
        }

    }

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
