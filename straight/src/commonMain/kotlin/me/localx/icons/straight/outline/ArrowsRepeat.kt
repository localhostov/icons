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

public val Icons.Outline.ArrowsRepeat: ImageVector
    get() {
        if (_arrowsRepeat != null) {
            return _arrowsRepeat!!
        }
        _arrowsRepeat = Builder(name = "ArrowsRepeat", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 4.411f, -3.589f, 8.0f, -8.0f, 8.0f)
                horizontalLineTo(3.0f)
                lineToRelative(2.5f, 2.5f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-3.5f, -3.5f)
                curveToRelative(-0.78f, -0.779f, -0.78f, -2.049f, 0.0f, -2.828f)
                lineToRelative(3.5f, -3.5f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-2.5f, 2.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(3.309f, 0.0f, 6.0f, -2.691f, 6.0f, -6.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(8.0f, 6.0f)
                horizontalLineToRelative(13.0f)
                lineToRelative(-2.5f, 2.5f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(3.5f, -3.5f)
                curveToRelative(0.78f, -0.779f, 0.78f, -2.049f, 0.0f, -2.828f)
                lineTo(19.914f, 0.086f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(2.5f, 2.5f)
                horizontalLineTo(8.0f)
                curveTo(3.589f, 4.0f, 0.0f, 7.589f, 0.0f, 12.0f)
                horizontalLineTo(2.0f)
                curveToRelative(0.0f, -3.309f, 2.691f, -6.0f, 6.0f, -6.0f)
                close()
            }
        }
        .build()
        return _arrowsRepeat!!
    }

private var _arrowsRepeat: ImageVector? = null
