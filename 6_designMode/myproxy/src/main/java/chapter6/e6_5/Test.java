package chapter6.e6_5;

/**
 * Created with IntelliJ IDEA.
 * User: hanwei
 * Date: 14-8-25
 * Time: 下午5:12
 * To change this template use File | Settings | File Templates.
 */
public class Test {
    public static void main(String[] args) {
        Person xc = new Person("小菜");


        System.out.println("\n第一种装扮：");

        Finery dtx = new TShirts();
        Finery kk = new BigTrouser();
        Finery pqx = new Sneakers();

        dtx.decorate(xc);
        kk.decorate(dtx);
        pqx.decorate(kk);

        pqx.Show();

        System.out.println("\n第二种装扮：");

        Finery xz = new Suit();
        Finery ld = new Tie();
        Finery px = new LeatherShoes();

        xz.decorate(xc);
        ld.decorate(xz);
        px.decorate(ld);

        px.Show();
    }
}
