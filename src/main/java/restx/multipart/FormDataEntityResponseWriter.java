package restx.multipart;

import restx.RestxContext;
import restx.RestxRequest;
import restx.RestxResponse;
import restx.common.TypeReference;
import restx.entity.AbstractEntityResponseWriter;

import javax.servlet.http.Part;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;

public class FormDataEntityResponseWriter extends AbstractEntityResponseWriter<Collection<Part>> {


    protected FormDataEntityResponseWriter() {
        super(MultipartFormDataContentTypeModule.TYPE, "multipart/form-data");
    }

    @Override
    protected void write(Collection<Part> parts, RestxRequest req, RestxResponse resp, RestxContext ctx)
            throws IOException {
        throw new UnsupportedOperationException();        //TODO Handle download
    }
}
