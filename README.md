# API-PEDIDOS-KUBERNETES

### Second example about communication between 2 services on Kubernetes Deployments

### [Step 1] Instructions Before(minikube/kubernetes)

- install: https://minikube.sigs.k8s.io/docs/start/
```
minikube start
minikube dashboard
curl -LO "https://storage.googleapis.com/kubernetes-release/release/$(curl -s https://storage.googleapis.com/kubernetes-release/release/stable.txt)/bin/linux/amd64/kubectl"
chmod +x ./kubectl
sudo mv ./kubectl /usr/local/bin/kubectl
sudo usermod -aG docker $USER && newgrp docker
kubectl get all
kubectl get pod -w
kubectl get services
```

### [Step 2] Instructions Before (skaffold)

- install: https://skaffold.dev/

### [Step 3] Build API-PEDIDOS
```
git clone https://github.com/thiagohernandes/api-pedidos-kubernetes.git
cd api-pedidos-kubernetes
mvn clean package
docker build -t api-pedidos .
skaffold run
```

### [Step 4] Open API-PEDIDOS
```
minikube service api-pedidos
open on browser: http://[ip-service]:30001/api/pedidos/v1/produtos
```
