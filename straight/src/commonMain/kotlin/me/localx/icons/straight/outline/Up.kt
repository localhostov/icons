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

public val Icons.Outline.Up: ImageVector
    get() {
        if (_up != null) {
            return _up!!
        }
        _up = Builder(name = "Up", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.99f, 24.0f)
                lineTo(6.99f, 24.0f)
                lineTo(6.99f, 11.0f)
                lineTo(0.06f, 11.0f)
                lineTo(9.86f, 0.88f)
                curveTo(10.43f, 0.31f, 11.18f, 0.0f, 11.99f, 0.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.8f, 0.0f, 1.56f, 0.31f, 2.13f, 0.88f)
                lineToRelative(9.82f, 10.12f)
                horizontalLineToRelative(-6.95f)
                verticalLineToRelative(13.0f)
                close()
                moveTo(8.99f, 22.0f)
                horizontalLineToRelative(6.0f)
                lineTo(14.99f, 9.0f)
                horizontalLineToRelative(4.22f)
                lineTo(12.69f, 2.29f)
                curveToRelative(-0.18f, -0.18f, -0.43f, -0.29f, -0.7f, -0.29f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.27f, 0.0f, -0.52f, 0.1f, -0.7f, 0.29f)
                lineToRelative(-6.5f, 6.71f)
                horizontalLineToRelative(4.21f)
                verticalLineToRelative(13.0f)
                close()
            }
        }
        .build()
        return _up!!
    }

private var _up: ImageVector? = null
