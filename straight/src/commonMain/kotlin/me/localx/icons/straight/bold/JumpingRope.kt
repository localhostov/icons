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

public val Icons.Bold.JumpingRope: ImageVector
    get() {
        if (_jumpingRope != null) {
            return _jumpingRope!!
        }
        _jumpingRope = Builder(name = "JumpingRope", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.657f, 15.392f)
                lineToRelative(4.0f, 4.0f)
                lineToRelative(-2.121f, 2.121f)
                lineToRelative(-0.94f, -0.94f)
                lineToRelative(-3.536f, 3.536f)
                lineToRelative(-2.121f, -2.121f)
                lineToRelative(3.536f, -3.536f)
                lineToRelative(-0.939f, -0.939f)
                lineToRelative(2.121f, -2.121f)
                close()
                moveTo(17.25f, 0.0f)
                curveTo(11.152f, 0.0f, 6.0f, 4.579f, 6.0f, 10.0f)
                curveToRelative(0.0f, 3.309f, 2.691f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.691f, 6.0f, -6.0f)
                curveToRelative(0.0f, -1.788f, -0.57f, -3.48f, -1.54f, -4.951f)
                curveToRelative(-1.081f, 0.12f, -2.091f, 0.481f, -2.945f, 1.009f)
                curveToRelative(0.93f, 1.132f, 1.484f, 2.493f, 1.484f, 3.942f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.346f, -3.0f, -3.0f)
                curveToRelative(0.0f, -3.794f, 3.778f, -7.0f, 8.25f, -7.0f)
                curveToRelative(2.348f, 0.0f, 3.75f, 1.683f, 3.75f, 4.5f)
                curveToRelative(0.0f, 2.574f, -0.577f, 4.5f, -1.529f, 7.0f)
                lineToRelative(2.25f, 2.25f)
                curveToRelative(1.471f, -3.212f, 2.279f, -5.962f, 2.279f, -9.25f)
                curveToRelative(0.0f, -5.181f, -3.391f, -7.5f, -6.75f, -7.5f)
                close()
                moveTo(8.464f, 17.513f)
                lineToRelative(-2.121f, -2.121f)
                lineToRelative(-4.0f, 4.0f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(0.94f, -0.94f)
                lineToRelative(3.536f, 3.536f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(-3.536f, -3.536f)
                lineToRelative(0.939f, -0.939f)
                close()
                moveTo(3.0f, 7.5f)
                curveToRelative(0.0f, -2.742f, 1.336f, -4.396f, 3.571f, -4.483f)
                curveToRelative(0.828f, -1.025f, 1.827f, -1.93f, 2.958f, -2.681f)
                curveToRelative(-0.894f, -0.211f, -1.823f, -0.335f, -2.779f, -0.335f)
                curveTo(3.391f, 0.0f, 0.0f, 2.319f, 0.0f, 7.5f)
                curveToRelative(0.0f, 3.289f, 0.808f, 6.038f, 2.279f, 9.25f)
                lineToRelative(2.25f, -2.25f)
                curveToRelative(-0.952f, -2.5f, -1.529f, -4.426f, -1.529f, -7.0f)
                close()
            }
        }
        .build()
        return _jumpingRope!!
    }

private var _jumpingRope: ImageVector? = null
