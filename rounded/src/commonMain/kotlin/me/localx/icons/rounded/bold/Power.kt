package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.Power: ImageVector
    get() {
        if (_power != null) {
            return _power!!
        }
        _power = Builder(name = "Power", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.292f, viewportHeight = 512.292f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.061f, 0.0f)
                lineTo(256.061f, 0.0f)
                curveToRelative(17.673f, 0.0f, 32.0f, 14.327f, 32.0f, 32.0f)
                verticalLineToRelative(106.667f)
                curveToRelative(0.0f, 17.673f, -14.327f, 32.0f, -32.0f, 32.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(-17.673f, 0.0f, -32.0f, -14.327f, -32.0f, -32.0f)
                verticalLineTo(32.0f)
                curveTo(224.061f, 14.327f, 238.387f, 0.0f, 256.061f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(330.727f, 105.387f)
                lineTo(330.727f, 105.387f)
                curveToRelative(-0.157f, 10.742f, 5.259f, 20.8f, 14.315f, 26.581f)
                curveToRelative(80.432f, 49.143f, 105.796f, 154.185f, 56.652f, 234.616f)
                reflectiveCurveTo(247.51f, 472.38f, 167.078f, 423.237f)
                reflectiveCurveTo(61.282f, 269.052f, 110.426f, 188.62f)
                curveToRelative(14.042f, -22.982f, 33.324f, -42.315f, 56.269f, -56.418f)
                curveToRelative(9.211f, -5.781f, 14.773f, -15.92f, 14.699f, -26.795f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.049f, -17.673f, -14.238f, -32.039f, -31.911f, -32.088f)
                curveToRelative(-6.07f, -0.017f, -12.02f, 1.693f, -17.155f, 4.931f)
                curveTo(22.233f, 146.634f, -11.58f, 291.318f, 56.803f, 401.412f)
                reflectiveCurveToRelative(213.067f, 143.907f, 323.161f, 75.524f)
                reflectiveCurveToRelative(143.907f, -213.067f, 75.524f, -323.161f)
                curveToRelative(-19.035f, -30.645f, -44.879f, -56.489f, -75.524f, -75.524f)
                curveToRelative(-14.997f, -9.461f, -34.824f, -4.973f, -44.285f, 10.024f)
                curveTo(332.447f, 93.397f, 330.731f, 99.33f, 330.727f, 105.387f)
                close()
            }
        }
        .build()
        return _power!!
    }

private var _power: ImageVector? = null
