package functions;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ImageHandle {

    public static BufferedInputStream convertImage(String filename) {
        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(new File(filename)));
            return bis;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ImageHandle.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static void setIcon(JFrame f, String filename) {
        try {
            //Image JFrame
            BufferedImage image = ImageIO.read(new File(filename));
            f.setIconImage(image);
        } catch (IOException ex) {
            Logger.getLogger(ImageHandle.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void setPicture(JLabel lb, String filename) {
        try {
            //Image Label
            BufferedImage image = ImageIO.read(new File(filename));
            int x = lb.getSize().width;
            int y = lb.getSize().height;
            int ix = image.getWidth();
            int iy = image.getHeight();
            int dx = 0;
            int dy = 0;
            if (x / y > ix / iy) {
                dy = y;
                dx = dy * ix / iy;
            } else {
                dx = x;
                dy = dx * iy / ix;
            }
            ImageIcon icon = new ImageIcon(image.getScaledInstance(dx, dy, Image.SCALE_SMOOTH));
            ImageIcon icon2 = new ImageIcon(filename);
            lb.setIcon(icon);
        } catch (IOException ex) {
            Logger.getLogger(ImageHandle.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void setPicture(JLabel lb, InputStream inputStream) {
        try {
            //Image Label
            BufferedImage image = ImageIO.read(inputStream);
            int x = lb.getSize().width;
            int y = lb.getSize().height;
            int ix = image.getWidth();
            int iy = image.getHeight();
            int dx = 0;
            int dy = 0;
            if (x / y > ix / iy) {
                dy = y;
                dx = dy * ix / iy;
            } else {
                dx = x;
                dy = dx * iy / ix;
            }
            ImageIcon icon = new ImageIcon(image.getScaledInstance(dx, dy, Image.SCALE_SMOOTH));
            lb.setIcon(icon);
        } catch (IOException ex) {
            Logger.getLogger(ImageHandle.class.getName()).log(Level.SEVERE, null, ex);
            return;
        }
    }
}
