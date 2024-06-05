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

public val Icons.Outline.ArrowDownFromArc: ImageVector
    get() {
        if (_arrowDownFromArc != null) {
            return _arrowDownFromArc!!
        }
        _arrowDownFromArc = Builder(name = "ArrowDownFromArc", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.796f, 16.29f)
                lineToRelative(1.408f, 1.42f)
                lineToRelative(-5.721f, 5.677f)
                curveToRelative(-0.408f, 0.408f, -0.945f, 0.612f, -1.482f, 0.612f)
                reflectiveCurveToRelative(-1.077f, -0.205f, -1.487f, -0.615f)
                lineToRelative(-5.718f, -5.674f)
                lineToRelative(1.408f, -1.42f)
                lineToRelative(4.796f, 4.759f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(14.049f)
                lineToRelative(4.796f, -4.759f)
                close()
                moveTo(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                horizontalLineToRelative(2.0f)
                curveTo(2.0f, 6.486f, 6.486f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.486f, 10.0f, 10.0f)
                horizontalLineToRelative(2.0f)
                curveTo(24.0f, 5.383f, 18.617f, 0.0f, 12.0f, 0.0f)
                close()
            }
        }
        .build()
        return _arrowDownFromArc!!
    }

private var _arrowDownFromArc: ImageVector? = null
