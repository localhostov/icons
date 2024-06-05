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

public val Icons.Outline.Onboarding: ImageVector
    get() {
        if (_onboarding != null) {
            return _onboarding!!
        }
        _onboarding = Builder(name = "Onboarding", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.0f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(5.716f, 9.198f)
                curveToRelative(1.508f, -1.545f, 4.061f, -1.545f, 5.568f, 0.0f)
                curveToRelative(0.196f, 0.201f, 0.456f, 0.302f, 0.716f, 0.302f)
                curveToRelative(0.252f, 0.0f, 0.504f, -0.095f, 0.698f, -0.284f)
                curveToRelative(0.396f, -0.386f, 0.403f, -1.019f, 0.018f, -1.414f)
                curveToRelative(-1.134f, -1.162f, -2.631f, -1.802f, -4.216f, -1.802f)
                reflectiveCurveToRelative(-3.082f, 0.64f, -4.216f, 1.802f)
                curveToRelative(-0.386f, 0.396f, -0.378f, 1.028f, 0.018f, 1.414f)
                curveToRelative(0.395f, 0.385f, 1.028f, 0.379f, 1.414f, -0.018f)
                close()
                moveTo(23.236f, 13.015f)
                lineToRelative(-6.804f, 7.637f)
                curveToRelative(-1.896f, 2.128f, -4.618f, 3.348f, -7.467f, 3.348f)
                horizontalLineToRelative(-4.965f)
                curveToRelative(-2.206f, 0.0f, -4.0f, -1.794f, -4.0f, -4.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -2.206f, 1.794f, -4.0f, 4.0f, -4.0f)
                horizontalLineToRelative(8.857f)
                curveToRelative(1.14f, 0.0f, 2.139f, 0.609f, 2.689f, 1.519f)
                lineToRelative(3.217f, -3.534f)
                curveToRelative(0.541f, -0.595f, 1.281f, -0.943f, 2.085f, -0.981f)
                curveToRelative(0.794f, -0.03f, 1.573f, 0.239f, 2.169f, 0.782f)
                curveToRelative(1.214f, 1.106f, 1.312f, 3.004f, 0.218f, 4.23f)
                close()
                moveTo(21.671f, 10.263f)
                curveToRelative(-0.199f, -0.182f, -0.459f, -0.282f, -0.728f, -0.263f)
                curveToRelative(-0.27f, 0.013f, -0.519f, 0.13f, -0.7f, 0.329f)
                lineToRelative(-4.426f, 4.865f)
                curveToRelative(-0.385f, 1.07f, -1.339f, 1.89f, -2.514f, 2.058f)
                lineToRelative(-5.161f, 0.737f)
                curveToRelative(-0.551f, 0.074f, -1.054f, -0.302f, -1.132f, -0.849f)
                reflectiveCurveToRelative(0.302f, -1.054f, 0.849f, -1.132f)
                lineToRelative(5.161f, -0.737f)
                curveToRelative(0.56f, -0.079f, 0.98f, -0.565f, 0.98f, -1.13f)
                curveToRelative(0.0f, -0.63f, -0.513f, -1.143f, -1.143f, -1.143f)
                lineTo(4.0f, 12.998f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(4.965f)
                curveToRelative(2.279f, 0.0f, 4.456f, -0.977f, 5.974f, -2.678f)
                lineToRelative(6.804f, -7.638f)
                curveToRelative(0.368f, -0.412f, 0.336f, -1.05f, -0.072f, -1.421f)
                close()
            }
        }
        .build()
        return _onboarding!!
    }

private var _onboarding: ImageVector? = null
