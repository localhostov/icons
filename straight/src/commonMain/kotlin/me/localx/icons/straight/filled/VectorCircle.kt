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

public val Icons.Filled.VectorCircle: ImageVector
    get() {
        if (_vectorCircle != null) {
            return _vectorCircle!!
        }
        _vectorCircle = Builder(name = "VectorCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.0f, 1.935f)
                lineTo(15.0f, 0.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(1.935f)
                curveToRelative(-3.39f, 1.008f, -6.057f, 3.674f, -7.065f, 7.065f)
                lineTo(0.0f, 9.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(1.935f)
                curveToRelative(1.008f, 3.39f, 3.674f, 6.057f, 7.065f, 7.065f)
                verticalLineToRelative(1.935f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-1.935f)
                curveToRelative(3.39f, -1.008f, 6.057f, -3.674f, 7.065f, -7.065f)
                horizontalLineToRelative(1.935f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-1.935f)
                curveToRelative(-1.008f, -3.39f, -3.674f, -6.057f, -7.065f, -7.065f)
                close()
                moveTo(15.0f, 19.956f)
                verticalLineToRelative(-1.956f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(1.956f)
                curveToRelative(-2.284f, -0.86f, -4.096f, -2.672f, -4.956f, -4.956f)
                horizontalLineToRelative(1.956f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-1.956f)
                curveToRelative(0.86f, -2.284f, 2.672f, -4.096f, 4.956f, -4.956f)
                verticalLineToRelative(1.956f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-1.956f)
                curveToRelative(2.284f, 0.86f, 4.096f, 2.672f, 4.956f, 4.956f)
                horizontalLineToRelative(-1.956f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(1.956f)
                curveToRelative(-0.86f, 2.284f, -2.672f, 4.096f, -4.956f, 4.956f)
                close()
            }
        }
        .build()
        return _vectorCircle!!
    }

private var _vectorCircle: ImageVector? = null
