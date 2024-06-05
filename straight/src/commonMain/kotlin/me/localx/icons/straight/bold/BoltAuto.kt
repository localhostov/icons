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

public val Icons.Bold.BoltAuto: ImageVector
    get() {
        if (_boltAuto != null) {
            return _boltAuto!!
        }
        _boltAuto = Builder(name = "BoltAuto", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.656f, 9.581f)
                curveToRelative(-0.517f, -0.963f, -1.517f, -1.562f, -2.61f, -1.562f)
                horizontalLineToRelative(-3.159f)
                lineTo(12.91f, 0.02f)
                horizontalLineToRelative(-4.193f)
                lineTo(0.479f, 11.42f)
                curveToRelative(-0.6f, 0.904f, -0.652f, 2.062f, -0.136f, 3.022f)
                curveToRelative(0.522f, 0.973f, 1.53f, 1.577f, 2.631f, 1.577f)
                horizontalLineToRelative(3.132f)
                lineToRelative(-2.023f, 8.0f)
                horizontalLineToRelative(4.193f)
                lineToRelative(8.237f, -11.4f)
                curveToRelative(0.604f, -0.91f, 0.659f, -2.074f, 0.143f, -3.038f)
                close()
                moveTo(8.579f, 18.479f)
                lineToRelative(1.381f, -5.46f)
                lineTo(3.023f, 13.019f)
                lineToRelative(5.391f, -7.46f)
                lineToRelative(-1.381f, 5.46f)
                horizontalLineToRelative(6.937f)
                lineToRelative(-5.391f, 7.46f)
                close()
                moveTo(21.087f, 24.019f)
                horizontalLineToRelative(2.923f)
                lineToRelative(-2.822f, -9.745f)
                curveToRelative(-0.371f, -0.75f, -1.155f, -1.242f, -2.042f, -1.255f)
                curveToRelative(-0.843f, 0.013f, -1.626f, 0.505f, -1.998f, 1.255f)
                lineToRelative(-2.816f, 9.745f)
                horizontalLineToRelative(2.849f)
                lineToRelative(0.29f, -1.0f)
                horizontalLineToRelative(3.333f)
                lineToRelative(0.28f, 1.0f)
                close()
                moveTo(17.718f, 21.019f)
                lineToRelative(1.457f, -5.02f)
                lineToRelative(1.407f, 5.02f)
                horizontalLineToRelative(-2.863f)
                close()
            }
        }
        .build()
        return _boltAuto!!
    }

private var _boltAuto: ImageVector? = null
