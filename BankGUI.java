
/**
 * Write a description of class BankGUI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;

public class BankGUI
{
    private JLabel reg, 
    head1, deb_cardid,deb_clientname, deb_bankaccount,deb_balanceamount, deb_pinno, deb_issuerbank,
    head2, cre_cardid, cre_clientname, cre_bankaccount, cre_issuerbank, cre_balanceamount, cre_cvcno, cre_interest, cre_expirationdate, 
    head3, withdraw_cardid, withdraw_amount, withdraw_pin, withdraw_date,
    head4, limit_cardid, limit_credit, limit_grace,
    head5, cancel_cardid;

    private JTextField 
    deb_cardidBox, deb_clientnameBox, deb_bankaccountBox, deb_balanceamountBox,deb_pinnoBox,deb_issuerbankBox,
    cre_cardidBox, cre_bankaccountBox, cre_issuerbankBox, cre_clientnameBox, cre_balanceamountBox, cre_cvcnoBox, cre_interestBox,
    withdraw_dateBox, withdraw_pinBox,withdraw_amountBox,withdraw_cardidBox,
    limit_graceBox, limit_creditBox,limit_cardidBox,
    cancel_cardidBox;

    private JButton add_debit_card, add_credit_card,set_credit_limit,cancel_credit_card, withdraw,
    display_credit, clear, display_debit;

    private JFrame frame;

    private JComboBox 
    cre_daycombo, cre_datecombo,cre_yearcombo,//credit card combobox
    withdraw_day, withdraw_month, withdraw_year;//withdraw from debit card combobox

    public BankGUI(){

        //Java frame with width 1400 and height 750
        JFrame frame = new JFrame();//frame is the name of the frame.
        frame.setSize(1400,750);
        frame.setLayout(null);
        frame.setVisible(true);
        //frame.getContentPane().setBackground(Color.decode("#05D0EB"));
        frame.setLocationRelativeTo(null);//this will initialize the frame in center 
        frame.setTitle("Bank GUI");

        //Title of the GUI
        reg = new JLabel("Bank Form");
        reg.setBounds(585, 23, 152, 41);
        reg.setFont(new Font("Arial", 20, 30));
        frame.setVisible(true);

        // -------------add debit card -----------------
        head1 = new JLabel("Enter the details below to add DebitCard: ");
        head1.setBounds(26, 81, 490, 51);
        head1.setFont(new Font("Arial", 20, 18));
        frame.setVisible(true);

        deb_cardid = new JLabel("Card ID: ");
        deb_cardid.setBounds(26, 135, 83, 24);  
        deb_cardid.setFont(new Font("Arial", 20, 15));

        deb_cardidBox = new JTextField();
        deb_cardidBox.setBounds(140, 132, 225, 30);
        deb_cardidBox.setFont(new Font("Arial", 20, 15));

        deb_balanceamount = new JLabel("Balance Amount: ");
        deb_balanceamount.setBounds(380, 135, 140, 24);  
        deb_balanceamount.setFont(new Font("Arial", 20, 15));

        deb_balanceamountBox = new JTextField();
        deb_balanceamountBox.setBounds(510, 132, 225, 30);
        deb_balanceamountBox.setFont(new Font("Arial", 20, 15));

        deb_clientname = new JLabel("Client Name: ");
        deb_clientname.setBounds(26, 170, 140, 24);  
        deb_clientname.setFont(new Font("Arial", 20, 15));

        deb_clientnameBox = new JTextField();
        deb_clientnameBox.setBounds(140, 167, 225, 30);
        deb_clientnameBox.setFont(new Font("Arial", 20, 15));

        deb_pinno = new JLabel("Pin No.: ");
        deb_pinno.setBounds(380, 170, 140, 24);  
        deb_pinno.setFont(new Font("Arial", 20, 15));

        deb_pinnoBox = new JTextField();
        deb_pinnoBox.setBounds(510, 167, 225, 30);
        deb_pinnoBox.setFont(new Font("Arial", 20, 15));

        deb_bankaccount = new JLabel("Bank Account: ");
        deb_bankaccount.setBounds(26, 205, 140, 24);  
        deb_bankaccount.setFont(new Font("Arial", 20, 15));

        deb_bankaccountBox = new JTextField();
        deb_bankaccountBox.setBounds(140, 202, 225, 30);
        deb_bankaccountBox.setFont(new Font("Arial", 20, 15));

        deb_issuerbank = new JLabel("Issuer Bank: ");
        deb_issuerbank.setBounds(380, 205, 140, 24);  
        deb_issuerbank.setFont(new Font("Arial", 20, 15));

        deb_issuerbankBox = new JTextField();
        deb_issuerbankBox.setBounds(510, 202, 225, 30);
        deb_issuerbankBox.setFont(new Font("Arial", 20, 15));

        add_debit_card = new JButton("Add Debit Card");
        add_debit_card.setBounds(568, 237, 165, 30);
        add_debit_card.setFont(new Font("Arial", 20, 15));

        //------------------end of add debit card--------------

        // -------------add Credit card -----------------
        head2 = new JLabel("Enter the details below to add CreditCard: ");
        head2.setBounds(770, 81, 490, 51);
        head2.setFont(new Font("Arial", 20, 18));
        frame.setVisible(true);

        cre_cardid = new JLabel("Card ID: ");
        cre_cardid.setBounds(770, 135, 83, 24);  
        cre_cardid.setFont(new Font("Arial", 20, 15));

        cre_cardidBox = new JTextField();
        cre_cardidBox.setBounds(875, 135, 180, 30);
        cre_cardidBox.setFont(new Font("Arial", 20, 15));

        cre_balanceamount = new JLabel("Balance Amount: ");
        cre_balanceamount.setBounds(1070, 135, 140, 24);  
        cre_balanceamount.setFont(new Font("Arial", 20, 15));

        cre_balanceamountBox = new JTextField();
        cre_balanceamountBox.setBounds(1190, 135, 170, 30);
        cre_balanceamountBox.setFont(new Font("Arial", 20, 15));

        cre_clientname = new JLabel("Client Name: ");
        cre_clientname.setBounds(770, 170, 140, 24);  
        cre_clientname.setFont(new Font("Arial", 20, 15));

        cre_clientnameBox = new JTextField();
        cre_clientnameBox.setBounds(875, 170, 180, 30);
        cre_clientnameBox.setFont(new Font("Arial", 20, 15));

        cre_cvcno = new JLabel("CVC Number: ");
        cre_cvcno.setBounds(1070, 170, 140, 24);  
        cre_cvcno.setFont(new Font("Arial", 20, 15));

        cre_cvcnoBox = new JTextField();
        cre_cvcnoBox.setBounds(1190, 170, 170, 30);
        cre_cvcnoBox.setFont(new Font("Arial", 20, 15));

        cre_bankaccount = new JLabel("Bank Account: ");
        cre_bankaccount.setBounds(770, 205, 140, 24);  
        cre_bankaccount.setFont(new Font("Arial", 20, 15));

        cre_bankaccountBox = new JTextField();
        cre_bankaccountBox.setBounds(875, 205, 180, 30);
        cre_bankaccountBox.setFont(new Font("Arial", 20, 15));

        cre_interest = new JLabel("Interest Rate: ");
        cre_interest.setBounds(1070, 205, 140, 24);  
        cre_interest.setFont(new Font("Arial", 20, 15));

        cre_interestBox = new JTextField();
        cre_interestBox.setBounds(1190, 205, 170, 30);
        cre_interestBox.setFont(new Font("Arial", 20, 15));

        cre_issuerbank = new JLabel("Issuer Bank: ");
        cre_issuerbank.setBounds(770, 240, 140, 24);  
        cre_issuerbank.setFont(new Font("Arial", 20, 15));

        cre_issuerbankBox = new JTextField();
        cre_issuerbankBox.setBounds(875, 240, 180, 30);
        cre_issuerbankBox.setFont(new Font("Arial", 20, 15));

        cre_expirationdate = new JLabel("Expiration Date: ");
        cre_expirationdate.setBounds(1070, 240, 140, 24);  
        cre_expirationdate.setFont(new Font("Arial", 20, 15));

        String[] day = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","10","21","22","23","24","25","26","27","28","29"};
        cre_daycombo = new JComboBox(day);
        cre_daycombo.setBounds(1190, 240, 40, 20);

        String[] datecombo = {"Jan", "Feb", "Mar", "Apr", "May", "June", "July", "Aug", "Sep", "Octr", "Nov", "Dec"};
        cre_datecombo = new JComboBox(datecombo);
        cre_datecombo.setBounds(1240, 240,50, 20);

        String[] yearcombo = {"2019","2020","2021","2022","2023"};
        cre_yearcombo = new JComboBox(yearcombo);
        cre_yearcombo.setBounds(1300, 240,60, 20);

        add_credit_card = new JButton("Add Credit Card");
        add_credit_card.setBounds(1195, 270, 165, 30);
        add_credit_card.setFont(new Font("Arial", 20, 15));
        //--------------end of the add credit card---------------

        //-----------------with draw amount-------
        head3 = new JLabel("Enter the details below to withdraw from debit card: ");
        head3.setBounds(26, 250, 490, 51);
        head3.setFont(new Font("Arial", 20, 18));
        frame.setVisible(true);

        withdraw_cardid = new JLabel("Card ID: ");
        withdraw_cardid.setBounds(26, 305, 83, 24);  
        withdraw_cardid.setFont(new Font("Arial", 20, 15));

        withdraw_cardidBox = new JTextField();
        withdraw_cardidBox.setBounds(190, 305, 230, 30);
        withdraw_cardidBox.setFont(new Font("Arial", 20, 15));

        withdraw_amount = new JLabel("Withdraw Amount: ");
        withdraw_amount.setBounds(26, 340, 140, 24);  
        withdraw_amount.setFont(new Font("Arial", 20, 15));

        withdraw_amountBox = new JTextField();
        withdraw_amountBox.setBounds(190, 340, 230, 30);
        withdraw_amountBox.setFont(new Font("Arial", 20, 15));

        withdraw_pin = new JLabel("Withdraw PIN: ");
        withdraw_pin.setBounds(26, 375, 140, 24);  
        withdraw_pin.setFont(new Font("Arial", 20, 15));

        withdraw_pinBox = new JTextField();
        withdraw_pinBox.setBounds(190, 375, 230, 30);
        withdraw_pinBox.setFont(new Font("Arial", 20, 15));

        withdraw_date = new JLabel("Date of WithDraw: ");
        withdraw_date.setBounds(26, 410, 140, 24);  
        withdraw_date.setFont(new Font("Arial", 20, 15));

        String[] days = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","10","21","22","23","24","25","26","27","28","29"};
        withdraw_day = new JComboBox(days);
        withdraw_day.setBounds(190, 410, 50, 20);

        String[] date = {"Jan", "Feb", "Mar", "Apr", "May", "June", "July", "Aug", "Sep", "Oct", "Nov", "Dec"};
        withdraw_month = new JComboBox(date);
        withdraw_month.setBounds(250, 410, 80, 20);

        String[] longdob = {"2019","2020","2021","2022","2023"};
        withdraw_year = new JComboBox(longdob);
        withdraw_year.setBounds(340, 410, 80, 20);
        
        withdraw = new JButton("WithDraw ");
        withdraw.setBounds(270, 440, 150, 30);
        withdraw.setFont(new Font("Arial", 20, 15));
        //-----------------end of withdraw amount------

        //------------------set credit card limit----------

        head4 = new JLabel("Enter the details below to set credit limit: ");
        head4.setBounds(770, 320, 490, 51);
        head4.setFont(new Font("Arial", 20, 18));
        frame.setVisible(true);

        limit_cardid = new JLabel("Card ID: ");
        limit_cardid.setBounds(770, 370, 83, 24);  
        limit_cardid.setFont(new Font("Arial", 20, 15));

        limit_cardidBox = new JTextField();
        limit_cardidBox.setBounds(875, 368, 180, 30);
        limit_cardidBox.setFont(new Font("Arial", 20, 15));

        limit_credit = new JLabel("Credit Limit: ");
        limit_credit.setBounds(770, 405, 140, 24);  
        limit_credit.setFont(new Font("Arial", 20, 15));

        limit_creditBox = new JTextField();
        limit_creditBox.setBounds(875, 403, 180, 30);
        limit_creditBox.setFont(new Font("Arial", 20, 15));

        limit_grace = new JLabel("Grace Period: ");
        limit_grace.setBounds(770, 440, 140, 24);  
        limit_grace.setFont(new Font("Arial", 20, 15));

        limit_graceBox = new JTextField();
        limit_graceBox.setBounds(875, 438, 180, 30);
        limit_graceBox.setFont(new Font("Arial", 20, 15));

        set_credit_limit = new JButton("Set credit Limit");
        set_credit_limit.setBounds(1070, 438, 165, 30);
        set_credit_limit.setFont(new Font("Arial", 20, 15));
        //---------------end of set credit limit------------

        //---------cancel credit card-----
        head5 = new JLabel("Enter the details below to Cancel Credit Card: ");
        head5.setBounds(770, 480, 490, 51);
        head5.setFont(new Font("Arial", 20, 18));
        frame.setVisible(true);

        cancel_cardid = new JLabel("Card ID: ");
        cancel_cardid.setBounds(770, 530, 83, 24);  
        cancel_cardid.setFont(new Font("Arial", 20, 15));

        cancel_cardidBox = new JTextField();
        cancel_cardidBox.setBounds(850, 527, 180, 30);
        cancel_cardidBox.setFont(new Font("Arial", 20, 15));

        cancel_credit_card = new JButton("Cancel Credit Card");
        cancel_credit_card.setBounds(1040, 526, 180, 30);
        cancel_credit_card.setFont(new Font("Arial", 20, 15));
        //--------end of cancel credit card--------

        //--------down 3 buttons-------

        display_debit = new JButton("Display ");
        display_debit.setBounds(520, 580, 150, 30);
        display_debit.setFont(new Font("Arial", 20, 15));

        clear = new JButton("Clear ");
        clear.setBounds(700, 580, 150, 30);
        clear.setFont(new Font("Arial", 20, 15));

        display_credit = new JButton("Display ");
        display_credit.setBounds(880, 580, 150, 30);
        display_credit.setFont(new Font("Arial", 20, 15));
        //-----end of down buttons

        // added frames
        frame.add(reg);

        frame.add(head1);//add debit card(hea1)
        frame.add(deb_cardid); 
        frame.add(deb_clientname);
        frame.add(deb_bankaccount);
        frame.add(deb_balanceamount);
        frame.add(deb_pinno);
        frame.add(deb_issuerbank);

        frame.add(head2);//add credit card(head2)
        frame.add(cre_cardid);
        frame.add(cre_clientname);
        frame.add(cre_bankaccount);
        frame.add(cre_issuerbank);
        frame.add(cre_balanceamount);
        frame.add(cre_cvcno);
        frame.add(cre_interest);
        frame.add(cre_expirationdate);

        frame.add(head3);//withdraw from debit card
        frame.add(withdraw_cardid);
        frame.add(withdraw_amount);
        frame.add(withdraw_pin);
        frame.add(withdraw_date);

        frame.add(head4);//set credit limit
        frame.add(limit_cardid);
        frame.add(limit_credit);
        frame.add(limit_grace);

        frame.add(head5);
        frame.add(cancel_cardid);

        // for text field
        frame.add(deb_cardidBox);//add debit card section
        frame.add(deb_clientnameBox);
        frame.add(deb_bankaccountBox);
        frame.add(deb_balanceamountBox);
        frame.add(deb_pinnoBox);
        frame.add(deb_issuerbankBox);

        frame.add(cre_cardidBox);//add credti card section
        frame.add(cre_bankaccountBox);
        frame.add(cre_issuerbankBox);
        frame.add(cre_clientnameBox);
        frame.add(cre_balanceamountBox);
        frame.add(cre_cvcnoBox);
        frame.add(cre_interestBox);
        frame.add(cre_daycombo);
        frame.add(cre_datecombo);
        frame.add(cre_yearcombo);

        frame.add(withdraw_day);//withdraw amount section
        frame.add(withdraw_month);
        frame.add(withdraw_year);
        frame.add(withdraw_pinBox);
        frame.add(withdraw_amountBox);
        frame.add(withdraw_cardidBox);

        frame.add(limit_graceBox);
        frame.add(limit_creditBox);
        frame.add(limit_cardidBox);

        frame.add(cancel_cardidBox);

        // for button
        frame.add(add_debit_card);
        frame.add(add_credit_card);
        frame.add(set_credit_limit);
        frame.add(cancel_credit_card);
        frame.add(withdraw);

        frame.add(display_credit);
        frame.add(clear);
        frame.add(display_debit);
    }

    public static void main(String[] args){
        new BankGUI();
    }
}
