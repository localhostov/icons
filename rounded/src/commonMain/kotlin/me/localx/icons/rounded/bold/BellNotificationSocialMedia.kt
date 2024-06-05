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

public val Icons.Bold.BellNotificationSocialMedia: ImageVector
    get() {
        if (_bellNotificationSocialMedia != null) {
            return _bellNotificationSocialMedia!!
        }
        _bellNotificationSocialMedia = Builder(name = "BellNotificationSocialMedia", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.0f, 3.5f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                close()
                moveTo(21.86f, 10.157f)
                curveToRelative(-0.189f, -0.807f, -0.996f, -1.311f, -1.803f, -1.117f)
                curveToRelative(-0.807f, 0.189f, -1.307f, 0.997f, -1.117f, 1.803f)
                lineToRelative(1.003f, 4.263f)
                curveToRelative(0.128f, 0.459f, 0.039f, 0.92f, -0.252f, 1.301f)
                curveToRelative(-0.292f, 0.383f, -0.722f, 0.594f, -1.208f, 0.594f)
                lineTo(5.516f, 17.001f)
                curveToRelative(-0.464f, 0.0f, -0.896f, -0.205f, -1.185f, -0.563f)
                curveToRelative(-0.287f, -0.354f, -0.394f, -0.812f, -0.311f, -1.193f)
                lineToRelative(1.983f, -7.368f)
                curveToRelative(0.642f, -2.87f, 3.159f, -4.875f, 6.122f, -4.875f)
                curveToRelative(0.37f, 0.0f, 0.743f, 0.033f, 1.11f, 0.099f)
                curveToRelative(0.812f, 0.146f, 1.595f, -0.396f, 1.74f, -1.213f)
                curveToRelative(0.146f, -0.815f, -0.397f, -1.595f, -1.213f, -1.74f)
                curveToRelative(-0.54f, -0.097f, -1.091f, -0.146f, -1.637f, -0.146f)
                curveTo(7.748f, 0.0f, 4.027f, 2.97f, 3.092f, 7.158f)
                lineToRelative(-1.983f, 7.367f)
                curveToRelative(-0.3f, 1.341f, 0.023f, 2.724f, 0.887f, 3.795f)
                curveToRelative(0.861f, 1.067f, 2.144f, 1.68f, 3.52f, 1.68f)
                horizontalLineToRelative(1.4f)
                curveToRelative(0.563f, 2.293f, 2.617f, 4.0f, 5.084f, 4.0f)
                reflectiveCurveToRelative(4.521f, -1.707f, 5.084f, -4.0f)
                horizontalLineToRelative(1.4f)
                curveToRelative(1.422f, 0.0f, 2.731f, -0.646f, 3.592f, -1.772f)
                curveToRelative(0.864f, -1.129f, 1.14f, -2.562f, 0.772f, -3.869f)
                lineToRelative(-0.987f, -4.201f)
                close()
            }
        }
        .build()
        return _bellNotificationSocialMedia!!
    }

private var _bellNotificationSocialMedia: ImageVector? = null
