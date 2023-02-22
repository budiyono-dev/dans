package com.budiyono.code.dans.controller;

import com.budiyono.code.dans.domain.Job;
import com.budiyono.code.dans.outbond.DansPositionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class MainController {

    @GetMapping("/job")
    public ResponseEntity<?> getListJob() throws IOException {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://dev3.dansmultipro.co.id/api/recruitment/")
                .addConverterFactory(JacksonConverterFactory.create())
                .build();
        DansPositionService positionService = retrofit.create(DansPositionService.class);
        List<Job> jobs = positionService.getListJob().execute().body();
        return ResponseEntity.ok(jobs);
    }
    @GetMapping("/job/{id}")
    public ResponseEntity<?> getJobByID(@PathVariable("id") String id) throws IOException {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://dev3.dansmultipro.co.id/api/recruitment/")
                .addConverterFactory(JacksonConverterFactory.create())
                .build();
        DansPositionService positionService = retrofit.create(DansPositionService.class);
        Response<Job> execute = positionService.getJob(id).execute();
        Job body = execute.body();
        return ResponseEntity.ok(body);
    }

}
