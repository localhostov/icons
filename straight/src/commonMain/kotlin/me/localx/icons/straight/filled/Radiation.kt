package me.localx.icons.straight.filled

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

public val Icons.Filled.Radiation: ImageVector
    get() {
        if (_radiation != null) {
            return _radiation!!
        }
        _radiation = Builder(name = "Radiation", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.0f, 11.0f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                close()
                moveTo(24.0f, 11.0f)
                curveToRelative(0.0f, -4.308f, -2.335f, -8.307f, -6.093f, -10.438f)
                lineToRelative(-0.829f, -0.47f)
                lineToRelative(-4.323f, 6.842f)
                lineToRelative(0.998f, 0.491f)
                curveToRelative(1.386f, 0.682f, 2.246f, 2.051f, 2.247f, 3.573f)
                verticalLineToRelative(0.998f)
                reflectiveCurveToRelative(8.0f, 0.004f, 8.0f, 0.004f)
                verticalLineToRelative(-1.001f)
                close()
                moveTo(7.999f, 11.997f)
                verticalLineToRelative(-0.998f)
                curveToRelative(0.002f, -1.522f, 0.862f, -2.892f, 2.248f, -3.573f)
                lineToRelative(0.998f, -0.491f)
                lineTo(6.922f, 0.092f)
                lineToRelative(-0.829f, 0.47f)
                curveTo(2.335f, 2.692f, 0.0f, 6.691f, 0.0f, 10.999f)
                verticalLineToRelative(1.001f)
                lineToRelative(7.999f, -0.004f)
                close()
                moveTo(18.339f, 21.176f)
                lineToRelative(0.81f, -0.506f)
                lineToRelative(-3.962f, -7.042f)
                lineToRelative(-0.904f, 0.636f)
                curveToRelative(-1.374f, 0.967f, -3.202f, 0.961f, -4.568f, 0.003f)
                lineToRelative(-0.904f, -0.633f)
                lineToRelative(-3.958f, 7.035f)
                lineToRelative(0.81f, 0.506f)
                curveToRelative(1.91f, 1.194f, 4.103f, 1.826f, 6.339f, 1.826f)
                reflectiveCurveToRelative(4.431f, -0.631f, 6.339f, -1.825f)
                close()
            }
        }
        .build()
        return _radiation!!
    }

private var _radiation: ImageVector? = null
