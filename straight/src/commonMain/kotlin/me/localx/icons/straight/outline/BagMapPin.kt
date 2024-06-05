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

public val Icons.Outline.BagMapPin: ImageVector
    get() {
        if (_bagMapPin != null) {
            return _bagMapPin!!
        }
        _bagMapPin = Builder(name = "BagMapPin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 6.0f)
                curveToRelative(0.0f, -3.309f, -2.691f, -6.0f, -6.0f, -6.0f)
                reflectiveCurveTo(6.0f, 2.691f, 6.0f, 6.0f)
                lineTo(0.0f, 6.0f)
                verticalLineToRelative(15.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(6.147f)
                lineToRelative(-2.045f, -2.0f)
                lineTo(3.0f, 22.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                lineTo(2.0f, 8.0f)
                lineTo(6.0f, 8.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-4.103f)
                lineToRelative(-2.044f, 2.0f)
                horizontalLineToRelative(6.147f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                lineTo(24.0f, 6.0f)
                horizontalLineToRelative(-6.0f)
                close()
                moveTo(8.0f, 6.0f)
                curveToRelative(0.0f, -2.206f, 1.794f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.794f, 4.0f, 4.0f)
                lineTo(8.0f, 6.0f)
                close()
                moveTo(17.0f, 17.0f)
                curveToRelative(0.0f, -1.336f, -0.521f, -2.591f, -1.465f, -3.535f)
                curveToRelative(-0.944f, -0.945f, -2.2f, -1.465f, -3.535f, -1.465f)
                reflectiveCurveToRelative(-2.592f, 0.521f, -3.535f, 1.465f)
                curveToRelative(-0.944f, 0.943f, -1.465f, 2.199f, -1.465f, 3.535f)
                reflectiveCurveToRelative(0.521f, 2.592f, 1.473f, 3.543f)
                lineToRelative(3.527f, 3.45f)
                lineToRelative(3.535f, -3.458f)
                curveToRelative(0.944f, -0.943f, 1.465f, -2.199f, 1.465f, -3.535f)
                close()
                moveTo(14.129f, 19.113f)
                lineToRelative(-2.129f, 2.083f)
                lineToRelative(-2.121f, -2.075f)
                curveToRelative(-0.566f, -0.566f, -0.879f, -1.319f, -0.879f, -2.121f)
                reflectiveCurveToRelative(0.312f, -1.555f, 0.88f, -2.121f)
                curveToRelative(0.565f, -0.567f, 1.318f, -0.879f, 2.12f, -0.879f)
                reflectiveCurveToRelative(1.555f, 0.312f, 2.121f, 0.879f)
                curveToRelative(0.566f, 0.566f, 0.879f, 1.319f, 0.879f, 2.121f)
                reflectiveCurveToRelative(-0.313f, 1.555f, -0.871f, 2.113f)
                close()
            }
        }
        .build()
        return _bagMapPin!!
    }

private var _bagMapPin: ImageVector? = null
