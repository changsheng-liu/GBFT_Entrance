protoc --plugin=protoc-gen-grpc-java --grpc-java_out=../java --proto_path=. ./gbftprotocol.proto
protoc --plugin=protoc-gen-grpc-java -I=. --java_out=../java ./gbftprotocol.proto