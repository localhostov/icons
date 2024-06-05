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

public val Icons.Filled.SquareZ: ImageVector
    get() {
        if (_squareZ != null) {
            return _squareZ!!
        }
        _squareZ = Builder(name = "SquareZ", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 0.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                verticalLineToRelative(21.0f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(19.0f, 19.0f)
                lineTo(6.767f, 19.0f)
                curveToRelative(-0.716f, 0.0f, -1.357f, -0.428f, -1.631f, -1.09f)
                curveToRelative(-0.274f, -0.661f, -0.125f, -1.417f, 0.382f, -1.924f)
                lineToRelative(0.077f, -0.069f)
                lineToRelative(10.972f, -8.917f)
                lineTo(5.0f, 7.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(12.233f)
                curveToRelative(0.716f, 0.0f, 1.357f, 0.428f, 1.631f, 1.09f)
                curveToRelative(0.274f, 0.661f, 0.125f, 1.417f, -0.382f, 1.924f)
                lineToRelative(-0.077f, 0.069f)
                lineToRelative(-10.972f, 8.917f)
                horizontalLineToRelative(11.566f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _squareZ!!
    }

private var _squareZ: ImageVector? = null
