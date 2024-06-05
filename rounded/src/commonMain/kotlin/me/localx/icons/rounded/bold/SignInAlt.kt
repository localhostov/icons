package me.localx.icons.rounded.bold

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
import me.localx.icons.rounded.Icons

public val Icons.Bold.SignInAlt: ImageVector
    get() {
        if (_signInAlt != null) {
            return _signInAlt!!
        }
        _signInAlt = Builder(name = "SignInAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.589f, 0.0f)
                horizontalLineTo(5.411f)
                arcTo(5.371f, 5.371f, 0.0f, false, false, 0.0f, 5.318f)
                verticalLineTo(7.182f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                verticalLineTo(5.318f)
                arcTo(2.369f, 2.369f, 0.0f, false, true, 5.411f, 3.0f)
                horizontalLineTo(18.589f)
                arcTo(2.369f, 2.369f, 0.0f, false, true, 21.0f, 5.318f)
                verticalLineTo(18.682f)
                arcTo(2.369f, 2.369f, 0.0f, false, true, 18.589f, 21.0f)
                horizontalLineTo(5.411f)
                arcTo(2.369f, 2.369f, 0.0f, false, true, 3.0f, 18.682f)
                verticalLineTo(16.818f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -3.0f, 0.0f)
                verticalLineToRelative(1.864f)
                arcTo(5.371f, 5.371f, 0.0f, false, false, 5.411f, 24.0f)
                horizontalLineTo(18.589f)
                arcTo(5.371f, 5.371f, 0.0f, false, false, 24.0f, 18.682f)
                verticalLineTo(5.318f)
                arcTo(5.371f, 5.371f, 0.0f, false, false, 18.589f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.5f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 5.0f, 13.5f)
                horizontalLineTo(5.0f)
                lineToRelative(9.975f, -0.027f)
                lineToRelative(-3.466f, 3.466f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.121f, 2.122f)
                lineToRelative(4.586f, -4.586f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.0f, -4.95f)
                lineTo(13.634f, 4.939f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -2.121f, 2.122f)
                lineToRelative(3.413f, 3.412f)
                lineTo(5.0f, 10.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 3.5f, 12.0f)
                close()
            }
        }
        .build()
        return _signInAlt!!
    }

private var _signInAlt: ImageVector? = null
