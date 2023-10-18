package dio.springiocdibeansautowired.app;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConversorJSON {
    @Autowired
    private Gson gson;

    public ViaCepResponce converter(String json) {
        ViaCepResponce responce = gson.fromJson(json,ViaCepResponce.class);
        return responce;
    }
}
