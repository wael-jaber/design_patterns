package facade

// HomeTheaterFacade provides a simplified interface to multiple subsystems.
type HomeTheaterFacade struct {
	amp      *Amplifier
	dvd      *DVDPlayer
	projector *Projector
}

func NewHomeTheaterFacade(amp *Amplifier, dvd *DVDPlayer, projector *Projector) *HomeTheaterFacade {
	return &HomeTheaterFacade{
		amp:      amp,
		dvd:      dvd,
		projector: projector,
	}
}

func (h *HomeTheaterFacade) WatchMovie(movie string) []string {
	actions := []string{
		h.amp.On(),
		h.projector.On(),
		h.dvd.InsertDisc(movie),
		h.dvd.Play(),
	}
	return actions
}

func (h *HomeTheaterFacade) EndMovie() []string {
	actions := []string{
		h.dvd.Stop(),
		h.projector.Off(),
		h.amp.Off(),
	}
	return actions
}

// Example Usage:
//
//  amp := &facade.Amplifier{}
//  dvd := &facade.DVDPlayer{}
//  projector := &facade.Projector{}
//
//  home := facade.NewHomeTheaterFacade(amp, dvd, projector)
//
//  home.WatchMovie("Inception")
//  home.EndMovie()
//
// Common Mistakes:
//
// 1. Exposing subsystem complexity to clients — Facade should hide it.
// 2. Making Facade depend on concrete types only — interfaces optional.
// 3. Putting business logic inside subsystems instead of Facade.
// 4. Allowing clients to bypass the Facade and manipulate subsystems.
// 5. Taking ownership of subsystems instead of receiving them (bad for testing).

