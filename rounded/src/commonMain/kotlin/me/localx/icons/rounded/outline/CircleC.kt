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

public val Icons.Outline.CircleC: ImageVector
    get() {
        if (_circleC != null) {
            return _circleC!!
        }
        _circleC = Builder(name = "CircleC", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.038f, 0.019f)
                curveTo(5.421f, 0.019f, 0.038f, 5.402f, 0.038f, 12.019f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.655f, 0.019f, 12.038f, 0.019f)
                close()
                moveTo(12.038f, 22.019f)
                curveToRelative(-5.514f, 0.0f, -10.0f, -4.486f, -10.0f, -10.0f)
                reflectiveCurveTo(6.524f, 2.019f, 12.038f, 2.019f)
                reflectiveCurveToRelative(10.0f, 4.486f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.486f, 10.0f, -10.0f, 10.0f)
                close()
                moveTo(8.788f, 10.86f)
                verticalLineToRelative(2.318f)
                curveToRelative(0.0f, 1.733f, 1.339f, 3.091f, 3.049f, 3.091f)
                horizontalLineToRelative(0.454f)
                curveToRelative(0.862f, 0.0f, 1.782f, -0.371f, 2.238f, -0.901f)
                curveToRelative(0.362f, -0.419f, 0.992f, -0.466f, 1.41f, -0.107f)
                curveToRelative(0.419f, 0.36f, 0.467f, 0.992f, 0.107f, 1.41f)
                curveToRelative(-0.834f, 0.971f, -2.309f, 1.599f, -3.756f, 1.599f)
                horizontalLineToRelative(-0.454f)
                curveToRelative(-2.784f, 0.0f, -5.049f, -2.284f, -5.049f, -5.091f)
                verticalLineToRelative(-2.318f)
                curveToRelative(0.0f, -2.807f, 2.265f, -5.091f, 5.049f, -5.091f)
                horizontalLineToRelative(0.454f)
                curveToRelative(1.485f, 0.0f, 2.904f, 0.71f, 3.797f, 1.9f)
                curveToRelative(0.332f, 0.442f, 0.242f, 1.069f, -0.2f, 1.4f)
                curveToRelative(-0.442f, 0.332f, -1.069f, 0.241f, -1.399f, -0.2f)
                curveToRelative(-0.517f, -0.689f, -1.338f, -1.1f, -2.197f, -1.1f)
                horizontalLineToRelative(-0.454f)
                curveToRelative(-1.71f, 0.0f, -3.049f, 1.358f, -3.049f, 3.091f)
                close()
            }
        }
        .build()
        return _circleC!!
    }

private var _circleC: ImageVector? = null
