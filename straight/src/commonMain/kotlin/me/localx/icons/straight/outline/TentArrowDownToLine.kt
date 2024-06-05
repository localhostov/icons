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

public val Icons.Outline.TentArrowDownToLine: ImageVector
    get() {
        if (_tentArrowDownToLine != null) {
            return _tentArrowDownToLine!!
        }
        _tentArrowDownToLine = Builder(name = "TentArrowDownToLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.592f, 20.125f)
                lineTo(13.982f, 6.764f)
                lineTo(3.475f, 22.0f)
                lineTo(0.0f, 22.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(21.433f)
                curveToRelative(0.935f, 0.0f, 1.795f, -0.499f, 2.246f, -1.302f)
                curveToRelative(0.445f, -0.793f, 0.43f, -1.731f, -0.087f, -2.573f)
                close()
                moveTo(12.557f, 22.0f)
                lineToRelative(1.443f, -2.186f)
                lineToRelative(1.443f, 2.186f)
                horizontalLineToRelative(-2.887f)
                close()
                moveTo(21.936f, 21.718f)
                curveToRelative(-0.048f, 0.085f, -0.192f, 0.282f, -0.503f, 0.282f)
                horizontalLineToRelative(-3.592f)
                lineToRelative(-3.841f, -5.814f)
                lineToRelative(-3.841f, 5.814f)
                horizontalLineToRelative(-4.255f)
                lineToRelative(8.113f, -11.764f)
                lineToRelative(7.908f, 10.992f)
                curveToRelative(0.129f, 0.212f, 0.062f, 0.397f, 0.01f, 0.489f)
                close()
                moveTo(3.594f, 8.418f)
                lineTo(0.295f, 5.119f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(2.291f, 2.291f)
                lineTo(4.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.007f)
                lineToRelative(2.291f, -2.302f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-3.299f, 3.299f)
                curveToRelative(-0.388f, 0.388f, -0.897f, 0.581f, -1.406f, 0.581f)
                reflectiveCurveToRelative(-1.019f, -0.193f, -1.406f, -0.581f)
                close()
            }
        }
        .build()
        return _tentArrowDownToLine!!
    }

private var _tentArrowDownToLine: ImageVector? = null
