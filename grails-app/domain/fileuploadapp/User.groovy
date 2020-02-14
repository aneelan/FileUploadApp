package fileuploadapp

class User {

    int userId

    float coin
    String userName

    static constraints = {
        userName maxSize: 255
    }
}
