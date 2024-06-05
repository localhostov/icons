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

public val Icons.Bold.Flask: ImageVector
    get() {
        if (_flask != null) {
            return _flask!!
        }
        _flask = Builder(name = "Flask", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.0f, 8.799f)
                lineTo(17.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                lineTo(19.0f, 0.0f)
                lineTo(5.0f, 0.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.799f)
                curveToRelative(-1.827f, 1.57f, -7.0f, 6.398f, -7.0f, 10.701f)
                curveToRelative(0.0f, 2.618f, 1.958f, 4.006f, 3.115f, 4.415f)
                lineToRelative(0.242f, 0.085f)
                horizontalLineToRelative(17.285f)
                lineToRelative(0.242f, -0.085f)
                curveToRelative(1.157f, -0.408f, 3.115f, -1.797f, 3.115f, -4.415f)
                curveToRelative(0.0f, -4.302f, -5.173f, -9.13f, -7.0f, -10.701f)
                close()
                moveTo(20.065f, 21.0f)
                lineTo(3.935f, 21.0f)
                curveToRelative(-0.34f, -0.184f, -0.935f, -0.629f, -0.935f, -1.5f)
                curveToRelative(0.0f, -0.74f, 0.31f, -1.6f, 0.812f, -2.5f)
                horizontalLineToRelative(14.021f)
                curveToRelative(-0.661f, -0.943f, -1.555f, -1.994f, -2.562f, -3.0f)
                lineTo(5.998f, 14.0f)
                curveToRelative(1.144f, -1.306f, 2.418f, -2.503f, 3.444f, -3.333f)
                lineToRelative(0.558f, -0.451f)
                lineTo(10.0f, 3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(7.217f)
                reflectiveCurveToRelative(0.558f, 0.45f, 0.558f, 0.45f)
                curveToRelative(2.491f, 2.014f, 6.442f, 6.193f, 6.442f, 8.833f)
                curveToRelative(0.0f, 0.871f, -0.595f, 1.316f, -0.935f, 1.5f)
                close()
            }
        }
        .build()
        return _flask!!
    }

private var _flask: ImageVector? = null
