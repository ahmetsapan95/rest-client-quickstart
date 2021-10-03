package org.sqills.rest.client;

import io.netty.util.internal.StringUtil;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.sqills.rest.pojo.CaseRequest;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Arrays;
import java.util.List;

@Path("/v1")
@RegisterRestClient(configKey="case-api")
public class CaseRestService {

    @POST
    @Path("/parse-str")
    public String parseStr(CaseRequest req) throws Exception {
        if(req == null || StringUtil.isNullOrEmpty(req.getInputStr())){
            throw new Exception("Input string is not valid!");
        }
        List<String> delimitersList = Arrays.asList(req.getInputStr().trim().replaceAll(" +", " ").split(" "));
        String outputStep1 = prepareOutputText(delimitersList);
        delimitersList.replaceAll(delimiter ->
                delimiter.replaceAll("[^A-Za-z0-9]", "_")
        );
        String outputStep2 = prepareOutputText(delimitersList);
        delimitersList.replaceAll(String::toUpperCase);
        String outputStep3 = prepareOutputText(delimitersList);
        outputStep3 = outputStep3.substring(0, outputStep3.length() - 1);
        System.out.println(outputStep1 + outputStep2 + outputStep3);
        return "";
    }

    private String prepareOutputText(List<String> inputList){
        String outputText = new String("");
        for(String input:inputList){
            outputText += input + " ";
        }
        return outputText;
    }
}