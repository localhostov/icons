package me.localx.icons.straight.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Outline.FaceSunglasses: ImageVector
    get() {
        if (_faceSunglasses != null) {
            return _faceSunglasses!!
        }
        _faceSunglasses = Builder(name = "FaceSunglasses", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 2.0f)
                curveToRelative(3.711f, 0.0f, 6.956f, 2.032f, 8.682f, 5.041f)
                curveToRelative(-0.146f, -0.027f, -0.295f, -0.041f, -0.446f, -0.041f)
                horizontalLineToRelative(-6.149f)
                lineToRelative(-1.0f, 1.0f)
                horizontalLineToRelative(-2.172f)
                lineToRelative(-1.0f, -1.0f)
                lineTo(3.765f, 7.0f)
                curveToRelative(-0.151f, 0.0f, -0.3f, 0.015f, -0.446f, 0.041f)
                curveToRelative(1.726f, -3.01f, 4.971f, -5.041f, 8.682f, -5.041f)
                close()
                moveTo(12.0f, 22.0f)
                curveToRelative(-5.361f, 0.0f, -9.75f, -4.241f, -9.989f, -9.544f)
                curveToRelative(0.512f, 0.93f, 1.502f, 1.544f, 2.605f, 1.544f)
                horizontalLineToRelative(3.338f)
                curveToRelative(1.369f, 0.0f, 2.559f, -0.928f, 2.891f, -2.257f)
                lineToRelative(0.436f, -1.743f)
                horizontalLineToRelative(1.439f)
                lineToRelative(0.436f, 1.743f)
                curveToRelative(0.332f, 1.329f, 1.521f, 2.257f, 2.891f, 2.257f)
                horizontalLineToRelative(3.338f)
                curveToRelative(1.104f, 0.0f, 2.094f, -0.614f, 2.605f, -1.544f)
                curveToRelative(-0.239f, 5.303f, -4.628f, 9.544f, -9.989f, 9.544f)
                close()
                moveTo(16.336f, 15.252f)
                lineToRelative(1.33f, 1.493f)
                curveToRelative(-0.103f, 0.092f, -2.559f, 2.254f, -5.666f, 2.254f)
                reflectiveCurveToRelative(-5.563f, -2.162f, -5.666f, -2.254f)
                lineToRelative(1.33f, -1.493f)
                curveToRelative(0.02f, 0.018f, 2.005f, 1.748f, 4.336f, 1.748f)
                reflectiveCurveToRelative(4.316f, -1.73f, 4.336f, -1.748f)
                close()
            }
        }
        .build()
        return _faceSunglasses!!
    }

private var _faceSunglasses: ImageVector? = null
