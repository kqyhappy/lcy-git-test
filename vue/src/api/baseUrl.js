let baseUrl = "";
switch (process.env.NODE_ENV) {
    case 'dev':
        baseUrl = "http://localhost:8088/"  //��������url
        break
    case 'serve':
        baseUrl = "http://localhost:8089/"   //��������url
        break
}

export default baseUrl;