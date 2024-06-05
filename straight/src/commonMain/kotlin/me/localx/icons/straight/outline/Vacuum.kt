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

public val Icons.Outline.Vacuum: ImageVector
    get() {
        if (_vacuum != null) {
            return _vacuum!!
        }
        _vacuum = Builder(name = "Vacuum", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 16.257f)
                verticalLineToRelative(-2.757f)
                curveToRelative(0.0f, -2.886f, -1.892f, -5.336f, -4.5f, -6.182f)
                verticalLineToRelative(-2.318f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                horizontalLineToRelative(-2.509f)
                curveToRelative(-2.487f, 0.0f, -4.617f, 1.859f, -4.954f, 4.325f)
                lineToRelative(-2.41f, 17.679f)
                lineToRelative(-4.631f, 0.019f)
                lineToRelative(0.008f, 2.0f)
                lineToRelative(6.369f, -0.026f)
                lineToRelative(2.646f, -19.401f)
                curveToRelative(0.201f, -1.479f, 1.479f, -2.595f, 2.972f, -2.595f)
                horizontalLineToRelative(2.509f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(17.0f)
                horizontalLineToRelative(7.5f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                curveToRelative(0.0f, 0.539f, 0.133f, 1.044f, 0.351f, 1.5f)
                horizontalLineToRelative(-2.351f)
                verticalLineToRelative(-13.0f)
                horizontalLineToRelative(2.5f)
                curveToRelative(2.485f, 0.0f, 4.5f, 2.015f, 4.5f, 4.5f)
                verticalLineToRelative(1.712f)
                curveToRelative(0.742f, 0.21f, 1.421f, 0.567f, 2.0f, 1.045f)
                close()
                moveTo(19.0f, 20.5f)
                curveToRelative(0.0f, -0.827f, 0.673f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.673f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.673f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _vacuum!!
    }

private var _vacuum: ImageVector? = null
