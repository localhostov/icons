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

public val Icons.Filled.SackDollar: ImageVector
    get() {
        if (_sackDollar != null) {
            return _sackDollar!!
        }
        _sackDollar = Builder(name = "SackDollar", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.088f, 5.084f)
                curveToRelative(1.065f, -0.696f, 2.912f, -2.201f, 2.912f, -4.284f)
                lineTo(16.0f, 0.0f)
                lineTo(8.0f, 0.0f)
                lineTo(8.0f, 0.8f)
                curveToRelative(0.0f, 2.083f, 1.847f, 3.588f, 2.912f, 4.284f)
                curveTo(5.548f, 5.908f, 1.0f, 12.63f, 1.0f, 18.0f)
                curveToRelative(0.0f, 3.309f, 2.691f, 6.0f, 6.0f, 6.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(3.309f, 0.0f, 6.0f, -2.691f, 6.0f, -6.0f)
                curveToRelative(0.0f, -5.37f, -4.548f, -12.092f, -9.912f, -12.916f)
                close()
                moveTo(10.643f, 13.76f)
                lineToRelative(3.042f, 0.507f)
                curveToRelative(1.341f, 0.223f, 2.315f, 1.373f, 2.315f, 2.733f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.551f, 0.449f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, -0.449f, 1.0f, -1.0f)
                curveToRelative(0.0f, -0.378f, -0.271f, -0.698f, -0.644f, -0.76f)
                lineToRelative(-3.042f, -0.507f)
                curveToRelative(-1.341f, -0.223f, -2.315f, -1.373f, -2.315f, -2.733f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.551f, -0.449f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, 0.449f, -1.0f, 1.0f)
                curveToRelative(0.0f, 0.378f, 0.271f, 0.698f, 0.644f, 0.76f)
                close()
            }
        }
        .build()
        return _sackDollar!!
    }

private var _sackDollar: ImageVector? = null
