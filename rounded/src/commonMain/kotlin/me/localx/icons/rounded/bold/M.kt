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

public val Icons.Bold.M: ImageVector
    get() {
        if (_m != null) {
            return _m!!
        }
        _m = Builder(name = "M", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.5f, 24.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineTo(3.874f)
                curveToRelative(0.0f, -0.617f, -0.465f, -0.793f, -0.665f, -0.84f)
                curveToRelative(-0.198f, -0.048f, -0.693f, -0.098f, -0.97f, 0.454f)
                lineToRelative(-6.011f, 12.656f)
                curveToRelative(-0.489f, 1.125f, -2.22f, 1.124f, -2.709f, 0.0f)
                lineTo(4.622f, 3.46f)
                curveToRelative(-0.262f, -0.524f, -0.757f, -0.472f, -0.957f, -0.427f)
                curveToRelative(-0.2f, 0.047f, -0.665f, 0.223f, -0.665f, 0.84f)
                verticalLineTo(22.5f)
                curveToRelative(-0.034f, 1.972f, -2.967f, 1.971f, -3.0f, 0.0f)
                verticalLineTo(3.874f)
                curveTo(0.0f, 2.045f, 1.196f, 0.534f, 2.976f, 0.114f)
                curveToRelative(1.778f, -0.417f, 3.525f, 0.396f, 4.343f, 2.032f)
                lineToRelative(4.682f, 9.857f)
                lineTo(16.669f, 2.173f)
                curveToRelative(0.831f, -1.664f, 2.58f, -2.479f, 4.355f, -2.06f)
                curveToRelative(1.78f, 0.42f, 2.976f, 1.931f, 2.976f, 3.76f)
                verticalLineTo(22.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _m!!
    }

private var _m: ImageVector? = null
