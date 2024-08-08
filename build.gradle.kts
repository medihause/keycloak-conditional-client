plugins {
    id("java")
}

group = "com.itstor.keycloak-conditional-clientid"
version = "1.0.1"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.keycloak:keycloak-services:25.0.2")
    implementation("org.keycloak:keycloak-server-spi:25.0.2")
    implementation("org.keycloak:keycloak-server-spi-private:25.0.2")
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}