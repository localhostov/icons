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

public val Icons.Filled.PlantCare: ImageVector
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
                curveToRelative(-0.255f, -1.139f, -1.194f, -2.117f, -1.194f, -2.117f)
                curveToRelative(-1.669f, -2.01f, -3.907f, -2.291f, -3.907f, -2.291f)
                curveToRelative(2.179f, 2.49f, 3.0f, 3.5f, 3.471f, 5.484f)
                curveToRelative(-0.605f, 0.008f, -1.218f, -0.121f, -1.784f, -0.433f)
                curveTo(1.961f, 5.824f, 1.0f, 3.0f, 0.0f, 1.226f)
                close()
                moveTo(23.152f, 8.681f)
                curveToRelative(-0.515f, -0.469f, -1.186f, -0.712f, -1.878f, -0.678f)
                curveToRelative(-0.697f, 0.032f, -1.339f, 0.334f, -1.794f, 0.835f)
                lineToRelative(-3.541f, 3.737f)
                curveToRelative(0.032f, 0.21f, 0.065f, 0.42f, 0.065f, 0.638f)
                curveToRelative(0.0f, 2.083f, -1.555f, 3.876f, -3.617f, 4.17f)
                lineToRelative(-4.241f, 0.606f)
                lineToRelative(-0.283f, -1.979f)
                lineToRelative(4.241f, -0.606f)
                curveToRelative(1.084f, -0.155f, 1.9f, -1.097f, 1.9f, -2.191f)
                curveToRelative(0.0f, -1.22f, -0.993f, -2.213f, -2.213f, -2.213f)
                lineTo(3.003f, 11.0f)
                curveTo(1.349f, 11.0f, 0.003f, 12.346f, 0.003f, 14.0f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                lineTo(12.667f, 24.0f)
                lineToRelative(10.674f, -11.655f)
                curveToRelative(0.948f, -1.062f, 0.862f, -2.707f, -0.189f, -3.665f)
                close()
            }
        }
        .build()
        return _plantCare!!
    }

private var _plantCare: ImageVector? = null
