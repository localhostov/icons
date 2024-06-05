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

public val Icons.Filled.CloverAlt: ImageVector
    get() {
        if (_cloverAlt != null) {
            return _cloverAlt!!
        }
        _cloverAlt = Builder(name = "CloverAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.738f, 12.718f)
                lineToRelative(-0.957f, -0.718f)
                lineToRelative(0.957f, -0.718f)
                curveToRelative(0.802f, -0.602f, 1.262f, -1.485f, 1.262f, -2.425f)
                curveToRelative(0.0f, -1.733f, -1.366f, -3.403f, -3.273f, -3.403f)
                curveToRelative(-0.863f, 0.0f, -2.175f, 0.624f, -3.372f, 1.19f)
                curveToRelative(0.567f, -1.197f, 1.19f, -2.509f, 1.19f, -3.372f)
                curveToRelative(0.0f, -1.906f, -1.67f, -3.273f, -3.403f, -3.273f)
                curveToRelative(-0.939f, 0.0f, -1.823f, 0.46f, -2.425f, 1.262f)
                lineToRelative(-0.718f, 0.957f)
                lineToRelative(-0.718f, -0.957f)
                curveToRelative(-0.602f, -0.802f, -1.485f, -1.262f, -2.425f, -1.262f)
                curveToRelative(-1.733f, 0.0f, -3.403f, 1.366f, -3.403f, 3.273f)
                curveToRelative(0.0f, 0.863f, 0.624f, 2.175f, 1.19f, 3.372f)
                curveToRelative(-1.197f, -0.567f, -2.509f, -1.19f, -3.372f, -1.19f)
                curveToRelative(-1.906f, 0.0f, -3.273f, 1.669f, -3.273f, 3.403f)
                curveToRelative(0.0f, 0.939f, 0.46f, 1.823f, 1.262f, 2.425f)
                lineToRelative(0.957f, 0.718f)
                lineToRelative(-0.957f, 0.718f)
                curveToRelative(-0.802f, 0.602f, -1.262f, 1.485f, -1.262f, 2.425f)
                curveToRelative(0.0f, 1.733f, 1.366f, 3.403f, 3.273f, 3.403f)
                curveToRelative(0.863f, 0.0f, 2.175f, -0.624f, 3.372f, -1.19f)
                curveToRelative(-0.567f, 1.197f, -1.19f, 2.509f, -1.19f, 3.372f)
                curveToRelative(0.0f, 1.906f, 1.67f, 3.273f, 3.403f, 3.273f)
                curveToRelative(0.939f, 0.0f, 1.823f, -0.46f, 2.425f, -1.262f)
                lineToRelative(0.718f, -0.957f)
                lineToRelative(0.718f, 0.957f)
                curveToRelative(0.602f, 0.802f, 1.485f, 1.262f, 2.425f, 1.262f)
                curveToRelative(1.733f, 0.0f, 3.403f, -1.366f, 3.403f, -3.273f)
                curveToRelative(0.0f, -0.863f, -0.624f, -2.175f, -1.19f, -3.372f)
                curveToRelative(1.197f, 0.567f, 2.509f, 1.19f, 3.372f, 1.19f)
                curveToRelative(1.906f, 0.0f, 3.273f, -1.67f, 3.273f, -3.403f)
                curveToRelative(0.0f, -0.939f, -0.46f, -1.823f, -1.262f, -2.425f)
                close()
            }
        }
        .build()
        return _cloverAlt!!
    }

private var _cloverAlt: ImageVector? = null
