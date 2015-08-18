
package project;
//@author Shad ahmed(shiam);

public class ScientificCalculator extends javax.swing.JFrame {
    private boolean zerodisp;
    private boolean decdisp;
    private boolean dgrrad;
    private boolean sh;
    private byte op;
    
    private double ina;
    private double inb;
    private double out;
   
    
    public ScientificCalculator() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        display2 = new javax.swing.JTextField();
        display1 = new javax.swing.JTextField();
        memorydisplay = new javax.swing.JTextField();
        mc = new javax.swing.JButton();
        ms = new javax.swing.JButton();
        cos = new javax.swing.JButton();
        sin = new javax.swing.JButton();
        mr = new javax.swing.JButton();
        tan = new javax.swing.JButton();
        add = new javax.swing.JButton();
        multply = new javax.swing.JButton();
        seven = new javax.swing.JButton();
        eight = new javax.swing.JButton();
        subtract = new javax.swing.JButton();
        nine = new javax.swing.JButton();
        percent = new javax.swing.JButton();
        five = new javax.swing.JButton();
        four = new javax.swing.JButton();
        one = new javax.swing.JButton();
        six = new javax.swing.JButton();
        three = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        two = new javax.swing.JButton();
        negate = new javax.swing.JButton();
        decpoint = new javax.swing.JButton();
        squared = new javax.swing.JButton();
        squareroot = new javax.swing.JButton();
        divide = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        equals = new javax.swing.JButton();
        cubed = new javax.swing.JButton();
        Exit = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Scientific Calculator Made By Shad Ahmed(shiam)");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(getIconImage());
        setResizable(false);

        display2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        display2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        display2.setFocusable(false);
        display2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                display2ActionPerformed(evt);
            }
        });

        display1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        display1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        display1.setFocusable(false);
        display1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                display1ActionPerformed(evt);
            }
        });

        memorydisplay.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        memorydisplay.setText("0");
        memorydisplay.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        memorydisplay.setFocusable(false);

        mc.setBackground(new java.awt.Color(204, 204, 204));
        mc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mc.setForeground(new java.awt.Color(255, 255, 255));
        mc.setText("MC");
        mc.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mc.setFocusable(false);
        mc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mcActionPerformed(evt);
            }
        });

        ms.setBackground(new java.awt.Color(204, 204, 204));
        ms.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ms.setForeground(new java.awt.Color(255, 255, 255));
        ms.setText("MS");
        ms.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ms.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ms.setFocusable(false);
        ms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msActionPerformed(evt);
            }
        });

        cos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cos.setText("Cos");
        cos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cos.setFocusable(false);
        cos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cosActionPerformed(evt);
            }
        });

        sin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sin.setText("Sin");
        sin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        sin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sin.setFocusable(false);
        sin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinActionPerformed(evt);
            }
        });

        mr.setBackground(new java.awt.Color(204, 204, 204));
        mr.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mr.setForeground(new java.awt.Color(255, 255, 255));
        mr.setText("MR");
        mr.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mr.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mr.setFocusable(false);
        mr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mrActionPerformed(evt);
            }
        });

        tan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tan.setText("Tan");
        tan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tan.setFocusable(false);
        tan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanActionPerformed(evt);
            }
        });

        add.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        add.setText("+");
        add.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add.setFocusable(false);
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        multply.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        multply.setText("*");
        multply.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        multply.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        multply.setFocusable(false);
        multply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multplyActionPerformed(evt);
            }
        });

        seven.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        seven.setText("7");
        seven.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        seven.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        seven.setFocusable(false);
        seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenActionPerformed(evt);
            }
        });

        eight.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        eight.setText("8");
        eight.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        eight.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eight.setFocusable(false);
        eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightActionPerformed(evt);
            }
        });

        subtract.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        subtract.setText("-");
        subtract.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        subtract.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        subtract.setFocusable(false);
        subtract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtractActionPerformed(evt);
            }
        });

        nine.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nine.setText("9");
        nine.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nine.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nine.setFocusable(false);
        nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineActionPerformed(evt);
            }
        });

        percent.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        percent.setText("%");
        percent.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        percent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        percent.setFocusable(false);
        percent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                percentActionPerformed(evt);
            }
        });

        five.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        five.setText("5");
        five.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        five.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        five.setFocusable(false);
        five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveActionPerformed(evt);
            }
        });

        four.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        four.setText("4");
        four.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        four.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        four.setFocusable(false);
        four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });

        one.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        one.setText("1");
        one.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        one.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        one.setFocusable(false);
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });

        six.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        six.setText("6");
        six.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        six.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        six.setFocusable(false);
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });

        three.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        three.setText("3");
        three.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        three.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        three.setFocusable(false);
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });

        zero.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        zero.setText("0");
        zero.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        zero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        zero.setFocusable(false);
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });

        two.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        two.setText("2");
        two.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        two.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        two.setFocusable(false);
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });

        negate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        negate.setText("±");
        negate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        negate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        negate.setFocusable(false);
        negate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                negateActionPerformed(evt);
            }
        });

        decpoint.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        decpoint.setText(".");
        decpoint.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        decpoint.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        decpoint.setFocusable(false);
        decpoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decpointActionPerformed(evt);
            }
        });

        squared.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        squared.setText("x²");
        squared.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        squared.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        squared.setFocusable(false);
        squared.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squaredActionPerformed(evt);
            }
        });

        squareroot.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        squareroot.setText("√x");
        squareroot.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        squareroot.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        squareroot.setFocusable(false);
        squareroot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squarerootActionPerformed(evt);
            }
        });

        divide.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        divide.setText("/");
        divide.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        divide.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        divide.setFocusable(false);
        divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideActionPerformed(evt);
            }
        });

        clear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        clear.setText("CE");
        clear.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clear.setFocusable(false);
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        reset.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        reset.setText("C");
        reset.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        reset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reset.setFocusable(false);
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        equals.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        equals.setText("=");
        equals.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        equals.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        equals.setFocusable(false);
        equals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalsActionPerformed(evt);
            }
        });

        cubed.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cubed.setText("x³");
        cubed.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cubed.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cubed.setFocusable(false);
        cubed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cubedActionPerformed(evt);
            }
        });

        Exit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Exit.setText("EXIT");
        Exit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Exit.setFocusable(false);
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(display1)
                    .addComponent(display2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(one, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                                    .addComponent(zero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                                    .addComponent(seven, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                                    .addComponent(four, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(decpoint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(two, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(five, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(eight, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(equals, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(mr, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(mc, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(ms, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(six, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nine, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(three, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(negate, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(13, 13, 13)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                            .addComponent(sin, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(subtract, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                            .addComponent(cos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(squared, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(squareroot, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addComponent(divide, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(percent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addComponent(multply, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(tan, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(cubed, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(memorydisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(display2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(display1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mr, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mc, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ms, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(memorydisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(seven, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(nine, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(sin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(squared, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(eight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(four, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(five, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(7, 7, 7)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(two, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(one, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(subtract, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(six, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(squareroot, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(multply, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cubed, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(three, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(zero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(negate, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(divide, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(decpoint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(percent, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(Exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(equals, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mrActionPerformed
     display1.setText(String.valueOf(memorydisplay.getText()));   
    }//GEN-LAST:event_mrActionPerformed

    private void cosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cosActionPerformed
        inb = Double.parseDouble(String.valueOf(display1.getText()));
     if(!sh){
         if(!dgrrad){
              display2.setText("cos(" + String.valueOf(inb) + ")");
             inb = inb * 0.0174532925;
         }
         out = Math.cos(inb);
     }
     else{
         display2.setText("cosh(" + String.valueOf(inb) + ")");
           out = Math.cosh(inb);
     }
     
     display1.setText(String.valueOf(out));
     out = 0;
     op = 0;
    }//GEN-LAST:event_cosActionPerformed

    private void sinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinActionPerformed
     inb = Double.parseDouble(String.valueOf(display1.getText()));
     if(!sh){
         if(!dgrrad){
              display2.setText("sin(" + String.valueOf(inb) + ")");
             inb = inb * 0.0174532925;
         }
         out = Math.sin(inb);
     }
     else{
         display2.setText("sinh(" + String.valueOf(inb) + ")");
           out = Math.sinh(inb);
     }
     
     display1.setText(String.valueOf(out));
     out = 0;
     op = 0;
    }//GEN-LAST:event_sinActionPerformed

    private void fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourActionPerformed
        if(!zerodisp && !decdisp){
           display1.setText(null);
       }
       display1.setText(display1.getText()+"4");
       zerodisp =true;
    }//GEN-LAST:event_fourActionPerformed

    private void fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveActionPerformed
        if(!zerodisp && !decdisp){
           display1.setText(null);
       }
       display1.setText(display1.getText()+"5");
       zerodisp =true;
    }//GEN-LAST:event_fiveActionPerformed

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed
       if(!zerodisp && !decdisp){
           display1.setText(null);
       }
       display1.setText(display1.getText()+"0");
  
    }//GEN-LAST:event_zeroActionPerformed

    private void oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneActionPerformed
         if(!zerodisp && !decdisp){
           display1.setText(null);
       }
       display1.setText(display1.getText()+"1");
       zerodisp =true;
    }//GEN-LAST:event_oneActionPerformed

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoActionPerformed
        if(!zerodisp && !decdisp){
           display1.setText(null);
       }
       display1.setText(display1.getText()+"2");
       zerodisp =true;
    }//GEN-LAST:event_twoActionPerformed

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeActionPerformed
         if(!zerodisp && !decdisp){
           display1.setText(null);
       }
       display1.setText(display1.getText()+"3");
       zerodisp =true;
    }//GEN-LAST:event_threeActionPerformed

    private void sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixActionPerformed
         if(!zerodisp && !decdisp){
           display1.setText(null);
       }
       display1.setText(display1.getText()+"6");
       zerodisp =true;
    }//GEN-LAST:event_sixActionPerformed

    private void sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenActionPerformed
        if(!zerodisp && !decdisp){
           display1.setText(null);
       }
       display1.setText(display1.getText()+"7");
       zerodisp =true;
    }//GEN-LAST:event_sevenActionPerformed

    private void eightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightActionPerformed
        if(!zerodisp && !decdisp){
           display1.setText(null);
       }
       display1.setText(display1.getText()+"8");
       zerodisp =true;
    }//GEN-LAST:event_eightActionPerformed

    private void nineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineActionPerformed
        if(!zerodisp && !decdisp){
           display1.setText(null);
       }
       display1.setText(display1.getText()+"9");
       zerodisp =true;
    }//GEN-LAST:event_nineActionPerformed

    private void decpointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decpointActionPerformed
     if(! decdisp){
        display1.setText(display1.getText()+".");  
     }
    }//GEN-LAST:event_decpointActionPerformed

    private void negateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_negateActionPerformed
       inb = Double.parseDouble(String.valueOf(display1.getText()));
       out=inb * -1 ;
      
       if( out > -100000000 && out < 100000000 ){
           display1.setText(String.valueOf(out));
       }
       else{
              display1.setText("Error");
       }
       decdisp = true;
       out = 0;
    }//GEN-LAST:event_negateActionPerformed
     
    
    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
       display1.setText("0");
      zerodisp = false;  
      decdisp = false;  
    }//GEN-LAST:event_clearActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
       display1.setText("0");
       display2.setText(null);
       zerodisp = false;  
       decdisp = false;  
       ina = 0;
       inb = 0; 
       out = 0;
        
    }//GEN-LAST:event_resetActionPerformed

    private void display1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_display1ActionPerformed
        
    }//GEN-LAST:event_display1ActionPerformed

    private void display2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_display2ActionPerformed
       
    }//GEN-LAST:event_display2ActionPerformed

    private void mcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mcActionPerformed
      memorydisplay.setText("0");
    }//GEN-LAST:event_mcActionPerformed

    private void msActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msActionPerformed
       memorydisplay.setText(String.valueOf(display1.getText())); 
    }//GEN-LAST:event_msActionPerformed

    private void percentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_percentActionPerformed
         ina =Double.parseDouble(String.valueOf(display1.getText()));
         display1.setText("0");
         display2.setText(String.valueOf(ina)+ "%(");
         decdisp = false;
         zerodisp = false;
         op = 5;
         
    }//GEN-LAST:event_percentActionPerformed

    private void squaredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squaredActionPerformed
        inb = Double.parseDouble(String.valueOf(display1.getText()));
        out = inb * inb;
        
         if( out > -100000000 && out < 100000000 ){
           display1.setText(String.valueOf(out));
       }
       else{
              display1.setText("Error");
       }
         display2.setText(String.valueOf(inb) + "²");
         out = 0;
         op = 0;
        
    }//GEN-LAST:event_squaredActionPerformed

    private void squarerootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squarerootActionPerformed
        inb = Double.parseDouble(String.valueOf(display1.getText()));
        out = Math.sqrt(inb);
        
        display1.setText(String.valueOf(out));
        display2.setText( "√" + String.valueOf(inb));
         out = 0;
         op = 0;
        
    }//GEN-LAST:event_squarerootActionPerformed

    private void cubedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cubedActionPerformed
       inb = Double.parseDouble(String.valueOf(display1.getText()));
        out = inb * inb * inb;
        
         if( out > -100000000 && out < 100000000 ){
           display1.setText(String.valueOf(out));
       }
       else{
              display1.setText("Error");
       }
         display2.setText(String.valueOf(inb) + "³");
         out = 0;
         op = 0;
        
    }//GEN-LAST:event_cubedActionPerformed

    private void tanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanActionPerformed
         inb = Double.parseDouble(String.valueOf(display1.getText()));
     if(!sh){
         if(!dgrrad){
              display2.setText("tan(" + String.valueOf(inb) + ")");
             inb = inb * 0.0174532925;
         }
         out = Math.tan(inb);
     }
     else{
         display2.setText("tanh(" + String.valueOf(inb) + ")");
           out = Math.tanh(inb);
     }
     
     display1.setText(String.valueOf(out));
     out = 0;
     op = 0;
    }//GEN-LAST:event_tanActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        if(op ==0){
            ina =Double.parseDouble(String.valueOf(display1.getText()));
        }
        else{
              inb =Double.parseDouble(String.valueOf(display1.getText()));
        }
        if( op == 1 ){
            ina = ina + inb;
        }
         if( op == 2 ){
            ina = ina - inb;
        }
         if( op == 3 ){
            ina = ina * inb;
        }
         if( op == 4 ){
            ina = ina / inb;
        }
         if( op == 5 ){
            ina = ina * inb / 100;
        }
         display1.setText("0");;
         display2.setText(String.valueOf(ina) + " + ");
         op = 1;
         decdisp = false;
         zerodisp = false;
         
    }//GEN-LAST:event_addActionPerformed

    private void subtractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtractActionPerformed
         if(op ==0){
            ina =Double.parseDouble(String.valueOf(display1.getText()));
        }
        else{
              inb =Double.parseDouble(String.valueOf(display1.getText()));
        }
        if( op == 1 ){
            ina = ina + inb;
        }
         if( op == 2 ){
            ina = ina - inb;
        }
         if( op == 3 ){
            ina = ina * inb;
        }
         if( op == 4 ){
            ina = ina / inb;
        }
         if( op == 5 ){
            ina = ina * inb / 100;
        }
         display1.setText("0");;
         display2.setText(String.valueOf(ina) + " - ");
         op = 2;
         decdisp = false;
         zerodisp = false;
    }//GEN-LAST:event_subtractActionPerformed

    private void multplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multplyActionPerformed
        if(op ==0){
            ina =Double.parseDouble(String.valueOf(display1.getText()));
        }
        else{
              inb =Double.parseDouble(String.valueOf(display1.getText()));
        }
        if( op == 1 ){
            ina = ina + inb;
        }
         if( op == 2 ){
            ina = ina - inb;
        }
         if( op == 3 ){
            ina = ina * inb;
        }
         if( op == 4 ){
            ina = ina / inb;
        }
         if( op == 5 ){
            ina = ina * inb / 100;
        }
         display1.setText("0");;
         display2.setText(String.valueOf(ina) + " * ");
         op = 3;
         decdisp = false;
         zerodisp = false;
    }//GEN-LAST:event_multplyActionPerformed

    private void divideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideActionPerformed
      if(op ==0){
            ina =Double.parseDouble(String.valueOf(display1.getText()));
        }
        else{
              inb =Double.parseDouble(String.valueOf(display1.getText()));
        }
        if( op == 1 ){
            ina = ina + inb;
        }
         if( op == 2 ){
            ina = ina - inb;
        }
         if( op == 3 ){
            ina = ina * inb;
        }
         if( op == 4 ){
            ina = ina / inb;
        }
         if( op == 5 ){
            ina = ina * inb / 100;
        }
         display1.setText("0");;
         display2.setText(String.valueOf(ina) + " / ");
         op = 4;
         decdisp = false;
         zerodisp = false;
    }//GEN-LAST:event_divideActionPerformed

    private void equalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalsActionPerformed
      inb =Double.parseDouble(String.valueOf(display1.getText()));
      if( op == 0){
          out = inb;
          display2.setText(String.valueOf(inb));
      }
      if( op == 1){
          out = ina + inb;
          display2.setText(display2.getText() + String.valueOf(inb));
      }
      if( op == 2){
          out = ina - inb;
          display2.setText(display2.getText() + String.valueOf(inb));
      }
      if( op == 3){
          out = ina * inb;
          display2.setText(display2.getText() + String.valueOf(inb));
      }
      if( op == 4){
          out = ina / inb;
          display2.setText(display2.getText() + String.valueOf(inb));
      }
      if( op == 5){
          out = ina + inb / 100;
          display2.setText(display2.getText() + String.valueOf(inb) + ")");
      }
        if( out > -100000000 && out < 100000000 ){
           display1.setText(String.valueOf(out));
       }
       else{
              display1.setText("Error");
       }
        ina = 0;
        inb = 0;
        out = 0;
        decdisp = false;
        zerodisp = false;
    }//GEN-LAST:event_equalsActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
   System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ExitMouseClicked

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ScientificCalculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Exit;
    private javax.swing.JButton add;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clear;
    private javax.swing.JButton cos;
    private javax.swing.JButton cubed;
    private javax.swing.JButton decpoint;
    private javax.swing.JTextField display1;
    private javax.swing.JTextField display2;
    private javax.swing.JButton divide;
    private javax.swing.JButton eight;
    private javax.swing.JButton equals;
    private javax.swing.JButton five;
    private javax.swing.JButton four;
    private javax.swing.JButton mc;
    private javax.swing.JTextField memorydisplay;
    private javax.swing.JButton mr;
    private javax.swing.JButton ms;
    private javax.swing.JButton multply;
    private javax.swing.JButton negate;
    private javax.swing.JButton nine;
    private javax.swing.JButton one;
    private javax.swing.JButton percent;
    private javax.swing.JButton reset;
    private javax.swing.JButton seven;
    private javax.swing.JButton sin;
    private javax.swing.JButton six;
    private javax.swing.JButton squared;
    private javax.swing.JButton squareroot;
    private javax.swing.JButton subtract;
    private javax.swing.JButton tan;
    private javax.swing.JButton three;
    private javax.swing.JButton two;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables
}
