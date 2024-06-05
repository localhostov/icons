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

public val Icons.Outline.Wave: ImageVector
    get() {
        if (_wave != null) {
            return _wave!!
        }
        _wave = Builder(name = "Wave", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.01f, 22.631f)
                curveToRelative(-0.76f, 0.87f, -1.856f, 1.369f, -3.01f, 1.369f)
                curveToRelative(-1.201f, 0.0f, -2.266f, -0.542f, -3.0f, -1.382f)
                curveToRelative(-0.734f, 0.84f, -1.799f, 1.382f, -3.0f, 1.382f)
                reflectiveCurveToRelative(-2.266f, -0.542f, -3.0f, -1.382f)
                curveToRelative(-0.734f, 0.84f, -1.8f, 1.382f, -3.0f, 1.382f)
                reflectiveCurveToRelative(-2.266f, -0.542f, -3.0f, -1.382f)
                curveToRelative(-0.734f, 0.84f, -1.8f, 1.382f, -3.0f, 1.382f)
                curveToRelative(-1.153f, 0.0f, -2.25f, -0.499f, -3.009f, -1.368f)
                lineToRelative(1.506f, -1.316f)
                curveToRelative(0.38f, 0.436f, 0.928f, 0.685f, 1.503f, 0.685f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.897f, 2.0f, -2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.897f, 2.0f, -2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                curveToRelative(0.575f, 0.0f, 1.123f, -0.249f, 1.502f, -0.684f)
                lineToRelative(1.508f, 1.314f)
                close()
                moveTo(7.0f, 14.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -4.708f, 3.633f, -8.583f, 8.243f, -8.968f)
                curveToRelative(-2.502f, 1.456f, -4.243f, 4.292f, -4.243f, 7.468f)
                curveToRelative(0.0f, 5.163f, 2.552f, 8.5f, 6.5f, 8.5f)
                curveToRelative(1.398f, 0.0f, 2.59f, -0.631f, 3.401f, -1.502f)
                curveToRelative(0.734f, 0.909f, 1.843f, 1.502f, 3.099f, 1.502f)
                verticalLineToRelative(-2.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, 0.806f, -1.05f, 2.0f, -2.5f, 2.0f)
                curveToRelative(-2.817f, 0.0f, -4.5f, -2.43f, -4.5f, -6.5f)
                curveToRelative(0.0f, -3.139f, 2.411f, -6.5f, 6.0f, -6.5f)
                curveToRelative(0.542f, 0.0f, 1.069f, 0.124f, 1.558f, 0.257f)
                lineToRelative(0.777f, 0.167f)
                lineToRelative(0.869f, -1.559f)
                lineToRelative(-0.876f, -0.486f)
                curveToRelative(-1.625f, -0.902f, -3.468f, -1.379f, -5.328f, -1.379f)
                curveTo(9.935f, 0.0f, 5.0f, 4.935f, 5.0f, 11.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                curveToRelative(-0.575f, 0.0f, -1.123f, -0.249f, -1.503f, -0.685f)
                lineTo(-0.009f, 16.632f)
                curveToRelative(0.759f, 0.869f, 1.856f, 1.368f, 3.009f, 1.368f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.794f, 4.0f, -4.0f)
                close()
            }
        }
        .build()
        return _wave!!
    }

private var _wave: ImageVector? = null
