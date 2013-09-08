# Dotfiles (Nicolas Gallagher, revamp by Ross Donaldson)

My OS X dotfiles.


## What this Is

So Nicolas Gallagher did this meticulous and completely amazing job setting up
this self-deploying, self-maintaining, git-backed set of bash scripts. He wrote
some pretty gorgeous documentation about it, too; you should
[check it out](www.github.com/necolas/dotfiles). I've left some of it intact here,
but seriously, go look at his stuff.

This project is an extension of Gallagher's. Gallagher's `dotfiles` are OSX only;
I develop on both OSX and Debian-based Linux boxes pretty much on the regular.
Being able to deploy my configs in an automated way is pretty much spectacular for
me, but maintaining two parallel repos turned out to be a pain in the arse. So!
I retooled the original `dotfiles` repo to autodetect OS and do the correct thing.
OSX package management is still via brew; Debian uses apt (though it installs
aptitude along the way). Os dependent switches are also in places like `bash_aliases`
and `bash_exports`.

Three other changes:

1) I use my own fork of [Emacs Prelude](www.github.com/Gastove/prelude) instead of vim.
This is managed via a git submodule.
2) I don't use node, at all; that functionality has been removed.
3) I've added short commands, as well as a command to skip `apt-get update`.

## How to install

On OSX, the installation step requires the [XCode Command Line
Tools](https://developer.apple.com/downloads). On any OS, this will
probably overwrite existing dotfiles in your HOME directory. Before installing,
move local stuff into `.bash_profile.local`; it'll be symlinked in automatically.

```bash
$ bash -c "$(curl -fsSL raw.github.com/Gastove/dotfiles/master/bin/dotfiles)"
```
## How to update

You should run the update when:

* You make a change to `~/.dotfiles/git/gitconfig` (the only file that is
  copied rather than symlinked).
* You want to pull changes from the remote repository.
* You want to update Homebrew formulae and Node packages.

Run the dotfiles command:

```bash
$ dotfiles
```

Options:

<table>
    <tr>
        <td><code>-h</code>, <code>--help, -h</code></td>
        <td>Help</td>
    </tr>
    <tr>
        <td><code>-l</code>, <code>--skip-apt-up, -sau</code></td>
        <td>List of additional applications to install</td>
    </tr>
    <tr>
        <td><code>--no-packages, -np</code></td>
        <td>Suppress package updates</td>
    </tr>
    <tr>
        <td><code>--no-sync, -ns</code></td>
        <td>Suppress pulling from the remote repository</td>
    </tr>
</table>
