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

public val Icons.Filled.LevelUp: ImageVector
    get() {
        if (_levelUp != null) {
            return _levelUp!!
        }
        _levelUp = Builder(name = "LevelUp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.713f, 5.767f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.414f, 0.011f)
                lineTo(13.414f, 2.944f)
                curveToRelative(-0.108f, -0.108f, -0.255f, -0.244f, -0.414f, -0.389f)
                verticalLineTo(19.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, -5.0f, 5.0f)
                horizontalLineTo(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineTo(8.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -3.0f)
                verticalLineTo(2.555f)
                curveToRelative(-0.16f, 0.146f, -0.308f, 0.284f, -0.42f, 0.4f)
                lineTo(7.7f, 5.778f)
                arcTo(1.0f, 1.0f, 0.0f, true, true, 6.3f, 4.353f)
                lineTo(9.172f, 1.53f)
                curveToRelative(0.2f, -0.2f, 0.513f, -0.487f, 0.84f, -0.777f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.977f, 0.0f)
                curveToRelative(0.326f, 0.289f, 0.636f, 0.572f, 0.833f, 0.769f)
                lineTo(17.7f, 4.353f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 17.713f, 5.767f)
                close()
            }
        }
        .build()
        return _levelUp!!
    }

private var _levelUp: ImageVector? = null
