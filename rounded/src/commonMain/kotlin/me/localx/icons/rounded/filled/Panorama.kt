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

public val Icons.Filled.Panorama: ImageVector
    get() {
        if (_panorama != null) {
            return _panorama!!
        }
        _panorama = Builder(name = "Panorama", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.029f, 11.172f)
                curveToRelative(1.511f, -1.513f, 4.146f, -1.511f, 5.657f, 0.0f)
                lineToRelative(11.81f, 11.81f)
                curveToRelative(0.324f, -0.43f, 0.505f, -0.959f, 0.505f, -1.527f)
                lineTo(24.001f, 2.542f)
                curveToRelative(0.0f, -0.926f, -0.479f, -1.751f, -1.283f, -2.208f)
                curveToRelative(-0.81f, -0.461f, -1.773f, -0.449f, -2.575f, 0.028f)
                curveToRelative(-1.333f, 0.793f, -4.795f, 2.638f, -8.142f, 2.638f)
                reflectiveCurveTo(5.191f, 1.155f, 3.858f, 0.362f)
                curveToRelative(-0.802f, -0.478f, -1.765f, -0.488f, -2.575f, -0.028f)
                curveTo(0.479f, 0.791f, 0.0f, 1.616f, 0.0f, 2.542f)
                verticalLineToRelative(14.659f)
                lineToRelative(6.029f, -6.029f)
                close()
                moveTo(18.0f, 6.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, 0.895f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                close()
                moveTo(21.676f, 23.991f)
                curveToRelative(-0.074f, 0.007f, -0.148f, 0.01f, -0.222f, 0.01f)
                curveToRelative(-0.451f, 0.0f, -0.903f, -0.122f, -1.312f, -0.366f)
                curveToRelative(-1.332f, -0.792f, -4.79f, -2.635f, -8.142f, -2.635f)
                reflectiveCurveToRelative(-6.811f, 1.843f, -8.142f, 2.635f)
                curveToRelative(-0.803f, 0.479f, -1.766f, 0.488f, -2.575f, 0.028f)
                curveToRelative(-0.803f, -0.457f, -1.283f, -1.282f, -1.283f, -2.208f)
                verticalLineToRelative(-1.427f)
                lineToRelative(7.443f, -7.443f)
                curveToRelative(0.756f, -0.757f, 2.073f, -0.755f, 2.829f, 0.0f)
                lineToRelative(11.405f, 11.405f)
                close()
            }
        }
        .build()
        return _panorama!!
    }

private var _panorama: ImageVector? = null
