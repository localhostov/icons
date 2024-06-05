package me.localx.icons.rounded.outline

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

public val Icons.Outline.TurnLeft: ImageVector
    get() {
        if (_turnLeft != null) {
            return _turnLeft!!
        }
        _turnLeft = Builder(name = "TurnLeft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 13.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 0.552f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                horizontalLineTo(2.367f)
                curveToRelative(0.032f, 0.039f, 0.059f, 0.08f, 0.095f, 0.116f)
                lineToRelative(5.137f, 5.18f)
                curveToRelative(0.389f, 0.392f, 0.387f, 1.025f, -0.006f, 1.414f)
                curveToRelative(-0.195f, 0.193f, -0.449f, 0.29f, -0.704f, 0.29f)
                curveToRelative(-0.258f, 0.0f, -0.515f, -0.099f, -0.71f, -0.296f)
                lineTo(1.045f, 11.527f)
                curveToRelative(-0.673f, -0.673f, -1.045f, -1.572f, -1.045f, -2.527f)
                reflectiveCurveToRelative(0.372f, -1.854f, 1.048f, -2.529f)
                lineTo(6.179f, 1.296f)
                curveToRelative(0.39f, -0.393f, 1.022f, -0.394f, 1.414f, -0.006f)
                curveToRelative(0.393f, 0.389f, 0.395f, 1.022f, 0.006f, 1.414f)
                lineTo(2.465f, 7.881f)
                curveToRelative(-0.037f, 0.037f, -0.065f, 0.079f, -0.098f, 0.119f)
                horizontalLineToRelative(16.633f)
                curveToRelative(2.757f, 0.0f, 5.0f, 2.243f, 5.0f, 5.0f)
                close()
            }
        }
        .build()
        return _turnLeft!!
    }

private var _turnLeft: ImageVector? = null
