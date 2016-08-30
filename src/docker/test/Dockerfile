FROM openjdk:8

RUN apt-get update && \
    apt-get install -y xvfb firefox-esr-l10n-ja fonts-ipafont

WORKDIR /opt/test

ADD http://selenium-release.storage.googleapis.com/3.0-beta2/selenium-server-standalone-3.0.0-beta2.jar /opt/test/selenium-server-standalone.jar

ADD https://github.com/mozilla/geckodriver/releases/download/v0.10.0/geckodriver-v0.10.0-linux64.tar.gz /opt/test/geckodriver.tar.gz
RUN tar zxvf geckodriver.tar.gz

ADD entrypoint.sh /opt/test/entrypoint.sh

ENV DISPLAY :1

ENV webdriver.gecko.driver /opt/test/geckodriver

ENTRYPOINT ["/bin/sh", "/opt/test/entrypoint.sh"]

