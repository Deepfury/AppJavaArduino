package appFiles;

import com.panamahitek.ArduinoException;
import com.panamahitek.PanamaHitek_Arduino;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import jssc.SerialPortException;
import javax.swing.*;

public class pantallaPrincipal extends javax.swing.JFrame {

    static PanamaHitek_Arduino arduinoObj = new PanamaHitek_Arduino();
    static String direccion[] = new String[40];
    public static int matriz[][] = new int[5][8];
    static int p = 1, k = 1;

    public pantallaPrincipal() {
        initComponents();
    }

    static void analisisRecorrido() {
        int sw = 0;
        int n = 2;
        int anti = 0, antj = 0, sgtei = 0, sgtej = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                if (matriz[i][j] == 1 && sw == 0) {
                    anti = i;
                    antj = j;
                    sw = 1;
                    direccion[0] = "a";
                    i=0;
                    j=0;
                } else if (matriz[i][j] == n && sw == 1) {
                    outer: for (int z = 0; z < 5; z++) {
                        inner: for (int w = 0; w < 8; w++) {
                            if (matriz[z][w] == n + 1) {
                                sgtei = z;
                                sgtej = w;
                                analizar(anti, antj, i, j, sgtei, sgtej);
                                anti = i;
                                antj = j;
                                i = 0;
                                j = 0;
                                n++;
                                break outer;
                            }
                        }
                    }
                } //else
            }
        }
        direccion[k] = "a";
    }//end analisisRecorrido

    static void analizar(int anti, int antj, int acti, int actj, int sgtei, int sgtej) {
        System.out.println("entro al analizar");
        if (anti == sgtei || antj == sgtej) {
            direccion[k] = "a";
        } else if (anti < sgtei && antj > sgtej) {
            if (acti == sgtei) {
                direccion[k] = "d";
            } else {
                direccion[k] = "i";
            }
        } else if (anti < sgtei && antj < sgtej) {
            if (acti == sgtei) {
                direccion[k] = "i";
            } else {
                direccion[k] = "d";
            }
        } else if (anti > sgtei && antj < sgtej) {
            if (acti == anti) {
                direccion[k] = "i";
            } else {
                direccion[k] = "d";
            }
        } else if (anti > sgtei && antj > sgtej) {
            if (acti == sgtei) {
                direccion[k] = "i";
            } else {
                direccion[k] = "d";
            }
        }
        k++;
    }//end analizar

    private void activarBotones() {
        btnPosicion00.setEnabled(true);
        btnPosicion01.setEnabled(true);
        btnPosicion02.setEnabled(true);
        btnPosicion03.setEnabled(true);
        btnPosicion04.setEnabled(true);
        btnPosicion05.setEnabled(true);
        btnPosicion06.setEnabled(true);
        btnPosicion07.setEnabled(true);
        btnPosicion10.setEnabled(true);
        btnPosicion11.setEnabled(true);
        btnPosicion12.setEnabled(true);
        btnPosicion13.setEnabled(true);
        btnPosicion14.setEnabled(true);
        btnPosicion15.setEnabled(true);
        btnPosicion16.setEnabled(true);
        btnPosicion17.setEnabled(true);
        btnPosicion20.setEnabled(true);
        btnPosicion21.setEnabled(true);
        btnPosicion22.setEnabled(true);
        btnPosicion23.setEnabled(true);
        btnPosicion24.setEnabled(true);
        btnPosicion25.setEnabled(true);
        btnPosicion26.setEnabled(true);
        btnPosicion27.setEnabled(true);
        btnPosicion30.setEnabled(true);
        btnPosicion31.setEnabled(true);
        btnPosicion32.setEnabled(true);
        btnPosicion33.setEnabled(true);
        btnPosicion34.setEnabled(true);
        btnPosicion35.setEnabled(true);
        btnPosicion36.setEnabled(true);
        btnPosicion37.setEnabled(true);
        btnPosicion40.setEnabled(true);
        btnPosicion41.setEnabled(true);
        btnPosicion42.setEnabled(true);
        btnPosicion43.setEnabled(true);
        btnPosicion44.setEnabled(true);
        btnPosicion45.setEnabled(true);
        btnPosicion46.setEnabled(true);
        btnPosicion47.setEnabled(true);
    }

    public static void conexion() {
        try {
            arduinoObj.arduinoTX("COM4", 9600);
        } catch (ArduinoException ex) {
            Logger.getLogger(pantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnConectar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnPosicion00 = new javax.swing.JButton();
        btnPosicion01 = new javax.swing.JButton();
        btnPosicion02 = new javax.swing.JButton();
        btnPosicion03 = new javax.swing.JButton();
        btnPosicion04 = new javax.swing.JButton();
        btnPosicion05 = new javax.swing.JButton();
        btnPosicion06 = new javax.swing.JButton();
        btnPosicion07 = new javax.swing.JButton();
        btnPosicion10 = new javax.swing.JButton();
        btnPosicion11 = new javax.swing.JButton();
        btnPosicion12 = new javax.swing.JButton();
        btnPosicion13 = new javax.swing.JButton();
        btnPosicion14 = new javax.swing.JButton();
        btnPosicion15 = new javax.swing.JButton();
        btnPosicion16 = new javax.swing.JButton();
        btnPosicion17 = new javax.swing.JButton();
        btnPosicion20 = new javax.swing.JButton();
        btnPosicion21 = new javax.swing.JButton();
        btnPosicion22 = new javax.swing.JButton();
        btnPosicion23 = new javax.swing.JButton();
        btnPosicion24 = new javax.swing.JButton();
        btnPosicion25 = new javax.swing.JButton();
        btnPosicion26 = new javax.swing.JButton();
        btnPosicion27 = new javax.swing.JButton();
        btnPosicion30 = new javax.swing.JButton();
        btnPosicion31 = new javax.swing.JButton();
        btnPosicion32 = new javax.swing.JButton();
        btnPosicion33 = new javax.swing.JButton();
        btnPosicion34 = new javax.swing.JButton();
        btnPosicion35 = new javax.swing.JButton();
        btnPosicion36 = new javax.swing.JButton();
        btnPosicion37 = new javax.swing.JButton();
        btnPosicion40 = new javax.swing.JButton();
        btnPosicion41 = new javax.swing.JButton();
        btnPosicion43 = new javax.swing.JButton();
        btnPosicion42 = new javax.swing.JButton();
        btnPosicion44 = new javax.swing.JButton();
        btnPosicion45 = new javax.swing.JButton();
        btnPosicion46 = new javax.swing.JButton();
        btnPosicion47 = new javax.swing.JButton();
        btnEnviar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnConectar.setText("Conectar");
        btnConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConectarActionPerformed(evt);
            }
        });

        jLabel1.setText("Bienvenid@ a la App de control");

        jLabel2.setText("Seleccione su ruta:");

        btnPosicion00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPosicion00ActionPerformed(evt);
            }
        });

        btnPosicion01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPosicion01ActionPerformed(evt);
            }
        });

        btnPosicion02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPosicion02ActionPerformed(evt);
            }
        });

        btnPosicion03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPosicion03ActionPerformed(evt);
            }
        });

        btnPosicion04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPosicion04ActionPerformed(evt);
            }
        });

        btnPosicion05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPosicion05ActionPerformed(evt);
            }
        });

        btnPosicion06.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPosicion06ActionPerformed(evt);
            }
        });

        btnPosicion07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPosicion07ActionPerformed(evt);
            }
        });

        btnPosicion10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPosicion10ActionPerformed(evt);
            }
        });

        btnPosicion11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPosicion11ActionPerformed(evt);
            }
        });

        btnPosicion12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPosicion12ActionPerformed(evt);
            }
        });

        btnPosicion13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPosicion13ActionPerformed(evt);
            }
        });

        btnPosicion14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPosicion14ActionPerformed(evt);
            }
        });

        btnPosicion15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPosicion15ActionPerformed(evt);
            }
        });

        btnPosicion16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPosicion16ActionPerformed(evt);
            }
        });

        btnPosicion17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPosicion17ActionPerformed(evt);
            }
        });

        btnPosicion20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPosicion20ActionPerformed(evt);
            }
        });

        btnPosicion21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPosicion21ActionPerformed(evt);
            }
        });

        btnPosicion22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPosicion22ActionPerformed(evt);
            }
        });

        btnPosicion23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPosicion23ActionPerformed(evt);
            }
        });

        btnPosicion24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPosicion24ActionPerformed(evt);
            }
        });

        btnPosicion25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPosicion25ActionPerformed(evt);
            }
        });

        btnPosicion26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPosicion26ActionPerformed(evt);
            }
        });

        btnPosicion27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPosicion27ActionPerformed(evt);
            }
        });

        btnPosicion30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPosicion30ActionPerformed(evt);
            }
        });

        btnPosicion31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPosicion31ActionPerformed(evt);
            }
        });

        btnPosicion32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPosicion32ActionPerformed(evt);
            }
        });

        btnPosicion33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPosicion33ActionPerformed(evt);
            }
        });

        btnPosicion34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPosicion34ActionPerformed(evt);
            }
        });

        btnPosicion35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPosicion35ActionPerformed(evt);
            }
        });

        btnPosicion36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPosicion36ActionPerformed(evt);
            }
        });

        btnPosicion37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPosicion37ActionPerformed(evt);
            }
        });

        btnPosicion40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPosicion40ActionPerformed(evt);
            }
        });

        btnPosicion41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPosicion41ActionPerformed(evt);
            }
        });

        btnPosicion43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPosicion43ActionPerformed(evt);
            }
        });

        btnPosicion42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPosicion42ActionPerformed(evt);
            }
        });

        btnPosicion44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPosicion44ActionPerformed(evt);
            }
        });

        btnPosicion45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPosicion45ActionPerformed(evt);
            }
        });

        btnPosicion46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPosicion46ActionPerformed(evt);
            }
        });

        btnPosicion47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPosicion47ActionPerformed(evt);
            }
        });

        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(68, 68, 68))
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEnviar)
                        .addGap(18, 18, 18)
                        .addComponent(btnConectar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnPosicion00, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnPosicion01, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnPosicion02, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnPosicion03, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnPosicion04, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnPosicion05, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnPosicion06, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnPosicion07, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnPosicion10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnPosicion11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnPosicion12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnPosicion13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnPosicion14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnPosicion15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnPosicion16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnPosicion17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnPosicion20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnPosicion21, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnPosicion22, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnPosicion23, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnPosicion24, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnPosicion25, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnPosicion26, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnPosicion27, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnPosicion30, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnPosicion31, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnPosicion32, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnPosicion33, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnPosicion34, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnPosicion35, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnPosicion36, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnPosicion37, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnPosicion40, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnPosicion41, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnPosicion42, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnPosicion43, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnPosicion44, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnPosicion45, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnPosicion46, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnPosicion47, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPosicion00, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPosicion01, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPosicion02, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPosicion03, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPosicion04, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPosicion06, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPosicion07, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPosicion05, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPosicion10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPosicion11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPosicion12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPosicion13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPosicion14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPosicion16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPosicion17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPosicion15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPosicion25, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPosicion35, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnPosicion20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnPosicion21, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnPosicion22, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnPosicion23, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnPosicion24, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnPosicion26, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnPosicion27, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnPosicion36, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(btnPosicion30, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btnPosicion32, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(btnPosicion33, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnPosicion34, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(btnPosicion37, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addComponent(btnPosicion31, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPosicion40, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPosicion41, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPosicion42, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPosicion43, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPosicion44, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPosicion46, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPosicion47, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPosicion45, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConectar)
                    .addComponent(btnEnviar))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConectarActionPerformed
        conexion();
        //btnConectar.disable();
    }//GEN-LAST:event_btnConectarActionPerformed

    private void btnPosicion02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPosicion02ActionPerformed
        matriz[0][2] = p;
        //btnPosicion02.setBackground(Color.red);
        btnPosicion02.setEnabled(false);
        p++;
    }//GEN-LAST:event_btnPosicion02ActionPerformed

    private void btnPosicion00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPosicion00ActionPerformed
        matriz[0][0] = p;
        //btnPosicion00.setBackground(Color.red);
        btnPosicion00.setEnabled(false);
        p++;
    }//GEN-LAST:event_btnPosicion00ActionPerformed

    private void btnPosicion01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPosicion01ActionPerformed
        matriz[0][1] = p;
        //btnPosicion01.setBackground(Color.red);
        btnPosicion01.setEnabled(false);
        p++;
    }//GEN-LAST:event_btnPosicion01ActionPerformed

    private void btnPosicion03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPosicion03ActionPerformed
        matriz[0][3] = p;
        //btnPosicion03.setBackground(Color.red);
        btnPosicion03.setEnabled(false);
        p++;
    }//GEN-LAST:event_btnPosicion03ActionPerformed

    private void btnPosicion04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPosicion04ActionPerformed
        matriz[0][4] = p;
        //btnPosicion04.setBackground(Color.red);
        btnPosicion04.setEnabled(false);
        p++;
    }//GEN-LAST:event_btnPosicion04ActionPerformed

    private void btnPosicion05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPosicion05ActionPerformed
        matriz[0][5] = p;
        //btnPosicion05.setBackground(Color.red);
        btnPosicion05.setEnabled(false);
        p++;
    }//GEN-LAST:event_btnPosicion05ActionPerformed

    private void btnPosicion06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPosicion06ActionPerformed
        matriz[0][6] = p;
        //btnPosicion06.setBackground(Color.red);
        btnPosicion06.setEnabled(false);
        p++;
    }//GEN-LAST:event_btnPosicion06ActionPerformed

    private void btnPosicion07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPosicion07ActionPerformed
        matriz[0][7] = p;
        //btnPosicion07.setBackground(Color.red);
        btnPosicion07.setEnabled(false);
        p++;
    }//GEN-LAST:event_btnPosicion07ActionPerformed

    private void btnPosicion10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPosicion10ActionPerformed
        matriz[1][0] = p;
        //btnPosicion10.setBackground(Color.red);
        btnPosicion10.setEnabled(false);
        p++;
    }//GEN-LAST:event_btnPosicion10ActionPerformed

    private void btnPosicion11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPosicion11ActionPerformed
        matriz[1][1] = p;
        //btnPosicion11.setBackground(Color.red);
        btnPosicion11.setEnabled(false);
        p++;
    }//GEN-LAST:event_btnPosicion11ActionPerformed

    private void btnPosicion12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPosicion12ActionPerformed
        matriz[1][2] = p;
        //btnPosicion12.setBackground(Color.red);
        btnPosicion12.setEnabled(false);
        p++;
    }//GEN-LAST:event_btnPosicion12ActionPerformed

    private void btnPosicion13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPosicion13ActionPerformed
        matriz[1][3] = p;
        //btnPosicion13.setBackground(Color.red);
        btnPosicion13.setEnabled(false);
        p++;
    }//GEN-LAST:event_btnPosicion13ActionPerformed

    private void btnPosicion14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPosicion14ActionPerformed
        matriz[1][4] = p;
        //btnPosicion14.setBackground(Color.red);
        btnPosicion14.setEnabled(false);
        p++;
    }//GEN-LAST:event_btnPosicion14ActionPerformed

    private void btnPosicion15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPosicion15ActionPerformed
        matriz[1][5] = p;
        //btnPosicion15.setBackground(Color.red);
        btnPosicion15.setEnabled(false);
        p++;
    }//GEN-LAST:event_btnPosicion15ActionPerformed

    private void btnPosicion16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPosicion16ActionPerformed
        matriz[1][6] = p;
        //btnPosicion16.setBackground(Color.red);
        btnPosicion16.setEnabled(false);
        p++;
    }//GEN-LAST:event_btnPosicion16ActionPerformed

    private void btnPosicion17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPosicion17ActionPerformed
        matriz[1][7] = p;
        //btnPosicion17.setBackground(Color.red);
        btnPosicion17.setEnabled(false);
        p++;
    }//GEN-LAST:event_btnPosicion17ActionPerformed

    private void btnPosicion20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPosicion20ActionPerformed
        matriz[2][0] = p;
        //btnPosicion20.setBackground(Color.red);
        btnPosicion20.setEnabled(false);
        p++;
    }//GEN-LAST:event_btnPosicion20ActionPerformed

    private void btnPosicion21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPosicion21ActionPerformed
        matriz[2][1] = p;
        //btnPosicion21.setBackground(Color.red);
        btnPosicion21.setEnabled(false);
        p++;
    }//GEN-LAST:event_btnPosicion21ActionPerformed

    private void btnPosicion22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPosicion22ActionPerformed
        matriz[2][2] = p;
        //btnPosicion22.setBackground(Color.red);
        btnPosicion22.setEnabled(false);
        p++;
    }//GEN-LAST:event_btnPosicion22ActionPerformed

    private void btnPosicion23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPosicion23ActionPerformed
        matriz[2][3] = p;
        //btnPosicion23.setBackground(Color.red);
        btnPosicion23.setEnabled(false);
        p++;
    }//GEN-LAST:event_btnPosicion23ActionPerformed

    private void btnPosicion24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPosicion24ActionPerformed
        matriz[2][4] = p;
        //btnPosicion24.setBackground(Color.red);
        btnPosicion24.setEnabled(false);
        p++;
    }//GEN-LAST:event_btnPosicion24ActionPerformed

    private void btnPosicion25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPosicion25ActionPerformed
        matriz[2][5] = p;
        //btnPosicion25.setBackground(Color.red);
        btnPosicion25.setEnabled(false);
        p++;
    }//GEN-LAST:event_btnPosicion25ActionPerformed

    private void btnPosicion26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPosicion26ActionPerformed
        matriz[2][6] = p;
        //btnPosicion26.setBackground(Color.red);
        btnPosicion26.setEnabled(false);
        p++;
    }//GEN-LAST:event_btnPosicion26ActionPerformed

    private void btnPosicion27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPosicion27ActionPerformed
        matriz[2][7] = p;
        //btnPosicion27.setBackground(Color.red);
        btnPosicion27.setEnabled(false);
        p++;
    }//GEN-LAST:event_btnPosicion27ActionPerformed

    private void btnPosicion30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPosicion30ActionPerformed
        // TODO add your handling code here:
        matriz[3][0] = p;
        //btnPosicion30.setBackground(Color.red);
        btnPosicion30.setEnabled(false);
        p++;
    }//GEN-LAST:event_btnPosicion30ActionPerformed

    private void btnPosicion31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPosicion31ActionPerformed
        // TODO add your handling code here:
        matriz[3][1] = p;
        //btnPosicion31.setBackground(Color.red);
        btnPosicion31.setEnabled(false);
        p++;
    }//GEN-LAST:event_btnPosicion31ActionPerformed

    private void btnPosicion32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPosicion32ActionPerformed
        // TODO add your handling code here:
        matriz[3][2] = p;
        //btnPosicion32.setBackground(Color.red);
        btnPosicion32.setEnabled(false);
        p++;
    }//GEN-LAST:event_btnPosicion32ActionPerformed

    private void btnPosicion33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPosicion33ActionPerformed
        // TODO add your handling code here:
        matriz[3][3] = p;
        //btnPosicion33.setBackground(Color.red);
        btnPosicion33.setEnabled(false);
        p++;
    }//GEN-LAST:event_btnPosicion33ActionPerformed

    private void btnPosicion34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPosicion34ActionPerformed
        // TODO add your handling code here:
        matriz[3][4] = p;
        //btnPosicion34.setBackground(Color.red);
        btnPosicion34.setEnabled(false);
        p++;
    }//GEN-LAST:event_btnPosicion34ActionPerformed

    private void btnPosicion35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPosicion35ActionPerformed
        // TODO add your handling code here:
        matriz[3][5] = p;
        //btnPosicion35.setBackground(Color.red);
        btnPosicion35.setEnabled(false);
        p++;
    }//GEN-LAST:event_btnPosicion35ActionPerformed

    private void btnPosicion36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPosicion36ActionPerformed
        // TODO add your handling code here:
        matriz[3][6] = p;
        //btnPosicion36.setBackground(Color.red);
        btnPosicion36.setEnabled(false);
        p++;
    }//GEN-LAST:event_btnPosicion36ActionPerformed

    private void btnPosicion37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPosicion37ActionPerformed
        // TODO add your handling code here:
        matriz[3][7] = p;
        //btnPosicion37.setBackground(Color.red);
        btnPosicion37.setEnabled(false);
        p++;
    }//GEN-LAST:event_btnPosicion37ActionPerformed

    private void btnPosicion40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPosicion40ActionPerformed
        // TODO add your handling code here:
        matriz[4][0] = p;
        //btnPosicion40.setBackground(Color.red);
        btnPosicion40.setEnabled(false);
        p++;
    }//GEN-LAST:event_btnPosicion40ActionPerformed

    private void btnPosicion41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPosicion41ActionPerformed
        // TODO add your handling code here:
        matriz[4][1] = p;
        //btnPosicion41.setBackground(Color.red);
        btnPosicion41.setEnabled(false);
        p++;
    }//GEN-LAST:event_btnPosicion41ActionPerformed

    private void btnPosicion42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPosicion42ActionPerformed
        // TODO add your handling code here:
        matriz[4][2] = p;
        //btnPosicion42.setBackground(Color.red);
        btnPosicion42.setEnabled(false);
        p++;
    }//GEN-LAST:event_btnPosicion42ActionPerformed

    private void btnPosicion43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPosicion43ActionPerformed
        // TODO add your handling code here:
        matriz[4][3] = p;
        //btnPosicion43.setBackground(Color.red);
        btnPosicion43.setEnabled(false);
        p++;
    }//GEN-LAST:event_btnPosicion43ActionPerformed

    private void btnPosicion44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPosicion44ActionPerformed
        // TODO add your handling code here:
        matriz[4][4] = p;
        //btnPosicion44.setBackground(Color.red);
        btnPosicion44.setEnabled(false);
        p++;
    }//GEN-LAST:event_btnPosicion44ActionPerformed

    private void btnPosicion45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPosicion45ActionPerformed
        // TODO add your handling code here:
        matriz[4][5] = p;
        //btnPosicion45.setBackground(Color.red);
        btnPosicion45.setEnabled(false);
        p++;
    }//GEN-LAST:event_btnPosicion45ActionPerformed

    private void btnPosicion46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPosicion46ActionPerformed
        // TODO add your handling code here:
        matriz[4][6] = p;
        //btnPosicion46.setBackground(Color.red);
        btnPosicion46.setEnabled(false);
        p++;
    }//GEN-LAST:event_btnPosicion46ActionPerformed

    private void btnPosicion47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPosicion47ActionPerformed
        // TODO add your handling code here:
        matriz[4][7] = p;
        //btnPosicion47.setBackground(Color.red);
        btnPosicion47.setEnabled(false);
        p++;
    }//GEN-LAST:event_btnPosicion47ActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        // TODO add your handling code here:
        for(int i=0;i<5;i++){
            for (int j = 0; j < 8; j++) {
                System.out.print(matriz[i][j]+" |");
            }
            System.out.print("\n");
        }
        analisisRecorrido();
        for (int i = 0; i < 40; i++) {
            if (direccion[i] != null) {
                try {
                    arduinoObj.sendData(direccion[i]);
                    System.out.println(direccion[i]+"| ");
                    Thread.sleep(2000);
                } catch (ArduinoException ex) {
                    Logger.getLogger(pantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SerialPortException ex) {
                    Logger.getLogger(pantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InterruptedException ex) {
                    Logger.getLogger(pantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
                //System.out.println(direccion[i]+"| ");
            } else {
                break;
            }
        }
        activarBotones();
        p = 1;
        k = 1;
    }//GEN-LAST:event_btnEnviarActionPerformed

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
            java.util.logging.Logger.getLogger(pantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pantallaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConectar;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnPosicion00;
    private javax.swing.JButton btnPosicion01;
    private javax.swing.JButton btnPosicion02;
    private javax.swing.JButton btnPosicion03;
    private javax.swing.JButton btnPosicion04;
    private javax.swing.JButton btnPosicion05;
    private javax.swing.JButton btnPosicion06;
    private javax.swing.JButton btnPosicion07;
    private javax.swing.JButton btnPosicion10;
    private javax.swing.JButton btnPosicion11;
    private javax.swing.JButton btnPosicion12;
    private javax.swing.JButton btnPosicion13;
    private javax.swing.JButton btnPosicion14;
    private javax.swing.JButton btnPosicion15;
    private javax.swing.JButton btnPosicion16;
    private javax.swing.JButton btnPosicion17;
    private javax.swing.JButton btnPosicion20;
    private javax.swing.JButton btnPosicion21;
    private javax.swing.JButton btnPosicion22;
    private javax.swing.JButton btnPosicion23;
    private javax.swing.JButton btnPosicion24;
    private javax.swing.JButton btnPosicion25;
    private javax.swing.JButton btnPosicion26;
    private javax.swing.JButton btnPosicion27;
    private javax.swing.JButton btnPosicion30;
    private javax.swing.JButton btnPosicion31;
    private javax.swing.JButton btnPosicion32;
    private javax.swing.JButton btnPosicion33;
    private javax.swing.JButton btnPosicion34;
    private javax.swing.JButton btnPosicion35;
    private javax.swing.JButton btnPosicion36;
    private javax.swing.JButton btnPosicion37;
    private javax.swing.JButton btnPosicion40;
    private javax.swing.JButton btnPosicion41;
    private javax.swing.JButton btnPosicion42;
    private javax.swing.JButton btnPosicion43;
    private javax.swing.JButton btnPosicion44;
    private javax.swing.JButton btnPosicion45;
    private javax.swing.JButton btnPosicion46;
    private javax.swing.JButton btnPosicion47;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
