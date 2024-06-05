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

public val Icons.Bold.PrintSlash: ImageVector
    get() {
        if (_printSlash != null) {
            return _printSlash!!
        }
        _printSlash = Builder(name = "PrintSlash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 16.5f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -2.481f, -2.019f, -4.5f, -4.5f, -4.5f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -2.481f, -2.019f, -4.5f, -4.5f, -4.5f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-1.993f, 0.0f, -3.688f, 1.303f, -4.277f, 3.102f)
                lineTo(2.561f, 0.439f)
                curveTo(1.975f, -0.146f, 1.025f, -0.146f, 0.439f, 0.439f)
                reflectiveCurveTo(-0.146f, 1.975f, 0.439f, 2.561f)
                lineToRelative(21.0f, 21.0f)
                curveToRelative(0.293f, 0.293f, 0.677f, 0.439f, 1.061f, 0.439f)
                reflectiveCurveToRelative(0.768f, -0.146f, 1.061f, -0.439f)
                curveToRelative(0.586f, -0.586f, 0.586f, -1.535f, 0.0f, -2.121f)
                lineToRelative(-1.35f, -1.35f)
                curveToRelative(1.086f, -0.822f, 1.789f, -2.125f, 1.789f, -3.59f)
                close()
                moveTo(8.0f, 4.5f)
                curveToRelative(0.0f, -0.827f, 0.673f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.827f, 0.0f, 1.5f, 0.673f, 1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-7.879f)
                lineToRelative(-0.121f, -0.121f)
                verticalLineToRelative(-1.379f)
                close()
                moveTo(18.95f, 16.829f)
                curveToRelative(-0.283f, -1.905f, -1.753f, -3.44f, -3.702f, -3.768f)
                curveToRelative(-0.025f, -0.004f, -0.051f, -0.008f, -0.076f, -0.011f)
                lineToRelative(-4.051f, -4.051f)
                horizontalLineToRelative(8.379f)
                curveToRelative(0.827f, 0.0f, 1.5f, 0.673f, 1.5f, 1.5f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 0.642f, -0.406f, 1.191f, -0.974f, 1.405f)
                lineToRelative(-1.075f, -1.075f)
                close()
                moveTo(16.0f, 22.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-1.956f, 0.0f, -3.624f, -1.254f, -4.243f, -3.0f)
                horizontalLineToRelative(-0.757f)
                curveToRelative(-2.481f, 0.0f, -4.5f, -2.019f, -4.5f, -4.5f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -0.513f, 0.086f, -1.018f, 0.257f, -1.499f)
                curveToRelative(0.275f, -0.782f, 1.133f, -1.191f, 1.913f, -0.915f)
                curveToRelative(0.781f, 0.275f, 1.191f, 1.133f, 0.915f, 1.913f)
                curveToRelative(-0.057f, 0.161f, -0.085f, 0.329f, -0.085f, 0.501f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 0.827f, 0.673f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -1.278f, 0.547f, -2.501f, 1.5f, -3.354f)
                curveToRelative(0.617f, -0.554f, 1.564f, -0.499f, 2.118f, 0.118f)
                curveToRelative(0.552f, 0.617f, 0.5f, 1.565f, -0.118f, 2.117f)
                curveToRelative(-0.322f, 0.289f, -0.5f, 0.687f, -0.5f, 1.119f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.827f, 0.673f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _printSlash!!
    }

private var _printSlash: ImageVector? = null
