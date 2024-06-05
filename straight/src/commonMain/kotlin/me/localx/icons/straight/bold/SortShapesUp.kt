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

public val Icons.Bold.SortShapesUp: ImageVector
    get() {
        if (_sortShapesUp != null) {
            return _sortShapesUp!!
        }
        _sortShapesUp = Builder(name = "SortShapesUp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 10.0f)
                lineTo(14.0f, 10.0f)
                lineTo(14.0f, 1.0f)
                horizontalLineToRelative(9.0f)
                lineTo(23.0f, 10.0f)
                close()
                moveTo(18.5f, 13.7f)
                lineToRelative(-5.0f, 9.3f)
                horizontalLineToRelative(10.0f)
                lineToRelative(-5.0f, -9.3f)
                close()
                moveTo(4.74f, 0.72f)
                lineTo(0.45f, 4.93f)
                lineToRelative(2.1f, 2.14f)
                lineToRelative(2.45f, -2.4f)
                lineTo(5.0f, 24.0f)
                horizontalLineToRelative(3.0f)
                lineTo(8.0f, 4.71f)
                lineToRelative(2.4f, 2.4f)
                lineToRelative(2.12f, -2.12f)
                lineTo(8.27f, 0.73f)
                curveToRelative(-0.97f, -0.98f, -2.56f, -0.97f, -3.52f, -0.01f)
                close()
            }
        }
        .build()
        return _sortShapesUp!!
    }

private var _sortShapesUp: ImageVector? = null
