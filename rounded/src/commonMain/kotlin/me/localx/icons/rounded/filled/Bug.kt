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

public val Icons.Filled.Bug: ImageVector
    get() {
        if (_bug != null) {
            return _bug!!
        }
        _bug = Builder(name = "Bug", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 19.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(4.93f)
                arcToRelative(8.248f, 8.248f, 0.0f, false, false, 14.14f, 0.0f)
                horizontalLineTo(22.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                verticalLineTo(19.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                horizontalLineTo(19.947f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 0.325f, -2.273f)
                arcTo(8.37f, 8.37f, 0.0f, false, false, 20.2f, 13.7f)
                lineToRelative(-0.175f, -0.7f)
                horizontalLineTo(23.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                horizontalLineTo(19.522f)
                lineTo(18.513f, 7.0f)
                horizontalLineTo(22.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                verticalLineTo(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(18.0f)
                curveToRelative(-0.018f, 0.0f, -0.032f, 0.009f, -0.05f, 0.01f)
                arcToRelative(6.411f, 6.411f, 0.0f, false, false, -11.89f, 0.0f)
                curveTo(6.039f, 5.011f, 6.021f, 5.0f, 6.0f, 5.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 0.0f, 1.0f)
                verticalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 2.0f, 7.0f)
                horizontalLineTo(5.485f)
                lineTo(4.472f, 11.0f)
                horizontalLineTo(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineTo(3.965f)
                lineToRelative(-0.145f, 0.573f)
                lineTo(3.8f, 13.7f)
                arcToRelative(8.37f, 8.37f, 0.0f, false, false, -0.07f, 1.032f)
                arcTo(8.2f, 8.2f, 0.0f, false, false, 4.053f, 17.0f)
                horizontalLineTo(2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 0.0f, 19.0f)
                close()
            }
        }
        .build()
        return _bug!!
    }

private var _bug: ImageVector? = null
