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

public val Icons.Bold.GovernmentBudget: ImageVector
    get() {
        if (_governmentBudget != null) {
            return _governmentBudget!!
        }
        _governmentBudget = Builder(name = "GovernmentBudget", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.0f, 16.037f)
                verticalLineToRelative(-3.037f)
                horizontalLineToRelative(2.485f)
                curveToRelative(0.221f, -0.178f, 0.449f, -0.345f, 0.685f, -0.502f)
                curveToRelative(-0.186f, -0.474f, -0.301f, -0.979f, -0.301f, -1.51f)
                verticalLineToRelative(-0.988f)
                lineTo(4.595f, 10.0f)
                lineToRelative(6.426f, -3.487f)
                lineToRelative(4.537f, 2.475f)
                horizontalLineToRelative(5.738f)
                curveToRelative(-0.264f, -0.33f, -0.593f, -0.611f, -0.977f, -0.82f)
                lineToRelative(-7.773f, -4.24f)
                lineToRelative(2.454f, -1.636f)
                lineTo(9.5f, 0.0f)
                verticalLineToRelative(3.925f)
                lineTo(1.683f, 8.166f)
                curveTo(0.646f, 8.732f, 0.0f, 9.818f, 0.0f, 11.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.999f)
                verticalLineToRelative(8.0f)
                lineTo(0.0f, 21.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-0.01f)
                lineToRelative(2.542f, 0.004f)
                curveToRelative(-0.955f, -1.061f, -1.542f, -2.459f, -1.542f, -3.994f)
                curveToRelative(0.0f, -1.394f, 0.37f, -2.747f, 1.0f, -3.963f)
                close()
                moveTo(6.998f, 21.0f)
                horizontalLineToRelative(-1.998f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(8.0f)
                close()
                moveTo(18.894f, 13.318f)
                curveToRelative(0.63f, -0.644f, 1.236f, -1.482f, 1.236f, -2.33f)
                horizontalLineToRelative(-5.263f)
                curveToRelative(0.0f, 0.848f, 0.606f, 1.686f, 1.236f, 2.33f)
                curveToRelative(-2.773f, 0.758f, -5.104f, 3.646f, -5.104f, 6.682f)
                curveToRelative(0.0f, 2.199f, 1.794f, 3.988f, 4.0f, 3.988f)
                horizontalLineToRelative(5.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.789f, 4.0f, -3.988f)
                curveToRelative(0.0f, -3.036f, -2.331f, -5.924f, -5.104f, -6.682f)
                close()
                moveTo(19.998f, 20.988f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.443f, -1.0f, -0.988f)
                curveToRelative(0.0f, -1.886f, 1.799f, -3.88f, 3.5f, -3.88f)
                reflectiveCurveToRelative(3.5f, 1.994f, 3.5f, 3.88f)
                curveToRelative(0.0f, 0.545f, -0.448f, 0.988f, -1.0f, 0.988f)
                close()
            }
        }
        .build()
        return _governmentBudget!!
    }

private var _governmentBudget: ImageVector? = null
