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

public val Icons.Outline.IceCream: ImageVector
    get() {
        if (_iceCream != null) {
            return _iceCream!!
        }
        _iceCream = Builder(name = "IceCream", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.9f, 4.02f)
                arcToRelative(5.008f, 5.008f, 0.0f, false, false, -9.8f, 0.0f)
                arcTo(5.508f, 5.508f, 0.0f, false, false, 2.76f, 12.253f)
                lineTo(12.0f, 23.99f)
                lineToRelative(9.24f, -11.737f)
                arcTo(5.507f, 5.507f, 0.0f, false, false, 16.9f, 4.02f)
                close()
                moveTo(20.0f, 9.5f)
                arcToRelative(3.351f, 3.351f, 0.0f, false, true, -0.042f, 0.5f)
                horizontalLineTo(13.045f)
                curveTo(12.509f, 5.075f, 19.8f, 4.549f, 20.0f, 9.5f)
                close()
                moveTo(12.0f, 2.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.893f, 2.249f)
                arcTo(5.52f, 5.52f, 0.0f, false, false, 12.0f, 6.341f)
                arcTo(5.52f, 5.52f, 0.0f, false, false, 9.107f, 4.249f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 12.0f, 2.0f)
                close()
                moveTo(7.5f, 6.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.455f, 4.0f)
                horizontalLineTo(4.042f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 7.5f, 6.0f)
                close()
                moveTo(5.1f, 12.0f)
                horizontalLineToRelative(13.81f)
                lineTo(12.0f, 20.76f)
                close()
            }
        }
        .build()
        return _iceCream!!
    }

private var _iceCream: ImageVector? = null
