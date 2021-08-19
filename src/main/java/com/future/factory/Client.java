package com.future.factory;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-16 17:51
 */
public class Client {

    private final Chair chair;

    private final Sofa sofa;

    private final Table table;

    public Client(AbsractFactory absractFactory) {
        this.chair = absractFactory.createChair();
        this.sofa = absractFactory.createSofa();
        this.table = absractFactory.createTable();
    }

    public static void main(String[] args) {
        final ChinaFactory chinaFactory = new ChinaFactory();
        final Client client = new Client(chinaFactory);
        System.out.println(client);
    }

    @Override
    public String toString() {
        return "Client{" +
                "chair=" + chair +
                ", sofa=" + sofa +
                ", table=" + table +
                '}';
    }
}
