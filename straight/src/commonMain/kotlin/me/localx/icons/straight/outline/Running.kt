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

public val Icons.Outline.Running: ImageVector
    get() {
        if (_running != null) {
            return _running!!
        }
        _running = Builder(name = "Running", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 11.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(17.435f)
                lineTo(15.158f, 9.218f)
                lineToRelative(-1.952f, 4.736f)
                lineTo(11.49f, 12.869f)
                lineTo(13.5f, 8.0f)
                horizontalLineToRelative(-1.88f)
                lineTo(9.552f, 13.032f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.39f, 1.225f)
                lineToRelative(5.048f, 3.192f)
                verticalLineTo(24.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(18.551f)
                lineToRelative(-4.116f, -2.6f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 7.7f, 12.273f)
                lineTo(9.454f, 8.0f)
                horizontalLineTo(6.618f)
                lineTo(4.895f, 11.447f)
                lineToRelative(-1.79f, -0.894f)
                lineTo(5.382f, 6.0f)
                horizontalLineTo(13.86f)
                arcToRelative(3.015f, 3.015f, 0.0f, false, true, 2.57f, 1.453f)
                lineTo(18.565f, 11.0f)
                close()
                moveTo(15.0f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, -2.5f, -2.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 15.0f, 5.0f)
                close()
                moveTo(6.825f, 16.8f)
                lineTo(6.331f, 18.0f)
                horizontalLineTo(1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(7.669f)
                lineToRelative(0.8f, -1.942f)
                lineToRelative(-0.665f, -0.42f)
                arcTo(4.987f, 4.987f, 0.0f, false, true, 6.825f, 16.8f)
                close()
            }
        }
        .build()
        return _running!!
    }

private var _running: ImageVector? = null
