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

public val Icons.Bold.TextCheck: ImageVector
    get() {
        if (_textCheck != null) {
            return _textCheck!!
        }
        _textCheck = Builder(name = "TextCheck", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.094f, 1.329f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.684f, 0.0f)
                lineTo(0.16f, 11.829f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 1.5f, 14.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.342f, -0.829f)
                lineTo(3.429f, 12.0f)
                horizontalLineToRelative(6.646f)
                lineToRelative(0.585f, 1.171f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 12.0f, 14.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.342f, -2.171f)
                close()
                moveTo(4.929f, 9.0f)
                lineTo(6.752f, 5.354f)
                lineTo(8.575f, 9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 23.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.061f, -0.439f)
                lineToRelative(-5.0f, -5.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 2.122f, -2.122f)
                lineTo(13.0f, 19.879f)
                lineToRelative(8.439f, -8.44f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 2.122f, 2.122f)
                lineToRelative(-9.5f, 9.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 13.0f, 23.5f)
                close()
            }
        }
        .build()
        return _textCheck!!
    }

private var _textCheck: ImageVector? = null
