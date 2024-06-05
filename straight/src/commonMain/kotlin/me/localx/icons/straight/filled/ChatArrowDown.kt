package me.localx.icons.straight.filled

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
                moveTo(21.207f, 13.781f)
                lineTo(15.5f, 8.074f)
                lineToRelative(-2.0f, 2.0f)
                lineToRelative(-5.8f, -5.8f)
                lineTo(6.281f, 5.683f)
                lineTo(13.5f, 12.9f)
                lineToRelative(2.0f, -2.0f)
                lineTo(19.793f, 15.2f)
                lineTo(17.0f, 17.988f)
                horizontalLineToRelative(5.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, -1.5f)
                verticalLineToRelative(-5.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 20.976f)
                verticalLineTo(0.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(20.976f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                horizontalLineTo(24.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 2.0f, 20.976f)
                close()
            }
        }
        .build()
        return _chatArrowDown!!
    }

private var _chatArrowDown: ImageVector? = null
