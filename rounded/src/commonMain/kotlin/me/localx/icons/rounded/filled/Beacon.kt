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

public val Icons.Filled.Beacon: ImageVector
    get() {
        if (_beacon != null) {
            return _beacon!!
        }
        _beacon = Builder(name = "Beacon", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 24.0f)
                horizontalLineToRelative(-6.66f)
                curveTo(5.87f, 24.0f, 0.46f, 19.1f, 0.03f, 12.85f)
                curveTo(-0.21f, 9.38f, 1.06f, 5.97f, 3.51f, 3.52f)
                curveTo(5.97f, 1.06f, 9.38f, -0.21f, 12.85f, 0.03f)
                curveToRelative(6.25f, 0.43f, 11.15f, 5.84f, 11.15f, 12.31f)
                verticalLineToRelative(5.82f)
                curveToRelative(0.0f, 3.44f, -2.06f, 5.85f, -5.0f, 5.85f)
                close()
            }
        }
        .build()
        return _beacon!!
    }

private var _beacon: ImageVector? = null
