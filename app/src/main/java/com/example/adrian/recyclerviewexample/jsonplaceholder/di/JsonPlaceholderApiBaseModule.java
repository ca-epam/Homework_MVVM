package com.example.adrian.recyclerviewexample.jsonplaceholder.di;


import com.example.adrian.recyclerviewexample.jsonplaceholder.view.JsonPlaceholderApiActivity;
import com.example.adrian.recyclerviewexample.jsonplaceholder.view.JsonPlaceholderApiView;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Adrian_Czigany on 3/8/2017.
 */

@Module
public class JsonPlaceholderApiBaseModule {

    JsonPlaceholderApiActivity jsonPlaceholderApiActivity;

    public JsonPlaceholderApiBaseModule(JsonPlaceholderApiActivity jsonPlaceholderApiActivity) {
        this.jsonPlaceholderApiActivity = jsonPlaceholderApiActivity;
    }

    @JsonPlaceholderScope
    @Provides
    JsonPlaceholderApiView providesJsonPlaceholderApiView() {
        return jsonPlaceholderApiActivity;
    }

//    @JsonPlaceholderScope
//    @Provides
//    PostInteractor providePostInteractor() {
//        return new PostInteractorImpl(providesJsonPlaceholderApiView());
//    }
//
//    @JsonPlaceholderScope
//    @Provides
//    CommentInteractor provideCommentInteractor() {
//        return new CommentInteractorImpl(providesJsonPlaceholderApiView());
//    }
//
//    @JsonPlaceholderScope
//    @Provides
//    AlbumInteractor provideAlbumInteractor() {
//        return new AlbumInteractorImpl(providesJsonPlaceholderApiView());
//    }
//
//    @JsonPlaceholderScope
//    @Provides
//    PhotoInteractor providePhotoInteractor() {
//        return new PhotoInteractorImpl(providesJsonPlaceholderApiView());
//    }
//
//    @JsonPlaceholderScope
//    @Provides
//    TodoInteractor provideTodoInteractor() {
//        return new TodoInteractorImpl(providesJsonPlaceholderApiView());
//    }
//
//    @JsonPlaceholderScope
//    @Provides
//    UserInteractor provideUserInteractor() {
//        return new UserInteractorImpl(providesJsonPlaceholderApiView());
//    }
//
//    @JsonPlaceholderScope
//    @Provides
//    JsonPlaceholderApiPresenter providesJsonPlaceholderApiPresenter() {
//        return new JsonPlaceholderApiPresenterImpl(providesJsonPlaceholderApiView());
//    }

}
