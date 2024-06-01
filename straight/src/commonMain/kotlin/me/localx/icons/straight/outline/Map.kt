package me.localx.icons.straight.outline

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

public val Icons.Outline.Map: ImageVector
    get() {
        if (_map != null) {
            return _map!!
        }
        _map = Builder(name = "Map", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.867f, 1.6123f)
                    lineTo(17.515f, 0.1553f)
                    curveTo(16.936f, -0.0413f, 16.3102f, -0.0536f, 15.724f, 0.1203f)
                    lineTo(8.538f, 2.0923f)
                    lineTo(4.155f, 0.2333f)
                    curveTo(3.6992f, 0.0432f, 3.2036f, -0.0315f, 2.712f, 0.0159f)
                    curveTo(2.2204f, 0.0633f, 1.7482f, 0.2313f, 1.3371f, 0.5051f)
                    curveTo(0.9261f, 0.7788f, 0.589f, 1.1497f, 0.3557f, 1.585f)
                    curveTo(0.1225f, 2.0203f, 3.0E-4f, 2.5064f, -0.0f, 3.0003f)
                    lineTo(-0.0f, 21.7543f)
                    lineTo(7.982f, 24.0353f)
                    lineTo(16.003f, 22.0353f)
                    lineTo(24.003f, 23.9833f)
                    verticalLineTo(4.4833f)
                    curveTo(24.0026f, 3.8388f, 23.7946f, 3.2115f, 23.4099f, 2.6944f)
                    curveTo(23.0252f, 2.1774f, 22.4842f, 1.7979f, 21.867f, 1.6123f)
                    close()
                    moveTo(15.0f, 2.3843f)
                    verticalLineTo(20.2193f)
                    lineTo(9.0f, 21.7193f)
                    verticalLineTo(3.9723f)
                    lineTo(15.0f, 2.3843f)
                    close()
                    moveTo(2.0f, 3.0003f)
                    curveTo(2.0003f, 2.8356f, 2.0413f, 2.6736f, 2.1194f, 2.5286f)
                    curveTo(2.1974f, 2.3835f, 2.31f, 2.2601f, 2.4472f, 2.169f)
                    curveTo(2.5845f, 2.078f, 2.742f, 2.0223f, 2.906f, 2.0068f)
                    curveTo(3.0699f, 1.9913f, 3.2352f, 2.0166f, 3.387f, 2.0803f)
                    lineTo(7.0f, 3.5813f)
                    verticalLineTo(21.6743f)
                    lineTo(2.0f, 20.2463f)
                    verticalLineTo(3.0003f)
                    close()
                    moveTo(22.0f, 21.4303f)
                    lineTo(17.0f, 20.2123f)
                    verticalLineTo(2.0923f)
                    lineTo(21.275f, 3.5223f)
                    curveTo(21.4838f, 3.582f, 21.6675f, 3.7081f, 21.7983f, 3.8815f)
                    curveTo(21.9291f, 4.0549f, 21.9999f, 4.2661f, 22.0f, 4.4833f)
                    verticalLineTo(21.4303f)
                    close()
                }
            }
        }
        .build()
        return _map!!
    }

private var _map: ImageVector? = null
