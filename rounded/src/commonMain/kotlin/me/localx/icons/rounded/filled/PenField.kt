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

public val Icons.Filled.PenField: ImageVector
    get() {
        if (_penField != null) {
            return _penField!!
        }
        _penField = Builder(name = "PenField", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.27f, 7.48f)
                lineTo(20.077f, 0.673f)
                curveToRelative(0.897f, -0.897f, 2.353f, -0.897f, 3.25f, 0.0f)
                reflectiveCurveToRelative(0.897f, 2.353f, 0.0f, 3.25f)
                lineToRelative(-6.807f, 6.807f)
                curveToRelative(-0.813f, 0.813f, -1.915f, 1.27f, -3.065f, 1.27f)
                horizontalLineToRelative(-1.455f)
                verticalLineToRelative(-1.455f)
                curveToRelative(0.0f, -1.15f, 0.457f, -2.252f, 1.27f, -3.065f)
                close()
                moveTo(20.747f, 9.332f)
                lineToRelative(-2.813f, 2.813f)
                curveToRelative(-1.188f, 1.188f, -2.798f, 1.855f, -4.478f, 1.855f)
                horizontalLineToRelative(-2.455f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-2.455f)
                curveToRelative(0.0f, -0.529f, 0.072f, -1.045f, 0.197f, -1.545f)
                horizontalLineToRelative(-5.197f)
                curveToRelative(-2.761f, 0.0f, -5.0f, 2.239f, -5.0f, 5.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 2.761f, 2.239f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.761f, 0.0f, 5.0f, -2.239f, 5.0f, -5.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -2.14f, -1.359f, -3.956f, -3.254f, -4.668f)
                close()
                moveTo(5.501f, 17.957f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(10.501f, 17.957f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _penField!!
    }

private var _penField: ImageVector? = null
