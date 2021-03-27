package com.gazi.gorsel.views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class FrmGraphic extends javax.swing.JFrame {

    //Çizimlerin yapılacağı frami tanımlama
    GraphicPanel gp;
    
    //Hangi rengin değişeceğine karar vermek için enum tipinde bir değişken tanımlıyoruz
    enum colors {
        line,
        fill,
        background
    }
    //Renk paletindeki butonların rengi için ArrayList
    //Bu ArrayListte kullanıcının son seçtiği rengin renk paletine eklenmesi için kullanılacak
    ArrayList<Color> clrs = new ArrayList<Color>() {
        {
            add(Color.WHITE);
            add(Color.RED);
            add(Color.BLACK);
            add(Color.BLUE);
            add(Color.GREEN);
            add(Color.YELLOW);

        }
    };
    colors clr = colors.line;

    //Constructor
    public FrmGraphic() {
        /*GraphicPanel nesnesini oluşturuyoruz GraphicPanel bizim şekilleri 
        çizdireceğimiz alan*/
        gp = new GraphicPanel();
        this.setPreferredSize(new Dimension(600, 400));
        add(gp, BorderLayout.CENTER);
        setLocationRelativeTo(null);
        gp.setVisible(true);
        this.add(gp);
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        pnlTool = new javax.swing.JPanel();
        pnlColourScale = new javax.swing.JPanel();
        btnWhite = new javax.swing.JButton();
        btnColor2 = new javax.swing.JButton();
        btnColor3 = new javax.swing.JButton();
        btnColor4 = new javax.swing.JButton();
        btnColor5 = new javax.swing.JButton();
        btnColor6 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblLineColor = new javax.swing.JLabel();
        lblFillColor = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();
        btnLineColor = new javax.swing.JButton();
        btnFillColor = new javax.swing.JButton();
        btnBackgroundColor = new javax.swing.JButton();
        btnOtherColors = new javax.swing.JButton();
        pnlShapes = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        btnLine = new javax.swing.JButton();
        btnRectangle = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        sldThickness = new javax.swing.JSlider();
        lblThickness = new javax.swing.JLabel();
        pnlDrawType = new javax.swing.JPanel();
        btnDrawLine = new javax.swing.JButton();
        btnDrawFill = new javax.swing.JButton();
        btnDrawFillLine = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblDrawType = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        sldGridSize = new javax.swing.JSlider();
        jLabel3 = new javax.swing.JLabel();
        lblGridSize = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        mitmNewPage = new javax.swing.JMenuItem();
        mitmSaveFile = new javax.swing.JMenuItem();
        mitmOpenFile = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mitmTakeBack = new javax.swing.JMenuItem();
        mitmTakeForward = new javax.swing.JMenuItem();
        menuTool = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        mitmDrawLine = new javax.swing.JMenuItem();
        mitmDrawFill = new javax.swing.JMenuItem();
        mitmFillLine = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        mitmFreeHand = new javax.swing.JMenuItem();
        mitmLine = new javax.swing.JMenuItem();
        mitmRectangle = new javax.swing.JMenuItem();
        mitmTriangle = new javax.swing.JMenuItem();
        mitmRightTriangle = new javax.swing.JMenuItem();
        mitmOval = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        mitmLineColor = new javax.swing.JMenuItem();
        mitmFillColor = new javax.swing.JMenuItem();
        mitmBackgroundColor = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        mitmGridState = new javax.swing.JCheckBoxMenuItem();
        mitmGridColor = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlTool.setPreferredSize(new java.awt.Dimension(155, 431));

        pnlColourScale.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0)));

        btnWhite.setBackground(new java.awt.Color(255, 255, 255));
        btnWhite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWhiteActionPerformed(evt);
            }
        });

        btnColor2.setBackground(java.awt.Color.red);
        btnColor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWhiteActionPerformed(evt);
            }
        });

        btnColor3.setBackground(new java.awt.Color(0, 0, 0));
        btnColor3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWhiteActionPerformed(evt);
            }
        });

        btnColor4.setBackground(new java.awt.Color(0, 0, 204));
        btnColor4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWhiteActionPerformed(evt);
            }
        });

        btnColor5.setBackground(new java.awt.Color(0, 204, 0));
        btnColor5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWhiteActionPerformed(evt);
            }
        });

        btnColor6.setBackground(new java.awt.Color(255, 255, 0));
        btnColor6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWhiteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlColourScaleLayout = new javax.swing.GroupLayout(pnlColourScale);
        pnlColourScale.setLayout(pnlColourScaleLayout);
        pnlColourScaleLayout.setHorizontalGroup(
            pnlColourScaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlColourScaleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlColourScaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlColourScaleLayout.createSequentialGroup()
                        .addComponent(btnColor5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(btnColor6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlColourScaleLayout.createSequentialGroup()
                        .addComponent(btnWhite, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnColor2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlColourScaleLayout.createSequentialGroup()
                        .addComponent(btnColor3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnColor4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlColourScaleLayout.setVerticalGroup(
            pnlColourScaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlColourScaleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlColourScaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnColor2, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                    .addComponent(btnWhite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlColourScaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnColor3, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                    .addComponent(btnColor4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlColourScaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnColor5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnColor6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        lblLineColor.setText("Çizgi   :");

        lblFillColor.setText("Dolgu :");

        lblBackground.setText("Arka Plan :");

        btnLineColor.setBackground(new java.awt.Color(0, 0, 0));
        btnLineColor.setActionCommand("lineColor");
        btnLineColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLineColorActionPerformed(evt);
            }
        });

        btnFillColor.setBackground(new java.awt.Color(0, 0, 0));
        btnFillColor.setActionCommand("fillColor");
        btnFillColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLineColorActionPerformed(evt);
            }
        });

        btnBackgroundColor.setBackground(new java.awt.Color(255, 255, 255));
        btnBackgroundColor.setActionCommand("background");
        btnBackgroundColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLineColorActionPerformed(evt);
            }
        });

        btnOtherColors.setText("Diğer Renkler");
        btnOtherColors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOtherColorsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnOtherColors, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblLineColor, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLineColor, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblFillColor, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFillColor, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblBackground)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBackgroundColor, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLineColor)
                    .addComponent(btnLineColor, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFillColor)
                    .addComponent(btnFillColor, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBackground)
                    .addComponent(btnBackgroundColor, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnOtherColors)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pnlShapes.setLayout(new java.awt.GridLayout(4, 2));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        jPanel2.setPreferredSize(new java.awt.Dimension(120, 100));
        jPanel2.setLayout(new java.awt.GridLayout(4, 2));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gazi/gorsel/image/icons8_autograph_32px.png"))); // NOI18N
        jButton5.setActionCommand("free hand");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLineActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5);

        btnLine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gazi/gorsel/image/icons8_line_32px.png"))); // NOI18N
        btnLine.setActionCommand("line");
        btnLine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLineActionPerformed(evt);
            }
        });
        jPanel2.add(btnLine);

        btnRectangle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gazi/gorsel/image/icons8_rectangle_32px.png"))); // NOI18N
        btnRectangle.setActionCommand("rectangle");
        btnRectangle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLineActionPerformed(evt);
            }
        });
        jPanel2.add(btnRectangle);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gazi/gorsel/image/icons8_triangle_32px.png"))); // NOI18N
        jButton1.setActionCommand("triangle");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLineActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gazi/gorsel/image/icons8_trigonometry_32px.png"))); // NOI18N
        jButton3.setActionCommand("right triangle");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLineActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gazi/gorsel/image/icons8_oval_32px.png"))); // NOI18N
        jButton4.setActionCommand("Oval");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLineActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gazi/gorsel/image/icons8_sand_watch_32px.png"))); // NOI18N
        jButton2.setActionCommand("sandglass");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLineActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);

        sldThickness.setMajorTickSpacing(10);
        sldThickness.setMaximum(50);
        sldThickness.setMinorTickSpacing(5);
        sldThickness.setPaintLabels(true);
        sldThickness.setPaintTicks(true);
        sldThickness.setValue(1);
        sldThickness.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldThicknessStateChanged(evt);
            }
        });

        lblThickness.setText("1");

        pnlDrawType.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        pnlDrawType.setLayout(new java.awt.GridLayout(3, 1));

        btnDrawLine.setText("Cizgi");
        btnDrawLine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDrawLineActionPerformed(evt);
            }
        });
        pnlDrawType.add(btnDrawLine);

        btnDrawFill.setText("Dolgu");
        btnDrawFill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDrawLineActionPerformed(evt);
            }
        });
        pnlDrawType.add(btnDrawFill);

        btnDrawFillLine.setText("Cizgi+Dolgu");
        btnDrawFillLine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDrawLineActionPerformed(evt);
            }
        });
        pnlDrawType.add(btnDrawFillLine);

        jLabel1.setText("Çizim Şekli :");

        lblDrawType.setText("Çizgi");

        jLabel2.setText("Kalınlık :");

        sldGridSize.setMajorTickSpacing(10);
        sldGridSize.setMaximum(30);
        sldGridSize.setMinimum(10);
        sldGridSize.setMinorTickSpacing(5);
        sldGridSize.setPaintLabels(true);
        sldGridSize.setPaintTicks(true);
        sldGridSize.setValue(0);
        sldGridSize.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldGridSizeStateChanged(evt);
            }
        });

        jLabel3.setText("Izgara Genişliği :");

        lblGridSize.setText("10");

        javax.swing.GroupLayout pnlToolLayout = new javax.swing.GroupLayout(pnlTool);
        pnlTool.setLayout(pnlToolLayout);
        pnlToolLayout.setHorizontalGroup(
            pnlToolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlToolLayout.createSequentialGroup()
                .addGroup(pnlToolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlColourScale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlToolLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(pnlShapes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlToolLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlToolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlDrawType, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                            .addComponent(sldThickness, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(pnlToolLayout.createSequentialGroup()
                                .addGroup(pnlToolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlToolLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblThickness, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(sldGridSize, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnlToolLayout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblGridSize, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(pnlToolLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDrawType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlToolLayout.setVerticalGroup(
            pnlToolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlToolLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlColourScale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlToolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlToolLayout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(pnlShapes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlToolLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addGroup(pnlToolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(lblDrawType))
                        .addGap(18, 18, 18)
                        .addComponent(pnlDrawType, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sldThickness, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlToolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblThickness))
                .addGap(18, 18, 18)
                .addComponent(sldGridSize, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlToolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblGridSize))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        getContentPane().add(pnlTool, java.awt.BorderLayout.LINE_START);

        menuFile.setText("Dosya");

        mitmNewPage.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mitmNewPage.setText("Yeni Sayfa");
        mitmNewPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitmNewPageActionPerformed(evt);
            }
        });
        menuFile.add(mitmNewPage);

        mitmSaveFile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mitmSaveFile.setText("Kaydet");
        mitmSaveFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitmSaveFileActionPerformed(evt);
            }
        });
        menuFile.add(mitmSaveFile);

        mitmOpenFile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mitmOpenFile.setText("Dosya Aç");
        mitmOpenFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitmOpenFileActionPerformed(evt);
            }
        });
        menuFile.add(mitmOpenFile);
        menuFile.add(jSeparator1);

        mitmTakeBack.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mitmTakeBack.setText("Geri Al");
        mitmTakeBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitmTakeBackActionPerformed(evt);
            }
        });
        menuFile.add(mitmTakeBack);

        mitmTakeForward.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mitmTakeForward.setText("İleri Al");
        mitmTakeForward.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitmTakeForwardActionPerformed(evt);
            }
        });
        menuFile.add(mitmTakeForward);

        jMenuBar1.add(menuFile);

        menuTool.setText("Araçlar");

        jMenu4.setText("Çizim Şekli");

        mitmDrawLine.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        mitmDrawLine.setText("Çizgi");
        mitmDrawLine.setActionCommand("Cizgi");
        mitmDrawLine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDrawLineActionPerformed(evt);
            }
        });
        jMenu4.add(mitmDrawLine);

        mitmDrawFill.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        mitmDrawFill.setText("Dolgu");
        mitmDrawFill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDrawLineActionPerformed(evt);
            }
        });
        jMenu4.add(mitmDrawFill);

        mitmFillLine.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        mitmFillLine.setText("Cizgi+Dolgu");
        mitmFillLine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDrawLineActionPerformed(evt);
            }
        });
        jMenu4.add(mitmFillLine);

        menuTool.add(jMenu4);

        jMenu5.setText("Çizim Tipi");

        mitmFreeHand.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mitmFreeHand.setText("Serbest Çizim");
        mitmFreeHand.setActionCommand("free hand");
        mitmFreeHand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLineActionPerformed(evt);
            }
        });
        jMenu5.add(mitmFreeHand);

        mitmLine.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mitmLine.setText("Çizgi");
        mitmLine.setActionCommand("line");
        mitmLine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLineActionPerformed(evt);
            }
        });
        jMenu5.add(mitmLine);

        mitmRectangle.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mitmRectangle.setText("Dikdörtgen");
        mitmRectangle.setActionCommand("rectangle");
        mitmRectangle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLineActionPerformed(evt);
            }
        });
        jMenu5.add(mitmRectangle);

        mitmTriangle.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mitmTriangle.setText("Üçgen");
        mitmTriangle.setActionCommand("triangle");
        mitmTriangle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLineActionPerformed(evt);
            }
        });
        jMenu5.add(mitmTriangle);

        mitmRightTriangle.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mitmRightTriangle.setText("Dik Üçgen");
        mitmRightTriangle.setActionCommand("right triangle");
        mitmRightTriangle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLineActionPerformed(evt);
            }
        });
        jMenu5.add(mitmRightTriangle);

        mitmOval.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mitmOval.setText("Oval");
        mitmOval.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLineActionPerformed(evt);
            }
        });
        jMenu5.add(mitmOval);

        menuTool.add(jMenu5);

        jMenu6.setText("Renkler");

        mitmLineColor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mitmLineColor.setText("Çizgi Rengi");
        mitmLineColor.setActionCommand("line color");
        mitmLineColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitmLineColorActionPerformed(evt);
            }
        });
        jMenu6.add(mitmLineColor);
        mitmLineColor.getAccessibleContext().setAccessibleName("line");

        mitmFillColor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mitmFillColor.setText("Dolgu Rengi");
        mitmFillColor.setActionCommand("fill color");
        mitmFillColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitmLineColorActionPerformed(evt);
            }
        });
        jMenu6.add(mitmFillColor);
        mitmFillColor.getAccessibleContext().setAccessibleName("dolgu");

        mitmBackgroundColor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mitmBackgroundColor.setText("Arka Plan Rengi");
        mitmBackgroundColor.setActionCommand("background");
        mitmBackgroundColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitmLineColorActionPerformed(evt);
            }
        });
        jMenu6.add(mitmBackgroundColor);
        mitmBackgroundColor.getAccessibleContext().setAccessibleName("background");

        menuTool.add(jMenu6);
        jMenu6.getAccessibleContext().setAccessibleDescription("");

        jMenu1.setText("Izgara");

        mitmGridState.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mitmGridState.setSelected(true);
        mitmGridState.setText("Görünürlük");
        mitmGridState.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                mitmGridStateStateChanged(evt);
            }
        });
        jMenu1.add(mitmGridState);

        mitmGridColor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mitmGridColor.setText("Renk");
        mitmGridColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitmGridColorActionPerformed(evt);
            }
        });
        jMenu1.add(mitmGridColor);

        menuTool.add(jMenu1);

        jMenuBar1.add(menuTool);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Hangi Şeklin Çizileceğini belirleyen method
    private void btnLineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLineActionPerformed
        //Hangi butona basıyorsak onun commandini değişkene atarak hangisinin çizileceğine karar veriyor
        String cmd = evt.getActionCommand();
        switch (cmd) {
            case "line":
                //Çizgi
                gp.dm = GraphicPanel.drawMode.line;
                break;
            case "rectangle":
                //dikdörtgen
                gp.dm = GraphicPanel.drawMode.rectangle;
                break;
            case "triangle":
                //Üçgen
                gp.dm = GraphicPanel.drawMode.triangle;
                break;
            case "right triangle":
                //Dik Üçgen
                gp.dm = GraphicPanel.drawMode.rightTriangle;
                break;
            case "Oval":
                //Oval
                gp.dm = GraphicPanel.drawMode.oval;
                break;
            case "free hand":
                //Serbest çizim
                gp.dm = GraphicPanel.drawMode.freeHand;
                break;
            case "sandglass":
                //Kum saati
                gp.dm = GraphicPanel.drawMode.sandglass;
                break;
        }
    }//GEN-LAST:event_btnLineActionPerformed

    //Hangi Durumun Rengi değiştireleceğini belirten method
    private void btnLineColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLineColorActionPerformed
        //Hangi butona basıyorsak onun commandini değişkene atarak hangisinin renk atanacağına karar veriyor
        String cmd = evt.getActionCommand();
        switch (cmd) {
            case "lineColor":
                //Çizgi Rengi
                clr = colors.line;
                break;
            case "fillColor":
                //Dolgu Rengi
                clr = colors.fill;
                break;
            case "background":
                //Arka Plan Rengi
                clr = colors.background;
                break;
        }
    }//GEN-LAST:event_btnLineColorActionPerformed

    //Renk Paletindeki Renklerden biri seçildiğinde onun hangi değere atanacağını belirleyen method
    private void btnWhiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWhiteActionPerformed
        //Hangi Butona basıyorsak onun background color'ını alarak hangi değere atanması gerekiyorsa atamasını yapıyor
        Color tmp = ((JButton) evt.getSource()).getBackground();
        switch (clr) {
            case line:
                /*Eğer çizgi rengi seçilmişse gelen değeri LineColor fieldına ve
                btnLineColor butonunun arka plan rengine atıyoruz*/
                btnLineColor.setBackground(tmp);
                gp.setLineColor(tmp);
                break;
            case fill:
                /*Eğer dolgu rengi seçilmişse gelen değeri FillColor fieldına ve
                btnFillColor butonunun arka plan rengine atıyoruz*/
                btnFillColor.setBackground(tmp);
                gp.setFillColor(tmp);
                break;
            case background:
                /*Eğer arka plan rengi seçilmişse gelen değeri Background fieldına ve
                btnBackground butonunun arka plan rengine atıyoruz*/
                btnBackgroundColor.setBackground(tmp);
                gp.setBackground(tmp);
                break;
        }
        //Bu atamaların çizilebilmesi için repaint methodunu kullanarak paint methodunu çalıştırıyoruz 
        gp.repaint();
    }//GEN-LAST:event_btnWhiteActionPerformed

    //Kalınlığı Ayarlayan Method
    private void sldThicknessStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldThicknessStateChanged
        //Thickness slider'ında değişiklik olduğunda bunu thickness fieldına atıyor ve labelde yazıyor
        gp.setThickness(sldThickness.getValue());
        //labelda kullanıcıya bu değeri göstermek için label textine atama yapıyor
        lblThickness.setText(String.valueOf(gp.getThickness()));
    }//GEN-LAST:event_sldThicknessStateChanged

    //Çizim Modunu Değiştiren Method
    private void btnDrawLineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDrawLineActionPerformed
        //Hangi butona basıyorsak onun commandini değişkene atarak hangisi modun kullanılacağına karar veriyor
        String cmd = evt.getActionCommand();
        switch (cmd) {
            case "Cizgi":
                //Sadece Çizgi modu
                gp.setDrawState("line");
                lblDrawType.setText("Çizgi");
                break;
            case "Dolgu":
                //Sadece Dolgu modu
                gp.setDrawState("fill");
                lblDrawType.setText("Dolgu");
                break;
            case "Cizgi+Dolgu":
                //Çizgi+Dolgu modu
                gp.setDrawState("FillLine");
                lblDrawType.setText("Çizgi+Dolgu");
                break;
        }
    }//GEN-LAST:event_btnDrawLineActionPerformed

    //Palet Dışındaki Renklerden seçim yapan method
    private void btnOtherColorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOtherColorsActionPerformed
        Color initialcolor = Color.BLACK;
        //JColorChooserdan kullanıcın renk seçmesini sağlayarak onu Color tipinde bir değişkene atıyor ve ColorScale methoduna gönderiyoruz
        Color color = (Color) JColorChooser.showDialog(this, "Renk Seç", initialcolor);
        btnOtherColors.setBackground(color);
        ColorScale(color);
    }//GEN-LAST:event_btnOtherColorsActionPerformed
    //Izgara görünümünü kapatan ve açan method
    private void mitmGridStateStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_mitmGridStateStateChanged
        /*
            Izgara görünümünü değiştirmek için chechbox değeri değiştiğinde 
            gridstate fieldına değer ataması yapılıyor
        */
        gp.setGridState(mitmGridState.getModel().isSelected());
        /*
            değişikliklerin mousea tıklandığında geçerli olması için repaint methodu kullanılıyor
            Kullanılmadığı durumda butona bastıktan sonra cizim alanına tıklamanız gerekiyor paint methodu ancak o zaman çalışıyor
            ve ızgara rengi o zaman değişiyor
        */
        gp.repaint();
    }//GEN-LAST:event_mitmGridStateStateChanged
    //JColorChooser ile renk atamalarını yapan method
    private void mitmLineColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitmLineColorActionPerformed
        //Default renk olarak siyah rengini atıyoruz
        Color initialcolor = Color.BLACK;
        //JColorChooserdan kullanıcın renk seçmesini sağlayarak onu Color tipinde bir değişkene atıyor ve ColorScale methoduna gönderiyoruz
        Color color = (Color) JColorChooser.showDialog(this, "Renk Seç", initialcolor);
        //Kullanıcın hangi rengin reçildiğini görmesi btnOtherColors butonuna seçilen rengi atıyoruz
        btnOtherColors.setBackground(color);
        //ColorScale methoduyla renk paletine seçilen rengin atanmasını sağlıyoruz
        ColorScale(color);
        String cmd = evt.getActionCommand();
        //Hangi buton seçilmişse onu kontrol ederek değer atıyoruz
        //Bu değerler line color fill color yada background colorı değiştiriyor
        switch (cmd) {
            case "line color":
                //Çizgi Rengi Atama
                btnLineColor.setBackground(color);
                gp.setLineColor(color);
                break;
            case "fill color":
                //Dolgu Rengi Atama
                btnFillColor.setBackground(color);
                gp.setFillColor(color);
                break;
            case "background":
                //Arka Plan Rengi Atama
                btnBackgroundColor.setBackground(color);
                gp.setBackground(color);
                break;

        }
    }//GEN-LAST:event_mitmLineColorActionPerformed
    //JColorChooser ile ızgara rengini değiştiren method
    private void mitmGridColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitmGridColorActionPerformed
        Color initialcolor = Color.BLACK;
        //JColorChooserdan kullanıcın renk seçmesini sağlayarak onu Color tipinde bir değişkene atıyor ve ColorScale methoduna gönderiyoruz
        Color color = (Color) JColorChooser.showDialog(this, "Renk Seç", initialcolor);
        //!!Menü item olduğu için background değeri atanmıyor!!
        mitmGridColor.setBackground(color);
        //Izgara rengine JColorChooserda seçilen değeri atıyoruz
        gp.setGridColor(color);
        //Değişikliklerin geçerli olması için repaint methodunu kullanarak paint methodunu çalıştırıyoruz
        gp.repaint();
    }//GEN-LAST:event_mitmGridColorActionPerformed
    //GraphicPanelde .jpeg ve .png uzantılı dosya açan method
    private void mitmOpenFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitmOpenFileActionPerformed
        try {
            //Çizim ekranıne jpeg ya da png dosyası ekleme
            //Fotoğrafı atacağımız değişken
            File getPhoto = null;
            //yeni bir JFileChooser oluşturarak kullanıcının burdan dosya seçmesini sağlıyoruz
            JFileChooser chooser = new JFileChooser();
            //Dosya seçme ekranında yalnızca jpeg ve png dosyaları seçmesi için filter oluşturuyoruz
            FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "JPG & PNG Images", "jpg", "png");
            chooser.setFileFilter(filter);
            //Dialog nesnesini ekranda gösteriyoruz
            int returnVal = chooser.showOpenDialog(null);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                //chooser nesnesinden gelen dosyayı değişkene atıyoruz
                getPhoto = chooser.getSelectedFile();
                /*
                Değişkeni File olarak tanımladığımız için bunu çizdirmek ve GraphicPaneldeki nesnemize atayabilmek için
                File dosyasını ImageIO ile fotoğraf dosyasına dönüştürüyoruz
                */
                gp.setOpenImage(ImageIO.read(getPhoto));
                //Tekrara yazdırabilmek için repaint methodunu kullanıyoruz
                gp.repaint();
            }
        } catch (Exception e) {
            //Eğer dosya açarken bir hata oluşursa kullanıcıya bilgi veriyoruz
            JOptionPane.showMessageDialog(null,"Dosya Açılamadı "+e.getMessage());
        }
    }//GEN-LAST:event_mitmOpenFileActionPerformed
    //GraphicPanel'in ekran görüntüsünü alıp proje dosyasına kaydeden method
    private void mitmSaveFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitmSaveFileActionPerformed
        /*Her çalışmayı unique olarak kaydetmemiz lazım belli bir değeri atarsak sürekli aynı 
        dosyaya yazacağı için dosyanın kaydedilme saatini dosya adı olarak atıyoruz*/
        //Date Time Formatını belirliyoruz
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH.mm.ss");
        //Local tarih ve saati oluşturuyoruz
        LocalDateTime now = LocalDateTime.now();
        //Yeni BufferedImage nesnesi oluştuyoruz ve GraphicPanel framinin
        BufferedImage bufImage = new BufferedImage(gp.getSize().width, gp.getSize().height, BufferedImage.TYPE_INT_RGB);
        gp.paint(bufImage.createGraphics());
        //Yeni bir dosya oluşturuyoruz ve dosyanın dizinini proje dosyamız yapıyoruz
        File imageFile = new File(System.getProperty("user.dir")
            + System.getProperty("file.separator") +"PaintApp İmages "+ dtf.format(now) + ".jpeg");
        try {
            //yeni bir file oluşturuyoruz ve bunu bufferedImage'de oluşturduğumuz jpeg dosyasını içine yazıyoruz
            imageFile.createNewFile();
            ImageIO.write(bufImage, "jpeg", imageFile);
            //Try Catch çalışırsa kullanıcıya kaydedildiğine dair mesaj veriyor
            JOptionPane.showMessageDialog(null, "Çalışmanız Kaydedildi!!");
        } catch (Exception ex) {
            //Eğer Hata varsa bu hata mesajını da gösteriyoruz
            JOptionPane.showMessageDialog(null,"Dosya Kaydedilemedi "+ex.getMessage());
        }
    }//GEN-LAST:event_mitmSaveFileActionPerformed
    //Yeni Proje Sayfası açan Method
    private void mitmNewPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitmNewPageActionPerformed
        //Yeni sayfa oluşturduğumuzda draw modeu clear yaparak GraphicPanelin temizlenmesini sağlıyoruz
        gp.dm=GraphicPanel.drawMode.clear;
        //Değişikliklerin mousea tıklandığı anda yapılması için repaint methoduyla yeniden çizdiriyoruz
        gp.repaint();
    }//GEN-LAST:event_mitmNewPageActionPerformed
    //Izgara Büyüklüğünü Değiştiren method
    private void sldGridSizeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldGridSizeStateChanged
        /*slideı her hareket ettirdiğimizde point nesnesine x ve y değerlerine
        sliderın değerlerini atıyoruz ve onu GraphicPaneldeki GridSize fieldına set ediyoruz*/
        Point p=new Point();
        p.x=sldGridSize.getValue();
        p.y=sldGridSize.getValue();
        gp.setGridSize(p);
        //Izgara büyüklüğünü her değiştirdiğimizde kullanıcın görebilmesi için labelın textine bu değeri atıyoruz
        lblGridSize.setText(String.valueOf(sldGridSize.getValue()));
        //Değişikliklerin sliderı kaydırdığımız anda yapılması için repaint methoduyla yeniden çizdiriyoruz
        gp.repaint();
    }//GEN-LAST:event_sldGridSizeStateChanged
    //Geri Alma Butonu
    private void mitmTakeBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitmTakeBackActionPerformed
        /*removeShapes listesine shapes listesinin sonuncu nesnesini atıyoruz
        bunun sebebi ileri almak istendiğinde nesneleri yeniden shapes nesnesine atabilmek için*/
        gp.removeShapes.add(gp.shapes.get(gp.shapes.size()-1));
        //daha sonra bu nesneyi shapes listesinden siliyoruz
        gp.shapes.remove(gp.shapes.size()-1);        
        //En Son çizilen Free Hand çizimi siler zaman yetişmediği için bu hatayı fixleyemedim
        gp.pointList.clear();
        //değişikliklerin görünebilmesi için repaint methodunu kullanıyoruz
        gp.repaint();
    }//GEN-LAST:event_mitmTakeBackActionPerformed
    //İleri Alma Butonu
    private void mitmTakeForwardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitmTakeForwardActionPerformed
        //shapes listesine removeShapes listesinin sonuncu nesnesini atıyoruz
        gp.shapes.add(gp.removeShapes.get(gp.removeShapes.size()-1));
        //daha sonra bu nesneyi shapes listesinden siliyoruz
        gp.removeShapes.remove(gp.removeShapes.size()-1);
        //değişikliklerin görünebilmesi için repaint methodunu kullanıyoruz
        gp.repaint();
    }//GEN-LAST:event_mitmTakeForwardActionPerformed
    //clrs ArrayListine Aldığı parametreyi bütün listenin indexini bir kaydırarak 0. indexe ekleyen method
    public void ColorScale(Color c) {
        //Renk paletindeki Renkleri array liste bir sıra kaydırarak yeni değeri ilk sıraya set ediyoruz
        for (int i = clrs.size(); i < 0; i--) {
            //For her döndüğünde i elemanını index numarasının bir üstüne atıyoruz 
            //bu sayede yeni rengi ilk butona atamak için 0.index boşta kalıyor
            clrs.set(i + 1, clrs.get(i));
        }
        //Son olarak kullanıcının son seçtiği rengi 0. indexe atıyoruz bu sayede ilk butonda gösterilecek
        clrs.add(0, c);
        //Butonların arka plan rengine değer atama
        //btnWhite butonu sol üstte olduğu için kullanıcının seçtiği renk bu butona atılıyor
        btnWhite.setBackground(clrs.get(0));
        btnColor2.setBackground(clrs.get(1));
        btnColor3.setBackground(clrs.get(2));
        btnColor4.setBackground(clrs.get(3));
        btnColor5.setBackground(clrs.get(4));
        btnColor6.setBackground(clrs.get(5));
    }
    

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
            java.util.logging.Logger.getLogger(FrmGraphic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmGraphic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmGraphic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmGraphic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrmGraphic().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackgroundColor;
    private javax.swing.JButton btnColor2;
    private javax.swing.JButton btnColor3;
    private javax.swing.JButton btnColor4;
    private javax.swing.JButton btnColor5;
    private javax.swing.JButton btnColor6;
    private javax.swing.JButton btnDrawFill;
    private javax.swing.JButton btnDrawFillLine;
    private javax.swing.JButton btnDrawLine;
    private javax.swing.JButton btnFillColor;
    private javax.swing.JButton btnLine;
    private javax.swing.JButton btnLineColor;
    private javax.swing.JButton btnOtherColors;
    private javax.swing.JButton btnRectangle;
    private javax.swing.JButton btnWhite;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblDrawType;
    private javax.swing.JLabel lblFillColor;
    private javax.swing.JLabel lblGridSize;
    private javax.swing.JLabel lblLineColor;
    private javax.swing.JLabel lblThickness;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenu menuTool;
    private javax.swing.JMenuItem mitmBackgroundColor;
    private javax.swing.JMenuItem mitmDrawFill;
    private javax.swing.JMenuItem mitmDrawLine;
    private javax.swing.JMenuItem mitmFillColor;
    private javax.swing.JMenuItem mitmFillLine;
    private javax.swing.JMenuItem mitmFreeHand;
    private javax.swing.JMenuItem mitmGridColor;
    private javax.swing.JCheckBoxMenuItem mitmGridState;
    private javax.swing.JMenuItem mitmLine;
    private javax.swing.JMenuItem mitmLineColor;
    private javax.swing.JMenuItem mitmNewPage;
    private javax.swing.JMenuItem mitmOpenFile;
    private javax.swing.JMenuItem mitmOval;
    private javax.swing.JMenuItem mitmRectangle;
    private javax.swing.JMenuItem mitmRightTriangle;
    private javax.swing.JMenuItem mitmSaveFile;
    private javax.swing.JMenuItem mitmTakeBack;
    private javax.swing.JMenuItem mitmTakeForward;
    private javax.swing.JMenuItem mitmTriangle;
    private javax.swing.JPanel pnlColourScale;
    private javax.swing.JPanel pnlDrawType;
    private javax.swing.JPanel pnlShapes;
    private javax.swing.JPanel pnlTool;
    private javax.swing.JSlider sldGridSize;
    private javax.swing.JSlider sldThickness;
    // End of variables declaration//GEN-END:variables
}
