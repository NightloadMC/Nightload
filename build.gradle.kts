plugins {
    kotlin("jvm") version "1.8.20" // Updated Kotlin to 1.8.20, feel free to downgrade again to 1.8.0 if you need to
}

repositories {
    mavenCentral()
}

dependencies {
    compileOnly("org.projectlombok:lombok:1.18.26")
    annotationProcessor("org.projectlombok:lombok:1.18.26")
}
