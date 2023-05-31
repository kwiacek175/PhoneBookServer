/*
 *  Program: Operacje na obiekcie klasy PhoneBook
 *     Plik: PhoneBook.java
 *           -definicja publicznej klasy PhoneBook
 *
 *    Autor: Kacper Wiącek 259378
 *     Data: styczeń 2023r.
 */

import java.io.*;
import java.util.concurrent.ConcurrentHashMap;
public class PhoneBook {
    private ConcurrentHashMap<String, String> phoneBook;

    public PhoneBook() {
        phoneBook = new ConcurrentHashMap<String, String>();
    }

    public String LOAD(String file_name) {
        try (BufferedReader reader = new BufferedReader(new FileReader(new File(file_name)))){
            String line;
            String txt[];
            while((line = reader.readLine())!=null) {
                txt = line.split(" ");
                phoneBook.put(txt[0], txt[1]);
            }
                return "OK";
        } catch (FileNotFoundException e) {
            return "ERROR File " + file_name + " not found";
        } catch (IOException e) {
            return "ERROR reading data from file " + file_name;
        }
    }

    public String SAVE(String file_name) {
        try (PrintWriter writer = new PrintWriter(file_name)){
            for(String name : phoneBook.keySet()) {
                String number = phoneBook.get(name);
                writer.println(name + " " + number);
            }
            return "OK";
        } catch (FileNotFoundException e) {
            return "ERROR File " + file_name + " not found";
        }
    }

    public String GET(String name) {
        if (phoneBook.containsKey(name)) {
            return "OK " + phoneBook.get(name);
        } else {
            return "ERROR Contact not found";
        }
    }

    public String PUT(String name, String number) {
        phoneBook.put(name, number);
        return "OK";
    }

    public String REPLACE(String name, String number) {
        if (phoneBook.containsKey(name)) {
            phoneBook.replace(name, number);
            return "OK";
        } else {
            return "ERROR Contact not found";
        }
    }

    public String DELETE(String name) {
        if (phoneBook.containsKey(name)) {
                phoneBook.remove(name);
                return "OK";
            } else {
                return "ERROR Contact not found";
            }
    }

    public String LIST() {
        if(phoneBook.keySet().isEmpty()) return "No elements in the collection";
        StringBuilder sb = new StringBuilder("OK ");
        for (String name : phoneBook.keySet()) {
            sb.append(name + " ");
        }
        return sb.toString();
    }
}
