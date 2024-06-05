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

public val Icons.Filled.BadgeLeaf: ImageVector
    get() {
        if (_badgeLeaf != null) {
            return _badgeLeaf!!
        }
        _badgeLeaf = Builder(name = "BadgeLeaf", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.0f, 12.0f)
                curveToRelative(0.0f, 1.302f, -0.839f, 2.402f, -2.0f, 2.816f)
                verticalLineToRelative(-3.816f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.816f)
                curveToRelative(-1.161f, -0.414f, -2.0f, -1.514f, -2.0f, -2.816f)
                curveToRelative(0.0f, -1.708f, 1.819f, -3.67f, 3.0f, -4.708f)
                curveToRelative(1.181f, 1.038f, 3.0f, 3.0f, 3.0f, 4.708f)
                close()
                moveTo(22.08f, 16.175f)
                curveToRelative(0.122f, 1.592f, -0.451f, 3.167f, -1.595f, 4.31f)
                curveToRelative(-1.144f, 1.143f, -2.711f, 1.718f, -4.31f, 1.595f)
                curveToRelative(-1.039f, 1.212f, -2.558f, 1.92f, -4.175f, 1.92f)
                reflectiveCurveToRelative(-3.136f, -0.708f, -4.175f, -1.92f)
                curveToRelative(-1.595f, 0.12f, -3.166f, -0.452f, -4.31f, -1.595f)
                curveToRelative(-1.144f, -1.144f, -1.717f, -2.718f, -1.595f, -4.31f)
                curveToRelative(-1.212f, -1.039f, -1.92f, -2.558f, -1.92f, -4.175f)
                reflectiveCurveToRelative(0.708f, -3.136f, 1.92f, -4.175f)
                curveToRelative(-0.122f, -1.592f, 0.451f, -3.167f, 1.595f, -4.31f)
                curveToRelative(1.144f, -1.143f, 2.717f, -1.717f, 4.31f, -1.595f)
                curveToRelative(1.039f, -1.212f, 2.558f, -1.92f, 4.175f, -1.92f)
                reflectiveCurveToRelative(3.136f, 0.708f, 4.175f, 1.92f)
                curveToRelative(1.595f, -0.121f, 3.167f, 0.452f, 4.31f, 1.595f)
                curveToRelative(1.144f, 1.144f, 1.717f, 2.718f, 1.595f, 4.31f)
                curveToRelative(1.212f, 1.039f, 1.92f, 2.558f, 1.92f, 4.175f)
                reflectiveCurveToRelative(-0.708f, 3.136f, -1.92f, 4.175f)
                close()
                moveTo(17.0f, 12.0f)
                curveToRelative(0.0f, -3.402f, -3.95f, -6.462f, -4.4f, -6.8f)
                lineToRelative(-0.6f, -0.45f)
                lineToRelative(-0.6f, 0.45f)
                curveToRelative(-0.45f, 0.337f, -4.4f, 3.398f, -4.4f, 6.8f)
                curveToRelative(0.0f, 2.414f, 1.721f, 4.434f, 4.0f, 4.899f)
                verticalLineToRelative(2.101f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.101f)
                curveToRelative(2.279f, -0.465f, 4.0f, -2.484f, 4.0f, -4.899f)
                close()
            }
        }
        .build()
        return _badgeLeaf!!
    }

private var _badgeLeaf: ImageVector? = null
