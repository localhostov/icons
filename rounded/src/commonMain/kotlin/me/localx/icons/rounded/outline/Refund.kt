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

public val Icons.Outline.Refund: ImageVector
    get() {
        if (_refund != null) {
            return _refund!!
        }
        _refund = Builder(name = "Refund", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(2.0f, 6.0f)
                lineTo(2.0f, 1.0f)
                curveToRelative(0.0f, -0.553f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.552f, 0.449f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                lineTo(12.0f, 1.0f)
                curveToRelative(0.0f, -0.553f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                close()
                moveTo(7.962f, 3.0f)
                curveToRelative(1.311f, 0.0f, 2.589f, -0.841f, 2.997f, -2.013f)
                curveToRelative(0.168f, -0.481f, -0.196f, -0.987f, -0.706f, -0.987f)
                horizontalLineToRelative(-4.506f)
                curveToRelative(-0.51f, 0.0f, -0.873f, 0.505f, -0.706f, 0.987f)
                curveToRelative(0.408f, 1.172f, 1.609f, 2.013f, 2.92f, 2.013f)
                close()
                moveTo(23.237f, 13.015f)
                lineToRelative(-6.805f, 7.638f)
                curveToRelative(-1.896f, 2.128f, -4.618f, 3.348f, -7.466f, 3.348f)
                horizontalLineToRelative(-4.965f)
                curveToRelative(-2.206f, 0.0f, -4.0f, -1.794f, -4.0f, -4.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -2.206f, 1.794f, -4.0f, 4.0f, -4.0f)
                horizontalLineToRelative(8.858f)
                curveToRelative(1.139f, 0.0f, 2.138f, 0.609f, 2.689f, 1.519f)
                lineToRelative(3.216f, -3.534f)
                curveToRelative(0.542f, -0.595f, 1.282f, -0.943f, 2.086f, -0.981f)
                curveToRelative(0.808f, -0.034f, 1.574f, 0.24f, 2.168f, 0.782f)
                curveToRelative(1.213f, 1.105f, 1.312f, 3.003f, 0.219f, 4.229f)
                close()
                moveTo(21.671f, 10.264f)
                curveToRelative(-0.2f, -0.182f, -0.458f, -0.278f, -0.728f, -0.263f)
                curveToRelative(-0.27f, 0.013f, -0.519f, 0.13f, -0.7f, 0.329f)
                lineToRelative(-4.426f, 4.864f)
                curveToRelative(-0.385f, 1.07f, -1.339f, 1.891f, -2.515f, 2.059f)
                lineToRelative(-5.16f, 0.737f)
                curveToRelative(-0.545f, 0.08f, -1.053f, -0.301f, -1.131f, -0.849f)
                curveToRelative(-0.078f, -0.547f, 0.302f, -1.054f, 0.848f, -1.132f)
                lineToRelative(5.161f, -0.737f)
                curveToRelative(0.56f, -0.079f, 0.981f, -0.565f, 0.981f, -1.13f)
                curveToRelative(0.0f, -0.63f, -0.512f, -1.143f, -1.142f, -1.143f)
                lineTo(4.0f, 12.999f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(4.965f)
                curveToRelative(2.279f, 0.0f, 4.456f, -0.977f, 5.973f, -2.678f)
                lineToRelative(6.805f, -7.638f)
                curveToRelative(0.367f, -0.412f, 0.334f, -1.05f, -0.073f, -1.421f)
                close()
            }
        }
        .build()
        return _refund!!
    }

private var _refund: ImageVector? = null
