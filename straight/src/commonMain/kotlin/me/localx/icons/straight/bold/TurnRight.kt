package me.localx.icons.straight.bold

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

public val Icons.Bold.TurnRight: ImageVector
    get() {
        if (_turnRight != null) {
            return _turnRight!!
        }
        _turnRight = Builder(name = "TurnRight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.238f, 11.34f)
                lineToRelative(-6.173f, 6.217f)
                lineToRelative(-2.129f, -2.113f)
                lineToRelative(4.412f, -4.443f)
                horizontalLineTo(3.5f)
                curveToRelative(-0.276f, 0.0f, -0.5f, 0.224f, -0.5f, 0.5f)
                verticalLineToRelative(10.5f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(-10.5f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(15.848f)
                lineToRelative(-4.412f, -4.443f)
                lineToRelative(2.129f, -2.114f)
                lineToRelative(6.177f, 6.221f)
                curveToRelative(1.011f, 1.011f, 1.011f, 2.662f, -0.004f, 3.676f)
                close()
            }
        }
        .build()
        return _turnRight!!
    }

private var _turnRight: ImageVector? = null
