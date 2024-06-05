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

public val Icons.Filled.FanTable: ImageVector
    get() {
        if (_fanTable != null) {
            return _fanTable!!
        }
        _fanTable = Builder(name = "FanTable", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.771f, 14.924f)
                curveToRelative(-0.732f, 0.839f, -2.057f, 0.757f, -2.678f, -0.18f)
                lineToRelative(-0.03f, -0.044f)
                curveToRelative(-0.615f, -0.927f, -0.161f, -2.179f, 0.902f, -2.507f)
                curveToRelative(1.518f, -0.468f, 3.435f, -0.955f, 4.946f, -1.256f)
                curveToRelative(-0.9f, 1.244f, -2.086f, 2.777f, -3.141f, 3.986f)
                close()
                moveTo(7.924f, 0.932f)
                curveToRelative(-3.202f, 1.529f, -5.424f, 4.79f, -5.424f, 8.568f)
                curveToRelative(0.0f, 0.473f, 0.046f, 0.935f, 0.113f, 1.39f)
                curveToRelative(1.945f, -0.767f, 5.57f, -1.721f, 7.883f, -2.089f)
                curveToRelative(-0.914f, -2.125f, -2.212f, -5.764f, -2.572f, -7.869f)
                close()
                moveTo(12.0f, 7.227f)
                curveToRelative(0.599f, -1.489f, 1.274f, -3.421f, 1.709f, -4.962f)
                curveToRelative(0.321f, -1.137f, -0.528f, -2.265f, -1.709f, -2.265f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-1.181f, 0.0f, -2.031f, 1.128f, -1.709f, 2.265f)
                curveToRelative(0.436f, 1.541f, 1.111f, 3.473f, 1.709f, 4.962f)
                close()
                moveTo(16.076f, 0.932f)
                curveToRelative(-0.36f, 2.106f, -1.658f, 5.744f, -2.572f, 7.869f)
                curveToRelative(2.313f, 0.368f, 5.938f, 1.323f, 7.883f, 2.089f)
                curveToRelative(0.067f, -0.455f, 0.113f, -0.916f, 0.113f, -1.39f)
                curveToRelative(0.0f, -3.778f, -2.223f, -7.039f, -5.424f, -8.568f)
                close()
                moveTo(18.995f, 12.181f)
                curveToRelative(-1.512f, -0.464f, -3.408f, -0.946f, -4.906f, -1.243f)
                curveToRelative(0.896f, 1.239f, 2.076f, 2.764f, 3.127f, 3.971f)
                curveToRelative(0.738f, 0.847f, 2.076f, 0.764f, 2.697f, -0.173f)
                curveToRelative(0.627f, -0.945f, 0.166f, -2.222f, -0.918f, -2.555f)
                close()
                moveTo(17.001f, 22.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-3.072f)
                curveToRelative(1.445f, -0.155f, 2.796f, -0.622f, 3.976f, -1.351f)
                curveToRelative(-1.57f, -1.54f, -3.72f, -4.342f, -4.976f, -6.131f)
                curveToRelative(-1.256f, 1.789f, -3.405f, 4.592f, -4.976f, 6.131f)
                curveToRelative(1.18f, 0.729f, 2.531f, 1.196f, 3.976f, 1.351f)
                verticalLineToRelative(3.072f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _fanTable!!
    }

private var _fanTable: ImageVector? = null
