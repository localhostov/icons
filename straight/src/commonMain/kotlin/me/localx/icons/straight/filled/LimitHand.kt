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

public val Icons.Filled.LimitHand: ImageVector
    get() {
        if (_limitHand != null) {
            return _limitHand!!
        }
        _limitHand = Builder(name = "LimitHand", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 24.0f)
                horizontalLineToRelative(12.0f)
                lineToRelative(-6.0f, -10.286f)
                lineToRelative(-6.0f, 10.286f)
                close()
                moveTo(19.0f, 23.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(19.0f, 20.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(24.0f, 4.5f)
                verticalLineToRelative(15.53f)
                lineToRelative(-4.684f, -8.03f)
                horizontalLineToRelative(-2.632f)
                lineToRelative(-7.0f, 12.0f)
                horizontalLineToRelative(-1.684f)
                lineTo(0.646f, 16.412f)
                curveToRelative(-0.713f, -0.715f, -0.88f, -1.87f, -0.276f, -2.68f)
                curveToRelative(0.63f, -0.845f, 1.741f, -1.031f, 2.584f, -0.561f)
                curveToRelative(0.201f, 0.131f, 0.353f, 0.245f, 0.441f, 0.333f)
                lineToRelative(2.605f, 2.65f)
                lineTo(6.0f, 3.5f)
                curveToRelative(0.0f, -0.911f, 0.812f, -1.632f, 1.752f, -1.479f)
                curveToRelative(0.737f, 0.12f, 1.248f, 0.813f, 1.248f, 1.56f)
                verticalLineToRelative(6.42f)
                horizontalLineToRelative(2.0f)
                lineTo(11.0f, 1.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(2.0f)
                lineTo(16.0f, 2.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _limitHand!!
    }

private var _limitHand: ImageVector? = null
