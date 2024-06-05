package me.localx.icons.straight.filled

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

public val Icons.Filled.FaceDowncastSweat: ImageVector
    get() {
        if (_faceDowncastSweat != null) {
            return _faceDowncastSweat!!
        }
        _faceDowncastSweat = Builder(name = "FaceDowncastSweat", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 4.5f)
                curveToRelative(0.0f, 1.381f, -1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveTo(1.0f, 5.881f, 1.0f, 4.5f)
                curveTo(1.0f, 2.462f, 3.5f, 0.0f, 3.5f, 0.0f)
                curveTo(3.5f, 0.0f, 6.0f, 2.513f, 6.0f, 4.5f)
                close()
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 6.617f, -5.383f, 12.0f, -12.0f, 12.0f)
                reflectiveCurveTo(0.0f, 18.617f, 0.0f, 12.0f)
                curveToRelative(0.0f, -1.406f, 0.255f, -2.75f, 0.702f, -4.004f)
                lineTo(0.702f, 7.996f)
                curveToRelative(0.771f, 0.618f, 1.736f, 1.004f, 2.798f, 1.004f)
                curveToRelative(2.481f, 0.0f, 4.5f, -2.019f, 4.5f, -4.5f)
                curveToRelative(0.0f, -1.172f, -0.492f, -2.352f, -1.089f, -3.352f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f)
                curveToRelative(1.547f, -0.729f, 3.268f, -1.148f, 5.089f, -1.148f)
                curveToRelative(6.617f, 0.0f, 12.0f, 5.383f, 12.0f, 12.0f)
                close()
                moveTo(6.0f, 13.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-2.0f)
                lineTo(6.0f, 11.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(15.598f, 17.198f)
                curveToRelative(-0.066f, -0.049f, -1.632f, -1.198f, -3.598f, -1.198f)
                reflectiveCurveToRelative(-3.531f, 1.149f, -3.598f, 1.198f)
                lineToRelative(1.191f, 1.606f)
                curveToRelative(0.011f, -0.008f, 1.117f, -0.805f, 2.406f, -0.805f)
                reflectiveCurveToRelative(2.396f, 0.797f, 2.402f, 0.802f)
                lineToRelative(1.195f, -1.604f)
                close()
                moveTo(18.0f, 11.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _faceDowncastSweat!!
    }

private var _faceDowncastSweat: ImageVector? = null
