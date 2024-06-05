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

public val Icons.Outline.ChatBubbleCall: ImageVector
    get() {
        if (_chatBubbleCall != null) {
            return _chatBubbleCall!!
        }
        _chatBubbleCall = Builder(name = "ChatBubbleCall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 0.0f)
                lineToRelative(-6.001f, 0.002f)
                curveToRelative(-1.103f, 0.0f, -1.999f, 0.898f, -1.999f, 2.001f)
                lineToRelative(0.002f, 7.771f)
                curveToRelative(0.0f, 0.6f, 0.489f, 1.088f, 1.09f, 1.088f)
                horizontalLineToRelative(0.309f)
                lineToRelative(2.726f, -1.862f)
                horizontalLineToRelative(5.874f)
                lineTo(24.001f, 2.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(22.0f, 7.0f)
                horizontalLineToRelative(-4.491f)
                lineToRelative(-1.507f, 1.029f)
                lineToRelative(-0.002f, -6.027f)
                lineToRelative(6.0f, -0.002f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(14.199f, 16.262f)
                curveToRelative(-2.959f, -1.282f, -5.079f, -3.407f, -6.453f, -6.469f)
                lineToRelative(3.406f, -3.406f)
                lineTo(4.888f, 0.122f)
                lineTo(1.716f, 3.293f)
                curveToRelative(-1.106f, 1.105f, -1.716f, 2.599f, -1.716f, 4.208f)
                curveToRelative(0.0f, 7.248f, 9.252f, 16.5f, 16.5f, 16.5f)
                curveToRelative(1.608f, 0.0f, 3.103f, -0.609f, 4.207f, -1.715f)
                lineToRelative(3.171f, -3.171f)
                lineToRelative(-6.265f, -6.265f)
                lineToRelative(-3.414f, 3.414f)
                close()
                moveTo(19.292f, 20.871f)
                curveToRelative(-0.727f, 0.728f, -1.718f, 1.129f, -2.792f, 1.129f)
                curveToRelative(-6.233f, 0.0f, -14.5f, -8.266f, -14.5f, -14.5f)
                curveToRelative(0.0f, -1.073f, 0.401f, -2.065f, 1.13f, -2.793f)
                lineToRelative(1.758f, -1.757f)
                lineToRelative(3.437f, 3.437f)
                lineToRelative(-2.936f, 2.936f)
                lineToRelative(0.246f, 0.613f)
                curveToRelative(1.641f, 4.086f, 4.482f, 6.924f, 8.446f, 8.437f)
                lineToRelative(0.605f, 0.231f)
                lineToRelative(2.927f, -2.927f)
                lineToRelative(3.437f, 3.437f)
                lineToRelative(-1.758f, 1.758f)
                close()
            }
        }
        .build()
        return _chatBubbleCall!!
    }

private var _chatBubbleCall: ImageVector? = null
