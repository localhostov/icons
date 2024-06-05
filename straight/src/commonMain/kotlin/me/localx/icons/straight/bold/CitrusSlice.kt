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

public val Icons.Bold.CitrusSlice: ImageVector
    get() {
        if (_citrusSlice != null) {
            return _citrusSlice!!
        }
        _citrusSlice = Builder(name = "CitrusSlice", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.077f, 1.14f)
                lineToRelative(-1.061f, -1.061f)
                lineTo(0.079f, 19.017f)
                lineToRelative(1.061f, 1.061f)
                curveToRelative(2.529f, 2.529f, 5.892f, 3.922f, 9.469f, 3.922f)
                reflectiveCurveToRelative(6.939f, -1.393f, 9.469f, -3.922f)
                reflectiveCurveToRelative(3.923f, -5.893f, 3.923f, -9.469f)
                reflectiveCurveToRelative(-1.394f, -6.94f, -3.923f, -9.469f)
                close()
                moveTo(12.0f, 14.122f)
                lineToRelative(4.82f, 4.82f)
                curveToRelative(-1.415f, 1.06f, -3.066f, 1.733f, -4.82f, 1.966f)
                verticalLineToRelative(-6.786f)
                close()
                moveTo(14.121f, 12.001f)
                horizontalLineToRelative(6.786f)
                curveToRelative(-0.233f, 1.754f, -0.907f, 3.405f, -1.967f, 4.82f)
                lineToRelative(-4.82f, -4.82f)
                close()
                moveTo(20.877f, 9.001f)
                horizontalLineToRelative(-6.538f)
                lineToRelative(4.603f, -4.603f)
                curveToRelative(1.016f, 1.357f, 1.677f, 2.93f, 1.935f, 4.603f)
                close()
                moveTo(9.0f, 14.339f)
                verticalLineToRelative(6.538f)
                curveToRelative(-1.673f, -0.258f, -3.246f, -0.919f, -4.603f, -1.935f)
                lineToRelative(4.603f, -4.603f)
                close()
            }
        }
        .build()
        return _citrusSlice!!
    }

private var _citrusSlice: ImageVector? = null
