package me.localx.icons.straight.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

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
                moveTo(15.758f, 10.291f)
                curveToRelative(-0.489f, 0.441f, -0.758f, 1.048f, -0.758f, 1.709f)
                curveToRelative(0.0f, 0.647f, 0.277f, 1.268f, 0.753f, 1.693f)
                lineToRelative(8.247f, 7.547f)
                lineTo(24.0f, 2.75f)
                lineToRelative(-8.242f, 7.541f)
                close()
                moveTo(22.0f, 16.699f)
                lineToRelative(-4.904f, -4.488f)
                curveToRelative(-0.061f, -0.054f, -0.096f, -0.131f, -0.096f, -0.211f)
                curveToRelative(0.0f, -0.092f, 0.032f, -0.165f, 0.103f, -0.229f)
                lineToRelative(4.897f, -4.48f)
                verticalLineToRelative(9.408f)
                close()
                moveTo(0.0f, 2.75f)
                lineTo(0.0f, 21.24f)
                lineToRelative(8.239f, -7.539f)
                curveToRelative(0.483f, -0.434f, 0.761f, -1.054f, 0.761f, -1.701f)
                curveToRelative(0.0f, -0.661f, -0.269f, -1.268f, -0.753f, -1.705f)
                lineTo(0.0f, 2.75f)
                close()
                moveTo(6.896f, 12.219f)
                lineToRelative(-4.896f, 4.48f)
                lineTo(2.0f, 7.291f)
                lineToRelative(4.902f, 4.484f)
                curveToRelative(0.066f, 0.06f, 0.098f, 0.133f, 0.098f, 0.225f)
                curveToRelative(0.0f, 0.08f, -0.035f, 0.157f, -0.104f, 0.219f)
                close()
                moveTo(11.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                lineTo(13.0f, 24.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(11.0f, 0.0f)
                close()
            }
        }
        .build()
        return _reflectHorizontalAlt!!
    }

private var _reflectHorizontalAlt: ImageVector? = null
