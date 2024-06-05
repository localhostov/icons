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

public val Icons.Filled.Smoking: ImageVector
    get() {
        if (_smoking != null) {
            return _smoking!!
        }
        _smoking = Builder(name = "Smoking", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 22.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(9.0f, 16.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-11.0f)
                close()
                moveTo(7.0f, 16.0f)
                lineTo(0.0f, 16.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(20.0f, 11.82f)
                curveToRelative(0.0f, -1.396f, -0.744f, -2.711f, -1.942f, -3.431f)
                lineToRelative(-1.602f, -0.961f)
                curveToRelative(-0.898f, -0.539f, -1.457f, -1.524f, -1.457f, -2.572f)
                verticalLineToRelative(-2.856f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.856f)
                curveToRelative(0.0f, 1.746f, 0.93f, 3.389f, 2.427f, 4.287f)
                lineToRelative(1.601f, 0.961f)
                curveToRelative(0.6f, 0.359f, 0.972f, 1.018f, 0.972f, 1.716f)
                verticalLineToRelative(2.18f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.18f)
                close()
                moveTo(24.0f, 10.264f)
                curveToRelative(0.0f, -1.746f, -0.93f, -3.389f, -2.427f, -4.287f)
                lineToRelative(-2.086f, -1.252f)
                curveToRelative(-0.3f, -0.18f, -0.486f, -0.509f, -0.486f, -0.858f)
                lineTo(19.001f, 0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.867f)
                curveToRelative(0.0f, 1.047f, 0.558f, 2.033f, 1.457f, 2.573f)
                lineToRelative(2.087f, 1.252f)
                curveToRelative(0.898f, 0.539f, 1.457f, 1.524f, 1.457f, 2.572f)
                verticalLineToRelative(1.735f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.735f)
                close()
            }
        }
        .build()
        return _smoking!!
    }

private var _smoking: ImageVector? = null
