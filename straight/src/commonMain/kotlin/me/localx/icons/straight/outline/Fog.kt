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

public val Icons.Outline.Fog: ImageVector
    get() {
        if (_fog != null) {
            return _fog!!
        }
        _fog = Builder(name = "Fog", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 24.0f)
                lineTo(5.0f, 24.0f)
                lineTo(5.0f, 22.0f)
                horizontalLineToRelative(9.0f)
                close()
                moveTo(19.0f, 22.0f)
                lineTo(16.0f, 22.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(19.0f, 18.0f)
                lineTo(10.0f, 18.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(9.0f)
                close()
                moveTo(8.0f, 18.0f)
                lineTo(5.0f, 18.0f)
                verticalLineToRelative(2.0f)
                lineTo(8.0f, 20.0f)
                close()
                moveTo(14.0f, 14.0f)
                lineTo(5.0f, 14.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(9.0f)
                close()
                moveTo(19.0f, 14.0f)
                lineTo(16.0f, 14.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(17.441f, 5.059f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 2.265f, 10.05f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 0.773f, 9.367f)
                lineTo(3.038f, 16.985f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 0.873f, -5.6f)
                lineToRelative(0.8f, -0.408f)
                lineToRelative(-0.319f, -0.838f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 10.0f, 2.0f)
                arcToRelative(6.035f, 6.035f, 0.0f, false, true, 5.752f, 4.289f)
                lineToRelative(0.206f, 0.691f)
                lineTo(16.679f, 7.0f)
                arcTo(5.5f, 5.5f, 0.0f, false, true, 21.0f, 15.658f)
                lineTo(21.0f, 18.5f)
                arcTo(7.5f, 7.5f, 0.0f, false, false, 17.441f, 5.059f)
                close()
            }
        }
        .build()
        return _fog!!
    }

private var _fog: ImageVector? = null
