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

public val Icons.Outline.WaveformPath: ImageVector
    get() {
        if (_waveformPath != null) {
            return _waveformPath!!
        }
        _waveformPath = Builder(name = "WaveformPath", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.0f, 7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(17.0f, 7.0f)
                close()
                moveTo(13.0f, 24.0f)
                horizontalLineToRelative(2.0f)
                lineTo(15.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(24.0f)
                close()
                moveTo(21.0f, 4.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(2.0f)
                lineTo(23.0f, 4.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(9.0f, 20.0f)
                horizontalLineToRelative(2.0f)
                lineTo(11.0f, 4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(16.0f)
                close()
                moveTo(5.0f, 17.0f)
                horizontalLineToRelative(2.0f)
                lineTo(7.0f, 7.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(10.0f)
                close()
                moveTo(1.0f, 15.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-6.0f)
                lineTo(1.0f, 9.0f)
                verticalLineToRelative(6.0f)
                close()
            }
        }
        .build()
        return _waveformPath!!
    }

private var _waveformPath: ImageVector? = null
