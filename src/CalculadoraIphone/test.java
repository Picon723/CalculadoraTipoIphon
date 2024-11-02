package CalculadoraIphone;

import java.awt.Color;

public class test extends javax.swing.JFrame {
    
    public Double numero1;
    public Double numero2;
    public String operador;
    
    public test() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        creacionBotones8 = new CalculadoraIphone.CreacionBotones();
        creacionBotones11 = new CalculadoraIphone.CreacionBotones();
        creacionBotones14 = new CalculadoraIphone.CreacionBotones();
        creacionBotones18 = new CalculadoraIphone.CreacionBotones();
        jPanel1 = new javax.swing.JPanel();
        botonMultiplicar = new CalculadoraIphone.CreacionBotones();
        boton9 = new CalculadoraIphone.CreacionBotones();
        botonIgual = new CalculadoraIphone.CreacionBotones();
        botonResta = new CalculadoraIphone.CreacionBotones();
        botonSuma = new CalculadoraIphone.CreacionBotones();
        botonDivision = new CalculadoraIphone.CreacionBotones();
        boton6 = new CalculadoraIphone.CreacionBotones();
        bootn3 = new CalculadoraIphone.CreacionBotones();
        botonPorcentaje = new CalculadoraIphone.CreacionBotones();
        boton7 = new CalculadoraIphone.CreacionBotones();
        boton8 = new CalculadoraIphone.CreacionBotones();
        boton5 = new CalculadoraIphone.CreacionBotones();
        boton2 = new CalculadoraIphone.CreacionBotones();
        boton0 = new CalculadoraIphone.CreacionBotones();
        botonPunto = new CalculadoraIphone.CreacionBotones();
        botonRaro = new CalculadoraIphone.CreacionBotones();
        botonEliminarFull = new CalculadoraIphone.CreacionBotones();
        botonRaro_2 = new CalculadoraIphone.CreacionBotones();
        boton4 = new CalculadoraIphone.CreacionBotones();
        boton1 = new CalculadoraIphone.CreacionBotones();
        casilla = new javax.swing.JLabel();

        creacionBotones8.setBackground(new java.awt.Color(255, 102, 0));
        creacionBotones8.setText("creacionBotones1");
        creacionBotones8.setBorderColor(new java.awt.Color(0, 0, 0));
        creacionBotones8.setColor(new java.awt.Color(255, 102, 0));
        creacionBotones8.setColorOver(new java.awt.Color(255, 153, 0));
        creacionBotones8.setColorclick(new java.awt.Color(255, 153, 0));
        creacionBotones8.setRadius(100);

        creacionBotones11.setBackground(new java.awt.Color(255, 102, 0));
        creacionBotones11.setText("creacionBotones1");
        creacionBotones11.setBorderColor(new java.awt.Color(0, 0, 0));
        creacionBotones11.setColor(new java.awt.Color(255, 102, 0));
        creacionBotones11.setColorOver(new java.awt.Color(255, 153, 0));
        creacionBotones11.setColorclick(new java.awt.Color(255, 153, 0));
        creacionBotones11.setRadius(100);

        creacionBotones14.setBackground(new java.awt.Color(255, 102, 0));
        creacionBotones14.setText("creacionBotones1");
        creacionBotones14.setBorderColor(new java.awt.Color(0, 0, 0));
        creacionBotones14.setColor(new java.awt.Color(255, 102, 0));
        creacionBotones14.setColorOver(new java.awt.Color(255, 153, 0));
        creacionBotones14.setColorclick(new java.awt.Color(255, 153, 0));
        creacionBotones14.setRadius(100);

        creacionBotones18.setBackground(new java.awt.Color(255, 102, 0));
        creacionBotones18.setText("creacionBotones1");
        creacionBotones18.setBorderColor(new java.awt.Color(0, 0, 0));
        creacionBotones18.setColor(new java.awt.Color(255, 102, 0));
        creacionBotones18.setColorOver(new java.awt.Color(255, 153, 0));
        creacionBotones18.setColorclick(new java.awt.Color(255, 153, 0));
        creacionBotones18.setRadius(100);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        botonMultiplicar.setBackground(new java.awt.Color(255, 102, 0));
        botonMultiplicar.setForeground(new java.awt.Color(255, 255, 255));
        botonMultiplicar.setText("×");
        botonMultiplicar.setBorderColor(new java.awt.Color(0, 0, 0));
        botonMultiplicar.setColor(new java.awt.Color(255, 102, 0));
        botonMultiplicar.setColorOver(new java.awt.Color(255, 153, 0));
        botonMultiplicar.setColorclick(new java.awt.Color(255, 153, 0));
        botonMultiplicar.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        botonMultiplicar.setRadius(100);
        botonMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMultiplicarActionPerformed(evt);
            }
        });

        boton9.setBackground(new java.awt.Color(30, 30, 30));
        boton9.setForeground(new java.awt.Color(255, 255, 255));
        boton9.setText("9");
        boton9.setBorderColor(new java.awt.Color(0, 0, 0));
        boton9.setColor(new java.awt.Color(30, 30, 30));
        boton9.setColorOver(new java.awt.Color(102, 102, 102));
        boton9.setColorclick(new java.awt.Color(102, 102, 102));
        boton9.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        boton9.setRadius(100);
        boton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton9ActionPerformed(evt);
            }
        });

        botonIgual.setBackground(new java.awt.Color(255, 102, 0));
        botonIgual.setForeground(new java.awt.Color(255, 255, 255));
        botonIgual.setText("=");
        botonIgual.setBorderColor(new java.awt.Color(0, 0, 0));
        botonIgual.setColor(new java.awt.Color(255, 102, 0));
        botonIgual.setColorOver(new java.awt.Color(255, 153, 0));
        botonIgual.setColorclick(new java.awt.Color(255, 153, 0));
        botonIgual.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        botonIgual.setRadius(100);
        botonIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIgualActionPerformed(evt);
            }
        });

        botonResta.setBackground(new java.awt.Color(255, 102, 0));
        botonResta.setForeground(new java.awt.Color(255, 255, 255));
        botonResta.setText("-");
        botonResta.setBorderColor(new java.awt.Color(0, 0, 0));
        botonResta.setColor(new java.awt.Color(255, 102, 0));
        botonResta.setColorOver(new java.awt.Color(255, 153, 0));
        botonResta.setColorclick(new java.awt.Color(255, 153, 0));
        botonResta.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        botonResta.setRadius(100);
        botonResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRestaActionPerformed(evt);
            }
        });

        botonSuma.setBackground(new java.awt.Color(255, 102, 0));
        botonSuma.setForeground(new java.awt.Color(255, 255, 255));
        botonSuma.setText("+");
        botonSuma.setBorderColor(new java.awt.Color(0, 0, 0));
        botonSuma.setColor(new java.awt.Color(255, 102, 0));
        botonSuma.setColorOver(new java.awt.Color(255, 153, 0));
        botonSuma.setColorclick(new java.awt.Color(255, 153, 0));
        botonSuma.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        botonSuma.setRadius(100);
        botonSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSumaActionPerformed(evt);
            }
        });

        botonDivision.setBackground(new java.awt.Color(255, 102, 0));
        botonDivision.setForeground(new java.awt.Color(255, 255, 255));
        botonDivision.setText("÷");
        botonDivision.setBorderColor(new java.awt.Color(0, 0, 0));
        botonDivision.setColor(new java.awt.Color(255, 102, 0));
        botonDivision.setColorOver(new java.awt.Color(255, 153, 0));
        botonDivision.setColorclick(new java.awt.Color(255, 153, 0));
        botonDivision.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        botonDivision.setRadius(100);
        botonDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDivisionActionPerformed(evt);
            }
        });

        boton6.setBackground(new java.awt.Color(30, 30, 30));
        boton6.setForeground(new java.awt.Color(255, 255, 255));
        boton6.setText("6");
        boton6.setBorderColor(new java.awt.Color(0, 0, 0));
        boton6.setColor(new java.awt.Color(30, 30, 30));
        boton6.setColorOver(new java.awt.Color(102, 102, 102));
        boton6.setColorclick(new java.awt.Color(102, 102, 102));
        boton6.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        boton6.setRadius(100);
        boton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton6ActionPerformed(evt);
            }
        });

        bootn3.setBackground(new java.awt.Color(30, 30, 30));
        bootn3.setForeground(new java.awt.Color(255, 255, 255));
        bootn3.setText("3");
        bootn3.setBorderColor(new java.awt.Color(0, 0, 0));
        bootn3.setColor(new java.awt.Color(30, 30, 30));
        bootn3.setColorOver(new java.awt.Color(102, 102, 102));
        bootn3.setColorclick(new java.awt.Color(102, 102, 102));
        bootn3.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        bootn3.setRadius(100);
        bootn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bootn3ActionPerformed(evt);
            }
        });

        botonPorcentaje.setBackground(new java.awt.Color(102, 102, 102));
        botonPorcentaje.setForeground(new java.awt.Color(255, 255, 255));
        botonPorcentaje.setText("%");
        botonPorcentaje.setBorderColor(new java.awt.Color(0, 0, 0));
        botonPorcentaje.setColor(new java.awt.Color(102, 102, 102));
        botonPorcentaje.setColorOver(new java.awt.Color(153, 153, 153));
        botonPorcentaje.setColorclick(new java.awt.Color(153, 153, 153));
        botonPorcentaje.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        botonPorcentaje.setRadius(100);

        boton7.setBackground(new java.awt.Color(30, 30, 30));
        boton7.setForeground(new java.awt.Color(255, 255, 255));
        boton7.setText("7");
        boton7.setBorderColor(new java.awt.Color(0, 0, 0));
        boton7.setColor(new java.awt.Color(30, 30, 30));
        boton7.setColorOver(new java.awt.Color(102, 102, 102));
        boton7.setColorclick(new java.awt.Color(102, 102, 102));
        boton7.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        boton7.setRadius(100);
        boton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton7ActionPerformed(evt);
            }
        });

        boton8.setBackground(new java.awt.Color(30, 30, 30));
        boton8.setForeground(new java.awt.Color(255, 255, 255));
        boton8.setText("8");
        boton8.setBorderColor(new java.awt.Color(0, 0, 0));
        boton8.setColor(new java.awt.Color(30, 30, 30));
        boton8.setColorOver(new java.awt.Color(102, 102, 102));
        boton8.setColorclick(new java.awt.Color(102, 102, 102));
        boton8.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        boton8.setRadius(100);
        boton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton8ActionPerformed(evt);
            }
        });

        boton5.setBackground(new java.awt.Color(30, 30, 30));
        boton5.setForeground(new java.awt.Color(255, 255, 255));
        boton5.setText("5");
        boton5.setBorderColor(new java.awt.Color(0, 0, 0));
        boton5.setColor(new java.awt.Color(30, 30, 30));
        boton5.setColorOver(new java.awt.Color(102, 102, 102));
        boton5.setColorclick(new java.awt.Color(102, 102, 102));
        boton5.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        boton5.setRadius(100);
        boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton5ActionPerformed(evt);
            }
        });

        boton2.setBackground(new java.awt.Color(30, 30, 30));
        boton2.setForeground(new java.awt.Color(255, 255, 255));
        boton2.setText("2");
        boton2.setBorderColor(new java.awt.Color(0, 0, 0));
        boton2.setColor(new java.awt.Color(30, 30, 30));
        boton2.setColorOver(new java.awt.Color(102, 102, 102));
        boton2.setColorclick(new java.awt.Color(102, 102, 102));
        boton2.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        boton2.setRadius(100);
        boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2ActionPerformed(evt);
            }
        });

        boton0.setBackground(new java.awt.Color(30, 30, 30));
        boton0.setForeground(new java.awt.Color(255, 255, 255));
        boton0.setText("0");
        boton0.setBorderColor(new java.awt.Color(0, 0, 0));
        boton0.setColor(new java.awt.Color(30, 30, 30));
        boton0.setColorOver(new java.awt.Color(102, 102, 102));
        boton0.setColorclick(new java.awt.Color(102, 102, 102));
        boton0.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        boton0.setRadius(100);
        boton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton0ActionPerformed(evt);
            }
        });

        botonPunto.setBackground(new java.awt.Color(30, 30, 30));
        botonPunto.setForeground(new java.awt.Color(255, 255, 255));
        botonPunto.setText(".");
        botonPunto.setBorderColor(new java.awt.Color(0, 0, 0));
        botonPunto.setColor(new java.awt.Color(30, 30, 30));
        botonPunto.setColorOver(new java.awt.Color(102, 102, 102));
        botonPunto.setColorclick(new java.awt.Color(102, 102, 102));
        botonPunto.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        botonPunto.setRadius(100);
        botonPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPuntoActionPerformed(evt);
            }
        });

        botonRaro.setBackground(new java.awt.Color(102, 102, 102));
        botonRaro.setForeground(new java.awt.Color(255, 255, 255));
        botonRaro.setIcon(new javax.swing.ImageIcon("C:\\Users\\Tony\\Downloads\\icon_raro.png")); // NOI18N
        botonRaro.setBorderColor(new java.awt.Color(0, 0, 0));
        botonRaro.setColor(new java.awt.Color(102, 102, 102));
        botonRaro.setColorOver(new java.awt.Color(153, 153, 153));
        botonRaro.setColorclick(new java.awt.Color(153, 153, 153));
        botonRaro.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        botonRaro.setRadius(100);

        botonEliminarFull.setBackground(new java.awt.Color(102, 102, 102));
        botonEliminarFull.setForeground(new java.awt.Color(255, 255, 255));
        botonEliminarFull.setText("AC");
        botonEliminarFull.setBorderColor(new java.awt.Color(0, 0, 0));
        botonEliminarFull.setColor(new java.awt.Color(102, 102, 102));
        botonEliminarFull.setColorOver(new java.awt.Color(153, 153, 153));
        botonEliminarFull.setColorclick(new java.awt.Color(153, 153, 153));
        botonEliminarFull.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        botonEliminarFull.setRadius(100);
        botonEliminarFull.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarFullActionPerformed(evt);
            }
        });

        botonRaro_2.setBackground(new java.awt.Color(30, 30, 30));
        botonRaro_2.setForeground(new java.awt.Color(255, 255, 255));
        botonRaro_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Tony\\Downloads\\icon_cal_v2.png")); // NOI18N
        botonRaro_2.setBorderColor(new java.awt.Color(0, 0, 0));
        botonRaro_2.setColor(new java.awt.Color(30, 30, 30));
        botonRaro_2.setColorOver(new java.awt.Color(102, 102, 102));
        botonRaro_2.setColorclick(new java.awt.Color(102, 102, 102));
        botonRaro_2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        botonRaro_2.setRadius(100);

        boton4.setBackground(new java.awt.Color(30, 30, 30));
        boton4.setForeground(new java.awt.Color(255, 255, 255));
        boton4.setText("4");
        boton4.setBorderColor(new java.awt.Color(0, 0, 0));
        boton4.setColor(new java.awt.Color(30, 30, 30));
        boton4.setColorOver(new java.awt.Color(102, 102, 102));
        boton4.setColorclick(new java.awt.Color(102, 102, 102));
        boton4.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        boton4.setRadius(100);
        boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton4ActionPerformed(evt);
            }
        });

        boton1.setBackground(new java.awt.Color(30, 30, 30));
        boton1.setForeground(new java.awt.Color(255, 255, 255));
        boton1.setText("1");
        boton1.setBorderColor(new java.awt.Color(0, 0, 0));
        boton1.setColor(new java.awt.Color(30, 30, 30));
        boton1.setColorOver(new java.awt.Color(102, 102, 102));
        boton1.setColorclick(new java.awt.Color(102, 102, 102));
        boton1.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        boton1.setRadius(100);
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });

        casilla.setFont(new java.awt.Font("Yu Gothic UI", 0, 80)); // NOI18N
        casilla.setForeground(new java.awt.Color(255, 255, 255));
        casilla.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        casilla.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonRaro_2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonEliminarFull, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(boton8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(boton9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(boton5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(boton6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botonResta, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botonMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(botonRaro, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bootn3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(boton0, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(botonPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botonSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botonIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(casilla, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(casilla, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonRaro, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonEliminarFull, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonResta, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bootn3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botonIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(boton0, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botonRaro_2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void boton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton0ActionPerformed
        this.casilla.setText(this.casilla.getText() + "0");
    }//GEN-LAST:event_boton0ActionPerformed

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
        this.casilla.setText(this.casilla.getText() + "1");
    }//GEN-LAST:event_boton1ActionPerformed

    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2ActionPerformed
        this.casilla.setText(this.casilla.getText() + "2");
    }//GEN-LAST:event_boton2ActionPerformed

    private void bootn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bootn3ActionPerformed
        this.casilla.setText(this.casilla.getText() + "3");
    }//GEN-LAST:event_bootn3ActionPerformed

    private void boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton4ActionPerformed
        this.casilla.setText(this.casilla.getText() + "4");
    }//GEN-LAST:event_boton4ActionPerformed

    private void boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton5ActionPerformed
        this.casilla.setText(this.casilla.getText() + "5");
    }//GEN-LAST:event_boton5ActionPerformed

    private void boton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton6ActionPerformed
        this.casilla.setText(this.casilla.getText() + "6");
    }//GEN-LAST:event_boton6ActionPerformed

    private void boton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton7ActionPerformed
        this.casilla.setText(this.casilla.getText() + "7");
    }//GEN-LAST:event_boton7ActionPerformed

    private void boton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton8ActionPerformed
        this.casilla.setText(this.casilla.getText() + "8");
    }//GEN-LAST:event_boton8ActionPerformed

    private void boton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton9ActionPerformed
        this.casilla.setText(this.casilla.getText() + "9");
    }//GEN-LAST:event_boton9ActionPerformed

    private void botonPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPuntoActionPerformed
        if (!(this.casilla.getText().contains("."))) {
            this.casilla.setText(this.casilla.getText() + ".");
        }
    }//GEN-LAST:event_botonPuntoActionPerformed

    private void botonDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDivisionActionPerformed
        this.numero1 = Double.parseDouble(this.casilla.getText());
        this.operador = "÷";
        this.casilla.setText("");
    }//GEN-LAST:event_botonDivisionActionPerformed

    private void botonMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMultiplicarActionPerformed
        this.numero1 = Double.parseDouble(this.casilla.getText());
        this.operador = "x";
        this.casilla.setText("");
    }//GEN-LAST:event_botonMultiplicarActionPerformed

    private void botonRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRestaActionPerformed
        this.numero1 = Double.parseDouble(this.casilla.getText());
        this.operador = "-";
        this.casilla.setText("");
    }//GEN-LAST:event_botonRestaActionPerformed

    private void botonSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSumaActionPerformed
        this.numero1 = Double.parseDouble(this.casilla.getText());
        this.operador = "+";
        this.casilla.setText("");
    }//GEN-LAST:event_botonSumaActionPerformed

    private void botonEliminarFullActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarFullActionPerformed
        this.casilla.setText("");
    }//GEN-LAST:event_botonEliminarFullActionPerformed

    private void botonIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIgualActionPerformed
        this.numero2 = Double.parseDouble(this.casilla.getText());
        
        switch (this.operador) {
            case "+":
                this.casilla.setText(noDesimal(this.numero1 + this.numero2));
                break;
            case "-":
                this.casilla.setText(noDesimal(this.numero1 - this.numero2));
                break;
            case "x":
                this.casilla.setText(noDesimal(this.numero1 * this.numero2));
                break;
            case "÷":
                if (this.numero2 == 0) {
                    this.casilla.setText("Error");
                } else {
                    this.casilla.setText(noDesimal(this.numero1 / this.numero2));
                }
                break;    
            default:
                throw new AssertionError();
        }
    }//GEN-LAST:event_botonIgualActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public String noDesimal(Double resultado){
          String retorno = "";
          retorno = Double.toString(resultado);
          
          if (resultado % 1 == 0) {
            retorno = retorno.substring(0, retorno.length()-2);
        }
          return retorno;
    }
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new test().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private CalculadoraIphone.CreacionBotones bootn3;
    private CalculadoraIphone.CreacionBotones boton0;
    private CalculadoraIphone.CreacionBotones boton1;
    private CalculadoraIphone.CreacionBotones boton2;
    private CalculadoraIphone.CreacionBotones boton4;
    private CalculadoraIphone.CreacionBotones boton5;
    private CalculadoraIphone.CreacionBotones boton6;
    private CalculadoraIphone.CreacionBotones boton7;
    private CalculadoraIphone.CreacionBotones boton8;
    private CalculadoraIphone.CreacionBotones boton9;
    private CalculadoraIphone.CreacionBotones botonDivision;
    private CalculadoraIphone.CreacionBotones botonEliminarFull;
    private CalculadoraIphone.CreacionBotones botonIgual;
    private CalculadoraIphone.CreacionBotones botonMultiplicar;
    private CalculadoraIphone.CreacionBotones botonPorcentaje;
    private CalculadoraIphone.CreacionBotones botonPunto;
    private CalculadoraIphone.CreacionBotones botonRaro;
    private CalculadoraIphone.CreacionBotones botonRaro_2;
    private CalculadoraIphone.CreacionBotones botonResta;
    private CalculadoraIphone.CreacionBotones botonSuma;
    private javax.swing.JLabel casilla;
    private CalculadoraIphone.CreacionBotones creacionBotones11;
    private CalculadoraIphone.CreacionBotones creacionBotones14;
    private CalculadoraIphone.CreacionBotones creacionBotones18;
    private CalculadoraIphone.CreacionBotones creacionBotones8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
