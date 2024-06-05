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
                moveTo(12.016f, 5.731f)
                lineTo(3.025f, 2.724f)
                lineTo(10.427f, 0.257f)
                curveToRelative(1.026f, -0.342f, 2.136f, -0.342f, 3.162f, 0.0f)
                lineToRelative(7.419f, 2.473f)
                lineToRelative(-8.992f, 3.001f)
                close()
                moveTo(8.834f, 11.354f)
                lineToRelative(2.175f, -3.624f)
                lineTo(3.063f, 5.081f)
                curveToRelative(-0.617f, -0.206f, -1.293f, 0.045f, -1.628f, 0.602f)
                lineTo(0.308f, 7.563f)
                curveToRelative(-0.667f, 1.112f, -0.133f, 2.555f, 1.097f, 2.965f)
                lineToRelative(5.081f, 1.694f)
                curveToRelative(0.889f, 0.296f, 1.865f, -0.065f, 2.347f, -0.868f)
                close()
                moveTo(3.008f, 2.718f)
                verticalLineToRelative(0.011f)
                lineToRelative(0.017f, -0.006f)
                lineToRelative(-0.017f, -0.006f)
                close()
                moveTo(11.008f, 23.905f)
                lineTo(11.008f, 11.617f)
                lineToRelative(-0.46f, 0.766f)
                curveToRelative(-0.742f, 1.236f, -2.044f, 1.945f, -3.415f, 1.945f)
                curveToRelative(-0.425f, 0.0f, -0.856f, -0.067f, -1.28f, -0.209f)
                lineToRelative(-3.845f, -1.281f)
                verticalLineToRelative(4.558f)
                curveToRelative(0.0f, 2.152f, 1.377f, 4.063f, 3.419f, 4.743f)
                lineToRelative(4.435f, 1.478f)
                curveToRelative(0.374f, 0.121f, 0.758f, 0.22f, 1.146f, 0.287f)
                close()
                moveTo(23.728f, 7.596f)
                lineToRelative(-1.148f, -1.913f)
                curveToRelative(-0.334f, -0.557f, -1.011f, -0.808f, -1.628f, -0.602f)
                lineToRelative(-7.945f, 2.648f)
                lineToRelative(2.175f, 3.624f)
                curveToRelative(0.482f, 0.804f, 1.458f, 1.165f, 2.347f, 0.868f)
                lineToRelative(5.118f, -1.706f)
                curveToRelative(1.211f, -0.404f, 1.737f, -1.825f, 1.08f, -2.92f)
                close()
                moveTo(16.883f, 14.329f)
                curveToRelative(-1.371f, 0.0f, -2.673f, -0.708f, -3.415f, -1.945f)
                lineToRelative(-0.46f, -0.766f)
                verticalLineToRelative(12.282f)
                curveToRelative(0.422f, -0.074f, 0.84f, -0.182f, 1.236f, -0.314f)
                horizontalLineToRelative(0.01f)
                lineToRelative(4.335f, -1.446f)
                curveToRelative(2.042f, -0.681f, 3.419f, -2.591f, 3.419f, -4.743f)
                verticalLineToRelative(-4.559f)
                lineToRelative(-3.845f, 1.282f)
                curveToRelative(-0.424f, 0.142f, -0.855f, 0.209f, -1.28f, 0.209f)
                close()
            }
        }
        .build()
        return _boxOpen!!
    }

private var _boxOpen: ImageVector? = null
