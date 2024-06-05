package me.localx.icons.rounded.outline

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

public val Icons.Outline.ModelCubeArrows: ImageVector
    get() {
        if (_modelCubeArrows != null) {
            return _modelCubeArrows!!
        }
        _modelCubeArrows = Builder(name = "ModelCubeArrows", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.928f, 19.75f)
                lineToRelative(-0.975f, -3.054f)
                curveToRelative(-0.168f, -0.527f, -0.732f, -0.817f, -1.257f, -0.649f)
                curveToRelative(-0.526f, 0.168f, -0.816f, 0.731f, -0.649f, 1.257f)
                lineToRelative(0.437f, 1.366f)
                lineToRelative(-2.484f, -1.512f)
                verticalLineToRelative(-4.696f)
                curveToRelative(0.0f, -1.253f, -0.676f, -2.418f, -1.764f, -3.039f)
                lineToRelative(-4.236f, -2.421f)
                verticalLineToRelative(-3.026f)
                lineToRelative(1.311f, 1.248f)
                curveToRelative(0.193f, 0.185f, 0.441f, 0.276f, 0.689f, 0.276f)
                curveToRelative(0.264f, 0.0f, 0.527f, -0.104f, 0.724f, -0.311f)
                curveToRelative(0.381f, -0.399f, 0.366f, -1.032f, -0.034f, -1.413f)
                lineToRelative(-2.339f, -2.229f)
                curveToRelative(-0.73f, -0.728f, -1.92f, -0.729f, -2.625f, -0.023f)
                lineToRelative(-2.407f, 2.244f)
                curveToRelative(-0.404f, 0.377f, -0.427f, 1.01f, -0.05f, 1.413f)
                curveToRelative(0.377f, 0.405f, 1.01f, 0.427f, 1.413f, 0.05f)
                lineToRelative(1.318f, -1.229f)
                verticalLineToRelative(3.0f)
                lineToRelative(-4.236f, 2.421f)
                curveToRelative(-1.088f, 0.621f, -1.764f, 1.786f, -1.764f, 3.039f)
                verticalLineToRelative(4.697f)
                lineToRelative(-2.483f, 1.51f)
                lineToRelative(0.436f, -1.365f)
                curveToRelative(0.167f, -0.525f, -0.123f, -1.089f, -0.649f, -1.257f)
                curveToRelative(-0.524f, -0.167f, -1.089f, 0.122f, -1.257f, 0.649f)
                lineTo(0.054f, 19.817f)
                curveToRelative(-0.244f, 1.005f, 0.374f, 2.021f, 1.314f, 2.247f)
                lineToRelative(2.832f, 0.89f)
                curveToRelative(0.1f, 0.031f, 0.201f, 0.046f, 0.3f, 0.046f)
                curveToRelative(0.426f, 0.0f, 0.82f, -0.273f, 0.954f, -0.7f)
                curveToRelative(0.165f, -0.527f, -0.128f, -1.088f, -0.654f, -1.254f)
                lineToRelative(-1.545f, -0.484f)
                lineToRelative(2.637f, -1.604f)
                lineToRelative(4.373f, 2.498f)
                curveToRelative(0.535f, 0.307f, 1.136f, 0.459f, 1.736f, 0.459f)
                reflectiveCurveToRelative(1.201f, -0.152f, 1.736f, -0.459f)
                lineToRelative(4.373f, -2.499f)
                lineToRelative(2.635f, 1.603f)
                lineToRelative(-1.544f, 0.485f)
                curveToRelative(-0.526f, 0.166f, -0.819f, 0.727f, -0.654f, 1.254f)
                curveToRelative(0.134f, 0.427f, 0.528f, 0.7f, 0.954f, 0.7f)
                curveToRelative(0.099f, 0.0f, 0.2f, -0.015f, 0.3f, -0.046f)
                lineToRelative(2.769f, -0.872f)
                curveToRelative(1.004f, -0.244f, 1.622f, -1.26f, 1.359f, -2.332f)
                close()
                moveTo(12.0f, 13.127f)
                lineToRelative(-3.844f, -2.196f)
                lineToRelative(3.844f, -2.197f)
                lineToRelative(3.844f, 2.197f)
                lineToRelative(-3.844f, 2.196f)
                close()
                moveTo(7.0f, 17.288f)
                verticalLineToRelative(-4.715f)
                lineToRelative(4.0f, 2.285f)
                verticalLineToRelative(4.715f)
                lineToRelative(-4.0f, -2.285f)
                close()
                moveTo(13.0f, 19.573f)
                verticalLineToRelative(-4.715f)
                lineToRelative(4.0f, -2.285f)
                verticalLineToRelative(4.715f)
                lineToRelative(-4.0f, 2.285f)
                close()
            }
        }
        .build()
        return _modelCubeArrows!!
    }

private var _modelCubeArrows: ImageVector? = null
