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

public val Icons.Bold.Rabbit: ImageVector
    get() {
        if (_rabbit != null) {
            return _rabbit!!
        }
        _rabbit = Builder(name = "Rabbit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 12.387f)
                curveToRelative(1.735f, -0.683f, 3.0f, -1.952f, 3.0f, -3.887f)
                curveToRelative(0.0f, -2.589f, -2.416f, -6.32f, -6.225f, -6.493f)
                curveToRelative(-1.152f, -0.393f, -6.218f, -2.007f, -11.775f, -2.007f)
                verticalLineToRelative(3.0f)
                curveToRelative(2.281f, 0.0f, 4.503f, 0.308f, 6.345f, 0.677f)
                curveToRelative(-1.568f, 0.689f, -3.45f, 1.323f, -6.345f, 1.323f)
                verticalLineToRelative(3.0f)
                curveToRelative(2.538f, 0.0f, 4.474f, -0.435f, 6.02f, -0.972f)
                curveToRelative(-0.013f, 0.156f, -0.02f, 0.313f, -0.02f, 0.472f)
                curveToRelative(0.0f, 0.486f, 0.064f, 0.958f, 0.183f, 1.407f)
                curveToRelative(-6.689f, 2.001f, -9.097f, 7.513f, -9.582f, 11.185f)
                curveToRelative(-0.19f, -0.06f, -0.392f, -0.092f, -0.601f, -0.092f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.895f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-8.613f)
                close()
                moveTo(21.0f, 8.5f)
                curveToRelative(0.0f, 1.034f, -2.047f, 1.5f, -3.5f, 1.5f)
                curveToRelative(-1.378f, 0.0f, -2.5f, -1.121f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.122f, -2.5f, 2.5f, -2.5f)
                curveToRelative(2.137f, 0.0f, 3.5f, 2.298f, 3.5f, 3.5f)
                close()
                moveTo(10.0f, 15.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                horizontalLineToRelative(-7.468f)
                curveToRelative(0.161f, -1.797f, 1.228f, -7.762f, 8.279f, -9.424f)
                curveToRelative(0.976f, 0.884f, 2.271f, 1.424f, 3.689f, 1.424f)
                curveToRelative(0.167f, 0.0f, 0.334f, -0.004f, 0.5f, -0.011f)
                verticalLineToRelative(8.011f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -3.309f, -2.691f, -6.0f, -6.0f, -6.0f)
                close()
            }
        }
        .build()
        return _rabbit!!
    }

private var _rabbit: ImageVector? = null
