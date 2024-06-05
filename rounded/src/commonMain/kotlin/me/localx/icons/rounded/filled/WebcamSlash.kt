package me.localx.icons.rounded.filled

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

public val Icons.Filled.WebcamSlash: ImageVector
    get() {
        if (_webcamSlash != null) {
            return _webcamSlash!!
        }
        _webcamSlash = Builder(name = "WebcamSlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.707f, 22.293f)
                lineToRelative(-4.939f, -4.939f)
                curveToRelative(1.986f, -1.829f, 3.232f, -4.448f, 3.232f, -7.354f)
                curveTo(22.0f, 4.486f, 17.514f, 0.0f, 12.0f, 0.0f)
                curveToRelative(-2.906f, 0.0f, -5.526f, 1.246f, -7.354f, 3.232f)
                lineTo(1.707f, 0.293f)
                curveTo(1.316f, -0.098f, 0.684f, -0.098f, 0.293f, 0.293f)
                reflectiveCurveTo(-0.098f, 1.316f, 0.293f, 1.707f)
                lineToRelative(6.899f, 6.917f)
                reflectiveCurveToRelative(0.003f, -0.009f, 0.004f, -0.014f)
                lineToRelative(15.096f, 15.096f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                close()
                moveTo(15.229f, 13.815f)
                lineToRelative(-1.422f, -1.422f)
                curveToRelative(0.724f, -0.548f, 1.193f, -1.417f, 1.193f, -2.393f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                curveToRelative(-0.976f, 0.0f, -1.845f, 0.469f, -2.393f, 1.193f)
                lineToRelative(-1.422f, -1.422f)
                curveToRelative(0.918f, -1.083f, 2.287f, -1.771f, 3.815f, -1.771f)
                curveToRelative(2.757f, 0.0f, 5.0f, 2.243f, 5.0f, 5.0f)
                curveToRelative(0.0f, 1.527f, -0.688f, 2.897f, -1.771f, 3.815f)
                close()
                moveTo(16.757f, 21.017f)
                lineToRelative(1.895f, 1.895f)
                curveToRelative(-0.424f, 0.682f, -1.15f, 1.089f, -1.955f, 1.089f)
                lineTo(7.302f, 24.001f)
                curveToRelative(-0.827f, 0.0f, -1.569f, -0.427f, -1.986f, -1.142f)
                curveToRelative(-0.417f, -0.716f, -0.424f, -1.573f, -0.017f, -2.293f)
                curveToRelative(0.084f, -0.149f, 0.175f, -0.295f, 0.27f, -0.438f)
                curveToRelative(1.86f, 1.185f, 4.067f, 1.873f, 6.431f, 1.873f)
                curveToRelative(1.689f, 0.0f, 3.297f, -0.351f, 4.756f, -0.984f)
                close()
                moveTo(10.143f, 19.832f)
                curveToRelative(-4.015f, -0.728f, -7.245f, -3.958f, -7.973f, -7.973f)
                curveToRelative(-0.208f, -1.149f, -0.218f, -2.272f, -0.059f, -3.341f)
                curveToRelative(0.115f, -0.772f, 1.066f, -1.081f, 1.618f, -0.529f)
                lineToRelative(3.497f, 3.497f)
                curveToRelative(0.488f, 1.564f, 1.725f, 2.802f, 3.289f, 3.289f)
                lineToRelative(3.497f, 3.497f)
                curveToRelative(0.552f, 0.552f, 0.242f, 1.503f, -0.529f, 1.618f)
                curveToRelative(-1.068f, 0.16f, -2.191f, 0.149f, -3.341f, -0.059f)
                close()
            }
        }
        .build()
        return _webcamSlash!!
    }

private var _webcamSlash: ImageVector? = null
