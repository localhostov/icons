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

public val Icons.Outline.TruckMedical: ImageVector
    get() {
        if (_truckMedical != null) {
            return _truckMedical!!
        }
        _truckMedical = Builder(name = "TruckMedical", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 5.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                lineTo(4.0f, 1.0f)
                curveTo(1.794f, 1.0f, 0.0f, 2.794f, 0.0f, 5.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 1.881f, 1.309f, 3.452f, 3.061f, 3.877f)
                curveToRelative(-0.038f, 0.204f, -0.061f, 0.412f, -0.061f, 0.623f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                curveToRelative(0.0f, -0.169f, -0.017f, -0.335f, -0.041f, -0.5f)
                horizontalLineToRelative(4.082f)
                curveToRelative(-0.024f, 0.165f, -0.041f, 0.331f, -0.041f, 0.5f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                curveToRelative(0.0f, -0.211f, -0.023f, -0.419f, -0.061f, -0.623f)
                curveToRelative(1.752f, -0.425f, 3.061f, -1.996f, 3.061f, -3.877f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(19.0f, 7.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(2.0f, 15.0f)
                lineTo(2.0f, 5.0f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(9.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                verticalLineToRelative(12.0f)
                lineTo(4.0f, 17.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                close()
                moveTo(20.0f, 17.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                close()
                moveTo(4.0f, 10.0f)
                curveToRelative(0.0f, -0.553f, 0.447f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -0.553f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.447f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _truckMedical!!
    }

private var _truckMedical: ImageVector? = null
