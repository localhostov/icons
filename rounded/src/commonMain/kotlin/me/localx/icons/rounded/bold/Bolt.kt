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

public val Icons.Bold.Bolt: ImageVector
    get() {
        if (_bolt != null) {
            return _bolt!!
        }
        _bolt = Builder(name = "Bolt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.371f, 24.0f)
                arcToRelative(2.318f, 2.318f, 0.0f, false, true, -0.978f, -0.218f)
                arcToRelative(2.649f, 2.649f, 0.0f, false, true, -1.335f, -3.191f)
                lineTo(10.115f, 16.0f)
                horizontalLineTo(7.41f)
                arcToRelative(3.409f, 3.409f, 0.0f, false, true, -3.263f, -4.4f)
                lineToRelative(2.893f, -9.2f)
                arcTo(3.385f, 3.385f, 0.0f, false, true, 10.3f, 0.0f)
                horizontalLineToRelative(3.674f)
                arcToRelative(3.026f, 3.026f, 0.0f, false, true, 2.834f, 4.088f)
                lineTo(15.685f, 7.0f)
                horizontalLineToRelative(0.9f)
                arcToRelative(3.408f, 3.408f, 0.0f, false, true, 2.859f, 5.265f)
                reflectiveCurveToRelative(-5.955f, 10.513f, -5.975f, 10.543f)
                arcTo(2.547f, 2.547f, 0.0f, false, true, 11.371f, 24.0f)
                close()
                moveTo(10.3f, 3.0f)
                arcToRelative(0.408f, 0.408f, 0.0f, false, false, -0.392f, 0.291f)
                lineToRelative(-2.892f, 9.2f)
                arcToRelative(0.393f, 0.393f, 0.0f, false, false, 0.068f, 0.347f)
                arcTo(0.4f, 0.4f, 0.0f, false, false, 7.41f, 13.0f)
                horizontalLineTo(12.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.461f, 1.837f)
                lineToRelative(-0.743f, 3.223f)
                reflectiveCurveToRelative(4.185f, -7.388f, 4.208f, -7.421f)
                arcTo(0.409f, 0.409f, 0.0f, false, false, 16.588f, 10.0f)
                horizontalLineTo(13.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.4f, -2.039f)
                lineTo(14.0f, 3.023f)
                close()
            }
        }
        .build()
        return _bolt!!
    }

private var _bolt: ImageVector? = null
