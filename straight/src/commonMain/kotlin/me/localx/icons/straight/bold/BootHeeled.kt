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

public val Icons.Bold.BootHeeled: ImageVector
    get() {
        if (_bootHeeled != null) {
            return _bootHeeled!!
        }
        _bootHeeled = Builder(name = "BootHeeled", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.407f, 14.776f)
                lineToRelative(-6.13f, -3.065f)
                curveToRelative(-0.171f, -0.085f, -0.277f, -0.257f, -0.277f, -0.447f)
                lineTo(14.0f, 3.5f)
                curveToRelative(0.0f, -1.094f, -0.452f, -2.059f, -1.272f, -2.717f)
                curveToRelative(-0.837f, -0.671f, -1.96f, -0.935f, -2.999f, -0.703f)
                lineTo(0.0f, 2.19f)
                verticalLineToRelative(21.81f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-2.323f)
                lineToRelative(3.484f, 1.742f)
                curveToRelative(0.76f, 0.38f, 1.61f, 0.581f, 2.46f, 0.581f)
                horizontalLineToRelative(9.056f)
                verticalLineToRelative(-3.41f)
                curveToRelative(0.0f, -2.479f, -1.377f, -4.706f, -3.593f, -5.814f)
                close()
                moveTo(21.0f, 21.0f)
                horizontalLineToRelative(-6.056f)
                curveToRelative(-0.386f, 0.0f, -0.773f, -0.091f, -1.118f, -0.264f)
                lineToRelative(-4.311f, -2.155f)
                curveToRelative(-0.76f, -0.38f, -1.61f, -0.581f, -2.46f, -0.581f)
                lineTo(3.0f, 18.0f)
                lineTo(3.0f, 4.609f)
                lineToRelative(2.0f, -0.434f)
                verticalLineToRelative(7.824f)
                horizontalLineToRelative(3.0f)
                lineTo(8.0f, 3.525f)
                lineToRelative(2.373f, -0.515f)
                curveToRelative(0.152f, -0.034f, 0.354f, 0.014f, 0.479f, 0.113f)
                curveToRelative(0.069f, 0.056f, 0.149f, 0.149f, 0.149f, 0.377f)
                verticalLineToRelative(7.764f)
                curveToRelative(0.0f, 1.333f, 0.741f, 2.533f, 1.935f, 3.13f)
                lineToRelative(6.131f, 3.065f)
                curveToRelative(1.193f, 0.596f, 1.935f, 1.796f, 1.935f, 3.13f)
                verticalLineToRelative(0.41f)
                close()
            }
        }
        .build()
        return _bootHeeled!!
    }

private var _bootHeeled: ImageVector? = null
