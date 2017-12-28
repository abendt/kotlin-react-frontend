config.module.rules.push(
    {
        test: /\.css$/,
        use: [
            {loader: 'style-loader',
             options: { singleton: true }},

            {loader: 'css-loader'}
        ]
    }
);