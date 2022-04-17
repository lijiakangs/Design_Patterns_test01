package creational.abstract_factory.experiment.concrete_product;

import creational.factory_method.experiment.product.Easy;

/**
 * @author LJK
 * @date 2022/4/15 - 10:59
 */
public class EasyComputer implements Easy {
    @Override
    public void playEasy() {
        System.out.println("欢迎进入与电脑对战，您选择的是简单操作模式。");
        System.out.println("================================================");
        System.out.println("开始游戏！");
    }
}
