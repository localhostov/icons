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

public val Icons.Filled.BadgeDollar: ImageVector
    get() {
        if (_badgeDollar != null) {
            return _badgeDollar!!
        }
        _badgeDollar = Builder(name = "BadgeDollar", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, -1.696f, -0.86f, -3.191f, -2.168f, -4.073f)
                curveToRelative(0.301f, -1.548f, -0.148f, -3.213f, -1.347f, -4.413f)
                curveToRelative(-1.199f, -1.199f, -2.864f, -1.648f, -4.413f, -1.347f)
                curveToRelative(-0.882f, -1.308f, -2.377f, -2.168f, -4.073f, -2.168f)
                reflectiveCurveToRelative(-3.191f, 0.86f, -4.073f, 2.168f)
                curveToRelative(-1.548f, -0.301f, -3.214f, 0.148f, -4.413f, 1.347f)
                curveToRelative(-1.199f, 1.199f, -1.648f, 2.864f, -1.347f, 4.413f)
                curveToRelative(-1.308f, 0.882f, -2.168f, 2.377f, -2.168f, 4.073f)
                reflectiveCurveToRelative(0.86f, 3.191f, 2.168f, 4.073f)
                curveToRelative(-0.301f, 1.548f, 0.148f, 3.214f, 1.347f, 4.413f)
                curveToRelative(1.199f, 1.199f, 2.864f, 1.648f, 4.413f, 1.347f)
                curveToRelative(0.882f, 1.308f, 2.377f, 2.168f, 4.073f, 2.168f)
                reflectiveCurveToRelative(3.191f, -0.86f, 4.073f, -2.168f)
                curveToRelative(1.548f, 0.301f, 3.214f, -0.148f, 4.413f, -1.347f)
                curveToRelative(1.199f, -1.199f, 1.648f, -2.864f, 1.347f, -4.413f)
                curveToRelative(1.308f, -0.882f, 2.168f, -2.377f, 2.168f, -4.073f)
                close()
                moveTo(10.644f, 10.76f)
                lineToRelative(3.041f, 0.507f)
                curveToRelative(1.342f, 0.223f, 2.315f, 1.373f, 2.315f, 2.733f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.551f, 0.449f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.449f, 1.0f, -1.0f)
                curveToRelative(0.0f, -0.378f, -0.271f, -0.698f, -0.644f, -0.76f)
                lineToRelative(-3.042f, -0.507f)
                curveToRelative(-1.341f, -0.223f, -2.315f, -1.373f, -2.315f, -2.733f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.551f, -0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, 0.449f, -1.0f, 1.0f)
                curveToRelative(0.0f, 0.378f, 0.271f, 0.698f, 0.644f, 0.76f)
                close()
            }
        }
        .build()
        return _badgeDollar!!
    }

private var _badgeDollar: ImageVector? = null
