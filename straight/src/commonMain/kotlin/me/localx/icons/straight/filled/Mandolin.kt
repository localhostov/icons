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

public val Icons.Filled.Mandolin: ImageVector
    get() {
        if (_mandolin != null) {
            return _mandolin!!
        }
        _mandolin = Builder(name = "Mandolin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.566f, 13.848f)
                lineToRelative(5.434f, -5.434f)
                verticalLineToRelative(7.086f)
                curveToRelative(0.0f, 4.687f, -3.813f, 8.5f, -8.5f, 8.5f)
                curveToRelative(-2.27f, 0.0f, -4.404f, -0.884f, -6.01f, -2.489f)
                curveToRelative(-1.605f, -1.605f, -2.49f, -3.74f, -2.49f, -6.011f)
                curveTo(0.0f, 10.813f, 3.813f, 7.0f, 8.5f, 7.0f)
                horizontalLineToRelative(7.086f)
                lineToRelative(-5.434f, 5.434f)
                curveToRelative(-0.494f, -0.268f, -1.052f, -0.434f, -1.652f, -0.434f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                curveToRelative(0.0f, -0.601f, -0.166f, -1.158f, -0.434f, -1.652f)
                close()
                moveTo(8.5f, 14.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, 0.673f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.673f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.673f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.673f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(24.001f, 3.181f)
                lineTo(20.819f, -0.001f)
                lineToRelative(-2.819f, 2.001f)
                lineToRelative(-0.323f, 2.909f)
                lineToRelative(-2.091f, 2.091f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(2.091f, -2.091f)
                lineToRelative(2.909f, -0.323f)
                lineToRelative(2.001f, -2.819f)
                close()
            }
        }
        .build()
        return _mandolin!!
    }

private var _mandolin: ImageVector? = null
