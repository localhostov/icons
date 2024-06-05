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

public val Icons.Filled.CircleOverlap: ImageVector
    get() {
        if (_circleOverlap != null) {
            return _circleOverlap!!
        }
        _circleOverlap = Builder(name = "CircleOverlap", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.0f, 15.5f)
                curveToRelative(0.0f, 0.47f, 0.048f, 0.928f, 0.122f, 1.378f)
                curveTo(3.09f, 16.216f, 0.0f, 12.717f, 0.0f, 8.5f)
                curveTo(0.0f, 3.813f, 3.813f, 0.0f, 8.5f, 0.0f)
                curveToRelative(4.217f, 0.0f, 7.716f, 3.09f, 8.378f, 7.122f)
                curveToRelative(-0.45f, -0.074f, -0.908f, -0.122f, -1.378f, -0.122f)
                curveToRelative(-4.687f, 0.0f, -8.5f, 3.813f, -8.5f, 8.5f)
                close()
                moveTo(16.878f, 7.122f)
                curveToRelative(0.074f, 0.45f, 0.122f, 0.908f, 0.122f, 1.378f)
                curveToRelative(0.0f, 4.687f, -3.813f, 8.5f, -8.5f, 8.5f)
                curveToRelative(-0.47f, 0.0f, -0.928f, -0.048f, -1.378f, -0.122f)
                curveToRelative(0.662f, 4.032f, 4.161f, 7.122f, 8.378f, 7.122f)
                curveToRelative(4.687f, 0.0f, 8.5f, -3.813f, 8.5f, -8.5f)
                curveToRelative(0.0f, -4.217f, -3.09f, -7.716f, -7.122f, -8.378f)
                close()
            }
        }
        .build()
        return _circleOverlap!!
    }

private var _circleOverlap: ImageVector? = null
