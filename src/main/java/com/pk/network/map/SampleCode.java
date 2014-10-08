package com.pk.network.map;

import java.awt.image.ImagingOpException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SampleCode{

    public static Result index() throws IOException {
        doCommand("74.125.236.73");
        //doCommand("hankooktireusa.com");
        return ok(index.render("Your new application is ready."));
    }
    public static void doCommand(String ipAddress) throws IOException {
        String s = null;
        List<String> commands = new ArrayList<String>();
        commands.add("ping");
        commands.add(ipAddress);
        ProcessBuilder pb = new ProcessBuilder(commands);
        Process process = pb.start();
        BufferedReader stdInput = new BufferedReader(new InputStreamReader(process.getInputStream()));
        BufferedReader stdError = new BufferedReader(new InputStreamReader(process.getErrorStream()));

        System.out.println("Here is the standard output of the command:\n");


        while ((s = stdInput.readLine()) != null)
        {
            if(s.contains("Sent = "))
            {
                int sent, received, lost;

                //Store Values to Database
                String results[] = s.split(",");
                sent = Integer.parseInt(results[0].substring(results[0].lastIndexOf("Sent = ") + 7));
                received = Integer.parseInt(results[1].substring(results[1].lastIndexOf("Received = ") + 11));
                lost = Integer.parseInt(results[2].substring(results[2].lastIndexOf("Lost = ") + 7, results[2].lastIndexOf("Lost = ") + 8));

            }
            if(s.contains("Minimum"))
            {
                String minimum, maximum, average;

                String results[] = s.split(",");

                System.out.println(s);
            }

           // System.out.println(s);
        }

        while((s = stdError.readLine()) != null)
        {
            System.out.println(s);
        }
    }

}