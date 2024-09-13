/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI.Comp.Dialog;

import static BUS.ConnectDB.openConnect;
import BUS.DetailImportBillBUS;
import BUS.IngredientsBUS;
import BUS.SupplierBUS;
import DTO.DetailImportBillDTO;
import DTO.IngredientsDTO;
import DTO.StaffDTO;
import DTO.SupplierDTO;
import java.awt.Dialog;
import java.awt.Window;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author Tai
 */
public class DialogDetailImport extends javax.swing.JPanel {

    private List<SupplierDTO> supplierList = new ArrayList<>();
    private int currentBillId; // Biến để lưu trữ mã bill hiện tại
    // Thêm biến instance để lưu trữ chỉ mục của dòng được chọn trong JTable
    private int selectedRowIndex = -1;
    private List<IngredientsDTO> ingredientsList = new ArrayList<>();

    public DialogDetailImport() throws Exception {
        initComponents();
       
        currentBillId = (int) System.currentTimeMillis();
        initComboBox();
        initComboBoxSupplier();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel22 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel26 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();

        setMaximumSize(new java.awt.Dimension(810, 430));
        setPreferredSize(new java.awt.Dimension(810, 430));
        setLayout(new java.awt.BorderLayout(10, 0));

        jPanel1.setMaximumSize(new java.awt.Dimension(100, 100));
        jPanel1.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        jPanel18.setMaximumSize(new java.awt.Dimension(20, 16));
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel18);

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel6.setText("Nhà cung cấp");
        jPanel1.add(jLabel6);

        jPanel23.setMaximumSize(new java.awt.Dimension(20, 16));
        jPanel23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel23);

        jComboBox2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jComboBox2.setMaximumSize(new java.awt.Dimension(120, 30));
        jComboBox2.setPreferredSize(new java.awt.Dimension(120, 30));
        jPanel1.add(jComboBox2);

        jPanel4.setMaximumSize(new java.awt.Dimension(20, 16));
        jPanel4.setLayout(new java.awt.BorderLayout());
        jPanel1.add(jPanel4);

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel5.setText("Nguyên liệu");
        jPanel1.add(jLabel5);

        jPanel21.setMaximumSize(new java.awt.Dimension(20, 16));
        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel21);

        jComboBox1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jComboBox1.setMaximumSize(new java.awt.Dimension(120, 30));
        jComboBox1.setPreferredSize(new java.awt.Dimension(120, 30));
        jPanel1.add(jComboBox1);

        jPanel22.setMaximumSize(new java.awt.Dimension(20, 16));
        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel22);

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel1.setText("Số lượng");
        jPanel1.add(jLabel1);

        jPanel19.setMaximumSize(new java.awt.Dimension(20, 16));
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel19);

        jTextField1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTextField1.setMaximumSize(new java.awt.Dimension(120, 30));
        jTextField1.setPreferredSize(new java.awt.Dimension(120, 30));
        jPanel1.add(jTextField1);

        jPanel3.setMaximumSize(new java.awt.Dimension(20, 16));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel3);

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel3.setText("Giá nhập");
        jPanel1.add(jLabel3);

        jPanel20.setMaximumSize(new java.awt.Dimension(20, 16));
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel20);

        jTextField2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTextField2.setMaximumSize(new java.awt.Dimension(120, 30));
        jTextField2.setPreferredSize(new java.awt.Dimension(120, 30));
        jPanel1.add(jTextField2);

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setMaximumSize(new java.awt.Dimension(100, 100));
        jPanel2.setPreferredSize(new java.awt.Dimension(120, 100));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel25.setPreferredSize(new java.awt.Dimension(100, 200));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 0);
        flowLayout1.setAlignOnBaseline(true);
        jPanel25.setLayout(flowLayout1);

        jButton1.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jButton1.setText("Thêm");
        jButton1.setMaximumSize(new java.awt.Dimension(89, 35));
        jButton1.setPreferredSize(new java.awt.Dimension(89, 35));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel25.add(jButton1);

        jPanel5.setPreferredSize(new java.awt.Dimension(50, 25));
        jPanel25.add(jPanel5);

        jButton3.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jButton3.setText("Xóa");
        jButton3.setMaximumSize(new java.awt.Dimension(89, 35));
        jButton3.setPreferredSize(new java.awt.Dimension(89, 35));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel25.add(jButton3);

        jPanel2.add(jPanel25, java.awt.BorderLayout.PAGE_START);

        jButton4.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jButton4.setText("Xác nhận");
        jButton4.setMargin(new java.awt.Insets(2, 5, 3, 5));
        jButton4.setMaximumSize(new java.awt.Dimension(89, 100));
        jButton4.setPreferredSize(new java.awt.Dimension(89, 100));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel26.add(jButton4);

        jPanel2.add(jPanel26, java.awt.BorderLayout.PAGE_END);

        add(jPanel2, java.awt.BorderLayout.LINE_END);

        jTable2.setBackground(new java.awt.Color(35, 35, 35));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "ID", "số lượng", "giá mỗi kg/lít", "tổng tiền", "Bill ID", "Tên nguyên liệu"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.Integer.class, java.lang.Long.class, java.lang.Long.class, java.lang.Long.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jPanel6.setPreferredSize(new java.awt.Dimension(5, 100));
        add(jPanel6, java.awt.BorderLayout.LINE_START);

        jPanel13.setPreferredSize(new java.awt.Dimension(100, 15));
        add(jPanel13, java.awt.BorderLayout.PAGE_END);
    }// </editor-fold>//GEN-END:initComponents

    public void initComboBox() {
        ingredientsList = new IngredientsBUS().getAllActiveIngredients();
        for (IngredientsDTO x : ingredientsList) {
            jComboBox1.addItem(x.getName());
        }
    }

    public void initComboBoxSupplier() {
        supplierList = new SupplierBUS().getAllData();
        for (SupplierDTO x : supplierList) {
            jComboBox2.addItem(x.getName());
        }
    }

    // nút thêm
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Kiểm tra xem các trường text field có trống không
        if (jTextField1.getText().isEmpty() || jTextField2.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin.", "Cảnh báo", JOptionPane.WARNING_MESSAGE);
            return; // Thoát khỏi phương thức nếu có trường trống
        }

        try {
            // Lấy giá trị từ các text field
            int quantity = Integer.parseInt(jTextField1.getText());
            long price = Long.parseLong(jTextField2.getText());
            // Kiểm tra điều kiện số lượng không được bé hơn hoặc bằng 0
            if (quantity <= 0) {
                JOptionPane.showMessageDialog(this, "Số lượng phải lớn hơn 0.", "Cảnh báo", JOptionPane.WARNING_MESSAGE);
                return; // Thoát khỏi phương thức nếu số lượng không hợp lệ
            }
            if (price <= 0) {
                JOptionPane.showMessageDialog(this, "Số tiền phải lớn hơn 0.", "Cảnh báo", JOptionPane.WARNING_MESSAGE);
                return; // Thoát khỏi phương thức nếu số lượng không hợp lệ
            }
            // Tính tổng tiền
            long total = quantity * price;

            // Tạo ID mới sử dụng System.currentTimeMillis()
            long id = System.currentTimeMillis();

            // Tạo một đối tượng DetailImportBillDTO mới
            DetailImportBillDTO detail = new DetailImportBillDTO();
            detail.setId((int) id);
            detail.setQuantity(quantity);
            detail.setPrice(price);
            detail.setTotal(total);
            detail.setBillid(currentBillId); // Sử dụng mã Bill hiện tại
            detail.setIngredientid(ingredientsList.get(jComboBox1.getSelectedIndex()).getId());

            // Thêm dòng dữ liệu vào JTable1
            DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
            model.addRow(new Object[]{detail.getId(), detail.getQuantity(), detail.getPrice(), detail.getTotal(), detail.getBillid(), ingredientsList.get(jComboBox1.getSelectedIndex()).getName()});

            // Thông báo thêm thành công
            JOptionPane.showMessageDialog(this, "Thêm thành công.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);

            // Reset các text field sau khi thêm thành công
            jTextField1.setText("");
            jTextField2.setText("");
        } catch (NumberFormatException ex) {
            // Xử lý nếu người dùng nhập không đúng định dạng số
            JOptionPane.showMessageDialog(this, "Vui lòng nhập số vào các trường số lượng, giá và mã nguyên liệu.", "Cảnh báo", JOptionPane.WARNING_MESSAGE);
        } catch (Exception ex) {
            // Xử lý nếu có lỗi khi thêm dữ liệu
            JOptionPane.showMessageDialog(this, "Lỗi khi thêm dữ liệu: " + ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
        System.out.println(ingredientsList.get(jComboBox1.getSelectedIndex()).getId());
    }//GEN-LAST:event_jButton1ActionPerformed
    // nút xóa
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Kiểm tra xem có dòng nào được chọn không
        if (jTable2.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn dòng cần xóa.", "Cảnh báo", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Lấy chỉ mục của dòng được chọn
        int selectedRow = jTable2.getSelectedRow();

        // Xóa dòng được chọn khỏi JTable
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.removeRow(selectedRow);
    }//GEN-LAST:event_jButton3ActionPerformed
    // nút xác nhận
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int confirmation = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn thêm dữ liệu?", "Xác nhận", JOptionPane.YES_NO_OPTION);
        if (confirmation == JOptionPane.YES_OPTION) {
            try {
                // Lấy số lượng dòng dữ liệu trong jTable
                int totalQuantity = jTable2.getRowCount();

                // Tính tổng tiền
                long totalAmount = 0;
                DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
                List<Long> ingredientIds = new ArrayList<>(); // Danh sách chứa Ingredientid của các dòng
                for (int i = 0; i < model.getRowCount(); i++) {
                    totalAmount += (long) model.getValueAt(i, 3);
                    // Lấy tên nguyên liệu từ cột "Tên nguyên liệu" (cột cuối cùng)
                    String selectedIngredientName = (String) model.getValueAt(i, model.getColumnCount() - 1);
                    int selectedIngredientIndex = -1; // Chuyển từ long sang int
                    for (int j = 0; j < ingredientsList.size(); j++) {
                        if (ingredientsList.get(j).getName().equals(selectedIngredientName)) {
                            selectedIngredientIndex = j;
                            break;
                        }
                    }
                    if (selectedIngredientIndex != -1) {
                        ingredientIds.add(ingredientsList.get(selectedIngredientIndex).getId());
                    }
                }

                // Chuyển đổi danh sách ingredientIds thành mảng long[]
                long[] ingredientIdsArray = new long[ingredientIds.size()];
                for (int i = 0; i < ingredientIds.size(); i++) {
                    ingredientIdsArray[i] = ingredientIds.get(i);
                }

                // Thêm dữ liệu vào cơ sở dữ liệu thông qua BUS
                DetailImportBillBUS.insertImportBill(currentBillId, totalQuantity, totalAmount, supplierList.get(jComboBox2.getSelectedIndex()).getId(), model, ingredientIdsArray);
                JOptionPane.showMessageDialog(this, "Thêm thành công.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);

                dispose(); // Đóng dialog sau khi thêm dữ liệu thành công
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "UserID và SupplierID phải là số nguyên.", "Cảnh báo", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    // Thêm phương thức dispose vào JDialog
    private void dispose() {
        Window window = SwingUtilities.getWindowAncestor(this);
        if (window instanceof Dialog) {
            Dialog dialog = (Dialog) window;
            dialog.dispose();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton3;
    public javax.swing.JButton jButton4;
    public javax.swing.JComboBox<String> jComboBox1;
    public javax.swing.JComboBox<String> jComboBox2;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel13;
    public javax.swing.JPanel jPanel18;
    public javax.swing.JPanel jPanel19;
    public javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanel20;
    public javax.swing.JPanel jPanel21;
    public javax.swing.JPanel jPanel22;
    public javax.swing.JPanel jPanel23;
    public javax.swing.JPanel jPanel25;
    public javax.swing.JPanel jPanel26;
    public javax.swing.JPanel jPanel3;
    public javax.swing.JPanel jPanel4;
    public javax.swing.JPanel jPanel5;
    public javax.swing.JPanel jPanel6;
    public javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable jTable2;
    public javax.swing.JTextField jTextField1;
    public javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

    private boolean isBillIdExists(int billId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private int generateNewBillId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
