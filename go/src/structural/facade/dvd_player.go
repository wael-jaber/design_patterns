package facade

type DVDPlayer struct {
	disc string
}

func (d *DVDPlayer) InsertDisc(name string) string {
	d.disc = name
	return "DVDPlayer: inserted " + name
}

func (d *DVDPlayer) Play() string {
	if d.disc == "" {
		return "DVDPlayer: no disc inserted"
	}
	return "DVDPlayer: playing " + d.disc
}

func (d *DVDPlayer) Stop() string {
	return "DVDPlayer: stopped"
}

