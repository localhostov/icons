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

public val Icons.Filled.ArrowTurnLeftUp: ImageVector
    get() {
        if (_arrowTurnLeftUp != null) {
            return _arrowTurnLeftUp!!
        }
        _arrowTurnLeftUp = Builder(name = "ArrowTurnLeftUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 22.0f)
                horizontalLineTo(13.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineTo(2.388f)
                curveToRelative(0.037f, 0.03f, 0.084f, 0.043f, 0.119f, 0.077f)
                lineToRelative(5.177f, 5.134f)
                curveToRelative(0.195f, 0.193f, 0.45f, 0.29f, 0.704f, 0.29f)
                curveToRelative(0.257f, 0.0f, 0.515f, -0.099f, 0.71f, -0.296f)
                curveToRelative(0.389f, -0.392f, 0.386f, -1.025f, -0.006f, -1.414f)
                lineTo(11.53f, 1.048f)
                curveToRelative(-1.352f, -1.352f, -3.711f, -1.349f, -5.057f, -0.003f)
                lineTo(1.296f, 6.179f)
                curveToRelative(-0.392f, 0.389f, -0.395f, 1.022f, -0.006f, 1.414f)
                curveToRelative(0.389f, 0.393f, 1.022f, 0.395f, 1.414f, 0.006f)
                lineTo(7.884f, 2.462f)
                curveToRelative(0.033f, -0.033f, 0.08f, -0.046f, 0.116f, -0.075f)
                verticalLineTo(19.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _arrowTurnLeftUp!!
    }

private var _arrowTurnLeftUp: ImageVector? = null
