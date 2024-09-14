/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

/**
 *
 * @author Tai
 */
import java.sql.Connection;
import DAO.ImportBillDAO;
import DTO.ImportBillDTO;
import Helper.FormatNumber;
import java.util.ArrayList;
import java.util.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JTable;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import javax.swing.table.TableColumnModel;
public class ImportBillBUS {
    private ImportBillDAO importBillDAO = new ImportBillDAO();
    private ArrayList<ImportBillDTO> listImportBills = new ArrayList<>();

    public ArrayList<ImportBillDTO> loadImportBills() {
        return importBillDAO.getImportBills();

    }
    
    public ImportBillDTO getImportBillById(long id) {
        return importBillDAO.getImportBillById(id);
    }
    
    
    public ImportBillBUS() {
        this.importBillDAO = new ImportBillDAO();
    }

    public boolean addImportBill(ImportBillDTO importBill) {
        return importBillDAO.addImportBill(importBill);
    }
    public static void deleteImportBill(Long importBillId) {
        ImportBillDAO.deleteImportBill(importBillId);
    }

}