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

public val Icons.Outline.Pencil: ImageVector
    get() {
        if (_pencil != null) {
            return _pencil!!
        }
        _pencil = Builder(name = "Pencil", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.94f, 1.06f)
                arcToRelative(3.626f, 3.626f, 0.0f, false, false, -5.124f, 0.0f)
                lineTo(0.0f, 18.876f)
                verticalLineTo(24.0f)
                horizontalLineTo(5.124f)
                lineTo(22.94f, 6.184f)
                arcTo(3.627f, 3.627f, 0.0f, false, false, 22.94f, 1.06f)
                close()
                moveTo(4.3f, 22.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(19.7f)
                lineTo(15.31f, 6.4f)
                lineToRelative(2.3f, 2.3f)
                close()
                moveTo(21.526f, 4.77f)
                lineTo(19.019f, 7.277f)
                lineToRelative(-2.295f, -2.3f)
                lineTo(19.23f, 2.474f)
                arcToRelative(1.624f, 1.624f, 0.0f, false, true, 2.3f, 2.3f)
                close()
            }
        }
        .build()
        return _pencil!!
    }

private var _pencil: ImageVector? = null
