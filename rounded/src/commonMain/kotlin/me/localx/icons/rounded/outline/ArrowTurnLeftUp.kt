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

public val Icons.Outline.ArrowTurnLeftUp: ImageVector
    get() {
        if (_arrowTurnLeftUp != null) {
            return _arrowTurnLeftUp!!
        }
        _arrowTurnLeftUp = Builder(name = "ArrowTurnLeftUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 23.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineTo(13.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                verticalLineTo(2.387f)
                curveToRelative(-0.036f, 0.03f, -0.082f, 0.042f, -0.116f, 0.075f)
                lineTo(2.704f, 7.599f)
                curveToRelative(-0.392f, 0.389f, -1.025f, 0.387f, -1.414f, -0.006f)
                curveToRelative(-0.389f, -0.392f, -0.386f, -1.025f, 0.006f, -1.414f)
                lineTo(6.473f, 1.045f)
                curveToRelative(1.346f, -1.346f, 3.705f, -1.349f, 5.057f, 0.003f)
                lineToRelative(5.174f, 5.131f)
                curveToRelative(0.392f, 0.389f, 0.395f, 1.022f, 0.006f, 1.414f)
                curveToRelative(-0.195f, 0.197f, -0.453f, 0.296f, -0.71f, 0.296f)
                curveToRelative(-0.254f, 0.0f, -0.509f, -0.097f, -0.704f, -0.29f)
                lineTo(10.119f, 2.465f)
                curveToRelative(-0.034f, -0.034f, -0.082f, -0.047f, -0.119f, -0.077f)
                verticalLineTo(19.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _arrowTurnLeftUp!!
    }

private var _arrowTurnLeftUp: ImageVector? = null
