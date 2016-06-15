/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package smpis_sistem;

import java.util.*;

/**
 *
 * @author vandens
 */
public class test {
    public static void main(String[] args){
        List<String> list = new ArrayList<String>();
        list.add("Hello!");
        list.add("How are you?");
        
        for (String list1 : list) {
            System.out.println(list1);
        }
        
        String years = "2015/2016";
        System.out.println(years.substring(0,4));
        System.out.println(years.substring(5));
    }
}
