/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * NewJInternalFrame.java
 *
 * Created on Apr 22, 2016, 8:39:42 AM
 */

package Entry;

import com.mysql.jdbc.Statement;
import java.awt.Dimension;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import sipegadaian.koneksi;
import java.text.SimpleDateFormat;
/**
 *
 * @author Danny1
 */
public class EntryBarang extends javax.swing.JInternalFrame {
public koneksi conn=new koneksi();
public Dimension ukuran_layar;
Connection koneksi=null;
ResultSet rs=null;
Statement st=null;
public JTable tabel=null;
public SimpleDateFormat ganti=new SimpleDateFormat("yyyy-MM-dd");

    /** Creates new form NewJInternalFrame */
    public EntryBarang() {
        initComponents();
        tampilBarang();
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnew = new javax.swing.JButton();
        btsave = new javax.swing.JButton();
        btdelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtbarang = new javax.swing.JTextField();
        txttgl_masuk = new com.toedter.calendar.JDateChooser();
        txttgl_keluar = new com.toedter.calendar.JDateChooser();
        txtnama = new javax.swing.JTextField();
        txthrg_msk = new javax.swing.JTextField();
        txthargakeluar = new javax.swing.JTextField();
        txtjumlah = new javax.swing.JTextField();
        cmbperpanjang = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btdelete1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtbarang1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btcari = new javax.swing.JButton();
        btcari1 = new javax.swing.JButton();

        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/bNew.png"))); // NOI18N
        btnew.setText("NEW");
        btnew.setBorder(new javax.swing.border.SoftBevelBorder(0));
        btnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnewActionPerformed(evt);
            }
        });
        getContentPane().add(btnew, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 80, 30));

        btsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/SAVE.PNG"))); // NOI18N
        btsave.setText("SAVE");
        btsave.setBorder(new javax.swing.border.SoftBevelBorder(0));
        btsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsaveActionPerformed(evt);
            }
        });
        getContentPane().add(btsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 80, 30));

        btdelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/CANCEL.PNG"))); // NOI18N
        btdelete.setText("DELETE");
        btdelete.setBorder(new javax.swing.border.SoftBevelBorder(0));
        btdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btdelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 80, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 800, 190));

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        jLabel2.setText("NAMA NASABAH   :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 140, 20));

        jLabel3.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        jLabel3.setText("NAMA BARANG :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 130, 20));

        txtbarang.setRequestFocusEnabled(false);
        txtbarang.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtbarangFocusLost(evt);
            }
        });
        getContentPane().add(txtbarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 100, -1));

        txttgl_masuk.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txttgl_masukFocusGained(evt);
            }
        });
        getContentPane().add(txttgl_masuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 210, -1));

        txttgl_keluar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txttgl_keluarFocusGained(evt);
            }
        });
        getContentPane().add(txttgl_keluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 210, -1));

        txtnama.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtnamaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtnamaFocusLost(evt);
            }
        });
        getContentPane().add(txtnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 220, -1));

        txthrg_msk.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txthrg_mskFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txthrg_mskFocusLost(evt);
            }
        });
        getContentPane().add(txthrg_msk, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, 100, -1));

        txthargakeluar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txthargakeluarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txthargakeluarFocusLost(evt);
            }
        });
        getContentPane().add(txthargakeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, 100, -1));

        txtjumlah.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtjumlahFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtjumlahFocusLost(evt);
            }
        });
        getContentPane().add(txtjumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, 60, -1));

        cmbperpanjang.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1000", "1500", "2000", "2500", "3000", "3500", "4000", "4500", "5000" }));
        cmbperpanjang.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cmbperpanjangFocusGained(evt);
            }
        });
        getContentPane().add(cmbperpanjang, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, 100, -1));

        jLabel4.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        jLabel4.setText("TANGGAL MASUK  :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 170, 150, 20));

        jLabel5.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        jLabel5.setText("TANGGAL KELUAR :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 210, 150, 20));

        jLabel6.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        jLabel6.setText("HARGA MASUK :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 120, 20));

        jLabel7.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        jLabel7.setText("HARGA KELUAR :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 130, 20));

        jLabel8.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        jLabel8.setText("JUMLAH :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, 70, 20));

        jLabel9.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        jLabel9.setText("Image Barang :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 120, 20));

        btdelete1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/close.png"))); // NOI18N
        btdelete1.setText("CLOSE");
        btdelete1.setBorder(new javax.swing.border.SoftBevelBorder(0));
        btdelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdelete1ActionPerformed(evt);
            }
        });
        getContentPane().add(btdelete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, 80, 30));

        jLabel10.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        jLabel10.setText("PERPANJANG :");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, 110, 20));

        jLabel11.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        jLabel11.setText("IDBARANG      :");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 120, 20));

        txtbarang1.setRequestFocusEnabled(false);
        txtbarang1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtbarang1FocusLost(evt);
            }
        });
        getContentPane().add(txtbarang1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 100, -1));

        jLabel12.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        jLabel12.setText("ID NASABAH   :");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 120, 20));

        btcari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/SEARCH.PNG"))); // NOI18N
        btcari.setText("CARI");
        btcari.setBorder(new javax.swing.border.SoftBevelBorder(0));
        btcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcariActionPerformed(evt);
            }
        });
        getContentPane().add(btcari, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 250, 70, 20));

        btcari1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/SEARCH.PNG"))); // NOI18N
        btcari1.setText("CARI");
        btcari1.setBorder(new javax.swing.border.SoftBevelBorder(0));
        btcari1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcari1ActionPerformed(evt);
            }
        });
        getContentPane().add(btcari1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 70, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents
public int len(String field){
    int len=field.length();
    return len;
}
    private void txtbarangFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtbarangFocusLost
        // TODO add your handling code here:
        }/*
}//GEN-LAST:event_txtbarangFocusLost
*/
    private void txtnamaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnamaFocusLost
        // TODO add your handling code here:
}//GEN-LAST:event_txtnamaFocusLost

    private void txthrg_mskFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txthrg_mskFocusGained
        // TODO add your handling code here:
        if(txtbarang.getText().equals("")){
            JOptionPane.showMessageDialog(null, "ID barang harus diisi", "WARNING",JOptionPane.INFORMATION_MESSAGE);
            txtbarang.setText("00000");
            txtbarang.requestFocus();
        }
}//GEN-LAST:event_txthrg_mskFocusGained

    private void txthrg_mskFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txthrg_mskFocusLost
        // TODO add your handling code here:
}//GEN-LAST:event_txthrg_mskFocusLost

    private void txthargakeluarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txthargakeluarFocusGained
        // TODO add your handling code here:
        if(len(txtnama.getText())==0){
            JOptionPane.showMessageDialog(null, "NAMA barang harus diisi", "WARNING",JOptionPane.INFORMATION_MESSAGE);
            txtnama.setText("Name");
            txtnama.requestFocus();
        }
}//GEN-LAST:event_txthargakeluarFocusGained

    private void txthargakeluarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txthargakeluarFocusLost
        // TODO add your handling code here:
}//GEN-LAST:event_txthargakeluarFocusLost

    private void txtjumlahFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtjumlahFocusGained
        // TODO add your handling code here:
        if(txttgl_masuk.getDate()==null){
            JOptionPane.showMessageDialog(null, "Tanggal masuk barang harus diisi", "WARNING",JOptionPane.INFORMATION_MESSAGE);
            txttgl_masuk.requestFocus();
        }
}//GEN-LAST:event_txtjumlahFocusGained

    private void txtjumlahFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtjumlahFocusLost
        // TODO add your handling code here:
}//GEN-LAST:event_txtjumlahFocusLost

public String getID(){
String id=txtbarang.getText();
return id;

}
public String getNama(){
String nama=txtnama.getText();
    return nama;
}

public String gettgl_msuk(){
String tgl_masuk = null;
if(txttgl_masuk.getDate()!=null){
tgl_masuk=ganti.format(txttgl_masuk.getDate());
}
return tgl_masuk;
}

public String gettgl_keluar(){
String tgl_keluar= null;
if(txttgl_masuk.getDate()!=null){
tgl_keluar=ganti.format(txttgl_keluar.getDate());
}
return tgl_keluar;
}

public String getHrg_msk(){
String hrg_msk=txthrg_msk.getText();
return  hrg_msk;
}

public String getHrg_klr(){
String hrg_keluar=txthargakeluar.getText();
return hrg_keluar;
}
public String getJumlah(){
String jumlah=txtjumlah.getText();
return jumlah;
}
public String getPerpanjang(){
String perpanjang=(String) cmbperpanjang.getSelectedItem();
return perpanjang;
}

private Object[][] getDataBarang(){
    Object[][] data=null;
    try{
        Class.forName("com.mysql.jdbc.Driver");
        koneksi=DriverManager.getConnection("jdbc:mysql://localhost/pegadaian?;","root","");
        st= (Statement) koneksi.createStatement();
        String query="SELECT * FROM barang;";
        rs=st.executeQuery(query);
        rs.last();
        int baris=rs.getRow();
        rs.beforeFirst();
        data=new Object[baris][8];
        int no=-1;
        while(rs.next()){
            no+=1;
            data[no][0]=rs.getString("idbarang");
            data[no][1]=rs.getString("nama");
            data[no][2]=rs.getString("tgl_masuk");
            data[no][3]=rs.getString("tgl_keluar");
            data[no][4]=rs.getString("harga_masuk");
            data[no][5]=rs.getString("harga_keluar");
            data[no][6]=rs.getString("jumlah");
            data[no][7]=rs.getString("perpanjang_per_bln");
        }
        st.close();        
    }
    catch(Exception e){

    }
    return data;
}
    public void tampilBarang(){
        String [] nama_kol={"idbarang","nama","tgl_masuk","tgl_keluar","harga_masuk","harga_keluar","jumlah","perpanjanga"};
        tabel=new JTable(getDataBarang(),nama_kol);
        jScrollPane1.setViewportView(tabel);
    }
    private void btsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsaveActionPerformed
        // TODO add your handling code here:
        String identitas=getID();
        String namabarang=getNama();
        String tgl_masukbarang=gettgl_msuk();
        String tgl_keluarbarang=gettgl_keluar();
        String hrg_mskbarang=getHrg_msk();
        String hrg_keluarbarang=getHrg_klr();
        String jumlahbarang=getJumlah();
        String perpanjangbarang=getPerpanjang();        
        conn.konek();
        String query="INSERT INTO barang VALUE ('"+identitas+"','"+namabarang+"','"+tgl_masukbarang+"','"+tgl_keluarbarang+"','"+hrg_mskbarang+"','"+hrg_keluarbarang+"','"+jumlahbarang+"','"+perpanjangbarang+"');";
        int x=conn.insert(query);
        if(x==1){
            JOptionPane.showMessageDialog(null,"insert berhasil","INFORMASI",JOptionPane.INFORMATION_MESSAGE);
            tampilBarang();
        } else{
            JOptionPane.showMessageDialog(null,"insert gagal","INFORMASI",JOptionPane.WARNING_MESSAGE);
        }
}//GEN-LAST:event_btsaveActionPerformed

    private void btdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdeleteActionPerformed
        // TODO add your handling code here:
        int konfirmasi=JOptionPane.showConfirmDialog(rootPane, "apakah anda yakin ingin menghapus ? ", "haspus",JOptionPane.YES_NO_CANCEL_OPTION);
        if(konfirmasi==JOptionPane.YES_OPTION){
        String idbarang=tabel.getValueAt(tabel.getSelectedRow(),0).toString();
        try{
            conn.konek();
            PreparedStatement ps=null;
            String query="DELETE FROM barang WHERE idbarang=?";
            ps=koneksi.prepareStatement(query);
            ps.setString(1, idbarang);
            int ok=ps.executeUpdate();
            if(ok==1)
                JOptionPane.showMessageDialog(this,"DELETE berhasil","DELETE",JOptionPane.INFORMATION_MESSAGE);
        else
            JOptionPane.showMessageDialog(this,"DELETE GAGAL","DELETE",JOptionPane.INFORMATION_MESSAGE);                        
            ps.close();
            tampilBarang();
        }
        catch(SQLException e){
            System.out.println("HAPUS data GAGAL karena"+e.toString());
        }
        }
        else{
            System.out.print("penghapusan digagalkan");
        }
    }//GEN-LAST:event_btdeleteActionPerformed

    private void btnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnewActionPerformed
        // TODO add your handling code here:
        txtbarang.setText("");
        txthargakeluar.setText("");
        txthrg_msk.setText("");
        txtjumlah.setText("");
        txtnama.setText("");
        txttgl_keluar.setCalendar(null);
        txttgl_masuk.setCalendar(null);
        txtbarang.requestFocus();
    }//GEN-LAST:event_btnewActionPerformed

    private void btdelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdelete1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btdelete1ActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        // TODO add your handling code here:
        /*ukuran_layar=Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((ukuran_layar.width / 2) - (getSize().width / 2), (ukuran_layar.height / 2) - (getSize().height / 2));*/
    }//GEN-LAST:event_formInternalFrameActivated

    private void txtnamaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnamaFocusGained
        // TODO add your handling code here:
  if(len(txthrg_msk.getText())==0){
            JOptionPane.showMessageDialog(null, "Harga Masuk barang harus diisi", "WARNING",JOptionPane.INFORMATION_MESSAGE);
            txthrg_msk.setText("0000");
            txthrg_msk.requestFocus();
        }
    }//GEN-LAST:event_txtnamaFocusGained

    private void txttgl_masukFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txttgl_masukFocusGained
        // TODO add your handling code here:
if(len(txthargakeluar.getText())==0){
            JOptionPane.showMessageDialog(null, "Harga Keluar barang harus diisi", "WARNING",JOptionPane.INFORMATION_MESSAGE);
            txthargakeluar.setText("0000");
            txthargakeluar.requestFocus();
        }
    }//GEN-LAST:event_txttgl_masukFocusGained

    private void txttgl_keluarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txttgl_keluarFocusGained
        // TODO add your handling code here:
if(len(txtjumlah.getText())==0){
            JOptionPane.showMessageDialog(null, "Jumlah barang harus diisi", "WARNING",JOptionPane.INFORMATION_MESSAGE);
            txtjumlah.setText("0000");
            txtjumlah.requestFocus();
}
    }//GEN-LAST:event_txttgl_keluarFocusGained

    private void cmbperpanjangFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbperpanjangFocusGained
        // TODO add your handling code here:
if(txttgl_keluar.getDate()==null){
            JOptionPane.showMessageDialog(null, "Tanggal keluar barang harus diisi", "WARNING",JOptionPane.INFORMATION_MESSAGE);
            txttgl_keluar.requestFocus();
}
    }//GEN-LAST:event_cmbperpanjangFocusGained

    private void txtbarang1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtbarang1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbarang1FocusLost

    private void btcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcariActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_btcariActionPerformed

    private void btcari1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcari1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btcari1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btcari;
    private javax.swing.JButton btcari1;
    private javax.swing.JButton btdelete;
    private javax.swing.JButton btdelete1;
    private javax.swing.JButton btnew;
    private javax.swing.JButton btsave;
    private javax.swing.JComboBox cmbperpanjang;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtbarang;
    private javax.swing.JTextField txtbarang1;
    private javax.swing.JTextField txthargakeluar;
    private javax.swing.JTextField txthrg_msk;
    private javax.swing.JTextField txtjumlah;
    private javax.swing.JTextField txtnama;
    private com.toedter.calendar.JDateChooser txttgl_keluar;
    private com.toedter.calendar.JDateChooser txttgl_masuk;
    // End of variables declaration//GEN-END:variables
}
