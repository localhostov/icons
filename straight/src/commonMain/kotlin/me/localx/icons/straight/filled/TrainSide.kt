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

public val Icons.Filled.TrainSide: ImageVector
    get() {
        if (_trainSide != null) {
            return _trainSide!!
        }
        _trainSide = Builder(name = "TrainSide", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 22.0f)
                lineTo(0.0f, 22.0f)
                lineTo(0.0f, 20.0f)
                lineTo(24.0f, 20.0f)
                close()
                moveTo(0.0f, 8.0f)
                verticalLineToRelative(9.0f)
                lineTo(24.0f, 17.0f)
                lineTo(24.0f, 16.0f)
                arcToRelative(13.911f, 13.911f, 0.0f, false, false, -2.527f, -8.0f)
                close()
                moveTo(6.0f, 6.0f)
                horizontalLineToRelative(4.0f)
                lineTo(10.0f, 2.0f)
                lineTo(6.0f, 2.0f)
                close()
                moveTo(12.0f, 6.0f)
                horizontalLineToRelative(7.779f)
                arcTo(13.957f, 13.957f, 0.0f, false, false, 12.0f, 2.16f)
                close()
                moveTo(4.0f, 6.0f)
                lineTo(4.0f, 2.0f)
                lineTo(0.0f, 2.0f)
                lineTo(0.0f, 6.0f)
                close()
            }
        }
        .build()
        return _trainSide!!
    }

private var _trainSide: ImageVector? = null
