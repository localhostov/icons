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

public val Icons.Outline.PipeSmoking: ImageVector
    get() {
        if (_pipeSmoking != null) {
            return _pipeSmoking!!
        }
        _pipeSmoking = Builder(name = "PipeSmoking", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 0.0f)
                curveToRelative(-1.22f, 0.0f, -2.362f, 0.6f, -3.057f, 1.604f)
                lineToRelative(-6.568f, 9.498f)
                curveToRelative(-1.157f, -0.29f, -2.423f, 0.119f, -3.193f, 1.158f)
                lineToRelative(-0.662f, 0.983f)
                curveToRelative(-0.018f, -0.078f, -0.15f, -0.67f, -0.15f, -0.67f)
                curveToRelative(-0.205f, -0.918f, -1.006f, -1.562f, -1.948f, -1.563f)
                lineToRelative(-4.61f, -0.008f)
                horizontalLineToRelative(-0.004f)
                curveToRelative(-0.93f, 0.0f, -1.75f, 0.657f, -1.952f, 1.563f)
                lineToRelative(-0.1f, 0.445f)
                curveTo(0.366f, 14.739f, -0.002f, 16.371f, 0.0f, 19.021f)
                curveToRelative(0.003f, 2.745f, 2.245f, 4.979f, 5.0f, 4.979f)
                horizontalLineToRelative(1.055f)
                curveToRelative(2.191f, 0.0f, 4.25f, -1.071f, 5.521f, -2.888f)
                lineToRelative(3.543f, -5.354f)
                curveToRelative(0.47f, -0.673f, 0.645f, -1.488f, 0.492f, -2.295f)
                curveToRelative(-0.088f, -0.468f, -0.291f, -0.89f, -0.57f, -1.257f)
                lineTo(21.588f, 2.74f)
                curveToRelative(0.321f, -0.463f, 0.849f, -0.74f, 1.412f, -0.74f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(13.465f, 14.635f)
                lineToRelative(-3.542f, 5.352f)
                curveToRelative(-0.883f, 1.261f, -2.329f, 2.014f, -3.868f, 2.014f)
                horizontalLineToRelative(-1.055f)
                curveToRelative(-1.652f, 0.0f, -2.999f, -1.337f, -3.0f, -2.98f)
                curveToRelative(-0.002f, -2.427f, 0.326f, -3.883f, 0.706f, -5.568f)
                lineToRelative(0.101f, -0.449f)
                lineToRelative(4.61f, 0.007f)
                lineToRelative(0.098f, 0.438f)
                curveToRelative(0.188f, 0.834f, 0.365f, 1.621f, 0.496f, 2.505f)
                curveToRelative(0.061f, 0.409f, 0.365f, 0.738f, 0.769f, 0.83f)
                curveToRelative(0.402f, 0.091f, 0.82f, -0.075f, 1.05f, -0.417f)
                lineToRelative(1.984f, -2.949f)
                curveToRelative(0.327f, -0.439f, 0.939f, -0.544f, 1.394f, -0.242f)
                curveToRelative(0.231f, 0.154f, 0.388f, 0.39f, 0.438f, 0.663f)
                curveToRelative(0.052f, 0.273f, -0.007f, 0.55f, -0.181f, 0.799f)
                close()
            }
        }
        .build()
        return _pipeSmoking!!
    }

private var _pipeSmoking: ImageVector? = null
