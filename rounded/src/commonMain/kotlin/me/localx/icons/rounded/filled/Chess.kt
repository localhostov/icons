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

public val Icons.Filled.Chess: ImageVector
    get() {
        if (_chess != null) {
            return _chess!!
        }
        _chess = Builder(name = "Chess", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 20.0f)
                horizontalLineTo(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineTo(2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                horizontalLineTo(0.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 20.0f)
                close()
                moveTo(11.752f, 5.707f)
                curveToRelative(-0.019f, 0.041f, -1.029f, 1.6f, -1.029f, 1.6f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.0f, 9.0f)
                horizontalLineTo(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.722f, -1.692f)
                reflectiveCurveTo(2.27f, 5.748f, 2.25f, 5.707f)
                arcTo(2.6f, 2.6f, 0.0f, false, true, 4.6f, 2.0f)
                horizontalLineTo(6.01f)
                verticalLineTo(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(9.4f)
                arcToRelative(2.6f, 2.6f, 0.0f, false, true, 2.352f, 3.707f)
                close()
                moveTo(22.0f, 20.0f)
                horizontalLineTo(15.463f)
                arcToRelative(3.993f, 3.993f, 0.0f, false, true, 0.0f, 4.0f)
                horizontalLineTo(22.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                arcTo(1.952f, 1.952f, 0.0f, false, false, 22.0f, 20.0f)
                close()
                moveTo(11.737f, 18.0f)
                arcToRelative(46.7f, 46.7f, 0.0f, false, true, -1.526f, -7.0f)
                horizontalLineTo(3.791f)
                arcToRelative(46.246f, 46.246f, 0.0f, false, true, -1.527f, 7.0f)
                close()
                moveTo(14.0f, 10.731f)
                verticalLineTo(18.0f)
                horizontalLineToRelative(8.0f)
                verticalLineTo(10.731f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 23.0f, 9.0f)
                verticalLineTo(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineTo(9.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 14.0f, 10.731f)
                close()
            }
        }
        .build()
        return _chess!!
    }

private var _chess: ImageVector? = null
