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

public val Icons.Filled.Republican: ImageVector
    get() {
        if (_republican != null) {
            return _republican!!
        }
        _republican = Builder(name = "Republican", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 18.0f)
                verticalLineToRelative(1.001f)
                curveToRelative(0.0f, 1.653f, -1.345f, 2.999f, -2.999f, 2.999f)
                curveToRelative(-0.802f, 0.0f, -1.555f, -0.312f, -2.122f, -0.88f)
                curveToRelative(-0.546f, -0.547f, -0.855f, -1.267f, -0.876f, -2.035f)
                curveToRelative(-0.002f, -0.028f, -0.003f, -0.057f, -0.003f, -0.085f)
                horizontalLineToRelative(-1.98f)
                curveToRelative(0.0f, 1.655f, -1.344f, 3.0f, -2.997f, 3.0f)
                curveToRelative(-0.807f, 0.0f, -1.559f, -0.312f, -2.124f, -0.879f)
                curveToRelative(-0.565f, -0.567f, -0.875f, -1.32f, -0.873f, -2.121f)
                lineTo(6.006f, 19.0f)
                curveToRelative(-0.005f, 1.66f, -1.35f, 3.0f, -2.997f, 3.0f)
                curveToRelative(-1.666f, 0.0f, -3.01f, -1.345f, -3.01f, -2.997f)
                verticalLineToRelative(-4.003f)
                lineTo(19.998f, 15.0f)
                lineToRelative(0.005f, 4.0f)
                curveToRelative(0.0f, 0.268f, 0.104f, 0.518f, 0.292f, 0.707f)
                curveToRelative(0.189f, 0.188f, 0.439f, 0.293f, 0.707f, 0.293f)
                curveToRelative(0.551f, 0.0f, 0.999f, -0.448f, 0.999f, -0.999f)
                verticalLineToRelative(-1.001f)
                curveToRelative(0.0f, -0.553f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                close()
                moveTo(0.0f, 13.0f)
                verticalLineToRelative(-5.0f)
                curveTo(0.0f, 4.691f, 2.691f, 2.0f, 6.0f, 2.0f)
                lineTo(14.014f, 2.0f)
                curveToRelative(1.604f, 0.0f, 3.111f, 0.625f, 4.245f, 1.76f)
                curveToRelative(1.134f, 1.135f, 1.743f, 2.643f, 1.741f, 4.247f)
                verticalLineToRelative(4.993f)
                lineTo(0.0f, 13.0f)
                close()
                moveTo(13.0f, 8.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                close()
                moveTo(9.0f, 8.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                close()
                moveTo(5.0f, 8.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _republican!!
    }

private var _republican: ImageVector? = null
