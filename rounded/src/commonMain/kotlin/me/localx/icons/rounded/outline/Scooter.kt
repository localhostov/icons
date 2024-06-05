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

public val Icons.Outline.Scooter: ImageVector
    get() {
        if (_scooter != null) {
            return _scooter!!
        }
        _scooter = Builder(name = "Scooter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.724f, 17.023f)
                lineToRelative(-3.033f, -13.147f)
                curveToRelative(-0.527f, -2.282f, -2.53f, -3.875f, -4.872f, -3.875f)
                horizontalLineToRelative(-0.818f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(0.818f)
                curveToRelative(1.405f, 0.0f, 2.607f, 0.956f, 2.923f, 2.325f)
                lineToRelative(1.794f, 7.774f)
                lineToRelative(-3.109f, 3.8f)
                curveToRelative(-0.571f, 0.7f, -1.418f, 1.101f, -2.321f, 1.101f)
                lineTo(1.0f, 17.001f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(0.351f)
                curveToRelative(-0.219f, 0.456f, -0.351f, 0.961f, -0.351f, 1.5f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                curveToRelative(0.0f, -0.539f, -0.133f, -1.044f, -0.351f, -1.5f)
                horizontalLineToRelative(4.456f)
                curveToRelative(1.506f, 0.0f, 2.916f, -0.668f, 3.869f, -1.834f)
                lineToRelative(2.13f, -2.602f)
                lineToRelative(0.671f, 2.91f)
                curveToRelative(-1.054f, 0.604f, -1.775f, 1.727f, -1.775f, 3.027f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                curveToRelative(0.0f, -1.853f, -1.452f, -3.359f, -3.276f, -3.477f)
                close()
                moveTo(6.0f, 20.5f)
                curveToRelative(0.0f, 0.827f, -0.673f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.673f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.673f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                close()
                moveTo(20.5f, 22.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.673f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.673f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _scooter!!
    }

private var _scooter: ImageVector? = null
