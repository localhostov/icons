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

public val Icons.Filled.Lips: ImageVector
    get() {
        if (_lips != null) {
            return _lips!!
        }
        _lips = Builder(name = "Lips", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.547f, 10.33f)
                curveToRelative(-2.025f, -3.282f, -4.577f, -5.646f, -6.289f, -6.763f)
                curveToRelative(-0.572f, -0.374f, -1.182f, -0.562f, -1.815f, -0.562f)
                horizontalLineToRelative(-0.023f)
                curveToRelative(-0.927f, 0.007f, -1.726f, 0.32f, -2.312f, 0.905f)
                lineToRelative(-1.116f, 1.099f)
                lineToRelative(-1.1f, -1.1f)
                curveToRelative(-0.586f, -0.586f, -1.368f, -0.909f, -2.2f, -0.909f)
                curveToRelative(-0.709f, 0.0f, -1.364f, 0.183f, -1.893f, 0.528f)
                curveToRelative(-1.607f, 1.05f, -4.23f, 3.459f, -6.333f, 6.793f)
                curveToRelative(-0.672f, 1.067f, -0.62f, 2.412f, 0.134f, 3.424f)
                curveToRelative(0.777f, 1.044f, 4.98f, 6.254f, 11.399f, 6.254f)
                reflectiveCurveToRelative(10.623f, -5.22f, 11.4f, -6.266f)
                curveToRelative(0.746f, -1.004f, 0.804f, -2.34f, 0.147f, -3.404f)
                close()
                moveTo(21.218f, 12.976f)
                curveToRelative(-0.188f, 0.042f, -4.642f, 1.024f, -9.218f, 1.024f)
                reflectiveCurveToRelative(-9.03f, -0.982f, -9.218f, -1.024f)
                curveToRelative(-0.457f, -0.102f, -0.782f, -0.508f, -0.782f, -0.976f)
                reflectiveCurveToRelative(0.325f, -0.874f, 0.782f, -0.976f)
                curveToRelative(0.188f, -0.042f, 4.642f, -1.024f, 9.218f, -1.024f)
                curveToRelative(3.439f, 0.0f, 6.486f, 0.553f, 8.123f, 0.85f)
                curveToRelative(0.441f, 0.08f, 0.751f, 0.141f, 0.898f, 0.15f)
                curveToRelative(0.497f, 0.032f, 0.916f, 0.424f, 0.955f, 0.921f)
                curveToRelative(0.039f, 0.496f, -0.272f, 0.946f, -0.758f, 1.055f)
                close()
            }
        }
        .build()
        return _lips!!
    }

private var _lips: ImageVector? = null
