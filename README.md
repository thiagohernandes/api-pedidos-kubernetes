# API-PEDIDOS-KUBERNETES

### Second example about communication between 2 services on Kubernetes Deployments

### [Step 1] Instructions Before(minikube/kubernetes)

- install: https://minikube.sigs.k8s.io/docs/start/
```
minikube start
minikube dashboard
minikube get all
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
skaffold run
```

### [Step 4] Open API-PRODUTOS
```
minikube service api-pedidos
```
