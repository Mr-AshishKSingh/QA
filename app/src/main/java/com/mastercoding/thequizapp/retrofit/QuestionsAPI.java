package com.mastercoding.thequizapp.retrofit;

import com.mastercoding.thequizapp.model.QuestionList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface QuestionsAPI {
    // Used to define the structure and behavior of
    // network requests to a RESTful API.
    // Acts as a bridge between android app and the web service

    @GET("myquizapi.php")  // end point
    Call<QuestionList> getQuestions();


}
