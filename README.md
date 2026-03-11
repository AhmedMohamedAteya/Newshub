# 📰 NewsHub

A modern Android news application built with the latest technologies and best practices. This project demonstrates a comprehensive understanding of Android development, from architecture patterns to UI design.

![Kotlin](https://img.shields.io/badge/Kotlin-2.0-purple?logo=kotlin)
![Jetpack Compose](https://img.shields.io/badge/Jetpack%20Compose-Material3-blue?logo=jetpackcompose)
![Architecture](https://img.shields.io/badge/Architecture-Clean%20Architecture-green)
![Min SDK](https://img.shields.io/badge/Min%20SDK-24-yellow)

---

## 🏗️ Architecture

This project follows **Clean Architecture** with **Multi-Module** structure for scalability and separation of concerns.

```
NewsHub/
├── app                     → Main entry point, Navigation, DI setup
├── core/
│   ├── core-common         → Extensions, Utils, Constants
│   ├── core-ui             → Theme, Shared Compose Components
│   ├── core-network        → Retrofit, OkHttp, API setup
│   ├── core-database       → Room Database, DAOs, Entities
│   └── core-datastore      → DataStore Preferences
├── feature/
│   ├── feature-onboarding  → Welcome & Interest Selection
│   ├── feature-auth        → Login / Register (Firebase)
│   ├── feature-home        → News Feed with Pagination
│   ├── feature-search      → Search with Debounce
│   ├── feature-detail      → Article Detail & Share
│   ├── feature-bookmarks   → Saved Articles (Offline)
│   └── feature-settings    → Dark Mode, Language, Notifications
```

Each feature module follows this internal structure:

```
feature-xxx/
├── data/
│   ├── remote/dto/         → API response models
│   ├── local/entity/       → Room entities
│   ├── mapper/             → DTO ↔ Entity ↔ Domain mappers
│   └── repository/         → Repository Implementation
├── domain/
│   ├── model/              → Domain models
│   ├── repository/         → Repository Interface
│   └── usecase/            → Business logic
└── presentation/
    ├── screen/             → Compose Screens
    ├── component/          → Reusable UI components
    └── viewmodel/          → ViewModels with StateFlow
```

---

## 🛠️ Tech Stack

| Category | Technology |
|----------|-----------|
| **Language** | Kotlin 2.0 |
| **UI** | Jetpack Compose + Material Design 3 |
| **Architecture** | Clean Architecture + MVVM |
| **Dependency Injection** | Hilt (Dagger) |
| **Networking** | Retrofit + OkHttp + Gson |
| **Local Database** | Room |
| **Pagination** | Paging 3 |
| **Async** | Kotlin Coroutines + Flow |
| **Navigation** | Navigation Compose (Single Activity) |
| **Preferences** | DataStore |
| **Image Loading** | Coil 3 |
| **Authentication** | Firebase Auth (Google + Email) |
| **Background Work** | WorkManager |
| **Push Notifications** | Firebase Cloud Messaging (FCM) |
| **Build System** | Gradle Kotlin DSL + Version Catalog |
| **Symbol Processing** | KSP |
| **CI/CD** | GitHub Actions |
| **Code Shrinking** | R8 / ProGuard |
| **Testing** | JUnit, MockK, Compose UI Testing |

---

## 📱 Features

- **Onboarding** — Select your news interests with smooth animations
- **Authentication** — Sign in with Google or Email/Password via Firebase
- **Home Feed** — Paginated news feed with pull-to-refresh and shimmer loading
- **Search** — Real-time search with debounce optimization
- **Article Detail** — Full article view with share functionality via implicit intents
- **Bookmarks** — Save articles for offline reading using Room
- **Settings** — Toggle dark mode, switch language (EN/AR), manage notifications
- **Deep Links** — Open articles directly from external links
- **Offline Support** — Cached articles available without internet
- **Background Sync** — WorkManager syncs latest news periodically

---

## 🎨 UI Highlights

- Full **Jetpack Compose** UI — no XML layouts
- **Material Design 3** with dynamic theming
- **Dark Mode** support with DataStore persistence
- **Shimmer** loading effects for smooth UX
- **Pull-to-refresh** on home feed
- Custom animations and transitions
- **RTL** support for Arabic localization

---

## 🧪 Testing

```
├── Unit Tests        → JUnit + MockK (ViewModels, UseCases, Repositories)
├── UI Tests          → Compose Testing (Screens, Components)
└── Integration Tests → End-to-end flows
```

Run tests:
```bash
./gradlew test              # Unit tests
./gradlew connectedCheck    # UI tests
```

---

## 🚀 Getting Started

1. **Clone the repository**
```bash
git clone https://github.com/ahmed/NewsHub.git
```

2. **Open in Android Studio** (Ladybug or newer recommended)

3. **Add your API key** — Get a free key from [NewsAPI.org](https://newsapi.org/)
```
# local.properties
NEWS_API_KEY=your_api_key_here
```

4. **Set up Firebase**
   - Create a project at [Firebase Console](https://console.firebase.google.com/)
   - Download `google-services.json` and place it in `app/`
   - Enable Email/Password and Google sign-in methods

5. **Build & Run**
```bash
./gradlew assembleDebug
```

---

## 📂 Module Dependencies

```
app
 ├── core-common
 ├── core-ui
 ├── core-network
 ├── core-database
 ├── core-datastore
 ├── feature-onboarding
 ├── feature-auth
 ├── feature-home
 ├── feature-search
 ├── feature-detail
 ├── feature-bookmarks
 └── feature-settings

feature-home
 ├── core-common
 ├── core-ui
 ├── core-network
 └── core-database

feature-bookmarks
 ├── core-common
 ├── core-ui
 └── core-database

feature-settings
 ├── core-common
 ├── core-ui
 └── core-datastore
```

---

## 🤝 Contributing

Contributions are welcome! Feel free to open issues or submit pull requests.

---

## 📄 License

```
MIT License

Copyright (c) 2024 Ahmed

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software.
```

---

## 📬 Contact

- **LinkedIn**: [[ahmedateya7](https://www.linkedin.com/in/ahmedateya7/)](#)
- **Email**: ahmedateya47@gmail.com
- **GitHub**: [@[AhmedMohamedAteya](https://github.com/AhmedMohamedAteya)](#)

---

> Built with ❤️ using Kotlin & Jetpack Compose

