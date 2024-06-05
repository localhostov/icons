package me.localx.icons.rounded.outline

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
import me.localx.icons.rounded.Icons

public val Icons.Outline.SettingsSliders: ImageVector
    get() {
        if (_settingsSliders != null) {
            return _settingsSliders!!
        }
        _settingsSliders = Builder(name = "SettingsSliders", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 4.75f)
                horizontalLineTo(3.736f)
                arcToRelative(3.728f, 3.728f, 0.0f, false, false, 7.195f, 0.0f)
                horizontalLineTo(23.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                horizontalLineTo(10.931f)
                arcToRelative(3.728f, 3.728f, 0.0f, false, false, -7.195f, 0.0f)
                horizontalLineTo(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                close()
                moveTo(7.333f, 2.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, true, -1.75f, 1.75f)
                arcTo(1.752f, 1.752f, 0.0f, false, true, 7.333f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 11.0f)
                lineTo(20.264f, 11.0f)
                arcToRelative(3.727f, 3.727f, 0.0f, false, false, -7.194f, 0.0f)
                lineTo(1.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                lineTo(13.07f, 13.0f)
                arcToRelative(3.727f, 3.727f, 0.0f, false, false, 7.194f, 0.0f)
                lineTo(23.0f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                close()
                moveTo(16.667f, 13.75f)
                arcTo(1.75f, 1.75f, 0.0f, true, true, 18.417f, 12.0f)
                arcTo(1.752f, 1.752f, 0.0f, false, true, 16.667f, 13.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 19.25f)
                horizontalLineTo(10.931f)
                arcToRelative(3.728f, 3.728f, 0.0f, false, false, -7.195f, 0.0f)
                horizontalLineTo(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineTo(3.736f)
                arcToRelative(3.728f, 3.728f, 0.0f, false, false, 7.195f, 0.0f)
                horizontalLineTo(23.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                close()
                moveTo(7.333f, 22.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, true, 1.75f, -1.75f)
                arcTo(1.753f, 1.753f, 0.0f, false, true, 7.333f, 22.0f)
                close()
            }
        }
        .build()
        return _settingsSliders!!
    }

private var _settingsSliders: ImageVector? = null
