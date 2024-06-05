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

public val Icons.Filled.HatWizard: ImageVector
    get() {
        if (_hatWizard != null) {
            return _hatWizard!!
        }
        _hatWizard = Builder(name = "HatWizard", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.0f, 22.0f)
                horizontalLineToRelative(-0.15f)
                lineToRelative(-5.726f, -14.228f)
                curveToRelative(-0.104f, -0.259f, -0.1f, -0.549f, 0.011f, -0.804f)
                lineToRelative(2.547f, -3.731f)
                curveToRelative(0.025f, -0.038f, 0.048f, -0.076f, 0.068f, -0.117f)
                curveToRelative(0.366f, -0.732f, 0.29f, -1.595f, -0.2f, -2.252f)
                curveToRelative(-0.49f, -0.657f, -1.295f, -0.976f, -2.168f, -0.82f)
                lineToRelative(-3.096f, 0.768f)
                curveToRelative(-3.082f, 0.544f, -5.619f, 2.602f, -6.786f, 5.504f)
                lineTo(1.15f, 22.0f)
                horizontalLineToRelative(-0.15f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(22.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(9.78f, 12.22f)
                lineToRelative(-1.308f, -0.523f)
                curveToRelative(-0.285f, -0.114f, -0.472f, -0.39f, -0.472f, -0.697f)
                reflectiveCurveToRelative(0.187f, -0.583f, 0.472f, -0.697f)
                lineToRelative(1.308f, -0.523f)
                lineToRelative(0.523f, -1.308f)
                curveToRelative(0.114f, -0.285f, 0.39f, -0.472f, 0.697f, -0.472f)
                reflectiveCurveToRelative(0.583f, 0.187f, 0.697f, 0.472f)
                lineToRelative(0.52f, 1.301f)
                lineToRelative(1.299f, 0.492f)
                curveToRelative(0.287f, 0.108f, 0.479f, 0.381f, 0.484f, 0.687f)
                curveToRelative(0.005f, 0.307f, -0.176f, 0.586f, -0.459f, 0.705f)
                lineToRelative(-1.318f, 0.556f)
                lineToRelative(-0.526f, 1.316f)
                curveToRelative(-0.114f, 0.285f, -0.39f, 0.472f, -0.697f, 0.472f)
                reflectiveCurveToRelative(-0.583f, -0.187f, -0.697f, -0.472f)
                lineToRelative(-0.523f, -1.308f)
                close()
                moveTo(17.397f, 19.199f)
                lineToRelative(-1.538f, 0.648f)
                lineToRelative(-0.614f, 1.536f)
                curveToRelative(-0.133f, 0.332f, -0.455f, 0.55f, -0.813f, 0.55f)
                reflectiveCurveToRelative(-0.68f, -0.218f, -0.813f, -0.55f)
                lineToRelative(-0.611f, -1.527f)
                lineToRelative(-1.527f, -0.611f)
                curveToRelative(-0.332f, -0.133f, -0.55f, -0.455f, -0.55f, -0.813f)
                reflectiveCurveToRelative(0.218f, -0.68f, 0.55f, -0.813f)
                lineToRelative(1.527f, -0.611f)
                lineToRelative(0.611f, -1.527f)
                curveToRelative(0.133f, -0.332f, 0.455f, -0.55f, 0.813f, -0.55f)
                reflectiveCurveToRelative(0.68f, 0.218f, 0.813f, 0.55f)
                lineToRelative(0.607f, 1.518f)
                lineToRelative(1.515f, 0.574f)
                curveToRelative(0.335f, 0.126f, 0.558f, 0.444f, 0.565f, 0.802f)
                curveToRelative(0.006f, 0.358f, -0.206f, 0.684f, -0.535f, 0.822f)
                close()
            }
        }
        .build()
        return _hatWizard!!
    }

private var _hatWizard: ImageVector? = null
