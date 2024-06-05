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

public val Icons.Filled.TurnLeftDown: ImageVector
    get() {
        if (_turnLeftDown != null) {
            return _turnLeftDown!!
        }
        _turnLeftDown = Builder(name = "TurnLeftDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 0.0f)
                horizontalLineToRelative(-8.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, 2.243f, -5.0f, 5.0f)
                verticalLineToRelative(16.612f)
                curveToRelative(-0.037f, -0.03f, -0.084f, -0.043f, -0.119f, -0.077f)
                lineToRelative(-5.177f, -5.134f)
                curveToRelative(-0.393f, -0.39f, -1.026f, -0.387f, -1.414f, 0.006f)
                curveToRelative(-0.389f, 0.393f, -0.386f, 1.025f, 0.006f, 1.414f)
                lineToRelative(5.175f, 5.131f)
                curveToRelative(0.676f, 0.676f, 1.574f, 1.048f, 2.529f, 1.048f)
                reflectiveCurveToRelative(1.854f, -0.372f, 2.527f, -1.045f)
                lineToRelative(5.177f, -5.134f)
                curveToRelative(0.392f, -0.389f, 0.395f, -1.021f, 0.006f, -1.414f)
                curveToRelative(-0.388f, -0.392f, -1.022f, -0.395f, -1.414f, -0.006f)
                lineToRelative(-5.18f, 5.137f)
                curveToRelative(-0.034f, 0.034f, -0.08f, 0.046f, -0.116f, 0.075f)
                verticalLineTo(5.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _turnLeftDown!!
    }

private var _turnLeftDown: ImageVector? = null
