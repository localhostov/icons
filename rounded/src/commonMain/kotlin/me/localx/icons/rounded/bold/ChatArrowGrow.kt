package me.localx.icons.rounded.bold

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

public val Icons.Bold.ChatArrowGrow: ImageVector
    get() {
        if (_chatArrowGrow != null) {
            return _chatArrowGrow!!
        }
        _chatArrowGrow = Builder(name = "ChatArrowGrow", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.5f, 21.0f)
                horizontalLineTo(5.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 3.0f, 18.5f)
                verticalLineTo(1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                verticalLineToRelative(17.0f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 5.5f, 24.0f)
                horizontalLineToRelative(17.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.5f, 3.976f)
                horizontalLineTo(19.414f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.707f, 1.707f)
                lineToRelative(0.733f, 0.732f)
                horizontalLineToRelative(0.0f)
                lineTo(15.853f, 10.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.708f, 0.0f)
                lineToRelative(-0.17f, -0.17f)
                arcToRelative(3.583f, 3.583f, 0.0f, false, false, -4.95f, 0.0f)
                lineToRelative(-4.1f, 4.1f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 2.121f, 2.121f)
                lineToRelative(4.1f, -4.1f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.708f, 0.0f)
                lineToRelative(0.17f, 0.17f)
                arcToRelative(3.585f, 3.585f, 0.0f, false, false, 4.95f, 0.0f)
                lineToRelative(3.586f, -3.585f)
                horizontalLineToRelative(0.0f)
                lineToRelative(0.732f, 0.733f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 24.0f, 8.562f)
                verticalLineTo(5.476f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 22.5f, 3.976f)
                close()
            }
        }
        .build()
        return _chatArrowGrow!!
    }

private var _chatArrowGrow: ImageVector? = null
