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

public val Icons.Outline.Flashlight: ImageVector
    get() {
        if (_flashlight != null) {
            return _flashlight!!
        }
        _flashlight = Builder(name = "Flashlight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.405f, 8.289f)
                lineTo(15.712f, 0.596f)
                curveTo(15.318f, 0.202f, 14.764f, -0.023f, 14.217f, 0.002f)
                curveToRelative(-0.549f, 0.016f, -1.073f, 0.259f, -1.436f, 0.667f)
                curveToRelative(-1.742f, 1.954f, -2.782f, 4.558f, -2.782f, 6.965f)
                verticalLineToRelative(0.873f)
                lineTo(1.138f, 17.368f)
                curveTo(0.404f, 18.102f, 0.0f, 19.078f, 0.0f, 20.115f)
                reflectiveCurveToRelative(0.404f, 2.014f, 1.138f, 2.747f)
                curveToRelative(0.757f, 0.758f, 1.752f, 1.137f, 2.748f, 1.137f)
                reflectiveCurveToRelative(1.989f, -0.379f, 2.747f, -1.136f)
                lineToRelative(8.862f, -8.862f)
                horizontalLineToRelative(0.872f)
                curveToRelative(2.407f, 0.0f, 5.011f, -1.04f, 6.966f, -2.781f)
                curveToRelative(0.408f, -0.363f, 0.651f, -0.888f, 0.667f, -1.437f)
                curveToRelative(0.016f, -0.557f, -0.2f, -1.101f, -0.594f, -1.494f)
                close()
                moveTo(5.218f, 21.449f)
                curveToRelative(-0.735f, 0.734f, -1.932f, 0.731f, -2.666f, 0.0f)
                curveToRelative(-0.356f, -0.356f, -0.552f, -0.829f, -0.552f, -1.333f)
                reflectiveCurveToRelative(0.196f, -0.977f, 0.552f, -1.333f)
                lineToRelative(8.444f, -8.443f)
                lineToRelative(2.666f, 2.666f)
                lineToRelative(-8.444f, 8.444f)
                close()
                moveTo(16.366f, 12.001f)
                horizontalLineToRelative(-0.881f)
                lineToRelative(-3.486f, -3.486f)
                verticalLineToRelative(-0.881f)
                curveToRelative(0.0f, -1.93f, 0.851f, -4.036f, 2.298f, -5.624f)
                lineToRelative(7.694f, 7.693f)
                lineToRelative(0.01f, 0.023f)
                curveToRelative(-1.598f, 1.424f, -3.705f, 2.274f, -5.635f, 2.274f)
                close()
                moveTo(10.706f, 14.708f)
                lineToRelative(-1.0f, 1.0f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.023f, 0.0f, -1.414f)
                lineToRelative(1.0f, -1.0f)
                curveToRelative(0.391f, -0.391f, 1.023f, -0.391f, 1.414f, 0.0f)
                reflectiveCurveToRelative(0.391f, 1.023f, 0.0f, 1.414f)
                close()
            }
        }
        .build()
        return _flashlight!!
    }

private var _flashlight: ImageVector? = null
