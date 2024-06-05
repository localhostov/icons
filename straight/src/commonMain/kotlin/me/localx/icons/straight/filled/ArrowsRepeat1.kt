package me.localx.icons.straight.filled

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

public val Icons.Filled.ArrowsRepeat1: ImageVector
    get() {
        if (_arrowsRepeat1 != null) {
            return _arrowsRepeat1!!
        }
        _arrowsRepeat1 = Builder(name = "ArrowsRepeat1", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 4.411f, -3.589f, 8.0f, -8.0f, 8.0f)
                lineTo(3.0f, 20.0f)
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
                lineTo(8.0f, 4.0f)
                curveTo(3.589f, 4.0f, 0.0f, 7.589f, 0.0f, 12.0f)
                lineTo(2.0f, 12.0f)
                curveToRelative(0.0f, -3.309f, 2.691f, -6.0f, 6.0f, -6.0f)
                close()
                moveTo(13.0f, 16.0f)
                verticalLineToRelative(-7.0f)
                lineToRelative(-0.079f, -1.0f)
                horizontalLineToRelative(-1.422f)
                lineToRelative(-3.215f, 3.303f)
                lineToRelative(1.433f, 1.395f)
                lineToRelative(1.284f, -1.318f)
                verticalLineToRelative(4.621f)
                horizontalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _arrowsRepeat1!!
    }

private var _arrowsRepeat1: ImageVector? = null
