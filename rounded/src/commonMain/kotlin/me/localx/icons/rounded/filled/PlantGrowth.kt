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

public val Icons.Filled.PlantGrowth: ImageVector
    get() {
        if (_plantGrowth != null) {
            return _plantGrowth!!
        }
        _plantGrowth = Builder(name = "PlantGrowth", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 10.323f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.087f, 3.27f, -1.156f, 5.868f, -3.179f, 7.72f)
                curveToRelative(-2.607f, 2.389f, -6.083f, 2.863f, -7.81f, 2.943f)
                verticalLineToRelative(2.014f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-2.014f)
                curveToRelative(-1.726f, -0.08f, -5.201f, -0.554f, -7.809f, -2.943f)
                curveTo(1.181f, 16.19f, 0.111f, 13.593f, 0.024f, 10.323f)
                curveToRelative(-0.017f, -0.649f, 0.252f, -1.277f, 0.737f, -1.722f)
                curveToRelative(0.49f, -0.449f, 1.147f, -0.664f, 1.803f, -0.586f)
                curveToRelative(5.656f, 0.654f, 8.255f, 4.435f, 9.447f, 7.569f)
                curveToRelative(1.192f, -3.134f, 3.792f, -6.916f, 9.448f, -7.569f)
                curveToRelative(0.654f, -0.075f, 1.311f, 0.137f, 1.801f, 0.585f)
                curveToRelative(0.486f, 0.445f, 0.756f, 1.073f, 0.739f, 1.723f)
                close()
                moveTo(9.196f, 4.718f)
                lineToRelative(1.804f, -1.735f)
                verticalLineToRelative(6.017f)
                curveToRelative(0.0f, 0.552f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineTo(2.97f)
                lineToRelative(1.804f, 1.748f)
                curveToRelative(0.194f, 0.188f, 0.445f, 0.282f, 0.696f, 0.282f)
                curveToRelative(0.261f, 0.0f, 0.521f, -0.102f, 0.718f, -0.304f)
                curveToRelative(0.385f, -0.396f, 0.375f, -1.029f, -0.021f, -1.414f)
                lineTo(13.414f, 0.586f)
                curveToRelative(-0.78f, -0.779f, -2.049f, -0.78f, -2.817f, -0.011f)
                lineToRelative(-2.793f, 2.707f)
                curveToRelative(-0.396f, 0.385f, -0.406f, 1.018f, -0.021f, 1.414f)
                curveToRelative(0.386f, 0.397f, 1.018f, 0.405f, 1.414f, 0.022f)
                close()
            }
        }
        .build()
        return _plantGrowth!!
    }

private var _plantGrowth: ImageVector? = null
