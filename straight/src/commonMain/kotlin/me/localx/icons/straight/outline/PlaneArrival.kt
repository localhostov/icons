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

public val Icons.Outline.PlaneArrival: ImageVector
    get() {
        if (_planeArrival != null) {
            return _planeArrival!!
        }
        _planeArrival = Builder(name = "PlaneArrival", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.679f, 11.829f)
                lineToRelative(17.852f, 8.519f)
                lineToRelative(1.218f, -2.779f)
                curveToRelative(0.66f, -1.508f, -0.024f, -3.271f, -1.524f, -3.941f)
                lineToRelative(-2.404f, -1.174f)
                lineToRelative(-1.445f, -8.349f)
                curveToRelative(-0.095f, -1.095f, -0.779f, -2.048f, -1.791f, -2.491f)
                lineTo(11.0f, 0.067f)
                lineTo(11.0f, 9.121f)
                lineToRelative(-3.161f, -1.544f)
                lineToRelative(-1.19f, -3.047f)
                curveToRelative(-0.235f, -0.599f, -0.688f, -1.07f, -1.275f, -1.326f)
                curveToRelative(-0.796f, -0.348f, -1.685f, -0.25f, -2.384f, 0.262f)
                reflectiveCurveToRelative(-1.062f, 1.333f, -0.97f, 2.195f)
                lineToRelative(0.659f, 6.167f)
                close()
                moveTo(13.0f, 3.108f)
                lineToRelative(0.787f, 0.339f)
                curveToRelative(0.335f, 0.147f, 0.562f, 0.465f, 0.605f, 0.914f)
                lineToRelative(1.21f, 7.009f)
                lineToRelative(-2.603f, -1.271f)
                lineTo(12.999f, 3.108f)
                close()
                moveTo(4.171f, 5.08f)
                curveToRelative(0.068f, -0.052f, 0.214f, -0.126f, 0.401f, -0.043f)
                curveToRelative(0.099f, 0.042f, 0.174f, 0.122f, 0.213f, 0.222f)
                lineToRelative(1.476f, 3.773f)
                lineToRelative(13.14f, 6.417f)
                curveToRelative(0.505f, 0.221f, 0.736f, 0.812f, 0.516f, 1.317f)
                lineToRelative(-0.388f, 0.886f)
                lineTo(4.548f, 10.505f)
                lineToRelative(-0.54f, -5.056f)
                curveToRelative(-0.021f, -0.202f, 0.093f, -0.317f, 0.163f, -0.369f)
                close()
                moveTo(24.0f, 22.0f)
                verticalLineToRelative(2.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-2.0f)
                lineTo(24.0f, 22.0f)
                close()
            }
        }
        .build()
        return _planeArrival!!
    }

private var _planeArrival: ImageVector? = null
