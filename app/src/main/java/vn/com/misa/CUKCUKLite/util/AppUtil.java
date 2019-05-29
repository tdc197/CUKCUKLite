package vn.com.misa.CUKCUKLite.util;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;

/**
 *
 * @Create_by: trand
 * @Date: 5/28/2019
 */
public class AppUtil {

    /**
     * Hàm bo tròn ảnh
     * @Create_by: trand
     * @Date: 5/27/2019
     * @Param: String:color
     * @Return: GradientDrawable
     */
    public static GradientDrawable createCircleBackground(String color) {
        GradientDrawable backgroundCircle = null;
        try {
            // tạo background
            backgroundCircle = new GradientDrawable();
            backgroundCircle.setShape(GradientDrawable.OVAL);
            backgroundCircle.setColor(Color.parseColor(color));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return backgroundCircle;
    }
}