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

public val Icons.Outline.FaceDowncastSweat: ImageVector
    get() {
        if (_faceDowncastSweat != null) {
            return _faceDowncastSweat!!
        }
        _faceDowncastSweat = Builder(name = "FaceDowncastSweat", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 6.617f, -5.383f, 12.0f, -12.0f, 12.0f)
                reflectiveCurveTo(0.0f, 18.617f, 0.0f, 12.0f)
                curveToRelative(0.0f, -1.406f, 0.255f, -2.75f, 0.702f, -4.004f)
                curveToRelative(0.522f, 0.419f, 1.129f, 0.732f, 1.803f, 0.885f)
                curveToRelative(-0.324f, 0.983f, -0.505f, 2.03f, -0.505f, 3.119f)
                curveToRelative(0.0f, 5.514f, 4.486f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.486f, 10.0f, -10.0f)
                reflectiveCurveTo(17.514f, 2.0f, 12.0f, 2.0f)
                curveToRelative(-1.523f, 0.0f, -2.961f, 0.352f, -4.255f, 0.964f)
                curveToRelative(-0.201f, -0.64f, -0.5f, -1.256f, -0.835f, -1.815f)
                curveToRelative(1.547f, -0.729f, 3.268f, -1.148f, 5.089f, -1.148f)
                curveToRelative(6.617f, 0.0f, 12.0f, 5.383f, 12.0f, 12.0f)
                close()
                moveTo(3.5f, 7.0f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                curveTo(6.0f, 2.513f, 3.5f, 0.0f, 3.5f, 0.0f)
                curveTo(3.5f, 0.0f, 1.0f, 2.462f, 1.0f, 4.5f)
                curveToRelative(0.0f, 1.381f, 1.119f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(8.403f, 17.198f)
                lineToRelative(1.19f, 1.606f)
                curveToRelative(0.011f, -0.008f, 1.118f, -0.805f, 2.407f, -0.805f)
                reflectiveCurveToRelative(2.396f, 0.797f, 2.403f, 0.802f)
                lineToRelative(1.194f, -1.604f)
                curveToRelative(-0.066f, -0.049f, -1.632f, -1.198f, -3.597f, -1.198f)
                reflectiveCurveToRelative(-3.531f, 1.149f, -3.597f, 1.198f)
                close()
                moveTo(6.0f, 13.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-2.0f)
                lineTo(6.0f, 11.0f)
                verticalLineToRelative(2.0f)
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
