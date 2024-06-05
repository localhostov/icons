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

public val Icons.Outline.SatelliteDish: ImageVector
    get() {
        if (_satelliteDish != null) {
            return _satelliteDish!!
        }
        _satelliteDish = Builder(name = "SatelliteDish", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.0f, 11.0f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                curveToRelative(3.86f, 0.0f, 7.0f, 3.141f, 7.0f, 7.0f)
                close()
                moveTo(14.0f, 11.0f)
                curveToRelative(0.0f, 0.553f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                close()
                moveTo(13.0f, 0.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                curveToRelative(4.962f, 0.0f, 9.0f, 4.037f, 9.0f, 9.0f)
                curveToRelative(0.0f, 0.553f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                curveTo(24.0f, 4.935f, 19.065f, 0.0f, 13.0f, 0.0f)
                close()
                moveTo(16.246f, 18.351f)
                curveToRelative(0.552f, 0.552f, 0.821f, 1.313f, 0.74f, 2.09f)
                curveToRelative(-0.083f, 0.785f, -0.511f, 1.482f, -1.175f, 1.914f)
                curveToRelative(-1.691f, 1.099f, -3.625f, 1.635f, -5.549f, 1.635f)
                curveToRelative(-2.654f, 0.0f, -5.292f, -1.019f, -7.262f, -2.989f)
                curveTo(-0.399f, 17.603f, -0.969f, 12.215f, 1.646f, 8.188f)
                curveToRelative(0.431f, -0.663f, 1.128f, -1.092f, 1.913f, -1.174f)
                curveToRelative(0.776f, -0.084f, 1.539f, 0.187f, 2.091f, 0.739f)
                lineToRelative(4.591f, 4.591f)
                lineToRelative(1.052f, -1.052f)
                curveToRelative(0.391f, -0.391f, 1.023f, -0.391f, 1.414f, 0.0f)
                reflectiveCurveToRelative(0.391f, 1.023f, 0.0f, 1.414f)
                lineToRelative(-1.052f, 1.052f)
                lineToRelative(4.591f, 4.591f)
                close()
                moveTo(14.832f, 19.765f)
                lineTo(4.235f, 9.168f)
                curveToRelative(-0.139f, -0.139f, -0.296f, -0.168f, -0.405f, -0.168f)
                curveToRelative(-0.253f, 0.0f, -0.406f, 0.122f, -0.507f, 0.277f)
                curveToRelative(-2.104f, 3.239f, -1.645f, 7.574f, 1.09f, 10.309f)
                curveToRelative(2.735f, 2.735f, 7.071f, 3.193f, 10.308f, 1.091f)
                curveToRelative(0.156f, -0.101f, 0.256f, -0.263f, 0.275f, -0.445f)
                curveToRelative(0.011f, -0.102f, 0.004f, -0.299f, -0.165f, -0.467f)
                close()
            }
        }
        .build()
        return _satelliteDish!!
    }

private var _satelliteDish: ImageVector? = null
