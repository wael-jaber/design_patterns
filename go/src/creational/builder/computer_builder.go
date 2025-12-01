package builder

type ComputerBuilder struct {
	cpu     string
	ram     int
	storage int
	gpu     string
}

func NewComputerBuilder() *ComputerBuilder {
	return &ComputerBuilder{
		cpu:     "N/A",
		ram:     0,
		storage: 0,
		gpu:     "N/A",
	}
}

func (b *ComputerBuilder) SetCPU(cpu string) Builder {
	b.cpu = cpu
	return b
}

func (b *ComputerBuilder) SetRAM(ram int) Builder {
	b.ram = ram
	return b
}

func (b *ComputerBuilder) SetStorage(storage int) Builder {
	b.storage = storage
	return b
}

func (b *ComputerBuilder) SetGPU(gpu string) Builder {
	b.gpu = gpu
	return b
}

func (b *ComputerBuilder) Build() Computer {
	return Computer{
		CPU:     b.cpu,
		RAM:     b.ram,
		Storage: b.storage,
		GPU:     b.gpu,
	}
}

// Example Usage:
//
//  pc := builder.NewComputerBuilder().
//      SetCPU("Intel i9").
//      SetRAM(32).
//      SetStorage(1000).
//      SetGPU("RTX 4090").
//      Build()
//
//  fmt.Println(pc.CPU)  // Intel i9
//  fmt.Println(pc.RAM)  // 32
//
// Common Mistakes & Pitfalls:
//
// 1. Forgetting to return the builder from setters.
//    - This breaks method chaining.
//    - Always return Builder.
//
// 2. Returning pointers from Build().
//    - It's fine, but returning a value makes the Computer immutable by default.
//
// 3. Putting complex logic in the builder.
//    - The builder should only set fields, not perform validation.
//
// 4. Confusing "Director" role from classical OOP Builder.
//    - Go rarely uses a Director type — the builder itself is enough.
//
// 5. Forgetting defaults.
//    - You can initialize NewComputerBuilder() with defaults if needed.
