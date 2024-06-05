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

public val Icons.Filled.ChatArrowGrow: ImageVector
    get() {
        if (_chatArrowGrow != null) {
            return _chatArrowGrow!!
        }
        _chatArrowGrow = Builder(name = "ChatArrowGrow", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.5f, 3.976f)
                horizontalLineTo(19.414f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.707f, 1.707f)
                lineToRelative(1.086f, 1.086f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-3.586f, 3.585f)
                arcToRelative(1.024f, 1.024f, 0.0f, false, true, -1.415f, 0.0f)
                lineToRelative(-0.17f, -0.171f)
                arcToRelative(3.071f, 3.071f, 0.0f, false, false, -4.243f, 0.0f)
                lineToRelative(-5.1f, 5.1f)
                arcTo(1.0f, 1.0f, 0.0f, true, false, 6.7f, 16.7f)
                lineToRelative(5.1f, -5.1f)
                arcToRelative(1.023f, 1.023f, 0.0f, false, true, 1.415f, 0.0f)
                lineToRelative(0.17f, 0.171f)
                arcToRelative(3.073f, 3.073f, 0.0f, false, false, 4.243f, 0.0f)
                lineToRelative(3.586f, -3.586f)
                horizontalLineToRelative(0.0f)
                lineToRelative(1.086f, 1.086f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 24.0f, 8.562f)
                verticalLineTo(5.476f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 22.5f, 3.976f)
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
        return _chatArrowGrow!!
    }

private var _chatArrowGrow: ImageVector? = null
