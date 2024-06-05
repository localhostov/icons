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

public val Icons.Bold.TrainSide: ImageVector
    get() {
        if (_trainSide != null) {
            return _trainSide!!
        }
        _trainSide = Builder(name = "TrainSide", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 1.0f)
                lineTo(0.0f, 1.0f)
                lineTo(0.0f, 4.0f)
                lineTo(3.0f, 4.0f)
                lineTo(3.0f, 7.0f)
                lineTo(0.0f, 7.0f)
                verticalLineToRelative(3.0f)
                lineTo(19.161f, 10.0f)
                arcToRelative(12.4f, 12.4f, 0.0f, false, true, 1.749f, 5.0f)
                lineTo(0.0f, 15.0f)
                verticalLineToRelative(3.0f)
                lineTo(24.0f, 18.0f)
                lineTo(24.0f, 16.5f)
                arcTo(15.517f, 15.517f, 0.0f, false, false, 8.5f, 1.0f)
                close()
                moveTo(16.6f, 7.0f)
                lineTo(12.0f, 7.0f)
                lineTo(12.0f, 4.5f)
                arcTo(12.477f, 12.477f, 0.0f, false, true, 16.6f, 7.0f)
                close()
                moveTo(6.0f, 4.0f)
                lineTo(8.5f, 4.0f)
                curveToRelative(0.169f, 0.0f, 0.333f, 0.017f, 0.5f, 0.023f)
                lineTo(9.0f, 7.0f)
                lineTo(6.0f, 7.0f)
                close()
                moveTo(0.0f, 20.0f)
                lineTo(24.0f, 20.0f)
                verticalLineToRelative(3.0f)
                lineTo(0.0f, 23.0f)
                close()
            }
        }
        .build()
        return _trainSide!!
    }

private var _trainSide: ImageVector? = null
