package me.localx.icons.straight.outline

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

public val Icons.Outline.WebcamSlash: ImageVector
    get() {
        if (_webcamSlash != null) {
            return _webcamSlash!!
        }
        _webcamSlash = Builder(name = "WebcamSlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.966f, 23.208f)
                lineToRelative(0.133f, 0.792f)
                lineTo(4.901f, 24.0f)
                lineToRelative(0.196f, -1.166f)
                curveToRelative(0.263f, -1.564f, 1.041f, -2.969f, 2.193f, -4.015f)
                curveToRelative(-3.146f, -1.687f, -5.291f, -5.007f, -5.291f, -8.82f)
                curveToRelative(0.0f, -1.116f, 0.18f, -2.201f, 0.529f, -3.228f)
                lineToRelative(1.629f, 1.629f)
                curveToRelative(-0.105f, 0.521f, -0.159f, 1.055f, -0.159f, 1.599f)
                curveToRelative(0.0f, 4.411f, 3.589f, 8.0f, 8.0f, 8.0f)
                curveToRelative(0.544f, 0.0f, 1.079f, -0.054f, 1.599f, -0.158f)
                lineToRelative(1.623f, 1.623f)
                curveToRelative(-1.032f, 0.351f, -2.121f, 0.535f, -3.222f, 0.535f)
                curveToRelative(-0.869f, 0.0f, -1.712f, -0.112f, -2.517f, -0.321f)
                curveToRelative(-0.931f, 0.544f, -1.649f, 1.358f, -2.068f, 2.321f)
                horizontalLineToRelative(10.342f)
                lineToRelative(1.208f, 1.208f)
                close()
                moveTo(23.957f, 22.543f)
                lineToRelative(-1.414f, 1.414f)
                lineTo(0.043f, 1.457f)
                lineTo(1.457f, 0.043f)
                lineToRelative(3.184f, 3.184f)
                curveTo(6.533f, 1.166f, 9.17f, 0.0f, 12.0f, 0.0f)
                curveToRelative(5.514f, 0.0f, 10.0f, 4.486f, 10.0f, 10.0f)
                curveToRelative(0.0f, 2.819f, -1.169f, 5.465f, -3.228f, 7.358f)
                lineToRelative(5.185f, 5.185f)
                close()
                moveTo(6.058f, 4.644f)
                lineToRelative(2.126f, 2.126f)
                curveToRelative(0.94f, -1.11f, 2.331f, -1.77f, 3.816f, -1.77f)
                curveToRelative(2.757f, 0.0f, 5.0f, 2.243f, 5.0f, 5.0f)
                curveToRelative(0.0f, 1.485f, -0.66f, 2.876f, -1.77f, 3.816f)
                lineToRelative(2.126f, 2.126f)
                curveToRelative(1.685f, -1.518f, 2.644f, -3.66f, 2.644f, -5.942f)
                curveToRelative(0.0f, -4.411f, -3.589f, -8.0f, -8.0f, -8.0f)
                curveToRelative(-2.292f, 0.0f, -4.425f, 0.957f, -5.942f, 2.644f)
                close()
                moveTo(15.0f, 10.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                curveToRelative(-0.948f, 0.0f, -1.831f, 0.448f, -2.394f, 1.192f)
                lineToRelative(4.202f, 4.202f)
                curveToRelative(0.744f, -0.563f, 1.192f, -1.446f, 1.192f, -2.394f)
                close()
            }
        }
        .build()
        return _webcamSlash!!
    }

private var _webcamSlash: ImageVector? = null
