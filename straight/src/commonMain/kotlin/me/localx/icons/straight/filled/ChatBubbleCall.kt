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

public val Icons.Filled.ChatBubbleCall: ImageVector
    get() {
        if (_chatBubbleCall != null) {
            return _chatBubbleCall!!
        }
        _chatBubbleCall = Builder(name = "ChatBubbleCall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.4f, 10.862f)
                horizontalLineToRelative(-0.309f)
                curveToRelative(-0.601f, 0.0f, -1.09f, -0.488f, -1.09f, -1.088f)
                lineToRelative(-0.002f, -7.771f)
                curveTo(14.0f, 0.9f, 14.896f, 0.003f, 15.999f, 0.002f)
                lineToRelative(6.001f, -0.002f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-5.874f)
                lineToRelative(-2.726f, 1.862f)
                close()
                moveTo(17.612f, 12.725f)
                lineToRelative(6.265f, 6.266f)
                lineToRelative(-3.171f, 3.171f)
                curveToRelative(-1.105f, 1.106f, -2.6f, 1.716f, -4.207f, 1.716f)
                curveTo(9.252f, 23.878f, 0.0f, 14.626f, 0.0f, 7.378f)
                curveToRelative(0.0f, -1.608f, 0.609f, -3.103f, 1.716f, -4.208f)
                lineTo(4.887f, 0.0f)
                lineToRelative(6.265f, 6.265f)
                lineToRelative(-4.125f, 4.125f)
                curveToRelative(1.373f, 3.061f, 3.493f, 5.186f, 6.453f, 6.468f)
                lineToRelative(4.133f, -4.132f)
                close()
            }
        }
        .build()
        return _chatBubbleCall!!
    }

private var _chatBubbleCall: ImageVector? = null
