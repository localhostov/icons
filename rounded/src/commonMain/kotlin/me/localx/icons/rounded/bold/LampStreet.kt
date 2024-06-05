package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.LampStreet: ImageVector
    get() {
        if (_lampStreet != null) {
            return _lampStreet!!
        }
        _lampStreet = Builder(name = "LampStreet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.895f, 13.264f)
                curveToRelative(-0.903f, -3.245f, -3.685f, -5.629f, -7.009f, -6.155f)
                curveTo(16.22f, 3.082f, 12.713f, 0.0f, 8.5f, 0.0f)
                curveTo(3.813f, 0.0f, 0.0f, 3.813f, 0.0f, 8.5f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineToRelative(-14.0f)
                curveToRelative(0.0f, -3.032f, 2.468f, -5.5f, 5.5f, -5.5f)
                curveToRelative(2.569f, 0.0f, 4.733f, 1.772f, 5.334f, 4.158f)
                curveToRelative(-3.199f, 0.612f, -5.851f, 2.952f, -6.729f, 6.106f)
                curveToRelative(-0.242f, 0.872f, -0.062f, 1.791f, 0.493f, 2.522f)
                curveToRelative(0.577f, 0.76f, 1.496f, 1.214f, 2.457f, 1.214f)
                horizontalLineToRelative(2.944f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 1.381f, 1.119f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(2.944f)
                curveToRelative(0.961f, 0.0f, 1.88f, -0.454f, 2.457f, -1.214f)
                curveToRelative(0.556f, -0.731f, 0.735f, -1.65f, 0.493f, -2.522f)
                close()
                moveTo(20.945f, 14.0f)
                lineToRelative(-10.948f, 0.068f)
                curveToRelative(0.666f, -2.396f, 2.93f, -4.068f, 5.504f, -4.068f)
                reflectiveCurveToRelative(4.838f, 1.673f, 5.513f, 3.972f)
                curveToRelative(0.0f, 0.0f, -0.021f, 0.028f, -0.068f, 0.028f)
                close()
            }
        }
        .build()
        return _lampStreet!!
    }

private var _lampStreet: ImageVector? = null
