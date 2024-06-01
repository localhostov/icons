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

public val Icons.Filled.Apple: ImageVector
    get() {
        if (_apple != null) {
            return _apple!!
        }
        _apple = Builder(name = "Apple", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(19.4091f, 7.0261f)
                    curveTo(16.2891f, 8.3801f, 15.8931f, 7.8931f, 13.0001f, 8.0001f)
                    verticalLineTo(6.0001f)
                    curveTo(13.037f, 4.043f, 12.4912f, 2.1192f, 11.4321f, 0.4731f)
                    curveTo(11.3441f, 0.3241f, 11.2621f, 0.1851f, 11.1901f, 0.0521f)
                    lineTo(9.4351f, 1.0101f)
                    curveTo(9.5161f, 1.1601f, 9.6091f, 1.3181f, 9.7081f, 1.4871f)
                    curveTo(10.5869f, 2.8254f, 11.0375f, 4.3995f, 11.0001f, 6.0001f)
                    verticalLineTo(6.4091f)
                    curveTo(5.5501f, 4.5631f, -0.0669f, 9.1001f, 1.0E-4f, 15.0001f)
                    curveTo(-0.1069f, 21.3311f, 6.4171f, 25.9531f, 12.0001f, 23.2001f)
                    curveTo(22.4591f, 27.6191f, 28.7931f, 12.4441f, 19.4091f, 7.0261f)
                    close()
                    moveTo(19.5331f, 4.4861f)
                    curveTo(18.2616f, 5.5345f, 16.6464f, 6.074f, 15.0001f, 6.0001f)
                    curveTo(14.8761f, 2.2271f, 17.1651f, -0.1869f, 20.9921f, 0.0081f)
                    curveTo(21.0933f, 1.632f, 20.5716f, 3.2335f, 19.5331f, 4.4861f)
                    close()
                }
            }
        }
        .build()
        return _apple!!
    }

private var _apple: ImageVector? = null
