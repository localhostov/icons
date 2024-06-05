package me.localx.icons.rounded.bold

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

public val Icons.Bold.BoxBallot: ImageVector
    get() {
        if (_boxBallot != null) {
            return _boxBallot!!
        }
        _boxBallot = Builder(name = "BoxBallot", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 7.023f)
                verticalLineToRelative(-2.523f)
                curveToRelative(0.0f, -2.481f, -2.019f, -4.5f, -4.5f, -4.5f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-2.481f, 0.0f, -4.5f, 2.019f, -4.5f, 4.5f)
                verticalLineToRelative(2.523f)
                curveToRelative(-2.799f, 0.254f, -5.0f, 2.613f, -5.0f, 5.477f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 3.033f, 2.467f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(3.032f, 0.0f, 5.5f, -2.467f, 5.5f, -5.5f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -2.864f, -2.201f, -5.224f, -5.0f, -5.477f)
                close()
                moveTo(8.0f, 4.5f)
                curveToRelative(0.0f, -0.827f, 0.673f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.827f, 0.0f, 1.5f, 0.673f, 1.5f, 1.5f)
                verticalLineToRelative(6.5f)
                lineTo(8.0f, 11.0f)
                lineTo(8.0f, 4.5f)
                close()
                moveTo(5.0f, 10.05f)
                verticalLineToRelative(2.45f)
                curveToRelative(0.0f, 0.829f, 0.671f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(11.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                verticalLineToRelative(-2.45f)
                curveToRelative(1.14f, 0.232f, 2.0f, 1.242f, 2.0f, 2.45f)
                verticalLineToRelative(3.5f)
                lineTo(3.0f, 16.0f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -1.207f, 0.86f, -2.217f, 2.0f, -2.45f)
                close()
                moveTo(18.5f, 21.0f)
                lineTo(5.5f, 21.0f)
                curveToRelative(-1.207f, 0.0f, -2.217f, -0.86f, -2.45f, -2.0f)
                lineTo(20.95f, 19.0f)
                curveToRelative(-0.232f, 1.14f, -1.242f, 2.0f, -2.45f, 2.0f)
                close()
            }
        }
        .build()
        return _boxBallot!!
    }

private var _boxBallot: ImageVector? = null
