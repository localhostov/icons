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

public val Icons.Outline.MessageXmark: ImageVector
    get() {
        if (_messageXmark != null) {
            return _messageXmark!!
        }
        _messageXmark = Builder(name = "MessageXmark", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.481f, 6.907f)
                lineToRelative(-3.093f, 3.093f)
                lineToRelative(3.093f, 3.093f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-3.093f, -3.093f)
                lineToRelative(-3.093f, 3.093f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(3.093f, -3.093f)
                lineToRelative(-3.093f, -3.093f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(3.093f, 3.093f)
                lineToRelative(3.093f, -3.093f)
                lineToRelative(1.414f, 1.414f)
                close()
                moveTo(24.0f, 3.0f)
                verticalLineToRelative(17.0f)
                horizontalLineToRelative(-6.852f)
                lineToRelative(-3.847f, 3.18f)
                curveToRelative(-0.362f, 0.322f, -0.826f, 0.484f, -1.293f, 0.484f)
                curveToRelative(-0.476f, 0.0f, -0.955f, -0.168f, -1.337f, -0.507f)
                lineToRelative(-3.748f, -3.157f)
                lineTo(0.0f, 20.0f)
                lineTo(0.0f, 3.0f)
                curveTo(0.0f, 1.346f, 1.346f, 0.0f, 3.0f, 0.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(22.0f, 3.0f)
                curveToRelative(0.0f, -0.551f, -0.449f, -1.0f, -1.0f, -1.0f)
                lineTo(3.0f, 2.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, 0.449f, -1.0f, 1.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(5.654f)
                lineToRelative(4.326f, 3.645f)
                lineToRelative(4.449f, -3.645f)
                horizontalLineToRelative(5.571f)
                lineTo(22.0f, 3.0f)
                close()
            }
        }
        .build()
        return _messageXmark!!
    }

private var _messageXmark: ImageVector? = null
