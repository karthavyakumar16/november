package com.neoteric.november.november.exception;

import java.io.IOException;

public class Throws {




        public static void main(String[] args) {
            try {
                checkFile();
            } catch (IOException e) {
                System.out.println("Exception handled: " + e);
            }
        }

        static void checkFile() throws IOException {
            throw new IOException("File  not found");
        }
    }


