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

public val Icons.Bold.Resources: ImageVector
    get() {
        if (_resources != null) {
            return _resources!!
        }
        _resources = Builder(name = "Resources", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 3.0f)
                lineTo(12.0f, 3.0f)
                lineTo(12.0f, 5.267f)
                lineTo(10.975f, 3.491f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -4.33f, 0.0f)
                lineTo(0.0f, 15.0f)
                lineTo(7.181f, 15.0f)
                arcToRelative(6.5f, 6.5f, 0.0f, true, false, 12.638f, 0.0f)
                lineTo(24.0f, 15.0f)
                close()
                moveTo(5.2f, 12.0f)
                lineTo(8.81f, 5.741f)
                lineToRelative(2.65f, 4.59f)
                arcTo(6.5f, 6.5f, 0.0f, false, false, 8.816f, 12.0f)
                close()
                moveTo(13.5f, 20.0f)
                arcTo(3.5f, 3.5f, 0.0f, true, true, 17.0f, 16.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 13.5f, 20.0f)
                close()
                moveTo(21.0f, 12.0f)
                lineTo(18.184f, 12.0f)
                arcTo(6.486f, 6.486f, 0.0f, false, false, 15.0f, 10.181f)
                lineTo(15.0f, 6.0f)
                horizontalLineToRelative(6.0f)
                close()
            }
        }
        .build()
        return _resources!!
    }

private var _resources: ImageVector? = null
