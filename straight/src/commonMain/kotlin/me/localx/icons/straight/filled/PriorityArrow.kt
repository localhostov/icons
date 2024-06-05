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

public val Icons.Filled.PriorityArrow: ImageVector
    get() {
        if (_priorityArrow != null) {
            return _priorityArrow!!
        }
        _priorityArrow = Builder(name = "PriorityArrow", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.0f, 15.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(18.0f, 1.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(6.0f)
                lineTo(24.0f, 1.0f)
                horizontalLineToRelative(-6.0f)
                close()
                moveTo(18.0f, 23.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(16.295f, 3.372f)
                curveToRelative(0.347f, 0.347f, 0.347f, 0.91f, 0.0f, 1.257f)
                lineToRelative(-3.295f, 3.371f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-3.86f, 0.0f, -7.0f, 3.14f, -7.0f, 7.0f)
                reflectiveCurveToRelative(3.14f, 7.0f, 7.0f, 7.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-7.0f)
                curveTo(4.038f, 21.0f, 0.0f, 16.963f, 0.0f, 12.0f)
                reflectiveCurveTo(4.038f, 3.0f, 9.0f, 3.0f)
                horizontalLineToRelative(4.0f)
                lineTo(13.0f, 0.0f)
                lineToRelative(3.295f, 3.372f)
                close()
            }
        }
        .build()
        return _priorityArrow!!
    }

private var _priorityArrow: ImageVector? = null
