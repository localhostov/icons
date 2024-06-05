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

public val Icons.Outline.WifiAlt: ImageVector
    get() {
        if (_wifiAlt != null) {
            return _wifiAlt!!
        }
        _wifiAlt = Builder(name = "WifiAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.0f, 23.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                close()
                moveTo(15.535f, 20.878f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.414f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -7.07f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.414f, 1.414f)
                arcToRelative(3.074f, 3.074f, 0.0f, false, true, 4.242f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.414f, 0.0f)
                close()
                moveTo(18.364f, 18.05f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.414f)
                arcToRelative(9.01f, 9.01f, 0.0f, false, false, -12.728f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.414f, 1.414f)
                arcToRelative(7.011f, 7.011f, 0.0f, false, true, 9.9f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.414f, 0.0f)
                close()
                moveTo(5.987f, 22.161f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.826f, -1.148f)
                arcToRelative(3.809f, 3.809f, 0.0f, false, true, -3.124f, -2.939f)
                arcToRelative(3.473f, 3.473f, 0.0f, false, true, 1.823f, -3.594f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.805f, -2.69f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 11.059f, -4.514f)
                arcToRelative(3.1f, 3.1f, 0.0f, false, false, 2.045f, 2.052f)
                arcToRelative(5.972f, 5.972f, 0.0f, false, true, 4.212f, 6.211f)
                arcToRelative(5.687f, 5.687f, 0.0f, false, true, -3.41f, 4.725f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.858f, 1.806f)
                arcToRelative(7.638f, 7.638f, 0.0f, false, false, 4.547f, -6.376f)
                arcToRelative(7.96f, 7.96f, 0.0f, false, false, -5.62f, -8.277f)
                arcToRelative(1.089f, 1.089f, 0.0f, false, true, -0.722f, -0.734f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -15.489f, 0.841f)
                arcToRelative(7.78f, 7.78f, 0.0f, false, false, 0.778f, 5.19f)
                arcToRelative(5.453f, 5.453f, 0.0f, false, false, -2.866f, 5.641f)
                arcToRelative(5.826f, 5.826f, 0.0f, false, false, 4.782f, 4.632f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.148f, -0.826f)
                close()
            }
        }
        .build()
        return _wifiAlt!!
    }

private var _wifiAlt: ImageVector? = null
