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

public val Icons.Filled.Feedback: ImageVector
    get() {
        if (_feedback != null) {
            return _feedback!!
        }
        _feedback = Builder(name = "Feedback", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 3.0f)
                lineTo(3.0f, 3.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(6.923f)
                lineToRelative(3.749f, 3.157f)
                curveToRelative(0.382f, 0.339f, 0.861f, 0.507f, 1.337f, 0.507f)
                curveToRelative(0.468f, 0.0f, 0.931f, -0.163f, 1.292f, -0.484f)
                lineToRelative(3.848f, -3.18f)
                horizontalLineToRelative(6.852f)
                lineTo(24.001f, 6.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(7.667f, 10.509f)
                lineToRelative(-1.832f, 1.061f)
                lineToRelative(0.737f, 2.239f)
                lineToRelative(-0.421f, 0.291f)
                lineToRelative(-1.811f, -1.401f)
                lineToRelative(-1.82f, 1.407f)
                lineToRelative(-0.4f, -0.302f)
                lineToRelative(0.724f, -2.265f)
                lineToRelative(-1.844f, -1.026f)
                verticalLineToRelative(-0.513f)
                horizontalLineToRelative(2.416f)
                lineToRelative(0.654f, -2.501f)
                horizontalLineToRelative(0.54f)
                lineToRelative(0.653f, 2.501f)
                horizontalLineToRelative(2.403f)
                verticalLineToRelative(0.509f)
                close()
                moveTo(15.334f, 10.509f)
                lineToRelative(-1.832f, 1.061f)
                lineToRelative(0.737f, 2.239f)
                lineToRelative(-0.421f, 0.291f)
                lineToRelative(-1.811f, -1.401f)
                lineToRelative(-1.82f, 1.407f)
                lineToRelative(-0.4f, -0.302f)
                lineToRelative(0.724f, -2.265f)
                lineToRelative(-1.844f, -1.026f)
                verticalLineToRelative(-0.513f)
                horizontalLineToRelative(2.416f)
                lineToRelative(0.654f, -2.501f)
                horizontalLineToRelative(0.54f)
                lineToRelative(0.653f, 2.501f)
                horizontalLineToRelative(2.403f)
                verticalLineToRelative(0.509f)
                close()
                moveTo(23.001f, 10.509f)
                lineToRelative(-1.832f, 1.061f)
                lineToRelative(0.737f, 2.239f)
                lineToRelative(-0.421f, 0.291f)
                lineToRelative(-1.811f, -1.401f)
                lineToRelative(-1.82f, 1.407f)
                lineToRelative(-0.4f, -0.302f)
                lineToRelative(0.724f, -2.265f)
                lineToRelative(-1.844f, -1.026f)
                verticalLineToRelative(-0.513f)
                horizontalLineToRelative(2.416f)
                lineToRelative(0.654f, -2.501f)
                horizontalLineToRelative(0.54f)
                lineToRelative(0.653f, 2.501f)
                horizontalLineToRelative(2.403f)
                verticalLineToRelative(0.509f)
                close()
            }
        }
        .build()
        return _feedback!!
    }

private var _feedback: ImageVector? = null
