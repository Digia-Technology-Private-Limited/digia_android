pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        //Added for Digia
        maven ( url = "https://aar-artifacts.s3.ap-south-1.amazonaws.com")
        maven(url = "https://storage.googleapis.com/download.flutter.io")
        maven(url = "https://jitpack.io")
    }
}

rootProject.name = "TestDigiaAar"
include(":app")

 