package me.localx.icons.rounded.bold

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

public val Icons.Bold.Beacon: ImageVector
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
                curveTo(1.06f, 5.97f, -0.21f, 9.37f, 0.03f, 12.85f)
                curveToRelative(0.43f, 6.25f, 5.83f, 11.15f, 12.29f, 11.15f)
                horizontalLineToRelative(6.36f)
                curveToRelative(3.08f, 0.0f, 5.32f, -2.58f, 5.32f, -6.13f)
                verticalLineToRelative(-5.55f)
                curveTo(24.0f, 5.86f, 19.1f, 0.46f, 12.85f, 0.03f)
                close()
                moveTo(21.0f, 17.87f)
                curveToRelative(0.0f, 1.9f, -0.91f, 3.13f, -2.32f, 3.13f)
                horizontalLineToRelative(-6.36f)
                curveToRelative(-4.89f, 0.0f, -8.98f, -3.67f, -9.3f, -8.35f)
                curveToRelative(-0.18f, -2.61f, 0.77f, -5.17f, 2.61f, -7.01f)
                curveToRelative(1.69f, -1.69f, 3.99f, -2.64f, 6.38f, -2.64f)
                curveToRelative(0.21f, 0.0f, 0.42f, 0.0f, 0.63f, 0.02f)
                curveToRelative(4.68f, 0.32f, 8.35f, 4.41f, 8.35f, 9.3f)
                verticalLineToRelative(5.55f)
                close()
            }
        }
        .build()
        return _beacon!!
    }

private var _beacon: ImageVector? = null
