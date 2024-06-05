package me.localx.icons.rounded.filled

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

public val Icons.Filled.ChatArrowDown: ImageVector
    get() {
        if (_chatArrowDown != null) {
            return _chatArrowDown!!
        }
        _chatArrowDown = Builder(name = "ChatArrowDown", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.293f, 12.7f)
                lineToRelative(-1.086f, 1.086f)
                horizontalLineToRelative(0.0f)
                lineTo(17.622f, 10.2f)
                arcToRelative(3.073f, 3.073f, 0.0f, false, false, -4.242f, 0.0f)
                lineToRelative(-0.173f, 0.173f)
                arcToRelative(1.023f, 1.023f, 0.0f, false, true, -1.414f, 0.0f)
                lineTo(6.72f, 5.294f)
                arcTo(1.0f, 1.0f, 0.0f, true, false, 5.306f, 6.708f)
                lineToRelative(5.072f, 5.073f)
                arcToRelative(3.072f, 3.072f, 0.0f, false, false, 4.242f, 0.0f)
                lineToRelative(0.173f, -0.173f)
                arcToRelative(1.023f, 1.023f, 0.0f, false, true, 1.414f, 0.0f)
                lineTo(19.793f, 15.2f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-1.086f, 1.086f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.707f, 1.707f)
                horizontalLineTo(22.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, -1.5f)
                verticalLineTo(13.4f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 22.293f, 12.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 21.976f)
                horizontalLineTo(5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                verticalLineTo(1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 0.0f, 1.0f)
                verticalLineTo(18.976f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, 5.0f)
                horizontalLineTo(23.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                close()
            }
        }
        .build()
        return _chatArrowDown!!
    }

private var _chatArrowDown: ImageVector? = null
