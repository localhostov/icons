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

public val Icons.Outline.Dolphin: ImageVector
    get() {
        if (_dolphin != null) {
            return _dolphin!!
        }
        _dolphin = Builder(name = "Dolphin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 7.0f)
                horizontalLineToRelative(-0.062f)
                curveToRelative(-0.448f, -3.623f, -3.327f, -7.0f, -8.438f, -7.0f)
                curveToRelative(-2.004f, 0.0f, -4.135f, 0.486f, -6.012f, 1.608f)
                curveTo(5.99f, 0.906f, 3.953f, 0.248f, 1.313f, 0.004f)
                curveTo(0.394f, -0.081f, -0.451f, 1.127f, 0.273f, 1.699f)
                curveToRelative(1.591f, 1.259f, 2.661f, 2.666f, 3.379f, 3.936f)
                curveToRelative(-1.025f, 1.889f, -1.651f, 4.314f, -1.651f, 7.365f)
                curveToRelative(0.0f, 2.432f, 0.611f, 4.698f, 1.076f, 6.07f)
                curveToRelative(-1.822f, 0.904f, -3.076f, 2.792f, -3.076f, 4.959f)
                curveToRelative(4.173f, 0.0f, 5.5f, -2.776f, 5.5f, -2.776f)
                curveToRelative(0.0f, 0.0f, 1.378f, 2.776f, 5.5f, 2.776f)
                curveToRelative(0.0f, -2.306f, -1.419f, -4.295f, -3.431f, -5.12f)
                curveToRelative(0.206f, -1.705f, 0.859f, -3.544f, 1.754f, -4.842f)
                curveToRelative(0.809f, -1.173f, 1.865f, -1.917f, 2.977f, -2.378f)
                curveToRelative(0.487f, 0.851f, 1.042f, 2.166f, 1.7f, 3.81f)
                curveToRelative(0.989f, -1.978f, 1.454f, -3.407f, 1.636f, -4.491f)
                curveToRelative(0.158f, -0.006f, 8.364f, -0.009f, 8.364f, -0.009f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(20.0f, 9.0f)
                horizontalLineToRelative(-3.899f)
                curveToRelative(-3.737f, 0.0f, -6.65f, 1.359f, -8.424f, 3.933f)
                curveToRelative(-1.052f, 1.525f, -1.807f, 3.593f, -2.072f, 5.571f)
                curveToRelative(-0.035f, 0.0f, -0.436f, 0.007f, -0.598f, 0.021f)
                curveToRelative(-0.417f, -1.215f, -1.006f, -3.319f, -1.006f, -5.525f)
                curveTo(4.0f, 2.53f, 11.914f, 2.0f, 13.5f, 2.0f)
                curveToRelative(4.466f, 0.0f, 6.5f, 3.11f, 6.5f, 6.0f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _dolphin!!
    }

private var _dolphin: ImageVector? = null
