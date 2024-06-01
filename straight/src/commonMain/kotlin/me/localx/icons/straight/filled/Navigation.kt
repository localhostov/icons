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

public val Icons.Filled.Navigation: ImageVector
    get() {
        if (_navigation != null) {
            return _navigation!!
        }
        _navigation = Builder(name = "Navigation", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(7.093f, 11.071f)
                    lineTo(6.985f, 11.043f)
                    lineTo(15.1f, 8.9f)
                    lineTo(12.986f, 17.0f)
                    lineTo(11.267f, 12.729f)
                    lineTo(7.093f, 11.071f)
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
                    moveTo(17.9f, 6.1f)
                    lineTo(6.461f, 9.113f)
                    curveTo(6.0405f, 9.2276f, 5.6694f, 9.4776f, 5.4053f, 9.8243f)
                    curveTo(5.1412f, 10.171f, 4.9988f, 10.5951f, 5.0f, 11.031f)
                    curveTo(4.9899f, 11.4515f, 5.1164f, 11.864f, 5.3605f, 12.2066f)
                    curveTo(5.6046f, 12.5491f, 5.9532f, 12.8033f, 6.354f, 12.931f)
                    lineTo(9.733f, 14.273f)
                    lineTo(11.082f, 17.613f)
                    curveTo(11.2093f, 18.0174f, 11.4629f, 18.3704f, 11.8056f, 18.6201f)
                    curveTo(12.1483f, 18.8697f, 12.562f, 19.0029f, 12.986f, 19.0f)
                    horizontalLineTo(13.0f)
                    curveTo(13.4385f, 19.0f, 13.8647f, 18.855f, 14.2122f, 18.5877f)
                    curveTo(14.5598f, 18.3204f, 14.8094f, 17.9458f, 14.922f, 17.522f)
                    lineTo(17.9f, 6.1f)
                    close()
                }
            }
        }
        .build()
        return _navigation!!
    }

private var _navigation: ImageVector? = null
