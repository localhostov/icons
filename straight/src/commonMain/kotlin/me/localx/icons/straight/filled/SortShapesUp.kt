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

public val Icons.Filled.SortShapesUp: ImageVector
    get() {
        if (_sortShapesUp != null) {
            return _sortShapesUp!!
        }
        _sortShapesUp = Builder(name = "SortShapesUp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.41f, 0.59f)
                lineToRelative(4.5f, 4.5f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-3.5f, -3.5f)
                lineTo(7.0f, 24.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(5.0f, 3.0f)
                lineTo(1.5f, 6.5f)
                lineTo(0.09f, 5.09f)
                lineTo(4.59f, 0.59f)
                curveToRelative(0.78f, -0.78f, 2.05f, -0.78f, 2.83f, 0.0f)
                close()
                moveTo(14.0f, 23.0f)
                horizontalLineToRelative(9.0f)
                lineTo(23.0f, 14.0f)
                lineTo(14.0f, 14.0f)
                verticalLineToRelative(9.0f)
                close()
                moveTo(18.52f, 0.98f)
                lineToRelative(-5.52f, 10.02f)
                horizontalLineToRelative(10.99f)
                lineTo(18.52f, 0.98f)
                close()
            }
        }
        .build()
        return _sortShapesUp!!
    }

private var _sortShapesUp: ImageVector? = null
