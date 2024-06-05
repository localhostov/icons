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

public val Icons.Bold.Hiking: ImageVector
    get() {
        if (_hiking != null) {
            return _hiking!!
        }
        _hiking = Builder(name = "Hiking", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 2.5f)
                arcTo(2.5f, 2.5f, 0.0f, true, true, 12.5f, 5.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 10.0f, 2.5f)
                close()
                moveTo(21.0f, 8.0f)
                lineTo(21.0f, 24.0f)
                lineTo(18.0f, 24.0f)
                lineTo(18.0f, 13.0f)
                lineTo(13.554f, 13.0f)
                lineToRelative(-1.149f, -2.3f)
                lineToRelative(-0.973f, 5.035f)
                lineTo(14.0f, 17.775f)
                lineTo(14.0f, 24.0f)
                lineTo(11.0f, 24.0f)
                lineTo(11.0f, 19.225f)
                lineTo(8.118f, 16.94f)
                arcToRelative(3.494f, 3.494f, 0.0f, false, true, -0.931f, -1.125f)
                arcTo(4.039f, 4.039f, 0.0f, false, true, 5.969f, 16.0f)
                arcTo(3.845f, 3.845f, 0.0f, false, true, 2.0f, 12.026f)
                curveTo(2.0f, 8.759f, 5.4f, 6.0f, 9.413f, 6.0f)
                horizontalLineToRelative(1.831f)
                arcToRelative(3.483f, 3.483f, 0.0f, false, true, 3.131f, 1.934f)
                lineTo(15.407f, 10.0f)
                lineTo(18.0f, 10.0f)
                lineTo(18.0f, 8.0f)
                close()
                moveTo(5.969f, 13.0f)
                arcToRelative(1.536f, 1.536f, 0.0f, false, false, 1.2f, -0.862f)
                lineToRelative(0.66f, -2.912f)
                curveTo(6.225f, 9.692f, 5.0f, 10.818f, 5.0f, 12.026f)
                arcTo(0.861f, 0.861f, 0.0f, false, false, 5.969f, 13.0f)
                close()
                moveTo(6.277f, 17.952f)
                lineTo(5.051f, 24.0f)
                lineTo(8.114f, 24.0f)
                lineTo(8.9f, 20.113f)
                lineTo(6.876f, 18.507f)
                arcTo(5.545f, 5.545f, 0.0f, false, true, 6.277f, 17.952f)
                close()
            }
        }
        .build()
        return _hiking!!
    }

private var _hiking: ImageVector? = null
