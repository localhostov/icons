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

public val Icons.Outline.TurnLeftDown: ImageVector
    get() {
        if (_turnLeftDown != null) {
            return _turnLeftDown!!
        }
        _turnLeftDown = Builder(name = "TurnLeftDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 1.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-8.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(16.614f)
                curveToRelative(0.036f, -0.03f, 0.083f, -0.042f, 0.116f, -0.075f)
                lineToRelative(5.18f, -5.137f)
                curveToRelative(0.392f, -0.389f, 1.026f, -0.386f, 1.414f, 0.006f)
                curveToRelative(0.389f, 0.393f, 0.386f, 1.025f, -0.006f, 1.414f)
                lineToRelative(-5.177f, 5.134f)
                curveToRelative(-0.673f, 0.673f, -1.572f, 1.045f, -2.527f, 1.045f)
                reflectiveCurveToRelative(-1.854f, -0.372f, -2.529f, -1.048f)
                lineToRelative(-5.175f, -5.131f)
                curveToRelative(-0.392f, -0.389f, -0.395f, -1.021f, -0.006f, -1.414f)
                curveToRelative(0.388f, -0.393f, 1.021f, -0.396f, 1.414f, -0.006f)
                lineToRelative(5.177f, 5.134f)
                curveToRelative(0.034f, 0.034f, 0.082f, 0.047f, 0.119f, 0.077f)
                verticalLineTo(5.0f)
                curveToRelative(0.0f, -2.757f, 2.243f, -5.0f, 5.0f, -5.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _turnLeftDown!!
    }

private var _turnLeftDown: ImageVector? = null
