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

public val Icons.Bold.SlidersV: ImageVector
    get() {
        if (_slidersV != null) {
            return _slidersV!!
        }
        _slidersV = Builder(name = "SlidersV", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.5f, 7.5f)
                curveToRelative(0.0f, 1.394f, -0.821f, 2.587f, -2.0f, 3.15f)
                verticalLineToRelative(11.85f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-11.85f)
                curveToRelative(-1.179f, -0.563f, -2.0f, -1.756f, -2.0f, -3.15f)
                reflectiveCurveToRelative(0.821f, -2.587f, 2.0f, -3.15f)
                lineTo(2.5f, 1.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                verticalLineToRelative(2.85f)
                curveToRelative(1.179f, 0.563f, 2.0f, 1.756f, 2.0f, 3.15f)
                close()
                moveTo(13.5f, 13.35f)
                lineTo(13.5f, 1.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(11.85f)
                curveToRelative(-1.179f, 0.563f, -2.0f, 1.756f, -2.0f, 3.15f)
                reflectiveCurveToRelative(0.821f, 2.587f, 2.0f, 3.15f)
                verticalLineToRelative(2.85f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineToRelative(-2.85f)
                curveToRelative(1.179f, -0.563f, 2.0f, -1.756f, 2.0f, -3.15f)
                reflectiveCurveToRelative(-0.821f, -2.587f, -2.0f, -3.15f)
                close()
                moveTo(23.5f, 7.5f)
                curveToRelative(0.0f, -1.394f, -0.821f, -2.587f, -2.0f, -3.15f)
                lineTo(21.5f, 1.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(2.85f)
                curveToRelative(-1.179f, 0.563f, -2.0f, 1.756f, -2.0f, 3.15f)
                reflectiveCurveToRelative(0.821f, 2.587f, 2.0f, 3.15f)
                verticalLineToRelative(11.85f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineToRelative(-11.85f)
                curveToRelative(1.179f, -0.563f, 2.0f, -1.756f, 2.0f, -3.15f)
                close()
            }
        }
        .build()
        return _slidersV!!
    }

private var _slidersV: ImageVector? = null
