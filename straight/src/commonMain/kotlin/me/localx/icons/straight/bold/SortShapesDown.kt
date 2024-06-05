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

public val Icons.Bold.SortShapesDown: ImageVector
    get() {
        if (_sortShapesDown != null) {
            return _sortShapesDown!!
        }
        _sortShapesDown = Builder(name = "SortShapesDown", defaultWidth = 512.0.dp, defaultHeight =
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
                moveTo(8.0f, 19.29f)
                lineTo(8.0f, 0.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(5.0f, 19.33f)
                lineToRelative(-2.45f, -2.4f)
                lineTo(0.45f, 19.07f)
                lineToRelative(4.28f, 4.2f)
                curveToRelative(0.49f, 0.49f, 1.13f, 0.73f, 1.77f, 0.73f)
                reflectiveCurveToRelative(1.28f, -0.24f, 1.77f, -0.73f)
                lineToRelative(4.25f, -4.25f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(-2.4f, 2.4f)
                close()
            }
        }
        .build()
        return _sortShapesDown!!
    }

private var _sortShapesDown: ImageVector? = null
