# 🚀 Android Clean Architecture Boilerplate

A fully structured Android app template using **Clean Architecture**, **Hilt**, **Retrofit**, **MVVM**, **Coroutines**, and **sealed classes** for clean API result handling.

---

## 🧱 Architecture

This project is organized in a layered architecture:

- data/
  - remote/ → Retrofit API, DTOs
  - repository/ → Impl
- domain/
  - model/ → Business models
  - usecase/ → Business logic
  - repository/ → Interface
- presentation/
  - viewmodel/ → StateFlow + ViewModel
  - state/ → Sealed class UIState

---

## 📲 Features

✅ Clean MVVM Architecture  
✅ Retrofit with Coroutines  
✅ Hilt for Dependency Injection  
✅ Kotlin Flow + StateFlow  
✅ Sealed Classes for UI States  
✅ Easy to Scale & Maintain

---

## 🧩 Tech Stack

- Kotlin
- Retrofit
- Hilt
- Coroutines
- StateFlow
- Jetpack ViewModel

---
## 🛠 Hilt DI Module
```kotlin
@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    fun provideBaseUrl() = "https://your.api.url/"

    @Provides
    @Singleton
    fun provideRetrofit(baseUrl: String): Retrofit =
        Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    @Provides
    fun provideAuthApi(retrofit: Retrofit): AuthApi =
        retrofit.create(AuthApi::class.java)

    @Provides
    fun provideAuthRepository(api: AuthApi): AuthRepository =
        AuthRepositoryImpl(api)
}
```
## 🔌 Retrofit Setup

```kotlin
interface AuthApi {
    @POST("auth/login")
    suspend fun login(@Body request: LoginRequest): LoginResponse
}
```
## 🗂 Repository Layer

```kotlin

class AuthRepositoryImpl @Inject constructor(
    private val api: AuthApi
) : AuthRepository {
    override suspend fun login(email: String, password: String): LoginResult {
        val response = api.login(LoginRequest(email, password))
        return LoginResult(response.token, response.userId)
    }
}
```
## 🧪 UI State Handling (Sealed Class)

```kotlin
sealed class UiState<out T> {
    object Loading : UiState<Nothing>()
    data class Success<T>(val data: T) : UiState<T>()
    data class Error(val message: String) : UiState<Nothing>()
}
```
## 🧠 ViewModel Example

```kotlin
@HiltViewModel
class LoginViewModel @Inject constructor(
    private val loginUseCase: LoginUseCase
) : ViewModel() {

    private val _loginState = MutableStateFlow<UiState<LoginResult>>(UiState.Loading)
    val loginState: StateFlow<UiState<LoginResult>> = _loginState

    fun login(email: String, password: String) {
        viewModelScope.launch {
            _loginState.value = UiState.Loading
            try {
                val result = loginUseCase(email, password)
                _loginState.value = UiState.Success(result)
            } catch (e: Exception) {
                _loginState.value = UiState.Error(e.message ?: "Unexpected Error")
            }
        }
    }
}
```

## ▶️ Usage in Composable/Activity

```kotlin
val viewModel: LoginViewModel = hiltViewModel()

LaunchedEffect(Unit) {
    viewModel.login("email@example.com", "password")
}

val uiState by viewModel.loginState.collectAsState()

when (uiState) {
    is UiState.Loading -> { /* Show loading */ }
    is UiState.Success -> {
        val data = (uiState as UiState.Success).data
        // Show result
    }
    is UiState.Error -> {
        val error = (uiState as UiState.Error).message
        // Show error
    }
}
```
## 🧹 Coming Soon
✅ Unit Tests for UseCase and ViewModel

✅ Paging with RemoteMediator

✅ UI Testing with Compose + Hilt

✅ Room database integration
