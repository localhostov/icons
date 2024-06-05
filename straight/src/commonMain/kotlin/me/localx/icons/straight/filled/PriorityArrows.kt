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

public val Icons.Filled.PriorityArrows: ImageVector
    get() {
        if (_priorityArrows != null) {
            return _priorityArrows!!
        }
        _priorityArrows = Builder(name = "PriorityArrows", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 0.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                verticalLineToRelative(21.0f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(7.0f, 18.0f)
                verticalLineToRelative(-9.0f)
                lineToRelative(-2.293f, 2.293f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(3.293f, -3.293f)
                curveToRelative(0.779f, -0.78f, 2.049f, -0.78f, 2.828f, 0.0f)
                lineToRelative(3.293f, 3.293f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-2.293f, -2.293f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(17.414f, 17.414f)
                curveToRelative(-0.39f, 0.39f, -0.902f, 0.585f, -1.414f, 0.585f)
                reflectiveCurveToRelative(-1.024f, -0.195f, -1.414f, -0.585f)
                lineToRelative(-3.293f, -3.293f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(2.293f, 2.293f)
                lineTo(15.0f, 6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(9.0f)
                lineToRelative(2.293f, -2.293f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-3.293f, 3.293f)
                close()
            }
        }
        .build()
        return _priorityArrows!!
    }

private var _priorityArrows: ImageVector? = null
