package me.localx.icons.rounded.outline

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

public val Icons.Outline.LevelDown: ImageVector
    get() {
        if (_levelDown != null) {
            return _levelDown!!
        }
        _levelDown = Builder(name = "LevelDown", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.713f, 18.233f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.414f, -0.011f)
                lineToRelative(-2.885f, 2.834f)
                curveToRelative(-0.108f, 0.108f, -0.255f, 0.244f, -0.414f, 0.389f)
                verticalLineTo(5.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 8.0f, 0.0f)
                horizontalLineTo(1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 1.0f, 2.0f)
                horizontalLineTo(8.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                verticalLineTo(21.445f)
                curveToRelative(-0.16f, -0.146f, -0.308f, -0.284f, -0.42f, -0.395f)
                lineTo(7.7f, 18.222f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.4f, 1.425f)
                lineTo(9.172f, 22.47f)
                curveToRelative(0.2f, 0.2f, 0.513f, 0.487f, 0.84f, 0.777f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.977f, 0.0f)
                curveToRelative(0.326f, -0.289f, 0.636f, -0.572f, 0.833f, -0.769f)
                lineTo(17.7f, 19.647f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 17.713f, 18.233f)
                close()
            }
        }
        .build()
        return _levelDown!!
    }

private var _levelDown: ImageVector? = null
