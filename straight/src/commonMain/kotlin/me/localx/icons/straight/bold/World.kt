package me.localx.icons.straight.bold

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

public val Icons.Bold.World: ImageVector
    get() {
        if (_world != null) {
            return _world!!
        }
        _world = Builder(name = "World", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                    moveTo(12.0f, 21.0f)
                    verticalLineTo(16.693f)
                    curveTo(12.0f, 16.4609f, 11.9078f, 16.2384f, 11.7437f, 16.0743f)
                    curveTo(11.5796f, 15.9102f, 11.3571f, 15.818f, 11.125f, 15.818f)
                    horizontalLineTo(6.75f)
                    lineTo(3.0f, 12.072f)
                    curveTo(3.0f, 12.048f, 3.0f, 12.024f, 3.0f, 12.0f)
                    curveTo(2.9981f, 10.3064f, 3.4746f, 8.6467f, 4.3748f, 7.2121f)
                    curveTo(5.275f, 5.7775f, 6.5621f, 4.6264f, 8.0879f, 3.8914f)
                    curveTo(9.6137f, 3.1563f, 11.3162f, 2.8674f, 12.9991f, 3.0577f)
                    curveTo(14.682f, 3.248f, 16.2768f, 3.9098f, 17.6f, 4.967f)
                    lineTo(17.249f, 5.318f)
                    horizontalLineTo(13.909f)
                    verticalLineTo(9.136f)
                    horizontalLineTo(11.045f)
                    verticalLineTo(12.08f)
                    curveTo(11.045f, 12.3121f, 11.1372f, 12.5346f, 11.3013f, 12.6987f)
                    curveTo(11.4654f, 12.8628f, 11.6879f, 12.955f, 11.92f, 12.955f)
                    horizontalLineTo(17.727f)
                    verticalLineTo(13.9f)
                    curveTo(17.7291f, 15.2486f, 18.1873f, 16.5568f, 19.027f, 17.612f)
                    curveTo(18.1858f, 18.6687f, 17.1171f, 19.522f, 15.9005f, 20.1086f)
                    curveTo(14.6839f, 20.6952f, 13.3506f, 20.9999f, 12.0f, 21.0f)
                    close()
                }
            }
        }
        .build()
        return _world!!
    }

private var _world: ImageVector? = null
