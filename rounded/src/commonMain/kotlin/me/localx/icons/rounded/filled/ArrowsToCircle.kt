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

public val Icons.Filled.ArrowsToCircle: ImageVector
    get() {
        if (_arrowsToCircle != null) {
            return _arrowsToCircle!!
        }
        _arrowsToCircle = Builder(name = "ArrowsToCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 12.0f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                close()
                moveTo(6.579f, 7.993f)
                lineToRelative(-2.582f, 0.007f)
                curveToRelative(-0.552f, 0.001f, -0.999f, 0.451f, -0.997f, 1.003f)
                curveToRelative(0.001f, 0.551f, 0.449f, 0.997f, 1.0f, 0.997f)
                horizontalLineToRelative(0.003f)
                lineToRelative(4.008f, -0.011f)
                curveToRelative(1.097f, 0.0f, 1.989f, -0.892f, 1.989f, -1.989f)
                lineTo(10.0f, 4.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                lineToRelative(0.005f, 2.591f)
                lineTo(1.707f, 0.293f)
                curveTo(1.316f, -0.098f, 0.684f, -0.098f, 0.293f, 0.293f)
                reflectiveCurveTo(-0.098f, 1.316f, 0.293f, 1.707f)
                lineTo(6.579f, 7.993f)
                close()
                moveTo(16.0f, 10.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                lineToRelative(-2.592f, 0.006f)
                lineTo(23.707f, 1.707f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                reflectiveCurveToRelative(-1.023f, -0.391f, -1.414f, 0.0f)
                lineToRelative(-6.285f, 6.285f)
                lineToRelative(-0.008f, -2.581f)
                curveToRelative(-0.002f, -0.553f, -0.435f, -0.98f, -1.003f, -0.997f)
                curveToRelative(-0.552f, 0.001f, -0.999f, 0.451f, -0.997f, 1.003f)
                lineToRelative(0.012f, 4.009f)
                curveToRelative(0.0f, 1.096f, 0.892f, 1.988f, 1.988f, 1.988f)
                close()
                moveTo(8.014f, 14.012f)
                lineToRelative(-4.011f, -0.012f)
                horizontalLineToRelative(-0.003f)
                curveToRelative(-0.551f, 0.0f, -0.999f, 0.446f, -1.0f, 0.997f)
                curveToRelative(-0.001f, 0.553f, 0.445f, 1.001f, 0.997f, 1.003f)
                horizontalLineToRelative(2.589f)
                lineTo(0.293f, 22.293f)
                curveToRelative(-0.391f, 0.391f, -0.391f, 1.023f, 0.0f, 1.414f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                lineToRelative(6.293f, -6.293f)
                verticalLineToRelative(2.586f)
                curveToRelative(0.0f, 0.553f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -1.097f, -0.892f, -1.988f, -1.986f, -1.988f)
                close()
                moveTo(17.414f, 16.0f)
                horizontalLineToRelative(2.586f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.096f, 0.0f, -1.988f, 0.892f, -1.988f, 1.985f)
                lineToRelative(-0.012f, 4.012f)
                curveToRelative(-0.001f, 0.553f, 0.445f, 1.001f, 0.997f, 1.003f)
                horizontalLineToRelative(0.003f)
                curveToRelative(0.551f, 0.0f, 0.999f, -0.446f, 1.0f, -0.997f)
                verticalLineToRelative(-2.589f)
                lineToRelative(6.293f, 6.293f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                lineToRelative(-6.293f, -6.293f)
                close()
            }
        }
        .build()
        return _arrowsToCircle!!
    }

private var _arrowsToCircle: ImageVector? = null
