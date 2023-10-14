plugins {
    kotlin("jvm") version "1.9.0"
    application
}

group = "me.ipig"
version = "1.0"

repositories {
    mavenCentral()
    maven("https://repo.kryptonmc.org/releases/")
}

dependencies {
    compileOnly("org.github.paperspigot:paperspigot-api:1.8.8-R0.1-SNAPSHOT")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(8)
}

application {
    mainClass.set("MainKt")
}