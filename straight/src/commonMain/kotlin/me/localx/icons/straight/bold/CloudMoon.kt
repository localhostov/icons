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

public val Icons.Bold.CloudMoon: ImageVector
    get() {
        if (_cloudMoon != null) {
            return _cloudMoon!!
        }
        _cloudMoon = Builder(name = "CloudMoon", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 19.48f)
                arcToRelative(10.988f, 10.988f, 0.0f, false, true, 12.31f, -18.1f)
                lineToRelative(2.328f, 1.294f)
                lineTo(16.326f, 4.0f)
                arcToRelative(9.121f, 9.121f, 0.0f, false, false, -3.87f, 4.287f)
                arcTo(7.48f, 7.48f, 0.0f, false, false, 9.01f, 10.39f)
                arcToRelative(10.218f, 10.218f, 0.0f, false, true, 3.462f, -7.253f)
                arcTo(7.912f, 7.912f, 0.0f, false, false, 11.0f, 3.0f)
                arcTo(7.99f, 7.99f, 0.0f, false, false, 4.919f, 16.185f)
                arcTo(6.485f, 6.485f, 0.0f, false, false, 4.0f, 19.48f)
                close()
                moveTo(24.0f, 18.75f)
                arcToRelative(5.26f, 5.26f, 0.0f, false, false, -4.371f, -5.177f)
                arcTo(5.487f, 5.487f, 0.0f, false, false, 9.005f, 15.255f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 10.5f, 24.0f)
                horizontalLineToRelative(8.25f)
                arcTo(5.256f, 5.256f, 0.0f, false, false, 24.0f, 18.75f)
                close()
                moveTo(12.0f, 18.0f)
                lineTo(12.0f, 15.5f)
                arcToRelative(2.488f, 2.488f, 0.0f, false, true, 4.958f, -0.312f)
                lineToRelative(0.166f, 1.312f)
                lineTo(18.75f, 16.5f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, 0.0f, 4.5f)
                lineTo(10.5f, 21.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                close()
            }
        }
        .build()
        return _cloudMoon!!
    }

private var _cloudMoon: ImageVector? = null
