// Read all data from 'log.txt'.
// Each line represents a log message from a web server
// Write a function that returns an array with the unique IP addresses.
// Write a function that returns the GET / POST request ratio.

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Logs {
    public static void main(String[] args) {

        returnIpAddresses("logs.txt");
        calculateGetPostRatio("logs.txt");
    }

    public static String[] returnIpAddresses(String fileName) {

        try {
            Path path = Paths.get(fileName);
            List<String> fileContent = Files.readAllLines(path);
            String[] IpAddresses = new String[fileContent.size()];
            int k = 0;
            for (String line : fileContent) {
                String[] temporaryArray = line.split("   ");
                IpAddresses[k] = temporaryArray[1];
                k++;
            }

            ArrayList<String> uniqueIpAddressesList = new ArrayList<>(Arrays.asList(IpAddresses[0]));

            for (int i = 0; i < IpAddresses.length; i++) {
                if (!uniqueIpAddressesList.contains(IpAddresses[i])) {
                    uniqueIpAddressesList.add(IpAddresses[i]);
                }
            }

            String[] uniqueIpAddressesArray = new String[uniqueIpAddressesList.size()];
            int i = 0;
            for (String IpAddress : uniqueIpAddressesList) {
                uniqueIpAddressesArray[i] = IpAddress;
                i++;
            }

            return uniqueIpAddressesArray;
        } catch (IOException e) {
            System.out.println("No such file, sorry!");
            String[] errorMessage = new String[]{"- 1"};
            return errorMessage;
        }
    }

    public static double calculateGetPostRatio(String fileName) {
        double getPostRatio = 0;
        try {
            Path path = Paths.get(fileName);
            List<String> fileContent = Files.readAllLines(path);
            double numberOfGetRequest = 0;
            double numberOfPostRequest = 0;
            for (String line : fileContent) {
                if (line.toLowerCase().contains("get")) {
                    numberOfGetRequest++;
                }
                if (line.toLowerCase().contains("post")) {
                    numberOfPostRequest++;
                }
            }
            getPostRatio = numberOfGetRequest / numberOfPostRequest;
            return getPostRatio;

        } catch (IOException e) {
            System.out.println("No such file, sorry!");
            return -1;
        }
    }
}

