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
                    moveTo(12.0f, 0.0f)
                    curveTo(9.6266f, 0.0f, 7.3065f, 0.7038f, 5.3331f, 2.0224f)
                    curveTo(3.3598f, 3.3409f, 1.8217f, 5.2151f, 0.9134f, 7.4078f)
                    curveTo(0.0052f, 9.6005f, -0.2324f, 12.0133f, 0.2306f, 14.3411f)
                    curveTo(0.6936f, 16.6689f, 1.8365f, 18.8071f, 3.5147f, 20.4853f)
                    curveTo(5.1929f, 22.1635f, 7.3311f, 23.3064f, 9.6589f, 23.7694f)
                    curveTo(11.9867f, 24.2324f, 14.3995f, 23.9948f, 16.5922f, 23.0866f)
                    curveTo(18.7849f, 22.1783f, 20.6591f, 20.6402f, 21.9776f, 18.6668f)
                    curveTo(23.2962f, 16.6935f, 24.0f, 14.3734f, 24.0f, 12.0f)
                    curveTo(23.9966f, 8.8185f, 22.7312f, 5.7682f, 20.4815f, 3.5185f)
                    curveTo(18.2318f, 1.2688f, 15.1815f, 0.0034f, 12.0f, 0.0f)
                    verticalLineTo(0.0f)
                    close()
                    moveTo(12.0f, 2.0f)
                    curveTo(14.3067f, 1.9978f, 16.5424f, 2.797f, 18.325f, 4.261f)
                    lineTo(4.261f, 18.325f)
                    curveTo(3.062f, 16.8605f, 2.3036f, 15.0857f, 2.0738f, 13.2071f)
                    curveTo(1.8441f, 11.3284f, 2.1525f, 9.4232f, 2.9633f, 7.713f)
                    curveTo(3.774f, 6.0027f, 5.0537f, 4.5579f, 6.6535f, 3.5465f)
                    curveTo(8.2533f, 2.5352f, 10.1073f, 1.9988f, 12.0f, 2.0f)
                    close()
                    moveTo(12.0f, 22.0f)
                    curveTo(9.6933f, 22.0026f, 7.4573f, 21.2033f, 5.675f, 19.739f)
                    lineTo(19.739f, 5.675f)
                    curveTo(20.938f, 7.1395f, 21.6964f, 8.9143f, 21.9262f, 10.7929f)
                    curveTo(22.1559f, 12.6716f, 21.8474f, 14.5768f, 21.0367f, 16.2871f)
                    curveTo(20.226f, 17.9973f, 18.9463f, 19.4421f, 17.3465f, 20.4535f)
                    curveTo(15.7467f, 21.4648f, 13.8926f, 22.0011f, 12.0f, 22.0f)
                    close()
                }
            }
        }
        .build()
        return _ban!!
    }

private var _ban: ImageVector? = null
