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

public val Icons.Bold.BreadSlice: ImageVector
    get() {
        if (_breadSlice != null) {
            return _breadSlice!!
        }
        _breadSlice = Builder(name = "BreadSlice", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 23.0f)
                lineTo(2.0f, 23.0f)
                lineTo(2.0f, 10.347f)
                curveTo(-1.954f, 7.352f, 0.466f, 0.912f, 5.318f, 1.0f)
                lineTo(18.682f, 1.0f)
                curveTo(23.536f, 0.912f, 25.953f, 7.353f, 22.0f, 10.347f)
                close()
                moveTo(5.0f, 20.0f)
                lineTo(19.0f, 20.0f)
                lineTo(19.0f, 8.7f)
                lineToRelative(0.745f, -0.434f)
                arcTo(2.258f, 2.258f, 0.0f, false, false, 18.682f, 4.0f)
                lineTo(5.318f, 4.0f)
                arcTo(2.258f, 2.258f, 0.0f, false, false, 4.255f, 8.265f)
                lineTo(5.0f, 8.7f)
                close()
                moveTo(8.5f, 10.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 8.5f, 10.0f)
                close()
                moveTo(13.5f, 15.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 13.5f, 15.0f)
                close()
                moveTo(8.5f, 15.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 8.5f, 15.0f)
                close()
            }
        }
        .build()
        return _breadSlice!!
    }

private var _breadSlice: ImageVector? = null
