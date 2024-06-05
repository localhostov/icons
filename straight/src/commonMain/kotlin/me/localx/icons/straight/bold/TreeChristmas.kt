package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.TreeChristmas: ImageVector
    get() {
        if (_treeChristmas != null) {
            return _treeChristmas!!
        }
        _treeChristmas = Builder(name = "TreeChristmas", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(288.832f, 512.0f)
                verticalLineToRelative(-42.667f)
                horizontalLineToRelative(219.157f)
                lineToRelative(-86.037f, -128.277f)
                horizontalLineToRelative(53.909f)
                lineToRelative(-85.333f, -127.723f)
                horizontalLineToRelative(46.933f)
                curveToRelative(0.0f, 0.0f, -99.234f, -145.073f, -134.869f, -191.552f)
                curveToRelative(-0.811f, -1.058f, -3.413f, -4.096f, -3.413f, -4.096f)
                curveTo(288.014f, 6.338f, 272.751f, -0.036f, 256.832f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(-15.925f, -0.047f, -33.431f, 6.363f, -42.347f, 17.707f)
                lineTo(73.301f, 213.333f)
                horizontalLineTo(121.6f)
                lineToRelative(-85.333f, 128.0f)
                horizontalLineToRelative(53.717f)
                lineToRelative(-86.059f, 128.0f)
                horizontalLineToRelative(220.907f)
                verticalLineTo(512.0f)
                horizontalLineTo(288.832f)
                close()
                moveTo(155.733f, 277.333f)
                lineToRelative(85.333f, -128.0f)
                horizontalLineToRelative(-42.901f)
                lineToRelative(58.581f, -81.472f)
                lineToRelative(57.344f, 81.472f)
                horizontalLineToRelative(-43.285f)
                lineToRelative(85.333f, 127.723f)
                horizontalLineToRelative(-54.187f)
                lineToRelative(86.037f, 128.277f)
                horizontalLineTo(124.075f)
                lineToRelative(86.059f, -128.0f)
                horizontalLineTo(155.733f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(245.333f, 352.0f)
                moveToRelative(-32.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -64.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(266.667f, 245.333f)
                moveToRelative(-32.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -64.0f, 0.0f)
            }
        }
        .build()
        return _treeChristmas!!
    }

private var _treeChristmas: ImageVector? = null
