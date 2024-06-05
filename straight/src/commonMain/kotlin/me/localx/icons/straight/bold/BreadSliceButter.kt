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

public val Icons.Bold.BreadSliceButter: ImageVector
    get() {
        if (_breadSliceButter != null) {
            return _breadSliceButter!!
        }
        _breadSliceButter = Builder(name = "BreadSliceButter", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.682f, 1.0f)
                lineTo(5.318f, 1.0f)
                curveTo(2.386f, 1.0f, 0.0f, 3.386f, 0.0f, 6.318f)
                curveToRelative(0.0f, 1.557f, 0.734f, 3.011f, 2.0f, 4.028f)
                verticalLineToRelative(12.653f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(-12.653f)
                curveToRelative(1.266f, -1.018f, 2.0f, -2.472f, 2.0f, -4.028f)
                curveToRelative(0.0f, -2.933f, -2.386f, -5.318f, -5.318f, -5.318f)
                close()
                moveTo(19.745f, 8.266f)
                lineToRelative(-0.745f, 0.434f)
                verticalLineToRelative(11.301f)
                lineTo(5.0f, 20.001f)
                verticalLineToRelative(-11.301f)
                lineToRelative(-0.745f, -0.434f)
                curveToRelative(-0.786f, -0.458f, -1.255f, -1.186f, -1.255f, -1.947f)
                curveToRelative(0.0f, -1.278f, 1.04f, -2.318f, 2.318f, -2.318f)
                horizontalLineToRelative(13.363f)
                curveToRelative(1.278f, 0.0f, 2.318f, 1.04f, 2.318f, 2.318f)
                curveToRelative(0.0f, 0.762f, -0.469f, 1.489f, -1.255f, 1.947f)
                close()
                moveTo(12.91f, 9.378f)
                lineToRelative(2.712f, 2.712f)
                curveToRelative(0.503f, 0.503f, 0.503f, 1.318f, 0.0f, 1.821f)
                lineToRelative(-2.712f, 2.712f)
                curveToRelative(-0.503f, 0.503f, -1.318f, 0.503f, -1.821f, 0.0f)
                lineToRelative(-2.712f, -2.712f)
                curveToRelative(-0.503f, -0.503f, -0.503f, -1.318f, 0.0f, -1.821f)
                lineToRelative(2.712f, -2.712f)
                curveToRelative(0.503f, -0.503f, 1.318f, -0.503f, 1.821f, 0.0f)
                close()
            }
        }
        .build()
        return _breadSliceButter!!
    }

private var _breadSliceButter: ImageVector? = null
