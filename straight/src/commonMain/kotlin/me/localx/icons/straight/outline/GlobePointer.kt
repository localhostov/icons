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

public val Icons.Outline.GlobePointer: ImageVector
    get() {
        if (_globePointer != null) {
            return _globePointer!!
        }
        _globePointer = Builder(name = "GlobePointer", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                curveToRelative(0.0f, 0.31f, 0.023f, 0.615f, 0.047f, 0.919f)
                lineToRelative(1.966f, -0.673f)
                curveToRelative(-0.002f, -0.083f, -0.012f, -0.164f, -0.012f, -0.247f)
                curveToRelative(0.0f, -1.422f, 0.303f, -2.774f, 0.841f, -4.0f)
                horizontalLineToRelative(3.363f)
                curveToRelative(-0.324f, 0.958f, -0.563f, 1.974f, -0.653f, 3.036f)
                lineToRelative(2.103f, -0.72f)
                curveToRelative(0.143f, -0.809f, 0.389f, -1.581f, 0.683f, -2.317f)
                horizontalLineToRelative(7.334f)
                curveToRelative(0.495f, 1.235f, 0.829f, 2.587f, 0.829f, 4.0f)
                reflectiveCurveToRelative(-0.332f, 2.766f, -0.825f, 4.0f)
                horizontalLineToRelative(-1.873f)
                lineToRelative(-0.684f, 2.0f)
                horizontalLineToRelative(1.571f)
                curveToRelative(-0.936f, 1.609f, -2.01f, 2.868f, -2.688f, 3.586f)
                curveToRelative(-0.054f, 0.047f, -0.098f, 0.075f, -0.15f, 0.116f)
                lineToRelative(-0.773f, 2.259f)
                curveToRelative(0.305f, 0.023f, 0.611f, 0.039f, 0.921f, 0.039f)
                curveToRelative(6.617f, 0.0f, 12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(19.981f, 6.0f)
                horizontalLineToRelative(-3.017f)
                curveToRelative(-0.721f, -1.444f, -1.584f, -2.689f, -2.353f, -3.642f)
                curveToRelative(2.173f, 0.589f, 4.049f, 1.891f, 5.369f, 3.642f)
                close()
                moveTo(4.02f, 6.0f)
                curveToRelative(1.322f, -1.754f, 3.202f, -3.056f, 5.378f, -3.644f)
                curveToRelative(-0.769f, 0.956f, -1.637f, 2.194f, -2.36f, 3.644f)
                horizontalLineToRelative(-3.018f)
                close()
                moveTo(9.319f, 6.0f)
                curveToRelative(0.931f, -1.601f, 2.005f, -2.87f, 2.681f, -3.586f)
                curveToRelative(0.677f, 0.718f, 1.757f, 1.983f, 2.69f, 3.586f)
                horizontalLineToRelative(-5.371f)
                close()
                moveTo(14.594f, 21.647f)
                curveToRelative(0.772f, -0.958f, 1.643f, -2.19f, 2.371f, -3.647f)
                horizontalLineToRelative(3.017f)
                curveToRelative(-1.324f, 1.756f, -3.207f, 3.06f, -5.388f, 3.647f)
                close()
                moveTo(21.16f, 16.0f)
                horizontalLineToRelative(-3.359f)
                curveToRelative(0.422f, -1.245f, 0.7f, -2.587f, 0.7f, -4.0f)
                reflectiveCurveToRelative(-0.278f, -2.755f, -0.7f, -4.0f)
                horizontalLineToRelative(3.359f)
                curveToRelative(0.538f, 1.226f, 0.841f, 2.578f, 0.841f, 4.0f)
                reflectiveCurveToRelative(-0.303f, 2.774f, -0.841f, 4.0f)
                close()
                moveTo(13.607f, 10.394f)
                lineTo(-0.045f, 15.064f)
                lineToRelative(5.145f, 2.422f)
                lineTo(0.033f, 22.553f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(5.067f, -5.067f)
                lineToRelative(2.422f, 5.145f)
                lineToRelative(4.671f, -13.651f)
                close()
                moveTo(7.566f, 16.435f)
                lineToRelative(-2.29f, -1.077f)
                lineToRelative(5.118f, -1.751f)
                lineToRelative(-1.751f, 5.118f)
                lineToRelative(-1.077f, -2.29f)
                close()
            }
        }
        .build()
        return _globePointer!!
    }

private var _globePointer: ImageVector? = null
