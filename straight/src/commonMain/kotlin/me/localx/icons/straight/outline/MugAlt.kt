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

public val Icons.Outline.MugAlt: ImageVector
    get() {
        if (_mugAlt != null) {
            return _mugAlt!!
        }
        _mugAlt = Builder(name = "MugAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 22.0f)
                horizontalLineTo(20.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(0.0f)
                close()
                moveTo(24.0f, 8.0f)
                curveToRelative(0.0f, 2.774f, -2.185f, 6.0f, -5.0f, 6.0f)
                horizontalLineTo(17.965f)
                lineToRelative(-1.137f, 6.0f)
                horizontalLineTo(3.172f)
                lineTo(0.065f, 3.618f)
                arcTo(3.02f, 3.02f, 0.0f, false, true, 3.0f, 0.0f)
                horizontalLineTo(17.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.928f, 3.653f)
                lineToRelative(-0.076f, 0.4f)
                curveTo(22.46f, 4.307f, 24.0f, 5.734f, 24.0f, 8.0f)
                close()
                moveTo(17.969f, 3.249f)
                arcToRelative(1.013f, 1.013f, 0.0f, false, false, -0.189f, -0.874f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 17.0f, 2.0f)
                horizontalLineTo(3.0f)
                arcToRelative(1.006f, 1.006f, 0.0f, false, false, -0.977f, 1.216f)
                lineTo(4.828f, 18.0f)
                horizontalLineTo(15.172f)
                close()
                moveTo(22.0f, 8.0f)
                curveToRelative(0.0f, -0.467f, 0.0f, -1.831f, -2.521f, -1.985f)
                lineTo(18.345f, 12.0f)
                horizontalLineTo(19.0f)
                curveTo(20.545f, 12.0f, 22.0f, 9.746f, 22.0f, 8.0f)
                close()
            }
        }
        .build()
        return _mugAlt!!
    }

private var _mugAlt: ImageVector? = null
