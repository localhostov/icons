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

public val Icons.Filled.AngleUp: ImageVector
    get() {
        if (_angleUp != null) {
            return _angleUp!!
        }
        _angleUp = Builder(name = "AngleUp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.5861f, 18.1479f)
                    lineTo(12.7071f, 8.2689f)
                    curveTo(12.517f, 8.0864f, 12.2636f, 7.9845f, 12.0001f, 7.9845f)
                    curveTo(11.7366f, 7.9845f, 11.4832f, 8.0864f, 11.2931f, 8.2689f)
                    lineTo(1.4201f, 18.1419f)
                    lineTo(0.0061f, 16.7279f)
                    lineTo(9.8791f, 6.8549f)
                    curveTo(10.4507f, 6.3095f, 11.2105f, 6.0051f, 12.0006f, 6.0051f)
                    curveTo(12.7907f, 6.0051f, 13.5505f, 6.3095f, 14.1221f, 6.8549f)
                    lineTo(24.0001f, 16.7339f)
                    lineTo(22.5861f, 18.1479f)
                    close()
                }
            }
        }
        .build()
        return _angleUp!!
    }

private var _angleUp: ImageVector? = null
