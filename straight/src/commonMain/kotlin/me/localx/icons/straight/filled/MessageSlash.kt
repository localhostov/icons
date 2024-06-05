package me.localx.icons.straight.filled

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

public val Icons.Filled.MessageSlash: ImageVector
    get() {
        if (_messageSlash != null) {
            return _messageSlash!!
        }
        _messageSlash = Builder(name = "MessageSlash", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.414f, 19.0f)
                horizontalLineToRelative(1.723f)
                lineToRelative(-0.137f, -14.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                lineTo(5.0f, 2.0f)
                curveToRelative(-0.451f, 0.0f, -0.892f, 0.102f, -1.293f, 0.293f)
                lineTo(1.457f, 0.043f)
                lineTo(0.043f, 1.457f)
                lineToRelative(22.5f, 22.5f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-3.543f, -3.543f)
                close()
                moveTo(15.448f, 19.69f)
                lineToRelative(-2.267f, 1.874f)
                curveToRelative(-0.327f, 0.292f, -0.747f, 0.439f, -1.172f, 0.439f)
                curveToRelative(-0.433f, 0.0f, -0.869f, -0.153f, -1.218f, -0.463f)
                lineToRelative(-3.016f, -2.54f)
                lineTo(2.0f, 19.0f)
                lineTo(2.0f, 6.242f)
                lineToRelative(13.448f, 13.448f)
                close()
            }
        }
        .build()
        return _messageSlash!!
    }

private var _messageSlash: ImageVector? = null
