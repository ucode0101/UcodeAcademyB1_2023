package day_33_static_and_static_block;

public class OfferObjects {
    public static void main(String[] args) {

        Offer myOffer = new Offer();
        myOffer.setInfo("Chicago","Apple",160000.00, true);
        System.out.println(myOffer);

        Offer myOffer2 = new Offer();
        myOffer2.setInfo("Jersey City","JP Morgan",155000, false);
        System.out.println(myOffer2);

        System.out.println(myOffer.salary);

        System.out.println("====================");

        System.out.println(myOffer.location);
        System.out.println(myOffer2.location);

    }
}
