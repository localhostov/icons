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

public val Icons.Outline.HandScissors: ImageVector
    get() {
        if (_handScissors != null) {
            return _handScissors!!
        }
        _handScissors = Builder(name = "HandScissors", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.657f, 4.657f)
                lineToRelative(-2.778f, -2.778f)
                curveToRelative(-1.134f, -1.134f, -3.104f, -1.14f, -4.249f, 0.006f)
                lineToRelative(-2.981f, 3.03f)
                lineToRelative(-7.975f, -1.838f)
                curveToRelative(-0.823f, -0.19f, -1.694f, -0.021f, -2.389f, 0.461f)
                curveTo(0.591f, 4.022f, 0.131f, 4.783f, 0.023f, 5.627f)
                curveToRelative(-0.189f, 1.479f, 0.893f, 2.97f, 2.403f, 3.319f)
                lineToRelative(2.3f, 0.554f)
                lineToRelative(-2.292f, 0.552f)
                curveTo(0.916f, 10.404f, -0.167f, 11.894f, 0.023f, 13.374f)
                curveToRelative(0.108f, 0.843f, 0.568f, 1.604f, 1.262f, 2.087f)
                reflectiveCurveToRelative(1.565f, 0.652f, 2.397f, 0.46f)
                lineToRelative(5.042f, -1.208f)
                lineToRelative(0.653f, 3.267f)
                curveToRelative(0.466f, 2.329f, 2.528f, 4.019f, 4.903f, 4.019f)
                horizontalLineToRelative(4.721f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-6.687f)
                curveToRelative(0.0f, -2.137f, -0.832f, -4.146f, -2.343f, -5.657f)
                close()
                moveTo(22.0f, 17.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-4.721f)
                curveToRelative(-1.425f, 0.0f, -2.662f, -1.014f, -2.942f, -2.412f)
                lineToRelative(-0.857f, -4.285f)
                curveToRelative(-0.053f, -0.266f, -0.212f, -0.5f, -0.441f, -0.646f)
                curveToRelative(-0.163f, -0.104f, -0.462f, -0.196f, -0.772f, -0.13f)
                lineToRelative(-6.043f, 1.447f)
                curveToRelative(-0.278f, 0.064f, -0.562f, 0.009f, -0.796f, -0.154f)
                reflectiveCurveToRelative(-0.384f, -0.412f, -0.421f, -0.7f)
                curveToRelative(-0.058f, -0.449f, 0.377f, -1.004f, 0.887f, -1.122f)
                lineToRelative(6.34f, -1.526f)
                curveToRelative(0.45f, -0.108f, 0.766f, -0.51f, 0.766f, -0.972f)
                reflectiveCurveToRelative(-0.317f, -0.864f, -0.766f, -0.972f)
                lineToRelative(-6.349f, -1.527f)
                curveToRelative(-0.501f, -0.116f, -0.936f, -0.671f, -0.879f, -1.12f)
                curveToRelative(0.037f, -0.288f, 0.187f, -0.537f, 0.422f, -0.701f)
                curveToRelative(0.234f, -0.165f, 0.518f, -0.219f, 0.796f, -0.154f)
                lineToRelative(12.551f, 2.892f)
                curveToRelative(0.54f, 0.124f, 1.075f, -0.212f, 1.199f, -0.75f)
                reflectiveCurveToRelative(-0.212f, -1.075f, -0.75f, -1.199f)
                lineToRelative(-2.289f, -0.527f)
                lineToRelative(2.115f, -2.149f)
                curveToRelative(0.377f, -0.378f, 1.036f, -0.378f, 1.414f, 0.0f)
                lineToRelative(2.778f, 2.778f)
                curveToRelative(1.133f, 1.133f, 1.757f, 2.64f, 1.757f, 4.243f)
                verticalLineToRelative(6.687f)
                close()
            }
        }
        .build()
        return _handScissors!!
    }

private var _handScissors: ImageVector? = null
