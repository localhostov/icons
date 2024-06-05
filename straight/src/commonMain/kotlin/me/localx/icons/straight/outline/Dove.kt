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

public val Icons.Outline.Dove: ImageVector
    get() {
        if (_dove != null) {
            return _dove!!
        }
        _dove = Builder(name = "Dove", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 4.295f)
                lineToRelative(-2.096f, -0.898f)
                curveToRelative(-0.23f, -1.371f, -0.941f, -2.428f, -2.027f, -2.972f)
                curveToRelative(-0.954f, -0.478f, -2.037f, -0.557f, -3.054f, -0.22f)
                curveToRelative(-1.014f, 0.337f, -1.835f, 1.049f, -2.299f, 1.975f)
                lineToRelative(-1.345f, 2.476f)
                curveToRelative(-3.222f, -1.257f, -5.482f, -3.283f, -5.507f, -3.306f)
                lineTo(6.213f, 0.027f)
                lineToRelative(-0.208f, 1.957f)
                curveToRelative(-0.005f, 0.052f, -0.089f, 0.874f, -0.039f, 2.171f)
                curveToRelative(-1.349f, -1.122f, -2.157f, -2.154f, -2.174f, -2.176f)
                lineTo(2.272f, 0.011f)
                lineToRelative(-0.267f, 2.47f)
                curveToRelative(-0.039f, 0.355f, -0.797f, 8.053f, 4.408f, 13.365f)
                lineToRelative(-6.414f, 0.902f)
                verticalLineToRelative(0.869f)
                curveToRelative(0.0f, 2.423f, 1.242f, 5.362f, 4.729f, 6.344f)
                lineToRelative(0.362f, 0.102f)
                lineToRelative(6.076f, -2.894f)
                curveToRelative(0.238f, 0.073f, 0.455f, 0.148f, 0.667f, 0.223f)
                curveToRelative(0.858f, 0.298f, 1.745f, 0.607f, 3.416f, 0.607f)
                curveToRelative(3.722f, 0.0f, 6.75f, -3.028f, 6.75f, -6.75f)
                curveToRelative(0.0f, -1.643f, -0.007f, -5.924f, -0.011f, -8.593f)
                lineToRelative(2.011f, -0.862f)
                verticalLineToRelative(-1.5f)
                close()
                moveTo(7.967f, 4.105f)
                curveToRelative(1.031f, 0.719f, 2.497f, 1.612f, 4.25f, 2.321f)
                lineToRelative(-0.289f, 0.531f)
                curveToRelative(-1.411f, -0.155f, -2.713f, -0.673f, -3.843f, -1.319f)
                curveToRelative(-0.065f, -0.565f, -0.101f, -1.081f, -0.119f, -1.533f)
                close()
                moveTo(15.25f, 20.001f)
                curveToRelative(-1.333f, 0.0f, -1.962f, -0.219f, -2.759f, -0.496f)
                curveToRelative(-0.356f, -0.124f, -1.514f, -0.458f, -1.514f, -0.458f)
                lineToRelative(-6.052f, 2.882f)
                curveToRelative(-2.039f, -0.722f, -2.666f, -2.353f, -2.851f, -3.451f)
                lineToRelative(7.244f, -1.065f)
                lineToRelative(0.635f, -1.211f)
                lineToRelative(-0.685f, -0.51f)
                curveToRelative(-4.051f, -3.016f, -5.049f, -7.737f, -5.262f, -10.582f)
                curveToRelative(1.793f, 1.645f, 4.799f, 3.769f, 8.461f, 3.891f)
                lineToRelative(0.617f, 0.021f)
                lineToRelative(3.214f, -5.916f)
                curveToRelative(0.239f, -0.478f, 0.649f, -0.833f, 1.157f, -1.002f)
                curveToRelative(0.507f, -0.169f, 1.048f, -0.129f, 1.525f, 0.11f)
                curveToRelative(0.874f, 0.438f, 1.005f, 1.562f, 1.005f, 2.192f)
                curveToRelative(0.0f, 0.0f, 0.015f, 9.081f, 0.015f, 10.845f)
                curveToRelative(0.0f, 2.619f, -2.131f, 4.75f, -4.75f, 4.75f)
                close()
            }
        }
        .build()
        return _dove!!
    }

private var _dove: ImageVector? = null
