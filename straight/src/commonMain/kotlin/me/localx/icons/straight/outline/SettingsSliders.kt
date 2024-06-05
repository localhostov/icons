package me.localx.icons.straight.outline

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
                moveTo(10.931f, 2.75f)
                arcToRelative(3.728f, 3.728f, 0.0f, false, false, -7.195f, 0.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(3.736f)
                arcToRelative(3.728f, 3.728f, 0.0f, false, false, 7.195f, 0.0f)
                horizontalLineTo(24.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(7.333f, 5.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, true, 1.75f, -1.75f)
                arcTo(1.753f, 1.753f, 0.0f, false, true, 7.333f, 5.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.667f, 8.25f)
                arcTo(3.745f, 3.745f, 0.0f, false, false, 13.07f, 11.0f)
                lineTo(0.0f, 11.0f)
                verticalLineToRelative(2.0f)
                lineTo(13.07f, 13.0f)
                arcToRelative(3.727f, 3.727f, 0.0f, false, false, 7.194f, 0.0f)
                lineTo(24.0f, 13.0f)
                lineTo(24.0f, 11.0f)
                lineTo(20.264f, 11.0f)
                arcTo(3.745f, 3.745f, 0.0f, false, false, 16.667f, 8.25f)
                close()
                moveTo(16.667f, 13.75f)
                arcTo(1.75f, 1.75f, 0.0f, true, true, 18.417f, 12.0f)
                arcTo(1.752f, 1.752f, 0.0f, false, true, 16.667f, 13.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.333f, 16.5f)
                arcToRelative(3.745f, 3.745f, 0.0f, false, false, -3.6f, 2.75f)
                lineTo(0.0f, 19.25f)
                verticalLineToRelative(2.0f)
                lineTo(3.736f, 21.25f)
                arcToRelative(3.728f, 3.728f, 0.0f, false, false, 7.195f, 0.0f)
                lineTo(24.0f, 21.25f)
                verticalLineToRelative(-2.0f)
                lineTo(10.931f, 19.25f)
                arcTo(3.745f, 3.745f, 0.0f, false, false, 7.333f, 16.5f)
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
