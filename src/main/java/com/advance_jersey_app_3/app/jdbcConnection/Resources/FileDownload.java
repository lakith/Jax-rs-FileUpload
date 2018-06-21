package com.advance_jersey_app_3.app.jdbcConnection.Resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.io.File;

@Path("download")
public class FileDownload {

    @Path("file/{upload}")
    @GET
    @Produces({"application/pdf","text/plain","image/jpeg","application/xml","application/vnd.ms-excel"})
    public Response getFile(@PathParam("upload") String name)
    {

        File download = new File("c:/temp/"+name);
        Response.ResponseBuilder response = Response.ok((Object)download);
        response.header("Content-Disposition", "attachment; filename="+name);
        return response.build();
    }

}
