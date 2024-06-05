package me.localx.icons.straight.bold

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
import me.localx.icons.straight.Icons

public val Icons.Bold.Marker: ImageVector
    get() {
        if (_marker != null) {
            return _marker!!
        }
        _marker = Builder(name = "Marker", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.021f)
                arcTo(10.077f, 10.077f, 0.0f, false, false, 1.935f, 10.087f)
                curveToRelative(0.0f, 5.274f, 8.166f, 12.329f, 9.1f, 13.117f)
                lineToRelative(0.967f, 0.817f)
                lineToRelative(0.967f, -0.817f)
                curveToRelative(0.932f, -0.788f, 9.1f, -7.843f, 9.1f, -13.117f)
                arcTo(10.077f, 10.077f, 0.0f, false, false, 12.0f, 0.021f)
                close()
                moveTo(12.0f, 20.064f)
                curveToRelative(-3.065f, -2.792f, -7.067f, -7.328f, -7.067f, -9.977f)
                arcToRelative(7.067f, 7.067f, 0.0f, true, true, 14.134f, 0.0f)
                curveTo(19.067f, 12.731f, 15.064f, 17.269f, 12.0f, 20.064f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 10.002f)
                moveToRelative(-2.997f, 0.0f)
                arcToRelative(2.997f, 2.997f, 0.0f, true, true, 5.994f, 0.0f)
                arcToRelative(2.997f, 2.997f, 0.0f, true, true, -5.994f, 0.0f)
            }
        }
        .build()
        return _marker!!
    }

private var _marker: ImageVector? = null
