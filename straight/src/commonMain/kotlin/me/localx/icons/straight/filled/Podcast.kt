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

public val Icons.Filled.Podcast: ImageVector
    get() {
        if (_podcast != null) {
            return _podcast!!
        }
        _podcast = Builder(name = "Podcast", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.014f, 16.879f)
                curveToRelative(-0.239f, -0.647f, -0.647f, -1.226f, -1.184f, -1.669f)
                curveToRelative(0.729f, -0.869f, 1.169f, -1.989f, 1.169f, -3.209f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                reflectiveCurveToRelative(-5.0f, 2.243f, -5.0f, 5.0f)
                curveToRelative(0.0f, 1.224f, 0.443f, 2.347f, 1.176f, 3.217f)
                curveToRelative(-0.529f, 0.446f, -0.931f, 1.029f, -1.165f, 1.687f)
                curveToRelative(-1.243f, -1.264f, -2.011f, -2.996f, -2.011f, -4.905f)
                curveToRelative(0.0f, -3.859f, 3.14f, -7.0f, 7.0f, -7.0f)
                reflectiveCurveToRelative(7.0f, 3.141f, 7.0f, 7.0f)
                curveToRelative(0.0f, 1.895f, -0.758f, 3.617f, -1.986f, 4.879f)
                close()
                moveTo(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                curveToRelative(0.0f, 5.133f, 3.24f, 9.522f, 7.781f, 11.234f)
                lineToRelative(-0.542f, -2.442f)
                curveToRelative(-3.118f, -1.695f, -5.239f, -5.001f, -5.239f, -8.792f)
                curveTo(2.0f, 6.486f, 6.486f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.486f, 10.0f, 10.0f)
                curveToRelative(0.0f, 3.777f, -2.105f, 7.071f, -5.203f, 8.772f)
                lineToRelative(-0.515f, 2.438f)
                curveToRelative(4.508f, -1.728f, 7.717f, -6.1f, 7.717f, -11.209f)
                curveTo(24.0f, 5.383f, 18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(15.227f, 18.535f)
                lineToRelative(-1.155f, 5.465f)
                horizontalLineToRelative(-4.072f)
                lineToRelative(-1.197f, -5.389f)
                curveToRelative(-0.184f, -0.975f, 0.365f, -1.908f, 1.271f, -2.203f)
                curveToRelative(0.832f, -0.271f, 1.48f, -0.408f, 1.927f, -0.408f)
                curveToRelative(0.451f, 0.0f, 1.104f, 0.139f, 1.94f, 0.413f)
                curveToRelative(0.895f, 0.291f, 1.449f, 1.204f, 1.286f, 2.122f)
                close()
                moveTo(12.0f, 14.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, -0.895f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.895f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.895f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.895f, 2.0f, 2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _podcast!!
    }

private var _podcast: ImageVector? = null
