package me.localx.icons.rounded.filled

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

public val Icons.Filled.PlugCircleBolt: ImageVector
    get() {
        if (_plugCircleBolt != null) {
            return _plugCircleBolt!!
        }
        _plugCircleBolt = Builder(name = "PlugCircleBolt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 23.0f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                curveToRelative(0.0f, 0.0f, 0.006f, -3.813f, 0.008f, -4.061f)
                curveToRelative(-3.945f, -0.484f, -7.008f, -3.814f, -7.008f, -7.839f)
                verticalLineToRelative(-3.101f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.447f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(3.0f)
                lineTo(4.0f, 1.0f)
                curveToRelative(0.0f, -0.553f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                lineTo(6.0f, 6.0f)
                horizontalLineToRelative(6.0f)
                lineTo(12.0f, 1.0f)
                curveToRelative(0.0f, -0.553f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                lineTo(14.0f, 6.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.447f, 1.0f, -1.0f, 1.0f)
                verticalLineToRelative(2.069f)
                curveToRelative(-3.945f, 0.493f, -7.0f, 3.852f, -7.0f, 7.931f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(24.0f, 18.0f)
                curveToRelative(0.0f, 3.314f, -2.686f, 6.0f, -6.0f, 6.0f)
                reflectiveCurveToRelative(-6.0f, -2.686f, -6.0f, -6.0f)
                reflectiveCurveToRelative(2.686f, -6.0f, 6.0f, -6.0f)
                reflectiveCurveToRelative(6.0f, 2.686f, 6.0f, 6.0f)
                close()
                moveTo(20.731f, 19.493f)
                curveToRelative(0.327f, -0.494f, 0.357f, -1.123f, 0.077f, -1.645f)
                reflectiveCurveToRelative(-0.821f, -0.846f, -1.413f, -0.846f)
                horizontalLineToRelative(-2.029f)
                lineToRelative(1.469f, -2.431f)
                curveToRelative(0.304f, -0.466f, 0.176f, -1.091f, -0.287f, -1.4f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.462f, -0.308f, -1.084f, -0.189f, -1.399f, 0.268f)
                curveToRelative(-0.629f, 0.914f, -1.766f, 2.799f, -2.08f, 3.48f)
                curveToRelative(-0.213f, 0.462f, -0.054f, 1.022f, 0.249f, 1.431f)
                curveToRelative(0.303f, 0.408f, 0.788f, 0.652f, 1.297f, 0.652f)
                horizontalLineToRelative(2.035f)
                lineToRelative(-1.471f, 2.429f)
                curveToRelative(-0.318f, 0.458f, -0.2f, 1.087f, 0.262f, 1.398f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.454f, 0.305f, 1.068f, 0.189f, 1.379f, -0.261f)
                lineToRelative(1.911f, -3.077f)
                horizontalLineToRelative(0.0f)
                close()
            }
        }
        .build()
        return _plugCircleBolt!!
    }

private var _plugCircleBolt: ImageVector? = null
