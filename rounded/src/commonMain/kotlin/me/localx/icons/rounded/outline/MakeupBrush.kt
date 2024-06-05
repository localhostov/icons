package me.localx.icons.rounded.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Outline.MakeupBrush: ImageVector
    get() {
        if (_makeupBrush != null) {
            return _makeupBrush!!
        }
        _makeupBrush = Builder(name = "MakeupBrush", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.229f, 0.771f)
                arcToRelative(2.637f, 2.637f, 0.0f, false, false, -3.591f, -0.12f)
                lineToRelative(-14.166f, 12.482f)
                curveToRelative(-2.335f, 0.44f, -5.472f, 1.741f, -5.472f, 4.467f)
                arcToRelative(6.407f, 6.407f, 0.0f, false, false, 6.4f, 6.4f)
                curveToRelative(2.725f, 0.0f, 4.027f, -3.136f, 4.467f, -5.471f)
                lineToRelative(12.485f, -14.171f)
                arcToRelative(2.634f, 2.634f, 0.0f, false, false, -0.123f, -3.587f)
                close()
                moveTo(10.141f, 16.327f)
                lineTo(7.673f, 13.859f)
                lineTo(9.678f, 12.092f)
                lineTo(11.908f, 14.322f)
                close()
                moveTo(6.4f, 22.0f)
                arcToRelative(4.405f, 4.405f, 0.0f, false, true, -4.4f, -4.4f)
                curveToRelative(0.0f, -1.508f, 2.639f, -2.287f, 4.049f, -2.537f)
                lineToRelative(2.888f, 2.887f)
                curveToRelative(-0.251f, 1.411f, -1.029f, 4.05f, -2.537f, 4.05f)
                close()
                moveTo(21.849f, 3.04f)
                lineTo(13.233f, 12.818f)
                lineTo(11.181f, 10.767f)
                lineTo(20.956f, 2.154f)
                arcToRelative(0.631f, 0.631f, 0.0f, false, true, 0.893f, 0.886f)
                close()
            }
        }
        .build()
        return _makeupBrush!!
    }

private var _makeupBrush: ImageVector? = null
