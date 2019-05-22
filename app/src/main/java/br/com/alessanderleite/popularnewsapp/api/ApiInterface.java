package br.com.alessanderleite.popularnewsapp.api;

import br.com.alessanderleite.popularnewsapp.models.News;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("top-headlines")
    Call<News> getNews(
            @Query("country") String country,
            @Query("apiKey") String apiKey
    );
}
