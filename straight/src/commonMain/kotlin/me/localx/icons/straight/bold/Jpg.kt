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

public val Icons.Bold.Jpg: ImageVector
    get() {
        if (_jpg != null) {
            return _jpg!!
        }
        _jpg = Builder(name = "Jpg", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.257f, 5.723f)
                lineToRelative(0.0f, -1.473f)
                horizontalLineToRelative(0.715f)
                arcToRelative(0.735f, 0.735f, 0.0f, true, true, 0.0f, 1.47f)
                close()
                moveTo(24.0f, 3.0f)
                verticalLineTo(17.471f)
                lineTo(17.471f, 24.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 3.0f, 0.0f)
                horizontalLineTo(21.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 24.0f, 3.0f)
                close()
                moveTo(14.0f, 7.084f)
                arcToRelative(1.991f, 1.991f, 0.0f, false, false, 2.0f, 1.985f)
                horizontalLineToRelative(0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -1.984f)
                verticalLineTo(6.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(0.749f)
                verticalLineToRelative(0.084f)
                arcToRelative(0.759f, 0.759f, 0.0f, false, true, -0.75f, 0.735f)
                arcToRelative(0.742f, 0.742f, 0.0f, false, true, -0.749f, -0.751f)
                verticalLineTo(5.0f)
                arcTo(0.742f, 0.742f, 0.0f, false, true, 16.0f, 4.25f)
                arcToRelative(0.772f, 0.772f, 0.0f, false, true, 0.75f, 0.75f)
                horizontalLineTo(18.0f)
                arcToRelative(2.013f, 2.013f, 0.0f, false, false, -2.0f, -2.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.991f, 1.991f, 0.0f, false, false, -2.0f, 1.985f)
                close()
                moveTo(9.0f, 9.069f)
                horizontalLineToRelative(1.25f)
                verticalLineToRelative(-2.1f)
                lineToRelative(0.717f, 0.0f)
                arcToRelative(1.985f, 1.985f, 0.0f, true, false, 0.0f, -3.97f)
                horizontalLineTo(9.0f)
                close()
                moveTo(4.0f, 7.084f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 6.0f, 9.068f)
                horizontalLineTo(6.0f)
                arcTo(1.991f, 1.991f, 0.0f, false, false, 8.0f, 7.084f)
                verticalLineTo(3.0f)
                horizontalLineTo(6.75f)
                verticalLineTo(7.068f)
                arcTo(0.742f, 0.742f, 0.0f, false, true, 6.0f, 7.819f)
                arcToRelative(0.759f, 0.759f, 0.0f, false, true, -0.75f, -0.735f)
                curveToRelative(0.0f, -0.03f, 0.0f, -0.084f, 0.0f, -0.084f)
                horizontalLineTo(4.0f)
                close()
                moveTo(21.0f, 11.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(15.0f)
                horizontalLineToRelative(6.0f)
                close()
            }
        }
        .build()
        return _jpg!!
    }

private var _jpg: ImageVector? = null
