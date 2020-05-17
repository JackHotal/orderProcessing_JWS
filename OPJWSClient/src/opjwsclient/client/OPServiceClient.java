package opjwsclient.client;

import opjwsclient.service.OPServiceService;
import opjwsclient.service.OPService;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class OPServiceClient {

    public static void main(String [] args) {

        OPServiceService opss = new OPServiceService();
        OPService ops = opss.getOPServicePort();

        PrintStream cout = System.out;
        Scanner cin = new Scanner(System.in);


        List<String> aclist = ops.getProductIds();
        for (String s : aclist) {
            String p = ops.getProductDetail(s);
            cout.println(String.format("%s --> %s", s, p));
        }

        cout.println();
        cout.print("Enter P to purchase,  L to list customer orders , Q to quit > ");
        cout.flush();
        String input = cin.nextLine();
        boolean quit = false;
        ArrayList<String> ord = new ArrayList<String>();
        while (!quit) {
            int c = input.charAt(0);
            switch (c) {
                case 'p':
                case 'P':
                    cout.print("Enter Customer No: ");
                    cout.flush();
                    String cno = cin.nextLine();
                    while (true) {
                        cout.print("Enter Product No: ");
                        String pid = cin.nextLine();
                        cout.print("Enter Quantity: ");
                        cout.flush();
                        String q = cin.nextLine();
                        cout.print("Enter Price: ");
                        cout.flush();
                        String price = cin.nextLine();
                        String oline = String.format("%s,0,%s,%s",  pid, price, q); //the GUI had inserted the description so I am inserting 0 as a place holder
                        ord.add(oline);
                        cout.print("Enter N to add another product, P to finalize the purchase > ");
                        cout.flush();
                        String d = cin.nextLine();
                        if (d.toLowerCase().equals("p")) {
                            break;
                        }
                    }
                    int n = ops.purchase(cno, ord);
                    //Update(accno, amt);
                    cout.println(String.format("%d records got updated",n));
                    break;

                case 'L':
                case 'l':
                    cout.print("Enter Customer No: ");
                    cout.flush();
                    cno = cin.nextLine();
                    List<String> l = (List<String>) ops.getCustomerOrders(cno);
                    for (int i = 0; i < l.size(); i++) {
                        String oid = l.get(i);
                        List<String> od = ops.getOrderDetails(oid);
                        cout.println(String.format("OrderId: %s", oid));
                        for (String s : od) {
                            cout.println(s);
                        }
                    }

                    break;
                default:
                    quit = true;

            }

            if (!quit) {
                cout.print("Enter P to purchase,  L to list customer orders , Q to quit > ");
                cout.flush();
                input = cin.nextLine();
            }

        }



    }
}
