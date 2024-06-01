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

public val Icons.Filled.Ban: ImageVector
    get() {
        if (_ban != null) {
            return _ban!!
        }
        _ban = Builder(name = "Ban", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0f, 24.0f)
                    curveTo(14.3734f, 24.0f, 16.6935f, 23.2962f, 18.6668f, 21.9776f)
                    curveTo(20.6402f, 20.6591f, 22.1783f, 18.7849f, 23.0866f, 16.5922f)
                    curveTo(23.9948f, 14.3995f, 24.2324f, 11.9867f, 23.7694f, 9.6589f)
                    curveTo(23.3064f, 7.3312f, 22.1635f, 5.1929f, 20.4853f, 3.5147f)
                    curveTo(18.8071f, 1.8365f, 16.6689f, 0.6936f, 14.3411f, 0.2306f)
                    curveTo(12.0133f, -0.2324f, 9.6005f, 0.0052f, 7.4078f, 0.9135f)
                    curveTo(5.2151f, 1.8217f, 3.3409f, 3.3598f, 2.0224f, 5.3332f)
                    curveTo(0.7038f, 7.3066f, 0.0f, 9.6266f, 0.0f, 12.0f)
                    curveTo(0.0034f, 15.1815f, 1.2688f, 18.2318f, 3.5185f, 20.4815f)
                    curveTo(5.7682f, 22.7312f, 8.8185f, 23.9966f, 12.0f, 24.0f)
                    close()
                    moveTo(22.0f, 12.0f)
                    curveTo(22.0016f, 13.8927f, 21.4656f, 15.747f, 20.4544f, 17.3469f)
                    curveTo(19.4431f, 18.9469f, 17.9983f, 20.2267f, 16.288f, 21.0374f)
                    curveTo(14.5777f, 21.8481f, 12.6723f, 22.1564f, 10.7936f, 21.9264f)
                    curveTo(8.9149f, 21.6963f, 7.1402f, 20.9374f, 5.676f, 19.738f)
                    lineTo(19.738f, 5.676f)
                    curveTo(21.2023f, 7.4581f, 22.0018f, 9.6935f, 22.0f, 12.0f)
                    close()
                    moveTo(12.0f, 2.0f)
                    curveTo(14.3065f, 1.9982f, 16.5419f, 2.7978f, 18.324f, 4.262f)
                    lineTo(4.262f, 18.324f)
                    curveTo(3.0626f, 16.8598f, 2.3037f, 15.0851f, 2.0736f, 13.2064f)
                    curveTo(1.8436f, 11.3277f, 2.1519f, 9.4223f, 2.9626f, 7.712f)
                    curveTo(3.7733f, 6.0017f, 5.0531f, 4.5569f, 6.6531f, 3.5457f)
                    curveTo(8.253f, 2.5344f, 10.1073f, 1.9984f, 12.0f, 2.0f)
                    close()
                }
            }
        }
        .build()
        return _ban!!
    }

private var _ban: ImageVector? = null
