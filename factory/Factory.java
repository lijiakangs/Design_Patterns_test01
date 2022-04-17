package creational.abstract_factory.experiment.factory;

/** 接口，抽象工厂，声明了用于创建一族产品(简单模式产品、复杂模式产品)的方法 */

import creational.factory_method.experiment.product.Complex;
import creational.factory_method.experiment.product.Easy;

/**
 * @author LJK
 * @date 2022/4/15 - 11:47
 */
public interface Factory {
    /** (创建简单型对象) */
    public Easy createEasy();

    /** (创建复杂型对象) */
    public Complex createComplex();
}
