package com.example.adrian.recyclerviewexample.jsonplaceholder.di;

import com.example.adrian.recyclerviewexample.app.di.AppComponent;
import com.example.adrian.recyclerviewexample.jsonplaceholder.view.JsonPlaceholderApiActivity;

import dagger.Component;

/**
 * Created by Adrian_Czigany on 3/8/2017.
 */

@JsonPlaceholderScope
@Component(dependencies = AppComponent.class, modules = {JsonPlaceholderApiBaseModule.class, JsonPlaceholderServiceModule.class})
public interface JsonPlaceholderApiComponent {

    void inject(JsonPlaceholderApiActivity jsonPlaceholderApiActivity);

//    void inject(JsonPlaceholderApiPresenterImpl jsonPlaceholderApiPresenterImpl);
//
//    void inject(PostInteractorImpl postInteractorImpl);
//
//    void inject(CommentInteractorImpl commentInteractorImpl);
//
//    void inject(AlbumInteractorImpl albumInteractorImpl);
//
//    void inject(PhotoInteractorImpl photoInteractorImpl);
//
//    void inject(TodoInteractorImpl todoInteractorImpl);
//
//    void inject(UserInteractorImpl userInteractorImpl);

    final class Injector {
        private Injector() {
        }

        public static JsonPlaceholderApiComponent buildComponent(JsonPlaceholderApiActivity activity) {
            return DaggerJsonPlaceholderApiComponent.builder()
                    .appComponent(AppComponent.Injector.getComponent())
                    .jsonPlaceholderApiBaseModule(new JsonPlaceholderApiBaseModule(activity))
                    .build();
        }
    }

}
