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

public val Icons.Outline.CompassSlash: ImageVector
    get() {
        if (_compassSlash != null) {
            return _compassSlash!!
        }
        _compassSlash = Builder(name = "CompassSlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 12.0f)
                curveTo(24.0f, 5.383f, 18.617f, 0.0f, 12.0f, 0.0f)
                curveToRelative(-2.857f, 0.0f, -5.584f, 1.003f, -7.749f, 2.837f)
                lineTo(1.457f, 0.043f)
                lineTo(0.043f, 1.457f)
                lineToRelative(22.5f, 22.5f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-2.794f, -2.794f)
                curveToRelative(1.834f, -2.165f, 2.837f, -4.891f, 2.837f, -7.749f)
                close()
                moveTo(13.451f, 12.037f)
                lineToRelative(-1.297f, -1.297f)
                lineToRelative(2.271f, -1.068f)
                lineToRelative(-0.974f, 2.365f)
                close()
                moveTo(14.983f, 13.569f)
                lineToRelative(3.252f, -7.901f)
                lineToRelative(-7.584f, 3.569f)
                lineToRelative(-4.98f, -4.98f)
                curveToRelative(1.783f, -1.46f, 4.004f, -2.257f, 6.329f, -2.257f)
                curveToRelative(5.514f, 0.0f, 10.0f, 4.486f, 10.0f, 10.0f)
                curveToRelative(0.0f, 2.325f, -0.797f, 4.546f, -2.257f, 6.329f)
                lineToRelative(-4.76f, -4.76f)
                close()
                moveTo(16.622f, 20.865f)
                lineToRelative(1.47f, 1.47f)
                curveToRelative(-1.823f, 1.08f, -3.904f, 1.665f, -6.092f, 1.665f)
                curveTo(5.383f, 24.0f, 0.0f, 18.617f, 0.0f, 12.0f)
                curveToRelative(0.0f, -2.188f, 0.585f, -4.269f, 1.666f, -6.092f)
                lineToRelative(1.47f, 1.47f)
                curveToRelative(-0.737f, 1.408f, -1.135f, 2.978f, -1.135f, 4.622f)
                curveToRelative(0.0f, 5.514f, 4.486f, 10.0f, 10.0f, 10.0f)
                curveToRelative(1.644f, 0.0f, 3.215f, -0.399f, 4.622f, -1.135f)
                close()
                moveTo(8.255f, 12.498f)
                lineToRelative(3.31f, 3.31f)
                lineToRelative(-5.804f, 2.389f)
                lineToRelative(2.493f, -5.7f)
                close()
            }
        }
        .build()
        return _compassSlash!!
    }

private var _compassSlash: ImageVector? = null
