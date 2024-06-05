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

public val Icons.Filled.MessageArrowUp: ImageVector
    get() {
        if (_messageArrowUp != null) {
            return _messageArrowUp!!
        }
        _messageArrowUp = Builder(name = "MessageArrowUp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 0.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                verticalLineToRelative(17.0f)
                horizontalLineToRelative(6.923f)
                lineToRelative(3.748f, 3.156f)
                curveToRelative(0.382f, 0.34f, 0.862f, 0.509f, 1.338f, 0.509f)
                curveToRelative(0.467f, 0.0f, 0.931f, -0.163f, 1.292f, -0.485f)
                lineToRelative(3.847f, -3.18f)
                horizontalLineToRelative(6.852f)
                lineTo(24.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(15.291f, 10.294f)
                lineToRelative(-2.291f, -2.291f)
                verticalLineToRelative(6.997f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-7.008f)
                lineToRelative(-2.291f, 2.302f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(3.298f, -3.299f)
                curveToRelative(0.775f, -0.775f, 2.038f, -0.774f, 2.812f, 0.0f)
                lineToRelative(3.299f, 3.3f)
                lineToRelative(-1.414f, 1.414f)
                close()
            }
        }
        .build()
        return _messageArrowUp!!
    }

private var _messageArrowUp: ImageVector? = null
