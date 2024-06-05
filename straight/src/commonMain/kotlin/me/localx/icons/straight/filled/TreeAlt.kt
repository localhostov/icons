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

public val Icons.Filled.TreeAlt: ImageVector
    get() {
        if (_treeAlt != null) {
            return _treeAlt!!
        }
        _treeAlt = Builder(name = "TreeAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.0f, 21.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(16.915f, 9.0f)
                horizontalLineToRelative(2.104f)
                lineTo(14.339f, 0.992f)
                curveToRelative(-0.497f, -0.63f, -1.266f, -0.992f, -2.108f, -0.992f)
                reflectiveCurveToRelative(-1.61f, 0.361f, -2.107f, 0.991f)
                lineToRelative(-0.076f, 0.112f)
                lineToRelative(-4.654f, 7.897f)
                horizontalLineToRelative(2.154f)
                lineToRelative(-3.958f, 6.0f)
                horizontalLineToRelative(2.384f)
                lineToRelative(-3.478f, 6.0f)
                horizontalLineToRelative(8.505f)
                verticalLineToRelative(-12.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(8.964f)
                lineToRelative(-3.475f, -6.0f)
                horizontalLineToRelative(2.188f)
                lineToRelative(-3.763f, -6.0f)
                close()
            }
        }
        .build()
        return _treeAlt!!
    }

private var _treeAlt: ImageVector? = null
