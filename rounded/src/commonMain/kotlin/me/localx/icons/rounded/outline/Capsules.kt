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

public val Icons.Outline.Capsules: ImageVector
    get() {
        if (_capsules != null) {
            return _capsules!!
        }
        _capsules = Builder(name = "Capsules", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.204f, 14.384f)
                lineToRelative(-5.327f, -10.009f)
                curveToRelative(-1.479f, -2.696f, -4.635f, -3.966f, -7.531f, -3.112f)
                curveToRelative(-1.078f, -0.794f, -2.408f, -1.263f, -3.846f, -1.263f)
                curveTo(2.916f, 0.0f, 0.0f, 2.916f, 0.0f, 6.5f)
                verticalLineToRelative(11.0f)
                curveTo(0.0f, 21.084f, 2.916f, 24.0f, 6.5f, 24.0f)
                curveToRelative(2.312f, 0.0f, 4.346f, -1.214f, 5.499f, -3.038f)
                curveToRelative(0.846f, 1.348f, 2.14f, 2.327f, 3.681f, 2.777f)
                curveToRelative(0.603f, 0.176f, 1.218f, 0.263f, 1.829f, 0.263f)
                curveToRelative(1.078f, 0.0f, 2.145f, -0.271f, 3.117f, -0.804f)
                curveToRelative(1.522f, -0.835f, 2.628f, -2.212f, 3.115f, -3.879f)
                curveToRelative(0.486f, -1.667f, 0.294f, -3.423f, -0.535f, -4.935f)
                close()
                moveTo(16.117f, 5.326f)
                lineToRelative(2.273f, 4.27f)
                lineToRelative(-5.39f, 2.956f)
                verticalLineToRelative(-6.053f)
                curveToRelative(0.0f, -1.286f, -0.375f, -2.486f, -1.022f, -3.496f)
                curveToRelative(1.669f, -0.073f, 3.3f, 0.792f, 4.14f, 2.322f)
                close()
                moveTo(6.5f, 2.0f)
                curveToRelative(2.481f, 0.0f, 4.5f, 2.019f, 4.5f, 4.5f)
                verticalLineToRelative(4.5f)
                lineTo(2.0f, 11.0f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0.0f, -2.481f, 2.019f, -4.5f, 4.5f, -4.5f)
                close()
                moveTo(6.5f, 22.0f)
                curveToRelative(-2.481f, 0.0f, -4.5f, -2.019f, -4.5f, -4.5f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(4.5f)
                curveToRelative(0.0f, 2.481f, -2.019f, 4.5f, -4.5f, 4.5f)
                close()
                moveTo(21.819f, 18.759f)
                curveToRelative(-0.337f, 1.154f, -1.103f, 2.108f, -2.157f, 2.686f)
                reflectiveCurveToRelative(-2.271f, 0.71f, -3.423f, 0.375f)
                curveToRelative(-1.154f, -0.337f, -2.108f, -1.103f, -2.68f, -2.146f)
                lineToRelative(-0.634f, -1.19f)
                curveToRelative(0.049f, -0.321f, 0.074f, -0.649f, 0.074f, -0.983f)
                verticalLineToRelative(-2.666f)
                lineToRelative(6.33f, -3.471f)
                lineToRelative(2.114f, 3.972f)
                curveToRelative(0.578f, 1.054f, 0.711f, 2.27f, 0.375f, 3.424f)
                close()
            }
        }
        .build()
        return _capsules!!
    }

private var _capsules: ImageVector? = null
