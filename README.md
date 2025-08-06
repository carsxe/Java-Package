# 🚗 CarsXE API Package 🚘

## ✨ Description
The CarsXE API Package is a 🖥️ Java library that simplifies access to the CarsXE API. It provides convenient methods for interacting with various endpoints, such as VIN decoding, plate recognition, vehicle specs retrieval, and more. This package is designed to make it easy for developers to integrate CarsXE functionality into their Java applications.

## 🌟 Features
- 🔍 VIN-based endpoints for vehicle information retrieval.
- 📋 Plate recognition and decoding.
- 🛠️ Vehicle specs lookup.
- 💰 Market value analysis.
- 🛑 OBD code decoding.
- 🚙 Year, make, and model search.
- 🖼️ Image-based recognition for license plates and VINs.

## 📦 Installation

### 📜 Using Maven
Add the following dependency to your `pom.xml`:
```xml
<dependency>
    <groupId>com.carsxe.api</groupId>
    <artifactId>carsxe-api-package</artifactId>
    <version>1.0.0</version>
</dependency>
```

### ⚙️ Using Gradle
Add the following to your `build.gradle`:
```gradle
implementation 'com.carsxe.api:carsxe-api-package:1.0.0'
```

## 🚀 Usage

### 🛠️ Initialize the API Client
To use the CarsXE API, initialize the `CarsXE` class with your API key:
```java
import com.carsxe.api.CarsXE;

public class Main {
    public static void main(String[] args) {
        CarsXE carsXE = new CarsXE("Your_API_Key");
    }
}
```

### 📋 Example: VIN Lookup
Retrieve vehicle specifications using a VIN:
```java
import com.carsxe.api.CarsXE;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        CarsXE carsXE = new CarsXE("Your_API_Key");
        try {
            Map<String, String> params = Map.of("vin", "WBAFR7C57CC811956");
            String response = carsXE.specs(params);
            System.out.println("🚗 Vehicle Specs: " + response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

### 🔍 Example: Plate Recognition
Decode license plate information:
```java
import com.carsxe.api.CarsXE;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        CarsXE carsXE = new CarsXE("Your_API_Key");
        try {
            Map<String, String> params = Map.of("plate", "7XER187", "state", "CA");
            String response = carsXE.platedecoder(params);
            System.out.println("📋 Plate Information: " + response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

### 💰 Example: Vehicle Market Value
Retrieve the market value of a vehicle using its VIN:
```java
import com.carsxe.api.CarsXE;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        CarsXE carsXE = new CarsXE("Your_API_Key");
        try {
            Map<String, String> params = Map.of("vin", "WBAFR7C57CC811956");
            String response = carsXE.marketvalue(params);
            System.out.println("💰 Market Value: " + response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

### 🛑 Example: OBD Code Decoder
Decode OBD-II diagnostic trouble codes:
```java
import com.carsxe.api.CarsXE;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        CarsXE carsXE = new CarsXE("Your_API_Key");
        try {
            Map<String, String> params = Map.of("code", "P0115");
            String response = carsXE.obdcodesdecoder(params);
            System.out.println("🛑 OBD Code Details: " + response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

### 🚙 Example: Year, Make, and Model Lookup
Search for vehicle details using year, make, and model:
```java
import com.carsxe.api.CarsXE;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        CarsXE carsXE = new CarsXE("Your_API_Key");
        try {
            Map<String, String> params = Map.of("year", "2016", "make", "FIAT", "model", "500");
            String response = carsXE.yearMakeModel(params);
            System.out.println("🚙 Vehicle Details: " + response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

### 🖼️ Example: VIN OCR
Extract VIN from an image:
```java
import com.carsxe.api.CarsXE;

public class Main {
    public static void main(String[] args) {
        CarsXE carsXE = new CarsXE("Your_API_Key");
        try {
            String imageUrl = "https://example.com/image-of-vin.png";
            String response = carsXE.vinOcr(imageUrl);
            System.out.println("🖼️ VIN from Image: " + response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

## 📜 License
This project is licensed under the [Apache License 2.0](https://www.apache.org/licenses/LICENSE-2.0.txt).

## 🤝 Support
If you encounter any issues or have questions, feel free to raise an issue in the [issue tracker](https://github.com/carsxe/Java-Package/issues).

Happy coding! 🚀
