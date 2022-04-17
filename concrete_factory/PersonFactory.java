package creational.abstract_factory.experiment.concrete_factory;

import creational.abstract_factory.experiment.concrete_product.ComplexPerson;
import creational.abstract_factory.experiment.factory.Factory;
import creational.factory_method.experiment.concrete_product.EasyPerson;
import creational.factory_method.experiment.product.Complex;
import creational.factory_method.experiment.product.Easy;

/**
 * @author LJK
 * @date 2022/4/15 - 11:51
 */
public class PersonFactory implements Factory {
    @Override
    public Complex createComplex() {
        //创建与人对战，复杂模式的游戏对象
        Complex com = new ComplexPerson();
        //返回此对象
        return com;
    }

    @Override
    public Easy createEasy() {
        //创建与人对战，简单模式的游戏对象
        Easy people = new EasyPerson();
        //返回此对象
        return people;

    }
}
