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

public val Icons.Filled.RevenueAlt: ImageVector
    get() {
        if (_revenueAlt != null) {
            return _revenueAlt!!
        }
        _revenueAlt = Builder(name = "RevenueAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.0f, 15.0f)
                curveToRelative(0.0f, 0.378f, 0.271f, 0.698f, 0.644f, 0.76f)
                lineToRelative(3.041f, 0.507f)
                curveToRelative(1.342f, 0.223f, 2.315f, 1.373f, 2.315f, 2.733f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.551f, 0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.449f, 1.0f, -1.0f)
                curveToRelative(0.0f, -0.378f, -0.271f, -0.698f, -0.644f, -0.76f)
                lineToRelative(-3.041f, -0.507f)
                curveToRelative(-1.342f, -0.223f, -2.315f, -1.373f, -2.315f, -2.733f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.551f, -0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.449f, -1.0f, 1.0f)
                close()
                moveTo(24.011f, 11.182f)
                lineToRelative(-2.597f, -2.596f)
                curveToRelative(-0.779f, -0.78f, -2.049f, -0.78f, -2.828f, 0.0f)
                lineToRelative(-2.577f, 2.577f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(1.577f, -1.577f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-13.0f)
                lineToRelative(1.597f, 1.596f)
                lineToRelative(1.414f, -1.414f)
                close()
                moveTo(11.0f, 3.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                lineTo(13.0f, 3.0f)
                lineToRelative(1.597f, 1.596f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-2.597f, -2.596f)
                curveToRelative(-0.779f, -0.78f, -2.049f, -0.78f, -2.828f, 0.0f)
                lineToRelative(-2.577f, 2.577f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(1.577f, -1.577f)
                close()
                moveTo(8.011f, 8.182f)
                lineToRelative(-2.597f, -2.596f)
                curveToRelative(-0.779f, -0.78f, -2.049f, -0.78f, -2.828f, 0.0f)
                lineTo(0.009f, 8.163f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(1.577f, -1.577f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(2.0f)
                lineTo(5.0f, 8.0f)
                lineToRelative(1.597f, 1.596f)
                lineToRelative(1.414f, -1.414f)
                close()
            }
        }
        .build()
        return _revenueAlt!!
    }

private var _revenueAlt: ImageVector? = null
