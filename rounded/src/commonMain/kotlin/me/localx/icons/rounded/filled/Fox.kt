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

public val Icons.Filled.Fox: ImageVector
    get() {
        if (_fox != null) {
            return _fox!!
        }
        _fox = Builder(name = "Fox", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 8.008f)
                verticalLineToRelative(-6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 0.759f, 0.435f)
                arcToRelative(1.982f, 1.982f, 0.0f, false, true, 1.7f, -0.383f)
                arcTo(6.133f, 6.133f, 0.0f, false, true, 6.6f, 3.782f)
                arcTo(21.876f, 21.876f, 0.0f, false, true, 12.0f, 3.0f)
                arcToRelative(21.876f, 21.876f, 0.0f, false, true, 5.4f, 0.782f)
                arcTo(6.132f, 6.132f, 0.0f, false, true, 21.544f, 0.052f)
                arcTo(2.005f, 2.005f, 0.0f, false, true, 24.0f, 2.006f)
                verticalLineToRelative(6.0f)
                arcToRelative(12.216f, 12.216f, 0.0f, false, false, -4.774f, 1.1f)
                arcTo(10.256f, 10.256f, 0.0f, false, false, 13.0f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                arcTo(10.259f, 10.259f, 0.0f, false, false, 4.774f, 9.1f)
                arcTo(12.233f, 12.233f, 0.0f, false, false, 0.0f, 8.008f)
                close()
                moveTo(20.0f, 11.0f)
                arcToRelative(3.778f, 3.778f, 0.0f, false, true, -3.642f, 2.989f)
                arcTo(8.938f, 8.938f, 0.0f, false, false, 15.0f, 19.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -6.0f, 0.0f)
                arcToRelative(8.938f, 8.938f, 0.0f, false, false, -1.358f, -5.011f)
                arcTo(3.778f, 3.778f, 0.0f, false, true, 4.0f, 11.0f)
                arcToRelative(10.155f, 10.155f, 0.0f, false, false, -4.0f, -0.99f)
                arcToRelative(10.925f, 10.925f, 0.0f, false, false, 3.22f, 7.626f)
                lineToRelative(4.657f, 4.657f)
                arcToRelative(5.862f, 5.862f, 0.0f, false, false, 8.242f, 0.0f)
                lineToRelative(4.657f, -4.657f)
                arcTo(10.925f, 10.925f, 0.0f, false, false, 24.0f, 10.01f)
                arcTo(10.155f, 10.155f, 0.0f, false, false, 20.0f, 11.0f)
                close()
            }
        }
        .build()
        return _fox!!
    }

private var _fox: ImageVector? = null
