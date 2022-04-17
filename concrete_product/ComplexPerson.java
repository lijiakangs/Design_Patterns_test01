package creational.abstract_factory.experiment.concrete_product;


import creational.factory_method.experiment.product.Complex;

/**
 * @author LJK
 * @date 2022/4/15 - 10:59
 */
public class ComplexPerson implements Complex {
    @Override
    public void playComplex() {
        System.out.println("欢迎进入与人类对战，您选择的是复杂操作模式。");
        System.out.println("================================================");
        System.out.println("开始游戏！");
    }
}
