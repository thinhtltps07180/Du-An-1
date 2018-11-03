package poly.app.core.helper;

import java.awt.Component;
import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class DialogHelper {

    private static URL urlIconInfo = DialogHelper.class.getResource("../../view/icon/info-success.png");
    private static URL urlIconError = DialogHelper.class.getResource("../../view/icon/info-error.png");

    public static final int INFORMATION_MESSAGE = 1;
    public static final int ERROR_MESSAGE = 0;

    public static void message(Component parent, String message, int messageType) {
        URL urlIcon = messageType == INFORMATION_MESSAGE ? urlIconInfo : urlIconError;
        JOptionPane.showMessageDialog(parent, message,
                "Thông báo", messageType, new ImageIcon(urlIcon));
    }

    public static boolean confirm(Component parent, String message) {
        int result = JOptionPane.showConfirmDialog(parent, message,
                "Thông báo",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, new ImageIcon(urlIconInfo));
        return result == JOptionPane.YES_OPTION;
    }

    public static String prompt(Component parent, String message) {
        return (String) JOptionPane.showInputDialog(parent, message,
                "Thông báo", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(urlIconInfo), null, null);
    }
}
