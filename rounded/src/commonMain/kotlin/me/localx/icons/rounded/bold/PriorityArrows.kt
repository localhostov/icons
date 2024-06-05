package me.localx.icons.rounded.bold

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

public val Icons.Bold.PriorityArrows: ImageVector
    get() {
        if (_priorityArrows != null) {
            return _priorityArrows!!
        }
        _priorityArrows = Builder(name = "PriorityArrows", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.5f, 0.0f)
                lineTo(5.5f, 0.0f)
                curveTo(2.468f, 0.0f, 0.0f, 2.467f, 0.0f, 5.5f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 3.033f, 2.468f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(3.032f, 0.0f, 5.5f, -2.467f, 5.5f, -5.5f)
                lineTo(24.0f, 5.5f)
                curveToRelative(0.0f, -3.033f, -2.468f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(21.0f, 18.5f)
                curveToRelative(0.0f, 1.378f, -1.121f, 2.5f, -2.5f, 2.5f)
                lineTo(5.5f, 21.0f)
                curveToRelative(-1.379f, 0.0f, -2.5f, -1.122f, -2.5f, -2.5f)
                lineTo(3.0f, 5.5f)
                curveToRelative(0.0f, -1.378f, 1.121f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, 1.122f, 2.5f, 2.5f)
                verticalLineToRelative(13.0f)
                close()
                moveTo(10.0f, 10.999f)
                verticalLineToRelative(5.501f)
                curveToRelative(0.0f, 0.829f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.671f, -1.5f, -1.5f)
                verticalLineToRelative(-5.501f)
                horizontalLineToRelative(-1.538f)
                curveToRelative(-0.856f, 0.0f, -1.284f, -1.034f, -0.679f, -1.639f)
                lineToRelative(3.038f, -3.038f)
                curveToRelative(0.375f, -0.375f, 0.983f, -0.375f, 1.358f, 0.0f)
                lineToRelative(3.038f, 3.038f)
                curveToRelative(0.605f, 0.605f, 0.177f, 1.639f, -0.679f, 1.639f)
                horizontalLineToRelative(-1.538f)
                close()
                moveTo(19.217f, 14.64f)
                lineToRelative(-3.038f, 3.038f)
                curveToRelative(-0.375f, 0.375f, -0.983f, 0.375f, -1.358f, 0.0f)
                lineToRelative(-3.038f, -3.038f)
                curveToRelative(-0.605f, -0.605f, -0.177f, -1.639f, 0.679f, -1.639f)
                horizontalLineToRelative(1.538f)
                verticalLineToRelative(-5.501f)
                curveToRelative(0.0f, -0.829f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.671f, 1.5f, 1.5f)
                verticalLineToRelative(5.501f)
                horizontalLineToRelative(1.538f)
                curveToRelative(0.856f, 0.0f, 1.284f, 1.034f, 0.679f, 1.639f)
                close()
            }
        }
        .build()
        return _priorityArrows!!
    }

private var _priorityArrows: ImageVector? = null
