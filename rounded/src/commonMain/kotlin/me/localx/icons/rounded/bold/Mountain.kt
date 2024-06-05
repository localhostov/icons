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

public val Icons.Bold.Mountain: ImageVector
    get() {
        if (_mountain != null) {
            return _mountain!!
        }
        _mountain = Builder(name = "Mountain", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.58f, 18.677f)
                lineTo(14.844f, 1.754f)
                curveTo(14.284f, 0.7f, 13.194f, 0.044f, 12.0f, 0.044f)
                reflectiveCurveToRelative(-2.284f, 0.655f, -2.853f, 1.726f)
                lineTo(0.423f, 18.67f)
                curveToRelative(-0.599f, 1.134f, -0.562f, 2.467f, 0.099f, 3.567f)
                curveToRelative(0.663f, 1.104f, 1.827f, 1.762f, 3.114f, 1.762f)
                horizontalLineToRelative(16.728f)
                curveToRelative(1.287f, 0.0f, 2.452f, -0.659f, 3.114f, -1.762f)
                curveToRelative(0.663f, -1.104f, 0.698f, -2.44f, 0.102f, -3.561f)
                close()
                moveTo(20.907f, 20.693f)
                curveToRelative(-0.069f, 0.115f, -0.231f, 0.307f, -0.543f, 0.307f)
                lineTo(3.636f, 21.0f)
                curveToRelative(-0.312f, 0.0f, -0.474f, -0.192f, -0.543f, -0.307f)
                reflectiveCurveToRelative(-0.163f, -0.348f, -0.016f, -0.623f)
                curveToRelative(0.003f, -0.005f, 0.006f, -0.011f, 0.009f, -0.017f)
                lineToRelative(4.813f, -9.325f)
                lineToRelative(1.783f, 2.823f)
                curveToRelative(0.379f, 0.6f, 1.254f, 0.598f, 1.63f, -0.004f)
                lineToRelative(1.688f, -2.701f)
                lineToRelative(0.98f, 1.617f)
                curveToRelative(0.378f, 0.624f, 1.286f, 0.617f, 1.654f, -0.012f)
                lineToRelative(0.721f, -1.231f)
                lineToRelative(4.568f, 8.85f)
                curveToRelative(0.146f, 0.275f, 0.053f, 0.508f, -0.016f, 0.623f)
                close()
            }
        }
        .build()
        return _mountain!!
    }

private var _mountain: ImageVector? = null
