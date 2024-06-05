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

public val Icons.Bold.Democrat: ImageVector
    get() {
        if (_democrat != null) {
            return _democrat!!
        }
        _democrat = Builder(name = "Democrat", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.007f, 8.906f)
                lineToRelative(-2.88f, -2.719f)
                curveToRelative(-0.666f, -0.756f, -1.617f, -1.187f, -2.627f, -1.187f)
                horizontalLineToRelative(-6.5f)
                lineToRelative(-2.0f, -1.5f)
                lineTo(10.0f, 0.0f)
                curveToRelative(-1.318f, 0.0f, -2.436f, 0.85f, -2.839f, 2.031f)
                curveToRelative(-0.163f, -0.02f, -0.327f, -0.031f, -0.491f, -0.031f)
                curveToRelative(-0.276f, 0.0f, -0.548f, 0.029f, -0.813f, 0.083f)
                curveToRelative(-0.387f, -1.208f, -1.52f, -2.083f, -2.857f, -2.083f)
                lineTo(3.0f, 4.164f)
                lineToRelative(-1.933f, 2.331f)
                curveToRelative(-1.438f, 1.498f, -1.42f, 3.887f, 0.055f, 5.362f)
                curveToRelative(1.002f, 1.002f, 2.566f, 1.436f, 4.284f, 0.821f)
                lineToRelative(0.594f, 2.97f)
                verticalLineToRelative(7.352f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(6.0f)
                lineTo(22.0f, 11.032f)
                lineToRelative(2.007f, -2.126f)
                close()
                moveTo(5.743f, 9.205f)
                curveToRelative(-0.638f, 0.374f, -1.501f, 0.748f, -1.759f, 0.77f)
                curveToRelative(-0.229f, 0.0f, -0.543f, -0.042f, -0.741f, -0.239f)
                curveToRelative(-0.324f, -0.324f, -0.324f, -0.852f, 0.0f, -1.176f)
                lineToRelative(2.664f, -3.203f)
                curveToRelative(0.325f, -0.392f, 0.95f, -0.465f, 1.357f, -0.16f)
                lineToRelative(3.736f, 2.802f)
                horizontalLineToRelative(7.5f)
                curveToRelative(0.205f, 0.0f, 0.33f, 0.114f, 0.387f, 0.182f)
                curveToRelative(0.052f, 0.063f, 0.113f, 0.169f, 0.113f, 0.318f)
                verticalLineToRelative(6.5f)
                lineTo(8.902f, 14.999f)
                lineToRelative(-1.343f, -6.856f)
                lineToRelative(-1.816f, 1.062f)
                close()
                moveTo(15.0f, 11.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                close()
                moveTo(10.0f, 11.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _democrat!!
    }

private var _democrat: ImageVector? = null
