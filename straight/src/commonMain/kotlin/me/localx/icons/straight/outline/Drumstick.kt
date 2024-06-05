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

public val Icons.Outline.Drumstick: ImageVector
    get() {
        if (_drumstick != null) {
            return _drumstick!!
        }
        _drumstick = Builder(name = "Drumstick", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.511f, 2.49f)
                arcToRelative(8.508f, 8.508f, 0.0f, false, false, -12.021f, 0.0f)
                curveTo(6.318f, 5.661f, 6.012f, 13.628f, 6.0f, 13.966f)
                lineToRelative(-0.014f, 0.434f)
                lineToRelative(1.1f, 1.1f)
                lineTo(2.807f, 19.779f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -0.649f, 2.063f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 2.063f, -0.649f)
                lineTo(8.5f, 16.914f)
                lineToRelative(1.1f, 1.1f)
                lineTo(10.034f, 18.0f)
                curveToRelative(0.338f, -0.012f, 8.3f, -0.318f, 11.477f, -3.49f)
                arcTo(8.509f, 8.509f, 0.0f, false, false, 21.511f, 2.49f)
                close()
                moveTo(20.1f, 13.1f)
                curveToRelative(-2.036f, 2.035f, -7.335f, 2.744f, -9.7f, 2.884f)
                lineTo(8.02f, 13.605f)
                curveToRelative(0.14f, -2.367f, 0.849f, -7.666f, 2.884f, -9.7f)
                arcTo(6.5f, 6.5f, 0.0f, false, true, 20.1f, 13.1f)
                close()
            }
        }
        .build()
        return _drumstick!!
    }

private var _drumstick: ImageVector? = null
