package poly.app.core.helper;

import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
import poly.app.core.entities.NguoiDung;

public class ShareHelper {
    /**
     * Ảnh biểu tượng của ứng dụng, xuất hiện trên mọi cửa sổ
     */
    public static final Image APP_ICON;
    static{
        // Tải biểu tượng ứng dụng
        URL urlIconApp = ShareHelper.class.getResource("../../view/icon/icon-app.png");
        APP_ICON = new ImageIcon(urlIconApp).getImage();
    }
 
    /**
     * Đối tượng này chứa thông tin người sử dụng sau khi đăng nhập
     */
    public static NguoiDung USER = null;
    /**
     * Xóa thông tin của người sử dụng khi có yêu cầu đăng xuất
     */
    public static void logOut() {
        ShareHelper.USER = null;
    }
    /**
     * Kiểm tra xem đăng nhập hay chưa
     * @return đăng nhập hay chưa
     */
    public static boolean isAuthenticated() {
        return ShareHelper.USER != null;
    }
}