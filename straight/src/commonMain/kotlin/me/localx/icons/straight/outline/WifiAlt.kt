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
                moveTo(15.535f, 19.464f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -7.07f, 0.0f)
                lineToRelative(1.414f, 1.414f)
                arcToRelative(3.074f, 3.074f, 0.0f, false, true, 4.242f, 0.0f)
                close()
                moveTo(18.364f, 16.636f)
                arcToRelative(9.01f, 9.01f, 0.0f, false, false, -12.728f, 0.0f)
                lineToRelative(1.414f, 1.414f)
                arcToRelative(7.011f, 7.011f, 0.0f, false, true, 9.9f, 0.0f)
                close()
                moveTo(17.79f, 7.209f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -15.79f, 1.791f)
                arcToRelative(7.912f, 7.912f, 0.0f, false, false, 0.9f, 3.671f)
                arcToRelative(5.49f, 5.49f, 0.0f, false, false, 2.6f, 10.329f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.0f, -0.053f, 0.013f, -0.1f, 0.016f, -0.156f)
                lineToRelative(-1.844f, -1.844f)
                horizontalLineToRelative(-1.672f)
                arcToRelative(3.491f, 3.491f, 0.0f, false, true, -0.872f, -6.874f)
                lineToRelative(1.4f, -0.362f)
                lineToRelative(0.028f, -0.016f)
                lineToRelative(-0.878f, -1.185f)
                arcToRelative(5.939f, 5.939f, 0.0f, false, true, -1.178f, -3.563f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 11.939f, -0.8f)
                lineToRelative(0.1f, 0.758f)
                lineToRelative(0.759f, 0.1f)
                arcToRelative(5.992f, 5.992f, 0.0f, false, true, 0.1f, 11.864f)
                lineToRelative(-1.919f, 1.92f)
                curveToRelative(0.0f, 0.053f, 0.016f, 0.1f, 0.016f, 0.156f)
                horizontalLineToRelative(1.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 1.795f, -15.789f)
                close()
            }
        }
        .build()
        return _wifiAlt!!
    }

private var _wifiAlt: ImageVector? = null
