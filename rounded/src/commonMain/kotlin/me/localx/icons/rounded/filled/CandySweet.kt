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

public val Icons.Filled.CandySweet: ImageVector
    get() {
        if (_candySweet != null) {
            return _candySweet!!
        }
        _candySweet = Builder(name = "CandySweet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.095f, 6.491f)
                lineToRelative(-12.606f, 12.607f)
                curveToRelative(-0.592f, -0.462f, -1.124f, -0.995f, -1.585f, -1.588f)
                lineToRelative(12.607f, -12.607f)
                curveToRelative(0.592f, 0.462f, 1.124f, 0.995f, 1.584f, 1.588f)
                close()
                moveTo(3.832f, 15.754f)
                lineTo(15.758f, 3.828f)
                curveToRelative(-1.144f, -0.529f, -2.417f, -0.828f, -3.759f, -0.828f)
                curveToRelative(-4.403f, 0.0f, -8.07f, 3.179f, -8.843f, 7.362f)
                lineToRelative(-1.385f, -1.23f)
                curveToRelative(-0.586f, -0.521f, -1.522f, -0.184f, -1.625f, 0.594f)
                curveToRelative(-0.082f, 0.615f, -0.146f, 1.382f, -0.146f, 2.276f)
                reflectiveCurveToRelative(0.064f, 1.66f, 0.146f, 2.276f)
                curveToRelative(0.104f, 0.778f, 1.039f, 1.115f, 1.625f, 0.594f)
                lineToRelative(1.385f, -1.231f)
                curveToRelative(0.137f, 0.741f, 0.369f, 1.449f, 0.676f, 2.115f)
                close()
                moveTo(22.228f, 9.131f)
                lineToRelative(-1.386f, 1.232f)
                curveToRelative(-0.137f, -0.741f, -0.369f, -1.449f, -0.676f, -2.115f)
                lineToRelative(-11.925f, 11.925f)
                curveToRelative(1.144f, 0.529f, 2.415f, 0.827f, 3.757f, 0.827f)
                curveToRelative(4.403f, 0.0f, 8.07f, -3.18f, 8.843f, -7.362f)
                lineToRelative(1.386f, 1.232f)
                curveToRelative(0.586f, 0.521f, 1.522f, 0.184f, 1.625f, -0.593f)
                curveToRelative(0.082f, -0.616f, 0.146f, -1.382f, 0.146f, -2.276f)
                reflectiveCurveToRelative(-0.064f, -1.661f, -0.146f, -2.276f)
                curveToRelative(-0.104f, -0.777f, -1.039f, -1.114f, -1.625f, -0.593f)
                close()
            }
        }
        .build()
        return _candySweet!!
    }

private var _candySweet: ImageVector? = null
