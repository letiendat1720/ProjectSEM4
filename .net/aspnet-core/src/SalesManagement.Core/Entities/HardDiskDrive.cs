﻿using Abp.Domain.Entities.Auditing;

namespace SalesManagement.Entities
{
    public class HardDiskDrive : FullAuditedEntity<long>
    {
        public string Name { get; set; }
        public string Type { get; set; }
        public string Color { get; set; }
        public string Storage { get; set; }
        public string Size { get; set; }
        public string ImageString { get; set; }
        public string Description { get; set; }
        public long Price { get; set; }
        public long Gurantee { get; set; }
        public long Total { get; set; }
    }
}
