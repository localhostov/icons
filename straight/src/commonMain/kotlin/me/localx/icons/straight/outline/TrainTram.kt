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

public val Icons.Outline.TrainTram: ImageVector
    get() {
        if (_trainTram != null) {
            return _trainTram!!
        }
        _trainTram = Builder(name = "TrainTram", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 9.0f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(13.0f, 2.023f)
                curveToRelative(3.2f, 0.144f, 5.668f, 0.921f, 5.694f, 0.929f)
                lineToRelative(0.611f, -1.904f)
                curveToRelative(-0.133f, -0.043f, -3.307f, -1.048f, -7.306f, -1.048f)
                reflectiveCurveTo(4.827f, 1.005f, 4.694f, 1.048f)
                lineToRelative(0.611f, 1.904f)
                curveToRelative(0.027f, -0.009f, 2.482f, -0.786f, 5.694f, -0.93f)
                verticalLineToRelative(2.977f)
                lineTo(7.0f, 4.999f)
                curveToRelative(-2.206f, 0.0f, -4.0f, 1.794f, -4.0f, 4.0f)
                verticalLineToRelative(13.0f)
                lineTo(7.225f, 21.999f)
                lineToRelative(-1.225f, 2.0f)
                horizontalLineToRelative(2.345f)
                lineToRelative(1.225f, -2.0f)
                horizontalLineToRelative(4.86f)
                lineToRelative(1.225f, 2.0f)
                horizontalLineToRelative(2.345f)
                lineToRelative(-1.225f, -2.0f)
                horizontalLineToRelative(4.225f)
                lineTo(21.0f, 9.0f)
                close()
                moveTo(7.0f, 7.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                lineTo(5.0f, 9.0f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                close()
                moveTo(13.0f, 14.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-6.0f)
                close()
                moveTo(5.0f, 14.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(3.0f)
                lineTo(5.0f, 14.0f)
                close()
                moveTo(5.0f, 20.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.553f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.553f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                lineTo(5.0f, 20.0f)
                close()
            }
        }
        .build()
        return _trainTram!!
    }

private var _trainTram: ImageVector? = null
