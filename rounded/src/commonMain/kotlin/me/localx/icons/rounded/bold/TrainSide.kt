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
                moveTo(10.0f, 1.0f)
                lineTo(1.5f, 1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                lineTo(2.98f, 4.0f)
                lineTo(2.98f, 7.0f)
                lineTo(1.5f, 7.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                lineTo(19.551f, 10.0f)
                arcToRelative(13.556f, 13.556f, 0.0f, false, true, 1.425f, 3.055f)
                arcToRelative(1.479f, 1.479f, 0.0f, false, true, -0.224f, 1.328f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 19.536f, 15.0f)
                lineTo(1.5f, 15.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                lineTo(19.536f, 18.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 4.3f, -5.842f)
                curveTo(22.1f, 6.613f, 16.788f, 1.0f, 10.0f, 1.0f)
                close()
                moveTo(12.0f, 4.227f)
                arcTo(11.227f, 11.227f, 0.0f, false, true, 17.077f, 7.0f)
                lineTo(12.0f, 7.0f)
                close()
                moveTo(5.98f, 4.0f)
                lineTo(9.0f, 4.0f)
                lineTo(9.0f, 7.0f)
                lineTo(5.98f, 7.0f)
                close()
                moveTo(24.0f, 21.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 22.5f, 23.0f)
                lineTo(1.5f, 23.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                horizontalLineToRelative(21.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 24.0f, 21.5f)
                close()
            }
        }
        .build()
        return _trainSide!!
    }

private var _trainSide: ImageVector? = null
