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

public val Icons.Filled.ReflectHorizontalAlt: ImageVector
    get() {
        if (_reflectHorizontalAlt != null) {
            return _reflectHorizontalAlt!!
        }
        _reflectHorizontalAlt = Builder(name = "ReflectHorizontalAlt", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.853f, 19.368f)
                curveToRelative(-0.237f, 0.0f, -0.477f, -0.046f, -0.707f, -0.14f)
                curveToRelative(-0.696f, -0.287f, -1.146f, -0.959f, -1.146f, -1.712f)
                lineTo(0.0f, 6.481f)
                curveToRelative(0.0f, -0.753f, 0.45f, -1.425f, 1.146f, -1.711f)
                curveToRelative(0.695f, -0.287f, 1.488f, -0.127f, 2.019f, 0.406f)
                lineToRelative(5.117f, 5.15f)
                curveToRelative(0.45f, 0.404f, 0.719f, 1.011f, 0.719f, 1.672f)
                curveToRelative(0.0f, 0.647f, -0.277f, 1.268f, -0.761f, 1.701f)
                lineToRelative(-5.074f, 5.119f)
                curveToRelative(-0.355f, 0.358f, -0.829f, 0.549f, -1.312f, 0.549f)
                close()
                moveTo(22.147f, 19.368f)
                curveToRelative(-0.483f, 0.0f, -0.957f, -0.19f, -1.313f, -0.549f)
                lineToRelative(-5.116f, -5.16f)
                curveToRelative(-0.441f, -0.393f, -0.718f, -1.013f, -0.718f, -1.66f)
                curveToRelative(0.0f, -0.661f, 0.269f, -1.268f, 0.758f, -1.709f)
                lineToRelative(5.077f, -5.113f)
                curveToRelative(0.531f, -0.533f, 1.323f, -0.693f, 2.019f, -0.406f)
                curveToRelative(0.696f, 0.286f, 1.146f, 0.958f, 1.146f, 1.711f)
                verticalLineToRelative(11.035f)
                curveToRelative(0.0f, 0.753f, -0.45f, 1.425f, -1.146f, 1.712f)
                curveToRelative(-0.229f, 0.094f, -0.469f, 0.14f, -0.707f, 0.14f)
                close()
                moveTo(13.0f, 23.0f)
                lineTo(13.0f, 1.0f)
                curveToRelative(0.0f, -0.553f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.447f, -1.0f, 1.0f)
                lineTo(11.0f, 23.0f)
                curveToRelative(0.0f, 0.553f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _reflectHorizontalAlt!!
    }

private var _reflectHorizontalAlt: ImageVector? = null
