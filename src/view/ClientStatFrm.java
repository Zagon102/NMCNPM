/*
 * CODE,
 * CODE NUA,
 * CODE MAI...
 */
package view;

import dao.ClientStatDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import model.ClientStat;
import model.User;

/**
 *
 * @author Son Vu
 */
public class ClientStatFrm extends javax.swing.JFrame implements ActionListener {

	/**
	 * Creates new form ClientStatFrm
	 */
	private User user;

	public ClientStatFrm(User user) {
		setTitle("Xem Thống kê");
		setResizable(false);
		setLocationRelativeTo(null);
		initComponents();
		this.user = user;
		btnStat.addActionListener(this);
		btnStat.setActionCommand("btnStat");
		txtSD.setText("30/04/2021");
		txtED.setText("30/05/2021");
		setVisible(true);
	}

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSD = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtED = new javax.swing.JTextField();
        btnStat = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblStat = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Thống kê Khách Hàng");

        jLabel2.setText("Ngày bắt đầu (dd/MM/yyyy) :");

        jLabel3.setText("Ngày kết thúc (dd/MM/yyyy) : ");

        btnStat.setText("Xác nhận");

        jLabel4.setText("Ngày Thống kê :");

        tblStat.setModel(new javax.swing.table.DefaultTableModel(
            null,
            new String [] {
                "idClient", "name", "address", "email","tel","Tổng lượt thuê",
                "Tổng ngày thuê", "Tổng doanh thu"
            }
        ));
        jScrollPane2.setViewportView(tblStat);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtED, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSD, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(btnStat, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtED, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnStat, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnStat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblStat;
    private javax.swing.JTextField txtED;
    private javax.swing.JTextField txtSD;
    // End of variables declaration//GEN-END:variables

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("btnStat")) {
			btnStatClick();
		}
	}

	private void btnStatClick() {
		try {
			SimpleDateFormat fm = new SimpleDateFormat("dd/MM/yyyy");
			fm.setLenient(false);
			Date sd = fm.parse(txtSD.getText());
			Date ed = fm.parse(txtED.getText());
			if (ed.before(sd)) {
				JOptionPane.showMessageDialog(this, "Ngày kết thúc nằm trước ngày bắt đầu",
						 "Warring", JOptionPane.WARNING_MESSAGE);
				return;
			}
			jLabel4.setText(" Ngày thống kê : " + fm.format(sd) + " -> " + fm.format(ed));
			DefaultTableModel model = (DefaultTableModel) tblStat.getModel();
			model.setRowCount(0);
			tblStat.setModel(model);
			ClientStatDAO cd = new ClientStatDAO();
			List<ClientStat> list = cd.searchClientStat(sd, ed);
			if(list.get(0).getTotal_income()==0) {
				int choose = JOptionPane.showOptionDialog(this, "Stat list is Empty ! Do you want to go back ?", "Info", 
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, EXIT_ON_CLOSE);
				if(choose == 0) {
					new ManagerHomeFrm(user);
					this.dispose();
				}
			}
			for (ClientStat ct : list) {
				if (ct.getTotal_income() == 0.0) {
					continue;
				}
				model.addRow(ct.toObject());
			}
			tblStat.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
				public void valueChanged(ListSelectionEvent event) {
					int ct = tblStat.getSelectedRow();
					new ClientDetailFrm(user,list.get(ct),sd,ed);
					dispose();
				}
			});
		} catch (IllegalArgumentException | ParseException e) {
			JOptionPane.showMessageDialog(this, "Lỗi định dạng ngày",
					 "Warring", JOptionPane.WARNING_MESSAGE);
		} catch (DateTimeParseException e) {
			JOptionPane.showMessageDialog(this, "Ngày không tồn tại hoặc ngoài khả năng thống kê",
					 "Warring", JOptionPane.WARNING_MESSAGE);
		}
	}
}
