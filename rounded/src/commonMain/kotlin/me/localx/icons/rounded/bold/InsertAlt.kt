package me.localx.icons.rounded.bold

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

public val Icons.Bold.InsertAlt: ImageVector
    get() {
        if (_insertAlt != null) {
            return _insertAlt!!
        }
        _insertAlt = Builder(name = "InsertAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 12.0f)
                curveToRelative(0.0f, 0.829f, -0.671f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-11.853f)
                lineToRelative(1.921f, 1.946f)
                curveToRelative(0.582f, 0.59f, 0.575f, 1.54f, -0.014f, 2.122f)
                curveToRelative(-0.292f, 0.288f, -0.673f, 0.432f, -1.054f, 0.432f)
                curveToRelative(-0.387f, 0.0f, -0.774f, -0.149f, -1.068f, -0.446f)
                lineToRelative(-3.743f, -3.793f)
                curveToRelative(-0.967f, -0.968f, -0.967f, -2.554f, 0.007f, -3.528f)
                lineToRelative(3.735f, -3.786f)
                curveToRelative(0.582f, -0.591f, 1.532f, -0.595f, 2.122f, -0.014f)
                curveToRelative(0.589f, 0.582f, 0.596f, 1.532f, 0.014f, 2.122f)
                lineToRelative(-1.921f, 1.946f)
                horizontalLineToRelative(11.853f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                close()
                moveTo(21.732f, 16.223f)
                curveToRelative(-0.705f, -0.433f, -1.629f, -0.214f, -2.064f, 0.491f)
                curveToRelative(-1.653f, 2.684f, -4.52f, 4.287f, -7.668f, 4.287f)
                curveToRelative(-4.962f, 0.0f, -9.0f, -4.038f, -9.0f, -9.0f)
                reflectiveCurveTo(7.038f, 3.0f, 12.0f, 3.0f)
                curveToRelative(3.148f, 0.0f, 6.015f, 1.603f, 7.668f, 4.287f)
                curveToRelative(0.435f, 0.706f, 1.359f, 0.925f, 2.064f, 0.491f)
                curveToRelative(0.706f, -0.435f, 0.925f, -1.359f, 0.491f, -2.064f)
                curveTo(20.019f, 2.136f, 16.197f, 0.0f, 12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                curveToRelative(4.197f, 0.0f, 8.019f, -2.136f, 10.223f, -5.713f)
                curveToRelative(0.434f, -0.705f, 0.215f, -1.629f, -0.491f, -2.064f)
                close()
            }
        }
        .build()
        return _insertAlt!!
    }

private var _insertAlt: ImageVector? = null
