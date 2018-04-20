if (defined.PRODUCTION) {
    const UglifyJsPlugin = require('uglifyjs-webpack-plugin')

    console.log("Production build is enabled!");

    defined['process.env.NODE_ENV'] = JSON.stringify('production');

    config.mode = "production";

    config.plugins.push(new webpack.DefinePlugin({
                            'process.env.NODE_ENV': '"production"',
                          }));

    config.plugins.push(new UglifyJsPlugin());
}