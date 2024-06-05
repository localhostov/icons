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

public val Icons.Bold.FilmSlash: ImageVector
    get() {
        if (_filmSlash != null) {
            return _filmSlash!!
        }
        _filmSlash = Builder(name = "FilmSlash", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5f, 20.0f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0.0f, -0.829f, -0.672f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0.0f, -0.829f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.671f, -1.5f, 1.5f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 3.033f, 2.468f, 5.5f, 5.5f, 5.5f)
                lineTo(14.5f, 23.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(4.0f, 17.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.949f)
                curveToRelative(-1.14f, -0.232f, -2.0f, -1.242f, -2.0f, -2.449f)
                close()
                moveTo(23.556f, 21.434f)
                lineToRelative(-1.262f, -1.262f)
                curveToRelative(0.453f, -0.813f, 0.707f, -1.727f, 0.707f, -2.672f)
                lineTo(23.001f, 6.5f)
                curveToRelative(0.0f, -3.033f, -2.468f, -5.5f, -5.5f, -5.5f)
                lineTo(6.5f, 1.0f)
                curveToRelative(-0.944f, 0.0f, -1.859f, 0.254f, -2.671f, 0.707f)
                lineTo(2.556f, 0.434f)
                curveTo(1.97f, -0.152f, 1.021f, -0.152f, 0.435f, 0.434f)
                curveTo(-0.151f, 1.02f, -0.151f, 1.97f, 0.435f, 2.555f)
                lineTo(21.435f, 23.555f)
                curveToRelative(0.293f, 0.293f, 0.677f, 0.439f, 1.061f, 0.439f)
                reflectiveCurveToRelative(0.768f, -0.146f, 1.061f, -0.439f)
                curveToRelative(0.586f, -0.585f, 0.586f, -1.536f, 0.0f, -2.121f)
                close()
                moveTo(9.0f, 4.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-2.878f)
                lineToRelative(-3.122f, -3.122f)
                verticalLineToRelative(-2.878f)
                close()
                moveTo(20.0f, 14.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(20.0f, 6.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.949f)
                curveToRelative(1.14f, 0.232f, 2.0f, 1.242f, 2.0f, 2.449f)
                close()
            }
        }
        .build()
        return _filmSlash!!
    }

private var _filmSlash: ImageVector? = null
