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

public val Icons.Outline._7: ImageVector
    get() {
        if (__7 != null) {
            return __7!!
        }
        __7 = Builder(name = "_7", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.999f, 24.0f)
                curveToRelative(-0.162f, 0.0f, -0.327f, -0.04f, -0.479f, -0.123f)
                curveToRelative(-0.485f, -0.265f, -0.663f, -0.873f, -0.398f, -1.357f)
                lineTo(17.962f, 2.691f)
                curveToRelative(0.096f, -0.193f, 0.005f, -0.383f, -0.039f, -0.455f)
                curveToRelative(-0.044f, -0.071f, -0.174f, -0.237f, -0.425f, -0.237f)
                horizontalLineTo(5.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(12.498f)
                curveToRelative(0.873f, 0.0f, 1.668f, 0.443f, 2.126f, 1.186f)
                curveToRelative(0.459f, 0.742f, 0.5f, 1.651f, 0.11f, 2.433f)
                lineTo(8.877f, 23.479f)
                curveToRelative(-0.182f, 0.333f, -0.524f, 0.521f, -0.878f, 0.521f)
                close()
            }
        }
        .build()
        return __7!!
    }

private var __7: ImageVector? = null
