package me.localx.icons.rounded.bold

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

public val Icons.Bold.Cloud: ImageVector
    get() {
        if (_cloud != null) {
            return _cloud!!
        }
        _cloud = Builder(name = "Cloud", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.419f, 10.0f)
                arcToRelative(8.269f, 8.269f, 0.0f, false, false, -4.442f, -3.063f)
                arcToRelative(8.252f, 8.252f, 0.0f, false, false, -2.962f, -4.377f)
                arcTo(8.177f, 8.177f, 0.0f, false, false, 2.6f, 12.375f)
                arcTo(5.78f, 5.78f, 0.0f, false, false, 0.188f, 18.694f)
                arcTo(5.85f, 5.85f, 0.0f, false, false, 5.944f, 23.0f)
                lineTo(15.58f, 23.0f)
                arcToRelative(8.29f, 8.29f, 0.0f, false, false, 8.3f, -6.759f)
                arcTo(8.127f, 8.127f, 0.0f, false, false, 22.419f, 10.0f)
                close()
                moveTo(20.919f, 15.733f)
                arcTo(5.365f, 5.365f, 0.0f, false, true, 15.58f, 20.0f)
                lineTo(5.944f, 20.0f)
                arcTo(2.891f, 2.891f, 0.0f, false, true, 3.1f, 17.958f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, true, 2.0f, -3.446f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.83f, -2.345f)
                arcToRelative(5.171f, 5.171f, 0.0f, false, true, 3.381f, -8.2f)
                arcToRelative(5.506f, 5.506f, 0.0f, false, true, 0.776f, -0.056f)
                arcToRelative(5.14f, 5.14f, 0.0f, false, true, 3.118f, 1.042f)
                arcTo(5.212f, 5.212f, 0.0f, false, true, 15.22f, 8.4f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.287f, 1.288f)
                arcTo(5.232f, 5.232f, 0.0f, false, true, 20.0f, 11.774f)
                arcTo(5.155f, 5.155f, 0.0f, false, true, 20.921f, 15.732f)
                close()
            }
        }
        .build()
        return _cloud!!
    }

private var _cloud: ImageVector? = null
