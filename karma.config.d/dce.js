const fixedContext = webpackConfig.context.substring(0, webpackConfig.context.lastIndexOf('/min'))
webpackConfig.context = fixedContext;
webpackConfig.resolve.modules.splice(0, 1, "js");

console.log(webpackConfig);