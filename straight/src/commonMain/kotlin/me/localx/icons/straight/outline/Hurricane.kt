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

public val Icons.Outline.Hurricane: ImageVector
    get() {
        if (_hurricane != null) {
            return _hurricane!!
        }
        _hurricane = Builder(name = "Hurricane", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 15.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 3.0f, -3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 12.0f, 15.0f)
                close()
                moveTo(12.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 11.0f)
                close()
                moveTo(10.0f, 24.0f)
                lineTo(7.0f, 24.0f)
                lineTo(7.0f, 22.0f)
                arcToRelative(5.428f, 5.428f, 0.0f, false, false, 3.437f, -1.122f)
                arcTo(10.016f, 10.016f, 0.0f, false, true, 2.0f, 11.0f)
                curveTo(2.0f, 4.626f, 7.047f, 0.0f, 14.0f, 0.0f)
                horizontalLineToRelative(3.0f)
                lineTo(17.0f, 2.0f)
                arcToRelative(5.428f, 5.428f, 0.0f, false, false, -3.437f, 1.122f)
                arcTo(10.016f, 10.016f, 0.0f, false, true, 22.0f, 13.0f)
                curveTo(22.0f, 19.374f, 16.953f, 24.0f, 10.0f, 24.0f)
                close()
                moveTo(11.579f, 2.233f)
                curveTo(7.07f, 3.132f, 4.0f, 6.544f, 4.0f, 11.0f)
                arcToRelative(8.009f, 8.009f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(2.118f)
                lineTo(13.4f, 20.447f)
                arcToRelative(6.019f, 6.019f, 0.0f, false, true, -0.974f, 1.32f)
                curveTo(16.93f, 20.868f, 20.0f, 17.456f, 20.0f, 13.0f)
                arcToRelative(8.009f, 8.009f, 0.0f, false, false, -8.0f, -8.0f)
                lineTo(9.882f, 5.0f)
                lineToRelative(0.723f, -1.447f)
                arcTo(6.019f, 6.019f, 0.0f, false, true, 11.579f, 2.233f)
                close()
            }
        }
        .build()
        return _hurricane!!
    }

private var _hurricane: ImageVector? = null
