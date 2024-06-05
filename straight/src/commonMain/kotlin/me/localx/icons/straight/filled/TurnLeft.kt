package me.localx.icons.straight.filled

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
                moveToRelative(24.0f, 11.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-11.0f)
                curveToRelative(0.0f, -0.551f, -0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineTo(2.951f)
                lineToRelative(5.758f, 5.795f)
                lineToRelative(-1.418f, 1.409f)
                lineTo(0.614f, 10.484f)
                curveToRelative(-0.396f, -0.394f, -0.614f, -0.922f, -0.614f, -1.484f)
                reflectiveCurveToRelative(0.219f, -1.09f, 0.616f, -1.487f)
                lineTo(7.291f, 0.795f)
                lineToRelative(1.418f, 1.409f)
                lineToRelative(-5.758f, 5.795f)
                horizontalLineToRelative(18.049f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _turnLeft!!
    }

private var _turnLeft: ImageVector? = null
