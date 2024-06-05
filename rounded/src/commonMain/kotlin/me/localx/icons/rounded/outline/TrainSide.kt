package me.localx.icons.rounded.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

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
                moveTo(19.99f, 15.0f)
                lineTo(1.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                lineTo(19.99f, 17.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.825f, -5.193f)
                arcTo(13.939f, 13.939f, 0.0f, false, false, 10.455f, 2.0f)
                lineTo(1.0f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 1.0f, 4.0f)
                lineTo(4.0f, 4.0f)
                lineTo(4.0f, 7.0f)
                lineTo(1.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 1.0f, 9.0f)
                lineTo(20.213f, 9.0f)
                arcToRelative(12.048f, 12.048f, 0.0f, false, true, 1.694f, 3.406f)
                arcToRelative(1.969f, 1.969f, 0.0f, false, true, -0.3f, 1.773f)
                arcTo(1.992f, 1.992f, 0.0f, false, true, 19.99f, 15.0f)
                close()
                moveTo(9.0f, 7.0f)
                lineTo(6.0f, 7.0f)
                lineTo(6.0f, 4.0f)
                lineTo(9.0f, 4.0f)
                close()
                moveTo(11.0f, 7.0f)
                lineTo(11.0f, 4.022f)
                arcTo(11.952f, 11.952f, 0.0f, false, true, 18.407f, 7.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 20.0f)
                horizontalLineTo(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineTo(23.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                close()
            }
        }
        .build()
        return _trainSide!!
    }

private var _trainSide: ImageVector? = null
