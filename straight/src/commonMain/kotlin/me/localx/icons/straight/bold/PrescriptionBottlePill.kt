package me.localx.icons.straight.bold

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

public val Icons.Bold.PrescriptionBottlePill: ImageVector
    get() {
        if (_prescriptionBottlePill != null) {
            return _prescriptionBottlePill!!
        }
        _prescriptionBottlePill = Builder(name = "PrescriptionBottlePill", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.344f, 24.0f)
                horizontalLineToRelative(-5.844f)
                curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(2.0f, 5.0f)
                lineTo(0.0f, 5.0f)
                verticalLineToRelative(-2.0f)
                curveTo(0.0f, 1.343f, 1.343f, 0.0f, 3.0f, 0.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.657f, 0.0f, 3.0f, 1.343f, 3.0f, 3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.513f)
                curveToRelative(-0.938f, -0.332f, -1.948f, -0.513f, -3.0f, -0.513f)
                verticalLineToRelative(-3.0f)
                lineTo(5.0f, 5.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(4.5f)
                curveToRelative(0.0f, 0.275f, 0.225f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(3.436f)
                curveToRelative(0.58f, 1.166f, 1.404f, 2.189f, 2.407f, 3.0f)
                close()
                moveTo(24.0f, 17.0f)
                curveToRelative(0.0f, 3.859f, -3.141f, 7.0f, -7.0f, 7.0f)
                reflectiveCurveToRelative(-7.0f, -3.141f, -7.0f, -7.0f)
                reflectiveCurveToRelative(3.141f, -7.0f, 7.0f, -7.0f)
                reflectiveCurveToRelative(7.0f, 3.141f, 7.0f, 7.0f)
                close()
                moveTo(13.0f, 17.0f)
                curveToRelative(0.0f, 0.554f, 0.113f, 1.082f, 0.317f, 1.562f)
                lineToRelative(5.244f, -5.244f)
                curveToRelative(-0.48f, -0.204f, -1.008f, -0.317f, -1.562f, -0.317f)
                curveToRelative(-2.206f, 0.0f, -4.0f, 1.794f, -4.0f, 4.0f)
                close()
                moveTo(21.0f, 17.0f)
                curveToRelative(0.0f, -0.554f, -0.113f, -1.082f, -0.317f, -1.562f)
                lineToRelative(-5.244f, 5.244f)
                curveToRelative(0.48f, 0.204f, 1.008f, 0.317f, 1.562f, 0.317f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.794f, 4.0f, -4.0f)
                close()
            }
        }
        .build()
        return _prescriptionBottlePill!!
    }

private var _prescriptionBottlePill: ImageVector? = null
