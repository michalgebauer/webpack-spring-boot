const path = require('path');

module.exports = {
    context: path.resolve(__dirname, './frontend'),
    entry: ['whatwg-fetch', './app.js'],
    output: {
        path: path.resolve(__dirname, './src/main/resources/static/js'),
        filename: '[name].bundle.js',
        publicPath: '/js',
    },
    devServer: {
        port: 3000,
        contentBase: path.resolve(__dirname, './src/main/resources/templates'),
        proxy: {
            "/rest": "http://localhost:8080"
        }
    }
};