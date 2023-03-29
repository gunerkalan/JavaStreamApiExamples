package optional;

import java.util.Optional;

public class PhoneBookCrawler {

    private final PhoneBook phoneBook;

    public PhoneBookCrawler(PhoneBook phoneBook) {
        this.phoneBook = phoneBook;
    }

    public String findPhoneNumberByNameAndPunishIfNothingFound(String name){
        return phoneBook.findNameByPhoneNumber(name).orElseThrow(()-> new IllegalArgumentException("No Phone Number Found"));
    }

    public String findPhoneNumberByNameAndPrintPhoneBookIfNothingFound(String name){
        StringBuilder result = new StringBuilder();
        phoneBook.findNameByPhoneNumber(name)
                .ifPresentOrElse(result::append,
                        ()->System.out.println(phoneBook.getPhoneBookEntries()));
        return result.toString();
    }

    public String findPhoneNumberByNameOrNameByPhoneNumber(String name, String phoneNumber){
        return phoneBook.findPhoneNumberByName(name)
                .or(()->phoneBook.findNameByPhoneNumber(phoneNumber))
                .orElse(phoneBook.findPhoneNumberByName("Jos de Vos").orElse(null));
    }

    public PhoneBook getPhoneBook(){
        return phoneBook;
    }
}
