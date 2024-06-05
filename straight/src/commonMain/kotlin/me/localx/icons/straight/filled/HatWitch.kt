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

public val Icons.Filled.HatWitch: ImageVector
    get() {
        if (_hatWitch != null) {
            return _hatWitch!!
        }
        _hatWitch = Builder(name = "HatWitch", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.0f, 20.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(24.0f, 22.0f)
                verticalLineToRelative(2.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.677f)
                lineTo(8.034f, 3.384f)
                curveToRelative(0.691f, -2.024f, 2.592f, -3.384f, 4.731f, -3.384f)
                horizontalLineToRelative(6.128f)
                lineToRelative(4.875f, 4.546f)
                lineToRelative(-1.355f, 1.453f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(-0.009f, 0.01f, -0.009f, 0.01f)
                lineToRelative(-0.01f, -0.009f)
                horizontalLineToRelative(-4.373f)
                lineToRelative(-0.803f, 1.155f)
                lineToRelative(5.103f, 14.845f)
                horizontalLineToRelative(1.677f)
                close()
                moveTo(16.0f, 16.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-6.0f)
                close()
            }
        }
        .build()
        return _hatWitch!!
    }

private var _hatWitch: ImageVector? = null
