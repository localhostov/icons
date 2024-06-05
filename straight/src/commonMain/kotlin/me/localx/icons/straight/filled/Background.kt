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
                moveTo(14.17f, 0.0f)
                lineTo(0.0f, 14.17f)
                verticalLineToRelative(-5.17f)
                lineTo(9.0f, 0.0f)
                horizontalLineToRelative(5.17f)
                close()
                moveTo(16.0f, 24.0f)
                lineToRelative(8.0f, -8.0f)
                verticalLineToRelative(-6.17f)
                lineToRelative(-14.17f, 14.17f)
                horizontalLineToRelative(6.17f)
                close()
                moveTo(7.0f, 24.0f)
                lineTo(24.0f, 7.0f)
                lineTo(24.0f, 3.0f)
                curveToRelative(0.0f, -0.46f, -0.11f, -0.89f, -0.3f, -1.29f)
                lineTo(1.41f, 24.0f)
                lineTo(7.0f, 24.0f)
                close()
                moveTo(18.83f, 24.0f)
                horizontalLineToRelative(5.17f)
                verticalLineToRelative(-5.17f)
                lineToRelative(-5.17f, 5.17f)
                close()
                moveTo(6.17f, 0.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.35f, 0.0f, 0.0f, 1.35f, 0.0f, 3.0f)
                verticalLineToRelative(3.17f)
                lineTo(6.17f, 0.0f)
                close()
                moveTo(0.0f, 17.0f)
                verticalLineToRelative(5.59f)
                lineTo(22.29f, 0.3f)
                curveToRelative(-0.39f, -0.19f, -0.82f, -0.3f, -1.29f, -0.3f)
                horizontalLineToRelative(-4.0f)
                lineTo(0.0f, 17.0f)
                close()
            }
        }
        .build()
        return _background!!
    }

private var _background: ImageVector? = null
