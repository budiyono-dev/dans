package com.budiyono.code.dans.outbond;

import com.budiyono.code.dans.domain.Job;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.util.List;

public interface DansPositionService {
    @GET("positions.json")
    Call<List<Job>> getListJob();
    @GET("positions/{ID}")
    Call<Job> getJob(@Path("ID") String id);
}
