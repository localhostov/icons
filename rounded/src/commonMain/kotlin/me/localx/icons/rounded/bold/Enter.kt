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

public val Icons.Bold.Enter: ImageVector
    get() {
        if (_enter != null) {
            return _enter!!
        }
        _enter = Builder(name = "Enter", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(170.699f, 448.0f)
                horizontalLineTo(72.757f)
                curveToRelative(-4.814f, -0.012f, -8.714f, -3.911f, -8.725f, -8.725f)
                verticalLineTo(72.725f)
                curveToRelative(0.012f, -4.814f, 3.911f, -8.714f, 8.725f, -8.725f)
                horizontalLineToRelative(97.941f)
                curveToRelative(17.673f, 0.0f, 32.0f, -14.327f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.327f, -32.0f, -32.0f, -32.0f)
                horizontalLineTo(72.757f)
                curveTo(32.612f, 0.047f, 0.079f, 32.58f, 0.032f, 72.725f)
                verticalLineToRelative(366.549f)
                curveTo(0.079f, 479.42f, 32.612f, 511.953f, 72.757f, 512.0f)
                horizontalLineToRelative(97.941f)
                curveToRelative(17.673f, 0.0f, 32.0f, -14.327f, 32.0f, -32.0f)
                reflectiveCurveTo(188.372f, 448.0f, 170.699f, 448.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(480.032f, 224.0f)
                lineToRelative(-290.987f, 0.576f)
                lineToRelative(73.941f, -73.941f)
                curveToRelative(12.501f, -12.495f, 12.506f, -32.758f, 0.011f, -45.259f)
                reflectiveCurveToRelative(-32.758f, -12.506f, -45.259f, -0.011f)
                lineToRelative(-82.752f, 82.752f)
                curveToRelative(-37.491f, 37.49f, -37.491f, 98.274f, -0.001f, 135.764f)
                curveToRelative(0.0f, 0.0f, 0.001f, 0.001f, 0.001f, 0.001f)
                lineToRelative(82.752f, 82.752f)
                curveToRelative(12.501f, 12.495f, 32.764f, 12.49f, 45.259f, -0.011f)
                reflectiveCurveToRelative(12.49f, -32.764f, -0.011f, -45.259f)
                lineToRelative(-72.811f, -72.789f)
                lineTo(480.032f, 288.0f)
                curveToRelative(17.673f, -0.035f, 31.971f, -14.391f, 31.936f, -32.064f)
                reflectiveCurveTo(497.577f, 223.965f, 479.904f, 224.0f)
                horizontalLineTo(480.032f)
                close()
            }
        }
        .build()
        return _enter!!
    }

private var _enter: ImageVector? = null
