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
                moveToRelative(10.0f, 3.0f)
                verticalLineToRelative(18.049f)
                lineToRelative(5.795f, -5.758f)
                lineToRelative(1.409f, 1.418f)
                lineToRelative(-6.721f, 6.677f)
                curveToRelative(-0.394f, 0.396f, -0.922f, 0.614f, -1.484f, 0.614f)
                reflectiveCurveToRelative(-1.09f, -0.219f, -1.487f, -0.616f)
                lineTo(0.795f, 16.709f)
                lineToRelative(1.409f, -1.418f)
                lineToRelative(5.795f, 5.758f)
                verticalLineTo(3.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-11.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, 0.449f, -1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _turnLeftDown!!
    }

private var _turnLeftDown: ImageVector? = null
