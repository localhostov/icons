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

public val Icons.Filled.ScalpelPath: ImageVector
    get() {
        if (_scalpelPath != null) {
            return _scalpelPath!!
        }
        _scalpelPath = Builder(name = "ScalpelPath", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.0f, 24.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(12.0f, 22.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(24.0f, 22.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(23.19f, 0.806f)
                curveToRelative(-1.078f, -1.078f, -2.831f, -1.078f, -3.909f, 0.0f)
                lineToRelative(-9.162f, 9.162f)
                lineToRelative(4.044f, 3.774f)
                lineToRelative(9.027f, -9.027f)
                curveToRelative(1.078f, -1.078f, 1.078f, -2.831f, 0.0f, -3.909f)
                close()
                moveTo(8.65f, 11.437f)
                lineToRelative(4.365f, 4.058f)
                lineToRelative(-0.224f, 2.113f)
                lineToRelative(-0.192f, 0.192f)
                curveToRelative(-2.562f, 2.562f, -5.957f, 4.052f, -9.559f, 4.194f)
                curveToRelative(-0.231f, 0.01f, -3.04f, 0.0f, -3.04f, 0.0f)
                verticalLineToRelative(-1.909f)
                lineToRelative(8.65f, -8.65f)
                close()
            }
        }
        .build()
        return _scalpelPath!!
    }

private var _scalpelPath: ImageVector? = null
