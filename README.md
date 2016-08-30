# Selenide + Docker + Xvfb + Firefox SAMPLE

## Ready

```sh
docker-machine start dev
gradlew build -x test
cp build/libs/sample.jar src/docker/app/sample.jar
cd src/docker
docker-compose up -d
```

## Run test

```sh
gradlew test
```

## License

Licensed under [The MIT License](https://opensource.org/licenses/MIT)

