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
                lineToRelative(-3.392f, -14.696f)
                curveToRelative(-0.315f, -1.37f, -1.518f, -2.326f, -2.923f, -2.326f)
                horizontalLineToRelative(-3.409f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.409f)
                curveToRelative(0.469f, 0.0f, 0.869f, 0.318f, 0.974f, 0.775f)
                lineToRelative(2.152f, 9.325f)
                lineToRelative(-4.008f, 4.9f)
                lineTo(0.0f, 17.001f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.351f)
                curveToRelative(-0.219f, 0.456f, -0.351f, 0.961f, -0.351f, 1.5f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                curveToRelative(0.0f, -0.539f, -0.133f, -1.044f, -0.351f, -1.5f)
                horizontalLineToRelative(6.825f)
                lineToRelative(3.63f, -4.436f)
                lineToRelative(0.671f, 2.909f)
                curveToRelative(-1.054f, 0.604f, -1.775f, 1.727f, -1.775f, 3.026f)
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
