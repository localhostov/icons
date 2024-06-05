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

public val Icons.Bold.SteeringWheel: ImageVector
    get() {
        if (_steeringWheel != null) {
            return _steeringWheel!!
        }
        _steeringWheel = Builder(name = "SteeringWheel", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 24.0f, 12.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 3.0f)
                arcToRelative(9.012f, 9.012f, 0.0f, false, true, 8.306f, 5.536f)
                lineTo(14.024f, 9.793f)
                arcToRelative(10.705f, 10.705f, 0.0f, false, true, -4.19f, 0.0f)
                lineTo(3.683f, 8.562f)
                arcTo(9.013f, 9.013f, 0.0f, false, true, 12.0f, 3.0f)
                close()
                moveTo(3.006f, 12.307f)
                lineToRelative(3.154f, 0.631f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.733f, 2.018f)
                lineToRelative(0.625f, 1.153f)
                arcToRelative(4.006f, 4.006f, 0.0f, false, true, 0.482f, 1.9f)
                verticalLineToRelative(2.763f)
                arcTo(9.017f, 9.017f, 0.0f, false, true, 3.006f, 12.307f)
                close()
                moveTo(14.0f, 20.776f)
                lineTo(14.0f, 18.013f)
                arcToRelative(4.006f, 4.006f, 0.0f, false, true, 0.482f, -1.9f)
                lineToRelative(0.625f, -1.153f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.733f, -2.018f)
                lineToRelative(3.154f, -0.631f)
                arcTo(9.017f, 9.017f, 0.0f, false, true, 14.0f, 20.776f)
                close()
            }
        }
        .build()
        return _steeringWheel!!
    }

private var _steeringWheel: ImageVector? = null
