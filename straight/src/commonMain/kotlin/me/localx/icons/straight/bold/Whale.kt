package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.Whale: ImageVector
    get() {
        if (_whale != null) {
            return _whale!!
        }
        _whale = Builder(name = "Whale", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.5f, 19.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(16.504f, 8.002f)
                lineToRelative(-2.003f, -0.002f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.0f)
                curveToRelative(-3.382f, 0.0f, -7.183f, 2.855f, -9.5f, 4.931f)
                verticalLineToRelative(3.993f)
                lineToRelative(0.102f, 0.094f)
                curveToRelative(1.549f, -1.674f, 6.255f, -6.018f, 9.398f, -6.018f)
                lineToRelative(2.003f, 0.002f)
                curveToRelative(2.479f, 0.0f, 4.497f, 2.018f, 4.497f, 4.497f)
                verticalLineToRelative(3.001f)
                curveToRelative(0.0f, 1.378f, -1.121f, 2.5f, -2.5f, 2.5f)
                lineTo(6.5f, 21.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-3.972f)
                curveToRelative(0.0f, -1.684f, 0.493f, -3.314f, 1.428f, -4.715f)
                lineToRelative(2.281f, -3.422f)
                curveToRelative(2.456f, -0.556f, 4.292f, -2.769f, 4.292f, -5.391f)
                curveToRelative(-4.173f, 0.0f, -5.5f, 2.776f, -5.5f, 2.776f)
                curveToRelative(0.0f, 0.0f, -1.378f, -2.776f, -5.5f, -2.776f)
                curveToRelative(0.0f, 2.262f, 1.365f, 4.219f, 3.317f, 5.071f)
                lineToRelative(-1.385f, 2.077f)
                curveToRelative(-1.264f, 1.895f, -1.932f, 4.101f, -1.932f, 6.379f)
                verticalLineToRelative(3.972f)
                curveToRelative(0.0f, 3.584f, 2.916f, 6.5f, 6.5f, 6.5f)
                horizontalLineToRelative(12.0f)
                curveToRelative(3.032f, 0.0f, 5.5f, -2.467f, 5.5f, -5.5f)
                verticalLineToRelative(-3.001f)
                curveToRelative(0.0f, -4.134f, -3.363f, -7.497f, -7.496f, -7.497f)
                close()
            }
        }
        .build()
        return _whale!!
    }

private var _whale: ImageVector? = null
