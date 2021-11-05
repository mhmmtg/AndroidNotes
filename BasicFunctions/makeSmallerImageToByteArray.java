import android.graphics.Bitmap;
import android.graphics.ImageDecoder;

public Bitmap makeSmallerImage(Bitmap image, int maxSize){
        int width = image.getWidth();
        int height = image.getHeight();

        float scale = 0;
        if(width>height){
            scale = (float) width/maxSize;
        } else {
            scale = (float) height/maxSize;
        }
        int defWidth = (int) (width/scale);
        int defHeight = (int) (height/scale);

        return image.createScaledBitmap(image, defWidth, defHeight, true);
    }

        Bitmap smallerImage = makeSmallerImage(selectedImage, 300);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        smallerImage.compress(Bitmap.CompressFormat.JPEG, 90, outputStream);
        byte[] byteArray = outputStream.toByteArray();
