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

public val Icons.Outline.TrainSide: ImageVector
    get() {
        if (_trainSide != null) {
            return _trainSide!!
        }
        _trainSide = Builder(name = "TrainSide", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 2.0f)
                lineTo(0.0f, 2.0f)
                lineTo(0.0f, 4.0f)
                lineTo(3.0f, 4.0f)
                lineTo(3.0f, 7.0f)
                lineTo(0.0f, 7.0f)
                lineTo(0.0f, 9.0f)
                lineTo(19.732f, 9.0f)
                arcToRelative(11.927f, 11.927f, 0.0f, false, true, 2.227f, 6.0f)
                lineTo(0.0f, 15.0f)
                verticalLineToRelative(2.0f)
                lineTo(24.0f, 17.0f)
                lineTo(24.0f, 16.0f)
                arcTo(14.015f, 14.015f, 0.0f, false, false, 10.0f, 2.0f)
                close()
                moveTo(17.914f, 7.0f)
                lineTo(10.0f, 7.0f)
                lineTo(10.0f, 4.0f)
                arcTo(11.939f, 11.939f, 0.0f, false, true, 17.914f, 7.0f)
                close()
                moveTo(5.0f, 4.0f)
                lineTo(8.0f, 4.0f)
                lineTo(8.0f, 7.0f)
                lineTo(5.0f, 7.0f)
                close()
                moveTo(0.0f, 20.0f)
                lineTo(24.0f, 20.0f)
                verticalLineToRelative(2.0f)
                lineTo(0.0f, 22.0f)
                close()
            }
        }
        .build()
        return _trainSide!!
    }

private var _trainSide: ImageVector? = null
