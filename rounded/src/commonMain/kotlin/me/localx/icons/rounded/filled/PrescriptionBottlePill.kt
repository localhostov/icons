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

public val Icons.Filled.PrescriptionBottlePill: ImageVector
    get() {
        if (_prescriptionBottlePill != null) {
            return _prescriptionBottlePill!!
        }
        _prescriptionBottlePill = Builder(name = "PrescriptionBottlePill", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.258f, 21.328f)
                curveToRelative(-0.787f, -1.075f, -1.258f, -2.396f, -1.258f, -3.828f)
                curveToRelative(0.0f, -3.584f, 2.916f, -6.5f, 6.5f, -6.5f)
                curveToRelative(1.432f, 0.0f, 2.752f, 0.471f, 3.828f, 1.258f)
                lineToRelative(-9.069f, 9.069f)
                close()
                moveTo(13.672f, 22.742f)
                curveToRelative(1.075f, 0.787f, 2.396f, 1.258f, 3.828f, 1.258f)
                curveToRelative(3.584f, 0.0f, 6.5f, -2.916f, 6.5f, -6.5f)
                curveToRelative(0.0f, -1.432f, -0.471f, -2.752f, -1.258f, -3.828f)
                lineToRelative(-9.069f, 9.069f)
                close()
                moveTo(19.5f, 5.0f)
                curveToRelative(1.378f, 0.0f, 2.5f, -1.121f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.122f, -2.5f, -2.5f, -2.5f)
                lineTo(2.5f, -0.0f)
                curveTo(1.122f, 0.0f, 0.0f, 1.121f, 0.0f, 2.5f)
                reflectiveCurveToRelative(1.122f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(17.0f)
                close()
                moveTo(9.0f, 17.5f)
                curveToRelative(0.0f, -4.687f, 3.813f, -8.5f, 8.5f, -8.5f)
                curveToRelative(0.87f, 0.0f, 1.709f, 0.133f, 2.5f, 0.376f)
                verticalLineToRelative(-2.376f)
                lineTo(2.0f, 7.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                lineTo(2.0f, 12.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                lineTo(2.0f, 16.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-3.899f)
                curveToRelative(0.463f, 2.282f, 2.48f, 4.0f, 4.899f, 4.0f)
                horizontalLineToRelative(5.034f)
                curveToRelative(-1.853f, -1.561f, -3.034f, -3.894f, -3.034f, -6.5f)
                close()
            }
        }
        .build()
        return _prescriptionBottlePill!!
    }

private var _prescriptionBottlePill: ImageVector? = null
