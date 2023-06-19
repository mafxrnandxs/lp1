
package invoiceproject;

import javax.swing.JOptionPane;

public class InvoiceProject {

    public static void main(String[] args) {
        
        Invoice invoice = new Invoice("001", "Teclado", 2, 29.99);
        
        JOptionPane.showMessageDialog(null, "Número: " + invoice.getNumber());
        JOptionPane.showMessageDialog(null, "Descrição: " + invoice.getDescription());
        JOptionPane.showMessageDialog(null,"Quantidade: " + invoice.getQuantity());
        JOptionPane.showMessageDialog(null, "Preço por item: " + invoice.getPricePerItem());
        JOptionPane.showMessageDialog(null, "Total da fatura: " + invoice.getInvoiceAmount());
        
        invoice.setNumber("54321");
        invoice.setDescription("Mouse");
        invoice.setQuantity(3);
        invoice.setPricePerItem(25.0);

        JOptionPane.showMessageDialog(null,"Nova quantidade: " + invoice.getQuantity());
        JOptionPane.showMessageDialog(null,"Novo preço por item: " + invoice.getPricePerItem());
        JOptionPane.showMessageDialog(null, "Novo total da fatura: " + invoice.getInvoiceAmount());
        
        
    }
    
}
