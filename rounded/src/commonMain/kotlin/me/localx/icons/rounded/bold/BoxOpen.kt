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

public val Icons.Bold.BoxOpen: ImageVector
    get() {
        if (_boxOpen != null) {
            return _boxOpen!!
        }
        _boxOpen = Builder(name = "BoxOpen", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.715f, 6.937f)
                lineToRelative(-1.022f, -2.236f)
                curveToRelative(-0.453f, -0.753f, -1.14f, -1.337f, -1.956f, -1.663f)
                lineTo(14.223f, 0.43f)
                curveToRelative(-0.716f, -0.286f, -1.473f, -0.43f, -2.23f, -0.43f)
                reflectiveCurveToRelative(-1.517f, 0.144f, -2.234f, 0.431f)
                lineTo(3.261f, 3.038f)
                curveToRelative(-0.815f, 0.327f, -1.5f, 0.91f, -1.953f, 1.662f)
                lineTo(0.285f, 6.937f)
                curveToRelative(-0.657f, 1.095f, -0.131f, 2.517f, 1.08f, 2.92f)
                lineToRelative(6.971f, 3.124f)
                curveToRelative(0.208f, 0.069f, 0.422f, 0.103f, 0.632f, 0.103f)
                curveToRelative(0.688f, 0.0f, 1.346f, -0.356f, 1.715f, -0.971f)
                lineToRelative(1.306f, -2.448f)
                lineToRelative(1.326f, 2.448f)
                curveToRelative(0.369f, 0.615f, 1.028f, 0.971f, 1.715f, 0.971f)
                curveToRelative(0.211f, 0.0f, 0.424f, -0.033f, 0.632f, -0.103f)
                lineToRelative(6.971f, -3.124f)
                curveToRelative(1.211f, -0.404f, 1.737f, -1.825f, 1.08f, -2.92f)
                close()
                moveTo(18.497f, 5.372f)
                lineToRelative(-6.496f, 2.407f)
                lineToRelative(-6.498f, -2.407f)
                lineToRelative(5.374f, -2.156f)
                curveToRelative(0.357f, -0.143f, 0.733f, -0.216f, 1.117f, -0.216f)
                reflectiveCurveToRelative(0.759f, 0.072f, 1.115f, 0.215f)
                lineToRelative(5.388f, 2.157f)
                close()
                moveTo(21.999f, 12.332f)
                lineToRelative(-0.003f, 4.925f)
                curveToRelative(-0.002f, 2.273f, -1.452f, 4.282f, -3.608f, 5.001f)
                lineToRelative(-4.126f, 1.375f)
                curveToRelative(-0.73f, 0.244f, -1.498f, 0.365f, -2.266f, 0.365f)
                reflectiveCurveToRelative(-1.535f, -0.122f, -2.265f, -0.365f)
                lineToRelative(-4.122f, -1.374f)
                curveToRelative(-2.161f, -0.72f, -3.61f, -2.733f, -3.608f, -5.009f)
                verticalLineToRelative(-4.917f)
                lineToRelative(3.0f, 1.344f)
                verticalLineToRelative(3.574f)
                curveToRelative(0.0f, 0.983f, 0.625f, 1.851f, 1.557f, 2.162f)
                lineToRelative(3.939f, 1.313f)
                lineToRelative(0.002f, -5.968f)
                curveToRelative(0.573f, -0.236f, 1.094f, -0.594f, 1.502f, -1.066f)
                curveToRelative(0.409f, 0.473f, 0.927f, 0.83f, 1.498f, 1.069f)
                lineToRelative(-0.002f, 5.964f)
                lineToRelative(3.943f, -1.313f)
                curveToRelative(0.93f, -0.31f, 1.556f, -1.177f, 1.557f, -2.158f)
                lineToRelative(0.002f, -3.582f)
                lineToRelative(3.001f, -1.34f)
                close()
            }
        }
        .build()
        return _boxOpen!!
    }

private var _boxOpen: ImageVector? = null
