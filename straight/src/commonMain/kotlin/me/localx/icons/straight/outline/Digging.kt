package me.localx.icons.straight.outline

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

public val Icons.Outline.Digging: ImageVector
    get() {
        if (_digging != null) {
            return _digging!!
        }
        _digging = Builder(name = "Digging", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.047f, 24.0f)
                lineToRelative(-4.957f, -11.015f)
                lineToRelative(-3.474f, 4.962f)
                lineToRelative(-9.106f, -6.231f)
                lineToRelative(1.096f, -3.054f)
                curveToRelative(0.096f, -0.269f, 0.304f, -0.483f, 0.569f, -0.59f)
                curveToRelative(0.116f, -0.05f, 0.405f, -0.121f, 0.816f, 0.032f)
                lineToRelative(0.47f, 0.177f)
                curveToRelative(0.687f, 0.342f, 1.211f, 0.929f, 1.474f, 1.652f)
                lineToRelative(1.424f, 4.143f)
                lineToRelative(1.881f, -0.684f)
                lineToRelative(-1.425f, -4.143f)
                curveToRelative(-0.438f, -1.207f, -1.312f, -2.187f, -2.461f, -2.759f)
                lineToRelative(-0.47f, -0.177f)
                curveToRelative(-0.767f, -0.382f, -1.661f, -0.418f, -2.456f, -0.098f)
                curveToRelative(-0.795f, 0.319f, -1.416f, 0.965f, -1.705f, 1.771f)
                lineToRelative(-0.919f, 2.561f)
                lineToRelative(-2.739f, -1.874f)
                lineToRelative(-1.129f, 1.65f)
                lineToRelative(13.534f, 9.26f)
                lineToRelative(-3.091f, 4.415f)
                horizontalLineToRelative(12.668f)
                close()
                moveTo(20.953f, 22.0f)
                horizontalLineToRelative(-5.732f)
                lineToRelative(3.49f, -4.985f)
                lineToRelative(2.242f, 4.985f)
                close()
                moveTo(9.0f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(3.251f, 14.939f)
                lineToRelative(1.729f, 1.183f)
                lineToRelative(-2.827f, 7.878f)
                lineTo(0.0f, 24.0f)
                lineToRelative(3.251f, -9.061f)
                close()
                moveTo(8.0f, 18.188f)
                lineToRelative(2.0f, 1.368f)
                verticalLineToRelative(4.443f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-5.812f)
                close()
            }
        }
        .build()
        return _digging!!
    }

private var _digging: ImageVector? = null
