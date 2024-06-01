package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.LockAlt: ImageVector
    get() {
        if (_lockAlt != null) {
            return _lockAlt!!
        }
        _lockAlt = Builder(name = "LockAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(13.0f, 10.0f)
                    curveTo(13.0f, 10.1978f, 12.9414f, 10.3911f, 12.8315f, 10.5556f)
                    curveTo(12.7216f, 10.72f, 12.5654f, 10.8482f, 12.3827f, 10.9239f)
                    curveTo(12.2f, 10.9996f, 11.9989f, 11.0194f, 11.8049f, 10.9808f)
                    curveTo(11.6109f, 10.9422f, 11.4328f, 10.847f, 11.2929f, 10.7071f)
                    curveTo(11.153f, 10.5673f, 11.0578f, 10.3891f, 11.0192f, 10.1951f)
                    curveTo(10.9806f, 10.0011f, 11.0004f, 9.8f, 11.0761f, 9.6173f)
                    curveTo(11.1518f, 9.4346f, 11.28f, 9.2784f, 11.4444f, 9.1685f)
                    curveTo(11.6089f, 9.0587f, 11.8022f, 9.0f, 12.0f, 9.0f)
                    curveTo(12.2652f, 9.0f, 12.5196f, 9.1054f, 12.7071f, 9.2929f)
                    curveTo(12.8946f, 9.4804f, 13.0f, 9.7348f, 13.0f, 10.0f)
                    close()
                    moveTo(24.0f, 12.0f)
                    curveTo(24.0f, 14.3734f, 23.2962f, 16.6935f, 21.9776f, 18.6668f)
                    curveTo(20.6591f, 20.6402f, 18.7849f, 22.1783f, 16.5922f, 23.0866f)
                    curveTo(14.3995f, 23.9948f, 11.9867f, 24.2324f, 9.6589f, 23.7694f)
                    curveTo(7.3312f, 23.3064f, 5.1929f, 22.1635f, 3.5147f, 20.4853f)
                    curveTo(1.8365f, 18.8071f, 0.6936f, 16.6689f, 0.2306f, 14.3411f)
                    curveTo(-0.2324f, 12.0133f, 0.0052f, 9.6005f, 0.9135f, 7.4078f)
                    curveTo(1.8217f, 5.2151f, 3.3598f, 3.3409f, 5.3332f, 2.0224f)
                    curveTo(7.3066f, 0.7038f, 9.6266f, 0.0f, 12.0f, 0.0f)
                    curveTo(15.1815f, 0.0034f, 18.2318f, 1.2688f, 20.4815f, 3.5185f)
                    curveTo(22.7312f, 5.7682f, 23.9966f, 8.8185f, 24.0f, 12.0f)
                    close()
                    moveTo(15.0f, 10.0f)
                    curveTo(15.0023f, 9.4495f, 14.853f, 8.9089f, 14.5686f, 8.4376f)
                    curveTo(14.2842f, 7.9662f, 13.8755f, 7.5823f, 13.3874f, 7.3277f)
                    curveTo(12.8993f, 7.0731f, 12.3505f, 6.9577f, 11.8012f, 6.9942f)
                    curveTo(11.2519f, 7.0307f, 10.7232f, 7.2176f, 10.2731f, 7.5345f)
                    curveTo(9.8229f, 7.8514f, 9.4686f, 8.2861f, 9.249f, 8.7909f)
                    curveTo(9.0294f, 9.2957f, 8.953f, 9.8513f, 9.0281f, 10.3966f)
                    curveTo(9.1031f, 10.942f, 9.3268f, 11.4562f, 9.6746f, 11.883f)
                    curveTo(10.0224f, 12.3097f, 10.481f, 12.6325f, 11.0f, 12.816f)
                    verticalLineTo(17.0f)
                    horizontalLineTo(13.0f)
                    verticalLineTo(12.816f)
                    curveTo(13.5829f, 12.6099f, 14.0879f, 12.2288f, 14.4459f, 11.7247f)
                    curveTo(14.8039f, 11.2206f, 14.9974f, 10.6183f, 15.0f, 10.0f)
                    close()
                }
            }
        }
        .build()
        return _lockAlt!!
    }

private var _lockAlt: ImageVector? = null
