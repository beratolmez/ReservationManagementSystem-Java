
package rezervasyon.uygulamasi;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Rezervasyon_Uygulamasi extends javax.swing.JFrame {
    private boolean firmaGirisKontrolu(String kullaniciAdi, String sifre) {
        for (Company firma : admin.getCompany()) {
            if (kullaniciAdi.equals(firma.getUsername()) && sifre.equals(firma.getPassword())) {
                return true;
            }
        }
        return false;
    }
    private String loggedInUsername;

    public Rezervasyon_Uygulamasi() {
        admin.addCompany("firma1", "sifre1", "A", 1000);
        admin.addCompany("firma2", "sifre2", "B", 1000);
        admin.addCompany("firma3", "sifre3", "C", 1000);
        admin.addCompany("firma4", "sifre4", "D", 1000);
        admin.addCompany("firma5", "sifre5", "F", 1000);
        admin.addBusToCompany("firma1", new Bus("Otobüs 1.1.1", "Benzin", 20, 3, "Otobüs 1"));
        admin.addBusToCompany("firma1", new Bus("Otobüs 1.2.1", "Motorin", 15, 3, "Otobüs 2"));
        admin.addBusToCompany("firma2", new Bus("Otobüs 2.1.1", "Benzin", 20, 3, "Otobüs 1"));
        admin.addBusToCompany("firma2", new Bus("Otobüs 2.2.1", "Motorin", 15, 4, "Otobüs 2"));
        admin.addBusToCompany("firma3", new Bus("Otobüs 3.1.1", "Benzin", 20, 4, "Otobüs 1"));
        admin.addAirplaneToCompany("firma3", new Airplane("Uçak 3.1.1", "Gaz", 30, 5, "Uçak 1"));
        admin.addAirplaneToCompany("firma3", new Airplane("Uçak 3.1.2", "Gaz", 30, 5, "Uçak 1"));
        admin.addTrainToCompany("firma4", new Train("Tren 4.1.1", "Elektrik", 25, 1, "Tren 1"));
        admin.addTrainToCompany("firma4", new Train("Tren 4.1.2", "Elektrik", 25, 2, "Tren 1"));
        admin.addTrainToCompany("firma4", new Train("Tren 4.1.3", "Elektrik", 25, 2, "Tren 1"));
        admin.addAirplaneToCompany("firma5", new Airplane("Uçak 5.1.1", "Gaz", 30, 6, "Uçak 1"));
        admin.addAirplaneToCompany("firma5", new Airplane("Uçak 5.1.2", "Gaz", 30, 6, "Uçak 1"));
        
        initComponents();
        DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
        for (Company company :admin.getCompany()){
            String data[] = {company.getCompanyName(), company.getUsername(), 
                company.getPassword(), String.valueOf(company.getServiceFee())};
            tblModel.addRow(data);
        
        }              
    }
    Admin admin = new Admin("admin", "admin");
    Personel personelBus1K = new Personel("Hakan", "Aydın", 5000);
    Personel personelBus1H = new Personel("Melike", "Şaşmaz", 2000);
    Personel personelBus2K = new Personel("Şükrü", "Fidan", 4000);
    Personel personelBus2H = new Personel("Fikri", "Durmaz", 2000);
    Personel personelTrain1K = new Personel("Sıla", "Kerim", 2000);
    Personel personelTrain1H = new Personel("Kerem", "Altan", 1000);
    Personel personelAirplane1K = new Personel("Mete", "Dursun", 10000);
    Personel personelAirplane1H = new Personel("Seher", "Deniz", 6000);
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        choosePanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        username_field = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        pass_field = new javax.swing.JPasswordField();
        button_giris = new javax.swing.JButton();
        pass_show = new javax.swing.JCheckBox();
        adminPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        adminC_ButtonAdd = new javax.swing.JButton();
        adminC_ButonDelete = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        adminC_NameField = new javax.swing.JTextField();
        adminC_UsernameField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        adminC_PassField = new javax.swing.JTextField();
        adminC_ServiceFeeField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        adminBack = new javax.swing.JButton();
        kullaniciPanel = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel17 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        kalkisCombobox = new javax.swing.JComboBox<>();
        varisCombobox = new javax.swing.JComboBox<>();
        aracTuruComboboxK = new javax.swing.JComboBox<>();
        yolculukTarihiCombobox = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        yolcuSayisiSpinner = new javax.swing.JSpinner();
        seferBulButton = new javax.swing.JButton();
        biletFiyatiField = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        userBack = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        biletTable = new javax.swing.JTable();
        biletAlButton = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        firmaPanel = new javax.swing.JPanel();
        companyBack = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        vehicleAddButton = new javax.swing.JButton();
        vehicleDeleteButton = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        aracEC_aracIDField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        aracTuruComboBox = new javax.swing.JComboBox<>();
        aracTipiComboBox = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        seferEC_Table = new javax.swing.JTable();
        adminC_ButtonAdd2 = new javax.swing.JButton();
        adminC_ButonDelete2 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        seferECTripTypeComboBox = new javax.swing.JComboBox<>();
        seferECAracIDComboBox = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        seferECGuzergahField = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        gelirField = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        giderField = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        kazancField = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        vehicle_AD_Button = new javax.swing.JButton();
        trip_AD_Button = new javax.swing.JButton();
        company_CostButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setMinimumSize(new java.awt.Dimension(800, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(153, 153, 153));

        choosePanel.setBackground(new java.awt.Color(102, 102, 102));
        choosePanel.setPreferredSize(new java.awt.Dimension(800, 600));

        jPanel2.setBackground(new java.awt.Color(102, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Haettenschweiler", 0, 48)); // NOI18N
        jLabel1.setText("GIRIS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(331, 331, 331))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(27, 27, 27))
        );

        jButton1.setBackground(new java.awt.Color(102, 153, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setLabel("Bilet Ara");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("Kullanıcı Adı :");

        username_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username_fieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(username_field, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(username_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Şifre:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(pass_field, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(pass_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        button_giris.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        button_giris.setText("Giris Yap");
        button_giris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_girisActionPerformed(evt);
            }
        });

        pass_show.setBackground(new java.awt.Color(0, 0, 0));
        pass_show.setForeground(new java.awt.Color(255, 255, 255));
        pass_show.setText("Şifreyi Göster");
        pass_show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pass_showActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout choosePanelLayout = new javax.swing.GroupLayout(choosePanel);
        choosePanel.setLayout(choosePanelLayout);
        choosePanelLayout.setHorizontalGroup(
            choosePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, choosePanelLayout.createSequentialGroup()
                .addContainerGap(233, Short.MAX_VALUE)
                .addGroup(choosePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, choosePanelLayout.createSequentialGroup()
                        .addGroup(choosePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(choosePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(choosePanelLayout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addGroup(choosePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(pass_show, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(choosePanelLayout.createSequentialGroup()
                                    .addGap(125, 125, 125)
                                    .addComponent(button_giris))))
                        .addGap(225, 225, 225))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, choosePanelLayout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97))))
        );
        choosePanelLayout.setVerticalGroup(
            choosePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, choosePanelLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pass_show)
                .addGap(15, 15, 15)
                .addComponent(button_giris)
                .addGap(58, 58, 58)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(176, 176, 176))
        );

        jTabbedPane1.addTab("SECIM", choosePanel);

        adminPanel.setBackground(new java.awt.Color(102, 102, 102));
        adminPanel.setPreferredSize(new java.awt.Dimension(800, 600));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Firma İsmi", "Kullanıcı Adı", "Şifre", "Hizmet Bedeli"
            }
        ));
        jTable1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jTable1ComponentAdded(evt);
            }
        });
        jTable1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                jTable1ComponentMoved(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        adminC_ButtonAdd.setText("Ekle");
        adminC_ButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminC_ButtonAddActionPerformed(evt);
            }
        });

        adminC_ButonDelete.setText("Sil");
        adminC_ButonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminC_ButonDeleteActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Kullanıcı Adı :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Firma İsmi :");

        adminC_NameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminC_NameFieldActionPerformed(evt);
            }
        });

        adminC_UsernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminC_UsernameFieldActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Şifre :");

        adminC_PassField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminC_PassFieldActionPerformed(evt);
            }
        });

        adminC_ServiceFeeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminC_ServiceFeeFieldActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Hizmet Bedeli :");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(adminC_NameField))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(adminC_UsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adminC_PassField, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminC_ServiceFeeField))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adminC_ServiceFeeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(adminC_PassField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adminC_NameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(adminC_UsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        adminBack.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        adminBack.setText("GERİ");
        adminBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout adminPanelLayout = new javax.swing.GroupLayout(adminPanel);
        adminPanel.setLayout(adminPanelLayout);
        adminPanelLayout.setHorizontalGroup(
            adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(adminBack)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(adminPanelLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(adminC_ButtonAdd)
                        .addGap(148, 148, 148)
                        .addComponent(adminC_ButonDelete)
                        .addGap(106, 106, 106)))
                .addGap(147, 147, 147))
        );
        adminPanelLayout.setVerticalGroup(
            adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(adminBack, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminC_ButtonAdd)
                    .addComponent(adminC_ButonDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Admin", adminPanel);

        kullaniciPanel.setBackground(new java.awt.Color(102, 102, 102));
        kullaniciPanel.setPreferredSize(new java.awt.Dimension(800, 600));

        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel17.setBackground(new java.awt.Color(102, 102, 102));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Yolculuk Tarihi :");

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Araç Türü         :");

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Varış Noktası   :");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Kalkış Noktası  :");

        kalkisCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "İstanbul", "Kocaeli", "Bilecik", "Ankara", "Eskişehir", "Konya" }));
        kalkisCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kalkisComboboxActionPerformed(evt);
            }
        });

        varisCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "İstanbul", "Kocaeli", "Bilecik", "Ankara", "Eskişehir", "Konya" }));

        aracTuruComboboxK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aracTuruComboboxKActionPerformed(evt);
            }
        });

        yolculukTarihiCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4 Aralık 2023", "5 Aralık 2023", "6 Aralık 2023", "7 Aralık 2023", "8 Aralık 2023", "9 Aralık 2023", "10 Aralık 2023" }));
        yolculukTarihiCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yolculukTarihiComboboxActionPerformed(evt);
            }
        });

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Yolcu Sayısı :");

        seferBulButton.setText("Sefer Bul");

        jLabel31.setText("Bilet Fiyatı :");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(kalkisCombobox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(yolculukTarihiCombobox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(aracTuruComboboxK, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(varisCombobox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(seferBulButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(biletFiyatiField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(yolcuSayisiSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(12, Short.MAX_VALUE))))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kalkisCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel17)
                    .addComponent(yolcuSayisiSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(varisCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(aracTuruComboboxK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(yolculukTarihiCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(biletFiyatiField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(seferBulButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
        );

        userBack.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        userBack.setText("GERİ");
        userBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userBackActionPerformed(evt);
            }
        });

        biletTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Koltuk Numarası", "Firma", "Araç ID", "Koltuk Durumu"
            }
        ));
        jScrollPane4.setViewportView(biletTable);
        if (biletTable.getColumnModel().getColumnCount() > 0) {
            biletTable.getColumnModel().getColumn(1).setResizable(false);
        }

        biletAlButton.setText("Bilet Al");
        biletAlButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                biletAlButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(userBack)
                        .addGap(117, 117, 117)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(biletAlButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(187, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(userBack, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(biletAlButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Satın Al", jPanel17);

        jPanel16.setBackground(new java.awt.Color(102, 102, 102));

        jLabel25.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        jLabel25.setText("YOLCU ;");

        jLabel22.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 14)); // NOI18N
        jLabel22.setText("  İsim Soyisim  :");

        jLabel23.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 14)); // NOI18N
        jLabel23.setText(" TC Numarası  :");

        jLabel24.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 14)); // NOI18N
        jLabel24.setText("Doğum Tarihi :");

        jLabel26.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 14)); // NOI18N
        jLabel26.setText("Kart Bilgileri :");

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jButton3.setText("Bilet Al");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField7))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel25)
                            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel14Layout.createSequentialGroup()
                                    .addGap(3, 3, 3)
                                    .addComponent(jLabel24))
                                .addComponent(jLabel22)
                                .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(146, 146, 146))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(jButton3)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(237, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(230, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Bilet Seçim", jPanel16);

        jPanel13.add(jTabbedPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -50, -1, 650));

        javax.swing.GroupLayout kullaniciPanelLayout = new javax.swing.GroupLayout(kullaniciPanel);
        kullaniciPanel.setLayout(kullaniciPanelLayout);
        kullaniciPanelLayout.setHorizontalGroup(
            kullaniciPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        kullaniciPanelLayout.setVerticalGroup(
            kullaniciPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Kullanıcı", kullaniciPanel);

        firmaPanel.setBackground(new java.awt.Color(102, 102, 102));
        firmaPanel.setPreferredSize(new java.awt.Dimension(800, 600));

        companyBack.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        companyBack.setText("GERİ");
        companyBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                companyBackActionPerformed(evt);
            }
        });

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Araç ID", "Araç Türü", "Araç Tipi"
            }
        ));
        jTable2.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jTable2ComponentAdded(evt);
            }
        });
        jTable2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                jTable2ComponentMoved(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        vehicleAddButton.setText("Ekle");
        vehicleAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vehicleAddButtonActionPerformed(evt);
            }
        });

        vehicleDeleteButton.setText("Sil");
        vehicleDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vehicleDeleteButtonActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Araç Türü :");

        aracEC_aracIDField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aracEC_aracIDFieldActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Araç ID :");

        aracTuruComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Otobüs", "Tren", "Uçak" }));
        aracTuruComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                aracTuruComboBoxİtemStateChanged(evt);
            }
        });
        aracTuruComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aracTuruComboBoxActionPerformed(evt);
            }
        });

        aracTipiComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Otobüs 1", "Otobüs 2" }));
        aracTipiComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aracTipiComboBoxActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setText("Araç Tipi :");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(aracTipiComboBox, 0, 123, Short.MAX_VALUE)
                            .addComponent(aracTuruComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 16, Short.MAX_VALUE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(aracEC_aracIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(aracEC_aracIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(aracTuruComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aracTipiComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(vehicleAddButton)
                                .addGap(86, 86, 86)
                                .addComponent(vehicleDeleteButton)))))
                .addGap(50, 50, 50))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vehicleAddButton)
                    .addComponent(vehicleDeleteButton))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(185, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Araç E/Ç", jPanel7);

        jPanel8.setBackground(new java.awt.Color(204, 204, 204));
        jPanel8.setPreferredSize(new java.awt.Dimension(520, 600));

        seferEC_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sefer Türü", "Araç ID"
            }
        ));
        seferEC_Table.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                seferEC_TableComponentAdded(evt);
            }
        });
        seferEC_Table.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                seferEC_TableComponentMoved(evt);
            }
        });
        jScrollPane3.setViewportView(seferEC_Table);

        adminC_ButtonAdd2.setText("Ekle");
        adminC_ButtonAdd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminC_ButtonAdd2ActionPerformed(evt);
            }
        });

        adminC_ButonDelete2.setText("Sil");
        adminC_ButonDelete2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminC_ButonDelete2ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setText("Sefer Türü :");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setText("Araç ID :");

        seferECTripTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1. Sefer (Demiryolu)", "2. Sefer (Demiryolu)", "3. Sefer (Karayolu)", "4. Sefer (Karayolu)", "5. Sefer (Havayolu)", "6. Sefer (Havayolu)", " " }));
        seferECTripTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seferECTripTypeComboBoxActionPerformed(evt);
            }
        });

        seferECAracIDComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seferECAracIDComboBoxActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setText("Güzergah :");

        seferECGuzergahField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seferECGuzergahFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(seferECTripTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(seferECAracIDComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(seferECGuzergahField))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(seferECTripTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(seferECAracIDComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(seferECGuzergahField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(adminC_ButtonAdd2)
                .addGap(105, 105, 105)
                .addComponent(adminC_ButonDelete2)
                .addGap(133, 133, 133))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminC_ButonDelete2)
                    .addComponent(adminC_ButtonAdd2))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Sefer E/Ç", jPanel8);

        jPanel9.setBackground(new java.awt.Color(204, 204, 204));

        jLabel19.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel19.setText("Tahmini Gelir :");

        jLabel20.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel20.setText("Tahmini Gider :");

        jLabel21.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel21.setText("Tahmini Kazanç :");

        jButton2.setText("Hesapla");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 0, 0));
        jLabel27.setText("Bilgilendirme !");

        jLabel28.setText("Hesaplanan değerler günlük bazda olup, hesapla butonuna");

        jLabel29.setText("tıklandığı andan itibaren sonuçları güncelleyerek göstermektedir. Tahmini gelir");

        jLabel30.setText("bütün araçların bütün koltuklarının rezerve edildiği duruma göre hesaplanır.");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kazancField, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(giderField, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(gelirField, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(135, 135, 135))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel28))
                            .addComponent(jLabel30)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gelirField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(giderField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kazancField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel30)
                .addContainerGap(174, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Şirket M. İ.", jPanel9);

        jPanel6.add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -49, -1, 650));

        vehicle_AD_Button.setText("Araç Ekle/Çıkar");
        vehicle_AD_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vehicle_AD_ButtonActionPerformed(evt);
            }
        });

        trip_AD_Button.setText("Sefer Ekle/Çıkar");
        trip_AD_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trip_AD_ButtonActionPerformed(evt);
            }
        });

        company_CostButton.setText("Şirket Maliyet İşlemleri");
        company_CostButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                company_CostButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout firmaPanelLayout = new javax.swing.GroupLayout(firmaPanel);
        firmaPanel.setLayout(firmaPanelLayout);
        firmaPanelLayout.setHorizontalGroup(
            firmaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(firmaPanelLayout.createSequentialGroup()
                .addGroup(firmaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(firmaPanelLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(companyBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, firmaPanelLayout.createSequentialGroup()
                        .addGap(0, 61, Short.MAX_VALUE)
                        .addGroup(firmaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(vehicle_AD_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(company_CostButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(trip_AD_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69)))
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        firmaPanelLayout.setVerticalGroup(
            firmaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(firmaPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(companyBack, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120)
                .addComponent(vehicle_AD_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(trip_AD_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(company_CostButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Firma", firmaPanel);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, -24, 820, 630));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTabbedPane1.setSelectedIndex(2);
        String kalkisNoktasi = (String) kalkisCombobox.getSelectedItem();
        String varisNoktasi = (String) varisCombobox.getSelectedItem();

        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void username_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_username_fieldActionPerformed

    private void button_girisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_girisActionPerformed

        boolean girisBasarili = firmaGirisKontrolu(username_field.getText(), pass_field.getText());
        
        if(username_field.getText().equals(admin.getUsername()) && pass_field.getText().equals(admin.getPassword())){
            JOptionPane.showMessageDialog(null, "Giriş Başarılı. Admin Paneline Yönlendiriliyorsunuz...");
            jTabbedPane1.setSelectedIndex(1);
        }
        
        else if (girisBasarili) {
            loggedInUsername = username_field.getText();
            List<Bus> buss = admin.findCompanyByUsername(loggedInUsername).getBuss();
            List<Train> trains = admin.findCompanyByUsername(loggedInUsername).getTrains();
            List<Airplane> airplanes = admin.findCompanyByUsername(loggedInUsername).getAirplanes();
            DefaultTableModel tblModel = (DefaultTableModel) jTable2.getModel();
            for (Bus bus : buss) {
                tblModel.addRow(new Object[]{bus.getVehicleId(), "Otobüs", bus.getVehicleType()});
            }
           
            for (Train train : trains) {
                tblModel.addRow(new Object[]{train.getVehicleId(), "Tren", train.getVehicleType()});
            }

            for (Airplane airplane : airplanes) {
                tblModel.addRow(new Object[]{airplane.getVehicleId(), "Uçak", airplane.getVehicleType()});
            }
            
            List<Train> trains1 = admin.findCompanyByUsername(loggedInUsername).getTrains();
            List<Bus> buss1 = admin.findCompanyByUsername(loggedInUsername).getBuss();
            List<Airplane> airplanes1 = admin.findCompanyByUsername(loggedInUsername).getAirplanes();
            DefaultTableModel tblModel1 = (DefaultTableModel) seferEC_Table.getModel();
                for (Train train1 : trains1) {
                    if(train1.getTripNumber() != 0){
                    tblModel1.addRow(new Object[]{train1.getTripNumber()+". sefer" ,train1.getVehicleId()});
                    }
                    else{
                    tblModel1.addRow(new Object[]{"Seferi yok." ,train1.getVehicleId()});
                    }
            }
                for (Bus bus1 : buss1) {
                    if(bus1.getTripNumber() != 0){
                    tblModel1.addRow(new Object[]{bus1.getTripNumber()+". sefer" ,bus1.getVehicleId()});
                    }
                    else{
                    tblModel1.addRow(new Object[]{"Seferi yok." ,bus1.getVehicleId()});
                    }
            }
                for (Airplane airplane1 : airplanes1) {
                    if(airplane1.getTripNumber() != 0){
                    tblModel1.addRow(new Object[]{airplane1.getTripNumber()+". sefer" ,airplane1.getVehicleId()});
                    }
                    else{
                    tblModel1.addRow(new Object[]{"Seferi yok." ,airplane1.getVehicleId()});
                    }
            }  
            JOptionPane.showMessageDialog(null, "Giriş Başarılı. Firma Paneline Yönlendiriliyorsunuz...");    
            jTabbedPane1.setSelectedIndex(3);
        } 
        
        
        else{
                JOptionPane.showMessageDialog(null, "Kullanıcı Adı veya Şifre Hatalı!");
        }
    }//GEN-LAST:event_button_girisActionPerformed

    private void pass_showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pass_showActionPerformed
        if(pass_show.isSelected()){
            pass_field.setEchoChar((char)0);
        }
        else{
            pass_field.setEchoChar('*');
        }
    }//GEN-LAST:event_pass_showActionPerformed

    private void adminC_ButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminC_ButtonAddActionPerformed
        if(adminC_NameField.getText().equals("")||adminC_UsernameField.getText().equals("")||
                adminC_PassField.getText().equals("")||adminC_ServiceFeeField.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Lütfen Tüm Bilgileri Giriniz!");
        }
        else if(!adminC_ServiceFeeField.getText().matches("\\d+")){
            JOptionPane.showMessageDialog(this, "Hizmet Bedelini Doğru Bir Değer Giriniz!");
        }
        else{
            String data[] = {adminC_NameField.getText(), adminC_UsernameField.getText(), 
                adminC_PassField.getText(), adminC_ServiceFeeField.getText()};
            admin.addCompany(adminC_UsernameField.getText(), adminC_PassField.getText(),
                    adminC_NameField.getText(), Integer.parseInt(adminC_ServiceFeeField.getText()));
            DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
            tblModel.addRow(data);
            JOptionPane.showMessageDialog(this, "Firma Sisteme Eklendi.");
            adminC_NameField.setText("");
            adminC_UsernameField.setText("");
            adminC_PassField.setText("");
            adminC_ServiceFeeField.setText("");
        }
    }//GEN-LAST:event_adminC_ButtonAddActionPerformed

    private void adminC_ButonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminC_ButonDeleteActionPerformed
        DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
        
        if(jTable1.getSelectedRowCount() == 1){
            int selectedRow = jTable1.getSelectedRow();
            int selectedColumn = jTable1.getSelectedColumn();
            admin.deleteCompany((String) jTable1.getValueAt(selectedRow, 0));
            tblModel.removeRow(jTable1.getSelectedRow());
        }
        else{
            if(jTable1.getRowCount() == 0){
                JOptionPane.showMessageDialog(this, "Kayıtlı Firma Yok.");
            }
            else{
                JOptionPane.showMessageDialog(this, "Lütfen Silmek İçin Sadece Bir Firma Seçin.");
            }
        }
    }//GEN-LAST:event_adminC_ButonDeleteActionPerformed

    private void adminC_NameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminC_NameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminC_NameFieldActionPerformed

    private void adminC_UsernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminC_UsernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminC_UsernameFieldActionPerformed

    private void adminC_PassFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminC_PassFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminC_PassFieldActionPerformed

    private void adminC_ServiceFeeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminC_ServiceFeeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminC_ServiceFeeFieldActionPerformed

    private void jTable1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jTable1ComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1ComponentAdded

    private void adminBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminBackActionPerformed
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_adminBackActionPerformed

    private void userBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userBackActionPerformed
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_userBackActionPerformed

    private void companyBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_companyBackActionPerformed
        jTabbedPane1.setSelectedIndex(0);
        DefaultTableModel tblModel = (DefaultTableModel) jTable2.getModel();
        tblModel.setRowCount(0);
        DefaultTableModel tblModel1 = (DefaultTableModel) seferEC_Table.getModel();
        tblModel1.setRowCount(0);
        gelirField.setText("");
        giderField.setText("");
        kazancField.setText("");
    }//GEN-LAST:event_companyBackActionPerformed

    private void jTable1ComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTable1ComponentMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1ComponentMoved

    private void vehicle_AD_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vehicle_AD_ButtonActionPerformed
         jTabbedPane2.setSelectedIndex(0);
    }//GEN-LAST:event_vehicle_AD_ButtonActionPerformed

    private void trip_AD_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trip_AD_ButtonActionPerformed
         jTabbedPane2.setSelectedIndex(1);
    }//GEN-LAST:event_trip_AD_ButtonActionPerformed

    private void jTable2ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jTable2ComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable2ComponentAdded

    private void jTable2ComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTable2ComponentMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable2ComponentMoved

    private void vehicleDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vehicleDeleteButtonActionPerformed
        DefaultTableModel tblModel = (DefaultTableModel) jTable2.getModel();
        
        if(jTable2.getSelectedRowCount() == 1){
            int selectedRow = jTable2.getSelectedRow();
            //int selectedColumn = jTable2.getSelectedColumn();
            if("Otobüs".equals((String) jTable2.getValueAt(selectedRow, 1))){
            admin.deleteBusFromCompany(loggedInUsername,(String) jTable2.getValueAt(selectedRow, 0));   
            }
            else if("Tren".equals((String) jTable2.getValueAt(selectedRow, 1))){
            admin.deleteTrainFromCompany(loggedInUsername,(String) jTable2.getValueAt(selectedRow, 0));   
            }
            else if("Uçak".equals((String) jTable2.getValueAt(selectedRow, 1))){
            admin.deleteAirplaneFromCompany(loggedInUsername,(String) jTable2.getValueAt(selectedRow, 0));   
            }
            tblModel.removeRow(jTable2.getSelectedRow());
        }
        else{
            if(jTable2.getRowCount() == 0){
                JOptionPane.showMessageDialog(this, "Kayıtlı Araç Yok.");
            }
            else{
                JOptionPane.showMessageDialog(this, "Lütfen Silmek İçin Sadece Bir Firma Seçin.");
            }
        }
    }//GEN-LAST:event_vehicleDeleteButtonActionPerformed

    private void aracEC_aracIDFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aracEC_aracIDFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aracEC_aracIDFieldActionPerformed

    private void aracTuruComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aracTuruComboBoxActionPerformed
        switch (aracTuruComboBox.getSelectedIndex()) {
            case 0 -> {
                aracTipiComboBox.removeAllItems();
                aracTipiComboBox.addItem("Otobüs 1");
                aracTipiComboBox.addItem("Otobüs 2");                
            }
            case 1 -> {
                aracTipiComboBox.removeAllItems();
                aracTipiComboBox.addItem("Tren 1");
            }
            case 2 -> {
                aracTipiComboBox.removeAllItems();
                aracTipiComboBox.addItem("Uçak 1");
            }
            default -> {
            }
        }
    }//GEN-LAST:event_aracTuruComboBoxActionPerformed

    private void seferEC_TableComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_seferEC_TableComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_seferEC_TableComponentAdded

    private void seferEC_TableComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_seferEC_TableComponentMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_seferEC_TableComponentMoved

    private void adminC_ButonDelete2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminC_ButonDelete2ActionPerformed
        DefaultTableModel tblModel = (DefaultTableModel) seferEC_Table.getModel();
        if(seferEC_Table.getSelectedRowCount() == 1){
            int selectedRow = seferEC_Table.getSelectedRow();
            admin.updateTripNumberForVehicle(loggedInUsername, (String)seferEC_Table.getValueAt(selectedRow, 1), 0);
            tblModel.removeRow(seferEC_Table.getSelectedRow());
        }
        else{
            if(seferEC_Table.getRowCount() == 0){
                JOptionPane.showMessageDialog(this, "Kayıtlı Araç Yok.");
            }
            else{
                JOptionPane.showMessageDialog(this, "Lütfen Silmek İçin Sadece Bir Araç Seçin.");
            }
        }
    }//GEN-LAST:event_adminC_ButonDelete2ActionPerformed

    private void seferECTripTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seferECTripTypeComboBoxActionPerformed
                switch (seferECTripTypeComboBox.getSelectedIndex()) {
            case 0 -> {
                seferECAracIDComboBox.removeAllItems();
                seferECGuzergahField.setText("İstanbul-Kocaeli-Bilecik-Eskişehir-Ankara-Eskişehir-Bilecik-Kocaeli-İstanbul");
                List<Train> trains = admin.findCompanyByUsername(loggedInUsername).getTrains();
                for (Train train : trains) {
                    seferECAracIDComboBox.addItem(train.getVehicleId());
                }
                
            }
            case 1 -> {
                seferECAracIDComboBox.removeAllItems();
                seferECGuzergahField.setText("İstanbul-Kocaeli-Bilecik-Eskişehir-Konya-Eskişehir-Bilecik-Kocaeli-İstanbul");
                List<Train> trains = admin.findCompanyByUsername(loggedInUsername).getTrains();
                for (Train train : trains) {
                    seferECAracIDComboBox.addItem(train.getVehicleId());
                }
            }
            case 2 -> {
                seferECAracIDComboBox.removeAllItems();
                seferECGuzergahField.setText("İstanbul-Kocaeli-Ankara-Kocaeli-İstanbul-Kocaeli-Ankara-Kocaeli-İstanbul");
                List<Bus> buss = admin.findCompanyByUsername(loggedInUsername).getBuss();
                for (Bus bus : buss) {
                    seferECAracIDComboBox.addItem(bus.getVehicleId());
                }
            }
            case 3 -> {
                seferECAracIDComboBox.removeAllItems();  
                seferECGuzergahField.setText("İstanbul-Kocaeli-Eskişehir-Konya-Eskişehir-Kocaeli-İstanbul");
                List<Bus> buss = admin.findCompanyByUsername(loggedInUsername).getBuss();
                for (Bus bus : buss) {
                    seferECAracIDComboBox.addItem(bus.getVehicleId());
                }
            }
            case 4 -> {
                seferECAracIDComboBox.removeAllItems();
                seferECGuzergahField.setText("İstanbul-Konya-İstanbul");
                List<Airplane> airplanes = admin.findCompanyByUsername(loggedInUsername).getAirplanes();
                for (Airplane airplane : airplanes) {
                    seferECAracIDComboBox.addItem(airplane.getVehicleId());
                }
            }
            case 5 -> {
                seferECAracIDComboBox.removeAllItems();
                seferECGuzergahField.setText("İstanbul-Ankara-İstanbul");
                List<Airplane> airplanes = admin.findCompanyByUsername(loggedInUsername).getAirplanes();
                for (Airplane airplane : airplanes) {
                    seferECAracIDComboBox.addItem(airplane.getVehicleId());
                }
            }  
            default -> {
            }
        }
    }//GEN-LAST:event_seferECTripTypeComboBoxActionPerformed

    private void aracTuruComboBoxİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_aracTuruComboBoxİtemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_aracTuruComboBoxİtemStateChanged

    private void vehicleAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vehicleAddButtonActionPerformed
        if(aracEC_aracIDField.getText().equals("")||(aracTipiComboBox.getItemCount() == 0)){
            JOptionPane.showMessageDialog(this, "Lütfen Tüm Bilgileri Giriniz!");
        }
        else{
            switch (aracTuruComboBox.getSelectedIndex()) {
                case 0:
                    if(aracTipiComboBox.getSelectedIndex() == 0){
                        admin.addBusToCompany(loggedInUsername,new Bus(aracEC_aracIDField.getText(), "Benzin", 20, 0, "Otobüs 1" ));
                    }
                    else{
                        admin.addBusToCompany(loggedInUsername,new Bus(aracEC_aracIDField.getText(), "Motorin", 15, 0, "Otobüs 2" ));
                    }   break;
                case 1:
                    admin.addTrainToCompany(loggedInUsername,new Train(aracEC_aracIDField.getText(), "Elektrik", 25, 0, "Tren 1" ));
                    break;
                case 2:
                    admin.addAirplaneToCompany(loggedInUsername,new Airplane(aracEC_aracIDField.getText(), "Gaz", 30, 0, "Uçak 1" ));
                    break;
                default:
                    break;
            }
            DefaultTableModel tblModel = (DefaultTableModel) jTable2.getModel();
            String data[] = {aracEC_aracIDField.getText(), (String) aracTuruComboBox.getSelectedItem(), (String) aracTipiComboBox.getSelectedItem()};
            tblModel.addRow(data);
            JOptionPane.showMessageDialog(this, "Araç Sisteme Eklendi.");
            aracEC_aracIDField.setText("");
        }
    }//GEN-LAST:event_vehicleAddButtonActionPerformed

    private void aracTipiComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aracTipiComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aracTipiComboBoxActionPerformed

    private void seferECAracIDComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seferECAracIDComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seferECAracIDComboBoxActionPerformed

    private void seferECGuzergahFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seferECGuzergahFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seferECGuzergahFieldActionPerformed

    private void company_CostButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_company_CostButtonActionPerformed
        jTabbedPane2.setSelectedIndex(2);
    }//GEN-LAST:event_company_CostButtonActionPerformed

    private void adminC_ButtonAdd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminC_ButtonAdd2ActionPerformed
        switch (seferECTripTypeComboBox.getSelectedIndex()) {
            case 0 -> {
                admin.updateTripNumberForVehicle(loggedInUsername, (String) seferECAracIDComboBox.getSelectedItem(), 1);              
            }
            case 1 -> {
                admin.updateTripNumberForVehicle(loggedInUsername, (String) seferECAracIDComboBox.getSelectedItem(), 2);              
            }
            case 2 -> {
                admin.updateTripNumberForVehicle(loggedInUsername, (String) seferECAracIDComboBox.getSelectedItem(), 3);              
            }
            case 3 -> {
                admin.updateTripNumberForVehicle(loggedInUsername, (String) seferECAracIDComboBox.getSelectedItem(), 4);              
            }
            case 4 -> {
                admin.updateTripNumberForVehicle(loggedInUsername, (String) seferECAracIDComboBox.getSelectedItem(), 5);              
            }
            case 5 -> {
                admin.updateTripNumberForVehicle(loggedInUsername, (String) seferECAracIDComboBox.getSelectedItem(), 6);              
            }
        }
        DefaultTableModel tblModel = (DefaultTableModel) seferEC_Table.getModel();
        String data[] = {(String) seferECTripTypeComboBox.getSelectedItem(), (String) seferECAracIDComboBox.getSelectedItem()};
        tblModel.addRow(data);
        JOptionPane.showMessageDialog(this, "Araç Belirtilen Sefere Eklendi.");
    }//GEN-LAST:event_adminC_ButtonAdd2ActionPerformed

    private void kalkisComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kalkisComboboxActionPerformed

    }//GEN-LAST:event_kalkisComboboxActionPerformed

    private void aracTuruComboboxKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aracTuruComboboxKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aracTuruComboboxKActionPerformed

    private void yolculukTarihiComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yolculukTarihiComboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yolculukTarihiComboboxActionPerformed

    private void biletAlButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_biletAlButtonActionPerformed
        jTabbedPane4.setSelectedIndex(1);
    }//GEN-LAST:event_biletAlButtonActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int gelirToplam = 0;
        int giderToplam = admin.findCompanyByUsername(loggedInUsername).getServiceFee();
        
            List<Bus> buss = admin.findCompanyByUsername(loggedInUsername).getBuss();
            List<Train> trains = admin.findCompanyByUsername(loggedInUsername).getTrains();
            List<Airplane> airplanes = admin.findCompanyByUsername(loggedInUsername).getAirplanes();
            for (Bus bus : buss) {
                 giderToplam += bus.calculateFuelCost();
                 if("Otobüs 1".equals(bus.getVehicleType())){
                     gelirToplam += bus.calculateMaxRevenue();
                     giderToplam += personelBus1K.getPrice() * 2;
                     giderToplam += personelBus1H.getPrice() * 2;                     
                 }
                 else if("Otobüs 2".equals(bus.getVehicleType())){
                     gelirToplam += bus.calculateMaxRevenue();
                     giderToplam += personelBus2K.getPrice() * 2;
                     giderToplam += personelBus2H.getPrice() * 2;
                 }
            }
           
            for (Train train : trains) {
                gelirToplam += train.calculateMaxRevenue();
                giderToplam += train.calculateFuelCost();
                giderToplam += personelTrain1K.getPrice() * 2;
                giderToplam += personelTrain1H.getPrice() * 2;
            }

            for (Airplane airplane : airplanes) {
                gelirToplam += airplane.calculateMaxRevenue();
                giderToplam += airplane.calculateFuelCost();
                giderToplam += personelAirplane1K.getPrice() * 2;
                giderToplam += personelAirplane1H.getPrice() * 2;
            }
        gelirField.setText(String.valueOf(gelirToplam));
        giderField.setText("-" + String.valueOf(giderToplam));
        kazancField.setText(String.valueOf(gelirToplam - giderToplam));
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Rezervasyon_Uygulamasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rezervasyon_Uygulamasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rezervasyon_Uygulamasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rezervasyon_Uygulamasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rezervasyon_Uygulamasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminBack;
    private javax.swing.JButton adminC_ButonDelete;
    private javax.swing.JButton adminC_ButonDelete2;
    private javax.swing.JButton adminC_ButtonAdd;
    private javax.swing.JButton adminC_ButtonAdd2;
    private javax.swing.JTextField adminC_NameField;
    private javax.swing.JTextField adminC_PassField;
    private javax.swing.JTextField adminC_ServiceFeeField;
    private javax.swing.JTextField adminC_UsernameField;
    private javax.swing.JPanel adminPanel;
    private javax.swing.JTextField aracEC_aracIDField;
    private javax.swing.JComboBox<String> aracTipiComboBox;
    private javax.swing.JComboBox<String> aracTuruComboBox;
    private javax.swing.JComboBox<String> aracTuruComboboxK;
    private javax.swing.JButton biletAlButton;
    private javax.swing.JTextField biletFiyatiField;
    private javax.swing.JTable biletTable;
    private javax.swing.JButton button_giris;
    private javax.swing.JPanel choosePanel;
    private javax.swing.JButton companyBack;
    private javax.swing.JButton company_CostButton;
    private javax.swing.JPanel firmaPanel;
    private javax.swing.JTextField gelirField;
    private javax.swing.JTextField giderField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JComboBox<String> kalkisCombobox;
    private javax.swing.JTextField kazancField;
    private javax.swing.JPanel kullaniciPanel;
    private javax.swing.JPasswordField pass_field;
    private javax.swing.JCheckBox pass_show;
    private javax.swing.JButton seferBulButton;
    private javax.swing.JComboBox<String> seferECAracIDComboBox;
    private javax.swing.JTextField seferECGuzergahField;
    private javax.swing.JComboBox<String> seferECTripTypeComboBox;
    private javax.swing.JTable seferEC_Table;
    private javax.swing.JButton trip_AD_Button;
    private javax.swing.JButton userBack;
    private javax.swing.JTextField username_field;
    private javax.swing.JComboBox<String> varisCombobox;
    private javax.swing.JButton vehicleAddButton;
    private javax.swing.JButton vehicleDeleteButton;
    private javax.swing.JButton vehicle_AD_Button;
    private javax.swing.JSpinner yolcuSayisiSpinner;
    private javax.swing.JComboBox<String> yolculukTarihiCombobox;
    // End of variables declaration//GEN-END:variables

}
