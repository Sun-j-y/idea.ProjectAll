package om.sforits.LambdaEdu.FP_Java8.FP02Lambda表达式;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

/**
 * @Author：sforits
 * @E-mail：sforits@gmail.com
 * @Date：2020/10/5-13:00 Created by IntelliJ IDEA.
 */
public class FP01_FirstLambda {
    public static void main(String[] args) {
        // 使用匿名内部类将行为和按钮单击进行关联
        new JButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("button clicked");
            }
        });
        // 使用Lambda表达式
        new JButton().addActionListener(e -> System.out.println("button clicked"));

        /*
        编写Lambda表达式的不同形式
         */

        // Lambda 表达式不包含参数，使用空括号 () 表示没有参数。该 Lambda 表达式
        // 实现了 Runnable 接口，该接口也只有一个 run 方法，没有参数，且返回类型为 void。
        Runnable onArgument = () -> System.out.println("hello World");
        // 包含且只包含一个参数，可省略参数的括号
        ActionListener oneArgument = e -> System.out.println("button clicked");
        // Lambda 表达式的主体不仅可以是一个表达式，而且也可以是一段代码块，使用大括号 ({})将代码块括起来
        // 该代码块和普通方法遵循的规则别无二致，可以用返回或抛出异常来退出。
        // 只有一行代码的 Lambda 表达式也可使用大括号，用以明确 Lambda 表达式从何处开始、到哪里结束
        Runnable multiStatement = () -> {
            System.out.println("Hello");
            System.out.println(" World");
        };

        /*
        这行代码并不是将两个数字相加，而是创建了一个函数，用来计算
        两个数字相加的结果。变量 add 的类型是 BinaryOperator<Long>，它不是两个数字的和，
        而是将两个数字相加的那行代码
         */
        BinaryOperator<Long> add = (x, y) -> x + y;

        BinaryOperator<Long> addExplicit = (Long x, Long y) -> x + y;


        onArgument.run();


        /*
        Lambda 表达式的类型依赖于上下文环境，是由编译器推断出来的
         */
    }
}