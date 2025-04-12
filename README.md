# ChatLibrary 💬

ChatLibrary is a lightweight Android library that provides a simple chat interface and WebSocket integration for real-time communication. It is designed to be easy to plug into any Android application with minimal setup.

---

## Features

- Chat interface
- WebSocket support for real-time messaging
- Distinguishes between user and server messages
- Easy to integrate as a dependency from GitHub Packages



## Installation

Add the following to your `settings.gradle.kts`:

```kotlin
dependencyResolutionManagement {
    repositories {
        maven {
            url = uri("https://maven.pkg.github.com/karukaaa/ChatLibrary")
            credentials {
                username = project.findProperty("gpr.user") as String? ?: System.getenv("USERNAME")
                password = project.findProperty("gpr.key") as String? ?: System.getenv("TOKEN")
            }
        }
    }
}


And in your app module build.gradle.kts:

dependencies {
    implementation("com.github.karukaaa:chat-library:1.0.0")
}


In your MainActivity.kt or any Activity:

ChatLibrary.start(context = this)
