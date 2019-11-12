
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        setTitle("RARATEL");
        tampil_tb_kelaskamar();
        tampil_tb_reservasi();
        tampil_tb_pelanggan();
        Tanggal_sekarang();
        jamDigital();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl_tanggal = new javax.swing.JLabel();
        lbl_jam = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        txt_cari_reservasi = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_pemesanan = new javax.swing.JTable();
        edit_reservasi = new javax.swing.JButton();
        segar_pemesanan = new javax.swing.JButton();
        Keluar = new javax.swing.JButton();
        cari_reservasi = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_kamar = new javax.swing.JTable();
        edit_kamar = new javax.swing.JButton();
        segar_kamar = new javax.swing.JButton();
        txt_cari_kamar = new javax.swing.JTextField();
        cari_kamar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tb_pelanggan = new javax.swing.JTable();
        cari_pelanggan = new javax.swing.JButton();
        txt_cari_pelanggan = new javax.swing.JTextField();
        edit_pelanggan = new javax.swing.JButton();
        segar_pelanggan = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        about = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 153, 255));

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("RARATEL | Reservasi Kamar");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Aplikasi untuk pemesanan kamar hotel");

        lbl_tanggal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_tanggal.setForeground(new java.awt.Color(255, 255, 255));
        lbl_tanggal.setText("TANGGAL");

        lbl_jam.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_jam.setForeground(new java.awt.Color(255, 255, 255));
        lbl_jam.setText("JAM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_jam)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_jam))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lbl_tanggal, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.setBackground(new java.awt.Color(102, 153, 255));

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));

        txt_cari_reservasi.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_cari_reservasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cari_reservasiActionPerformed(evt);
            }
        });

        tb_pemesanan.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tb_pemesanan);

        edit_reservasi.setBackground(new java.awt.Color(255, 0, 255));
        edit_reservasi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        edit_reservasi.setForeground(new java.awt.Color(255, 255, 255));
        edit_reservasi.setText("Edit Data Pemesanan");
        edit_reservasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_reservasiActionPerformed(evt);
            }
        });

        segar_pemesanan.setBackground(new java.awt.Color(255, 0, 255));
        segar_pemesanan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        segar_pemesanan.setForeground(new java.awt.Color(255, 255, 255));
        segar_pemesanan.setText("Segarkan Tabel");
        segar_pemesanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                segar_pemesananActionPerformed(evt);
            }
        });

        Keluar.setBackground(new java.awt.Color(204, 0, 0));
        Keluar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Keluar.setForeground(new java.awt.Color(255, 255, 255));
        Keluar.setText("Keluar");
        Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeluarActionPerformed(evt);
            }
        });

        cari_reservasi.setBackground(new java.awt.Color(204, 0, 204));
        cari_reservasi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cari_reservasi.setForeground(new java.awt.Color(255, 255, 255));
        cari_reservasi.setText("Cari");
        cari_reservasi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cari_reservasiMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txt_cari_reservasi, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cari_reservasi, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 767, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(edit_reservasi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(segar_pemesanan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Keluar)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_cari_reservasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cari_reservasi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edit_reservasi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Keluar)
                        .addComponent(segar_pemesanan)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Pemesanan", jPanel2);

        jPanel3.setBackground(new java.awt.Color(51, 255, 102));

        tb_kamar.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tb_kamar);

        edit_kamar.setBackground(new java.awt.Color(255, 0, 255));
        edit_kamar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        edit_kamar.setForeground(new java.awt.Color(255, 255, 255));
        edit_kamar.setText("Edit Data Kamar");
        edit_kamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_kamarActionPerformed(evt);
            }
        });

        segar_kamar.setBackground(new java.awt.Color(255, 0, 255));
        segar_kamar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        segar_kamar.setForeground(new java.awt.Color(255, 255, 255));
        segar_kamar.setText("Segarkan Tabel");
        segar_kamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                segar_kamarActionPerformed(evt);
            }
        });

        txt_cari_kamar.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_cari_kamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cari_kamarActionPerformed(evt);
            }
        });

        cari_kamar.setBackground(new java.awt.Color(204, 0, 204));
        cari_kamar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cari_kamar.setForeground(new java.awt.Color(255, 255, 255));
        cari_kamar.setText("Cari");
        cari_kamar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cari_kamarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 767, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(edit_kamar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(segar_kamar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txt_cari_kamar, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cari_kamar)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_cari_kamar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cari_kamar))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edit_kamar)
                    .addComponent(segar_kamar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Data Kamar", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 51));

        tb_pelanggan.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tb_pelanggan);

        cari_pelanggan.setBackground(new java.awt.Color(204, 0, 204));
        cari_pelanggan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cari_pelanggan.setForeground(new java.awt.Color(255, 255, 255));
        cari_pelanggan.setText("cari");
        cari_pelanggan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cari_pelangganMouseClicked(evt);
            }
        });

        txt_cari_pelanggan.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_cari_pelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cari_pelangganActionPerformed(evt);
            }
        });

        edit_pelanggan.setBackground(new java.awt.Color(255, 0, 255));
        edit_pelanggan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        edit_pelanggan.setForeground(new java.awt.Color(255, 255, 255));
        edit_pelanggan.setText("Edit Data Pelanggan");
        edit_pelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_pelangganActionPerformed(evt);
            }
        });

        segar_pelanggan.setBackground(new java.awt.Color(255, 0, 255));
        segar_pelanggan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        segar_pelanggan.setForeground(new java.awt.Color(255, 255, 255));
        segar_pelanggan.setText("Segarkan Tabel");
        segar_pelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                segar_pelangganActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_cari_pelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cari_pelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(edit_pelanggan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(segar_pelanggan)
                .addContainerGap(485, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 767, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cari_pelanggan)
                    .addComponent(txt_cari_pelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 207, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edit_pelanggan)
                    .addComponent(segar_pelanggan))
                .addContainerGap())
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(45, 45, 45)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(45, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Data Pelanggan", jPanel4);

        jMenu1.setText("Data");
        jMenuBar1.add(jMenu1);

        about.setText("Tentang");
        about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutActionPerformed(evt);
            }
        });
        jMenuBar1.add(about);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void Tanggal_sekarang(){
        java.util.Date sekarang = new java.util.Date();
        java.text.SimpleDateFormat kal = new java.text.SimpleDateFormat ("dd-MM-yyyy") ;
        lbl_tanggal.setText("Tanggal "+kal.format(sekarang));
    }
    public void jamDigital() {
    // ActionListener untuk Keperluan Timer
    ActionListener taskPerformer = new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        String nol_jam = "";
        String nol_menit = "";
        String nol_detik = "";
        // Membuat Date
        Date dt = new Date();
        // Mengambil nilaj JAM, MENIT, dan DETIK Sekarang
        int nilai_jam = dt.getHours();
        int nilai_menit = dt.getMinutes();
        int nilai_detik = dt.getSeconds();
        // Jika nilai JAM lebih kecil dari 10 (hanya 1 digit)
        if (nilai_jam <= 9) {
          // Tambahkan "0" didepannya
          nol_jam = "0";
        }
        // Jika nilai MENIT lebih kecil dari 10 (hanya 1 digit)
        if (nilai_menit <= 9) {
          // Tambahkan "0" didepannya
          nol_menit = "0";
        }
        // Jika nilai DETIK lebih kecil dari 10 (hanya 1 digit)
        if (nilai_detik <= 9) {
          // Tambahkan "0" didepannya
          nol_detik = "0";
        }
        // Membuat String JAM, MENIT, DETIK
        String jam = nol_jam + Integer.toString(nilai_jam);
        String menit = nol_menit + Integer.toString(nilai_menit);
        String detik = nol_detik + Integer.toString(nilai_detik);
        // Menampilkan pada Layar
        lbl_jam.setText("Jam "+jam + ":" + menit + ":" + detik);
      }
    };
    // Timer
    new Timer(1000, taskPerformer).start();
  }
    private DefaultTableModel tabmode;
    public void tampil_tb_kelaskamar(){
        Object []baris = {"Kode Kamar","Kelas Kamar","Check Out","Nama Pelanggan"};
        tabmode = new DefaultTableModel(null, baris);
        tb_kamar.setModel(tabmode);
        Connection con = new koneksi_2().getConnection();
        try {
            String sql = "select * from tb_kelaskamar order by kode_kamar asc";
            java.sql.Statement stat = con.createStatement();
            java.sql.ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()){
                String kode_kamar = hasil.getString("kode_kamar");
                String kelas_kamar = hasil.getString("kelas_kamar");
                String check_out = hasil.getString("check_out");
                String nama_pelanggan = hasil.getString("nama_pelanggan");
                String[] data = {kode_kamar, kelas_kamar, check_out, nama_pelanggan};
                tabmode.addRow(data);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Menampilkan data GAGAL","Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void tampil_tb_reservasi(){
        Object []baris = {"ID","Nama","Nama Kamar","Nomer Kamar","Kelas Kamar","Check In","Check Out"};
        tabmode = new DefaultTableModel(null, baris);
        tb_pemesanan.setModel(tabmode);
        Connection con = new koneksi_2().getConnection();
        try {
            String sql = "select * from tb_reservasi order by id asc";
            java.sql.Statement stat = con.createStatement();
            java.sql.ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()){
                String id = hasil.getString("id");
                String nama = hasil.getString("nama");
                String nama_kamar = hasil.getString("nama_kamar");
                String kode_kamar = hasil.getString("kode_kamar");
                String kelas_kamar = hasil.getString("kelas_kamar"); 
                String check_in = hasil.getString("check_in");
                String check_out = hasil.getString("check_out");
                String[] data = {id, nama, nama_kamar, kode_kamar, kelas_kamar, check_in, check_out};
                tabmode.addRow(data);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Menampilkan data GAGAL","Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void tampil_tb_pelanggan(){
        Object []baris = {"ID","No KTP","Nama Lengkap","Tempat Lahir","Tanggal Lahir","Nama Kamar","Check In"};
        tabmode = new DefaultTableModel(null, baris);
        tb_pelanggan.setModel(tabmode);
        Connection con = new koneksi_2().getConnection();
        try {
            String sql = "select * from tb_pelanggan order by id asc";
            java.sql.Statement stat = con.createStatement();
            java.sql.ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()){
                String id = hasil.getString("id");
                String ktp = hasil.getString("ktp");
                String nama = hasil.getString("nama");
                String tempat_lahir = hasil.getString("tempat_lahir");
                String tanggal_lahir = hasil.getString("tanggal_lahir");
                String nama_kamar = hasil.getString("nama_kamar"); 
                String tanggal_masuk = hasil.getString("tanggal_masuk");
                String[] data = {id, ktp, nama,tempat_lahir, tanggal_lahir, nama_kamar, tanggal_masuk};
                tabmode.addRow(data);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "GAGAL Menampilkan data","Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    private void txt_cari_reservasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cari_reservasiActionPerformed
        // TODO add your handling code here:
        pencarian_reservasi();
    }//GEN-LAST:event_txt_cari_reservasiActionPerformed

    private void txt_cari_kamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cari_kamarActionPerformed
        // TODO add your handling code here:
        pencarian_kamar();
    }//GEN-LAST:event_txt_cari_kamarActionPerformed

    private void txt_cari_pelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cari_pelangganActionPerformed
        // TODO add your handling code here:
        pencarian_pelanggan();
    }//GEN-LAST:event_txt_cari_pelangganActionPerformed

    private void KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeluarActionPerformed
        // TODO add your handling code here:
        new flogin ().setVisible(true);
      this.dispose();
    }//GEN-LAST:event_KeluarActionPerformed

    private void aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aboutActionPerformed

    private void edit_reservasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_reservasiActionPerformed
        // TODO add your handling code here:
        new reservasi(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_edit_reservasiActionPerformed

    private void edit_kamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_kamarActionPerformed
        // TODO add your handling code here:
        new kamar(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_edit_kamarActionPerformed

    private void cari_pelangganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cari_pelangganMouseClicked
        // TODO add your handling code here:
        pencarian_pelanggan();
    }//GEN-LAST:event_cari_pelangganMouseClicked

    private void segar_pelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_segar_pelangganActionPerformed
        // TODO add your handling code here:
        tampil_tb_pelanggan();
    }//GEN-LAST:event_segar_pelangganActionPerformed

    private void segar_pemesananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_segar_pemesananActionPerformed
        // TODO add your handling code here:
        tampil_tb_reservasi();
    }//GEN-LAST:event_segar_pemesananActionPerformed

    private void cari_reservasiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cari_reservasiMouseClicked
        // TODO add your handling code here:
        pencarian_reservasi();
    }//GEN-LAST:event_cari_reservasiMouseClicked

    private void segar_kamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_segar_kamarActionPerformed
        // TODO add your handling code here:
        tampil_tb_kelaskamar();
    }//GEN-LAST:event_segar_kamarActionPerformed

    private void edit_pelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_pelangganActionPerformed
        // TODO add your handling code here:
        new pelanggan(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_edit_pelangganActionPerformed

    private void cari_kamarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cari_kamarMouseClicked
        // TODO add your handling code here:
        pencarian_kamar();
    }//GEN-LAST:event_cari_kamarMouseClicked

    public void pencarian_reservasi(){
        String cari = txt_cari_reservasi.getText();
        //String to=jCombo.getItemAt(i).toString();
        
       Object[] Baris={"ID","Nama","Nama Kamar","Nomer Kamar","Kelas Kamar","Check In","Check Out"};
       tabmode = new DefaultTableModel(null, Baris);
       tb_pemesanan.setModel(tabmode);

       //panggil method koneksi
       Connection koneksi = new koneksi_2().getConnection();
       
       //untuk menampilkan di table
       try{
           String sql="Select * from tb_reservasi where "
                   + "id like '%"+cari+"%' "
                   + "OR nama like '%"+cari+"%' "
                   + "OR kode_kamar like '%"+cari+"%' "
                   + "OR kelas_kamar like '%"+cari+"%' "
                   + "OR check_in like '%"+cari+"%' "
                   + "OR check_out like '%"+cari+"%' "
                   + "order by id asc";
           java.sql.Statement stmt=koneksi.createStatement();
           java.sql.ResultSet rslt=stmt.executeQuery(sql);
           while(rslt.next()){
               String id = rslt.getString("id");
                String nama = rslt.getString("nama");
                String nama_kamar = rslt.getString("nama_kamar");
                String kode_kamar = rslt.getString("kode_kamar");
                String kelas_kamar = rslt.getString("kelas_kamar"); 
                String check_in = rslt.getString("check_in");
                String check_out = rslt.getString("check_out");
                String[] dataField = {id, nama, nama_kamar, kode_kamar, kelas_kamar, check_in, check_out};
                tabmode.addRow(dataField);
           }
       }
       catch(Exception ex){
       }
    }
    public void pencarian_kamar(){
        String cari = txt_cari_kamar.getText();
        
       Object[] Baris={"Kode Kamar","Kelas Kamar","Check Out","Nama Pelanggan"};
       tabmode = new DefaultTableModel(null, Baris);
       tb_kamar.setModel(tabmode);

       //panggil method koneksi
       Connection koneksi = new koneksi_2().getConnection();
       
       //untuk menampilkan di table
       try{
           String sql="Select * from tb_kelaskamar where "
                   + "kode_kamar like '%"+cari+"%' "
                   + "OR kelas_kamar like '%"+cari+"%' "
                   + "OR check_out like '%"+cari+"%' "
                   + "OR nama_pelanggan like '%"+cari+"%' "
                   + "order by kode_kamar asc";
           java.sql.Statement stmt=koneksi.createStatement();
           java.sql.ResultSet rslt=stmt.executeQuery(sql);
           while(rslt.next()){
                String kode_kamar = rslt.getString("kode_kamar");
                String kelas_kamar = rslt.getString("kelas_kamar");
                String check_out = rslt.getString("check_out");
                String nama_pelanggan = rslt.getString("nama_pelanggan");
                String[] dataField = {kode_kamar, kelas_kamar, check_out, nama_pelanggan};
                tabmode.addRow(dataField);
           }
       }
       catch(Exception ex){
       }
    }
    public void pencarian_pelanggan(){
        String cari = txt_cari_pelanggan.getText();
        //String to=jCombo.getItemAt(i).toString();
        
       Object[] Baris={"ID","No KTP","Nama Lengkap","Tempat Lahir","Tanggal Lahir","Nama Kamar","Check In"};
       tabmode = new DefaultTableModel(null, Baris);
       tb_pelanggan.setModel(tabmode);

       //panggil method koneksi
       Connection koneksi = new koneksi_2().getConnection();
       
       //untuk menampilkan di table
       try{
           String sql="Select * from tb_pelanggan where "
                   + "id like '%"+cari+"%' "
                   + "OR nama like '%"+cari+"%' "
                   + "OR ktp like '%"+cari+"%' "
                   + "OR tempat_lahir like '%"+cari+"%' "
                   + "OR tanggal_lahir like '%"+cari+"%' "
                   + "OR nama_kamar like '%"+cari+"%' "
                   + "OR tanggal_masuk like '%"+cari+"%' "
                   + "order by id asc";
           java.sql.Statement stmt=koneksi.createStatement();
           java.sql.ResultSet rslt=stmt.executeQuery(sql);
           while(rslt.next()){
               String id = rslt.getString("id");
                String ktp = rslt.getString("ktp");
                String nama = rslt.getString("nama");
                String tempat_lahir = rslt.getString("tempat_lahir");
                String tanggal_lahir = rslt.getString("tanggal_lahir");
                String nama_kamar = rslt.getString("nama_kamar"); 
                String tanggal_masuk = rslt.getString("tanggal_masuk");
                String[] dataField = {id, ktp, nama,tempat_lahir, tanggal_lahir, nama_kamar, tanggal_masuk};
               tabmode.addRow(dataField);
           }
       }
       catch(Exception ex){
       }
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
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Keluar;
    private javax.swing.JMenu about;
    private javax.swing.JButton cari_kamar;
    private javax.swing.JButton cari_pelanggan;
    private javax.swing.JButton cari_reservasi;
    private javax.swing.JButton edit_kamar;
    private javax.swing.JButton edit_pelanggan;
    private javax.swing.JButton edit_reservasi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbl_jam;
    private javax.swing.JLabel lbl_tanggal;
    private javax.swing.JButton segar_kamar;
    private javax.swing.JButton segar_pelanggan;
    private javax.swing.JButton segar_pemesanan;
    private javax.swing.JTable tb_kamar;
    private javax.swing.JTable tb_pelanggan;
    private javax.swing.JTable tb_pemesanan;
    private javax.swing.JTextField txt_cari_kamar;
    private javax.swing.JTextField txt_cari_pelanggan;
    private javax.swing.JTextField txt_cari_reservasi;
    // End of variables declaration//GEN-END:variables
}
