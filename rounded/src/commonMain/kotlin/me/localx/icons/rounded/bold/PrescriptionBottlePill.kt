package me.localx.icons.rounded.bold

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
                moveToRelative(5.0f, 11.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 1.379f, 1.121f, 2.5f, 2.5f, 2.5f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                curveToRelative(-3.032f, 0.0f, -5.5f, -2.468f, -5.5f, -5.5f)
                lineTo(2.0f, 4.95f)
                curveToRelative(-1.141f, -0.232f, -2.0f, -1.24f, -2.0f, -2.45f)
                curveTo(0.0f, 1.119f, 1.119f, 0.0f, 2.5f, 0.0f)
                horizontalLineToRelative(17.0f)
                curveToRelative(1.381f, 0.0f, 2.5f, 1.119f, 2.5f, 2.5f)
                curveToRelative(0.0f, 1.209f, -0.859f, 2.218f, -2.0f, 2.45f)
                verticalLineToRelative(1.55f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-1.5f)
                lineTo(5.0f, 5.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-2.5f)
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
