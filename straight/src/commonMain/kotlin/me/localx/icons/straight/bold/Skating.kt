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

public val Icons.Bold.Skating: ImageVector
    get() {
        if (_skating != null) {
            return _skating!!
        }
        _skating = Builder(name = "Skating", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 2.5f)
                arcTo(2.5f, 2.5f, 0.0f, true, true, 17.5f, 5.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 15.0f, 2.5f)
                close()
                moveTo(17.0f, 20.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                lineTo(16.0f, 21.0f)
                lineTo(16.0f, 18.25f)
                lineToRelative(-3.974f, -4.224f)
                lineToRelative(2.949f, -2.965f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -0.062f, -5.011f)
                lineTo(13.486f, 5.0f)
                lineTo(5.0f, 5.0f)
                lineTo(5.0f, 8.0f)
                horizontalLineToRelative(6.161f)
                lineTo(8.953f, 10.336f)
                arcToRelative(3.49f, 3.49f, 0.0f, false, false, 0.072f, 4.874f)
                lineTo(13.0f, 19.439f)
                lineTo(13.0f, 21.0f)
                lineTo(12.0f, 21.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(4.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 20.0f, 20.5f)
                lineTo(20.0f, 20.0f)
                lineTo(17.0f, 20.0f)
                close()
                moveTo(6.95f, 20.857f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 6.6f, 21.0f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, true, -0.331f, -0.124f)
                lineToRelative(-0.419f, -0.448f)
                lineToRelative(3.058f, -3.046f)
                lineTo(6.791f, 15.257f)
                lineTo(3.8f, 18.234f)
                lineTo(3.1f, 17.477f)
                lineTo(0.9f, 19.523f)
                lineTo(4.1f, 22.95f)
                arcTo(3.475f, 3.475f, 0.0f, false, false, 6.593f, 24.0f)
                arcToRelative(3.52f, 3.52f, 0.0f, false, false, 2.476f, -1.017f)
                lineToRelative(0.308f, -0.312f)
                lineToRelative(-2.139f, -2.1f)
                close()
            }
        }
        .build()
        return _skating!!
    }

private var _skating: ImageVector? = null
