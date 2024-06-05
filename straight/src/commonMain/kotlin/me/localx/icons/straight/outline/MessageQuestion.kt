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

public val Icons.Outline.MessageQuestion: ImageVector
    get() {
        if (_messageQuestion != null) {
            return _messageQuestion!!
        }
        _messageQuestion = Builder(name = "MessageQuestion", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.937f, 7.283f)
                curveToRelative(0.298f, 1.697f, -0.509f, 3.395f, -2.008f, 4.222f)
                curveToRelative(-0.47f, 0.259f, -0.93f, 1.126f, -0.93f, 1.752f)
                verticalLineToRelative(0.743f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-0.743f)
                curveToRelative(0.0f, -1.19f, 0.734f, -2.826f, 1.963f, -3.504f)
                curveToRelative(0.764f, -0.42f, 1.157f, -1.254f, 1.004f, -2.124f)
                curveToRelative(-0.138f, -0.786f, -0.81f, -1.458f, -1.596f, -1.596f)
                curveToRelative(-0.609f, -0.109f, -1.195f, 0.046f, -1.656f, 0.435f)
                curveToRelative(-0.454f, 0.381f, -0.715f, 0.939f, -0.715f, 1.532f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.185f, 0.521f, -2.302f, 1.429f, -3.064f)
                curveToRelative(0.907f, -0.762f, 2.103f, -1.078f, 3.288f, -0.873f)
                curveToRelative(1.612f, 0.284f, 2.937f, 1.608f, 3.221f, 3.221f)
                close()
                moveTo(11.0f, 18.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(24.0f, 3.0f)
                verticalLineToRelative(17.0f)
                horizontalLineToRelative(-6.853f)
                lineToRelative(-3.847f, 3.18f)
                curveToRelative(-0.361f, 0.322f, -0.824f, 0.484f, -1.292f, 0.484f)
                curveToRelative(-0.476f, 0.0f, -0.955f, -0.168f, -1.337f, -0.508f)
                lineToRelative(-3.749f, -3.156f)
                lineTo(0.0f, 20.0f)
                lineTo(0.0f, 3.0f)
                curveTo(0.0f, 1.346f, 1.346f, 0.0f, 3.0f, 0.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(22.0f, 3.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                lineTo(3.0f, 2.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(5.653f)
                lineToRelative(4.327f, 3.645f)
                lineToRelative(4.448f, -3.645f)
                horizontalLineToRelative(5.571f)
                lineTo(21.999f, 3.0f)
                close()
            }
        }
        .build()
        return _messageQuestion!!
    }

private var _messageQuestion: ImageVector? = null
