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

public val Icons.Bold.TreeDeciduous: ImageVector
    get() {
        if (_treeDeciduous != null) {
            return _treeDeciduous!!
        }
        _treeDeciduous = Builder(name = "TreeDeciduous", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.831f, 4.582f)
                curveToRelative(-0.639f, -2.626f, -3.011f, -4.582f, -5.831f, -4.582f)
                reflectiveCurveTo(6.809f, 1.955f, 6.169f, 4.58f)
                curveTo(2.683f, 5.104f, 0.0f, 8.119f, 0.0f, 11.75f)
                curveToRelative(0.0f, 3.998f, 3.252f, 7.25f, 7.25f, 7.25f)
                horizontalLineToRelative(3.25f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(3.237f)
                curveToRelative(3.998f, 0.0f, 7.25f, -3.252f, 7.25f, -7.25f)
                curveToRelative(0.0f, -3.626f, -2.676f, -6.639f, -6.156f, -7.168f)
                close()
                moveTo(16.737f, 16.0f)
                horizontalLineToRelative(-3.237f)
                verticalLineToRelative(-0.379f)
                lineToRelative(3.561f, -3.561f)
                lineToRelative(-2.121f, -2.121f)
                lineToRelative(-1.439f, 1.439f)
                verticalLineToRelative(-2.379f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.379f)
                lineToRelative(-1.439f, -1.439f)
                lineToRelative(-2.121f, 2.121f)
                lineToRelative(3.561f, 3.561f)
                verticalLineToRelative(0.379f)
                horizontalLineToRelative(-3.25f)
                curveToRelative(-2.343f, 0.0f, -4.25f, -1.906f, -4.25f, -4.25f)
                reflectiveCurveToRelative(1.903f, -4.246f, 4.303f, -4.246f)
                horizontalLineToRelative(0.007f)
                lineToRelative(1.691f, 0.08f)
                verticalLineToRelative(-1.66f)
                curveToRelative(0.04f, -1.619f, 1.37f, -2.924f, 2.999f, -2.924f)
                reflectiveCurveToRelative(2.958f, 1.304f, 2.999f, 2.923f)
                verticalLineToRelative(1.646f)
                lineToRelative(1.744f, -0.068f)
                curveToRelative(2.341f, 0.003f, 4.244f, 1.908f, 4.244f, 4.25f)
                reflectiveCurveToRelative(-1.907f, 4.25f, -4.25f, 4.25f)
                close()
            }
        }
        .build()
        return _treeDeciduous!!
    }

private var _treeDeciduous: ImageVector? = null
