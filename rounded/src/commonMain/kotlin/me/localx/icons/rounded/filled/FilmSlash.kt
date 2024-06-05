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

public val Icons.Filled.FilmSlash: ImageVector
    get() {
        if (_filmSlash != null) {
            return _filmSlash!!
        }
        _filmSlash = Builder(name = "FilmSlash", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 10.242f)
                verticalLineToRelative(0.758f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.758f)
                lineToRelative(-2.0f, -2.0f)
                verticalLineToRelative(10.758f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(10.758f)
                lineTo(6.0f, 10.242f)
                close()
                moveTo(6.0f, 19.815f)
                curveToRelative(-1.161f, -0.414f, -2.0f, -1.514f, -2.0f, -2.816f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.816f)
                close()
                moveTo(6.0f, 14.999f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(23.707f, 22.292f)
                lineToRelative(-2.546f, -2.546f)
                curveToRelative(0.537f, -0.813f, 0.839f, -1.761f, 0.839f, -2.747f)
                lineTo(22.0f, 7.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                lineTo(7.0f, 2.0f)
                curveToRelative(-0.986f, 0.0f, -1.934f, 0.302f, -2.747f, 0.839f)
                lineTo(1.707f, 0.293f)
                curveTo(1.316f, -0.098f, 0.684f, -0.098f, 0.293f, 0.293f)
                reflectiveCurveTo(-0.098f, 1.316f, 0.293f, 1.707f)
                lineTo(22.293f, 23.707f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                close()
                moveTo(16.0f, 12.999f)
                horizontalLineToRelative(-1.586f)
                lineToRelative(-2.0f, -2.0f)
                horizontalLineToRelative(3.586f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(19.699f, 18.283f)
                lineToRelative(-1.284f, -1.284f)
                horizontalLineToRelative(1.586f)
                curveToRelative(0.0f, 0.45f, -0.112f, 0.885f, -0.301f, 1.284f)
                close()
                moveTo(20.0f, 14.999f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(20.0f, 10.999f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(18.0f, 6.999f)
                verticalLineToRelative(-2.816f)
                curveToRelative(1.161f, 0.414f, 2.0f, 1.514f, 2.0f, 2.816f)
                horizontalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _filmSlash!!
    }

private var _filmSlash: ImageVector? = null
