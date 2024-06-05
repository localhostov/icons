package me.localx.icons.straight.outline

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

public val Icons.Outline.Sack: ImageVector
    get() {
        if (_sack != null) {
            return _sack!!
        }
        _sack = Builder(name = "Sack", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.541f, 5.471f)
                curveToRelative(1.197f, -1.02f, 2.459f, -2.548f, 2.459f, -4.471f)
                lineTo(17.0f, 0.0f)
                lineTo(7.0f, 0.0f)
                lineTo(7.0f, 1.0f)
                curveToRelative(0.0f, 1.924f, 1.263f, 3.451f, 2.459f, 4.471f)
                curveTo(4.754f, 7.149f, 1.0f, 13.123f, 1.0f, 18.0f)
                curveToRelative(0.0f, 3.309f, 2.691f, 6.0f, 6.0f, 6.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(3.309f, 0.0f, 6.0f, -2.691f, 6.0f, -6.0f)
                curveToRelative(0.0f, -4.877f, -3.754f, -10.851f, -8.459f, -12.529f)
                close()
                moveTo(9.207f, 2.0f)
                horizontalLineToRelative(5.582f)
                curveToRelative(-0.521f, 1.256f, -1.89f, 2.31f, -2.783f, 2.852f)
                curveToRelative(-0.752f, -0.46f, -2.251f, -1.512f, -2.799f, -2.852f)
                close()
                moveTo(17.0f, 22.0f)
                lineTo(7.0f, 22.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, -1.794f, -4.0f, -4.0f)
                curveToRelative(0.0f, -5.161f, 4.603f, -10.983f, 8.998f, -10.983f)
                curveToRelative(4.476f, 0.0f, 9.002f, 5.823f, 9.002f, 10.983f)
                curveToRelative(0.0f, 2.206f, -1.794f, 4.0f, -4.0f, 4.0f)
                close()
            }
        }
        .build()
        return _sack!!
    }

private var _sack: ImageVector? = null
