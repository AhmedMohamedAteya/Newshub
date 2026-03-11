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
    }
}

rootProject.name = "NewsHub"
include(":app")
include(":core-common")
include(":core-ui")
include(":core-network")
include(":core-database")
include(":core-datastore")
include(":feature-onboarding")
include(":feature-auth")
include(":feature-home")
include(":feature-search")
include(":feature-detail")
include(":feature-bookmarks")
include(":feature-settings")
