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

public val Icons.Outline.HandHoldingMedical: ImageVector
    get() {
        if (_handHoldingMedical != null) {
            return _handHoldingMedical!!
        }
        _handHoldingMedical = Builder(name = "HandHoldingMedical", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(5.0f, 4.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                lineTo(8.0f, 1.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                close()
                moveTo(23.236f, 13.015f)
                lineToRelative(-6.805f, 7.637f)
                curveToRelative(-1.896f, 2.128f, -4.617f, 3.348f, -7.466f, 3.348f)
                horizontalLineToRelative(-4.965f)
                curveToRelative(-2.206f, 0.0f, -4.0f, -1.794f, -4.0f, -4.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -2.206f, 1.794f, -4.0f, 4.0f, -4.0f)
                horizontalLineToRelative(8.858f)
                curveToRelative(1.139f, 0.0f, 2.138f, 0.609f, 2.689f, 1.518f)
                lineToRelative(3.216f, -3.534f)
                curveToRelative(0.542f, -0.595f, 1.282f, -0.944f, 2.086f, -0.981f)
                curveToRelative(0.803f, -0.045f, 1.573f, 0.24f, 2.168f, 0.782f)
                curveToRelative(1.214f, 1.107f, 1.312f, 3.004f, 0.219f, 4.229f)
                close()
                moveTo(21.67f, 10.264f)
                curveToRelative(-0.199f, -0.181f, -0.459f, -0.267f, -0.728f, -0.262f)
                curveToRelative(-0.27f, 0.013f, -0.518f, 0.129f, -0.7f, 0.329f)
                lineToRelative(-4.426f, 4.864f)
                curveToRelative(-0.385f, 1.071f, -1.339f, 1.891f, -2.514f, 2.059f)
                lineToRelative(-5.161f, 0.737f)
                curveToRelative(-0.545f, 0.079f, -1.053f, -0.301f, -1.131f, -0.848f)
                curveToRelative(-0.078f, -0.547f, 0.302f, -1.053f, 0.848f, -1.131f)
                lineToRelative(5.161f, -0.737f)
                curveToRelative(0.559f, -0.08f, 0.981f, -0.566f, 0.981f, -1.131f)
                curveToRelative(0.0f, -0.63f, -0.512f, -1.142f, -1.142f, -1.142f)
                lineTo(4.0f, 13.002f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(4.965f)
                curveToRelative(2.279f, 0.0f, 4.457f, -0.976f, 5.973f, -2.678f)
                lineToRelative(6.805f, -7.638f)
                curveToRelative(0.367f, -0.412f, 0.334f, -1.049f, -0.073f, -1.421f)
                close()
            }
        }
        .build()
        return _handHoldingMedical!!
    }

private var _handHoldingMedical: ImageVector? = null
