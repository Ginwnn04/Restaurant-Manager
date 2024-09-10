/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI.Comp.Panel;

import GUI.Main.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableRowSorter;

import com.formdev.flatlaf.FlatClientProperties;
import com.raven.swing.PanelBackground;

import BUS.StaffBUS;
import BUS.SupplierBUS;
import DTO.SupplierDTO;

/**
 *
 * @author vuled
 */
public class QuanLiSupplier extends javax.swing.JPanel {
    private ArrayList<SupplierDTO> listSupplier;
    private BUS.SupplierBUS SupplierBUS = new SupplierBUS();
    private DefaultTableModel model;
    private boolean isSelectAll = false;
    int cntTableSelected = 0;
    private javax.swing.JTable tbSupplier;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnXoa;
    private javax.swing.JTextField searchField;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtAddress;
    private GUI.Comp.Swing.PanelBackground pnContainer;

    public QuanLiSupplier() {
        initComponents();
        setBackground(new Color(35, 35, 35));
        tbSupplier.setRowHeight(35);
        DefaultTableCellRenderer renderer = (DefaultTableCellRenderer) tbSupplier.getTableHeader().getDefaultRenderer();
        renderer.setHorizontalAlignment(JLabel.LEFT);

        searchField.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Nhập nhà cung cấp cần tìm");

        renderSupplier(isSelectAll);

        tbSupplier.getModel().addTableModelListener(new TableModelListener() {
            public void tableChanged(TableModelEvent e) {
                if (e.getColumn() == 0) {
                    int row = tbSupplier.getSelectedRow();
                    int initialRow = e.getFirstRow();
                    listSupplier.get(initialRow).setIsdeleted(!listSupplier.get(initialRow).getIsdeleted());
                    cntTableSelected += !listSupplier.get(initialRow).getIsdeleted() ? -1 : 1;
                    btnSua.setEnabled(cntTableSelected == 1);
                }
            }
        });
    }
    
    public void renderSupplier(boolean isSelectAll) {
        listSupplier = new SupplierBUS().getAllData(); // Giả sử bạn có một lớp BUS để lấy dữ liệu nhà cung cấp
        DefaultTableModel model = (DefaultTableModel) tbSupplier.getModel();
        model.setRowCount(0); // Xóa tất cả các dòng cũ trong bảng

        // Duyệt qua danh sách nhà cung cấp và thêm dữ liệu vào bảng
        for (SupplierDTO supplier : listSupplier) {
            model.addRow(new Object[]{
                supplier.getId(),
                supplier.getName(),
                supplier.getAddress(),
                supplier.getPhone()
                // Thêm các trường dữ liệu khác của nhà cung cấp tùy theo cấu trúc dữ liệu
            });
        }

        model.fireTableDataChanged(); // Thông báo cho bảng biết rằng dữ liệu đã thay đổi
        tbSupplier.setModel(model); // Cập nhật mô hình dữ liệu cho bảng
    }

    

    private void renderFilteredSupplier(ArrayList<SupplierDTO> filteredList) {
        DefaultTableModel model = (DefaultTableModel) tbSupplier.getModel();
        model.setRowCount(0);

        for (SupplierDTO supplier : filteredList) {
            model.addRow(new Object[]{
                supplier.getId(),  // ID
                supplier.getName(),  // Tên
                supplier.getAddress(),  // Địa chỉ
                supplier.getPhone()  // Số điện thoại
            });
        }

        model.fireTableDataChanged();
        tbSupplier.setModel(model);
    }

    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {


        
    	setLayout(new BorderLayout());
        
        
        JPanel panel_north = new JPanel();
        PanelBackground panel_center = new PanelBackground();
        JPanel panel_south = new JPanel();
        JPanel panel_west = new JPanel();
        JPanel panel_east = new JPanel();
        
        panel_north.setPreferredSize(new Dimension(25,25));
        panel_south.setPreferredSize(new Dimension(25,25));
        panel_west.setPreferredSize(new Dimension(25,25));
        panel_east.setPreferredSize(new Dimension(25,25));
        
        panel_west.setBackground(new Color(30,30,30));
        panel_east.setBackground(new Color(30,30,30));
        panel_north.setBackground(new Color(30,30,30));
        panel_south.setBackground(new Color(30,30,30));
        panel_center.setBackground(new Color(30,30,30));
        
        add(panel_center, BorderLayout.CENTER);
        add(panel_north, BorderLayout.NORTH);
        add(panel_south, BorderLayout.SOUTH);
        add(panel_east, BorderLayout.EAST);
        add(panel_west, BorderLayout.WEST);
        
        
        panel_center.setLayout(new BorderLayout());
        
        PanelBackground panel_top = new PanelBackground();
        PanelBackground panel_mid = new PanelBackground();
        PanelBackground panel_bot = new PanelBackground();
        
        PanelBackground interactSection = new PanelBackground();
        interactSection.setBackground(new Color(30,30,30));
        
        interactSection.setPreferredSize(new Dimension(800, 250));
        interactSection.setLayout(new BorderLayout());
        interactSection.add(panel_bot, BorderLayout.CENTER);
        
        panel_top.setPreferredSize(new Dimension(800, 50));
        panel_mid.setPreferredSize(new Dimension(800, 300));
        panel_bot.setPreferredSize(new Dimension(800, 200));
        
        panel_top.setBackground(new Color(35,35,35));
        panel_bot.setBackground(new Color(35,35,35));
        panel_mid.setBackground(new Color(30, 30, 30));
        panel_center.add(interactSection, BorderLayout.NORTH);
        panel_center.add(panel_mid, BorderLayout.CENTER);
        
        //search panel
        JLabel searchLabel = new JLabel("Tìm kiếm:");
        searchLabel.setForeground(Color.white);
        searchField = new JTextField();
        searchField.setBackground(new Color(35, 35, 35));
        searchField.setForeground(Color.white);
        searchField.setPreferredSize(new Dimension(200, 25));

        // Tạo flow layout cho panel_top và thêm label và textfield vào
        panel_top.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel_top.add(searchLabel);
        panel_top.add(searchField);
        panel_top.setBorder(new EmptyBorder(10, 10, 10, 10));
        
        //Table
        tbSupplier = new javax.swing.JTable();
        JScrollPane jScrollPane2 = new javax.swing.JScrollPane();

        tbSupplier.setAutoCreateRowSorter(true);
        tbSupplier.setBackground(new java.awt.Color(35, 35, 35));
        tbSupplier.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tbSupplier.setForeground(new java.awt.Color(255, 255, 255));
        tbSupplier.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, "aaaaaaaaaa", "ádasdasd", null},
                {null, "aaaaaaaaaa", "ádasd", null},
                {null, "aaaaaaaaaa", "ádasd", null},
                {null, "aaaaaaaaaa", "ádasda", null}
            },
            new String [] {
                    "id", "Tên", "Địa chỉ", "SDT"
                }
            ) {

        });
        tbSupplier.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tbSupplier.getTableHeader().setResizingAllowed(false);
        tbSupplier.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tbSupplier);
        if (tbSupplier.getColumnModel().getColumnCount() > 0) {
            tbSupplier.getColumnModel().getColumn(0).setPreferredWidth(50);  // id
            tbSupplier.getColumnModel().getColumn(1).setPreferredWidth(200);  // Tên
            tbSupplier.getColumnModel().getColumn(2).setPreferredWidth(300);  // Địa chỉ
            tbSupplier.getColumnModel().getColumn(3).setPreferredWidth(150);  // SDT
        }


        // Thêm JScrollPane chứa tbStaff vào panel_mid
        panel_mid.setLayout(new GridBagLayout());
        GridBagConstraints gbc1 = new GridBagConstraints();

        // Đặt hướng căn giữa cho panel_mid
        gbc1.gridx = 0;
        gbc1.gridy = 0;
        gbc1.weightx = 1.0;
        gbc1.weighty = 1.0;
        gbc1.fill = GridBagConstraints.BOTH;
        panel_mid.add(jScrollPane2, gbc1);
        panel_mid.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));
        
        //Update panel
        panel_bot.setLayout(new BorderLayout());
        
        PanelBackground staffInfo_panel_left = new PanelBackground();
        JPanel staffInfo_panel_center = new JPanel();
        PanelBackground staffInfo_panel_right = new PanelBackground();

        staffInfo_panel_center.setBackground(new Color(35,35,35));
        staffInfo_panel_left.setBackground(new Color(35,35,35));
        staffInfo_panel_right.setBackground(new Color(35,35,35));

        staffInfo_panel_center.setPreferredSize(new Dimension(350, 200));
        staffInfo_panel_left.setPreferredSize(new Dimension(350, 200));
        staffInfo_panel_right.setPreferredSize(new Dimension(150, 200));

        panel_bot.add(panel_top, BorderLayout.NORTH);
        panel_bot.add(staffInfo_panel_center, BorderLayout.CENTER);
        panel_bot.add(staffInfo_panel_left, BorderLayout.WEST);
        panel_bot.add(staffInfo_panel_right, BorderLayout.EAST);

        jScrollPane2.setPreferredSize(new Dimension(1250, 450));
        //Btn panel
        JButton btnThem = new JButton("Thêm");
        btnThem.setBackground(new Color(146, 227, 118));
        JButton btnSua = new JButton("Sửa");
        btnSua.setBackground(new Color(112, 179, 230));
        JButton btnXoa = new JButton("Xóa");
        btnXoa.setBackground(new Color(235, 82, 82));

        btnThem.setForeground(Color.white);
        btnSua.setForeground(Color.white);
        btnXoa.setForeground(Color.white);

        Dimension buttonSize = new Dimension(100, 30);
        btnThem.setPreferredSize(buttonSize);
        btnSua.setPreferredSize(buttonSize);
        btnXoa.setPreferredSize(buttonSize);

        PanelBackground buttonPanel = new PanelBackground();
        buttonPanel.setLayout(new GridBagLayout());
        buttonPanel.setBackground(new Color(35,35,35));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);

        buttonPanel.add(btnThem, gbc);

        gbc.gridy = 1;
        buttonPanel.add(btnSua, gbc);

        gbc.gridy = 2;
        buttonPanel.add(btnXoa, gbc);

        staffInfo_panel_right.setBackground(new Color(35,35,35));
        staffInfo_panel_right.setLayout(new GridBagLayout());
        staffInfo_panel_right.add(buttonPanel, gbc);
        //Info left

        JLabel lblUsername = new JLabel("Tên:");
        lblUsername.setForeground(Color.white);
        JTextField txtUsername = new JTextField();

        JLabel lblAddress = new JLabel("Địa chỉ:");
        lblAddress.setForeground(Color.white);
        JTextField txtAddress = new JTextField();

        JLabel lblSDT = new JLabel("SDT:");
        lblSDT.setForeground(Color.white);
        JTextField txtSDT = new JTextField();

        Dimension textFieldSize = new Dimension(200, 30);
        txtUsername.setPreferredSize(textFieldSize);
        txtAddress.setPreferredSize(textFieldSize);
        txtSDT.setPreferredSize(textFieldSize);

        GridBagConstraints gbcLeft = new GridBagConstraints();
        gbcLeft.gridx = 0;
        gbcLeft.gridy = 0;
        gbcLeft.anchor = GridBagConstraints.WEST;
        gbcLeft.insets = new Insets(5, 5, 5, 5); 

        staffInfo_panel_left.setLayout(new GridBagLayout());

        gbcLeft.gridx = 0;
        gbcLeft.gridy++;
        staffInfo_panel_left.add(lblUsername, gbcLeft);
        gbcLeft.gridx = 1;
        staffInfo_panel_left.add(txtUsername, gbcLeft);

        gbcLeft.gridx = 0;
        gbcLeft.gridy++;
        staffInfo_panel_left.add(lblAddress, gbcLeft);
        gbcLeft.gridx = 1;
        staffInfo_panel_left.add(txtAddress, gbcLeft);

        gbcLeft.gridx = 0;
        gbcLeft.gridy++;
        staffInfo_panel_left.add(lblSDT, gbcLeft);
        gbcLeft.gridx = 1;
        staffInfo_panel_left.add(txtSDT, gbcLeft);

        Dimension textFieldSize1 = new Dimension(200, 30);

     // Áp dụng cho các JTextField trong panel_left
     txtUsername.setPreferredSize(textFieldSize1);
     txtSDT.setPreferredSize(textFieldSize1);
     txtAddress.setPreferredSize(textFieldSize1);
     searchField.setPreferredSize(textFieldSize1);
        
     tbSupplier.addMouseListener(new MouseAdapter() {
    	    @Override
    	    public void mouseClicked(MouseEvent e) {
    	        int selectedRow = tbSupplier.getSelectedRow();
    	        if (selectedRow != -1) {
    	            DefaultTableModel model = (DefaultTableModel) tbSupplier.getModel();
    	            String ten = model.getValueAt(selectedRow, 1).toString();
    	            String diaChi = model.getValueAt(selectedRow, 2).toString();
    	            String sdt = model.getValueAt(selectedRow, 3).toString();
    	            
    	            // Hiển thị thông tin nhà cung cấp lên các textfield
    	            txtUsername.setText(ten);
    	            txtAddress.setText(diaChi);
    	            txtSDT.setText(sdt);
    	        }
    	    }
    	});

     searchField.getDocument().addDocumentListener(new DocumentListener() {
    	    @Override
    	    public void insertUpdate(DocumentEvent e) {
    	        search();
    	    }

    	    @Override
    	    public void removeUpdate(DocumentEvent e) {
    	        search();
    	    }

    	    @Override
    	    public void changedUpdate(DocumentEvent e) {
    	        search();
    	    }

    	    private void search() {
    	        String searchText = searchField.getText().trim().toLowerCase();
    	        ArrayList<SupplierDTO> filteredList = new ArrayList<>();
    	        for (SupplierDTO supplier : listSupplier) {
    	            if (supplier.getName().toLowerCase().contains(searchText) ||
    	                supplier.getAddress().toLowerCase().contains(searchText) ||
    	                supplier.getPhone().toLowerCase().contains(searchText)) {
    	                filteredList.add(supplier);
    	            }
    	        }

    	        // Hiển thị lại danh sách nhà cung cấp lọc được
    	        renderFilteredSupplier(filteredList);
    	    }
    	});
     
     btnThem.addActionListener(new ActionListener() {
    	    public void actionPerformed(ActionEvent e) {
    	        if (txtUsername.getText().isEmpty() || txtAddress.getText().isEmpty() || txtSDT.getText().isEmpty()) {                    
    	            JOptionPane.showMessageDialog(pnContainer, "Vui lòng điền đầy đủ thông tin.");
    	        } else {
    	            int choice = JOptionPane.showConfirmDialog(pnContainer, "Bạn có chắc chắn thêm không ?", "Xác nhận", JOptionPane.YES_NO_OPTION);
    	            if (choice == 0) {
    	                String phonePattern = "^[0-9]{10}$";
    	                
    	                String name = txtUsername.getText();
    	                String address = txtAddress.getText();
    	                String phone = txtSDT.getText();
    	                
    	                if (!phone.matches(phonePattern)) {
    	                    JOptionPane.showMessageDialog(pnContainer, "Số điện thoại không hợp lệ. Vui lòng nhập số điện thoại gồm 10 chữ số.", "Lỗi", JOptionPane.ERROR_MESSAGE);
    	                    return;
    	                }

    	                SupplierDTO newSupplier = new SupplierDTO();
    	                newSupplier.createId();
    	                newSupplier.setName(name);
    	                newSupplier.setAddress(address);
    	                newSupplier.setPhone(phone);
    	                newSupplier.setIsdeleted(false);
    	                
    	                boolean isInserted = SupplierBUS.insertSupplier(newSupplier);
    	                if (isInserted) {
    	                    JOptionPane.showMessageDialog(null, "Thêm nhà cung cấp mới thành công!");
    	                    renderSupplier(isSelectAll);
    	                } else {
    	                    JOptionPane.showMessageDialog(null, "Không thể thêm mới nhà cung cấp.");
    	                }
    	            }
    	        }
    	    }
    	});

     btnXoa.addActionListener(new ActionListener() {
    	    public void actionPerformed(ActionEvent e) {
    	        int selectedRow = tbSupplier.getSelectedRow();
    	        if (selectedRow != -1) {
    	            int choice = JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn xóa nhà cung cấp này?", "Xác nhận xóa", JOptionPane.YES_NO_OPTION);
    	            if (choice == JOptionPane.YES_OPTION) {
    	                SupplierDTO supplierSelected = listSupplier.get(selectedRow);
    	                supplierSelected.setIsdeleted(true); // Set isdeleted field to true
    	                boolean isUpdated = SupplierBUS.updateSupplier(supplierSelected); // Update supplier data
    	                if (isUpdated) {
    	                    JOptionPane.showMessageDialog(null, "Xóa nhà cung cấp thành công!");
    	                    renderSupplier(isSelectAll); // Re-render the supplier list
    	                } else {
    	                    JOptionPane.showMessageDialog(null, "Không thể xóa nhà cung cấp.");
    	                }
    	            }
    	        } else {
    	            JOptionPane.showMessageDialog(null, "Vui lòng chọn nhà cung cấp cần xóa.");
    	        }
    	    }
    	});

     btnSua.addActionListener(new ActionListener() {
    	    public void actionPerformed(ActionEvent e) {
    	        int selectedRow = tbSupplier.getSelectedRow();
    	        if (selectedRow != -1) {
    	            if (txtUsername.getText().isEmpty() || txtAddress.getText().isEmpty() || txtSDT.getText().isEmpty()) {
    	                JOptionPane.showMessageDialog(null, "Vui lòng điền đầy đủ thông tin.");
    	                return;
    	            }
    	            String phonePattern = "^[0-9]{10}$";
    	            SupplierDTO supplierSelected = listSupplier.get(selectedRow);

    	            supplierSelected.setName(txtUsername.getText());
    	            supplierSelected.setAddress(txtAddress.getText());
    	            supplierSelected.setPhone(txtSDT.getText());
    	            
    	            if (!txtSDT.getText().matches(phonePattern)) {
    	                JOptionPane.showMessageDialog(pnContainer, "Số điện thoại không hợp lệ. Vui lòng nhập số điện thoại gồm 10 chữ số.", "Lỗi", JOptionPane.ERROR_MESSAGE);
    	                return;
    	            }

    	            boolean isUpdated = SupplierBUS.updateSupplier(supplierSelected);
    	            if (isUpdated) {
    	                JOptionPane.showMessageDialog(null, "Cập nhật thông tin nhà cung cấp thành công!");                       
    	                renderSupplier(isSelectAll);
    	            } else {
    	                JOptionPane.showMessageDialog(null, "Không thể cập nhật thông tin nhà cung cấp.");
    	            }
    	        } else {
    	            JOptionPane.showMessageDialog(null, "Vui lòng chọn nhà cung cấp cần cập nhật.");
    	        }
    	    }
    	});

     
        
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    
    
}




