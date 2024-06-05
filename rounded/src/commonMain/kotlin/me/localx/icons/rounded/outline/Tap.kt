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

public val Icons.Outline.Tap: ImageVector
    get() {
        if (_tap != null) {
            return _tap!!
        }
        _tap = Builder(name = "Tap", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 19.279f)
                verticalLineToRelative(3.721f)
                curveToRelative(0.0f, 0.552f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-3.721f)
                curveToRelative(0.0f, -1.425f, -1.015f, -2.662f, -2.412f, -2.942f)
                lineToRelative(-6.784f, -1.357f)
                curveToRelative(-0.467f, -0.093f, -0.804f, -0.504f, -0.804f, -0.98f)
                verticalLineToRelative(-6.893f)
                curveToRelative(0.0f, -0.538f, -0.362f, -1.018f, -0.824f, -1.092f)
                curveToRelative(-0.306f, -0.05f, -0.596f, 0.03f, -0.823f, 0.223f)
                curveToRelative(-0.224f, 0.19f, -0.353f, 0.468f, -0.353f, 0.762f)
                verticalLineToRelative(13.638f)
                curveToRelative(0.0f, 0.384f, -0.22f, 0.734f, -0.566f, 0.901f)
                curveToRelative(-0.344f, 0.167f, -0.756f, 0.122f, -1.057f, -0.119f)
                lineToRelative(-2.637f, -2.1f)
                curveToRelative(-0.463f, -0.428f, -1.095f, -0.406f, -1.47f, -0.004f)
                curveToRelative(-0.376f, 0.403f, -0.355f, 1.039f, 0.047f, 1.417f)
                lineToRelative(1.377f, 1.328f)
                curveToRelative(0.397f, 0.383f, 0.409f, 1.016f, 0.025f, 1.414f)
                curveToRelative(-0.383f, 0.397f, -1.016f, 0.408f, -1.414f, 0.025f)
                lineToRelative(-1.367f, -1.318f)
                curveToRelative(-1.195f, -1.121f, -1.259f, -3.023f, -0.13f, -4.231f)
                curveToRelative(1.129f, -1.206f, 3.029f, -1.271f, 4.237f, -0.144f)
                lineToRelative(0.955f, 0.759f)
                verticalLineTo(7.0f)
                curveToRelative(0.0f, -0.881f, 0.385f, -1.714f, 1.057f, -2.286f)
                curveToRelative(0.671f, -0.572f, 1.561f, -0.818f, 2.439f, -0.674f)
                curveToRelative(1.427f, 0.231f, 2.503f, 1.55f, 2.503f, 3.066f)
                verticalLineToRelative(6.073f)
                lineToRelative(5.98f, 1.196f)
                curveToRelative(2.329f, 0.466f, 4.02f, 2.528f, 4.02f, 4.903f)
                close()
                moveTo(3.544f, 10.5f)
                curveToRelative(0.14f, 0.0f, 0.281f, -0.029f, 0.417f, -0.091f)
                curveToRelative(0.502f, -0.23f, 0.722f, -0.824f, 0.492f, -1.326f)
                curveToRelative(-0.301f, -0.655f, -0.453f, -1.356f, -0.453f, -2.083f)
                curveToRelative(0.0f, -2.757f, 2.243f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.243f, 5.0f, 5.0f)
                curveToRelative(0.0f, 0.729f, -0.152f, 1.429f, -0.452f, 2.083f)
                curveToRelative(-0.231f, 0.502f, -0.011f, 1.096f, 0.49f, 1.326f)
                curveToRelative(0.505f, 0.231f, 1.097f, 0.011f, 1.326f, -0.491f)
                curveToRelative(0.422f, -0.917f, 0.636f, -1.899f, 0.636f, -2.917f)
                curveToRelative(0.0f, -3.86f, -3.14f, -7.0f, -7.0f, -7.0f)
                reflectiveCurveTo(2.0f, 3.14f, 2.0f, 7.0f)
                curveToRelative(0.0f, 1.017f, 0.214f, 1.998f, 0.635f, 2.917f)
                curveToRelative(0.168f, 0.367f, 0.531f, 0.583f, 0.91f, 0.583f)
                close()
            }
        }
        .build()
        return _tap!!
    }

private var _tap: ImageVector? = null
