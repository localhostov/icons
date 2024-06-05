package me.localx.icons.rounded.filled

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

public val Icons.Filled.MakeupBrush: ImageVector
    get() {
        if (_makeupBrush != null) {
            return _makeupBrush!!
        }
        _makeupBrush = Builder(name = "MakeupBrush", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.4f, 24.0f)
                arcToRelative(6.407f, 6.407f, 0.0f, false, true, -6.4f, -6.4f)
                curveToRelative(0.0f, -3.059f, 3.952f, -4.327f, 6.286f, -4.593f)
                arcToRelative(0.989f, 0.989f, 0.0f, false, true, 0.821f, 0.286f)
                lineToRelative(3.6f, 3.6f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.287f, 0.82f)
                curveToRelative(-0.267f, 2.335f, -1.536f, 6.287f, -4.594f, 6.287f)
                close()
                moveTo(10.16f, 9.228f)
                lineTo(7.88f, 11.237f)
                lineTo(12.763f, 16.12f)
                lineTo(14.772f, 13.84f)
                close()
                moveTo(23.284f, 0.716f)
                arcToRelative(2.452f, 2.452f, 0.0f, false, false, -3.337f, -0.111f)
                lineToRelative(-8.283f, 7.295f)
                lineToRelative(4.436f, 4.436f)
                lineToRelative(7.3f, -8.286f)
                arcToRelative(2.45f, 2.45f, 0.0f, false, false, -0.116f, -3.334f)
                close()
            }
        }
        .build()
        return _makeupBrush!!
    }

private var _makeupBrush: ImageVector? = null
