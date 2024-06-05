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

public val Icons.Outline.TreeAlt: ImageVector
    get() {
        if (_treeAlt != null) {
            return _treeAlt!!
        }
        _treeAlt = Builder(name = "TreeAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.735f, 21.0f)
                lineToRelative(-3.477f, -6.0f)
                horizontalLineToRelative(2.384f)
                lineToRelative(-3.958f, -6.0f)
                horizontalLineToRelative(2.154f)
                lineTo(14.108f, 0.992f)
                curveToRelative(-0.496f, -0.631f, -1.265f, -0.992f, -2.108f, -0.992f)
                reflectiveCurveToRelative(-1.611f, 0.361f, -2.108f, 0.991f)
                lineToRelative(-4.73f, 8.009f)
                horizontalLineToRelative(2.154f)
                lineToRelative(-3.958f, 6.0f)
                horizontalLineToRelative(2.44f)
                lineToRelative(-3.246f, 6.0f)
                horizontalLineToRelative(8.447f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(8.735f)
                close()
                moveTo(5.909f, 19.0f)
                lineToRelative(3.246f, -6.0f)
                horizontalLineToRelative(-2.082f)
                lineToRelative(3.958f, -6.0f)
                horizontalLineToRelative(-2.369f)
                lineToRelative(2.834f, -4.808f)
                curveToRelative(0.233f, -0.242f, 0.775f, -0.241f, 1.009f, 0.0f)
                lineToRelative(2.834f, 4.809f)
                horizontalLineToRelative(-2.369f)
                lineToRelative(3.958f, 6.0f)
                horizontalLineToRelative(-2.14f)
                lineToRelative(3.477f, 6.0f)
                horizontalLineToRelative(-5.265f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-5.091f)
                close()
            }
        }
        .build()
        return _treeAlt!!
    }

private var _treeAlt: ImageVector? = null
