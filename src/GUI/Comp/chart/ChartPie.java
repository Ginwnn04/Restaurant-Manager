package GUI.Comp.chart;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.List;

public class ChartPie extends javax.swing.JPanel {

        public List<ModelChartPie> getModel() {
                return model;
        }

        public void setModel(List<ModelChartPie> model) {
                this.model = model;
                initData();
        }

        private List<ModelChartPie> model;

        public ChartPie() {
                initComponents();
                setOpaque(false);
                setBackground(Color.WHITE);
        }

        private void initData() {
                panelChartPie1.removeAllData();
                panelData.removeAll();
                panelData.repaint();
                if (model != null) {
                        for (ModelChartPie data : model) {
                                panelChartPie1.addItem(data);
                                panelData.add(new ItemChartPie(data));
                        }
                }
                panelData.updateUI();
        }

        @Override
        protected void paintComponent(Graphics grphcs) {
                Graphics2D g2 = (Graphics2D) grphcs;
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g2.setColor(getBackground());
                g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
                super.paintComponent(grphcs);
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelChartPie1 = new GUI.Comp.chart.PanelChartPie();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelData = new javax.swing.JPanel();

        javax.swing.GroupLayout panelChartPie1Layout = new javax.swing.GroupLayout(panelChartPie1);
        panelChartPie1.setLayout(panelChartPie1Layout);
        panelChartPie1Layout.setHorizontalGroup(
            panelChartPie1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 273, Short.MAX_VALUE)
        );
        panelChartPie1Layout.setVerticalGroup(
            panelChartPie1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panelData.setOpaque(false);
        panelData.setLayout(new javax.swing.BoxLayout(panelData, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(panelData);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelChartPie1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelChartPie1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private GUI.Comp.chart.PanelChartPie panelChartPie1;
    private javax.swing.JPanel panelData;
    // End of variables declaration//GEN-END:variables
}
