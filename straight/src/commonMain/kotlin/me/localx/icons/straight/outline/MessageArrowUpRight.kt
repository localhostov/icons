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

public val Icons.Outline.MessageArrowUpRight: ImageVector
    get() {
        if (_messageArrowUpRight != null) {
            return _messageArrowUpRight!!
        }
        _messageArrowUpRight = Builder(name = "MessageArrowUpRight", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(22.0f, 18.0f)
                horizontalLineToRelative(-5.571f)
                lineToRelative(-4.449f, 3.645f)
                lineToRelative(-4.326f, -3.645f)
                lineTo(2.0f, 18.0f)
                lineTo(2.0f, 3.0f)
                curveToRelative(0.0f, -0.552f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(15.0f)
                close()
                moveTo(17.0f, 8.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.575f)
                lineToRelative(-5.287f, 5.287f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(5.298f, -5.299f)
                horizontalLineToRelative(-3.6f)
                lineToRelative(0.005f, -2.0f)
                lineToRelative(5.012f, 0.012f)
                curveToRelative(1.094f, 0.0f, 1.986f, 0.892f, 1.986f, 1.988f)
                close()
            }
        }
        .build()
        return _messageArrowUpRight!!
    }

private var _messageArrowUpRight: ImageVector? = null
