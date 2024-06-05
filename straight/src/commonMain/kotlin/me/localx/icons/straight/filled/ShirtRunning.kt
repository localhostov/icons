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

public val Icons.Filled.ShirtRunning: ImageVector
    get() {
        if (_shirtRunning != null) {
            return _shirtRunning!!
        }
        _shirtRunning = Builder(name = "ShirtRunning", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(3.0f, 21.561f)
                verticalLineToRelative(-12.524f)
                lineToRelative(0.667f, -0.236f)
                curveToRelative(1.396f, -0.494f, 2.333f, -1.82f, 2.333f, -3.301f)
                lineTo(6.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.794f, 4.0f, -4.0f)
                lineTo(16.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.5f)
                curveToRelative(0.0f, 1.481f, 0.937f, 2.808f, 2.333f, 3.301f)
                lineToRelative(0.632f, 0.223f)
                lineTo(3.0f, 21.561f)
                close()
                moveTo(3.0f, 24.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(-12.561f)
                lineTo(3.0f, 24.0f)
                close()
            }
        }
        .build()
        return _shirtRunning!!
    }

private var _shirtRunning: ImageVector? = null
