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

public val Icons.Outline.CallOutgoing: ImageVector
    get() {
        if (_callOutgoing != null) {
            return _callOutgoing!!
        }
        _callOutgoing = Builder(name = "CallOutgoing", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.2f, 16.262f)
                arcTo(12.148f, 12.148f, 0.0f, false, true, 7.746f, 9.793f)
                lineToRelative(3.406f, -3.406f)
                lineTo(4.887f, 0.122f)
                lineTo(1.716f, 3.293f)
                arcTo(5.893f, 5.893f, 0.0f, false, false, 0.0f, 7.5f)
                curveTo(0.0f, 14.748f, 9.252f, 24.0f, 16.5f, 24.0f)
                arcToRelative(5.893f, 5.893f, 0.0f, false, false, 4.207f, -1.716f)
                lineToRelative(3.171f, -3.171f)
                lineToRelative(-6.265f, -6.265f)
                close()
                moveTo(19.294f, 20.87f)
                arcTo(3.91f, 3.91f, 0.0f, false, true, 16.5f, 22.0f)
                curveTo(10.267f, 22.0f, 2.0f, 13.733f, 2.0f, 7.5f)
                arcTo(3.91f, 3.91f, 0.0f, false, true, 3.13f, 4.707f)
                lineTo(4.887f, 2.95f)
                lineTo(8.324f, 6.387f)
                lineTo(5.389f, 9.322f)
                lineToRelative(0.246f, 0.614f)
                arcToRelative(14.37f, 14.37f, 0.0f, false, false, 8.446f, 8.436f)
                lineToRelative(0.606f, 0.231f)
                lineToRelative(2.926f, -2.927f)
                lineToRelative(3.437f, 3.437f)
                close()
                moveTo(24.0f, 2.5f)
                lineTo(24.0f, 7.0f)
                lineTo(22.0f, 7.0f)
                lineTo(22.0f, 3.443f)
                lineTo(16.409f, 9.034f)
                lineTo(15.0f, 7.62f)
                lineTo(20.615f, 2.0f)
                lineTo(17.0f, 2.0f)
                lineTo(17.0f, 0.0f)
                horizontalLineToRelative(4.529f)
                arcTo(2.488f, 2.488f, 0.0f, false, true, 24.0f, 2.5f)
                close()
            }
        }
        .build()
        return _callOutgoing!!
    }

private var _callOutgoing: ImageVector? = null
