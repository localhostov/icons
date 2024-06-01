package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.Flower: ImageVector
    get() {
        if (_flower != null) {
            return _flower!!
        }
        _flower = Builder(name = "Flower", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0002f, 12.0002f)
                curveTo(14.0002f, 12.5307f, 13.7895f, 13.0394f, 13.4145f, 13.4145f)
                curveTo(13.0394f, 13.7895f, 12.5307f, 14.0003f, 12.0002f, 14.0003f)
                curveTo(11.4698f, 14.0003f, 10.9611f, 13.7895f, 10.586f, 13.4145f)
                curveTo(10.211f, 13.0394f, 10.0002f, 12.5307f, 10.0002f, 12.0002f)
                curveTo(10.0002f, 11.4698f, 10.211f, 10.9611f, 10.586f, 10.586f)
                curveTo(10.9611f, 10.211f, 11.4698f, 10.0002f, 12.0002f, 10.0002f)
                curveTo(12.5307f, 10.0002f, 13.0394f, 10.211f, 13.4145f, 10.586f)
                curveTo(13.7895f, 10.9611f, 14.0002f, 11.4698f, 14.0002f, 12.0002f)
                close()
                moveTo(22.9092f, 15.7623f)
                curveTo(22.9036f, 16.5269f, 22.6974f, 17.2767f, 22.3113f, 17.9367f)
                curveTo(21.9252f, 18.5968f, 21.3727f, 19.144f, 20.709f, 19.5237f)
                curveTo(20.0453f, 19.9035f, 19.2935f, 20.1024f, 18.5288f, 20.1008f)
                curveTo(17.7642f, 20.0991f, 17.0133f, 19.8969f, 16.3512f, 19.5143f)
                curveTo(16.3442f, 25.4473f, 7.6512f, 25.4443f, 7.6512f, 19.5143f)
                curveTo(2.4962f, 22.3413f, -1.6738f, 14.8623f, 3.3852f, 11.9443f)
                curveTo(-1.6688f, 9.0282f, 2.4852f, 1.5603f, 7.6392f, 4.3682f)
                curveTo(7.6392f, 3.2111f, 8.0989f, 2.1014f, 8.9171f, 1.2831f)
                curveTo(9.7354f, 0.4649f, 10.8451f, 0.0052f, 12.0022f, 0.0052f)
                curveTo(13.1594f, 0.0052f, 14.2691f, 0.4649f, 15.0873f, 1.2831f)
                curveTo(15.9056f, 2.1014f, 16.3652f, 3.2111f, 16.3652f, 4.3682f)
                curveTo(21.5202f, 1.5592f, 25.6712f, 9.0323f, 20.6192f, 11.9443f)
                curveTo(21.3099f, 12.3149f, 21.8874f, 12.8654f, 22.2905f, 13.5376f)
                curveTo(22.6937f, 14.2097f, 22.9075f, 14.9785f, 22.9092f, 15.7623f)
                close()
                moveTo(16.0002f, 12.0002f)
                curveTo(16.0002f, 10.9394f, 15.5788f, 9.922f, 14.8287f, 9.1718f)
                curveTo(14.0785f, 8.4217f, 13.0611f, 8.0002f, 12.0002f, 8.0002f)
                curveTo(10.9394f, 8.0002f, 9.922f, 8.4217f, 9.1718f, 9.1718f)
                curveTo(8.4217f, 9.922f, 8.0002f, 10.9394f, 8.0002f, 12.0002f)
                curveTo(8.0002f, 13.0611f, 8.4217f, 14.0785f, 9.1718f, 14.8287f)
                curveTo(9.922f, 15.5788f, 10.9394f, 16.0003f, 12.0002f, 16.0003f)
                curveTo(13.0611f, 16.0003f, 14.0785f, 15.5788f, 14.8287f, 14.8287f)
                curveTo(15.5788f, 14.0785f, 16.0002f, 13.0611f, 16.0002f, 12.0002f)
                close()
            }
        }
        .build()
        return _flower!!
    }

private var _flower: ImageVector? = null
