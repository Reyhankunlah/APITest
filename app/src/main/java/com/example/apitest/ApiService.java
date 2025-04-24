package com.example.apitest;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {
    @GET("search_all_teams.php?l=English%20Premier%20League")
    Call<TeamResponse> getTeams(@Query("l") String league);

    @GET("search_all_teams.php?s=Soccer&c=Spain")
    Call<TeamResponse> getTeamsByCountry(@Query("s") String sport, @Query("c") String country);
}