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

public val Icons.Outline.TurnRight: ImageVector
    get() {
        if (_turnRight != null) {
            return _turnRight!!
        }
        _turnRight = Builder(name = "TurnRight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 9.0f)
                curveToRelative(0.0f, 0.956f, -0.372f, 1.854f, -1.048f, 2.53f)
                lineToRelative(-5.131f, 5.174f)
                curveToRelative(-0.195f, 0.197f, -0.453f, 0.296f, -0.71f, 0.296f)
                curveToRelative(-0.254f, 0.0f, -0.509f, -0.097f, -0.704f, -0.29f)
                curveToRelative(-0.392f, -0.389f, -0.395f, -1.021f, -0.006f, -1.414f)
                lineToRelative(5.134f, -5.177f)
                curveToRelative(0.037f, -0.037f, 0.065f, -0.079f, 0.098f, -0.119f)
                horizontalLineTo(5.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0.0f, -2.757f, 2.243f, -5.0f, 5.0f, -5.0f)
                horizontalLineToRelative(16.633f)
                curveToRelative(-0.032f, -0.039f, -0.059f, -0.08f, -0.095f, -0.116f)
                lineToRelative(-5.137f, -5.18f)
                curveToRelative(-0.389f, -0.392f, -0.386f, -1.025f, 0.006f, -1.414f)
                curveToRelative(0.393f, -0.388f, 1.026f, -0.386f, 1.414f, 0.006f)
                lineToRelative(5.134f, 5.177f)
                curveToRelative(0.673f, 0.673f, 1.045f, 1.571f, 1.045f, 2.527f)
                close()
            }
        }
        .build()
        return _turnRight!!
    }

private var _turnRight: ImageVector? = null
