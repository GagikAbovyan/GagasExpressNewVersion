package vtc.room.a101.gagasexpressnewversion.provider;

import java.util.ArrayList;
import java.util.List;

import vtc.room.a101.gagasexpressnewversion.R;
import vtc.room.a101.gagasexpressnewversion.constant.Constant;
import vtc.room.a101.gagasexpressnewversion.module.Product;

public class DataProvider {

    private static List<Product> list = new ArrayList<>();

    public static List<Product> getList() {
        return list;
    }

    public static void initData() {
        int[] appleWatch3Image = {R.drawable.apple_watch_3, R.drawable.apple_watch_3, R.drawable.apple_watch_3, R.drawable.apple_watch_3};
        Product appleWatch3 = new Product(Constant.APPLE_WATCH_3, Constant.APPLE_WATCH_3_DESCR,
                Constant.CATEGORY_WATCH, 140, appleWatch3Image);
        appleWatch3.setVideoUrl("https://storage.media.ext.hp.com/homepage/elitebook800-ambient.mp4");
        appleWatch3.setAllDescription("");
        list.add(appleWatch3);

        int[] appleWatch4Image = {R.drawable.apple_watch_4, R.drawable.apple_watch_4, R.drawable.apple_watch_4, R.drawable.apple_watch_4,};
        Product appleWatch4 = new Product(Constant.APPLE_WATCH_4, Constant.APPLE_WATCH_4_DESCR,
                Constant.CATEGORY_WATCH, 500, appleWatch4Image);
        list.add(appleWatch4);

        int[] samsungGearS3Image = {R.drawable.samsung_gear_s3, R.drawable.samsung_gear_s3, R.drawable.samsung_gear_s3, R.drawable.samsung_gear_s3};
        Product samsungGearS3 = new Product(Constant.SAMSUNG_GEAR_S3, Constant.SAMSUNG_GEAR_S3_DESCR,
                Constant.CATEGORY_WATCH, 300, samsungGearS3Image);
        list.add(samsungGearS3);

        int[] samsungGearS4Image = {R.drawable.samsung_gear_s4, R.drawable.samsung_gear_s4, R.drawable.samsung_gear_s4, R.drawable.samsung_gear_s4};
        Product samsungGearS4 = new Product(Constant.SAMSUNG_GEAR_S4, Constant.SAMSUNG_GEAR_S4_DESCR,
                Constant.CATEGORY_WATCH, 500, samsungGearS4Image);
        list.add(samsungGearS4);

        int[] lenovoU8Image = {R.drawable.lenovo_u8, R.drawable.lenovo_u8, R.drawable.lenovo_u8, R.drawable.lenovo_u8};
        Product lenovoU8 = new Product(Constant.LENOVO_U8, Constant.LENOVO_U8_DESCR,
                Constant.CATEGORY_WATCH, 500, lenovoU8Image);
        list.add(lenovoU8);

        int[] iphone5Image = {R.drawable.iphone_5, R.drawable.iphone_5, R.drawable.iphone_5, R.drawable.iphone_5};
        Product iphone5 = new Product(Constant.IPHONE_5, Constant.IPHONE_5_DESCR,
                Constant.CATEGORY_SMART_PHONE, 700, iphone5Image);
        list.add(iphone5);

        int[] honor9Image = {R.drawable.honor_9, R.drawable.honor_9, R.drawable.honor_9, R.drawable.honor_9};
        Product honor9 = new Product(Constant.HONOR_9, Constant.HONOR_9_DESCR,
                Constant.CATEGORY_SMART_PHONE, 456, honor9Image);
        list.add(honor9);

        int[] samsungGalaxyS8Image = {R.drawable.samsung_galaxy_s8, R.drawable.samsung_galaxy_s8, R.drawable.samsung_galaxy_s8, R.drawable.samsung_galaxy_s8};
        Product samsungGalaxyS8 = new Product(Constant.SAMSUNG_GALAXY_S8, Constant.SAMSUNG_GALAXY_S8_DESCR,
                Constant.CATEGORY_SMART_PHONE, 578, samsungGalaxyS8Image);
        list.add(samsungGalaxyS8);

        int[] meizuM6SImage = {R.drawable.meizu_m6s, R.drawable.meizu_m6s, R.drawable.meizu_m6s, R.drawable.meizu_m6s};
        Product meizuM6S = new Product(Constant.MEIZU_M6S, Constant.MEIZU_M6S_DESCR,
                Constant.CATEGORY_SMART_PHONE, 500, meizuM6SImage);
        list.add(meizuM6S);

        int[] samsung7SpinImage = {R.drawable.samsung_7_spin, R.drawable.samsung_7_spin, R.drawable.samsung_7_spin, R.drawable.samsung_7_spin};
        Product samsung7Spin = new Product(Constant.SAMSUNG_7_SPIN, Constant.SAMSUNG_7_SPIN_DESCR,
                Constant.CATEGORY_NOTEBOOK, 1500, samsung7SpinImage);
        list.add(samsung7Spin);

        int[] lenovoUltrabookImage = {R.drawable.lenovo_ultrabook, R.drawable.lenovo_ultrabook, R.drawable.lenovo_ultrabook, R.drawable.lenovo_ultrabook};
        Product lenovoUltrabook = new Product(Constant.LENOVO_ULTRABOOK, Constant.LENOVO_ULTRABOOK_DESCR,
                Constant.CATEGORY_NOTEBOOK, 2500, lenovoUltrabookImage);
        list.add(lenovoUltrabook);

        int[] macbookPro13Image = {R.drawable.macbook_pro_13, R.drawable.macbook_pro_13, R.drawable.macbook_pro_13, R.drawable.macbook_pro_13};
        Product macbookPro13 = new Product(Constant.MACBOOK_PRO_13, Constant.MACBOOK_PRO_13_DESCR,
                Constant.CATEGORY_NOTEBOOK, 5500, macbookPro13Image);
        list.add(macbookPro13);

        int[] asusZenbookImage = {R.drawable.asus_zenbook, R.drawable.asus_zenbook, R.drawable.asus_zenbook, R.drawable.asus_zenbook};
        Product asusZenbook = new Product(Constant.ASUS_ZENBOOK, Constant.ASUS_ZENBOOK_DESCR,
                Constant.CATEGORY_NOTEBOOK, 3500, asusZenbookImage);
        list.add(asusZenbook);
    }

    public static List<Product> updateList(final String category) {
        final List<Product> listForReturn = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCategory().equals(category)) {
                listForReturn.add(list.get(i));
            }
        }
        return listForReturn;
    }

    public static List<Product> returnFavorites() {
        final List<Product> listForReturn = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).isFavorite()) {
                listForReturn.add(list.get(i));
            }
        }
        return listForReturn;
    }

    public static List<Product> returnStores() {
        final List<Product> listForReturn = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).isStore()) {
                listForReturn.add(list.get(i));
            }
        }
        return listForReturn;
    }

}
