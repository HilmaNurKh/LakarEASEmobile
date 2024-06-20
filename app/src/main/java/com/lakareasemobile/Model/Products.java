package com.lakareasemobile.Model;

public class Products {
    private String pname, description, price, image, category, pid, date, time;

    public Products()
    {

    }

    public Products(String pname, String description, String price, String image, String category, String pid, String date, String time) {
        this.pname = pname;
        this.description = description;
        this.price = price;
        this.image = image;
        this.category = category;
        this.pid = pid;
        this.date = date;
        this.time = time;
    }


    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public static void main(String[] args) {
        // Menambahkan produk baru menggunakan setter
        Products newProduct = new Products();
        newProduct.setPname("Lakar Pedas");
        newProduct.setDescription("Pedas membara");
        newProduct.setPrice("100000");
        newProduct.setImage("image.jpg");
        newProduct.setCategory("spicy");
        newProduct.setPid("12345");
        newProduct.setDate("2024-06-18");
        newProduct.setTime("12:00");

        System.out.println("Nama Produk: " + newProduct.getPname());
        System.out.println("Deskripsi: " + newProduct.getDescription());
        System.out.println("Harga: " + newProduct.getPrice());
        System.out.println("Gambar: " + newProduct.getImage());
        System.out.println("Kategori: " + newProduct.getCategory());
        System.out.println("PID: " + newProduct.getPid());
        System.out.println("Tanggal: " + newProduct.getDate());
        System.out.println("Waktu: " + newProduct.getTime());
    }
}


