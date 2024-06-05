package me.localx.icons.straight.filled

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
                moveTo(15.758f, 10.291f)
                curveToRelative(-0.489f, 0.441f, -0.758f, 1.048f, -0.758f, 1.709f)
                curveToRelative(0.0f, 0.647f, 0.277f, 1.268f, 0.753f, 1.693f)
                lineToRelative(8.247f, 7.547f)
                verticalLineTo(2.75f)
                lineToRelative(-8.242f, 7.541f)
                close()
                moveTo(0.0f, 2.75f)
                verticalLineTo(21.24f)
                lineToRelative(8.239f, -7.539f)
                curveToRelative(0.483f, -0.434f, 0.761f, -1.054f, 0.761f, -1.701f)
                curveToRelative(0.0f, -0.661f, -0.269f, -1.268f, -0.753f, -1.705f)
                lineTo(0.0f, 2.75f)
                close()
                moveTo(11.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(24.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(0.0f)
                close()
            }
        }
        .build()
        return _reflectHorizontalAlt!!
    }

private var _reflectHorizontalAlt: ImageVector? = null
