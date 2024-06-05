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

public val Icons.Filled.BoxOpenFull: ImageVector
    get() {
        if (_boxOpenFull != null) {
            return _boxOpenFull!!
        }
        _boxOpenFull = Builder(name = "BoxOpenFull", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 9.401f)
                lineToRelative(-2.175f, 3.624f)
                curveToRelative(-0.482f, 0.804f, -1.458f, 1.165f, -2.347f, 0.868f)
                lineToRelative(-5.081f, -1.694f)
                curveToRelative(-1.23f, -0.41f, -1.764f, -1.854f, -1.097f, -2.965f)
                lineToRelative(1.7f, -2.834f)
                lineToRelative(9.0f, 3.0f)
                close()
                moveTo(13.0f, 9.401f)
                lineToRelative(2.175f, 3.624f)
                curveToRelative(0.482f, 0.804f, 1.458f, 1.165f, 2.347f, 0.868f)
                lineToRelative(5.118f, -1.706f)
                curveToRelative(1.211f, -0.404f, 1.737f, -1.825f, 1.08f, -2.92f)
                lineToRelative(-1.72f, -2.866f)
                lineToRelative(-9.0f, 3.0f)
                close()
                moveTo(10.54f, 14.055f)
                curveToRelative(-0.742f, 1.236f, -2.044f, 1.945f, -3.415f, 1.945f)
                curveToRelative(-0.425f, 0.0f, -0.856f, -0.067f, -1.28f, -0.209f)
                lineToRelative(-3.845f, -1.281f)
                verticalLineToRelative(6.491f)
                lineToRelative(9.0f, 3.0f)
                lineTo(11.0f, 13.288f)
                lineToRelative(-0.46f, 0.766f)
                close()
                moveTo(18.155f, 15.791f)
                curveToRelative(-0.424f, 0.142f, -0.855f, 0.209f, -1.28f, 0.209f)
                curveToRelative(-1.371f, 0.0f, -2.673f, -0.708f, -3.415f, -1.945f)
                lineToRelative(-0.46f, -0.766f)
                verticalLineToRelative(10.712f)
                lineToRelative(9.0f, -3.0f)
                verticalLineToRelative(-6.491f)
                lineToRelative(-3.845f, 1.282f)
                close()
                moveTo(12.0f, 7.627f)
                lineToRelative(6.386f, -2.129f)
                lineToRelative(-3.912f, -3.912f)
                lineToRelative(-5.15f, 5.149f)
                lineToRelative(2.676f, 0.892f)
                close()
                moveTo(7.202f, 6.028f)
                lineTo(11.86f, 1.371f)
                lineTo(10.525f, 0.036f)
                lineTo(5.2f, 5.36f)
                lineToRelative(2.002f, 0.667f)
                close()
            }
        }
        .build()
        return _boxOpenFull!!
    }

private var _boxOpenFull: ImageVector? = null
