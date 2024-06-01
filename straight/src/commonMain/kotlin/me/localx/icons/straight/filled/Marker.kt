package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.Marker: ImageVector
    get() {
        if (_marker != null) {
            return _marker!!
        }
        _marker = Builder(name = "Marker", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0002f, 0.0f)
                    curveTo(9.3489f, 0.0029f, 6.807f, 1.0574f, 4.9323f, 2.9321f)
                    curveTo(3.0576f, 4.8069f, 2.0031f, 7.3487f, 2.0001f, 10.0f)
                    curveTo(2.0001f, 15.282f, 10.4002f, 22.533f, 11.3542f, 23.343f)
                    lineTo(12.0002f, 23.889f)
                    lineTo(12.6462f, 23.343f)
                    curveTo(13.6002f, 22.533f, 22.0002f, 15.282f, 22.0002f, 10.0f)
                    curveTo(21.9972f, 7.3487f, 20.9427f, 4.8069f, 19.068f, 2.9321f)
                    curveTo(17.1933f, 1.0574f, 14.6514f, 0.0029f, 12.0002f, 0.0f)
                    verticalLineTo(0.0f)
                    close()
                    moveTo(12.0002f, 15.0f)
                    curveTo(11.0112f, 15.0f, 10.0445f, 14.7068f, 9.2223f, 14.1573f)
                    curveTo(8.4001f, 13.6079f, 7.7592f, 12.827f, 7.3808f, 11.9134f)
                    curveTo(7.0023f, 10.9998f, 6.9033f, 9.9944f, 7.0962f, 9.0246f)
                    curveTo(7.2892f, 8.0546f, 7.7654f, 7.1637f, 8.4646f, 6.4645f)
                    curveTo(9.1639f, 5.7652f, 10.0548f, 5.289f, 11.0247f, 5.0961f)
                    curveTo(11.9946f, 4.9032f, 12.9999f, 5.0022f, 13.9136f, 5.3806f)
                    curveTo(14.8272f, 5.759f, 15.6081f, 6.3999f, 16.1575f, 7.2221f)
                    curveTo(16.7069f, 8.0444f, 17.0002f, 9.0111f, 17.0002f, 10.0f)
                    curveTo(16.9986f, 11.3256f, 16.4713f, 12.5964f, 15.5339f, 13.5338f)
                    curveTo(14.5966f, 14.4711f, 13.3257f, 14.9984f, 12.0002f, 15.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0f, 13.0003f)
                    curveTo(13.6569f, 13.0003f, 15.0f, 11.6572f, 15.0f, 10.0003f)
                    curveTo(15.0f, 8.3434f, 13.6569f, 7.0003f, 12.0f, 7.0003f)
                    curveTo(10.3431f, 7.0003f, 9.0f, 8.3434f, 9.0f, 10.0003f)
                    curveTo(9.0f, 11.6572f, 10.3431f, 13.0003f, 12.0f, 13.0003f)
                    close()
                }
            }
        }
        .build()
        return _marker!!
    }

private var _marker: ImageVector? = null
