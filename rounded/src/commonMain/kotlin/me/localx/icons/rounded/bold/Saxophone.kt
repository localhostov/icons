package me.localx.icons.rounded.bold

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

public val Icons.Bold.Saxophone: ImageVector
    get() {
        if (_saxophone != null) {
            return _saxophone!!
        }
        _saxophone = Builder(name = "Saxophone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.5f, 0.0f)
                horizontalLineToRelative(-0.524f)
                curveToRelative(-1.544f, 0.0f, -2.888f, 0.991f, -3.344f, 2.465f)
                curveToRelative(-0.021f, 0.067f, -0.042f, 0.136f, -0.064f, 0.206f)
                curveToRelative(-0.441f, -0.14f, -0.804f, -0.258f, -1.015f, -0.33f)
                curveToRelative(-0.79f, -0.269f, -1.637f, 0.152f, -1.904f, 0.936f)
                curveToRelative(-0.268f, 0.784f, 0.151f, 1.637f, 0.936f, 1.904f)
                curveToRelative(0.226f, 0.077f, 0.62f, 0.204f, 1.097f, 0.356f)
                curveToRelative(-0.153f, 0.495f, -0.314f, 1.011f, -0.478f, 1.541f)
                curveToRelative(-0.491f, -0.155f, -0.896f, -0.286f, -1.125f, -0.364f)
                curveToRelative(-0.788f, -0.268f, -1.637f, 0.152f, -1.904f, 0.936f)
                curveToRelative(-0.268f, 0.784f, 0.151f, 1.637f, 0.936f, 1.904f)
                curveToRelative(0.241f, 0.082f, 0.673f, 0.221f, 1.195f, 0.386f)
                curveToRelative(-0.918f, 2.661f, -2.819f, 6.06f, -4.304f, 6.06f)
                curveToRelative(-0.265f, 0.0f, -0.968f, 0.0f, -1.0f, -1.0f)
                verticalLineToRelative(-1.485f)
                curveToRelative(0.0f, -0.054f, 0.038f, -1.319f, 0.917f, -1.574f)
                curveToRelative(0.718f, -0.208f, 1.173f, -0.912f, 1.068f, -1.651f)
                curveToRelative(-0.105f, -0.74f, -0.738f, -1.29f, -1.485f, -1.29f)
                lineTo(1.5f, 9.0f)
                curveToRelative(-0.747f, 0.0f, -1.38f, 0.55f, -1.485f, 1.29f)
                curveToRelative(-0.104f, 0.739f, 0.351f, 1.443f, 1.068f, 1.651f)
                curveToRelative(0.879f, 0.254f, 0.916f, 1.52f, 0.917f, 1.579f)
                lineToRelative(0.031f, 2.32f)
                curveToRelative(0.0f, 3.161f, 1.31f, 5.747f, 3.594f, 7.096f)
                curveToRelative(1.202f, 0.71f, 2.541f, 1.072f, 3.883f, 1.072f)
                curveToRelative(0.876f, 0.0f, 1.753f, -0.154f, 2.593f, -0.465f)
                curveToRelative(2.129f, -0.789f, 3.769f, -2.472f, 4.499f, -4.618f)
                curveToRelative(0.718f, -2.109f, 4.758f, -15.115f, 4.899f, -15.573f)
                curveToRelative(0.064f, -0.21f, 0.256f, -0.351f, 0.477f, -0.351f)
                horizontalLineToRelative(0.524f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(11.06f, 20.729f)
                curveToRelative(-1.296f, 0.479f, -2.685f, 0.346f, -3.909f, -0.376f)
                curveToRelative(-1.913f, -1.129f, -2.119f, -3.532f, -2.119f, -4.533f)
                lineToRelative(-0.031f, -2.32f)
                curveToRelative(0.0f, -0.419f, -0.065f, -0.949f, -0.233f, -1.5f)
                horizontalLineToRelative(3.467f)
                curveToRelative(-0.168f, 0.551f, -0.233f, 1.081f, -0.233f, 1.5f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 1.608f, 1.065f, 4.0f, 4.0f, 4.0f)
                curveToRelative(0.492f, 0.0f, 0.96f, -0.09f, 1.403f, -0.251f)
                curveToRelative(-0.52f, 0.907f, -1.342f, 1.609f, -2.344f, 1.98f)
                close()
            }
        }
        .build()
        return _saxophone!!
    }

private var _saxophone: ImageVector? = null
