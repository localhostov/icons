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

public val Icons.Outline.A: ImageVector
    get() {
        if (_a != null) {
            return _a!!
        }
        _a = Builder(name = "A", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.713f, 24.0f)
                horizontalLineToRelative(2.156f)
                lineTo(14.859f, 1.661f)
                curveToRelative(-0.511f, -1.024f, -1.54f, -1.661f, -2.684f, -1.661f)
                horizontalLineToRelative(-0.002f)
                curveToRelative(-1.146f, 0.0f, -2.174f, 0.638f, -2.711f, 1.724f)
                lineTo(0.168f, 24.0f)
                horizontalLineTo(2.335f)
                lineToRelative(2.92f, -7.0f)
                horizontalLineToRelative(13.636f)
                lineToRelative(2.822f, 7.0f)
                close()
                moveTo(6.089f, 15.0f)
                lineTo(11.28f, 2.554f)
                curveToRelative(0.172f, -0.347f, 0.507f, -0.554f, 0.894f, -0.554f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.387f, 0.0f, 0.721f, 0.207f, 0.862f, 0.481f)
                lineToRelative(5.047f, 12.519f)
                horizontalLineTo(6.089f)
                close()
            }
        }
        .build()
        return _a!!
    }

private var _a: ImageVector? = null
