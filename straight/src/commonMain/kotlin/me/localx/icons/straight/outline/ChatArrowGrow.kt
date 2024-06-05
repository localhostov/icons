package me.localx.icons.straight.outline

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
import me.localx.icons.straight.Icons

public val Icons.Outline.ChatArrowGrow: ImageVector
    get() {
        if (_chatArrowGrow != null) {
            return _chatArrowGrow!!
        }
        _chatArrowGrow = Builder(name = "ChatArrowGrow", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 20.976f)
                verticalLineToRelative(-21.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(21.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                horizontalLineTo(24.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 2.0f, 20.976f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.5f, 3.976f)
                horizontalLineTo(17.0f)
                lineToRelative(2.793f, 2.793f)
                lineTo(15.5f, 11.062f)
                lineToRelative(-2.0f, -2.0f)
                lineTo(6.281f, 16.281f)
                lineTo(7.7f, 17.7f)
                lineToRelative(5.805f, -5.8f)
                lineToRelative(2.0f, 2.0f)
                lineToRelative(5.707f, -5.707f)
                lineTo(24.0f, 10.976f)
                verticalLineToRelative(-5.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 22.5f, 3.976f)
                close()
            }
        }
        .build()
        return _chatArrowGrow!!
    }

private var _chatArrowGrow: ImageVector? = null
