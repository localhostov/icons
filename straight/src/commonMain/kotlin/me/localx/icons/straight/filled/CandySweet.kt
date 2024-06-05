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
                moveToRelative(19.095f, 6.486f)
                lineToRelative(-12.606f, 12.607f)
                curveToRelative(-0.592f, -0.462f, -1.124f, -0.995f, -1.585f, -1.588f)
                lineToRelative(12.607f, -12.607f)
                curveToRelative(0.592f, 0.462f, 1.124f, 0.995f, 1.584f, 1.588f)
                close()
                moveTo(3.832f, 15.749f)
                lineTo(15.758f, 3.823f)
                curveToRelative(-1.144f, -0.529f, -2.417f, -0.828f, -3.759f, -0.828f)
                curveToRelative(-4.403f, 0.0f, -8.07f, 3.179f, -8.843f, 7.362f)
                lineTo(0.499f, 7.996f)
                reflectiveCurveToRelative(-0.499f, 1.5f, -0.499f, 4.0f)
                reflectiveCurveToRelative(0.499f, 4.0f, 0.499f, 4.0f)
                lineToRelative(2.657f, -2.361f)
                curveToRelative(0.137f, 0.741f, 0.369f, 1.449f, 0.676f, 2.115f)
                close()
                moveTo(23.5f, 7.995f)
                lineToRelative(-2.657f, 2.362f)
                curveToRelative(-0.137f, -0.741f, -0.369f, -1.449f, -0.676f, -2.115f)
                lineToRelative(-11.925f, 11.925f)
                curveToRelative(1.144f, 0.529f, 2.415f, 0.827f, 3.757f, 0.827f)
                curveToRelative(4.403f, 0.0f, 8.07f, -3.18f, 8.843f, -7.362f)
                lineToRelative(2.658f, 2.362f)
                reflectiveCurveToRelative(0.5f, -1.5f, 0.5f, -4.0f)
                reflectiveCurveToRelative(-0.5f, -4.0f, -0.5f, -4.0f)
                close()
            }
        }
        .build()
        return _candySweet!!
    }

private var _candySweet: ImageVector? = null
