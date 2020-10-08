import { TestBed } from '@angular/core/testing';

import { BuildPCService } from './build-pc.service';

describe('BuildPCService', () => {
  let service: BuildPCService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(BuildPCService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
