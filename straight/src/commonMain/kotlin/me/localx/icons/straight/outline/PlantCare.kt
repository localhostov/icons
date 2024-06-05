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

public val Icons.Outline.PlantCare: ImageVector
    get() {
        if (_plantCare != null) {
            return _plantCare!!
        }
        _plantCare = Builder(name = "PlantCare", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 1.226f)
                reflectiveCurveTo(3.666f, -1.304f, 7.672f, 0.905f)
                curveToRelative(1.533f, 0.845f, 2.18f, 2.638f, 1.625f, 4.22f)
                curveToRelative(0.171f, 0.454f, 0.305f, 0.923f, 0.403f, 1.388f)
                curveToRelative(0.399f, -0.424f, 0.865f, -0.81f, 1.399f, -1.136f)
                curveToRelative(-0.308f, -1.207f, 0.205f, -2.516f, 1.344f, -3.153f)
                curveToRelative(3.161f, -1.768f, 6.557f, 0.276f, 6.557f, 0.276f)
                curveToRelative(-0.742f, 1.863f, -2.052f, 3.659f, -3.808f, 4.641f)
                curveToRelative(-0.957f, 0.535f, -2.087f, 0.441f, -2.939f, -0.13f)
                curveToRelative(-1.551f, 0.879f, -2.253f, 2.492f, -2.253f, 2.989f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.581f, -0.162f, -2.73f, -0.399f, -3.592f)
                curveToRelative(-0.306f, -0.831f, -1.185f, -2.096f, -1.201f, -2.108f)
                lineToRelative(0.007f, -0.009f)
                curveToRelative(-1.669f, -2.01f, -3.907f, -2.291f, -3.907f, -2.291f)
                curveToRelative(2.179f, 2.49f, 3.0f, 3.5f, 3.471f, 5.484f)
                curveToRelative(-0.605f, 0.008f, -1.218f, -0.121f, -1.784f, -0.433f)
                curveTo(1.961f, 5.824f, 1.0f, 3.0f, 0.0f, 1.226f)
                close()
                moveTo(23.235f, 13.016f)
                lineToRelative(-9.787f, 10.984f)
                lineTo(3.0f, 24.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                lineTo(12.857f, 11.0f)
                curveToRelative(1.139f, 0.0f, 2.139f, 0.609f, 2.689f, 1.519f)
                lineToRelative(3.217f, -3.534f)
                curveToRelative(0.54f, -0.595f, 1.281f, -0.944f, 2.085f, -0.981f)
                curveToRelative(0.812f, -0.039f, 1.574f, 0.24f, 2.169f, 0.782f)
                curveToRelative(1.214f, 1.107f, 1.312f, 3.005f, 0.218f, 4.23f)
                close()
                moveTo(21.67f, 10.264f)
                curveToRelative(-0.199f, -0.181f, -0.457f, -0.271f, -0.728f, -0.262f)
                curveToRelative(-0.27f, 0.013f, -0.519f, 0.129f, -0.699f, 0.329f)
                lineToRelative(-4.427f, 4.864f)
                curveToRelative(-0.385f, 1.07f, -1.339f, 1.891f, -2.514f, 2.059f)
                lineToRelative(-5.161f, 0.737f)
                lineToRelative(-0.283f, -1.98f)
                lineToRelative(5.161f, -0.737f)
                curveToRelative(0.56f, -0.079f, 0.98f, -0.565f, 0.98f, -1.13f)
                curveToRelative(0.0f, -0.63f, -0.513f, -1.143f, -1.143f, -1.143f)
                lineTo(3.0f, 13.001f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                lineTo(12.552f, 22.001f)
                lineToRelative(9.19f, -10.316f)
                curveToRelative(0.368f, -0.412f, 0.335f, -1.049f, -0.072f, -1.421f)
                close()
            }
        }
        .build()
        return _plantCare!!
    }

private var _plantCare: ImageVector? = null
