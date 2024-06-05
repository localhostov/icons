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

public val Icons.Filled.PhoneRotary: ImageVector
    get() {
        if (_phoneRotary != null) {
            return _phoneRotary!!
        }
        _phoneRotary = Builder(name = "PhoneRotary", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.0f, 7.25f)
                curveToRelative(0.0f, -1.414f, 0.564f, -2.759f, 1.593f, -3.788f)
                curveTo(3.878f, 1.177f, 7.939f, 0.034f, 12.0f, 0.034f)
                reflectiveCurveToRelative(8.122f, 1.143f, 10.407f, 3.429f)
                curveToRelative(1.028f, 1.028f, 1.594f, 2.374f, 1.593f, 3.788f)
                curveToRelative(0.0f, 1.364f, -0.742f, 2.539f, -1.835f, 3.19f)
                lineToRelative(-2.585f, -3.668f)
                curveToRelative(-0.584f, -0.828f, -1.396f, -1.474f, -2.348f, -1.823f)
                curveToRelative(-1.219f, -0.447f, -3.07f, -0.95f, -5.232f, -0.95f)
                reflectiveCurveToRelative(-4.013f, 0.503f, -5.232f, 0.95f)
                curveToRelative(-0.952f, 0.349f, -1.764f, 0.994f, -2.348f, 1.823f)
                lineToRelative(-2.585f, 3.668f)
                curveToRelative(-1.093f, -0.651f, -1.835f, -1.826f, -1.835f, -3.19f)
                close()
                moveTo(15.0f, 15.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.346f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.346f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(23.998f, 20.197f)
                curveToRelative(-0.039f, 2.131f, -1.856f, 3.803f, -3.987f, 3.803f)
                lineTo(3.989f, 24.0f)
                curveTo(1.895f, 24.0f, 0.04f, 22.291f, 0.002f, 20.197f)
                curveToRelative(-0.031f, -1.683f, 0.332f, -3.364f, 1.047f, -4.886f)
                curveToRelative(0.155f, -0.329f, 0.347f, -0.64f, 0.551f, -0.941f)
                lineToRelative(4.117f, -6.095f)
                curveToRelative(0.487f, -0.72f, 1.188f, -1.263f, 2.011f, -1.544f)
                curveToRelative(1.043f, -0.357f, 2.546f, -0.731f, 4.272f, -0.731f)
                curveToRelative(1.717f, 0.0f, 3.225f, 0.376f, 4.272f, 0.734f)
                curveToRelative(0.823f, 0.282f, 1.527f, 0.824f, 2.014f, 1.545f)
                lineToRelative(4.42f, 6.544f)
                curveToRelative(0.878f, 1.646f, 1.326f, 3.509f, 1.292f, 5.374f)
                close()
                moveTo(17.0f, 15.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                reflectiveCurveToRelative(-5.0f, 2.243f, -5.0f, 5.0f)
                reflectiveCurveToRelative(2.243f, 5.0f, 5.0f, 5.0f)
                reflectiveCurveToRelative(5.0f, -2.243f, 5.0f, -5.0f)
                close()
            }
        }
        .build()
        return _phoneRotary!!
    }

private var _phoneRotary: ImageVector? = null
