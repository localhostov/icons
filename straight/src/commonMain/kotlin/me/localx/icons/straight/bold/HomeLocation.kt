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

public val Icons.Bold.HomeLocation: ImageVector
    get() {
        if (_homeLocation != null) {
            return _homeLocation!!
        }
        _homeLocation = Builder(name = "HomeLocation", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.692f, 7.447f)
                lineTo(14.1f, 0.725f)
                arcToRelative(3.4f, 3.4f, 0.0f, false, false, -4.2f, 0.0f)
                lineTo(1.308f, 7.447f)
                arcTo(3.39f, 3.39f, 0.0f, false, false, 0.0f, 10.132f)
                lineTo(0.0f, 24.0f)
                lineTo(24.0f, 24.0f)
                lineTo(24.0f, 10.132f)
                arcTo(3.39f, 3.39f, 0.0f, false, false, 22.692f, 7.447f)
                close()
                moveTo(21.0f, 21.0f)
                lineTo(3.0f, 21.0f)
                lineTo(3.0f, 10.132f)
                arcToRelative(0.412f, 0.412f, 0.0f, false, true, 0.157f, -0.322f)
                lineToRelative(8.591f, -6.723f)
                arcToRelative(0.408f, 0.408f, 0.0f, false, true, 0.5f, 0.0f)
                lineTo(20.843f, 9.81f)
                arcToRelative(0.412f, 0.412f, 0.0f, false, true, 0.157f, 0.322f)
                close()
                moveTo(12.0f, 8.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -3.523f, 8.547f)
                lineTo(12.0f, 19.994f)
                lineToRelative(3.535f, -3.458f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 12.0f, 8.0f)
                close()
                moveTo(12.0f, 15.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 2.0f, -2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 15.0f)
                close()
            }
        }
        .build()
        return _homeLocation!!
    }

private var _homeLocation: ImageVector? = null
