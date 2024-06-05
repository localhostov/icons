package me.localx.icons.straight.bold

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

public val Icons.Bold.ArrowAltToBottom: ImageVector
    get() {
        if (_arrowAltToBottom != null) {
            return _arrowAltToBottom!!
        }
        _arrowAltToBottom = Builder(name = "ArrowAltToBottom", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 21.0f)
                curveToRelative(-0.36f, 0.0f, -0.721f, -0.148f, -0.983f, -0.445f)
                lineToRelative(-5.017f, -5.555f)
                horizontalLineToRelative(4.5f)
                lineTo(10.5f, 0.0f)
                horizontalLineToRelative(3.0f)
                lineTo(13.5f, 15.0f)
                horizontalLineToRelative(4.5f)
                lineToRelative(-5.017f, 5.555f)
                curveToRelative(-0.262f, 0.297f, -0.623f, 0.445f, -0.983f, 0.445f)
                close()
                moveTo(3.0f, 21.0f)
                verticalLineToRelative(3.0f)
                lineTo(21.0f, 24.0f)
                verticalLineToRelative(-3.0f)
                lineTo(3.0f, 21.0f)
                close()
            }
        }
        .build()
        return _arrowAltToBottom!!
    }

private var _arrowAltToBottom: ImageVector? = null
