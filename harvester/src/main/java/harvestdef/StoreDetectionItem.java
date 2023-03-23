package harvestdef;

public class StoreDetectionItem implements StoreDetection {


    private String name;
    private String url;
    private String description;
    private String image;
    private String galleryImages;
    private String brand;
    private String price;

    public StoreDetectionItem(String name, String url, String description, String image, String galleryImages, String brand, String price) {
        this.name = name;
        this.url = url;
        this.description = description;
        this.image = image;
        this.galleryImages = galleryImages;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getUrl() {
        return null;
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public String getImageUrl() {
        return null;
    }

    @Override
    public String getGalleryImages() {
        return null;
    }

    @Override
    public String getBrand() {
        return null;
    }

    @Override
    public String getPrice() {
        return null;
    }
}
