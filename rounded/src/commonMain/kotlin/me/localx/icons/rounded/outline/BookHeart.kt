package me.localx.icons.rounded.outline

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

public val Icons.Outline.BookHeart: ImageVector
    get() {
        if (_bookHeart != null) {
            return _bookHeart!!
        }
        _bookHeart = Builder(name = "BookHeart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.53f, 13.465f)
                curveToRelative(0.426f, 0.349f, 0.948f, 0.522f, 1.47f, 0.522f)
                reflectiveCurveToRelative(1.044f, -0.174f, 1.47f, -0.523f)
                curveToRelative(1.61f, -1.319f, 3.53f, -3.301f, 3.53f, -5.246f)
                curveToRelative(0.0f, -1.774f, -1.346f, -3.218f, -3.0f, -3.218f)
                curveToRelative(-0.782f, 0.0f, -1.477f, 0.27f, -2.0f, 0.727f)
                curveToRelative(-0.523f, -0.457f, -1.218f, -0.727f, -2.0f, -0.727f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.444f, -3.0f, 3.218f)
                curveToRelative(0.0f, 1.944f, 1.92f, 3.926f, 3.53f, 5.247f)
                close()
                moveTo(10.0f, 7.0f)
                curveToRelative(0.483f, 0.0f, 1.0f, 0.263f, 1.0f, 1.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                curveToRelative(0.0f, -0.737f, 0.517f, -1.0f, 1.0f, -1.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.546f, 1.0f, 1.218f)
                curveToRelative(0.0f, 0.867f, -1.072f, 2.285f, -2.798f, 3.699f)
                curveToRelative(-0.117f, 0.096f, -0.287f, 0.096f, -0.404f, 0.0f)
                curveToRelative(-1.726f, -1.415f, -2.798f, -2.832f, -2.798f, -3.699f)
                curveToRelative(0.0f, -0.672f, 0.449f, -1.218f, 1.0f, -1.218f)
                close()
                moveTo(17.0f, 0.0f)
                lineTo(7.0f, 0.0f)
                curveTo(4.243f, 0.0f, 2.0f, 2.243f, 2.0f, 5.0f)
                verticalLineToRelative(15.0f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(11.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                lineTo(22.0f, 5.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(7.0f, 2.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(11.0f)
                lineTo(6.0f, 16.0f)
                curveToRelative(-0.732f, 0.0f, -1.409f, 0.212f, -2.0f, 0.556f)
                lineTo(4.0f, 5.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                close()
                moveTo(17.0f, 22.0f)
                lineTo(6.0f, 22.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.897f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _bookHeart!!
    }

private var _bookHeart: ImageVector? = null
