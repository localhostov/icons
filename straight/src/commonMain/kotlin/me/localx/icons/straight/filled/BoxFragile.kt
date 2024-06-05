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

public val Icons.Filled.BoxFragile: ImageVector
    get() {
        if (_boxFragile != null) {
            return _boxFragile!!
        }
        _boxFragile = Builder(name = "BoxFragile", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 0.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                lineTo(0.0f, 24.0f)
                lineTo(24.0f, 24.0f)
                lineTo(24.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(17.0f, 10.0f)
                curveToRelative(0.0f, 2.414f, -1.721f, 4.434f, -4.0f, 4.899f)
                verticalLineToRelative(3.101f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.101f)
                curveToRelative(-2.279f, -0.465f, -4.0f, -2.484f, -4.0f, -4.899f)
                lineTo(7.0f, 4.0f)
                horizontalLineToRelative(4.248f)
                lineToRelative(-2.223f, 5.0f)
                horizontalLineToRelative(2.818f)
                lineToRelative(-1.276f, 2.553f)
                lineToRelative(1.789f, 0.895f)
                lineToRelative(2.724f, -5.447f)
                horizontalLineToRelative(-2.977f)
                lineToRelative(1.333f, -3.0f)
                horizontalLineToRelative(3.564f)
                verticalLineToRelative(6.0f)
                close()
            }
        }
        .build()
        return _boxFragile!!
    }

private var _boxFragile: ImageVector? = null
