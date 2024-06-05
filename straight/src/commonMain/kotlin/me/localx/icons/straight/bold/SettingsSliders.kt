package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.SettingsSliders: ImageVector
    get() {
        if (_settingsSliders != null) {
            return _settingsSliders!!
        }
        _settingsSliders = Builder(name = "SettingsSliders", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.7f, 2.625f)
                arcToRelative(3.481f, 3.481f, 0.0f, false, false, -6.3f, 0.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(4.395f)
                arcToRelative(3.481f, 3.481f, 0.0f, false, false, 6.3f, 0.0f)
                horizontalLineTo(24.0f)
                verticalLineToRelative(-3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.455f, 8.5f)
                arcToRelative(3.492f, 3.492f, 0.0f, false, false, -3.151f, 2.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(13.3f)
                arcToRelative(3.481f, 3.481f, 0.0f, false, false, 6.3f, 0.0f)
                horizontalLineTo(24.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineTo(19.605f)
                arcTo(3.492f, 3.492f, 0.0f, false, false, 16.455f, 8.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.545f, 16.375f)
                arcToRelative(3.492f, 3.492f, 0.0f, false, false, -3.15f, 2.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(4.395f)
                arcToRelative(3.481f, 3.481f, 0.0f, false, false, 6.3f, 0.0f)
                horizontalLineTo(24.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineTo(10.7f)
                arcTo(3.492f, 3.492f, 0.0f, false, false, 7.545f, 16.375f)
                close()
            }
        }
        .build()
        return _settingsSliders!!
    }

private var _settingsSliders: ImageVector? = null
