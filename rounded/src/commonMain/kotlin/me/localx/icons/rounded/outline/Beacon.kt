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

public val Icons.Outline.Beacon: ImageVector
    get() {
        if (_beacon != null) {
            return _beacon!!
        }
        _beacon = Builder(name = "Beacon", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.85f, 0.03f)
                curveTo(9.38f, -0.21f, 5.97f, 1.06f, 3.51f, 3.52f)
                curveTo(1.06f, 5.97f, -0.21f, 9.38f, 0.03f, 12.85f)
                curveToRelative(0.43f, 6.25f, 5.84f, 11.15f, 12.31f, 11.15f)
                horizontalLineToRelative(6.66f)
                curveToRelative(2.94f, 0.0f, 5.0f, -2.4f, 5.0f, -5.85f)
                verticalLineToRelative(-5.82f)
                curveTo(24.0f, 5.87f, 19.1f, 0.46f, 12.85f, 0.03f)
                close()
                moveTo(22.0f, 18.15f)
                curveToRelative(0.0f, 2.3f, -1.21f, 3.85f, -3.0f, 3.85f)
                horizontalLineToRelative(-6.66f)
                curveToRelative(-5.42f, 0.0f, -9.95f, -4.08f, -10.31f, -9.28f)
                curveToRelative(-0.2f, -2.9f, 0.86f, -5.74f, 2.9f, -7.79f)
                curveToRelative(1.88f, -1.88f, 4.43f, -2.93f, 7.09f, -2.93f)
                curveToRelative(0.23f, 0.0f, 0.47f, 0.0f, 0.7f, 0.02f)
                curveToRelative(5.21f, 0.36f, 9.28f, 4.89f, 9.28f, 10.31f)
                verticalLineToRelative(5.82f)
                close()
            }
        }
        .build()
        return _beacon!!
    }

private var _beacon: ImageVector? = null
