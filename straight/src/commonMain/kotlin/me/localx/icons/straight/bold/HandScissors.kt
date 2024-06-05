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

public val Icons.Bold.HandScissors: ImageVector
    get() {
        if (_handScissors != null) {
            return _handScissors!!
        }
        _handScissors = Builder(name = "HandScissors", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.998f, 22.0f)
                horizontalLineToRelative(-13.169f)
                lineToRelative(-2.036f, -8.144f)
                lineToRelative(-7.057f, 1.125f)
                curveToRelative(-0.817f, 0.129f, -1.587f, -0.427f, -1.718f, -1.245f)
                curveToRelative(-0.13f, -0.818f, 0.427f, -1.587f, 1.245f, -1.718f)
                lineToRelative(9.772f, -1.558f)
                lineToRelative(2.135f, 8.54f)
                horizontalLineToRelative(7.831f)
                lineToRelative(-0.002f, -9.906f)
                lineToRelative(-3.62f, -3.746f)
                lineToRelative(-4.639f, -0.641f)
                lineToRelative(1.754f, -1.703f)
                curveToRelative(0.658f, -0.646f, 1.525f, -1.004f, 2.449f, -1.004f)
                curveToRelative(0.935f, 0.0f, 1.814f, 0.364f, 2.508f, 1.06f)
                lineToRelative(4.547f, 4.847f)
                lineToRelative(-0.002f, 14.094f)
                close()
                moveTo(1.417f, 8.205f)
                lineToRelative(14.583f, 2.016f)
                verticalLineToRelative(-3.029f)
                lineTo(1.828f, 5.234f)
                curveToRelative(-0.821f, -0.113f, -1.578f, 0.46f, -1.691f, 1.28f)
                curveToRelative(-0.113f, 0.821f, 0.46f, 1.578f, 1.28f, 1.691f)
                close()
            }
        }
        .build()
        return _handScissors!!
    }

private var _handScissors: ImageVector? = null
