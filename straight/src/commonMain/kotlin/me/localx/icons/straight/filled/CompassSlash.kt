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

public val Icons.Filled.CompassSlash: ImageVector
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
                moveTo(18.235f, 5.668f)
                lineToRelative(-3.252f, 7.901f)
                lineToRelative(-1.532f, -1.532f)
                lineToRelative(0.974f, -2.365f)
                lineToRelative(-2.271f, 1.068f)
                lineToRelative(-1.503f, -1.503f)
                lineToRelative(7.584f, -3.569f)
                close()
                moveTo(11.565f, 15.808f)
                lineToRelative(6.527f, 6.527f)
                curveToRelative(-1.823f, 1.08f, -3.904f, 1.665f, -6.092f, 1.665f)
                curveTo(5.383f, 24.0f, 0.0f, 18.617f, 0.0f, 12.0f)
                curveToRelative(0.0f, -2.188f, 0.585f, -4.269f, 1.666f, -6.092f)
                lineToRelative(6.589f, 6.589f)
                lineToRelative(-2.493f, 5.7f)
                lineToRelative(5.804f, -2.389f)
                close()
            }
        }
        .build()
        return _compassSlash!!
    }

private var _compassSlash: ImageVector? = null
