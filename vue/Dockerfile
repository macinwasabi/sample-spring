FROM node:22-alpine3.18
WORKDIR /app
COPY ./app/package*.json /app/
RUN npm install
CMD npm run dev