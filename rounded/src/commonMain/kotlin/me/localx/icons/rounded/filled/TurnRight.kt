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

public val Icons.Filled.TurnRight: ImageVector
    get() {
        if (_turnRight != null) {
            return _turnRight!!
        }
        _turnRight = Builder(name = "TurnRight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.955f, 6.473f)
                lineToRelative(-5.134f, -5.177f)
                curveToRelative(-0.388f, -0.392f, -1.021f, -0.394f, -1.414f, -0.006f)
                curveToRelative(-0.392f, 0.389f, -0.395f, 1.022f, -0.006f, 1.414f)
                lineToRelative(5.137f, 5.18f)
                curveToRelative(0.036f, 0.036f, 0.063f, 0.077f, 0.095f, 0.116f)
                horizontalLineTo(5.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, 2.243f, -5.0f, 5.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 0.553f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(16.633f)
                curveToRelative(-0.033f, 0.04f, -0.061f, 0.082f, -0.098f, 0.119f)
                lineToRelative(-5.134f, 5.177f)
                curveToRelative(-0.389f, 0.393f, -0.386f, 1.025f, 0.006f, 1.414f)
                curveToRelative(0.195f, 0.193f, 0.45f, 0.29f, 0.704f, 0.29f)
                curveToRelative(0.257f, 0.0f, 0.515f, -0.099f, 0.71f, -0.296f)
                lineToRelative(5.131f, -5.174f)
                curveToRelative(0.676f, -0.676f, 1.048f, -1.574f, 1.048f, -2.53f)
                reflectiveCurveToRelative(-0.372f, -1.854f, -1.045f, -2.527f)
                close()
            }
        }
        .build()
        return _turnRight!!
    }

private var _turnRight: ImageVector? = null
