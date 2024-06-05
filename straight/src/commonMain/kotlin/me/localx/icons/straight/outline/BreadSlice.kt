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

public val Icons.Outline.BreadSlice: ImageVector
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
                lineTo(2.0f, 9.979f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 5.0f, 1.0f)
                lineTo(19.0f, 1.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 3.0f, 8.979f)
                close()
                moveTo(4.0f, 21.0f)
                lineTo(20.0f, 21.0f)
                lineTo(20.0f, 8.87f)
                lineToRelative(0.5f, -0.289f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 19.0f, 3.0f)
                lineTo(5.0f, 3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 3.5f, 8.581f)
                lineTo(4.0f, 8.87f)
                close()
                moveTo(8.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 8.0f, 12.0f)
                close()
                moveTo(12.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 16.0f)
                close()
                moveTo(8.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 8.0f, 16.0f)
                close()
            }
        }
        .build()
        return _breadSlice!!
    }

private var _breadSlice: ImageVector? = null
