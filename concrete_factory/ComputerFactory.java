package creational.abstract_factory.experiment.concrete_factory;

import creational.abstract_factory.experiment.factory.Factory;
import creational.factory_method.experiment.concrete_product.ComplexComputer;
import creational.factory_method.experiment.concrete_product.EasyComputer;
import creational.factory_method.experiment.product.Complex;
import creational.factory_method.experiment.product.Easy;

/**
 * @author LJK
 * @date 2022/4/15 - 11:57
 */
public class ComputerFactory implements Factory {
    @Override
    public Complex createComplex() {
        //创建与机对战，复杂模式的游戏对象
        Complex com = new ComplexComputer();
        //返回此对象
        return com;
    }

    @Override
    public Easy createEasy() {
        //创建与机对战，简单模式的游戏对象
        Easy com = new EasyComputer();
        //返回此对象
        return com;

    }
}
