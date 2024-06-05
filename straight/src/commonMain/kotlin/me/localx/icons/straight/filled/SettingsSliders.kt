package me.localx.icons.straight.filled

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

public val Icons.Filled.SettingsSliders: ImageVector
    get() {
        if (_settingsSliders != null) {
            return _settingsSliders!!
        }
        _settingsSliders = Builder(name = "SettingsSliders", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.874f, 3.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 3.126f, 3.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(3.126f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 7.748f, 0.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.874f, 3.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(13.126f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 7.748f, 0.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(20.874f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 17.0f, 8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.874f, 3.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(3.126f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 7.748f, 0.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(10.874f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 7.0f, 16.0f)
                close()
            }
        }
        .build()
        return _settingsSliders!!
    }

private var _settingsSliders: ImageVector? = null
