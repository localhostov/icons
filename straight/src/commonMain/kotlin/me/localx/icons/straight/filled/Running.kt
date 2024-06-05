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

public val Icons.Filled.Running: ImageVector
    get() {
        if (_running != null) {
            return _running!!
        }
        _running = Builder(name = "Running", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.575f, 11.0f)
                lineTo(16.44f, 7.453f)
                arcTo(3.016f, 3.016f, 0.0f, false, false, 13.87f, 6.0f)
                horizontalLineTo(5.392f)
                lineTo(3.115f, 10.553f)
                lineToRelative(1.789f, 0.894f)
                lineTo(6.628f, 8.0f)
                horizontalLineTo(9.464f)
                lineTo(7.711f, 12.273f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 1.172f, 3.674f)
                lineTo(13.0f, 18.551f)
                verticalLineTo(24.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(17.449f)
                lineTo(12.392f, 15.8f)
                lineToRelative(2.767f, -6.6f)
                lineTo(17.444f, 13.0f)
                horizontalLineTo(22.01f)
                verticalLineTo(11.0f)
                close()
                moveTo(12.51f, 2.5f)
                arcTo(2.5f, 2.5f, 0.0f, true, true, 15.01f, 5.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 12.51f, 2.5f)
                close()
                moveTo(7.815f, 17.638f)
                lineToRelative(0.665f, 0.42f)
                lineTo(7.679f, 20.0f)
                horizontalLineTo(1.01f)
                verticalLineTo(18.0f)
                horizontalLineTo(6.34f)
                lineToRelative(0.5f, -1.2f)
                arcTo(4.987f, 4.987f, 0.0f, false, false, 7.815f, 17.638f)
                close()
            }
        }
        .build()
        return _running!!
    }

private var _running: ImageVector? = null
