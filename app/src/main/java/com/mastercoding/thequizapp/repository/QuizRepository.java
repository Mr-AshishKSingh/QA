package com.mastercoding.thequizapp.repository;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.mastercoding.thequizapp.model.QuestionList;
import com.mastercoding.thequizapp.retrofit.QuestionsAPI;
import com.mastercoding.thequizapp.retrofit.RetrofitInstance;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class QuizRepository {
    // Interacts with the API service interfaces
    // Handling data retrieval and operations

    private QuestionsAPI questionsAPI;

    public QuizRepository() {
        this.questionsAPI = new RetrofitInstance()
                .getRetrofitInstance()
                .create(QuestionsAPI.class);
    }

    public LiveData<QuestionList> getQuestionsFromAPI(){
        MutableLiveData<QuestionList> data = new MutableLiveData<>();

        Call<QuestionList> response = questionsAPI.getQuestions();

        response.enqueue(new Callback<QuestionList>() {
            @Override
            public void onResponse(Call<QuestionList> call, Response<QuestionList> response) {
                // Saving the data to the list
                QuestionList list  = response.body();
                if (list == null || list.size() == 0) {
                    // Fallback: Add hardcoded questions if API fails or returns empty
                    QuestionList fallbackList = new QuestionList();
                    com.mastercoding.thequizapp.model.Question q1 = new com.mastercoding.thequizapp.model.Question();
                    q1.setQuestion("What is the capital of France?");
                    q1.setOption1("Paris");
                    q1.setOption2("London");
                    q1.setOption3("Berlin");
                    q1.setOption4("Madrid");
                    q1.setCorrectOption("Paris");
                    fallbackList.add(q1);

                    com.mastercoding.thequizapp.model.Question q2 = new com.mastercoding.thequizapp.model.Question();
                    q2.setQuestion("Which planet is known as the Red Planet?");
                    q2.setOption1("Earth");
                    q2.setOption2("Mars");
                    q2.setOption3("Jupiter");
                    q2.setOption4("Saturn");
                    q2.setCorrectOption("Mars");
                    fallbackList.add(q2);

                    com.mastercoding.thequizapp.model.Question q3 = new com.mastercoding.thequizapp.model.Question();
                    q3.setQuestion("Who wrote 'Romeo and Juliet'?");
                    q3.setOption1("William Shakespeare");
                    q3.setOption2("Charles Dickens");
                    q3.setOption3("Jane Austen");
                    q3.setOption4("Mark Twain");
                    q3.setCorrectOption("William Shakespeare");
                    fallbackList.add(q3);

                    data.setValue(fallbackList);
                } else {
                    data.setValue(list);
                }
            }

            @Override
            public void onFailure(Call<QuestionList> call, Throwable t) {
                // Fallback: Add hardcoded questions if API call fails
                QuestionList fallbackList = new QuestionList();
                com.mastercoding.thequizapp.model.Question q1 = new com.mastercoding.thequizapp.model.Question();
                q1.setQuestion("What is the capital of France?");
                q1.setOption1("Paris");
                q1.setOption2("London");
                q1.setOption3("Berlin");
                q1.setOption4("Madrid");
                q1.setCorrectOption("Paris");
                fallbackList.add(q1);

                com.mastercoding.thequizapp.model.Question q2 = new com.mastercoding.thequizapp.model.Question();
                q2.setQuestion("Which planet is known as the Red Planet?");
                q2.setOption1("Earth");
                q2.setOption2("Mars");
                q2.setOption3("Jupiter");
                q2.setOption4("Saturn");
                q2.setCorrectOption("Mars");
                fallbackList.add(q2);

                com.mastercoding.thequizapp.model.Question q3 = new com.mastercoding.thequizapp.model.Question();
                q3.setQuestion("Who wrote 'Romeo and Juliet'?");
                q3.setOption1("William Shakespeare");
                q3.setOption2("Charles Dickens");
                q3.setOption3("Jane Austen");
                q3.setOption4("Mark Twain");
                q3.setCorrectOption("William Shakespeare");
                fallbackList.add(q3);

                data.setValue(fallbackList);
            }
        });

        return data;
    }
}

