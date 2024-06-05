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

public val Icons.Bold.ChatArrowDown: ImageVector
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
                lineToRelative(-0.732f, 0.732f)
                horizontalLineToRelative(0.0f)
                lineTo(17.975f, 9.842f)
                arcToRelative(3.585f, 3.585f, 0.0f, false, false, -4.948f, 0.0f)
                lineToRelative(-0.174f, 0.173f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.707f, 0.0f)
                lineToRelative(-4.1f, -4.1f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 5.927f, 8.037f)
                lineToRelative(4.1f, 4.1f)
                arcToRelative(3.584f, 3.584f, 0.0f, false, false, 4.948f, 0.0f)
                lineToRelative(0.174f, -0.173f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.707f, 0.0f)
                lineToRelative(3.585f, 3.585f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-0.733f, 0.733f)
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
        }
        .build()
        return _chatArrowDown!!
    }

private var _chatArrowDown: ImageVector? = null
