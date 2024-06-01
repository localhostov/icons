package me.localx.icons.rounded.filled

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
import me.localx.icons.rounded.Icons

public val Icons.Filled.Clock: ImageVector
    get() {
        if (_clock != null) {
            return _clock!!
        }
        _clock = Builder(name = "Clock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0f, 0.0f)
                    curveTo(9.6266f, 0.0f, 7.3066f, 0.7038f, 5.3332f, 2.0224f)
                    curveTo(3.3598f, 3.3409f, 1.8217f, 5.2151f, 0.9135f, 7.4078f)
                    curveTo(0.0052f, 9.6005f, -0.2324f, 12.0133f, 0.2306f, 14.3411f)
                    curveTo(0.6936f, 16.6689f, 1.8365f, 18.8071f, 3.5147f, 20.4853f)
                    curveTo(5.1929f, 22.1635f, 7.3312f, 23.3064f, 9.6589f, 23.7694f)
                    curveTo(11.9867f, 24.2324f, 14.3995f, 23.9948f, 16.5922f, 23.0866f)
                    curveTo(18.7849f, 22.1783f, 20.6591f, 20.6402f, 21.9776f, 18.6668f)
                    curveTo(23.2962f, 16.6935f, 24.0f, 14.3734f, 24.0f, 12.0f)
                    curveTo(23.9966f, 8.8185f, 22.7312f, 5.7682f, 20.4815f, 3.5185f)
                    curveTo(18.2318f, 1.2688f, 15.1815f, 0.0034f, 12.0f, 0.0f)
                    verticalLineTo(0.0f)
                    close()
                    moveTo(13.0f, 11.879f)
                    curveTo(13.0001f, 12.0485f, 12.9571f, 12.2153f, 12.8751f, 12.3636f)
                    curveTo(12.793f, 12.5119f, 12.6746f, 12.637f, 12.531f, 12.727f)
                    lineTo(8.691f, 15.127f)
                    curveTo(8.5794f, 15.1967f, 8.4551f, 15.2438f, 8.3253f, 15.2655f)
                    curveTo(8.1955f, 15.2872f, 8.0627f, 15.2831f, 7.9344f, 15.2535f)
                    curveTo(7.8062f, 15.2239f, 7.6851f, 15.1693f, 7.5779f, 15.0929f)
                    curveTo(7.4708f, 15.0164f, 7.3797f, 14.9196f, 7.31f, 14.808f)
                    curveTo(7.2403f, 14.6964f, 7.1932f, 14.5721f, 7.1715f, 14.4423f)
                    curveTo(7.1498f, 14.3125f, 7.1539f, 14.1797f, 7.1835f, 14.0514f)
                    curveTo(7.2131f, 13.9232f, 7.2677f, 13.802f, 7.3441f, 13.6949f)
                    curveTo(7.4206f, 13.5878f, 7.5174f, 13.4967f, 7.629f, 13.427f)
                    lineTo(11.0f, 11.325f)
                    verticalLineTo(7.0f)
                    curveTo(11.0f, 6.7348f, 11.1054f, 6.4804f, 11.2929f, 6.2929f)
                    curveTo(11.4804f, 6.1054f, 11.7348f, 6.0f, 12.0f, 6.0f)
                    curveTo(12.2652f, 6.0f, 12.5196f, 6.1054f, 12.7071f, 6.2929f)
                    curveTo(12.8946f, 6.4804f, 13.0f, 6.7348f, 13.0f, 7.0f)
                    verticalLineTo(11.879f)
                    close()
                }
            }
        }
        .build()
        return _clock!!
    }

private var _clock: ImageVector? = null
