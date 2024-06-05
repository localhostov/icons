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

public val Icons.Filled.Gift: ImageVector
    get() {
        if (_gift != null) {
            return _gift!!
        }
        _gift = Builder(name = "Gift", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 14.0f)
                horizontalLineToRelative(9.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(2.0f)
                close()
                moveTo(13.0f, 24.0f)
                horizontalLineToRelative(9.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(13.0f)
                close()
                moveTo(24.0f, 10.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(8.953f)
                curveToRelative(-0.326f, 0.029f, -0.658f, 0.047f, -1.0f, 0.047f)
                reflectiveCurveToRelative(-0.674f, -0.018f, -1.0f, -0.047f)
                verticalLineTo(12.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(10.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 3.0f, 7.0f)
                horizontalLineTo(6.134f)
                arcTo(6.547f, 6.547f, 0.0f, false, true, 4.0f, 2.0f)
                horizontalLineTo(6.0f)
                curveToRelative(0.0f, 2.881f, 1.971f, 4.307f, 4.152f, 4.8f)
                arcTo(9.239f, 9.239f, 0.0f, false, true, 9.0f, 3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 6.0f, 0.0f)
                arcToRelative(9.239f, 9.239f, 0.0f, false, true, -1.152f, 3.8f)
                curveTo(16.029f, 6.307f, 18.0f, 4.881f, 18.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(6.547f, 6.547f, 0.0f, false, true, -2.134f, 5.0f)
                horizontalLineTo(21.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 24.0f, 10.0f)
                close()
                moveTo(11.0f, 3.0f)
                arcToRelative(7.71f, 7.71f, 0.0f, false, false, 1.0f, 3.013f)
                arcTo(7.71f, 7.71f, 0.0f, false, false, 13.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                close()
            }
        }
        .build()
        return _gift!!
    }

private var _gift: ImageVector? = null
