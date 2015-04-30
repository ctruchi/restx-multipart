restx-multipart
=========
Simple restx-module to handle mime "multipart/form-data".
Currently handles only consuming (for file upload)

Example :

```java
import restx.annotations.Consumes;
import restx.annotations.POST;
import restx.annotations.RestxResource;
import restx.factory.Component;

import javax.servlet.http.Part;
import java.util.Collection;

@Component
@RestxResource
public class UploadResource {

    @POST("/upload")
    @Produces("multipart/form-data")
    public void upload(Collection<Part> parts) {
        System.out.printLn(parts);
    }
```
