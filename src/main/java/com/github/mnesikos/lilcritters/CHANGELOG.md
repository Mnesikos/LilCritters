# Changelog
All notable changes to this project will be documented in this file.

The format is based on 
[Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to 
[Forge Versioning Conventions](https://mcforge.readthedocs.io/en/latest/conventions/versioning/).

## [1.12.2-1.0.0.1] - 2020/03/29
For ZAWA 2.0.1 and Bookworm 2.5.0
### Fixed
- Rewrote LC's spawn configs to ZAWA's config file for the meantime in order to catch modded biomes.
- Opossum model no longer floats off the ground by a little.
- Penguin's swim animation adjusted a little.

## [1.12.2-1.0.0.0] - 2020/03/29
For ZAWA 2.0.1 and Bookworm 2.5.0
### Added
- 6 new critters! Skunks, Opossums, Tufted Deer, Small Clawed Otters, Banded Penguins, and Dwarf Crocs.
### Changed
- ZAWA diets have been completely rehauled for 2.0.0, including all addon animals!
- Lots of inside changes for 2.0.0 compatibility, but the average player probably won't notice (I don't lol).

## [1.12.2-0.0.1.3-beta4] - 2019/02/12
For ZAWA 1.5.5 and Bookworm 2.1.0
### Added
- Two new squirrel variants, one is a secret name tag feature! (Discord knows...)
- Acorn and pine cone drop rates can now be configured or completely disabled.
- Chinese localization, big thanks to HeyDon-Lee on Github!!
### Changed
- Deprecated entity constructors adjusted according to ZAWA.
- Config file directory is now LilCritters > version > lilcritters.cfg.
- Pack Format is now 3 (previously 2), and lang files changed to lowercase.
### Fixed
- Squirrel over spawning. (Begone, crazy critters!)

## [1.12.2-0.0.1.2-beta3] - 2018/12/30
For ZAWA 1.5.0-1.5.4 and Bookworm 2.0.0-2.1.0
### Added
- Box Turtles immediately hide upon taking damage, and also take less damage.
### Fixed
- Over spawning of turtles on flat maps! 
    (Also consequently changing their spawn rate, please update your config file.)

## [1.12.2-0.0.1.1-beta2] - 2018/12/16
### Added
- This CHANGELOG file.
- Italian localization, big thank you to Manu's Projects on Discord!!
- BOX TURTLES WOOHOO!! Modeled and textured by Mr. Mubbs!
- Data book support for species variants.
- Temporary Squirrel climbing. (No idea if it actually works lol, more testing will be done for the next release.)
- Oak leaves now drop acorns and spruce leaves drop pine cones, as initially intended.
- Squirrels will eat dropped food items, courtesy of SoggyMustache! Watch your nuts.
- Ability for players to pick up critters by interact-clicking them with an empty hand. 
    Sneaking will dismount them from your person.
    !! DO NOT exit the world before dismounting your held critters, YOU WILL LOSE THEM !!
### Changed
- Squirrel size reduced slightly overall, with slight variability per squirrel.
- You can now hand feed squirrels any item they consider food! 
    (Dynamic Trees acorns and pine cones included, yay!)
- Other code cleanups no one wants to hear about.
### Fixed
- Squirrels shouldn't move while in their eating pose.
- Stay, Follow, and Wander commands should work properly. (Thanks for the heads up, OctoTurkey!)
- All nuts and seeds (Pam's HarvestCraft compatibility) are registered properly as food for squirrels.


## [1.12.2-0.0.1.0-beta1] - 2018/10/08
- First release, discord only, no changelog, what was versioning, oops? 
    TLDR; mess.
