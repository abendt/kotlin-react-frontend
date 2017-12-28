if (defined.PRODUCTION) {
    console.log("Production build is enabled: will minify");

    config.plugins.push(new webpack.optimize.UglifyJsPlugin({
        minimize: true
    }));
}