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

public val Icons.Filled.Cv: ImageVector
    get() {
        if (_cv != null) {
            return _cv!!
        }
        _cv = Builder(name = "Cv", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.0f, 16.0f)
                horizontalLineToRelative(6.54f)
                curveToRelative(-0.347f, 0.913f, -0.88f, 1.753f, -1.591f, 2.464f)
                lineToRelative(-3.484f, 3.486f)
                curveToRelative(-0.712f, 0.711f, -1.552f, 1.244f, -2.465f, 1.59f)
                verticalLineToRelative(-6.54f)
                curveToRelative(0.0f, -0.551f, 0.448f, -1.0f, 1.0f, -1.0f)
                close()
                moveTo(22.0f, 5.0f)
                verticalLineToRelative(8.515f)
                curveToRelative(0.0f, 0.163f, -0.013f, 0.324f, -0.024f, 0.485f)
                horizontalLineToRelative(-6.976f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(6.976f)
                curveToRelative(-0.161f, 0.011f, -0.322f, 0.024f, -0.485f, 0.024f)
                horizontalLineToRelative(-4.515f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                lineTo(2.0f, 5.0f)
                curveTo(2.0f, 2.243f, 4.243f, 0.0f, 7.0f, 0.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, 2.243f, 5.0f, 5.0f)
                close()
                moveTo(6.527f, 8.5f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.496f, 0.404f, -0.9f, 0.9f, -0.9f)
                curveToRelative(0.408f, 0.0f, 0.753f, 0.272f, 0.863f, 0.645f)
                curveToRelative(0.024f, 0.081f, 0.027f, 0.755f, 0.833f, 0.755f)
                reflectiveCurveToRelative(0.815f, -0.699f, 0.804f, -0.796f)
                curveToRelative(-0.146f, -1.241f, -1.219f, -2.204f, -2.5f, -2.204f)
                curveToRelative(-1.381f, 0.0f, -2.5f, 1.119f, -2.5f, 2.5f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.381f, 1.119f, 2.5f, 2.5f, 2.5f)
                curveToRelative(1.278f, 0.0f, 2.35f, -0.958f, 2.5f, -2.196f)
                curveToRelative(0.012f, -0.1f, -0.032f, -0.804f, -0.799f, -0.804f)
                reflectiveCurveToRelative(-0.813f, 0.669f, -0.835f, 0.747f)
                curveToRelative(-0.108f, 0.376f, -0.455f, 0.653f, -0.866f, 0.653f)
                curveToRelative(-0.496f, 0.0f, -0.9f, -0.404f, -0.9f, -0.9f)
                close()
                moveTo(15.984f, 4.214f)
                curveToRelative(0.1f, -0.495f, -0.279f, -0.958f, -0.784f, -0.958f)
                curveToRelative(-0.381f, 0.0f, -0.709f, 0.268f, -0.784f, 0.642f)
                lineToRelative(-1.053f, 5.222f)
                curveToRelative(-0.015f, 0.078f, -0.037f, 0.141f, -0.057f, 0.188f)
                curveToRelative(-0.019f, -0.041f, -0.038f, -0.094f, -0.05f, -0.159f)
                lineToRelative(-1.072f, -5.253f)
                curveToRelative(-0.076f, -0.372f, -0.404f, -0.64f, -0.784f, -0.64f)
                curveToRelative(-0.506f, 0.0f, -0.885f, 0.464f, -0.784f, 0.96f)
                lineToRelative(1.072f, 5.253f)
                curveToRelative(0.108f, 0.561f, 0.422f, 1.044f, 0.86f, 1.313f)
                curveToRelative(0.237f, 0.145f, 0.496f, 0.218f, 0.758f, 0.218f)
                curveToRelative(0.225f, 0.0f, 0.452f, -0.054f, 0.667f, -0.162f)
                curveToRelative(0.475f, -0.238f, 0.835f, -0.766f, 0.961f, -1.412f)
                lineToRelative(1.051f, -5.211f)
                close()
            }
        }
        .build()
        return _cv!!
    }

private var _cv: ImageVector? = null
