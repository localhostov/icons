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

public val Icons.Bold.Farm: ImageVector
    get() {
        if (_farm != null) {
            return _farm!!
        }
        _farm = Builder(name = "Farm", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 8.0f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                close()
                moveTo(24.0f, 10.735f)
                verticalLineToRelative(7.765f)
                curveToRelative(0.0f, 3.033f, -2.467f, 5.5f, -5.5f, 5.5f)
                horizontalLineToRelative(-0.301f)
                curveToRelative(-0.932f, 0.0f, -1.599f, -0.753f, -1.709f, -1.679f)
                curveToRelative(-0.036f, -0.303f, -0.165f, -0.597f, -0.387f, -0.839f)
                lineToRelative(-2.061f, -2.232f)
                lineToRelative(2.061f, -2.232f)
                curveToRelative(0.562f, -0.609f, 0.524f, -1.558f, -0.084f, -2.12f)
                curveToRelative(-0.608f, -0.562f, -1.558f, -0.523f, -2.12f, 0.084f)
                lineToRelative(-1.898f, 2.056f)
                lineToRelative(-1.898f, -2.056f)
                curveToRelative(-0.561f, -0.608f, -1.51f, -0.646f, -2.12f, -0.084f)
                curveToRelative(-0.608f, 0.562f, -0.646f, 1.511f, -0.084f, 2.12f)
                lineToRelative(2.061f, 2.232f)
                lineToRelative(-1.992f, 2.158f)
                curveToRelative(-0.28f, 0.303f, -0.436f, 0.699f, -0.445f, 1.092f)
                curveToRelative(-0.004f, 0.83f, -0.678f, 1.5f, -1.507f, 1.5f)
                horizontalLineToRelative(-0.515f)
                curveToRelative(-3.033f, 0.0f, -5.5f, -2.467f, -5.5f, -5.5f)
                verticalLineToRelative(-7.765f)
                curveToRelative(0.0f, -0.892f, 0.261f, -1.755f, 0.756f, -2.497f)
                lineTo(3.576f, 4.01f)
                curveToRelative(0.485f, -0.729f, 1.167f, -1.295f, 1.972f, -1.64f)
                lineTo(10.228f, 0.364f)
                curveToRelative(1.126f, -0.482f, 2.418f, -0.483f, 3.545f, 0.0f)
                lineToRelative(4.68f, 2.005f)
                curveToRelative(0.804f, 0.345f, 1.486f, 0.912f, 1.971f, 1.641f)
                lineToRelative(2.82f, 4.229f)
                curveToRelative(0.495f, 0.741f, 0.756f, 1.604f, 0.756f, 2.496f)
                close()
                moveTo(21.0f, 10.735f)
                curveToRelative(0.0f, -0.297f, -0.087f, -0.585f, -0.252f, -0.832f)
                lineToRelative(-2.82f, -4.23f)
                curveToRelative(-0.162f, -0.243f, -0.389f, -0.432f, -0.656f, -0.546f)
                lineToRelative(-4.681f, -2.006f)
                curveToRelative(-0.376f, -0.162f, -0.807f, -0.162f, -1.181f, 0.0f)
                lineToRelative(-4.681f, 2.006f)
                curveToRelative(-0.268f, 0.115f, -0.495f, 0.303f, -0.657f, 0.546f)
                lineToRelative(-2.82f, 4.23f)
                curveToRelative(-0.165f, 0.247f, -0.252f, 0.535f, -0.252f, 0.832f)
                verticalLineToRelative(7.765f)
                curveToRelative(0.0f, 1.207f, 0.86f, 2.217f, 2.0f, 2.45f)
                verticalLineToRelative(-5.45f)
                curveToRelative(0.0f, -1.933f, 1.567f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(7.0f)
                curveToRelative(1.933f, 0.0f, 3.5f, 1.567f, 3.5f, 3.5f)
                verticalLineToRelative(5.45f)
                curveToRelative(1.14f, -0.232f, 2.0f, -1.242f, 2.0f, -2.45f)
                verticalLineToRelative(-7.765f)
                close()
                moveTo(9.708f, 24.0f)
                horizontalLineToRelative(4.604f)
                lineToRelative(-2.312f, -2.539f)
                lineToRelative(-2.292f, 2.539f)
                close()
            }
        }
        .build()
        return _farm!!
    }

private var _farm: ImageVector? = null
