package com.toko.buku.model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Yoel
 */
public class TokoBukuTableModel extends AbstractTableModel{
    private List<TokoBuku> listTokoBuku = new ArrayList();
    private final String HEADER[] = {"Kode Buku","Nama Buku","Genre Buku","Harga Buku"};

    public TokoBukuTableModel(List<TokoBuku> listTokoBuku) {
        this.listTokoBuku = listTokoBuku;
    }

    
    
    @Override
    public int getRowCount() {
       return listTokoBuku.size();
    }

    @Override
    public int getColumnCount() {
        return HEADER.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        TokoBuku tokoBuku = listTokoBuku.get(rowIndex);
        
        switch(columnIndex){
            case 0:
                return tokoBuku.getKd_buku();
            case 1:
                return tokoBuku.getNama();
            case 2:
                return tokoBuku.getGenre();
            case 3:
                return tokoBuku.getHarga();
            default:
                return null;
        }
    }
    
    public String getColumnName(int index){
        return HEADER[index];
    }
}
