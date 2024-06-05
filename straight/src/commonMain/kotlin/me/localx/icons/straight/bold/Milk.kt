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

public val Icons.Bold.Milk: ImageVector
    get() {
        if (_milk != null) {
            return _milk!!
        }
        _milk = Builder(name = "Milk", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.964f, 6.5f)
                horizontalLineToRelative(0.036f)
                lineTo(20.0f, 2.5f)
                curveToRelative(0.0f, -1.378f, -1.121f, -2.5f, -2.5f, -2.5f)
                lineTo(6.5f, 0.0f)
                curveToRelative(-1.379f, 0.0f, -2.5f, 1.122f, -2.5f, 2.5f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(0.036f)
                lineToRelative(-3.036f, 3.592f)
                verticalLineToRelative(10.408f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(15.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-10.408f)
                lineToRelative(-3.036f, -3.592f)
                close()
                moveTo(12.072f, 10.0f)
                horizontalLineToRelative(-7.067f)
                lineToRelative(1.69f, -2.0f)
                horizontalLineToRelative(7.1f)
                lineToRelative(-1.724f, 2.0f)
                close()
                moveTo(17.0f, 3.0f)
                verticalLineToRelative(2.0f)
                lineTo(7.0f, 5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(10.0f)
                close()
                moveTo(4.0f, 20.5f)
                verticalLineToRelative(-7.5f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(7.5f)
                curveToRelative(0.0f, 0.171f, 0.027f, 0.335f, 0.051f, 0.5f)
                horizontalLineToRelative(-7.551f)
                curveToRelative(-0.275f, 0.0f, -0.5f, -0.224f, -0.5f, -0.5f)
                close()
                moveTo(20.0f, 20.5f)
                curveToRelative(0.0f, 0.276f, -0.225f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.275f, 0.0f, -0.5f, -0.224f, -0.5f, -0.5f)
                verticalLineToRelative(-9.302f)
                lineToRelative(2.528f, -2.933f)
                lineToRelative(2.472f, 2.925f)
                verticalLineToRelative(9.31f)
                close()
            }
        }
        .build()
        return _milk!!
    }

private var _milk: ImageVector? = null
