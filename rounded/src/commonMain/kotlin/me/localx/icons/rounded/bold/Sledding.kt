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

public val Icons.Bold.Sledding: ImageVector
    get() {
        if (_sledding != null) {
            return _sledding!!
        }
        _sledding = Builder(name = "Sledding", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.853f, 21.446f)
                arcToRelative(4.388f, 4.388f, 0.0f, false, true, -5.908f, 2.111f)
                lineTo(0.884f, 15.868f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.232f, -2.736f)
                lineToRelative(17.094f, 7.7f)
                arcToRelative(1.4f, 1.4f, 0.0f, false, false, 1.937f, -0.688f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 2.706f, 1.3f)
                close()
                moveTo(18.5f, 5.0f)
                arcTo(2.5f, 2.5f, 0.0f, true, false, 16.0f, 2.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 18.5f, 5.0f)
                close()
                moveTo(5.5f, 7.0f)
                horizontalLineToRelative(5.312f)
                lineTo(8.833f, 9.238f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 11.5f, 15.0f)
                horizontalLineToRelative(3.878f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.489f, 0.395f)
                lineToRelative(0.3f, 1.418f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 17.639f, 18.0f)
                arcToRelative(1.54f, 1.54f, 0.0f, false, false, 0.315f, -0.033f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.153f, -1.78f)
                lineToRelative(-0.3f, -1.418f)
                arcTo(3.519f, 3.519f, 0.0f, false, false, 15.382f, 12.0f)
                horizontalLineTo(14.3f)
                lineToRelative(1.833f, -2.063f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, false, -0.173f, -4.885f)
                arcToRelative(1.623f, 1.623f, 0.0f, false, false, -0.216f, -0.171f)
                arcTo(5.428f, 5.428f, 0.0f, false, false, 12.779f, 4.0f)
                horizontalLineTo(5.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                close()
            }
        }
        .build()
        return _sledding!!
    }

private var _sledding: ImageVector? = null
