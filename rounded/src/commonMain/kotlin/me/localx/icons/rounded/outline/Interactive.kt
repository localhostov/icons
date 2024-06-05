package me.localx.icons.rounded.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Outline.Interactive: ImageVector
    get() {
        if (_interactive != null) {
            return _interactive!!
        }
        _interactive = Builder(name = "Interactive", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.707f, 22.293f)
                lineTo(22.63f, 21.216f)
                lineTo(20.9f, 19.489f)
                lineTo(23.689f, 16.7f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.365f, -1.646f)
                lineTo(14.355f, 11.8f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.561f, 2.56f)
                lineToRelative(3.263f, 8.969f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.722f, 0.635f)
                arcToRelative(1.007f, 1.007f, 0.0f, false, false, 0.217f, 0.023f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.707f, -0.293f)
                lineTo(19.489f, 20.9f)
                lineToRelative(1.727f, 1.727f)
                lineToRelative(1.077f, 1.077f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.414f, -1.414f)
                close()
                moveTo(16.4f, 21.165f)
                lineToRelative(-2.724f, -7.49f)
                lineToRelative(7.49f, 2.724f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 20.0f)
                arcTo(10.0f, 10.0f, 0.0f, true, true, 20.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -8.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.084f, 15.62f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.383f, -0.076f)
                arcTo(6.0f, 6.0f, 0.0f, true, true, 15.547f, 7.71f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.848f, 0.764f)
                arcTo(4.0f, 4.0f, 0.0f, true, false, 8.468f, 13.7f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.384f, 1.924f)
                close()
            }
        }
        .build()
        return _interactive!!
    }

private var _interactive: ImageVector? = null
