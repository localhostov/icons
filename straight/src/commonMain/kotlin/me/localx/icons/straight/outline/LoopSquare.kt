package me.localx.icons.straight.outline

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

public val Icons.Outline.LoopSquare: ImageVector
    get() {
        if (_loopSquare != null) {
            return _loopSquare!!
        }
        _loopSquare = Builder(name = "LoopSquare", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.5f, 10.5f)
                lineToRelative(-2.5f, -2.5f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 2.206f, -1.794f, 4.0f, -4.0f, 4.0f)
                lineTo(6.0f, 24.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                lineTo(18.0f, 8.0f)
                lineToRelative(-2.5f, 2.5f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(3.5f, -3.5f)
                curveToRelative(0.779f, -0.78f, 2.049f, -0.78f, 2.828f, 0.0f)
                lineToRelative(3.5f, 3.5f)
                lineToRelative(-1.414f, 1.414f)
                close()
                moveTo(9.914f, 14.914f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-2.5f, 2.5f)
                lineTo(6.0f, 4.0f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(10.0f)
                lineTo(18.0f, 0.0f)
                lineTo(8.0f, 0.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, 1.794f, -4.0f, 4.0f)
                verticalLineToRelative(12.0f)
                lineToRelative(-2.5f, -2.5f)
                lineTo(0.086f, 14.914f)
                lineToRelative(3.5f, 3.5f)
                curveToRelative(0.39f, 0.39f, 0.902f, 0.585f, 1.414f, 0.585f)
                reflectiveCurveToRelative(1.024f, -0.195f, 1.414f, -0.585f)
                lineToRelative(3.5f, -3.5f)
                close()
            }
        }
        .build()
        return _loopSquare!!
    }

private var _loopSquare: ImageVector? = null
