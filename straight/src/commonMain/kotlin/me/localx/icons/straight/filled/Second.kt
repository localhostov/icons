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

public val Icons.Filled.Second: ImageVector
    get() {
        if (_second != null) {
            return _second!!
        }
        _second = Builder(name = "Second", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.0f, 7.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                lineTo(0.0f, 9.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                lineTo(0.0f, 14.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(7.0f, 14.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(14.263f, 20.0f)
                horizontalLineToRelative(9.737f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-12.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -2.486f, 2.352f, -4.348f, 4.842f, -6.318f)
                curveToRelative(2.536f, -2.007f, 5.158f, -4.082f, 5.158f, -6.682f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                curveToRelative(-1.86f, 0.0f, -3.428f, 1.276f, -3.873f, 3.0f)
                horizontalLineToRelative(-2.043f)
                curveToRelative(0.477f, -2.834f, 2.948f, -5.0f, 5.916f, -5.0f)
                curveToRelative(3.309f, 0.0f, 6.0f, 2.691f, 6.0f, 6.0f)
                curveToRelative(0.0f, 3.567f, -3.144f, 6.055f, -5.917f, 8.25f)
                curveToRelative(-1.643f, 1.3f, -3.214f, 2.543f, -3.82f, 3.75f)
                close()
            }
        }
        .build()
        return _second!!
    }

private var _second: ImageVector? = null