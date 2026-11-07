package org.moussaoui;

import composants.Boisson;
import composants.Espresso;
import composants.Sumatra;

import java.beans.Expression;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Boisson boisson;
        boisson =new Sumatra();
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        boisson= new Espresso();
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
    }
}