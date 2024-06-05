package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.Exit: ImageVector
    get() {
        if (_exit != null) {
            return _exit!!
        }
        _exit = Builder(name = "Exit", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(170.698f, 448.0f)
                horizontalLineTo(72.757f)
                curveToRelative(-4.814f, -0.012f, -8.714f, -3.911f, -8.725f, -8.725f)
                verticalLineTo(72.725f)
                curveToRelative(0.012f, -4.814f, 3.911f, -8.714f, 8.725f, -8.725f)
                horizontalLineToRelative(97.941f)
                curveToRelative(17.673f, 0.0f, 32.0f, -14.327f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.327f, -32.0f, -32.0f, -32.0f)
                horizontalLineTo(72.757f)
                curveTo(32.611f, 0.047f, 0.079f, 32.58f, 0.032f, 72.725f)
                verticalLineToRelative(366.549f)
                curveTo(0.079f, 479.42f, 32.611f, 511.953f, 72.757f, 512.0f)
                horizontalLineToRelative(97.941f)
                curveToRelative(17.673f, 0.0f, 32.0f, -14.327f, 32.0f, -32.0f)
                reflectiveCurveTo(188.371f, 448.0f, 170.698f, 448.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(483.914f, 188.117f)
                lineToRelative(-82.816f, -82.752f)
                curveToRelative(-12.501f, -12.495f, -32.764f, -12.49f, -45.259f, 0.011f)
                reflectiveCurveToRelative(-12.49f, 32.764f, 0.011f, 45.259f)
                lineToRelative(72.789f, 72.768f)
                lineTo(138.698f, 224.0f)
                curveToRelative(-17.673f, 0.0f, -32.0f, 14.327f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.327f, 32.0f, 32.0f, 32.0f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(291.115f, -0.533f)
                lineToRelative(-73.963f, 73.963f)
                curveToRelative(-12.042f, 12.936f, -11.317f, 33.184f, 1.618f, 45.226f)
                curveToRelative(12.295f, 11.445f, 31.346f, 11.436f, 43.63f, -0.021f)
                lineToRelative(82.752f, -82.752f)
                curveToRelative(37.491f, -37.49f, 37.491f, -98.274f, 0.001f, -135.764f)
                curveToRelative(0.0f, 0.0f, -0.001f, -0.001f, -0.001f, -0.001f)
                lineTo(483.914f, 188.117f)
                close()
            }
        }
        .build()
        return _exit!!
    }

private var _exit: ImageVector? = null
