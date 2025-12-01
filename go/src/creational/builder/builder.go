package builder

// Builder defines the steps for constructing a Computer.
type Builder interface {
	SetCPU(cpu string) Builder
	SetRAM(ram int) Builder
	SetStorage(storage int) Builder
	SetGPU(gpu string) Builder
	Build() Computer
}
