package com.hcl.calculator;

public class Calculator extends javax.swing.JFrame {

    private Calculate calculate = new Calculate();

    private static double a;
    private static double b;

    private EOperation operation = EOperation.DEFAULT;

    private static boolean isDecimal = false;

    /**
     * Creates new form Calculator
     */
    public Calculator() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        input = new javax.swing.JTextField();
        sevenBtn = new javax.swing.JButton();
        eightBtn = new javax.swing.JButton();
        divideBtn = new javax.swing.JButton();
        nineBtn = new javax.swing.JButton();
        fourBtn = new javax.swing.JButton();
        fiveBtn = new javax.swing.JButton();
        sixBtn = new javax.swing.JButton();
        multiplyBtn = new javax.swing.JButton();
        oneBtn = new javax.swing.JButton();
        twoBtn = new javax.swing.JButton();
        threeBtn = new javax.swing.JButton();
        minusBtn = new javax.swing.JButton();
        zeroBtn = new javax.swing.JButton();
        decimalBtn = new javax.swing.JButton();
        plusBtn = new javax.swing.JButton();
        equalBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        percentageBtn = new javax.swing.JButton();
        clearElementBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setLocation(new java.awt.Point(600, 250));
        setResizable(false);

        input.setEditable(false);
        input.setFont(new java.awt.Font("Rockwell Nova Light", 0, 22)); // NOI18N
        input.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        input.setText("0");
        input.setCaretColor(new java.awt.Color(242, 242, 242));
        input.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        sevenBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        sevenBtn.setText("7");
        sevenBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        sevenBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sevenBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenBtnActionPerformed(evt);
            }
        });

        eightBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        eightBtn.setText("8");
        eightBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        eightBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        eightBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightBtnActionPerformed(evt);
            }
        });

        divideBtn.setBackground(new java.awt.Color(102, 102, 102));
        divideBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        divideBtn.setForeground(new java.awt.Color(255, 255, 255));
        divideBtn.setText("/");
        divideBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        divideBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        divideBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideBtnActionPerformed(evt);
            }
        });

        nineBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        nineBtn.setText("9");
        nineBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        nineBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineBtnActionPerformed(evt);
            }
        });

        fourBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        fourBtn.setText("4");
        fourBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        fourBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        fourBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourBtnActionPerformed(evt);
            }
        });

        fiveBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        fiveBtn.setText("5");
        fiveBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        fiveBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        fiveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveBtnActionPerformed(evt);
            }
        });

        sixBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        sixBtn.setText("6");
        sixBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        sixBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sixBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixBtnActionPerformed(evt);
            }
        });

        multiplyBtn.setBackground(new java.awt.Color(102, 102, 102));
        multiplyBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        multiplyBtn.setForeground(new java.awt.Color(255, 255, 255));
        multiplyBtn.setText("x");
        multiplyBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        multiplyBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        multiplyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplyBtnActionPerformed(evt);
            }
        });

        oneBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        oneBtn.setText("1");
        oneBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        oneBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        oneBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneBtnActionPerformed(evt);
            }
        });

        twoBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        twoBtn.setText("2");
        twoBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        twoBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        twoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoBtnActionPerformed(evt);
            }
        });

        threeBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        threeBtn.setText("3");
        threeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        threeBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        threeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeBtnActionPerformed(evt);
            }
        });

        minusBtn.setBackground(new java.awt.Color(102, 102, 102));
        minusBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        minusBtn.setForeground(new java.awt.Color(255, 255, 255));
        minusBtn.setText("-");
        minusBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        minusBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        minusBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusBtnActionPerformed(evt);
            }
        });

        zeroBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        zeroBtn.setText("0");
        zeroBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        zeroBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        zeroBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroBtnActionPerformed(evt);
            }
        });

        decimalBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        decimalBtn.setText(".");
        decimalBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        decimalBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        decimalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decimalBtnActionPerformed(evt);
            }
        });

        plusBtn.setBackground(new java.awt.Color(102, 102, 102));
        plusBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        plusBtn.setForeground(new java.awt.Color(255, 255, 255));
        plusBtn.setText("+");
        plusBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        plusBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        plusBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusBtnActionPerformed(evt);
            }
        });

        equalBtn.setBackground(new java.awt.Color(255, 153, 51));
        equalBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        equalBtn.setForeground(new java.awt.Color(242, 242, 242));
        equalBtn.setText("=");
        equalBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        equalBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        equalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalBtnActionPerformed(evt);
            }
        });

        clearBtn.setBackground(new java.awt.Color(153, 0, 0));
        clearBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        clearBtn.setForeground(new java.awt.Color(242, 242, 242));
        clearBtn.setText("C");
        clearBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        clearBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        percentageBtn.setBackground(new java.awt.Color(0, 102, 102));
        percentageBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        percentageBtn.setForeground(new java.awt.Color(255, 255, 255));
        percentageBtn.setText("%");
        percentageBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        percentageBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        percentageBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                percentageBtnActionPerformed(evt);
            }
        });

        clearElementBtn.setBackground(new java.awt.Color(153, 0, 0));
        clearElementBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        clearElementBtn.setForeground(new java.awt.Color(242, 242, 242));
        clearElementBtn.setText("CE");
        clearElementBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        clearElementBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        clearElementBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearElementBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(input, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fourBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fiveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sixBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(clearElementBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(percentageBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sevenBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(eightBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nineBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(minusBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                            .addComponent(multiplyBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(divideBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(zeroBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(oneBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(twoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(decimalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(threeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(plusBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(equalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(divideBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(percentageBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clearElementBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sevenBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nineBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eightBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(multiplyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fourBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sixBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fiveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(minusBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oneBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(threeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(twoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plusBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(zeroBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(decimalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(equalBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void zeroBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroBtnActionPerformed
        if (input.getText().equals("0")) {
            input.setText("0");
        } else {
            input.setText(input.getText() + "0");
        }
    }//GEN-LAST:event_zeroBtnActionPerformed

    private void oneBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneBtnActionPerformed
        if (input.getText().equals("0") || input.getText().equals("+")
                || input.getText().equals("-") || input.getText().equals("x") || input.getText().equals("/")) {
            input.setText("1");
        } else {
            input.setText(input.getText() + "1");
        }
    }//GEN-LAST:event_oneBtnActionPerformed

    private void twoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoBtnActionPerformed
        if (input.getText().equals("0") || input.getText().equals("+")
                || input.getText().equals("-") || input.getText().equals("x") || input.getText().equals("/")) {
            input.setText("2");
        } else {
            input.setText(input.getText() + "2");
        }
    }//GEN-LAST:event_twoBtnActionPerformed

    private void threeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeBtnActionPerformed
        if (input.getText().equals("0") || input.getText().equals("+")
                || input.getText().equals("-") || input.getText().equals("x") || input.getText().equals("/")) {
            input.setText("3");
        } else {
            input.setText(input.getText() + "3");
        }
    }//GEN-LAST:event_threeBtnActionPerformed

    private void fourBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourBtnActionPerformed
        if (input.getText().equals("0") || input.getText().equals("+")
                || input.getText().equals("-") || input.getText().equals("x") || input.getText().equals("/")) {
            input.setText("4");
        } else {
            input.setText(input.getText() + "4");
        }
    }//GEN-LAST:event_fourBtnActionPerformed

    private void fiveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveBtnActionPerformed
        if (input.getText().equals("0") || input.getText().equals("+")
                || input.getText().equals("-") || input.getText().equals("x") || input.getText().equals("/")) {
            input.setText("5");
        } else {
            input.setText(input.getText() + "5");
        }
    }//GEN-LAST:event_fiveBtnActionPerformed

    private void sixBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixBtnActionPerformed
        if (input.getText().equals("0") || input.getText().equals("+")
                || input.getText().equals("-") || input.getText().equals("x") || input.getText().equals("/")) {
            input.setText("6");
        } else {
            input.setText(input.getText() + "6");
        }
    }//GEN-LAST:event_sixBtnActionPerformed

    private void sevenBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenBtnActionPerformed
        if (input.getText().equals("0") || input.getText().equals("+")
                || input.getText().equals("-") || input.getText().equals("x") || input.getText().equals("/")) {
            input.setText("7");
        } else {
            input.setText(input.getText() + "7");
        }
    }//GEN-LAST:event_sevenBtnActionPerformed

    private void eightBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightBtnActionPerformed
        if (input.getText().equals("0") || input.getText().equals("+")
                || input.getText().equals("-") || input.getText().equals("x") || input.getText().equals("/")) {
            input.setText("8");
        } else {
            input.setText(input.getText() + "8");
        }
    }//GEN-LAST:event_eightBtnActionPerformed

    private void nineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineBtnActionPerformed
        if (input.getText().equals("0") || input.getText().equals("+")
                || input.getText().equals("-") || input.getText().equals("x") || input.getText().equals("/")) {
            input.setText("9");
        } else {
            input.setText(input.getText() + "9");
        }
    }//GEN-LAST:event_nineBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        input.setText("0");
    }//GEN-LAST:event_clearBtnActionPerformed

    private void clearElementBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearElementBtnActionPerformed
        if (input.getText().length() <= 1) {
            input.setText("0");
        } else {
            input.setText(input.getText().substring(0, input.getText().length() - 1));
        }
    }//GEN-LAST:event_clearElementBtnActionPerformed

    private void plusBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusBtnActionPerformed
        operation = EOperation.PLUS;
        a = Double.parseDouble(input.getText());
        input.setText("+");
    }//GEN-LAST:event_plusBtnActionPerformed

    private void minusBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusBtnActionPerformed
        operation = EOperation.MINUS;
        a = Double.parseDouble(input.getText());
        input.setText("-");
    }//GEN-LAST:event_minusBtnActionPerformed

    private void multiplyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplyBtnActionPerformed
        operation = EOperation.MULTIPLY;
        a = Double.parseDouble(input.getText());
        input.setText("x");
    }//GEN-LAST:event_multiplyBtnActionPerformed

    private void divideBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideBtnActionPerformed
        operation = EOperation.DIVIDE;
        a = Double.parseDouble(input.getText());
        input.setText("/");
    }//GEN-LAST:event_divideBtnActionPerformed

    private void equalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalBtnActionPerformed
        b = Double.parseDouble(input.getText());

        int aInt = (int) a;
        int bInt = (int) b;

        switch (operation) {
            case PLUS:
                if (isDecimal) {
                    input.setText(String.valueOf(calculate.plus(a, b)));
                } else {
                    input.setText(String.valueOf(calculate.plus(aInt, bInt)));
                }
                break;

            case MINUS:
                if (isDecimal) {
                    input.setText(String.valueOf(calculate.minus(a, b)));
                } else {
                    input.setText(String.valueOf(calculate.minus(aInt, bInt)));
                }
                break;

            case MULTIPLY:
                if (isDecimal) {
                    input.setText(String.valueOf(calculate.multiply(a, b)));
                } else {
                    input.setText(String.valueOf(calculate.multiply(aInt, bInt)));
                }
                break;

            case DIVIDE:
                if (a % b == 0) {
                    input.setText(String.valueOf(calculate.divide(a, b)));
                } else {
                    double c = Double.parseDouble(String.valueOf(a));
                    double d = Double.parseDouble(String.valueOf(b));
                    input.setText(String.valueOf(calculate.divide(c, d)));
                }
                break;

            default:
                input.setText(input.getText());
        }
        isDecimal = false;
    }//GEN-LAST:event_equalBtnActionPerformed

    private void decimalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decimalBtnActionPerformed
        isDecimal = true;
        input.setText(input.getText() + ".");
    }//GEN-LAST:event_decimalBtnActionPerformed

    private void percentageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_percentageBtnActionPerformed
        a = Integer.parseInt(input.getText());
        input.setText(String.valueOf(calculate.percentage(a)));
    }//GEN-LAST:event_percentageBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton clearElementBtn;
    private javax.swing.JButton decimalBtn;
    private javax.swing.JButton divideBtn;
    private javax.swing.JButton eightBtn;
    private javax.swing.JButton equalBtn;
    private javax.swing.JButton fiveBtn;
    private javax.swing.JButton fourBtn;
    private javax.swing.JTextField input;
    private javax.swing.JButton minusBtn;
    private javax.swing.JButton multiplyBtn;
    private javax.swing.JButton nineBtn;
    private javax.swing.JButton oneBtn;
    private javax.swing.JButton percentageBtn;
    private javax.swing.JButton plusBtn;
    private javax.swing.JButton sevenBtn;
    private javax.swing.JButton sixBtn;
    private javax.swing.JButton threeBtn;
    private javax.swing.JButton twoBtn;
    private javax.swing.JButton zeroBtn;
    // End of variables declaration//GEN-END:variables
}
