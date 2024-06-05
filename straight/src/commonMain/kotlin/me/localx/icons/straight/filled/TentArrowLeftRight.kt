package me.localx.icons.straight.filled

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

public val Icons.Filled.TentArrowLeftRight: ImageVector
    get() {
        if (_tentArrowLeftRight != null) {
            return _tentArrowLeftRight!!
        }
        _tentArrowLeftRight = Builder(name = "TentArrowLeftRight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.001f, 19.629f)
                lineToRelative(2.887f, 4.371f)
                horizontalLineToRelative(-5.775f)
                lineToRelative(2.887f, -4.371f)
                close()
                moveTo(12.001f, 6.241f)
                lineTo(2.368f, 20.188f)
                curveToRelative(-0.474f, 0.778f, -0.491f, 1.716f, -0.045f, 2.509f)
                curveToRelative(0.451f, 0.804f, 1.312f, 1.303f, 2.247f, 1.303f)
                horizontalLineToRelative(2.148f)
                lineToRelative(5.284f, -8.0f)
                lineToRelative(5.285f, 8.0f)
                horizontalLineToRelative(2.148f)
                curveToRelative(0.935f, 0.0f, 1.795f, -0.499f, 2.246f, -1.302f)
                curveToRelative(0.445f, -0.793f, 0.43f, -1.731f, -0.076f, -2.558f)
                lineTo(12.001f, 6.241f)
                close()
                moveTo(20.12f, 0.295f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(2.302f, 2.291f)
                lineTo(3.003f, 4.0f)
                lineToRelative(2.291f, -2.291f)
                lineTo(3.88f, 0.295f)
                lineTo(0.58f, 3.594f)
                curveToRelative(-0.773f, 0.775f, -0.773f, 2.037f, 0.0f, 2.812f)
                lineToRelative(3.299f, 3.298f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-2.302f, -2.291f)
                horizontalLineToRelative(18.005f)
                lineToRelative(-2.291f, 2.291f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(3.3f, -3.299f)
                curveToRelative(0.773f, -0.775f, 0.773f, -2.037f, 0.0f, -2.812f)
                lineToRelative(-3.299f, -3.298f)
                close()
            }
        }
        .build()
        return _tentArrowLeftRight!!
    }

private var _tentArrowLeftRight: ImageVector? = null
