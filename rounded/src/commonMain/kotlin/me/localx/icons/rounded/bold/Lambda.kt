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

public val Icons.Bold.Lambda: ImageVector
    get() {
        if (_lambda != null) {
            return _lambda!!
        }
        _lambda = Builder(name = "Lambda", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 22.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                curveToRelative(-2.412f, 0.0f, -4.602f, -1.33f, -5.714f, -3.471f)
                lineToRelative(-5.307f, -10.218f)
                lineToRelative(-6.646f, 12.877f)
                curveToRelative(-0.267f, 0.517f, -0.791f, 0.812f, -1.334f, 0.812f)
                curveToRelative(-0.231f, 0.0f, -0.467f, -0.054f, -0.687f, -0.167f)
                curveToRelative(-0.736f, -0.38f, -1.025f, -1.285f, -0.646f, -2.021f)
                lineToRelative(7.619f, -14.762f)
                lineToRelative(-1.141f, -2.197f)
                curveToRelative(-0.595f, -1.143f, -1.764f, -1.854f, -3.052f, -1.854f)
                curveToRelative(-0.828f, 0.0f, -1.546f, -0.672f, -1.546f, -1.5f)
                reflectiveCurveToRelative(0.625f, -1.5f, 1.453f, -1.5f)
                curveToRelative(2.411f, 0.0f, 4.693f, 1.33f, 5.807f, 3.47f)
                lineToRelative(8.142f, 15.677f)
                curveToRelative(0.594f, 1.144f, 1.764f, 1.854f, 3.052f, 1.854f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _lambda!!
    }

private var _lambda: ImageVector? = null
