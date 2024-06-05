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

public val Icons.Bold.SignOutAlt: ImageVector
    get() {
        if (_signOutAlt != null) {
            return _signOutAlt!!
        }
        _signOutAlt = Builder(name = "SignOutAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.5f, 16.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 10.0f, 17.5f)
                verticalLineToRelative(0.8f)
                arcTo(2.7f, 2.7f, 0.0f, false, true, 7.3f, 21.0f)
                horizontalLineTo(5.7f)
                arcTo(2.7f, 2.7f, 0.0f, false, true, 3.0f, 18.3f)
                verticalLineTo(5.7f)
                arcTo(2.7f, 2.7f, 0.0f, false, true, 5.7f, 3.0f)
                horizontalLineTo(7.3f)
                arcTo(2.7f, 2.7f, 0.0f, false, true, 10.0f, 5.7f)
                verticalLineToRelative(0.8f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                verticalLineTo(5.7f)
                arcTo(5.706f, 5.706f, 0.0f, false, false, 7.3f, 0.0f)
                horizontalLineTo(5.7f)
                arcTo(5.706f, 5.706f, 0.0f, false, false, 0.0f, 5.7f)
                verticalLineTo(18.3f)
                arcTo(5.706f, 5.706f, 0.0f, false, false, 5.7f, 24.0f)
                horizontalLineTo(7.3f)
                arcTo(5.706f, 5.706f, 0.0f, false, false, 13.0f, 18.3f)
                verticalLineToRelative(-0.8f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 11.5f, 16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.561f, 9.525f)
                lineTo(17.975f, 4.939f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.121f, 2.122f)
                lineToRelative(3.411f, 3.411f)
                lineTo(7.0f, 10.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineTo(7.0f)
                lineToRelative(12.318f, -0.028f)
                lineToRelative(-3.467f, 3.467f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.121f, 2.122f)
                lineToRelative(4.586f, -4.586f)
                arcTo(3.505f, 3.505f, 0.0f, false, false, 22.561f, 9.525f)
                close()
            }
        }
        .build()
        return _signOutAlt!!
    }

private var _signOutAlt: ImageVector? = null
