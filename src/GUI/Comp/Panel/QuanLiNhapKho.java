/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI.Comp.Panel;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileOutputStream;
import GUI.Comp.Dialog.BillDetailDialog;
import BUS.ConnectDB;
import BUS.DetailImportBillBUS;
import BUS.ImportBillBUS;
import BUS.IngredientsBUS;
import DTO.DetailImportBillDTO;
import DTO.StaffDTO;
import DTO.SupplierDTO;
import GUI.Comp.Dialog.BillDetailDialog;
import Helper.FormatNumber;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;
import java.time.LocalDate;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import javax.swing.RowFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableRowSorter;
import GUI.Comp.DateChooser.DateChooser;
import GUI.Comp.DateChooser.SelectedDate;
import GUI.Comp.Dialog.DialogDetailImport;
import com.formdev.flatlaf.FlatClientProperties;
import java.awt.event.ItemEvent;
import java.util.Calendar;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import java.text.SimpleDateFormat;
import java.util.regex.PatternSyntaxException;

/**
 *
 * @author Tai
 */
public class QuanLiNhapKho extends javax.swing.JPanel {
    private ImportBillBUS importBillBUS = new ImportBillBUS();
    
    public QuanLiNhapKho() {
        initComponents();
        loadImportBills();
        jTextField1.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "dd/MM/YYYY");
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
        panelBackground1 = new GUI.Comp.Swing.PanelBackground();
        panelBackground2 = new GUI.Comp.Swing.PanelBackground();
        panelBackground3 = new GUI.Comp.Swing.PanelBackground();
        panelBackground4 = new GUI.Comp.Swing.PanelBackground();
        panelBackground5 = new GUI.Comp.Swing.PanelBackground();
        panelBackground6 = new GUI.Comp.Swing.PanelBackground();
        panelBackground7 = new GUI.Comp.Swing.PanelBackground();
        jPanel8 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        panelBackground8 = new GUI.Comp.Swing.PanelBackground();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(30, 30, 30));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        panelBackground1.setBackground(new java.awt.Color(30, 30, 30));
        panelBackground1.setLayout(new java.awt.BorderLayout());

        panelBackground2.setBackground(new java.awt.Color(30, 30, 30));
        panelBackground1.add(panelBackground2, java.awt.BorderLayout.LINE_START);

        panelBackground3.setBackground(new java.awt.Color(30, 30, 30));
        panelBackground1.add(panelBackground3, java.awt.BorderLayout.PAGE_START);

        panelBackground4.setBackground(new java.awt.Color(30, 30, 30));
        panelBackground1.add(panelBackground4, java.awt.BorderLayout.LINE_END);

        panelBackground5.setBackground(new java.awt.Color(30, 30, 30));
        panelBackground1.add(panelBackground5, java.awt.BorderLayout.PAGE_END);

        panelBackground6.setBackground(new java.awt.Color(30, 30, 30));
        panelBackground6.setLayout(new java.awt.BorderLayout(0, 20));

        panelBackground7.setBackground(new java.awt.Color(35, 35, 35));
        panelBackground7.setPreferredSize(new java.awt.Dimension(100, 75));
        panelBackground7.setLayout(new javax.swing.BoxLayout(panelBackground7, javax.swing.BoxLayout.LINE_AXIS));

        jPanel8.setBackground(new java.awt.Color(35, 35, 35));
        jPanel8.setMaximumSize(new java.awt.Dimension(20, 23));
        panelBackground7.add(jPanel8);

        jButton1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jButton1.setText("Thêm");
        jButton1.setMaximumSize(new java.awt.Dimension(84, 40));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panelBackground7.add(jButton1);

        jPanel2.setBackground(new java.awt.Color(35, 35, 35));
        jPanel2.setMaximumSize(new java.awt.Dimension(20, 23));
        panelBackground7.add(jPanel2);

        jButton4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jButton4.setText("Chi tiết");
        jButton4.setMaximumSize(new java.awt.Dimension(84, 40));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        panelBackground7.add(jButton4);

        jPanel7.setBackground(new java.awt.Color(35, 35, 35));
        jPanel7.setMaximumSize(new java.awt.Dimension(20, 23));
        panelBackground7.add(jPanel7);

        jButton3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jButton3.setText("Xóa");
        jButton3.setMaximumSize(new java.awt.Dimension(72, 40));
        jButton3.setPreferredSize(new java.awt.Dimension(72, 40));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        panelBackground7.add(jButton3);

        jPanel4.setBackground(new java.awt.Color(35, 35, 35));
        jPanel4.setMaximumSize(new java.awt.Dimension(20, 23));
        panelBackground7.add(jPanel4);

        jButton8.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jButton8.setText("In PDF");
        jButton8.setMaximumSize(new java.awt.Dimension(75, 40));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        panelBackground7.add(jButton8);

        jPanel11.setBackground(new java.awt.Color(35, 35, 35));
        jPanel11.setMaximumSize(new java.awt.Dimension(20, 23));
        panelBackground7.add(jPanel11);

        jButton6.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jButton6.setText("Xuất Excel");
        jButton6.setMaximumSize(new java.awt.Dimension(84, 40));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        panelBackground7.add(jButton6);

        jPanel9.setBackground(new java.awt.Color(35, 35, 35));
        jPanel9.setMaximumSize(new java.awt.Dimension(20, 23));
        panelBackground7.add(jPanel9);

        jButton2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jButton2.setText("Nhập  Excel");
        jButton2.setMaximumSize(new java.awt.Dimension(140, 40));
        jButton2.setPreferredSize(new java.awt.Dimension(140, 40));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panelBackground7.add(jButton2);

        jPanel3.setBackground(new java.awt.Color(35, 35, 35));
        jPanel3.setMaximumSize(new java.awt.Dimension(20, 23));
        panelBackground7.add(jPanel3);

        jTextField1.setMaximumSize(new java.awt.Dimension(175, 30));
        jTextField1.setPreferredSize(new java.awt.Dimension(175, 40));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        panelBackground7.add(jTextField1);

        panelBackground6.add(panelBackground7, java.awt.BorderLayout.PAGE_START);

        panelBackground8.setBackground(new java.awt.Color(35, 35, 35));
        panelBackground8.setLayout(new java.awt.BorderLayout());

        jTable1.setBackground(new java.awt.Color(35, 35, 35));
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Số loại nguyên liệu", "Tổng tiền", "Ngày nhập hàng", "ID người nhập", "ID NCC", "Tên người nhập", "Tên NCC"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Double.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        panelBackground8.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        panelBackground6.add(panelBackground8, java.awt.BorderLayout.CENTER);

        panelBackground1.add(panelBackground6, java.awt.BorderLayout.CENTER);

        jPanel1.add(panelBackground1);

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


 
    private void loadImportBills(){
        importBillBUS.loadImportBills((DefaultTableModel) jTable1.getModel());

        // Cấu hình renderer cho cột
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(DefaultTableCellRenderer.LEFT);
        for (int i = 0; i < jTable1.getColumnCount(); i++) {
            TableColumnModel columnModel = jTable1.getColumnModel();
            columnModel.getColumn(i).setCellRenderer(centerRenderer);

                    // Cấu hình renderer cho header sang bên trái
            DefaultTableCellRenderer headerRenderer = (DefaultTableCellRenderer) jTable1.getTableHeader().getDefaultRenderer();
            headerRenderer.setHorizontalAlignment(DefaultTableCellRenderer.LEFT);
            columnModel.getColumn(i).setHeaderRenderer(headerRenderer);
    }
}

    
    
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // Lấy ngày được nhập vào từ text field
        String inputDate = jTextField1.getText().trim();

        // Khởi tạo TableRowSorter để lọc dữ liệu trong bảng jTable
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        jTable1.setRowSorter(sorter);

        // Nếu ngày nhập vào có ít nhất 1 ký tự và đúng định dạng dd/MM/YYYY
        if (inputDate.length() > 0 && inputDate.matches("\\d{2}/\\d{2}/\\d{4}")) {
            // Tạo một RowFilter để lọc dữ liệu dựa trên ngày nhập vào
            RowFilter<DefaultTableModel, Object> filter = new RowFilter<DefaultTableModel, Object>() {
                @Override
                public boolean include(Entry<? extends DefaultTableModel, ? extends Object> entry) {
                    String dateInTable = entry.getStringValue(3); // Cột thứ 4 là cột import_date
                    return dateInTable.equals(inputDate);
                }
            };

            // Áp dụng RowFilter để lọc dữ liệu
            sorter.setRowFilter(filter);
        } else {
            // Nếu ngày nhập vào không hợp lệ, hiển thị toàn bộ dữ liệu trong bảng
            sorter.setRowFilter(null);
        }
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        // Thiết lập chỉ cho phép người dùng chọn file Excel
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Excel Files", "xls", "xlsx");
        fileChooser.setFileFilter(filter);

        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            // Xử lý file Excel được chọn ở đây
            // Ví dụ: Gọi một phương thức để xử lý dữ liệu từ file Excel
            processDataFromExcel(selectedFile);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    // Lấy chỉ số của dòng được chọn trong JTable
    int selectedRowIndex = jTable1.getSelectedRow();

    // Kiểm tra xem có dòng nào được chọn không
    if (selectedRowIndex != -1) {
        // Lấy giá trị của cột ID trong dòng được chọn
        Long importBillId = (Long) jTable1.getValueAt(selectedRowIndex, 0);

        // Hiển thị hộp thoại xác nhận
        int option = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn xóa hóa đơn này?", "Xác nhận xóa", JOptionPane.YES_NO_OPTION);
        
        // Kiểm tra xem người dùng đã xác nhận xóa hay không
        if (option == JOptionPane.YES_OPTION) {
            // Xóa chi tiết hóa đơn nhập
            DetailImportBillBUS.deleteDetailImportBill(importBillId);

            // Xóa hóa đơn nhập
            ImportBillBUS.deleteImportBill(importBillId);

            // Sau khi xóa thành công, cập nhật lại hiển thị trên JTable và thông báo thành công
            loadImportBills();
            JOptionPane.showMessageDialog(null, "Đã xóa hóa đơn thành công.");
        }
    } else {
        // Hiển thị thông báo nếu không có dòng nào được chọn
        JOptionPane.showMessageDialog(null, "Vui lòng chọn một dòng để xóa.");
    }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
    // Lấy ngày được nhập vào từ text field
    String inputDate = jTextField1.getText().trim();

    // Khởi tạo TableRowSorter để lọc dữ liệu trong bảng jTable
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
    jTable1.setRowSorter(sorter);

    // Nếu ngày nhập vào có ít nhất 1 ký tự và đúng định dạng dd/MM/YYYY
    if (inputDate.length() > 0 && inputDate.matches("\\d{2}/\\d{2}/\\d{4}")) {
        // Tạo một RowFilter để lọc dữ liệu dựa trên ngày nhập vào
        RowFilter<DefaultTableModel, Object> filter = new RowFilter<DefaultTableModel, Object>() {
            @Override
            public boolean include(Entry<? extends DefaultTableModel, ? extends Object> entry) {
                String dateInTable = (String) entry.getValue(3); // Cột thứ 4 là cột import_date
                return dateInTable.equals(inputDate);
            }
        };

        // Áp dụng RowFilter để lọc dữ liệu
        sorter.setRowFilter(filter);
    } else {
        // Nếu ngày nhập vào không hợp lệ, hiển thị toàn bộ dữ liệu trong bảng
        sorter.setRowFilter(null);
    }
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // Tạo một JDialog mới
            JDialog dialog = new JDialog();

            // Thiết lập JPanel DialogDetailImport làm nội dung của JDialog
            DialogDetailImport dialogPanel = new DialogDetailImport();
            dialog.getContentPane().add(dialogPanel);

            // Thiết lập thuộc tính cho JDialog
            dialog.setSize(1120, 650); // Thiết lập kích thước
            dialog.setLocationRelativeTo(this); // Hiển thị JDialog ở giữa cửa sổ cha
            dialog.setModal(true); // Thiết lập JDialog là modal để chặn tương tác với các thành phần khác trong cửa sổ cha
            dialog.setVisible(true); // Hiển thị JDialog
            loadImportBills();
        } catch (Exception ex) {
            Logger.getLogger(QuanLiNhapKho.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {

            loadImportBills();
        } catch (Exception ex) {
            Logger.getLogger(QuanLiNhapKho.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một hóa đơn để xem chi tiết.");
            return;
        }
        long selectedBillId = (long) jTable1.getValueAt(selectedRow, 0);
        StringBuilder detailInfo = new StringBuilder();
        try {
            // Lấy chi tiết hóa đơn từ BUS
            DetailImportBillBUS detailImportBillBUS = new DetailImportBillBUS();
            ArrayList<DetailImportBillDTO> importBillDetails = detailImportBillBUS.getDetailImportBillByBillId(selectedBillId);

            // Kiểm tra nếu không có chi tiết nào cho hóa đơn này
            if (importBillDetails.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Không có chi tiết nào cho hóa đơn này.");
                return;
            }

            // Lấy thông tin nhà cung cấp từ BUS
            long supplierId = (long) jTable1.getValueAt(selectedRow, 5);
            SupplierDTO supplier = detailImportBillBUS.getSupplierById(supplierId);
            if (supplier != null) {
                detailInfo.append("Thông tin nhà cung cấp:\n");
                detailInfo.append("ID: ").append(supplier.getId()).append("\n");
                detailInfo.append("Tên: ").append(supplier.getName()).append("\n");
                detailInfo.append("Địa chỉ: ").append(supplier.getAddress()).append("\n");
                detailInfo.append("Số điện thoại: ").append(supplier.getPhone()).append("\n\n");
            }

            // Thêm thông tin chi tiết hóa đơn vào StringBuilder
            detailInfo.append("Chi tiết nhập hàng cho hóa đơn có ID: ").append(selectedBillId).append("\n\n");
            for (DetailImportBillDTO importBillDetail : importBillDetails) {
                detailInfo.append("ID chi tiết: ").append(importBillDetail.getId()).append("\n");
                detailInfo.append("Số lượng: ").append(importBillDetail.getQuantity()).append("\n");
                detailInfo.append("Giá tiền mỗi kg/lít: ").append(importBillDetail.getPrice()).append("\n");
                detailInfo.append("Tổng tiền: ").append(importBillDetail.getTotal()).append("\n");
                detailInfo.append("ID nguyên liệu: ").append(importBillDetail.getIngredientid()).append("\n");

                // Lấy tên nguyên liệu từ BUS
                try {
                    String ingredientName = detailImportBillBUS.getIngredientNameById(importBillDetail.getIngredientid());
                    detailInfo.append("Tên nguyên liệu: ").append(ingredientName).append("\n");
                } catch (Exception e) {
                    e.printStackTrace();
                    detailInfo.append("Không thể lấy tên nguyên liệu cho ID ").append(importBillDetail.getIngredientid()).append("\n");
                }
                detailInfo.append("\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi khi tải chi tiết nhập hàng.");
            return;
        }
        // Hiển thị dialog chi tiết hóa đơn
        BillDetailDialog dialog = new BillDetailDialog((JFrame) javax.swing.SwingUtilities.getWindowAncestor(this), "Chi tiết hóa đơn", detailInfo.toString());
        dialog.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một hóa đơn để xuất file PDF.");
            return;
        }

        try {
            // Tạo hộp thoại để người dùng chọn thư mục lưu file PDF
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Chọn nơi lưu file PDF");
            fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

            // Hiển thị hộp thoại và lấy kết quả từ người dùng
            int userSelection = fileChooser.showSaveDialog(this);

            // Nếu người dùng chọn một thư mục và nhấn OK
            if (userSelection == JFileChooser.APPROVE_OPTION) {
                // Lấy thư mục được chọn bởi người dùng
                File selectedDirectory = fileChooser.getSelectedFile();

                // Tạo đường dẫn đầy đủ cho file PDF
                String filePath = selectedDirectory.getAbsolutePath() + "/ChiTietHoaDon_" + jTable1.getValueAt(selectedRow, 0) + ".pdf";

                // Tạo một thể hiện của lớp DetailImportBillBUS
                DetailImportBillBUS detailImportBillBUS = new DetailImportBillBUS();

                // Lấy thông tin chi tiết từ JTable
                long selectedBillId = (long) jTable1.getValueAt(selectedRow, 0);
                ArrayList<DetailImportBillDTO> detailImportBillList = detailImportBillBUS.getDetailImportBillByBillId(selectedBillId);
                SupplierDTO supplier = detailImportBillBUS.getSupplierById((long) jTable1.getValueAt(selectedRow, 5));

                // Tạo tài liệu PDF mới
                Document document = new Document();
                PdfWriter.getInstance(document, new FileOutputStream(filePath));
                document.open();

                // Tạo tiêu đề cho tài liệu PDF
                Paragraph title = new Paragraph("Import bill detail", FontFactory.getFont(FontFactory.TIMES_ROMAN, 18, Font.BOLD));
                title.setAlignment(Element.ALIGN_CENTER);
                document.add(title);

                // Thêm thông tin chi tiết hóa đơn vào tài liệu PDF
                PdfPTable table = new PdfPTable(7); // 7 cột cho thông tin chi tiết hóa đơn
                table.setWidthPercentage(100);
                table.setSpacingBefore(10f);
                table.setSpacingAfter(10f);

                // Header cho bảng
                String[] detailHeaders = {"Bill ID", "Detail ID", "Quantity", "Price", "Total", "Ingredient ID", "Ingredient Name"};
                for (String header : detailHeaders) {
                    PdfPCell cell = new PdfPCell(new Paragraph(header));
                    cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                    cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    table.addCell(cell);
                }

                // Dữ liệu chi tiết hóa đơn
                for (DetailImportBillDTO detailImportBill : detailImportBillList) {
                    table.addCell(String.valueOf(detailImportBill.getBillid()));
                    table.addCell(String.valueOf(detailImportBill.getId()));
                    table.addCell(String.valueOf(detailImportBill.getQuantity()));
                    table.addCell(String.valueOf(detailImportBill.getPrice()));
                    table.addCell(String.valueOf(detailImportBill.getTotal()));
                    table.addCell(String.valueOf(detailImportBill.getIngredientid()));
                    long ingredientId = detailImportBill.getIngredientid();
                    // Lấy tên nguyên liệu từ bảng tb_ingredients
                    String ingredientName = detailImportBillBUS.getIngredientNameById(ingredientId);
                    if (ingredientName != null) {
                        table.addCell(ingredientName);
                    } else {
                        table.addCell("");
                    }
                }

                document.add(table);

                // Thêm thông tin nhà cung cấp vào tài liệu PDF
                if (supplier != null) {
                    Paragraph supplierInfo = new Paragraph("Supplier's information", FontFactory.getFont(FontFactory.TIMES_ROMAN, 14, Font.BOLD));
                    supplierInfo.setAlignment(Element.ALIGN_CENTER);
                    document.add(supplierInfo);

                    Paragraph supplierDetail = new Paragraph();
                    supplierDetail.add(new Phrase("ID: " + supplier.getId() + "\n"));
                    supplierDetail.add(new Phrase("Name: " + supplier.getName() + "\n"));
                    supplierDetail.add(new Phrase("Address: " + supplier.getAddress() + "\n"));
                    supplierDetail.add(new Phrase("Phone: " + supplier.getPhone() + "\n"));
                    document.add(supplierDetail);
                }

                document.close();

                // Hiển thị thông báo khi xuất file PDF thành công
                JOptionPane.showMessageDialog(this, "Xuất file PDF thành công.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi khi xuất file PDF.");
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một hóa đơn để xuất file Excel.");
            return;
        }

        try {
            // Tạo hộp thoại để người dùng chọn thư mục lưu file Excel
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Chọn nơi lưu file Excel");
            fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

            // Hiển thị hộp thoại và lấy kết quả từ người dùng
            int userSelection = fileChooser.showSaveDialog(this);

            // Nếu người dùng chọn một thư mục và nhấn OK
            if (userSelection == JFileChooser.APPROVE_OPTION) {
                // Lấy thư mục được chọn bởi người dùng
                File selectedDirectory = fileChooser.getSelectedFile();

                // Tạo đường dẫn đầy đủ cho file Excel
                String filePath = selectedDirectory.getAbsolutePath() + "/ChiTietHoaDon_" + jTable1.getValueAt(selectedRow, 0) + ".xlsx";

                // Tạo workbook mới
                Workbook workbook = new XSSFWorkbook();
                Sheet sheet = workbook.createSheet("Chi tiết hóa đơn");

                // Code xuất file Excel
                // Tạo header cho thông tin chi tiết
                Row detailHeaderRow = sheet.createRow(0);
                String[] detailHeaders = {"ID hóa đơn", "ID chi tiết", "Số lượng", "Giá tiền mỗi kg/lít", "Tổng tiền", "ID nguyên liệu", "Tên nguyên liệu"};
                for (int i = 0; i < detailHeaders.length; i++) {
                    Cell cell = detailHeaderRow.createCell(i);
                    cell.setCellValue(detailHeaders[i]);
                }

                // Lấy thông tin chi tiết từ JTable
                long selectedBillId = (long) jTable1.getValueAt(selectedRow, 0);
                int rowIndex = 1;

                // Tạo một thể hiện của lớp DetailImportBillBUS
                DetailImportBillBUS detailImportBillBUS = new DetailImportBillBUS();

                // Gọi phương thức từ thể hiện đã tạo
                ArrayList<DetailImportBillDTO> detailImportBillList = detailImportBillBUS.getDetailImportBillByBillId(selectedBillId);
                SupplierDTO supplier = detailImportBillBUS.getSupplierById((long) jTable1.getValueAt(selectedRow, 5));

                for (DetailImportBillDTO detailImportBill : detailImportBillList) {
                    Row row = sheet.createRow(rowIndex++);
                    row.createCell(0).setCellValue(detailImportBill.getBillid()); // Bổ sung cột billid
                    row.createCell(1).setCellValue(detailImportBill.getId());
                    row.createCell(2).setCellValue(detailImportBill.getQuantity());
                    row.createCell(3).setCellValue(detailImportBill.getPrice());
                    row.createCell(4).setCellValue(detailImportBill.getTotal());
                    row.createCell(5).setCellValue(detailImportBill.getIngredientid());
                    long ingredientId = detailImportBill.getIngredientid();
                    //row.createCell(6).setCellValue(ingredientId); // Lưu ID nguyên liệu vào cột
                    // Lấy tên nguyên liệu từ bảng tb_ingredients
                    String ingredientName = detailImportBillBUS.getIngredientNameById(ingredientId);
                    if (ingredientName != null) {
                        row.createCell(6).setCellValue(ingredientName); // Lưu tên nguyên liệu vào cột
                    }
                }

                // Lấy thông tin nhà cung cấp từ BUS
                Row supplierHeaderRow = sheet.createRow(rowIndex++);
                supplierHeaderRow.createCell(0).setCellValue("Thông tin nhà cung cấp");
                rowIndex++;
                if (supplier != null) {
                    Row row = sheet.createRow(rowIndex++);
                    row.createCell(0).setCellValue("ID");
                    row.createCell(1).setCellValue(supplier.getId());
                    row = sheet.createRow(rowIndex++);
                    row.createCell(0).setCellValue("Tên");
                    row.createCell(1).setCellValue(supplier.getName());
                    row = sheet.createRow(rowIndex++);
                    row.createCell(0).setCellValue("Địa chỉ");
                    row.createCell(1).setCellValue(supplier.getAddress());
                    row = sheet.createRow(rowIndex++);
                    row.createCell(0).setCellValue("Số điện thoại");
                    row.createCell(1).setCellValue(supplier.getPhone());
                }

                // Lưu file Excel vào đường dẫn đã chọn
                FileOutputStream fileOut = new FileOutputStream(filePath);
                workbook.write(fileOut);
                fileOut.close();

                // Hiển thị thông báo khi xuất file Excel thành công
                JOptionPane.showMessageDialog(this, "Xuất file Excel thành công.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi khi xuất file Excel.");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void processDataFromExcel(File file) {
        Connection con = null;
        try {
            con = ConnectDB.openConnect();

            Workbook workbook = WorkbookFactory.create(file);
            Sheet sheet = workbook.getSheetAt(0);

            int startRow = 2;
            int endRow = sheet.getLastRowNum();

            double total = 0;
            int quantity = 0;
            for (int i = startRow; i <= endRow; i++) {
                Row row = sheet.getRow(i);
                if (row != null) {
                    quantity++;
                    Cell totalCell = row.getCell(3);
                    if (totalCell != null) {
                        total += totalCell.getNumericCellValue();
                    }
                }
            }

            // Get current date
            java.util.Date currentDate = new java.util.Date();

            
            long userId = StaffDTO.staffLogging.getId();

            String supplierIdInput = JOptionPane.showInputDialog(null, "Nhập supplierid:");
            int supplierId = Integer.parseInt(supplierIdInput);

            Cell billIdCell = sheet.getRow(2).getCell(4);
            int billId = (int) billIdCell.getNumericCellValue();

            ImportBillBUS importBillBUS = new ImportBillBUS();
            importBillBUS.addImportBill(con, billId, quantity, total, new java.sql.Date(currentDate.getTime()), userId, supplierId);

            for (int i = startRow; i <= endRow; i++) {
                Row row = sheet.getRow(i);
                if (row != null) {
                    int detailQuantity = (int) row.getCell(1).getNumericCellValue();
                    double price = row.getCell(2).getNumericCellValue();
                    double detailTotal = row.getCell(3).getNumericCellValue();
                    int ingredientId = (int) row.getCell(5).getNumericCellValue();

                    long detailId = System.currentTimeMillis() % 1000000;

                    DetailImportBillBUS detailImportBillBUS = new DetailImportBillBUS();
                    detailImportBillBUS.addDetailImportBill(detailId, detailQuantity, price, detailTotal, billId, ingredientId);

                    IngredientsBUS ingredientsBUS = new IngredientsBUS();
                    boolean ingredientExists = ingredientsBUS.checkIngredientExistence(ingredientId);
                    if (ingredientExists) {
                        int existingQuantity = ingredientsBUS.getIngredientQuantity(ingredientId);
                        int newQuantity = existingQuantity + detailQuantity;
                        ingredientsBUS.updateIngredientQuantity(ingredientId, newQuantity);
                    }
                }
            }

            workbook.close();
            loadImportBills();

            JOptionPane.showMessageDialog(null, "Dữ liệu đã được thêm thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Thêm dữ liệu thất bại: " + ex.getMessage(), "Thông báo", JOptionPane.ERROR_MESSAGE);
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    public javax.swing.JButton jButton3;
    public javax.swing.JButton jButton4;
    public javax.swing.JButton jButton6;
    public javax.swing.JButton jButton8;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel11;
    public javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanel3;
    public javax.swing.JPanel jPanel4;
    public javax.swing.JPanel jPanel7;
    public javax.swing.JPanel jPanel8;
    public javax.swing.JPanel jPanel9;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    public javax.swing.JTextField jTextField1;
    public GUI.Comp.Swing.PanelBackground panelBackground1;
    public GUI.Comp.Swing.PanelBackground panelBackground2;
    public GUI.Comp.Swing.PanelBackground panelBackground3;
    public GUI.Comp.Swing.PanelBackground panelBackground4;
    public GUI.Comp.Swing.PanelBackground panelBackground5;
    public GUI.Comp.Swing.PanelBackground panelBackground6;
    public GUI.Comp.Swing.PanelBackground panelBackground7;
    public GUI.Comp.Swing.PanelBackground panelBackground8;
    // End of variables declaration//GEN-END:variables
}
