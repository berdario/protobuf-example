# protobuf-example

Minimal protobuf example: it works with leiningen but fails inside LightTable

## Usage

you can quickly try it out with

`lein run -m protobuf-example.core/serialize-person 0 john`
(it won't output anything)
or just load the core.clj inside the repl

Plenty of things can go wrong while building/installing protobuf, until it'll be merged upstream, you can use [my fork of lein-protobuf](https://github.com/berdario/lein-protobuf) which will output errors

## License

This work is free. You can redistribute it and/or modify it under the
terms of the Do What The Fuck You Want To Public License, Version 2,
as published by Sam Hocevar. See http://www.wtfpl.net/ for more details.
