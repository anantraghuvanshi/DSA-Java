package Strings;

//https://leetcode.com/problems/defanging-an-ip-address/
public class DefangingIpAddress {
    public static void main(String[] args) {

    }
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
