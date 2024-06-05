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

public val Icons.Filled.SquareN: ImageVector
    get() {
        if (_squareN != null) {
            return _squareN!!
        }
        _squareN = Builder(name = "SquareN", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
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
                moveTo(18.0f, 17.307f)
                curveToRelative(0.0f, 0.758f, -0.488f, 1.41f, -1.215f, 1.623f)
                curveToRelative(-0.161f, 0.048f, -0.324f, 0.07f, -0.484f, 0.07f)
                curveToRelative(-0.564f, 0.0f, -1.097f, -0.282f, -1.417f, -0.778f)
                lineToRelative(-6.884f, -10.498f)
                verticalLineToRelative(11.276f)
                horizontalLineToRelative(-2.0f)
                lineTo(6.0f, 6.694f)
                curveToRelative(0.0f, -0.758f, 0.489f, -1.411f, 1.216f, -1.624f)
                curveToRelative(0.728f, -0.214f, 1.491f, 0.071f, 1.9f, 0.709f)
                lineToRelative(6.884f, 10.498f)
                lineTo(16.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(12.307f)
                close()
            }
        }
        .build()
        return _squareN!!
    }

private var _squareN: ImageVector? = null
