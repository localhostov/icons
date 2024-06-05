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

public val Icons.Bold.Keynote: ImageVector
    get() {
        if (_keynote != null) {
            return _keynote!!
        }
        _keynote = Builder(name = "Keynote", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.582f, 15.002f)
                lineToRelative(-0.747f, -2.242f)
                curveToRelative(-0.75f, -2.249f, -2.848f, -3.76f, -5.218f, -3.76f)
                lineTo(7.383f, 9.0f)
                curveToRelative(-0.475f, 0.0f, -0.939f, 0.061f, -1.383f, 0.176f)
                verticalLineToRelative(-2.676f)
                curveToRelative(0.0f, -1.378f, 1.121f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(0.75f)
                curveToRelative(0.456f, 0.607f, 1.182f, 1.0f, 2.0f, 1.0f)
                horizontalLineToRelative(4.25f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-4.25f)
                curveToRelative(-0.818f, 0.0f, -1.543f, 0.393f, -2.0f, 1.0f)
                horizontalLineToRelative(-0.75f)
                curveTo(5.468f, 1.0f, 3.0f, 3.467f, 3.0f, 6.5f)
                verticalLineToRelative(4.676f)
                curveToRelative(-0.356f, 0.47f, -0.641f, 1.003f, -0.835f, 1.585f)
                lineToRelative(-0.747f, 2.242f)
                curveToRelative(-0.79f, 0.043f, -1.418f, 0.697f, -1.418f, 1.498f)
                curveToRelative(0.0f, 0.829f, 0.672f, 1.5f, 1.5f, 1.5f)
                lineTo(10.5f, 18.001f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(9.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                curveToRelative(0.0f, -0.801f, -0.628f, -1.455f, -1.418f, -1.498f)
                close()
                moveTo(4.581f, 15.0f)
                lineToRelative(0.43f, -1.291f)
                curveToRelative(0.341f, -1.022f, 1.295f, -1.709f, 2.372f, -1.709f)
                horizontalLineToRelative(9.234f)
                curveToRelative(1.077f, 0.0f, 2.031f, 0.687f, 2.372f, 1.709f)
                lineToRelative(0.43f, 1.291f)
                lineTo(4.581f, 15.0f)
                close()
            }
        }
        .build()
        return _keynote!!
    }

private var _keynote: ImageVector? = null
