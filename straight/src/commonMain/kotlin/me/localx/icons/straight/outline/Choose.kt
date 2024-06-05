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

public val Icons.Outline.Choose: ImageVector
    get() {
        if (_choose != null) {
            return _choose!!
        }
        _choose = Builder(name = "Choose", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.0f, 0.0f)
                lineTo(0.0f, 0.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(8.0f)
                lineTo(8.0f, 0.0f)
                close()
                moveTo(6.0f, 6.0f)
                lineTo(2.0f, 6.0f)
                lineTo(2.0f, 2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(8.0f, 10.0f)
                lineTo(0.0f, 10.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-8.0f)
                close()
                moveTo(6.0f, 16.0f)
                lineTo(2.0f, 16.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(18.0f, 0.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(8.0f)
                lineTo(18.0f, 0.0f)
                close()
                moveTo(16.0f, 6.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(12.0f, 2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(15.0f, 5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(24.0f, 19.769f)
                verticalLineToRelative(4.231f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.845f)
                lineToRelative(-7.0f, -2.616f)
                verticalLineToRelative(-6.432f)
                curveToRelative(0.0f, -0.538f, -0.362f, -1.018f, -0.825f, -1.093f)
                curveToRelative(-0.304f, -0.052f, -0.595f, 0.029f, -0.822f, 0.223f)
                curveToRelative(-0.224f, 0.19f, -0.353f, 0.469f, -0.353f, 0.763f)
                verticalLineToRelative(11.712f)
                reflectiveCurveToRelative(-4.301f, -3.425f, -4.32f, -3.443f)
                curveToRelative(-0.402f, -0.373f, -1.034f, -0.354f, -1.41f, 0.048f)
                curveToRelative(-0.377f, 0.403f, -0.356f, 1.038f, 0.046f, 1.416f)
                lineToRelative(2.352f, 2.268f)
                horizontalLineToRelative(-2.881f)
                lineToRelative(-0.849f, -0.818f)
                curveToRelative(-1.196f, -1.12f, -1.26f, -3.022f, -0.13f, -4.23f)
                curveToRelative(1.115f, -1.194f, 2.983f, -1.269f, 4.193f, -0.182f)
                lineToRelative(0.998f, 0.794f)
                verticalLineToRelative(-7.563f)
                curveToRelative(0.0f, -0.882f, 0.386f, -1.715f, 1.058f, -2.286f)
                curveToRelative(0.672f, -0.572f, 1.56f, -0.815f, 2.439f, -0.674f)
                curveToRelative(1.427f, 0.232f, 2.503f, 1.552f, 2.503f, 3.067f)
                verticalLineToRelative(5.045f)
                lineToRelative(7.0f, 2.616f)
                close()
            }
        }
        .build()
        return _choose!!
    }

private var _choose: ImageVector? = null
