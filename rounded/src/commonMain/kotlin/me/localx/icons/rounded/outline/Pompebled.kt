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

public val Icons.Outline.Pompebled: ImageVector
    get() {
        if (_pompebled != null) {
            return _pompebled!!
        }
        _pompebled = Builder(name = "Pompebled", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.945f, 24.0f)
                curveToRelative(-2.948f, 0.0f, -5.472f, -0.931f, -7.243f, -2.703f)
                curveTo(0.524f, 19.12f, -0.385f, 15.805f, 0.143f, 11.964f)
                curveToRelative(0.474f, -3.446f, 2.086f, -6.834f, 4.315f, -9.062f)
                lineToRelative(1.333f, -1.333f)
                curveToRelative(1.012f, -1.012f, 2.357f, -1.569f, 3.788f, -1.569f)
                reflectiveCurveToRelative(2.777f, 0.558f, 3.789f, 1.569f)
                curveToRelative(1.022f, 1.022f, 1.567f, 2.162f, 1.621f, 3.387f)
                curveToRelative(0.051f, 1.169f, -0.742f, 2.692f, -1.607f, 4.164f)
                curveToRelative(-0.452f, 0.77f, -0.51f, 1.332f, -0.17f, 1.67f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.333f, 0.334f, 0.896f, 0.273f, 1.669f, -0.181f)
                curveToRelative(1.472f, -0.865f, 3.009f, -1.657f, 4.163f, -1.607f)
                curveToRelative(1.226f, 0.053f, 2.365f, 0.598f, 3.387f, 1.621f)
                curveToRelative(1.012f, 1.012f, 1.569f, 2.357f, 1.569f, 3.789f)
                reflectiveCurveToRelative(-0.558f, 2.776f, -1.569f, 3.788f)
                lineToRelative(-1.333f, 1.333f)
                curveToRelative(-2.229f, 2.229f, -5.616f, 3.844f, -9.061f, 4.319f)
                curveToRelative(-0.717f, 0.099f, -1.416f, 0.148f, -2.091f, 0.148f)
                close()
                moveTo(9.579f, 2.001f)
                curveToRelative(-0.86f, 0.0f, -1.72f, 0.328f, -2.375f, 0.982f)
                lineToRelative(-1.333f, 1.333f)
                curveToRelative(-1.931f, 1.931f, -3.332f, 4.891f, -3.748f, 7.92f)
                curveToRelative(-0.441f, 3.207f, 0.267f, 5.922f, 1.992f, 7.647f)
                curveToRelative(1.724f, 1.725f, 4.439f, 2.432f, 7.646f, 1.987f)
                curveToRelative(3.028f, -0.418f, 5.989f, -1.821f, 7.921f, -3.752f)
                lineToRelative(1.333f, -1.333f)
                curveToRelative(1.309f, -1.309f, 1.309f, -3.439f, 0.0f, -4.749f)
                curveToRelative(-0.667f, -0.667f, -1.34f, -1.005f, -2.06f, -1.037f)
                curveToRelative(-0.505f, -0.025f, -1.521f, 0.427f, -3.063f, 1.334f)
                curveToRelative(-1.589f, 0.933f, -3.082f, 0.886f, -4.097f, -0.129f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-1.02f, -1.02f, -1.071f, -2.514f, -0.14f, -4.099f)
                curveToRelative(0.906f, -1.542f, 1.355f, -2.572f, 1.333f, -3.063f)
                curveToRelative(-0.031f, -0.72f, -0.37f, -1.394f, -1.037f, -2.06f)
                curveToRelative(-0.655f, -0.654f, -1.515f, -0.982f, -2.374f, -0.982f)
                close()
            }
        }
        .build()
        return _pompebled!!
    }

private var _pompebled: ImageVector? = null
