package me.localx.icons.rounded.bold

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

public val Icons.Bold.MakeupBrush: ImageVector
    get() {
        if (_makeupBrush != null) {
            return _makeupBrush!!
        }
        _makeupBrush = Builder(name = "MakeupBrush", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.984f, 1.018f)
                arcToRelative(3.49f, 3.49f, 0.0f, false, false, -4.71f, -0.184f)
                lineToRelative(-12.626f, 10.92f)
                curveToRelative(-2.075f, 0.473f, -5.648f, 1.765f, -5.648f, 5.046f)
                arcToRelative(7.208f, 7.208f, 0.0f, false, false, 7.2f, 7.2f)
                curveToRelative(3.282f, 0.0f, 4.573f, -3.573f, 5.046f, -5.648f)
                lineToRelative(10.934f, -12.642f)
                arcToRelative(3.488f, 3.488f, 0.0f, false, false, -0.196f, -4.692f)
                close()
                moveTo(7.2f, 21.0f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, -4.2f, -4.2f)
                curveToRelative(0.0f, -1.094f, 2.121f, -1.886f, 3.681f, -2.2f)
                lineToRelative(2.719f, 2.719f)
                curveToRelative(-0.314f, 1.562f, -1.106f, 3.681f, -2.2f, 3.681f)
                close()
                moveTo(20.9f, 3.76f)
                lineTo(14.653f, 10.983f)
                lineTo(13.016f, 9.348f)
                lineTo(20.227f, 3.112f)
                arcToRelative(0.469f, 0.469f, 0.0f, false, true, 0.672f, 0.648f)
                close()
            }
        }
        .build()
        return _makeupBrush!!
    }

private var _makeupBrush: ImageVector? = null
