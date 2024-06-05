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

public val Icons.Filled.Fan: ImageVector
    get() {
        if (_fan != null) {
            return _fan!!
        }
        _fan = Builder(name = "Fan", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.501f, 9.557f)
                curveToRelative(-0.553f, -1.536f, -1.174f, -3.732f, -1.07f, -5.641f)
                curveToRelative(0.06f, -1.104f, 0.546f, -2.119f, 1.368f, -2.857f)
                curveTo(10.623f, 0.321f, 11.676f, -0.054f, 12.789f, 0.006f)
                curveToRelative(1.104f, 0.06f, 2.119f, 0.546f, 2.857f, 1.369f)
                curveToRelative(0.738f, 0.823f, 1.112f, 1.884f, 1.053f, 2.989f)
                curveToRelative(-0.095f, 1.744f, -1.634f, 3.358f, -2.878f, 4.661f)
                curveToRelative(-0.532f, -0.327f, -1.152f, -0.525f, -1.82f, -0.525f)
                curveToRelative(-0.979f, 0.0f, -1.863f, 0.407f, -2.499f, 1.057f)
                close()
                moveTo(10.5f, 12.0f)
                curveToRelative(0.0f, 0.827f, 0.673f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.673f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.673f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.673f, -1.5f, 1.5f)
                close()
                moveTo(22.941f, 9.755f)
                curveToRelative(-0.738f, -0.823f, -1.754f, -1.31f, -2.858f, -1.369f)
                curveToRelative(-1.924f, -0.104f, -4.141f, 0.528f, -5.678f, 1.083f)
                curveToRelative(0.671f, 0.638f, 1.095f, 1.534f, 1.095f, 2.53f)
                curveToRelative(0.0f, 0.657f, -0.193f, 1.265f, -0.509f, 1.791f)
                curveToRelative(1.302f, 1.244f, 2.898f, 2.863f, 4.645f, 2.863f)
                curveToRelative(1.48f, 0.0f, 2.224f, -0.365f, 2.989f, -1.052f)
                curveToRelative(0.822f, -0.739f, 1.309f, -1.753f, 1.368f, -2.857f)
                curveToRelative(0.061f, -1.104f, -0.313f, -2.166f, -1.052f, -2.989f)
                close()
                moveTo(12.0f, 15.5f)
                curveToRelative(-0.645f, 0.0f, -1.242f, -0.188f, -1.762f, -0.493f)
                curveToRelative(-1.244f, 1.303f, -2.753f, 2.885f, -2.848f, 4.629f)
                curveToRelative(-0.123f, 2.28f, 1.628f, 4.358f, 3.909f, 4.358f)
                curveToRelative(1.263f, 0.0f, 2.224f, -0.365f, 2.99f, -1.052f)
                curveToRelative(0.822f, -0.738f, 1.309f, -1.753f, 1.368f, -2.857f)
                curveToRelative(0.106f, -1.939f, -0.537f, -4.178f, -1.096f, -5.717f)
                curveToRelative(-0.64f, 0.692f, -1.547f, 1.133f, -2.562f, 1.133f)
                close()
                moveTo(8.5f, 12.0f)
                curveToRelative(0.0f, -0.668f, 0.198f, -1.287f, 0.524f, -1.819f)
                curveToRelative(-1.303f, -1.244f, -2.872f, -2.741f, -4.616f, -2.835f)
                curveToRelative(-1.112f, -0.061f, -2.166f, 0.314f, -2.989f, 1.052f)
                curveToRelative(-0.822f, 0.739f, -1.309f, 1.753f, -1.368f, 2.857f)
                curveToRelative(-0.061f, 1.104f, 0.313f, 2.166f, 1.052f, 2.989f)
                curveToRelative(0.738f, 0.823f, 1.897f, 1.38f, 3.288f, 1.38f)
                curveToRelative(1.806f, 0.0f, 3.794f, -0.572f, 5.216f, -1.084f)
                curveToRelative(-0.678f, -0.639f, -1.108f, -1.538f, -1.108f, -2.541f)
                close()
            }
        }
        .build()
        return _fan!!
    }

private var _fan: ImageVector? = null
