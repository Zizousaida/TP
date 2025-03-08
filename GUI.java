package classes;

import javax.swing.*;

public class GUI extends javax.swing.JFrame {
    private Person p = new Person();

    public GUI() {
        initComponents();
    }

    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        ButtonSet = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        ButtonGet = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel12 = new javax.swing.JPanel();
        ButtonSameage = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jPanel15 = new javax.swing.JPanel();
        Buttonolder = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        ButtonDefault = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        ButtonNP = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        ButtonAll = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(6, 3));

        jPanel1.setBackground(new java.awt.Color(0, 0, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());
        getContentPane().add(jPanel1);

        jPanel2.setBackground(new java.awt.Color(0, 0, 255));
        jPanel2.setLayout(new java.awt.BorderLayout());
        getContentPane().add(jPanel2);

        jPanel3.setBackground(new java.awt.Color(0, 0, 255));
        jPanel3.setLayout(new java.awt.BorderLayout());
        getContentPane().add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Name");
        jPanel4.add(jLabel1, java.awt.BorderLayout.CENTER);
        getContentPane().add(jPanel4);

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 18));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel5.setLayout(new java.awt.BorderLayout());
        jPanel5.add(jTextField1, java.awt.BorderLayout.CENTER);
        getContentPane().add(jPanel5);

        ButtonSet.setText("Button-setters");
        ButtonSet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonSetMouseClicked(evt);
            }
        });
        jPanel6.setLayout(new java.awt.BorderLayout());
        jPanel6.add(ButtonSet, java.awt.BorderLayout.CENTER);
        getContentPane().add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Surname");
        jPanel7.add(jLabel2, java.awt.BorderLayout.CENTER);
        getContentPane().add(jPanel7);

        jTextField2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel8.setLayout(new java.awt.BorderLayout());
        jPanel8.add(jTextField2, java.awt.BorderLayout.CENTER);
        getContentPane().add(jPanel8);

        ButtonGet.setText("Button-getters");
        ButtonGet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonGetMouseClicked(evt);
            }
        });
        jPanel9.setLayout(new java.awt.BorderLayout());
        jPanel9.add(ButtonGet, java.awt.BorderLayout.CENTER);
        getContentPane().add(jPanel9);

        jPanel10.setBackground(new java.awt.Color(204, 204, 204));
        jPanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel10.setLayout(new java.awt.BorderLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Age");
        jPanel10.add(jLabel3, java.awt.BorderLayout.CENTER);
        getContentPane().add(jPanel10);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99" }));
        jPanel11.setLayout(new java.awt.BorderLayout());
        jPanel11.add(jComboBox1, java.awt.BorderLayout.CENTER);
        getContentPane().add(jPanel11);

        ButtonSameage.setText("Button-sameAge");
        ButtonSameage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonSameageMouseClicked(evt);
            }
        });
        jPanel12.setLayout(new java.awt.BorderLayout());
        jPanel12.add(ButtonSameage, java.awt.BorderLayout.CENTER);
        getContentPane().add(jPanel12);

        jPanel13.setBackground(new java.awt.Color(204, 204, 204));
        jPanel13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel13.setLayout(new java.awt.BorderLayout());

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Gender");
        jPanel13.add(jLabel4, java.awt.BorderLayout.CENTER);
        getContentPane().add(jPanel13);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Homme", "Femme" }));
        jPanel14.setLayout(new java.awt.BorderLayout());
        jPanel14.add(jComboBox2, java.awt.BorderLayout.CENTER);
        getContentPane().add(jPanel14);

        Buttonolder.setText("Button-older");
        Buttonolder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonolderMouseClicked(evt);
            }
        });
        jPanel15.setLayout(new java.awt.BorderLayout());
        jPanel15.add(Buttonolder, java.awt.BorderLayout.CENTER);
        getContentPane().add(jPanel15);

        ButtonDefault.setText("Button-Default");
        ButtonDefault.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonDefaultMouseClicked(evt);
            }
        });
        jPanel16.setLayout(new java.awt.BorderLayout());
        jPanel16.add(ButtonDefault, java.awt.BorderLayout.CENTER);
        getContentPane().add(jPanel16);

        ButtonNP.setText("Button Np");
        ButtonNP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonNPMouseClicked(evt);
            }
        });
        jPanel17.setLayout(new java.awt.BorderLayout());
        jPanel17.add(ButtonNP, java.awt.BorderLayout.CENTER);
        getContentPane().add(jPanel17);

        ButtonAll.setText("Button All");
        ButtonAll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonAllMouseClicked(evt);
            }
        });
        jPanel18.setLayout(new java.awt.BorderLayout());
        jPanel18.add(ButtonAll, java.awt.BorderLayout.CENTER);
        getContentPane().add(jPanel18);

        pack();
    }

    private void ButtonSetMouseClicked(java.awt.event.MouseEvent evt) {
        p.setName(jTextField1.getText());
        p.setSurname(jTextField2.getText());
        p.setAge(jComboBox1.getSelectedItem().toString());
        p.setGender(jComboBox2.getSelectedItem().toString());
    }

    private void ButtonGetMouseClicked(java.awt.event.MouseEvent evt) {
        System.out.println(p.getName() + "\n" + p.getSurname() + "\n" + p.getAge() + "\n" + p.getGender());
    }

    private void ButtonSameageMouseClicked(java.awt.event.MouseEvent evt) {
        int personAge = Integer.parseInt(p.getAge());
        System.out.println(personAge == 43);
    }

    private void ButtonolderMouseClicked(java.awt.event.MouseEvent evt) {
        int personAge = Integer.parseInt(p.getAge());
        if (personAge >= 43) {
            System.out.println("Person Info: " + p.getName() + ", " + p.getSurname() + ", " + p.getAge() + ", " + p.getGender());
        } else {
            System.out.println("Mahmoudi, Mohammed, 43, Homme");
        }
    }

    private void ButtonDefaultMouseClicked(java.awt.event.MouseEvent evt) {
        p = new Person();
    }

    private void ButtonNPMouseClicked(java.awt.event.MouseEvent evt) {
        p = new Person(jTextField1.getText(), jTextField2.getText());
    }

    private void ButtonAllMouseClicked(java.awt.event.MouseEvent evt) {
        p = new Person(jTextField1.getText(), jTextField2.getText(), jComboBox1.getSelectedItem().toString(), jComboBox2.getSelectedItem().toString());
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new GUI().setVisible(true);
        });
    }

    // Variables declaration
    private javax.swing.JButton ButtonAll;
    private javax.swing.JButton ButtonDefault;
    private javax.swing.JButton ButtonGet;
    private javax.swing.JButton ButtonNP;
    private javax.swing.JButton ButtonSameage;
    private javax.swing.JButton ButtonSet;
    private javax.swing.JButton Buttonolder;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
}
