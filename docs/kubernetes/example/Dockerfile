FROM golang:1.15
COPY . . 
RUN go build -o server .
CMD ["./server"]

# docker build -t kopplin/hello-go .
# docker run --rm -p 80:80 kopplin/hello-go
# docker push kopplin/hello-go