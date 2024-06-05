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

public val Icons.Bold.Angle: ImageVector
    get() {
        if (_angle != null) {
            return _angle!!
        }
        _angle = Builder(name = "Angle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.846f, 7.404f)
                lineToRelative(1.546f, -2.561f)
                curveToRelative(1.887f, 1.256f, 3.509f, 2.878f, 4.765f, 4.765f)
                lineToRelative(-2.65f, 1.439f)
                curveToRelative(-0.962f, -1.387f, -2.274f, -2.681f, -3.661f, -3.642f)
                close()
                moveTo(19.0f, 19.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.0f, -2.401f, -0.507f, -4.684f, -1.409f, -6.757f)
                lineToRelative(-2.648f, 1.437f)
                curveToRelative(0.677f, 1.642f, 1.056f, 3.436f, 1.056f, 5.32f)
                close()
                moveTo(3.006f, 21.036f)
                lineTo(13.671f, 1.453f)
                lineTo(11.037f, 0.018f)
                lineTo(0.371f, 19.601f)
                curveToRelative(-0.507f, 0.932f, -0.487f, 2.031f, 0.055f, 2.943f)
                curveToRelative(0.542f, 0.912f, 1.498f, 1.456f, 2.559f, 1.456f)
                horizontalLineToRelative(21.015f)
                verticalLineToRelative(-3.0f)
                lineToRelative(-20.994f, 0.036f)
                close()
            }
        }
        .build()
        return _angle!!
    }

private var _angle: ImageVector? = null
