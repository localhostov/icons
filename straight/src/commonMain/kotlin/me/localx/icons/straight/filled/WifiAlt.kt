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
                moveToRelative(16.636f, 23.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                close()
                moveTo(21.171f, 19.464f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -7.07f, 0.0f)
                lineToRelative(1.414f, 1.414f)
                arcToRelative(3.074f, 3.074f, 0.0f, false, true, 4.242f, 0.0f)
                close()
                moveTo(24.0f, 16.636f)
                arcToRelative(9.012f, 9.012f, 0.0f, false, false, -12.729f, 0.0f)
                lineToRelative(1.415f, 1.414f)
                arcToRelative(7.011f, 7.011f, 0.0f, false, true, 9.9f, 0.0f)
                close()
                moveTo(8.442f, 16.636f)
                lineTo(9.857f, 15.222f)
                arcToRelative(11.014f, 11.014f, 0.0f, false, true, 14.143f, -1.18f)
                verticalLineToRelative(-0.042f)
                curveToRelative(0.0f, -3.741f, -2.622f, -5.968f, -6.21f, -6.791f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -15.79f, 1.791f)
                arcToRelative(7.912f, 7.912f, 0.0f, false, false, 0.9f, 3.671f)
                arcToRelative(5.49f, 5.49f, 0.0f, false, false, 2.6f, 10.329f)
                horizontalLineToRelative(9.177f)
                close()
            }
        }
        .build()
        return _wifiAlt!!
    }

private var _wifiAlt: ImageVector? = null
