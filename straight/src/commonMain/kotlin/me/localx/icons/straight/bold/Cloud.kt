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
                moveTo(15.58f, 23.0f)
                horizontalLineTo(5.944f)
                arcTo(5.85f, 5.85f, 0.0f, false, true, 0.188f, 18.694f)
                arcTo(5.78f, 5.78f, 0.0f, false, true, 2.6f, 12.375f)
                arcTo(8.178f, 8.178f, 0.0f, false, true, 15.015f, 2.559f)
                arcToRelative(8.252f, 8.252f, 0.0f, false, true, 2.962f, 4.377f)
                arcTo(8.269f, 8.269f, 0.0f, false, true, 22.419f, 10.0f)
                arcToRelative(8.127f, 8.127f, 0.0f, false, true, 1.459f, 6.242f)
                arcTo(8.29f, 8.29f, 0.0f, false, true, 15.58f, 23.0f)
                close()
                moveTo(10.087f, 3.91f)
                arcToRelative(5.506f, 5.506f, 0.0f, false, false, -0.776f, 0.056f)
                arcToRelative(5.171f, 5.171f, 0.0f, false, false, -3.381f, 8.2f)
                lineToRelative(1.325f, 1.788f)
                lineTo(5.1f, 14.512f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, false, -2.0f, 3.446f)
                arcTo(2.891f, 2.891f, 0.0f, false, false, 5.944f, 20.0f)
                horizontalLineTo(15.58f)
                arcToRelative(5.365f, 5.365f, 0.0f, false, false, 5.341f, -4.268f)
                arcTo(5.155f, 5.155f, 0.0f, false, false, 20.0f, 11.774f)
                arcToRelative(5.232f, 5.232f, 0.0f, false, false, -3.494f, -2.085f)
                lineToRelative(-1.136f, -0.152f)
                lineTo(15.22f, 8.4f)
                arcToRelative(5.212f, 5.212f, 0.0f, false, false, -2.015f, -3.449f)
                arcTo(5.14f, 5.14f, 0.0f, false, false, 10.087f, 3.91f)
                close()
            }
        }
        .build()
        return _cloud!!
    }

private var _cloud: ImageVector? = null
