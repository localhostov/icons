package me.localx.icons.straight.bold

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

public val Icons.Bold.WifiAlt: ImageVector
    get() {
        if (_wifiAlt != null) {
            return _wifiAlt!!
        }
        _wifiAlt = Builder(name = "WifiAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.521f, 17.111f)
                lineToRelative(-1.061f, -1.061f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, -9.9f, 0.0f)
                lineToRelative(-1.06f, 1.061f)
                lineToRelative(-2.121f, -2.121f)
                lineToRelative(1.06f, -1.061f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 14.142f, 0.0f)
                lineToRelative(1.061f, 1.061f)
                close()
                moveTo(20.106f, 18.524f)
                lineTo(19.046f, 17.464f)
                arcToRelative(5.008f, 5.008f, 0.0f, false, false, -7.071f, 0.0f)
                lineToRelative(-1.061f, 1.06f)
                lineToRelative(2.121f, 2.122f)
                lineToRelative(1.061f, -1.06f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.829f, 0.0f)
                lineToRelative(1.06f, 1.06f)
                close()
                moveTo(14.01f, 22.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 1.5f, -1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, 1.5f)
                close()
                moveTo(9.5f, 21.328f)
                lineTo(7.172f, 19.0f)
                horizontalLineToRelative(-1.372f)
                arcToRelative(2.789f, 2.789f, 0.0f, false, true, -2.8f, -2.775f)
                arcToRelative(3.025f, 3.025f, 0.0f, false, true, 2.218f, -2.792f)
                lineToRelative(2.163f, -0.556f)
                lineToRelative(-1.333f, -1.792f)
                arcToRelative(5.093f, 5.093f, 0.0f, false, true, -1.019f, -3.055f)
                arcToRelative(4.935f, 4.935f, 0.0f, false, true, 5.062f, -5.03f)
                arcToRelative(5.18f, 5.18f, 0.0f, false, true, 5.13f, 4.465f)
                lineToRelative(0.07f, 0.529f)
                curveToRelative(0.074f, 0.0f, 0.145f, -0.015f, 0.219f, -0.015f)
                arcToRelative(12.892f, 12.892f, 0.0f, false, true, 7.8f, 2.614f)
                arcToRelative(8.207f, 8.207f, 0.0f, false, false, -5.334f, -4.593f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, -7.885f, -6.0f)
                arcToRelative(7.96f, 7.96f, 0.0f, false, false, -8.062f, 8.03f)
                arcToRelative(8.036f, 8.036f, 0.0f, false, false, 0.691f, 3.27f)
                arcToRelative(5.953f, 5.953f, 0.0f, false, false, -2.72f, 4.925f)
                arcToRelative(5.792f, 5.792f, 0.0f, false, false, 5.8f, 5.775f)
                horizontalLineToRelative(4.376f)
                close()
            }
        }
        .build()
        return _wifiAlt!!
    }

private var _wifiAlt: ImageVector? = null
