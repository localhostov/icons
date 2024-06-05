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

public val Icons.Bold.Sandwich: ImageVector
    get() {
        if (_sandwich != null) {
            return _sandwich!!
        }
        _sandwich = Builder(name = "Sandwich", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.075f, 14.69f)
                arcTo(1.51f, 1.51f, 0.0f, false, false, 24.0f, 15.0f)
                verticalLineToRelative(3.0f)
                arcToRelative(4.483f, 4.483f, 0.0f, false, true, -2.742f, -0.923f)
                arcToRelative(0.473f, 0.473f, 0.0f, false, false, -0.517f, 0.0f)
                arcToRelative(4.6f, 4.6f, 0.0f, false, true, -5.483f, 0.0f)
                arcToRelative(0.473f, 0.473f, 0.0f, false, false, -0.517f, 0.0f)
                arcToRelative(4.6f, 4.6f, 0.0f, false, true, -5.483f, 0.0f)
                arcToRelative(0.473f, 0.473f, 0.0f, false, false, -0.517f, 0.0f)
                arcToRelative(4.6f, 4.6f, 0.0f, false, true, -5.483f, 0.0f)
                arcToRelative(0.473f, 0.473f, 0.0f, false, false, -0.517f, 0.0f)
                arcTo(4.484f, 4.484f, 0.0f, false, true, 0.0f, 18.0f)
                verticalLineTo(15.0f)
                arcToRelative(1.511f, 1.511f, 0.0f, false, false, 0.924f, -0.308f)
                arcToRelative(3.48f, 3.48f, 0.0f, false, true, 4.151f, 0.0f)
                arcToRelative(1.562f, 1.562f, 0.0f, false, false, 1.849f, 0.0f)
                arcToRelative(3.48f, 3.48f, 0.0f, false, true, 4.151f, 0.0f)
                arcToRelative(1.562f, 1.562f, 0.0f, false, false, 1.849f, 0.0f)
                arcToRelative(3.48f, 3.48f, 0.0f, false, true, 4.151f, 0.0f)
                arcToRelative(1.562f, 1.562f, 0.0f, false, false, 1.849f, 0.0f)
                arcTo(3.48f, 3.48f, 0.0f, false, true, 23.075f, 14.69f)
                close()
                moveTo(24.0f, 7.222f)
                verticalLineTo(12.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(6.8f)
                lineTo(14.876f, 0.288f)
                arcToRelative(3.389f, 3.389f, 0.0f, false, true, 3.956f, 0.905f)
                close()
                moveTo(21.0f, 8.331f)
                lineTo(16.554f, 3.145f)
                arcToRelative(0.412f, 0.412f, 0.0f, false, false, -0.476f, -0.109f)
                lineTo(3.0f, 8.757f)
                verticalLineTo(9.0f)
                horizontalLineTo(21.0f)
                close()
                moveTo(0.0f, 21.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 2.5f, 24.0f)
                horizontalLineToRelative(19.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 24.0f, 21.5f)
                verticalLineTo(20.0f)
                horizontalLineTo(0.0f)
                close()
            }
        }
        .build()
        return _sandwich!!
    }

private var _sandwich: ImageVector? = null
