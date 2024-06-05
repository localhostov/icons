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

public val Icons.Bold.Custard: ImageVector
    get() {
        if (_custard != null) {
            return _custard!!
        }
        _custard = Builder(name = "Custard", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 17.0f)
                horizontalLineToRelative(-1.418f)
                lineToRelative(-2.167f, -12.282f)
                curveToRelative(-0.381f, -2.154f, -2.244f, -3.718f, -4.432f, -3.718f)
                horizontalLineToRelative(-7.966f)
                curveToRelative(-2.188f, 0.0f, -4.052f, 1.563f, -4.432f, 3.718f)
                lineToRelative(-2.167f, 12.282f)
                lineTo(0.0f, 17.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(1.094f)
                curveToRelative(0.243f, 1.694f, 1.704f, 3.0f, 3.464f, 3.0f)
                horizontalLineToRelative(15.0f)
                curveToRelative(1.76f, 0.0f, 3.221f, -1.306f, 3.464f, -3.0f)
                horizontalLineToRelative(0.978f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(8.017f, 4.0f)
                horizontalLineToRelative(7.966f)
                curveToRelative(0.729f, 0.0f, 1.351f, 0.521f, 1.477f, 1.239f)
                lineToRelative(0.134f, 0.761f)
                horizontalLineToRelative(-1.094f)
                curveToRelative(-0.743f, 0.0f, -1.433f, 0.233f, -2.0f, 0.63f)
                curveToRelative(-0.567f, -0.397f, -1.257f, -0.63f, -2.0f, -0.63f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.743f, 0.0f, -1.433f, 0.232f, -2.0f, 0.629f)
                curveToRelative(-0.567f, -0.396f, -1.257f, -0.629f, -2.0f, -0.629f)
                horizontalLineToRelative(-1.095f)
                lineToRelative(0.134f, -0.761f)
                curveToRelative(0.127f, -0.718f, 0.748f, -1.239f, 1.478f, -1.239f)
                close()
                moveTo(5.876f, 9.0f)
                horizontalLineToRelative(1.624f)
                curveToRelative(0.276f, 0.0f, 0.5f, 0.225f, 0.5f, 0.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0.0f, -0.275f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.276f, 0.0f, 0.5f, 0.225f, 0.5f, 0.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -0.275f, 0.225f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(1.624f)
                lineToRelative(1.412f, 8.0f)
                lineTo(4.464f, 17.0f)
                lineToRelative(1.412f, -8.0f)
                close()
            }
        }
        .build()
        return _custard!!
    }

private var _custard: ImageVector? = null
