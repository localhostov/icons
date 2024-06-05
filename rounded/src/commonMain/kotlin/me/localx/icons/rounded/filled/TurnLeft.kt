package me.localx.icons.rounded.filled

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

public val Icons.Filled.TurnLeft: ImageVector
    get() {
        if (_turnLeft != null) {
            return _turnLeft!!
        }
        _turnLeft = Builder(name = "TurnLeft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 8.0f)
                horizontalLineTo(2.367f)
                curveToRelative(0.033f, -0.04f, 0.061f, -0.082f, 0.098f, -0.119f)
                lineTo(7.599f, 2.704f)
                curveToRelative(0.389f, -0.392f, 0.387f, -1.025f, -0.006f, -1.414f)
                curveToRelative(-0.392f, -0.388f, -1.024f, -0.387f, -1.414f, 0.006f)
                lineTo(1.048f, 6.471f)
                curveToRelative(-0.676f, 0.676f, -1.048f, 1.574f, -1.048f, 2.529f)
                reflectiveCurveToRelative(0.372f, 1.854f, 1.045f, 2.527f)
                lineToRelative(5.134f, 5.177f)
                curveToRelative(0.195f, 0.197f, 0.452f, 0.296f, 0.71f, 0.296f)
                curveToRelative(0.255f, 0.0f, 0.509f, -0.097f, 0.704f, -0.29f)
                curveToRelative(0.393f, -0.389f, 0.395f, -1.022f, 0.006f, -1.414f)
                lineToRelative(-5.137f, -5.18f)
                curveToRelative(-0.036f, -0.036f, -0.063f, -0.078f, -0.095f, -0.116f)
                horizontalLineToRelative(16.633f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 0.552f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
            }
        }
        .build()
        return _turnLeft!!
    }

private var _turnLeft: ImageVector? = null
