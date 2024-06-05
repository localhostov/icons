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

public val Icons.Bold.TreeAlt: ImageVector
    get() {
        if (_treeAlt != null) {
            return _treeAlt!!
        }
        _treeAlt = Builder(name = "TreeAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.603f, 22.0f)
                lineToRelative(-3.477f, -6.0f)
                horizontalLineToRelative(2.445f)
                lineToRelative(-3.958f, -6.0f)
                horizontalLineToRelative(2.101f)
                lineTo(14.501f, 1.183f)
                curveToRelative(-0.592f, -0.751f, -1.503f, -1.183f, -2.501f, -1.183f)
                reflectiveCurveToRelative(-1.91f, 0.432f, -2.501f, 1.183f)
                lineToRelative(-5.212f, 8.817f)
                horizontalLineToRelative(2.101f)
                lineToRelative(-3.958f, 6.0f)
                horizontalLineToRelative(2.445f)
                lineToRelative(-3.477f, 6.0f)
                horizontalLineToRelative(9.103f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(9.103f)
                close()
                moveTo(6.603f, 19.0f)
                lineToRelative(3.477f, -6.0f)
                horizontalLineToRelative(-2.078f)
                lineToRelative(3.958f, -6.0f)
                horizontalLineToRelative(-2.423f)
                lineToRelative(2.344f, -3.978f)
                curveToRelative(0.049f, -0.021f, 0.189f, -0.021f, 0.238f, 0.0f)
                lineToRelative(2.344f, 3.978f)
                horizontalLineToRelative(-2.423f)
                lineToRelative(3.958f, 6.0f)
                horizontalLineToRelative(-2.078f)
                lineToRelative(3.477f, 6.0f)
                horizontalLineToRelative(-3.897f)
                verticalLineToRelative(-2.737f)
                lineToRelative(-1.5f, -2.589f)
                lineToRelative(-1.5f, 2.589f)
                verticalLineToRelative(2.737f)
                horizontalLineToRelative(-3.897f)
                close()
            }
        }
        .build()
        return _treeAlt!!
    }

private var _treeAlt: ImageVector? = null
