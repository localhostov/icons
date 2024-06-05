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

public val Icons.Filled.PrintSlash: ImageVector
    get() {
        if (_printSlash != null) {
            return _printSlash!!
        }
        _printSlash = Builder(name = "PrintSlash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.765f, 15.0f)
                lineToRelative(7.702f, 7.702f)
                curveToRelative(-0.541f, 0.783f, -1.443f, 1.298f, -2.467f, 1.298f)
                horizontalLineToRelative(-8.0f)
                curveToRelative(-1.657f, 0.0f, -3.0f, -1.343f, -3.0f, -3.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.657f, 1.343f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(2.765f)
                close()
                moveTo(8.765f, 13.0f)
                lineTo(3.135f, 7.37f)
                curveTo(1.301f, 8.111f, 0.003f, 9.9f, 0.0f, 12.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.003f, 1.986f, 1.18f, 3.782f, 3.0f, 4.576f)
                verticalLineToRelative(-2.576f)
                curveToRelative(0.003f, -2.76f, 2.24f, -4.997f, 5.0f, -5.0f)
                horizontalLineToRelative(0.765f)
                close()
                moveTo(21.648f, 20.234f)
                lineToRelative(2.059f, 2.059f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.023f, 0.0f, 1.414f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                lineTo(0.293f, 1.707f)
                curveTo(-0.098f, 1.316f, -0.098f, 0.684f, 0.293f, 0.293f)
                reflectiveCurveTo(1.316f, -0.098f, 1.707f, 0.293f)
                lineToRelative(3.331f, 3.331f)
                curveToRelative(0.192f, -2.03f, 1.882f, -3.624f, 3.962f, -3.624f)
                horizontalLineToRelative(6.0f)
                curveToRelative(2.209f, 0.0f, 4.0f, 1.791f, 4.0f, 4.0f)
                verticalLineToRelative(1.0f)
                lineTo(6.414f, 5.0f)
                lineToRelative(2.0f, 2.0f)
                horizontalLineToRelative(10.586f)
                curveToRelative(2.76f, 0.003f, 4.997f, 2.24f, 5.0f, 5.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(-0.002f, 1.739f, -0.905f, 3.332f, -2.352f, 4.234f)
                close()
                moveTo(15.0f, 10.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                close()
                moveTo(21.0f, 19.586f)
                verticalLineToRelative(-1.586f)
                curveToRelative(-0.003f, -2.76f, -2.24f, -4.997f, -5.0f, -5.0f)
                horizontalLineToRelative(-1.586f)
                lineToRelative(2.046f, 2.046f)
                curveToRelative(1.285f, 0.2f, 2.293f, 1.208f, 2.493f, 2.493f)
                lineToRelative(2.046f, 2.046f)
                close()
            }
        }
        .build()
        return _printSlash!!
    }

private var _printSlash: ImageVector? = null
