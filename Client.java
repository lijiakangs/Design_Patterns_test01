package creational.abstract_factory.experiment;

import creational.abstract_factory.experiment.concrete_factory.ComputerFactory;
import creational.abstract_factory.experiment.concrete_factory.PersonFactory;
import creational.abstract_factory.experiment.concrete_product.ComplexComputer;
import creational.abstract_factory.experiment.factory.Factory;
import creational.factory_method.experiment.concrete_factory.CCFactory;
import creational.factory_method.experiment.concrete_factory.CPFactory;
import creational.factory_method.experiment.factory.ComplexFactory;
import creational.factory_method.experiment.factory.EasyFactory;
import creational.factory_method.experiment.product.Complex;
import creational.factory_method.experiment.product.Easy;

/**
 * @author LJK
 * @date 2022/4/15 - 11:03
 */
public class Client {
    public static void main(String[] args) {
        Factory a;
        Easy b;
        Complex c;

        //比如我想要选择与机对战的复杂模式，即选择对应创建"复杂与机对象"的工厂
        a = new ComputerFactory();
        //选择对应的复杂与机对战的玩游戏方法，即利用对应的工厂来创建对应的对象
        c = a.createComplex();
        c.playComplex();

        System.out.println("------------------------------------------");

        //比如我想要选择与人对战的复杂模式，即选择对应创建"复杂与人对象"的工厂
        a = new PersonFactory();
        //选择对应的复杂与人对战的玩游戏方法，即利用对应的工厂来创建对应的对象
        c = a.createComplex();
        c.playComplex();

        System.out.println("------------------------------------------");

        //比如我想要选择与人对战的简单模式，即选择对应创建"简单与机对象"的工厂
        a = new PersonFactory();
        //选择对应的简单与人对战的玩游戏方法，即利用对应的工厂来创建对应的对象
        b = a.createEasy();
        b.playEasy();

        System.out.println("------------------------------------------");

        //比如我想要选择与机对战的简单模式，即选择对应创建"简单与机对象"的工厂
        a = new ComputerFactory();
        //选择对应的简单与机对战的玩游戏方法，即利用对应的工厂来创建对应的对象
        b = a.createEasy();
        b.playEasy();
    }
}
