package sample.designpattern.builder;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import javax.swing.plaf.basic.BasicButtonUI;

public class LunchOrderBeanDemo {
    public static void main(String args[]){
       /* LunchOrderBean lunchOrderBean = new LunchOrderBean();

        lunchOrderBean.setBread("Wheat");
        lunchOrderBean.setCondiments("Lettuce");
        lunchOrderBean.setDressing("Mustard");
        lunchOrderBean.setMeat("Ham");

        System.out.println(lunchOrderBean.getBread());
        System.out.println(lunchOrderBean.getCondiments());
        System.out.println(lunchOrderBean.getDressing());
        System.out.println(lunchOrderBean.getMeat());*/

       LunchOrder.Builder builder = new LunchOrder.Builder();

       builder.bread("Wheat").condiments("Lettuce").dressing("Mustard").meat("Ham");

       LunchOrder lunchOrder = builder.build();

        System.out.println(lunchOrder.getBread());
        System.out.println(lunchOrder.getCondiments());
        System.out.println(lunchOrder.getDressing());
        System.out.println(lunchOrder.getMeat());
    }
}
