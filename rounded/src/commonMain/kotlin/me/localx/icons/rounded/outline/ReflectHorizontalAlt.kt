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

public val Icons.Outline.ReflectHorizontalAlt: ImageVector
    get() {
        if (_reflectHorizontalAlt != null) {
            return _reflectHorizontalAlt!!
        }
        _reflectHorizontalAlt = Builder(name = "ReflectHorizontalAlt", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.165f, 5.177f)
                curveToRelative(-0.531f, -0.533f, -1.324f, -0.693f, -2.019f, -0.406f)
                curveToRelative(-0.696f, 0.286f, -1.146f, 0.958f, -1.146f, 1.711f)
                verticalLineToRelative(11.035f)
                curveToRelative(0.0f, 0.753f, 0.45f, 1.425f, 1.146f, 1.712f)
                curveToRelative(0.229f, 0.094f, 0.469f, 0.14f, 0.707f, 0.14f)
                curveToRelative(0.483f, 0.0f, 0.957f, -0.19f, 1.312f, -0.549f)
                lineToRelative(5.074f, -5.119f)
                curveToRelative(0.483f, -0.434f, 0.761f, -1.054f, 0.761f, -1.701f)
                curveToRelative(0.0f, -0.661f, -0.269f, -1.268f, -0.719f, -1.672f)
                lineTo(3.165f, 5.177f)
                close()
                moveTo(6.862f, 12.251f)
                lineToRelative(-4.862f, 4.903f)
                lineTo(2.0f, 6.843f)
                lineToRelative(4.902f, 4.932f)
                curveToRelative(0.066f, 0.06f, 0.098f, 0.133f, 0.098f, 0.225f)
                curveToRelative(0.0f, 0.08f, -0.035f, 0.157f, -0.138f, 0.252f)
                close()
                moveTo(22.855f, 4.771f)
                curveToRelative(-0.696f, -0.287f, -1.488f, -0.127f, -2.019f, 0.406f)
                lineToRelative(-5.077f, 5.113f)
                curveToRelative(-0.489f, 0.441f, -0.758f, 1.048f, -0.758f, 1.709f)
                curveToRelative(0.0f, 0.647f, 0.277f, 1.268f, 0.718f, 1.66f)
                lineToRelative(5.116f, 5.16f)
                curveToRelative(0.356f, 0.358f, 0.83f, 0.549f, 1.313f, 0.549f)
                curveToRelative(0.237f, 0.0f, 0.477f, -0.046f, 0.707f, -0.14f)
                curveToRelative(0.696f, -0.287f, 1.146f, -0.959f, 1.146f, -1.712f)
                lineTo(24.001f, 6.481f)
                curveToRelative(0.0f, -0.753f, -0.45f, -1.425f, -1.146f, -1.711f)
                close()
                moveTo(22.001f, 17.155f)
                lineToRelative(-4.904f, -4.944f)
                curveToRelative(-0.061f, -0.054f, -0.096f, -0.131f, -0.096f, -0.211f)
                curveToRelative(0.0f, -0.092f, 0.032f, -0.165f, 0.138f, -0.262f)
                lineToRelative(4.862f, -4.895f)
                verticalLineToRelative(10.312f)
                close()
                moveTo(13.0f, 1.0f)
                lineTo(13.0f, 23.0f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                lineTo(11.0f, 1.0f)
                curveToRelative(0.0f, -0.553f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _reflectHorizontalAlt!!
    }

private var _reflectHorizontalAlt: ImageVector? = null
