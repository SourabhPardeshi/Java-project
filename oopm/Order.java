        import javax.swing.*;
        import java.awt.event.*;
	import java.awt.*;

class MyFrame extends JFrame 
    {
	JLabel title,lhead1,lhead2,lhead3,lhead4,lhead5,lhead6,lchange,ltax,lsubT,ltotal;
	JCheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20,c21;
	JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19,t20,t21,tcash,tchange,ttax,tsubT,ttotal; 
	JButton Reset,Total,Exit;  
	JFrame frame;

	double Price_VegSpringRoll = 130.0;
	double Price_VegCrispy = 130.0;
	double Price_MushroomTikka = 140.0;
	double Price_PaneerReshmiKabab = 150.0;
	double Price_ChickenSalad = 160.0;
	double Price_Tandoori_Roti = 12.0;
	double Price_Butter_Naan = 35.0;
	double Price_Paratha = 25.0;
	double Price_WickedChoco = 75.0;
	double Price_Brownie = 95.0;
	double Price_PineappleStick = 90.0;
	double Price_ChocolateMuffin = 65.0;
	double Price_PancakeSyrup = 90.0;
	double Price_Tea = 20.0;
	double Price_Cola = 20.0;
	double Price_Coffee = 30.0;
	double Price_OrangeJuice = 30.0;
	double Price_BottleWater = 20.0;
	double Price_VegKadai = 130.0;
	double Price_ButterChicken = 180.0;
	double Price_ShahiPaneer = 240.0;
	double Tax_Rate = 18.0;
	
	double iTax,iTotal,iSubTotal,iChange,iCost;
	double[] itemcost = new double[21];	

	String[] payMethod = new String[] { "Credit Card","Cash" };
        
         public MyFrame()
         {
              super("FOOD ORDER");
              setSize(900 , 600);  
              setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              setLocation(0, 0);
              setLayout(null);
              setResizable(false);
     
		title = new JLabel("FOOD ORDER SYSTEM");
		title.setBounds(350,20,200,10);
		add(title);

		lhead1 = new JLabel("STARTERS : ");
		lhead1.setBounds(20,40,300,50);
		add(lhead1);

		c1 = new JCheckBox("Veg Spring Roll");
		c1.setBounds(20,70,140,60);
		add(c1);

		c2 = new JCheckBox("Veg Crispy");
		c2.setBounds(20,110,140,60);
		add(c2);

		c3 = new JCheckBox("Mushroom Tikka");
		c3.setBounds(20,150,140,60);
		add(c3);

		c4 = new JCheckBox("Paneer Kabab");
		c4.setBounds(20,190,140,60);
		add(c4);

		c5 = new JCheckBox("Chicken Salad");
		c5.setBounds(20,230,140,60);
		add(c5);

		lhead2 = new JLabel("BREAD : ");
		lhead2.setBounds(20,280,300,50);
		add(lhead2);

		c6 = new JCheckBox("Tandoori Roti");
		c6.setBounds(20,320,140,60);
		add(c6);

		c7 = new JCheckBox("Butter Nan");
		c7.setBounds(20,360,140,60);
		add(c7);		

		c8 = new JCheckBox("Paratha");
		c8.setBounds(20,400,140,60);
		add(c8);

		t1 = new JTextField("0");
		t1.setBounds(175,90,70,20);
		t1.setEnabled(false);
		add(t1);

		t2 = new JTextField("0");
		t2.setBounds(175,130,70,20);
	        t2.setEnabled(false);
		add(t2);

		t3 = new JTextField("0");
		t3.setBounds(175,170,70,20);
	        t3.setEnabled(false);
		add(t3);

		t4 = new JTextField("0");
		t4.setBounds(175,210,70,20);
	        t4.setEnabled(false);
		add(t4);

		t5 = new JTextField("0");
		t5.setBounds(175,250,70,20);
	        t5.setEnabled(false);
		add(t5);

		t6 = new JTextField("0");
		t6.setBounds(175,340,70,20);
	        t6.setEnabled(false);
		add(t6);

		t7 = new JTextField("0");
		t7.setBounds(175,380,70,20);
	        t7.setEnabled(false);
		add(t7);

		t8 = new JTextField("0");
		t8.setBounds(175,420,70,20);
	        t8.setEnabled(false);
		add(t8);

		lhead3 = new JLabel("DESSERTS : ");
		lhead3.setBounds(320,40,300,50);
		add(lhead3);

		c9 = new JCheckBox("Hash Brown");
		c9.setBounds(320,70,140,60);
		add(c9);

		c10 = new JCheckBox("Toasted Bagel");
		c10.setBounds(320,110,140,60);
		add(c10);

		c11 = new JCheckBox("Pineapple Stick");
		c11.setBounds(320,150,140,60);
		add(c11);

		c12 = new JCheckBox("Chocolate Muffin");
		c12.setBounds(320,190,140,60);
		add(c12);

		c13 = new JCheckBox("Pancakes - Syrup");
		c13.setBounds(320,230,140,60);
		add(c13);

		t9 = new JTextField("0");
		t9.setBounds(475,90,70,20);
	        t9.setEnabled(false);
		add(t9);

		t10 = new JTextField("0");
		t10.setBounds(475,130,70,20);
	        t10.setEnabled(false);
		add(t10);

		t11 = new JTextField("0");
		t11.setBounds(475,170,70,20);
	        t11.setEnabled(false);
		add(t11);

		t12 = new JTextField("0");
		t12.setBounds(475,210,70,20);
	        t12.setEnabled(false);
		add(t12);

		t13 = new JTextField("0");
		t13.setBounds(475,250,70,20);
	        t13.setEnabled(false);
		add(t13);

		lhead4 = new JLabel("DRINKS : ");
		lhead4.setBounds(620,40,300,50);
		add(lhead4);

		c14 = new JCheckBox("Tea");
		c14.setBounds(620,70,140,60);
		add(c14);		

		c15 = new JCheckBox("Cola");
		c15.setBounds(620,110,140,60);
		add(c15);

		c16 = new JCheckBox("Coffee");
		c16.setBounds(620,150,140,60);
		add(c16);

		c17 = new JCheckBox("Orange Juice");
		c17.setBounds(620,190,140,60);
		add(c17);

		c18 = new JCheckBox("Bottle Water");
		c18.setBounds(620,230,140,60);
		add(c18);

		t14 = new JTextField("0");
		t14.setBounds(775,90,70,20);
	        t14.setEnabled(false);
		add(t14);

		t15 = new JTextField("0");
		t15.setBounds(775,130,70,20);
	        t15.setEnabled(false);
		add(t15);

		t16 = new JTextField("0");
		t16.setBounds(775,170,70,20);
	        t16.setEnabled(false);
		add(t16);

		t17 = new JTextField("0");
		t17.setBounds(775,210,70,20);
	        t17.setEnabled(false);
		add(t17);

		t18 = new JTextField("0");
		t18.setBounds(775,250,70,20);
	        t18.setEnabled(false);
		add(t18);

		lhead5 = new JLabel("GRAVY ");
		lhead5.setBounds(620,280,300,50);
		add(lhead5);

		c19 = new JCheckBox("Veg Kadai");
		c19.setBounds(620,320,140,60);
		add(c19);

		c20 = new JCheckBox("Butter Chicken");
		c20.setBounds(620,360,140,60);
		add(c20);

		c21 = new JCheckBox("Shahi Paneer");
		c21.setBounds(620,400,140,60);
		add(c21);

		t19 = new JTextField("0");
		t19.setBounds(775,340,70,20);
	        t19.setEnabled(false);
		add(t19);

		t20 = new JTextField("0");
		t20.setBounds(775,380,70,20);
	        t20.setEnabled(false);
		add(t20);

		t21 = new JTextField("0");
		t21.setBounds(775,420,70,20);
	        t21.setEnabled(false);
		add(t21);

		lhead6 = new JLabel("Payment Method ");
		lhead6.setBounds(300,280,100,50);
		add(lhead6);

		lchange = new JLabel("Change ");
		lchange.setBounds(440,300,100,50);
		add(lchange);

		tchange = new JTextField();
		tchange.setBounds(500,317,90,20);
		tchange.setEditable(false);
		add(tchange);

		ltax = new JLabel("Tax ");
		ltax.setBounds(440,330,100,50);
		add(ltax);

		ttax = new JTextField();
		ttax.setBounds(500,347,90,20);
		ttax.setEditable(false);
		add(ttax);

		tcash = new JTextField("0");
		tcash.setBounds(300,385,100,25);
		add(tcash);

		lsubT = new JLabel("Sub Total ");
		lsubT.setBounds(440,360,100,50);
		add(lsubT);

		tsubT = new JTextField();
		tsubT.setBounds(500,377,90,20);
		tsubT.setEditable(false);
		add(tsubT);	

		ltotal = new JLabel("Total ");
		ltotal.setBounds(440,390,100,50);
		add(ltotal);

		ttotal = new JTextField();
		ttotal.setBounds(500,407,90,20);
		ttotal.setEditable(false);
		add(ttotal);	

		JComboBox<String> Payment = new JComboBox<>(payMethod);
		Payment.setBounds(300,335,100,20);
		add(Payment);

		Reset = new JButton("Reset");
		Reset.setBounds(380,470,80,30);
		add(Reset);

		Exit = new JButton("Exit");
		Exit.setBounds(480,470,80,30);
		add(Exit);

		Total = new JButton("Total");
		Total.setBounds(280,470,80,30);
		add(Total);

		/* Reset Button Action */

              Reset.addActionListener(new ActionListener()
              {
                  public void actionPerformed(ActionEvent e)
                  {              
                      t1.setText("0");
                      t2.setText("0");
                      t3.setText("0");
                      t4.setText("0");
                      t5.setText("0");
                      t6.setText("0");
                      t7.setText("0");
                      t8.setText("0");
                      t9.setText("0");
                      t10.setText("0");
                      t11.setText("0");
                      t12.setText("0");
                      t13.setText("0");
                      t14.setText("0");
                      t15.setText("0");
                      t16.setText("0");
                      t17.setText("0");
                      t18.setText("0");
                      t19.setText("0");
                      t20.setText("0");
                      t21.setText("0");
		      tcash.setText("0");
		      tsubT.setText(null);
		      ttotal.setText(null);
		      tchange.setText(null);
		      ttax.setText(null);		

		      c1.setSelected(false);
		      c2.setSelected(false);
		      c3.setSelected(false);
		      c4.setSelected(false);
		      c5.setSelected(false);
		      c6.setSelected(false);
		      c7.setSelected(false);
		      c8.setSelected(false);
		      c9.setSelected(false);
		      c10.setSelected(false);
		      c11.setSelected(false);
		      c12.setSelected(false);
		      c13.setSelected(false);
		      c14.setSelected(false);
		      c15.setSelected(false);
		      c16.setSelected(false);
		      c17.setSelected(false);
		      c18.setSelected(false);
		      c19.setSelected(false);
		      c20.setSelected(false);
		      c21.setSelected(false);	

		      t1.setEnabled(false);	
		      t2.setEnabled(false);
		      t3.setEnabled(false);
		      t4.setEnabled(false);
		      t5.setEnabled(false);
		      t6.setEnabled(false);
		      t7.setEnabled(false);
		      t8.setEnabled(false);
		      t9.setEnabled(false);
		      t10.setEnabled(false);
		      t11.setEnabled(false);
		      t12.setEnabled(false);
		      t13.setEnabled(false);
		      t14.setEnabled(false);
		      t15.setEnabled(false);
		      t16.setEnabled(false);
		      t17.setEnabled(false);
		      t18.setEnabled(false);
		      t19.setEnabled(false);
		      t20.setEnabled(false);
		      t21.setEnabled(false);
		
                  }
              });

		/* Exit Button Action */
		
              Exit.addActionListener(new ActionListener()
              {
                  public void actionPerformed(ActionEvent e)
                  {
			frame = new JFrame("Exit");              
                      if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit","Food Order System",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
			{
				System.exit(0);
			}
                  }
              });

		/* Grouping Check box and Text box*/

              c1.addActionListener(new ActionListener()
              {
                  public void actionPerformed(ActionEvent e)
                  {             
                     if(c1.isSelected())
		     {
			t1.setEnabled(true);
			t1.setText(" ");
		     }	
		     
		     else
		     {
			t1.setEnabled(false);
			t1.setText("0");
                     }
                  }
              });

              c2.addActionListener(new ActionListener()
              {
                  public void actionPerformed(ActionEvent e)
                  {             
                     if(c2.isSelected())
		     {
			t2.setEnabled(true);
			t2.setText(" ");
		     }	
		     
		     else
		     {
			t2.setEnabled(false);
			t2.setText("0");
                     }
                  }
              });

              c3.addActionListener(new ActionListener()
              {
                  public void actionPerformed(ActionEvent e)
                  {             
                     if(c3.isSelected())
		     {
			t3.setEnabled(true);
			t3.setText(" ");
		     }	
		     
		     else
		     {
			t3.setEnabled(false);
			t3.setText("0");
                     }
                  }
              });

              c4.addActionListener(new ActionListener()
              {
                  public void actionPerformed(ActionEvent e)
                  {             
                     if(c4.isSelected())
		     {
			t4.setEnabled(true);
			t4.setText(" ");
		     }	
		     
		     else
		     {
			t4.setEnabled(false);
			t4.setText("0");
                     }
                  }
              });

              c5.addActionListener(new ActionListener()
              {
                  public void actionPerformed(ActionEvent e)
                  {             
                     if(c5.isSelected())
		     {
			t5.setEnabled(true);
			t5.setText(" ");
		     }	
		     
		     else
		     {
			t5.setEnabled(false);
			t5.setText("0");
                     }
                  }
              });

              c6.addActionListener(new ActionListener()
              {
                  public void actionPerformed(ActionEvent e)
                  {             
                     if(c6.isSelected())
		     {
			t6.setEnabled(true);
			t6.setText(" ");
		     }	
		     
		     else
		     {
			t6.setEnabled(false);
			t6.setText("0");
                     }
                  }
              });

              c7.addActionListener(new ActionListener()
              {
                  public void actionPerformed(ActionEvent e)
                  {             
                     if(c7.isSelected())
		     {
			t7.setEnabled(true);
			t7.setText(" ");
		     }	
		     
		     else
		     {
			t7.setEnabled(false);
			t7.setText("0");
                     }
                  }
              });

              c8.addActionListener(new ActionListener()
              {
                  public void actionPerformed(ActionEvent e)
                  {             
                     if(c8.isSelected())
		     {
			t8.setEnabled(true);
			t8.setText(" ");
		     }	
		     
		     else
		     {
			t8.setEnabled(false);
			t8.setText("0");
                     }
                  }
              });

              c9.addActionListener(new ActionListener()
              {
                  public void actionPerformed(ActionEvent e)
                  {             
                     if(c9.isSelected())
		     {
			t9.setEnabled(true);
			t9.setText(" ");
		     }	
		     
		     else
		     {
			t9.setEnabled(false);
			t9.setText("0");
                     }
                  }
              });

              c10.addActionListener(new ActionListener()
              {
                  public void actionPerformed(ActionEvent e)
                  {             
                     if(c10.isSelected())
		     {
			t10.setEnabled(true);
			t10.setText(" ");
		     }	
		     
		     else
		     {
			t10.setEnabled(false);
			t10.setText("0");
                     }
                  }
              });

              c11.addActionListener(new ActionListener()
              {
                  public void actionPerformed(ActionEvent e)
                  {             
                     if(c11.isSelected())
		     {
			t11.setEnabled(true);
			t11.setText(" ");
		     }	
		     
		     else
		     {
			t11.setEnabled(false);
			t11.setText("0");
                     }
                  }
              });

              c12.addActionListener(new ActionListener()
              {
                  public void actionPerformed(ActionEvent e)
                  {             
                     if(c12.isSelected())
		     {
			t12.setEnabled(true);
			t12.setText(" ");
		     }	
		     
		     else
		     {
			t12.setEnabled(false);
			t12.setText("0");
                     }
                  }
              });

              c13.addActionListener(new ActionListener()
              {
                  public void actionPerformed(ActionEvent e)
                  {             
                     if(c13.isSelected())
		     {
			t13.setEnabled(true);
			t13.setText(" ");
		     }	
		     
		     else
		     {
			t13.setEnabled(false);
			t13.setText("0");
                     }
                  }
              });

              c14.addActionListener(new ActionListener()
              {
                  public void actionPerformed(ActionEvent e)
                  {             
                     if(c14.isSelected())
		     {
			t14.setEnabled(true);
			t14.setText(" ");
		     }	
		     
		     else
		     {
			t14.setEnabled(false);
			t14.setText("0");
                     }
                  }
              });

              c15.addActionListener(new ActionListener()
              {
                  public void actionPerformed(ActionEvent e)
                  {             
                     if(c15.isSelected())
		     {
			t15.setEnabled(true);
			t15.setText(" ");
		     }	
		     
		     else
		     {
			t15.setEnabled(false);
			t15.setText("0");
                     }
                  }
              });

              c16.addActionListener(new ActionListener()
              {
                  public void actionPerformed(ActionEvent e)
                  {             
                     if(c16.isSelected())
		     {
			t16.setEnabled(true);
			t16.setText(" ");
		     }	
		     
		     else
		     {
			t16.setEnabled(false);
			t16.setText("0");
                     }
                  }
              });

              c17.addActionListener(new ActionListener()
              {
                  public void actionPerformed(ActionEvent e)
                  {             
                     if(c17.isSelected())
		     {
			t17.setEnabled(true);
			t17.setText(" ");
		     }	
		     
		     else
		     {
			t17.setEnabled(false);
			t17.setText("0");
                     }
                  }
              });

              c18.addActionListener(new ActionListener()
              {
                  public void actionPerformed(ActionEvent e)
                  {             
                     if(c18.isSelected())
		     {
			t18.setEnabled(true);
			t18.setText(" ");
		     }	
		     
		     else
		     {
			t18.setEnabled(false);
			t18.setText("0");
                     }
                  }
              });

              c19.addActionListener(new ActionListener()
              {
                  public void actionPerformed(ActionEvent e)
                  {             
                     if(c19.isSelected())
		     {
			t19.setEnabled(true);
			t19.setText(" ");
		     }	
		     
		     else
		     {
			t19.setEnabled(false);
			t19.setText("0");
                     }
                  }
              });

              c20.addActionListener(new ActionListener()
              {
                  public void actionPerformed(ActionEvent e)
                  {             
                     if(c20.isSelected())
		     {
			t20.setEnabled(true);
			t20.setText(" ");
		     }	
		     
		     else
		     {
			t20.setEnabled(false);
			t20.setText("0");
                     }
                  }
              });

              c21.addActionListener(new ActionListener()
              {
                  public void actionPerformed(ActionEvent e)
                  {             
                     if(c21.isSelected())
		     {
			t21.setEnabled(true);
			t21.setText(" ");
		     }	
		     
		     else
		     {
			t21.setEnabled(false);
			t21.setText("0");
                     }
                  }
              });

              Total.addActionListener(new ActionListener()
              {
                  public void actionPerformed(ActionEvent e)
                  {             
                     itemcost[0] = Double.parseDouble(t1.getText())*Price_VegSpringRoll;
                     itemcost[1] = Double.parseDouble(t2.getText())*Price_VegCrispy;
                     itemcost[2] = Double.parseDouble(t3.getText())*Price_MushroomTikka;
                     itemcost[3] = Double.parseDouble(t4.getText())*Price_PaneerReshmiKabab;
                     itemcost[4] = Double.parseDouble(t5.getText())*Price_ChickenSalad;
                     itemcost[5] = Double.parseDouble(t6.getText())*Price_Tandoori_Roti;
                     itemcost[6] = Double.parseDouble(t7.getText())*Price_Butter_Naan;
                     itemcost[7] = Double.parseDouble(t8.getText())*Price_Paratha;
                     itemcost[8] = Double.parseDouble(t9.getText())*Price_WickedChoco;
                     itemcost[9] = Double.parseDouble(t10.getText())*Price_Brownie;
                     itemcost[10] = Double.parseDouble(t11.getText())*Price_PineappleStick;
                     itemcost[11] = Double.parseDouble(t12.getText())*Price_ChocolateMuffin;
                     itemcost[12] = Double.parseDouble(t13.getText())*Price_PancakeSyrup;
                     itemcost[13] = Double.parseDouble(t14.getText())*Price_Tea;
                     itemcost[14] = Double.parseDouble(t15.getText())*Price_Cola;
                     itemcost[15] = Double.parseDouble(t16.getText())*Price_Coffee;
                     itemcost[16] = Double.parseDouble(t17.getText())*Price_OrangeJuice;
                     itemcost[17] = Double.parseDouble(t18.getText())*Price_BottleWater;
                     itemcost[18] = Double.parseDouble(t19.getText())*Price_VegKadai;
                     itemcost[19] = Double.parseDouble(t20.getText())*Price_ButterChicken;
                     itemcost[20] = Double.parseDouble(t21.getText())*Price_ShahiPaneer;

		iChange = Double.parseDouble(tcash.getText());   

		iSubTotal = itemcost[0]	+ itemcost[1] +	itemcost[2] + itemcost[3] + itemcost[4] +
			    itemcost[5] + itemcost[6] + itemcost[7] + itemcost[8] + itemcost[9] +
			    itemcost[10] + itemcost[11] + itemcost[12] + itemcost[13] + itemcost[14] +
			    itemcost[15] + itemcost[16] + itemcost[17] + itemcost[18] + itemcost[19] +
			    itemcost[20] ;

		iTax = (iSubTotal * Tax_Rate)/100;

		iTotal = (iSubTotal + iTax);

		String Pay = (String)Payment.getSelectedItem();

	if(Pay == "Cash")
	     {
					
		if(iChange >= iTotal)
		{
		iTax = (iSubTotal * Tax_Rate)/100;
		String cTax = String.format("%.2f",iTax);
		ttax.setText(cTax);

		String iAmount = String.format("%.2f",iSubTotal);
		tsubT.setText(iAmount);

		iTotal = (iSubTotal + iTax);
		String cTotal = String.format("%.2f",iTotal);
		ttotal.setText(cTotal);

		String cChange = String.format("%.2f",iChange-(iSubTotal+iTax));
		tchange.setText(cChange);
		}

	else
	    {
		JOptionPane.showMessageDialog(null,"Enter Enough Cash","Food Order System",JOptionPane.OK_OPTION);
	    }
	     }  

	else 
	    {
		iTax = (iSubTotal * Tax_Rate)/100;
		String cTax = String.format("%.2f",iTax);
		ttax.setText(cTax);

		String iAmount = String.format("%.2f",iSubTotal);
		tsubT.setText(iAmount);

		iTotal = (iSubTotal + iTax);
		String cTotal = String.format("%.2f",iTotal);
		ttotal.setText(cTotal);
	    }	


         	 }
              });

	
              setVisible(true);
         }
    }
 
   public class Order
   {
       public static void main(String [] args)
       {   
           new MyFrame();   
       }
   }
