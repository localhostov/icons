package me.localx.icons.straight.filled

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

public val Icons.Filled.TrainTram: ImageVector
    get() {
        if (_trainTram != null) {
            return _trainTram!!
        }
        _trainTram = Builder(name = "TrainTram", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 10.0f)
                verticalLineToRelative(4.0f)
                lineTo(13.0f, 14.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(8.0f)
                close()
                moveTo(11.0f, 10.0f)
                lineTo(3.0f, 10.0f)
                verticalLineToRelative(4.0f)
                lineTo(11.0f, 14.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(18.0f, 17.0f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                lineTo(8.0f, 16.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                lineTo(3.0f, 16.0f)
                verticalLineToRelative(6.0f)
                lineTo(7.225f, 22.0f)
                lineToRelative(-1.225f, 2.0f)
                horizontalLineToRelative(2.345f)
                lineToRelative(1.225f, -2.0f)
                horizontalLineToRelative(4.86f)
                lineToRelative(1.225f, 2.0f)
                horizontalLineToRelative(2.345f)
                lineToRelative(-1.225f, -2.0f)
                horizontalLineToRelative(4.225f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(17.0f, 5.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(13.0f, 2.025f)
                curveToRelative(3.199f, 0.144f, 5.668f, 0.918f, 5.694f, 0.927f)
                lineToRelative(0.611f, -1.904f)
                curveToRelative(-0.133f, -0.043f, -3.307f, -1.048f, -7.306f, -1.048f)
                reflectiveCurveTo(4.827f, 1.005f, 4.694f, 1.048f)
                lineToRelative(0.611f, 1.904f)
                curveToRelative(0.027f, -0.009f, 2.483f, -0.784f, 5.694f, -0.927f)
                verticalLineToRelative(2.975f)
                lineTo(7.0f, 5.0f)
                curveToRelative(-1.859f, 0.0f, -3.411f, 1.279f, -3.858f, 3.0f)
                lineTo(20.858f, 8.0f)
                curveToRelative(-0.447f, -1.721f, -1.999f, -3.0f, -3.858f, -3.0f)
                close()
            }
        }
        .build()
        return _trainTram!!
    }

private var _trainTram: ImageVector? = null
