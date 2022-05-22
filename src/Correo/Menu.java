package Correo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Hashtable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {

    Nodo r=null;
    Multilista ml;
    String arr[]= new String[1];
    String arr2[]= new String[2];
    String arr3[]= new String[3];
    String path;
    FileInputStream fi;
    ObjectInputStream oi;
    public Menu() throws FileNotFoundException, IOException, ClassNotFoundException {
        super("Menu");
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        ml = new Multilista(new Listas());
        path="multilista.obj";
        fi = new FileInputStream(path);
        oi = new ObjectInputStream(fi);
        r=(Nodo)oi.readObject();
        fi.close();
        oi.close();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        mover = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        altasp = new javax.swing.JMenuItem();
        bajasp = new javax.swing.JMenuItem();
        consulp = new javax.swing.JMenuItem();
        buscar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        altasc = new javax.swing.JMenuItem();
        bajasc = new javax.swing.JMenuItem();
        consulc = new javax.swing.JMenuItem();
        buscar1 = new javax.swing.JMenuItem();
        verBandejas = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mailogo.png"))); // NOI18N

        mover.setText("Mover correo de una persona a otra");
        mover.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(mover)))
                .addContainerGap(197, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(mover)
                .addContainerGap(123, Short.MAX_VALUE))
        );

        jMenu1.setText("Personas");

        altasp.setText("Altas");
        altasp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaspActionPerformed(evt);
            }
        });
        jMenu1.add(altasp);

        bajasp.setText("Bajas");
        bajasp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bajaspActionPerformed(evt);
            }
        });
        jMenu1.add(bajasp);

        consulp.setText("Consultas");
        consulp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consulpActionPerformed(evt);
            }
        });
        jMenu1.add(consulp);

        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        jMenu1.add(buscar);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Correos");

        altasc.setText("Altas");
        altasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altascActionPerformed(evt);
            }
        });
        jMenu2.add(altasc);

        bajasc.setText("Bajas");
        bajasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bajascActionPerformed(evt);
            }
        });
        jMenu2.add(bajasc);

        consulc.setText("Consultas");
        consulc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consulcActionPerformed(evt);
            }
        });
        jMenu2.add(consulc);

        buscar1.setText("Buscar");
        buscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar1ActionPerformed(evt);
            }
        });
        jMenu2.add(buscar1);

        jMenuBar1.add(jMenu2);

        verBandejas.setText("Bandejas");

        jMenuItem7.setText("Ver bandejas");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        verBandejas.add(jMenuItem7);

        jMenuBar1.add(verBandejas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void altaspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaspActionPerformed
        String nombre="";
        int cve=0, edad=0;
        boolean cancel=false;
        nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
        if(nombre==null){
            System.out.println("acción cancelada");
            cancel=true;
        }
        if(cancel==false){
            try{
            cve = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una clave(númerica):"));
            edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad:"));
            }catch(NumberFormatException e){
                System.out.println("acción cancelada por presionar el botón o por ingresar dato no númerico");
                cancel=true;
            }
            if(cancel==false){
                Nodo p1 = new Nodo(nombre,null,cve,edad);

                arr[0]="";
                r= ml.inserta(r, 0, arr, p1);
                FileOutputStream fo=null;
                try {
                    fo = new FileOutputStream(path);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                }
                ObjectOutputStream oo=null;
                try {
                    oo = new ObjectOutputStream(fo);
                } catch (IOException ex) {
                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    oo.writeObject(r);
                } catch (IOException ex) {
                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    oo.close();
                } catch (IOException ex) {
                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    fo.close();
                } catch (IOException ex) {
                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                }
                JOptionPane.showMessageDialog(null, "Se dió de alta correctamente");
            }
        }
    }//GEN-LAST:event_altaspActionPerformed

    private void bajaspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bajaspActionPerformed
        if(r==null){
            JOptionPane.showMessageDialog(null, "No hay ninguna persona registrada");
        }else{
            String per = (String)JOptionPane.showInputDialog(null, "Elija la persona que desea dar de baja:", "Bajas de Personas", JOptionPane.QUESTION_MESSAGE, null, obtenerOpcPer(), obtenerOpcPer()[0]);
            if(per!=null){
                Nodo el = ml.busca(r, per);
                Nodo ar[]= ml.elimina(r, 0, arr, per);
                    r=ar[1];
                    JOptionPane.showMessageDialog(null, "Se eliminó a "+per+" correctamente.");
                    FileOutputStream fo=null;
                    try {
                        fo = new FileOutputStream(path);
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    ObjectOutputStream oo=null;
                    try {
                        oo = new ObjectOutputStream(fo);
                    } catch (IOException ex) {
                        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    try {
                        oo.writeObject(r);
                    } catch (IOException ex) {
                        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    try {
                        oo.close();
                    } catch (IOException ex) {
                        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    try {
                        fo.close();
                    } catch (IOException ex) {
                        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }else{
                System.out.println("accion cancelada");
            }
        }
    }//GEN-LAST:event_bajaspActionPerformed

    private void consulpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consulpActionPerformed
        ml.desplegarPersonas(r, "");
    }//GEN-LAST:event_consulpActionPerformed

    private void altascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altascActionPerformed
        if(r==null){
            JOptionPane.showMessageDialog(null, "No hay ninguna persona registrada");
        }else{ 
            String per = (String)JOptionPane.showInputDialog(null, "Elija a que persona desea crearle un nuevo correo:", "Nuevo Correo", JOptionPane.QUESTION_MESSAGE, null, obtenerOpcPer(), obtenerOpcPer()[0]);
            if(per!=null){
                String mail = JOptionPane.showInputDialog("Ingrese su nuevo correo: \nEjemplo: 'micorreo@gmail.com'");
                if(mail!=null){
                    String pword = JOptionPane.showInputDialog("Ingrese una contraseña:");
                    if(pword!=null){
                        Nodo pr = ml.busca(r, per);
                        Nodo e1 = new Nodo(mail,null,pword,pr.edad,per);
                        Nodo f1 = new Nodo(mail,null,pr.edad,per);

                        arr2[0]=per;
                        arr2[1]="";
                        r= ml.inserta(r, 0, arr2, e1);
                        arr3[0]=per;
                        arr3[1]=mail;
                        arr3[2]="";
                        r= ml.inserta(r, 0, arr3, f1);
                        FileOutputStream fo=null;
                        try {
                            fo = new FileOutputStream(path);
                        } catch (FileNotFoundException ex) {
                            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        ObjectOutputStream oo=null;
                        try {
                            oo = new ObjectOutputStream(fo);
                        } catch (IOException ex) {
                            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        try {
                            oo.writeObject(r);
                        } catch (IOException ex) {
                            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        try {
                            oo.close();
                        } catch (IOException ex) {
                            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        try {
                            fo.close();
                        } catch (IOException ex) {
                            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        JOptionPane.showMessageDialog(null, "Se agregó correctamente");
                    }else{
                        System.out.println("accion cancelada");
                    } 
                }else{
                    System.out.println("accion cancelada");
                }
            }else{
                System.out.println("accion cancelada");
            }
        }
    }//GEN-LAST:event_altascActionPerformed

    private void bajascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bajascActionPerformed
        if (r==null) {
            JOptionPane.showMessageDialog(null, "No hay ninguna persona registrada");
        }else{
            String per = (String)JOptionPane.showInputDialog(null, "Elija a que persona desea eliminarle un correo:", "Eliminar Correo", JOptionPane.QUESTION_MESSAGE, null, obtenerOpcPer(), obtenerOpcPer()[0]);
            if(per!=null){
                Nodo t = ml.busca(r, per);
                if(t.getAbj()!=null){
                    String ma = (String)JOptionPane.showInputDialog(null, "Elija el correo que desea eliminar:", "Eliminar Correo", JOptionPane.QUESTION_MESSAGE, null, obtenerOpcCor(per), obtenerOpcCor(per)[0]);
                if(ma!=null){

                        t=ml.eliminarCorreo(t, ma);
                        JOptionPane.showMessageDialog(null, "Se eliminó el correo '"+ma+"' correctamente.");
                        FileOutputStream fo=null;
                        try {
                            fo = new FileOutputStream(path);
                        } catch (FileNotFoundException ex) {
                            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        ObjectOutputStream oo=null;
                        try {
                            oo = new ObjectOutputStream(fo);
                        } catch (IOException ex) {
                            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        try {
                            oo.writeObject(r);
                        } catch (IOException ex) {
                            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        try {
                            oo.close();
                        } catch (IOException ex) {
                            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        try {
                            fo.close();
                        } catch (IOException ex) {
                            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }else{
                        System.out.println("accion cancelada");
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "La persona seleccionada no tiene asociado ningún correo");
                }
            }else{
                    System.out.println("accion cancelada");
                }
        }
    }//GEN-LAST:event_bajascActionPerformed

    private void consulcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consulcActionPerformed
        ml.desplegarTodo(r, "");
    }//GEN-LAST:event_consulcActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        if (r==null) {
            JOptionPane.showMessageDialog(null, "No hay ninguna persona registrada");
        }else{
            String per = (String)JOptionPane.showInputDialog(null, "Elija de quien es el correo al que desea ingresar inicialmente:\nNOTA: Una vez dentro podrá cambiar de correos y personas más facil", "Ver bandeja", JOptionPane.QUESTION_MESSAGE, null, obtenerOpcPer(), obtenerOpcPer()[0]);
            if(per!=null){
                Nodo t = ml.busca(r, per);
                if(t.getAbj()!=null){
                    String ma = (String)JOptionPane.showInputDialog(null, "Elija el correo al que desea ingresar:", "Ver bandeja", JOptionPane.QUESTION_MESSAGE, null, obtenerOpcCor(per), obtenerOpcCor(per)[0]);
                    if(ma!=null){

                        t = t.getAbj();
                        Nodo b = ml.busca(t, ma);
                        b=b.getAbj();
                        Visualizar v = new Visualizar(per,b.getD(), b.edad, r, ml, b.pB, b.pE, b.pL, b.pS);
                        this.setVisible(false);
                        v.setVisible(true);
                    }else{
                        System.out.println("accion cancelada");
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "La persona seleccionada no tiene asociado ningún correo");
                }
            }else{
                    System.out.println("accion cancelada");
                }
        }
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        String per = JOptionPane.showInputDialog("Ingrese el nombre que desea buscar y verificar si está en el sistema:");
        if(per!=null){
            Nodo el = ml.busca(r, per);
            if(el==null){
                JOptionPane.showMessageDialog(null, "No existe una persona con ese nombre.\nAsegurese de ingresar el nombre de manera exacta.");
            }else{
                JOptionPane.showMessageDialog(null, "La persona sí existe y está registrada en el sistema.");
            }
        }else{
            System.out.println("accion cancelada");
        }
    }//GEN-LAST:event_buscarActionPerformed

    private void buscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar1ActionPerformed
    boolean enc = false;
        String ma = JOptionPane.showInputDialog("Ingrese el correo que desea buscar si existe en el sistema:");
                if(ma!=null){
                    
                    String vec[] = obtenerOpcPer();
                    for (int i = 0; i <= vec.length-1; i++) {
                        String vec2[] = obtenerOpcCor(vec[i]);
                        for (int j = 0; j <= vec2.length-1; j++) {
                            if(vec2[j].equals(ma)){
                                enc=true;
                            }
                        }
                    }
                    if(enc==false){
                        JOptionPane.showMessageDialog(null, "No existe ese correo en el sistema, recuerde que el correo debe estar exactamente igual escrito.");
                    }else{
                        JOptionPane.showMessageDialog(null, "El correo ingresado sí existe y está en el sistema.");
                    }
                }else{
                    System.out.println("accion cancelada");
                }
    }//GEN-LAST:event_buscar1ActionPerformed

    private void moverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moverActionPerformed
        if (r==null) {
            JOptionPane.showMessageDialog(null, "No hay ninguna persona registrada");
        }else{
            String per = (String)JOptionPane.showInputDialog(null, "Elija la persona que tiene el correo que desea mover:", "Mover correo", JOptionPane.QUESTION_MESSAGE, null, obtenerOpcPer(), obtenerOpcPer()[0]);
            if(per!=null){
                Nodo t = ml.busca(r, per);
                if(t.getAbj()!=null){
                    String ma = (String)JOptionPane.showInputDialog(null, "Elija el correo que desea mover:", "Mover correo", JOptionPane.QUESTION_MESSAGE, null, obtenerOpcCor(per), obtenerOpcCor(per)[0]);
                    if(ma!=null){
                        String per2 = (String)JOptionPane.showInputDialog(null, "Elija la persona a la que desea asignarle el correo:", "Mover correo", JOptionPane.QUESTION_MESSAGE, null, obtenerOpcPer(), obtenerOpcPer()[0]);
                        if(per2!=null){
                            if(per2.equals(per)){
                                JOptionPane.showMessageDialog(null, "No puede mover un correo de A a A");
                            }else{
                                Nodo c = t.getAbj();
                                Nodo b = ml.busca(c, ma);

                                t=ml.eliminarCorreo(t, ma);

                                Nodo pr = ml.busca(r, per2);
                                b.edad = pr.edad;
                                b.getAbj().edad=pr.edad;
                                b.usuario = pr.getD();
                                b.setSig(null);
                                b.setAnt(null);

                                arr2[0]=per2;
                                arr2[1]="";
                                r= ml.inserta(r, 0, arr2, b);

                                JOptionPane.showMessageDialog(null, "Se movió correctamente");
                                FileOutputStream fo=null;
                                try {
                                    fo = new FileOutputStream(path);
                                } catch (FileNotFoundException ex) {
                                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                                }
                                ObjectOutputStream oo=null;
                                try {
                                    oo = new ObjectOutputStream(fo);
                                } catch (IOException ex) {
                                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                                }
                                try {
                                    oo.writeObject(r);
                                } catch (IOException ex) {
                                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                                }
                                try {
                                    oo.close();
                                } catch (IOException ex) {
                                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                                }
                                try {
                                    fo.close();
                                } catch (IOException ex) {
                                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                        }else{
                            System.out.println("accion cancelada");
                        }
                    }else{
                        System.out.println("accion cancelada");
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "La persona seleccionada no tiene asociado ningún correo");
                }
            }else{
                    System.out.println("accion cancelada");
                }
        }
    }//GEN-LAST:event_moverActionPerformed

    /**
     * @param args the command line arguments
     */
    public String[] obtenerOpcPer(){
        int c=0;
        Nodo t=r;
        while (t != null)
        {
            c++;
            t = t.getSig();
        }
        String v[] = new String [c];
        t=r;
        int i=0;
        while (t != null)
        {
            v[i]=t.getD();
            t = t.getSig();
            i++;
        }
        return v;
    }
    public String[] obtenerOpcCor(String per){
        Nodo pr = ml.busca(r, per);
        int c=0;
        Nodo t=pr.getAbj();
        while (t != null)
        {
            c++;
            t = t.getSig();
        }
        String v[] = new String [c];
        t=pr.getAbj();
        int i=0;
        while (t != null)
        {
            v[i]=t.getD();
            t = t.getSig();
            i++;
        }
        return v;
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Menu().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem altasc;
    private javax.swing.JMenuItem altasp;
    private javax.swing.JMenuItem bajasc;
    private javax.swing.JMenuItem bajasp;
    private javax.swing.JMenuItem buscar;
    private javax.swing.JMenuItem buscar1;
    private javax.swing.JMenuItem consulc;
    private javax.swing.JMenuItem consulp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mover;
    private javax.swing.JMenu verBandejas;
    // End of variables declaration//GEN-END:variables
}