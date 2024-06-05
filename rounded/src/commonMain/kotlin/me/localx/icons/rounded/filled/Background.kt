package me.localx.icons.rounded.filled

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

public val Icons.Filled.Background: ImageVector
    get() {
        if (_background != null) {
            return _background!!
        }
        _background = Builder(name = "Background", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 6.59f)
                lineTo(6.59f, 24.0f)
                horizontalLineToRelative(-1.59f)
                curveToRelative(-1.02f, 0.0f, -1.97f, -0.31f, -2.76f, -0.83f)
                lineTo(23.17f, 2.24f)
                curveToRelative(0.52f, 0.79f, 0.83f, 1.74f, 0.83f, 2.76f)
                verticalLineToRelative(1.59f)
                close()
                moveTo(0.0f, 14.59f)
                lineTo(14.59f, 0.0f)
                horizontalLineToRelative(-5.17f)
                lineTo(0.0f, 9.41f)
                verticalLineToRelative(5.17f)
                close()
                moveTo(24.0f, 9.42f)
                lineToRelative(-14.59f, 14.59f)
                horizontalLineToRelative(5.17f)
                lineToRelative(9.41f, -9.41f)
                verticalLineToRelative(-5.17f)
                close()
                moveTo(19.0f, 0.0f)
                horizontalLineToRelative(-1.59f)
                lineTo(0.0f, 17.41f)
                verticalLineToRelative(1.59f)
                curveToRelative(0.0f, 1.02f, 0.31f, 1.97f, 0.83f, 2.76f)
                lineTo(21.76f, 0.83f)
                curveToRelative(-0.79f, -0.52f, -1.74f, -0.83f, -2.76f, -0.83f)
                close()
                moveTo(6.59f, 0.0f)
                horizontalLineToRelative(-1.59f)
                curveTo(2.24f, 0.0f, 0.0f, 2.24f, 0.0f, 5.0f)
                verticalLineToRelative(1.59f)
                lineTo(6.59f, 0.0f)
                close()
                moveTo(17.42f, 24.0f)
                horizontalLineToRelative(1.59f)
                curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f)
                verticalLineToRelative(-1.59f)
                lineToRelative(-6.59f, 6.59f)
                close()
            }
        }
        .build()
        return _background!!
    }

private var _background: ImageVector? = null
