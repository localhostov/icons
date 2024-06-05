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

public val Icons.Filled.TentArrowDownToLine: ImageVector
    get() {
        if (_tentArrowDownToLine != null) {
            return _tentArrowDownToLine!!
        }
        _tentArrowDownToLine = Builder(name = "TentArrowDownToLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(5.0f, 8.999f)
                curveToRelative(0.509f, 0.0f, 1.019f, -0.193f, 1.406f, -0.581f)
                lineToRelative(3.299f, -3.299f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-2.291f, 2.302f)
                lineTo(6.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(5.996f)
                lineTo(1.709f, 3.705f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(3.299f, 3.299f)
                curveToRelative(0.388f, 0.387f, 0.896f, 0.581f, 1.406f, 0.581f)
                close()
                moveTo(23.604f, 20.141f)
                lineTo(14.001f, 6.241f)
                lineTo(3.181f, 22.0f)
                lineTo(0.0f, 22.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(8.717f)
                lineToRelative(5.284f, -8.0f)
                lineToRelative(5.285f, 8.0f)
                horizontalLineToRelative(2.148f)
                curveToRelative(0.935f, 0.0f, 1.795f, -0.499f, 2.246f, -1.302f)
                curveToRelative(0.445f, -0.793f, 0.43f, -1.731f, -0.076f, -2.558f)
                close()
                moveTo(11.114f, 24.0f)
                horizontalLineToRelative(5.775f)
                lineToRelative(-2.887f, -4.371f)
                lineToRelative(-2.887f, 4.371f)
                close()
            }
        }
        .build()
        return _tentArrowDownToLine!!
    }

private var _tentArrowDownToLine: ImageVector? = null
