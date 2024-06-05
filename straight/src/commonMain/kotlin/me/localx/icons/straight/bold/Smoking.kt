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

public val Icons.Bold.Smoking: ImageVector
    get() {
        if (_smoking != null) {
            return _smoking!!
        }
        _smoking = Builder(name = "Smoking", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.0f, 24.0f)
                horizontalLineToRelative(19.0f)
                verticalLineToRelative(-8.0f)
                lineTo(0.0f, 16.0f)
                verticalLineToRelative(8.0f)
                close()
                moveTo(16.0f, 21.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(3.0f, 19.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 21.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(21.0f, 16.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-8.0f)
                close()
                moveTo(19.0f, 11.82f)
                verticalLineToRelative(2.18f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.18f)
                curveToRelative(0.0f, -0.524f, -0.279f, -1.018f, -0.729f, -1.287f)
                lineToRelative(-1.601f, -0.961f)
                curveToRelative(-1.647f, -0.988f, -2.67f, -2.795f, -2.67f, -4.716f)
                verticalLineToRelative(-2.856f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.856f)
                curveToRelative(0.0f, 0.873f, 0.465f, 1.694f, 1.213f, 2.144f)
                lineToRelative(1.602f, 0.961f)
                curveToRelative(1.348f, 0.81f, 2.185f, 2.288f, 2.185f, 3.859f)
                close()
                moveTo(24.0f, 10.264f)
                verticalLineToRelative(1.735f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.735f)
                curveToRelative(0.0f, -0.873f, -0.465f, -1.694f, -1.213f, -2.144f)
                lineToRelative(-2.087f, -1.252f)
                curveToRelative(-1.049f, -0.631f, -1.7f, -1.78f, -1.7f, -3.002f)
                lineTo(16.0f, 0.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.867f)
                curveToRelative(0.0f, 0.178f, 0.091f, 0.339f, 0.244f, 0.431f)
                lineToRelative(2.085f, 1.251f)
                curveToRelative(1.647f, 0.988f, 2.67f, 2.795f, 2.67f, 4.716f)
                close()
            }
        }
        .build()
        return _smoking!!
    }

private var _smoking: ImageVector? = null
