package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

/**
 * Created by Озеров on 10.06.2017.
 */
public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes types){
        if (types == ImageTypes.JPG)
            return new JpgReader();
        else if (types == ImageTypes.BMP)
            return new BmpReader();
        else if (types == ImageTypes.PNG)
            return new PngReader();
        else throw new IllegalArgumentException("Неизвестный тип картинки");
    }
}
