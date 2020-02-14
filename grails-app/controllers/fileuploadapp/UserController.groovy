package fileuploadapp

import org.springframework.web.multipart.commons.CommonsMultipartFile

class UserController {

    def index() {
    }

    def upload() {
        def  uploadedFile = params.userFile
        def allLines = uploadedFile.inputStream.readLines()

        for(String userData in allLines){

            def (id, coin,name) = userData.tokenize( ',');

            println 'id:'+id+',cost:'+cost+',name:'+name
            User user= new User();
            user.userId = id;
            user.coin = coin;
            user.userName = name;
            user.save();
        }
        //println 'allLines:'+allLines;
        redirect(uri:'/', params: [message: "File Uploaded"])
    }
}
