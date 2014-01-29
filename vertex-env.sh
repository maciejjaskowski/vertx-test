sudo apt-get update
sudo apt-get -y install unzip
sudo apt-get -y install vim
sudo apt-get -y install python-software-properties python g++ make
sudo add-apt-repository -y ppa:chris-lea/node.js
sudo apt-get update
sudo apt-get -y install nodejs=0.10.25-1chl1~precise1

sudo apt-get -y install openjdk-7-jdk

cd /home/vagrant/
wget -c http://dl.bintray.com/vertx/downloads/vert.x-2.1M3.zip vert.x.zip
unzip vert.x-2.1M3.zip  
echo "PATH=\"$PATH:/home/vagrant/vert.x-2.1M3/bin/\"" >> /home/vagrant/.bashrc

echo "scala=io.vertx~lang-scala~0.3.0:org.vertx.scala.platform.impl.ScalaVerticleFactory
 .scala=scala" >> /home/vagrant/vert.x-2.1M3/conf/langs.properties

