plugins {
    id("java")
    id("io.qameta.allure") version "2.9.6"
    id("io.freefair.lombok") version "8.2.0"
}

group = "cmc_neoflex.cloud"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.12.2")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.12.2")
    testImplementation("io.rest-assured:rest-assured:5.5.1")
    implementation("com.fasterxml.jackson.core:jackson-databind:2.19.0")
    implementation("io.qameta.allure:allure-rest-assured:2.29.1")
    testImplementation("io.qameta.allure:allure-junit5:2.29.1")

}

tasks.test {
    useJUnitPlatform()
}