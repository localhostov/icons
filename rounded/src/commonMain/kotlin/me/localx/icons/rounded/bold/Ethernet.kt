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

public val Icons.Bold.Ethernet: ImageVector
    get() {
        if (_ethernet != null) {
            return _ethernet!!
        }
        _ethernet = Builder(name = "Ethernet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.969f, 7.031f)
                curveToRelative(-0.209f, -1.556f, -1.444f, -2.791f, -3.0f, -3.0f)
                curveToRelative(-0.229f, -1.709f, -1.697f, -3.031f, -3.469f, -3.031f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-1.771f, 0.0f, -3.239f, 1.322f, -3.469f, 3.031f)
                curveToRelative(-1.556f, 0.209f, -2.791f, 1.444f, -3.0f, 3.0f)
                curveToRelative(-1.709f, 0.23f, -3.031f, 1.698f, -3.031f, 3.469f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 3.033f, 2.467f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(3.032f, 0.0f, 5.5f, -2.467f, 5.5f, -5.5f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -1.771f, -1.322f, -3.239f, -3.031f, -3.469f)
                close()
                moveTo(21.0f, 17.5f)
                curveToRelative(0.0f, 1.207f, -0.86f, 2.217f, -2.0f, 2.449f)
                verticalLineToRelative(-2.449f)
                curveToRelative(0.0f, -0.829f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.671f, -1.5f, 1.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -0.829f, -0.671f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.671f, -1.5f, 1.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -0.829f, -0.671f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.671f, -1.5f, 1.5f)
                verticalLineToRelative(2.449f)
                curveToRelative(-1.14f, -0.232f, -2.0f, -1.242f, -2.0f, -2.449f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.829f, 0.672f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.829f, 0.672f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                verticalLineToRelative(7.0f)
                close()
            }
        }
        .build()
        return _ethernet!!
    }

private var _ethernet: ImageVector? = null
