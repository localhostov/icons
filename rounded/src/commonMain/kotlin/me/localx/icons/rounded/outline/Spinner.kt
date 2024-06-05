package me.localx.icons.rounded.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Outline.Spinner: ImageVector
    get() {
        if (_spinner != null) {
            return _spinner!!
        }
        _spinner = Builder(name = "Spinner", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 22.714f, 6.59f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.785f, 0.9f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, -0.011f, 9.038f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.781f, 0.908f)
                arcTo(11.955f, 11.955f, 0.0f, false, true, 12.0f, 24.0f)
                close()
            }
        }
        .build()
        return _spinner!!
    }

private var _spinner: ImageVector? = null
