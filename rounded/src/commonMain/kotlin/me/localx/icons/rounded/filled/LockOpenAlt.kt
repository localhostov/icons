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

public val Icons.Filled.LockOpenAlt: ImageVector
    get() {
        if (_lockOpenAlt != null) {
            return _lockOpenAlt!!
        }
        _lockOpenAlt = Builder(name = "LockOpenAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.008f, 4.891f)
                curveToRelative(-0.306f, -2.788f, -2.674f, -4.891f, -5.508f, -4.891f)
                curveToRelative(-3.033f, 0.0f, -5.5f, 2.468f, -5.5f, 5.5f)
                verticalLineToRelative(2.5f)
                lineTo(5.0f, 8.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, 2.243f, -5.0f, 5.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -2.046f, -1.236f, -3.809f, -3.0f, -4.582f)
                verticalLineToRelative(-2.918f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                curveToRelative(1.782f, 0.0f, 3.328f, 1.365f, 3.52f, 3.109f)
                curveToRelative(0.06f, 0.549f, 0.564f, 0.944f, 1.103f, 0.885f)
                curveToRelative(0.549f, -0.061f, 0.945f, -0.555f, 0.885f, -1.104f)
                close()
                moveTo(10.0f, 17.0f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.553f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _lockOpenAlt!!
    }

private var _lockOpenAlt: ImageVector? = null
