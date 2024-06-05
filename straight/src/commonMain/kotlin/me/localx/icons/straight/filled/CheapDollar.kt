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

public val Icons.Filled.CheapDollar: ImageVector
    get() {
        if (_cheapDollar != null) {
            return _cheapDollar!!
        }
        _cheapDollar = Builder(name = "CheapDollar", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.4f, 19.429f)
                lineToRelative(-3.993f, 3.993f)
                curveToRelative(-0.386f, 0.385f, -0.895f, 0.579f, -1.404f, 0.579f)
                curveToRelative(-0.513f, 0.0f, -1.026f, -0.195f, -1.417f, -0.586f)
                lineToRelative(-4.0f, -4.0f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(3.002f, 3.002f)
                lineTo(17.025f, 0.0f)
                lineToRelative(2.0f, 0.002f)
                lineToRelative(-0.023f, 21.017f)
                lineToRelative(2.998f, -3.018f)
                lineToRelative(1.4f, 1.429f)
                close()
                moveTo(9.757f, 19.414f)
                lineToRelative(0.564f, 0.564f)
                curveToRelative(-0.108f, 0.004f, -0.212f, 0.022f, -0.321f, 0.022f)
                curveTo(4.486f, 20.0f, 0.0f, 15.514f, 0.0f, 10.0f)
                reflectiveCurveTo(4.486f, 0.0f, 10.0f, 0.0f)
                curveToRelative(1.822f, 0.0f, 3.527f, 0.498f, 5.0f, 1.353f)
                verticalLineToRelative(14.818f)
                lineToRelative(-1.0f, -1.0f)
                lineToRelative(-4.243f, 4.243f)
                close()
                moveTo(9.0f, 15.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                curveToRelative(0.0f, -1.36f, -0.974f, -2.51f, -2.315f, -2.733f)
                lineToRelative(-3.042f, -0.507f)
                curveToRelative(-0.373f, -0.062f, -0.644f, -0.382f, -0.644f, -0.76f)
                curveToRelative(0.0f, -0.551f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                curveToRelative(0.0f, 1.36f, 0.974f, 2.51f, 2.315f, 2.733f)
                lineToRelative(3.042f, 0.507f)
                curveToRelative(0.373f, 0.062f, 0.644f, 0.382f, 0.644f, 0.76f)
                curveToRelative(0.0f, 0.551f, -0.449f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, -0.449f, -1.0f, -1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _cheapDollar!!
    }

private var _cheapDollar: ImageVector? = null
