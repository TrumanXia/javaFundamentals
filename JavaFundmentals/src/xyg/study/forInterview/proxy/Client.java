package xyg.study.forInterview.proxy;

public class Client
{
    public static void main(String[] args) {

        Person person = new Person();
        ProxyForPerson proxy = new ProxyForPerson();
        // ��ô�����
        IPerson iperson = proxy.getProxyInterface(person);

        iperson.say();
    }
}
