package com.carsxe.api;

public class CarsXEInputTypes {
    // Input for VIN-based endpoints
    public static class VinInput {
        public String vin;

        public VinInput(String vin) {
            this.vin = vin;
        }
    }

    public static class SpecsInput {
        public String vin;
        public String deepdata;
        public String disableIntVINDecoding;

        public SpecsInput(String vin, String deepdata, String disableIntVINDecoding) {
            this.vin = vin;
            this.deepdata = deepdata;
            this.disableIntVINDecoding = disableIntVINDecoding;
        }
    }

    // Input for Plate Decoder
    public static class PlateDecoderParams {
        public String plate;
        public String country;
        public String state;
        public String district;

        public PlateDecoderParams(String plate, String country, String state, String district) {
            this.plate = plate;
            this.country = country;
            this.state = state;
            this.district = district;
        }
    }

    // Input for Vehicle Image Lookup
    public static class ImageInput {
        public String make;
        public String model;
        public String year;
        public String trim;
        public String color;
        public boolean transparent;
        public String angle; // 'front', 'side', 'back'
        public String photoType; // 'interior', 'exterior', 'engine'
        public String size; // 'Small', 'Medium', 'Large', 'Wallpaper', 'All'
        public String license; // 'Public', 'Share', 'ShareCommercially', 'Modify', 'ModifyCommercially'

        public ImageInput(String make, String model, String year, String trim, String color, boolean transparent, String angle, String photoType, String size, String license) {
            this.make = make;
            this.model = model;
            this.year = year;
            this.trim = trim;
            this.color = color;
            this.transparent = transparent;
            this.angle = angle;
            this.photoType = photoType;
            this.size = size;
            this.license = license;
        }
    }

    // Input for OBD Code Decoder
    public static class ObdcodesdecoderInput {
        public String code;

        public ObdcodesdecoderInput(String code) {
            this.code = code;
        }
    }

    // Input for Plate Image Recognition
    public static class PlateImageRecognitionInput {
        public String imageUrl;

        public PlateImageRecognitionInput(String imageUrl) {
            this.imageUrl = imageUrl;
        }
    }

    // Input for VIN OCR from Image
    public static class VinOcrInput {
        public String imageUrl;

        public VinOcrInput(String imageUrl) {
            this.imageUrl = imageUrl;
        }
    }

    // Input for Year/Make/Model Search
    public static class YearMakeModelInput {
        public String year;
        public String make;
        public String model;
        public String trim;

        public YearMakeModelInput(String year, String make, String model, String trim) {
            this.year = year;
            this.make = make;
            this.model = model;
            this.trim = trim;
        }
    }
}