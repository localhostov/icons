package me.localx.icons.straight.bold

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

public val Icons.Bold.TrainTram: ImageVector
    get() {
        if (_trainTram != null) {
            return _trainTram!!
        }
        _trainTram = Builder(name = "TrainTram", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 9.5f)
                curveToRelative(0.0f, -2.481f, -2.019f, -4.5f, -4.5f, -4.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.948f)
                curveToRelative(2.868f, 0.194f, 5.018f, 0.869f, 5.043f, 0.877f)
                lineToRelative(0.916f, -2.856f)
                curveToRelative(-0.136f, -0.044f, -3.382f, -1.072f, -7.459f, -1.072f)
                reflectiveCurveTo(4.677f, 1.028f, 4.541f, 1.072f)
                lineToRelative(0.918f, 2.855f)
                curveToRelative(0.025f, -0.008f, 2.159f, -0.683f, 5.041f, -0.877f)
                verticalLineToRelative(1.949f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-2.481f, 0.0f, -4.5f, 2.019f, -4.5f, 4.5f)
                verticalLineToRelative(12.5f)
                horizontalLineToRelative(3.763f)
                lineToRelative(-1.225f, 2.0f)
                horizontalLineToRelative(3.231f)
                lineToRelative(1.225f, -2.0f)
                horizontalLineToRelative(4.127f)
                lineToRelative(1.225f, 2.0f)
                horizontalLineToRelative(3.154f)
                lineToRelative(-1.225f, -2.0f)
                horizontalLineToRelative(3.725f)
                lineTo(21.0f, 9.5f)
                close()
                moveTo(10.5f, 10.0f)
                verticalLineToRelative(3.0f)
                lineTo(6.0f, 13.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(4.5f)
                close()
                moveTo(13.5f, 13.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-4.5f)
                close()
                moveTo(6.0f, 19.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                lineTo(6.0f, 19.0f)
                close()
            }
        }
        .build()
        return _trainTram!!
    }

private var _trainTram: ImageVector? = null
