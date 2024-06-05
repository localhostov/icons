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

public val Icons.Filled.WifiAlt: ImageVector
    get() {
        if (_wifiAlt != null) {
            return _wifiAlt!!
        }
        _wifiAlt = Builder(name = "WifiAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.0f, 23.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                close()
                moveTo(20.535f, 20.878f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.414f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -7.07f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.414f, 1.414f)
                arcToRelative(3.074f, 3.074f, 0.0f, false, true, 4.242f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.414f, 0.0f)
                close()
                moveTo(23.364f, 18.05f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.414f)
                arcToRelative(9.01f, 9.01f, 0.0f, false, false, -12.728f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.414f, 1.414f)
                arcToRelative(7.011f, 7.011f, 0.0f, false, true, 9.9f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.414f, 0.0f)
                close()
                moveTo(9.222f, 19.464f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, -4.243f)
                arcToRelative(11.014f, 11.014f, 0.0f, false, true, 14.757f, -0.721f)
                arcToRelative(7.945f, 7.945f, 0.0f, false, false, -5.622f, -7.14f)
                arcToRelative(1.087f, 1.087f, 0.0f, false, true, -0.722f, -0.733f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -15.49f, 0.842f)
                arcToRelative(7.648f, 7.648f, 0.0f, false, false, 0.8f, 5.179f)
                arcToRelative(5.448f, 5.448f, 0.0f, false, false, -2.888f, 5.652f)
                arcToRelative(5.844f, 5.844f, 0.0f, false, false, 5.626f, 4.7f)
                horizontalLineToRelative(7.1f)
                curveToRelative(-1.667f, -1.653f, -3.296f, -3.271f, -3.561f, -3.536f)
                close()
            }
        }
        .build()
        return _wifiAlt!!
    }

private var _wifiAlt: ImageVector? = null
