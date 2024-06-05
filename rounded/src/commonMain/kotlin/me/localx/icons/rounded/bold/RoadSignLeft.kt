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

public val Icons.Bold.RoadSignLeft: ImageVector
    get() {
        if (_roadSignLeft != null) {
            return _roadSignLeft!!
        }
        _roadSignLeft = Builder(name = "RoadSignLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.405f, 8.145f)
                lineTo(15.854f, 1.593f)
                curveTo(14.827f, 0.566f, 13.459f, 0.0f, 11.999f, 0.0f)
                reflectiveCurveToRelative(-2.827f, 0.565f, -3.854f, 1.592f)
                lineTo(1.595f, 8.144f)
                curveToRelative(-2.125f, 2.125f, -2.125f, 5.583f, 0.0f, 7.708f)
                lineToRelative(6.551f, 6.552f)
                curveToRelative(1.062f, 1.063f, 2.458f, 1.594f, 3.854f, 1.594f)
                reflectiveCurveToRelative(2.792f, -0.531f, 3.854f, -1.594f)
                lineToRelative(6.551f, -6.552f)
                curveToRelative(2.125f, -2.125f, 2.125f, -5.583f, 0.0f, -7.708f)
                close()
                moveTo(20.284f, 13.731f)
                lineToRelative(-6.551f, 6.552f)
                curveToRelative(-0.957f, 0.956f, -2.512f, 0.955f, -3.467f, 0.0f)
                lineToRelative(-6.551f, -6.552f)
                curveToRelative(-0.955f, -0.956f, -0.955f, -2.51f, 0.0f, -3.466f)
                lineToRelative(6.551f, -6.551f)
                curveToRelative(0.46f, -0.46f, 1.075f, -0.713f, 1.732f, -0.713f)
                reflectiveCurveToRelative(1.273f, 0.253f, 1.733f, 0.713f)
                lineToRelative(6.552f, 6.552f)
                curveToRelative(0.955f, 0.956f, 0.955f, 2.51f, 0.0f, 3.465f)
                close()
                moveTo(16.0f, 14.5f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.829f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.671f, -1.5f, -1.5f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.827f, -0.673f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(1.347f)
                curveToRelative(0.0f, 0.652f, -0.786f, 0.98f, -1.25f, 0.522f)
                lineToRelative(-3.008f, -2.969f)
                curveToRelative(-0.323f, -0.319f, -0.323f, -0.841f, 0.0f, -1.159f)
                lineToRelative(3.008f, -2.969f)
                curveToRelative(0.464f, -0.458f, 1.25f, -0.129f, 1.25f, 0.522f)
                verticalLineToRelative(1.706f)
                horizontalLineToRelative(1.5f)
                curveToRelative(2.481f, 0.0f, 4.5f, 2.019f, 4.5f, 4.5f)
                close()
            }
        }
        .build()
        return _roadSignLeft!!
    }

private var _roadSignLeft: ImageVector? = null
