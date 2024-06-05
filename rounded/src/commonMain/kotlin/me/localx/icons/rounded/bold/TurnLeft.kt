package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.TurnLeft: ImageVector
    get() {
        if (_turnLeft != null) {
            return _turnLeft!!
        }
        _turnLeft = Builder(name = "TurnLeft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 13.5f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 0.829f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.671f, -1.5f, -1.5f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -1.378f, -1.121f, -2.5f, -2.5f, -2.5f)
                horizontalLineTo(3.901f)
                lineToRelative(4.634f, 4.414f)
                curveToRelative(0.6f, 0.571f, 0.622f, 1.521f, 0.051f, 2.121f)
                curveToRelative(-0.295f, 0.31f, -0.69f, 0.465f, -1.086f, 0.465f)
                curveToRelative(-0.372f, 0.0f, -0.744f, -0.137f, -1.035f, -0.414f)
                lineTo(1.345f, 12.707f)
                curveToRelative(-0.876f, -0.875f, -1.345f, -2.004f, -1.345f, -3.207f)
                reflectiveCurveToRelative(0.469f, -2.333f, 1.318f, -3.182f)
                lineTo(6.465f, 1.414f)
                curveToRelative(0.601f, -0.571f, 1.549f, -0.549f, 2.121f, 0.051f)
                curveToRelative(0.571f, 0.6f, 0.549f, 1.549f, -0.051f, 2.121f)
                lineToRelative(-4.633f, 4.414f)
                horizontalLineToRelative(14.598f)
                curveToRelative(3.032f, 0.0f, 5.5f, 2.467f, 5.5f, 5.5f)
                close()
            }
        }
        .build()
        return _turnLeft!!
    }

private var _turnLeft: ImageVector? = null
