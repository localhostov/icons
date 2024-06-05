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

public val Icons.Outline.Airplay: ImageVector
    get() {
        if (_airplay != null) {
            return _airplay!!
        }
        _airplay = Builder(name = "Airplay", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.497f, 13.169f)
                curveToRelative(-0.62f, -0.742f, -1.53f, -1.169f, -2.497f, -1.169f)
                reflectiveCurveToRelative(-1.877f, 0.427f, -2.502f, 1.176f)
                lineToRelative(-5.55f, 6.775f)
                curveToRelative(-0.461f, 0.563f, -0.555f, 1.323f, -0.243f, 1.981f)
                reflectiveCurveToRelative(0.958f, 1.067f, 1.687f, 1.067f)
                horizontalLineToRelative(13.215f)
                curveToRelative(0.729f, 0.0f, 1.375f, -0.409f, 1.687f, -1.066f)
                curveToRelative(0.312f, -0.658f, 0.22f, -1.418f, -0.242f, -1.983f)
                lineToRelative(-5.555f, -6.781f)
                close()
                moveTo(5.674f, 21.0f)
                lineToRelative(5.366f, -6.55f)
                curveToRelative(0.477f, -0.572f, 1.45f, -0.565f, 1.916f, -0.007f)
                lineToRelative(5.371f, 6.557f)
                lineTo(5.674f, 21.0f)
                close()
                moveTo(24.0f, 6.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 1.434f, -0.617f, 2.801f, -1.692f, 3.75f)
                curveToRelative(-0.19f, 0.168f, -0.427f, 0.25f, -0.662f, 0.25f)
                curveToRelative(-0.276f, 0.0f, -0.552f, -0.114f, -0.75f, -0.339f)
                curveToRelative(-0.365f, -0.414f, -0.326f, -1.046f, 0.089f, -1.411f)
                curveToRelative(0.646f, -0.569f, 1.016f, -1.39f, 1.016f, -2.25f)
                lineTo(22.001f, 6.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                lineTo(5.0f, 3.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 0.86f, 0.37f, 1.681f, 1.016f, 2.25f)
                curveToRelative(0.414f, 0.365f, 0.454f, 0.997f, 0.088f, 1.411f)
                curveToRelative(-0.366f, 0.414f, -0.996f, 0.455f, -1.412f, 0.089f)
                curveToRelative(-1.076f, -0.949f, -1.693f, -2.315f, -1.693f, -3.75f)
                lineTo(-0.001f, 6.0f)
                curveTo(0.0f, 3.243f, 2.243f, 1.0f, 5.0f, 1.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, 2.243f, 5.0f, 5.0f)
                close()
            }
        }
        .build()
        return _airplay!!
    }

private var _airplay: ImageVector? = null
