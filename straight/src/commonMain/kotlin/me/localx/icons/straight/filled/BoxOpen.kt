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

public val Icons.Filled.BoxOpen: ImageVector
    get() {
        if (_boxOpen != null) {
            return _boxOpen!!
        }
        _boxOpen = Builder(name = "BoxOpen", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineTo(12.0f, 0.0f)
                lineToRelative(9.0f, 3.0f)
                lineToRelative(-8.992f, 3.001f)
                lineTo(3.0f, 2.989f)
                verticalLineToRelative(0.011f)
                close()
                moveTo(2.0f, 5.0f)
                lineTo(0.3f, 7.834f)
                curveToRelative(-0.667f, 1.112f, -0.133f, 2.555f, 1.097f, 2.965f)
                lineToRelative(5.081f, 1.694f)
                curveToRelative(0.889f, 0.296f, 1.865f, -0.065f, 2.347f, -0.868f)
                lineToRelative(2.175f, -3.624f)
                lineTo(2.0f, 5.0f)
                close()
                moveTo(13.0f, 8.0f)
                lineToRelative(2.175f, 3.624f)
                curveToRelative(0.482f, 0.804f, 1.458f, 1.165f, 2.347f, 0.868f)
                lineToRelative(5.118f, -1.706f)
                curveToRelative(1.211f, -0.404f, 1.737f, -1.825f, 1.08f, -2.92f)
                lineToRelative(-1.72f, -2.866f)
                lineToRelative(-9.0f, 3.0f)
                close()
                moveTo(10.54f, 12.654f)
                curveToRelative(-0.742f, 1.236f, -2.044f, 1.945f, -3.415f, 1.945f)
                curveToRelative(-0.425f, 0.0f, -0.856f, -0.067f, -1.28f, -0.209f)
                lineToRelative(-3.845f, -1.281f)
                verticalLineToRelative(7.892f)
                lineToRelative(9.0f, 3.0f)
                lineTo(11.0f, 11.887f)
                lineToRelative(-0.46f, 0.766f)
                close()
                moveTo(18.155f, 14.39f)
                curveToRelative(-0.424f, 0.142f, -0.855f, 0.209f, -1.28f, 0.209f)
                curveToRelative(-1.371f, 0.0f, -2.673f, -0.708f, -3.415f, -1.945f)
                lineToRelative(-0.46f, -0.766f)
                verticalLineToRelative(12.113f)
                lineToRelative(9.0f, -3.0f)
                verticalLineToRelative(-7.892f)
                lineToRelative(-3.845f, 1.282f)
                close()
            }
        }
        .build()
        return _boxOpen!!
    }

private var _boxOpen: ImageVector? = null
