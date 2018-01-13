# Kotlin-Mvp-Dagger2-Retrofit-Room-RxJava
Kotlin Mvp Dagger2 Retrofit Room RxJava

## Dependencies
  * MVP
  * Dagger 2
  * Retrofit
  * Room
  * JavaRx
  * Kotter Knife

## Hierarchy

```
+-- database
|   +-- entity
|       - User
|       - UserDao
|   +-- repository
|       - UserDataSource
|       - UserRepository
|   - DataSource
|   - MyRoomDatabase
+-- di
|   +-- components
|       - AppComponent
|   +-- modules
|       - ActivityBindingModule // Not used, dagger-android class
|       - ActivityModule
|       - AppModule
|       - DbModule
|       - FragmentModule
|       - NetworkModule
|       - PicassoModule
|   +-- qualifier
|       - ActivityContext
|       - ApplicationContext
|   +-- scopes
|       - ActivityScoped
|       - ApplicationScoped
|       - FragmentScoped
|       - UserScoped
+-- network
|   +-- pojo
|       - Post
|   - ApiControllerRetrofit
+-- ui
|   +-- login
|   +-- main
|   +-- register
|   +-- splash
- MyApplication
```
## Inspired

##### Android Architecture
* [todo‑mvp‑dagger](https://github.com/googlesamples/android-architecture/tree/todo-mvp-dagger/)
* [todo‑mvp‑rxjava](https://github.com/googlesamples/android-architecture/tree/todo-mvp-rxjava/)
* [todo-mvp-kotlin](https://github.com/googlesamples/android-architecture/tree/dev-todo-mvp-kotlin/)

###### TwistedEquations
* [RxMVP](https://www.youtube.com/watch?v=--wragcEDtI&list=PLuR1PJnGR-IgeDuzxoGe3hHV_8OfbHy8c/)
* [Dagger 2](https://www.youtube.com/watch?v=Qwk7ESmaCq0&list=PLuR1PJnGR-Ih-HXnGSpnqjdhdvqcwhfFU/)

##### Benoitletondor
* [Android Studio MVP template](https://github.com/benoitletondor/Android-Studio-MVP-template/)

##### JakeWharton
* [Kotter Knife](https://github.com/JakeWharton/kotterknife/)