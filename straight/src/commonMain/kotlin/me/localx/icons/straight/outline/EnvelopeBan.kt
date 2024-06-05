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

public val Icons.Outline.EnvelopeBan: ImageVector
    get() {
        if (_envelopeBan != null) {
            return _envelopeBan!!
        }
        _envelopeBan = Builder(name = "EnvelopeBan", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 10.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, false, -3.536f, -1.462f)
                arcTo(4.99f, 4.99f, 0.0f, false, false, 19.0f, 10.0f)
                close()
                moveTo(21.122f, 7.124f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.406f, 0.576f)
                lineTo(21.7f, 3.716f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 21.122f, 7.122f)
                close()
                moveTo(16.878f, 2.878f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 20.284f, 2.3f)
                lineTo(16.3f, 6.284f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 16.878f, 2.878f)
                close()
                moveTo(24.0f, 9.9f)
                lineTo(24.0f, 24.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 6.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                horizontalLineToRelative(9.293f)
                arcTo(7.043f, 7.043f, 0.0f, false, false, 12.0f, 5.0f)
                lineTo(3.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 2.0f, 6.0f)
                verticalLineToRelative(0.242f)
                lineToRelative(7.878f, 7.88f)
                arcToRelative(3.074f, 3.074f, 0.0f, false, false, 4.244f, 0.0f)
                lineToRelative(2.532f, -2.532f)
                arcTo(7.027f, 7.027f, 0.0f, false, false, 19.0f, 12.0f)
                curveToRelative(0.026f, 0.0f, 0.051f, 0.0f, 0.077f, 0.0f)
                lineToRelative(-3.541f, 3.542f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -7.072f, 0.0f)
                lineTo(2.0f, 9.071f)
                lineTo(2.0f, 22.0f)
                lineTo(22.0f, 22.0f)
                lineTo(22.0f, 11.318f)
                arcTo(6.957f, 6.957f, 0.0f, false, false, 23.95f, 9.95f)
                curveTo(23.968f, 9.932f, 23.983f, 9.912f, 24.0f, 9.9f)
                close()
            }
        }
        .build()
        return _envelopeBan!!
    }

private var _envelopeBan: ImageVector? = null
