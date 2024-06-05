package me.localx.icons.straight.bold

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

public val Icons.Bold.VectorCircle: ImageVector
    get() {
        if (_vectorCircle != null) {
            return _vectorCircle!!
        }
        _vectorCircle = Builder(name = "VectorCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 9.0f)
                horizontalLineToRelative(-1.416f)
                curveToRelative(-1.038f, -3.658f, -3.926f, -6.546f, -7.584f, -7.584f)
                lineTo(15.0f, 0.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(1.416f)
                curveToRelative(-3.658f, 1.038f, -6.546f, 3.926f, -7.584f, 7.584f)
                lineTo(0.0f, 9.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(1.416f)
                curveToRelative(1.038f, 3.658f, 3.926f, 6.546f, 7.584f, 7.584f)
                verticalLineToRelative(1.416f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-1.416f)
                curveToRelative(3.658f, -1.038f, 6.546f, -3.926f, 7.584f, -7.584f)
                horizontalLineToRelative(1.416f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(15.0f, 19.416f)
                verticalLineToRelative(-1.416f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(1.416f)
                curveToRelative(-2.002f, -0.813f, -3.603f, -2.414f, -4.416f, -4.416f)
                horizontalLineToRelative(1.416f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-1.416f)
                curveToRelative(0.813f, -2.002f, 2.414f, -3.603f, 4.416f, -4.416f)
                verticalLineToRelative(1.416f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-1.416f)
                curveToRelative(2.002f, 0.813f, 3.603f, 2.414f, 4.416f, 4.416f)
                horizontalLineToRelative(-1.416f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(1.416f)
                curveToRelative(-0.813f, 2.002f, -2.414f, 3.603f, -4.416f, 4.416f)
                close()
            }
        }
        .build()
        return _vectorCircle!!
    }

private var _vectorCircle: ImageVector? = null
