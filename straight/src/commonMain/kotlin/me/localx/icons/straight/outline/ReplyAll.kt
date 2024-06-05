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

public val Icons.Outline.ReplyAll: ImageVector
    get() {
        if (_replyAll != null) {
            return _replyAll!!
        }
        _replyAll = Builder(name = "ReplyAll", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 11.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(11.0f)
                curveToRelative(0.0f, -0.552f, -0.449f, -1.0f, -1.0f, -1.0f)
                horizontalLineTo(8.888f)
                lineToRelative(5.846f, 6.321f)
                lineToRelative(-1.469f, 1.357f)
                lineToRelative(-6.677f, -7.221f)
                curveToRelative(-0.792f, -0.791f, -0.792f, -2.125f, 0.027f, -2.944f)
                lineTo(13.266f, 0.321f)
                lineToRelative(1.469f, 1.357f)
                lineToRelative(-5.846f, 6.321f)
                horizontalLineToRelative(12.111f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(2.057f, 8.899f)
                lineTo(8.734f, 1.679f)
                lineTo(7.266f, 0.321f)
                lineTo(0.615f, 7.514f)
                curveToRelative(-0.818f, 0.819f, -0.818f, 2.153f, -0.027f, 2.944f)
                lineToRelative(6.677f, 7.221f)
                lineToRelative(1.469f, -1.357f)
                lineTo(2.03f, 9.072f)
                curveToRelative(-0.04f, -0.04f, -0.04f, -0.104f, 0.027f, -0.173f)
                close()
            }
        }
        .build()
        return _replyAll!!
    }

private var _replyAll: ImageVector? = null
