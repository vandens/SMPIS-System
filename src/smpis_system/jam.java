/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package smpis_system;

/**
 *
 * @author vandens
 */
//package javaapplication;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class jam {

  
    public static void main(String[] args) {
       JFrame jd = new JFrame("Contoh JAm Digital");
       final JLabel tampil_jam=new JLabel();
       tampil_jam.setFont(new Font("Dialog",1,30));
       //actionlistener untuk keperluan timer
       ActionListener jam = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                    String nol_jam = "";
                    String nol_menit="";
                    String nol_detik="";
                    //membuat Date
                    Date dt = new Date();
                    //Mengambil Nilai Jam Menit
                    //Dan Detik Sekarang
                    int nilai_jam = dt.getHours();
                    int nilai_menit= dt.getMinutes();
                    int nilai_detik= dt.getSeconds();
                    //jika nilai jam lebih kecil dari 10
                    //hanya 1 digit
                    if (nilai_jam <=9)
                    {
                        //tambahkan "0"di depannya
                        nol_jam="0";
                    }
                    //jika nilai menit lebih kecil dari 10(hanya 1 digit)
                    if(nilai_menit <=9)

                    {
                        //tambahkan 0 did epan
                        nol_menit = "0";
                    }
                    //jika nilai detik lebih kecil dari 10
                    if (nilai_detik <=9)
                    {
                        //tambahkan nol di depan
                        nol_detik="0";
                    }
                    //membuat string hour,minute,second
                    String hour = nol_jam + Integer.toString(nilai_jam);
                    String minute=nol_menit + Integer.toString(nilai_menit);
                    String second= nol_detik + Integer.toString(nilai_detik);
                     //menampilkan pada layar
                    tampil_jam.setText(hour + ":" + minute + ":" + second );
                 }
       };
        //timer bergerak tiap 1 detik
       new Timer(1000, jam).start();
       Container konten =jd.getContentPane();
       jd.getContentPane().setLayout(new FlowLayout());
       jd.getContentPane().add(tampil_jam);
       jd.setSize(300,90);
       jd.setVisible(true);
            
            }
}
