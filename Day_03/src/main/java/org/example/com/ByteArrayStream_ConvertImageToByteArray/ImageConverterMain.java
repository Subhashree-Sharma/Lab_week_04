package org.example.com.ByteArrayStream_ConvertImageToByteArray;
import java.io.File;
import java.io.IOException;

//main class
public class ImageConverterMain {
    public static void main(String[] args) {
        String inputImagePath = "C:\\Users\\ss587\\Downloads\\Capgemini_files2\\Week04\\Day_03\\src\\main\\java\\org\\example\\com\\ByteArrayStream_ConvertImageToByteArray\\thumbnail_150x150_10.5kb.jpg";
        String outputImagePath = "C:\\Users\\ss587\\Downloads\\Capgemini_files2\\Week04\\Day_03\\src\\main\\java\\org\\example\\com\\ByteArrayStream_ConvertImageToByteArray\\output.jpg";

        try {
            //convert image to byte array
            byte[] imageBytes = ImageConverter.imageToByteArray(inputImagePath);

            //convert byte array back to image
            ImageConverter.byteArrayToImage(imageBytes, outputImagePath);

            System.out.println("Image conversion successful -> Check output.jpg");

            //verify by checking file size
            verifyImages(inputImagePath, outputImagePath);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    //verify by comparing file sizes
    public static void verifyImages(String originalPath, String newPath) {
        File original = new File(originalPath);
        File newFile = new File(newPath);
        if (original.length() == newFile.length()) {
            System.out.println("Verification Passed-> Images are identical in size");
        } else {
            System.out.println("verification Failed-> Image sizes do not match");
        }
    }
}

