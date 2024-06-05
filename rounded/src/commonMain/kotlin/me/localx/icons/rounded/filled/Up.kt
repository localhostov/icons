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

public val Icons.Filled.Up: ImageVector
    get() {
        if (_up != null) {
            return _up!!
        }
        _up = Builder(name = "Up", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 24.0f)
                curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f)
                verticalLineTo(13.0f)
                horizontalLineToRelative(-1.92f)
                curveToRelative(-1.17f, 0.0f, -2.29f, -0.62f, -2.8f, -1.67f)
                curveToRelative(-0.57f, -1.18f, -0.34f, -2.51f, 0.57f, -3.43f)
                lineTo(9.17f, 1.18f)
                curveToRelative(1.57f, -1.57f, 4.09f, -1.57f, 5.64f, -0.02f)
                curveToRelative(0.0f, 0.0f, 6.37f, 6.77f, 6.37f, 6.77f)
                curveToRelative(0.85f, 0.84f, 1.1f, 2.09f, 0.63f, 3.22f)
                curveToRelative(-0.47f, 1.13f, -1.52f, 1.84f, -2.74f, 1.85f)
                horizontalLineToRelative(-2.06f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 1.66f, -1.34f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-4.0f)
                close()
            }
        }
        .build()
        return _up!!
    }

private var _up: ImageVector? = null
