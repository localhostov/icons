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

public val Icons.Bold.Sort: ImageVector
    get() {
        if (_sort != null) {
            return _sort!!
        }
        _sort = Builder(name = "Sort", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.383f, 10.0f)
                lineTo(1.617f, 10.0f)
                lineTo(9.929f, 0.918f)
                arcTo(2.8f, 2.8f, 0.0f, false, true, 14.082f, 0.93f)
                close()
                moveTo(8.43f, 7.0f)
                horizontalLineToRelative(7.14f)
                lineTo(12.0f, 3.1f)
                close()
                moveTo(11.858f, 2.943f)
                horizontalLineToRelative(0.0f)
                close()
                moveTo(12.152f, 2.932f)
                lineTo(12.152f, 2.932f)
                close()
                moveTo(12.0f, 24.0f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, true, -2.082f, -0.93f)
                lineTo(1.617f, 14.0f)
                lineTo(22.383f, 14.0f)
                lineToRelative(-8.312f, 9.082f)
                arcTo(2.788f, 2.788f, 0.0f, false, true, 12.0f, 24.0f)
                close()
                moveTo(11.851f, 21.065f)
                lineTo(11.851f, 21.065f)
                close()
                moveTo(12.141f, 21.056f)
                horizontalLineToRelative(0.0f)
                close()
                moveTo(8.43f, 17.0f)
                lineTo(12.0f, 20.9f)
                lineTo(15.57f, 17.0f)
                close()
            }
        }
        .build()
        return _sort!!
    }

private var _sort: ImageVector? = null
