FROM golang:1.17.8-alpine3.15 AS builder

RUN apk update && apk add --no-cache git

WORKDIR /usr/src/app

COPY . .

RUN go get -d -v
RUN go build -o /go/bin/hello

FROM scratch

COPY --from=builder /go/bin/hello /go/bin/hello

ENTRYPOINT ["/go/bin/hello"]
