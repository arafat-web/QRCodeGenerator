/*
 * Name: QR Code Generator.
 * Author: Arafat Hossain Ar
 * Date: 1/05/2020
 * All right reserved. Don't copy single line of code without permission.
 */

package qrcodegenerator;

import java.io.*;
import java.util.Scanner;
import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

public class QRCodeGenerator {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        System.out.println("QR Code Generator\nVersion: 1.0\n------------------");
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Your Text: ");
        String details = in.nextLine();

        ByteArrayOutputStream out = QRCode.from(details).to(ImageType.JPG).stream();
        System.out.println("Enter Your File Name: ");
        String filename = in.nextLine();

        File f = new File("G:\\QR Code Generator\\" + filename + ".JPG");
        FileOutputStream fos = new FileOutputStream(f);
        System.out.println("----------------------");

        fos.write(out.toByteArray());
        fos.flush();
        System.out.println("Yout QR Code is Ready......");
    }

}
