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

public val Icons.Bold.CakeBirthday: ImageVector
    get() {
        if (_cakeBirthday != null) {
            return _cakeBirthday!!
        }
        _cakeBirthday = Builder(name = "CakeBirthday", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 12.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 18.5f, 9.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineTo(7.006f)
                arcTo(2.993f, 2.993f, 0.0f, false, false, 15.0f, 4.423f)
                curveToRelative(0.0f, -1.257f, -1.211f, -2.67f, -1.933f, -3.4f)
                lineTo(12.0f, -0.057f)
                lineTo(10.933f, 1.022f)
                curveTo(10.211f, 1.753f, 9.0f, 3.166f, 9.0f, 4.423f)
                arcToRelative(2.993f, 2.993f, 0.0f, false, false, 1.5f, 2.583f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(-5.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 2.0f, 12.5f)
                verticalLineTo(21.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(22.0f)
                close()
                moveTo(5.0f, 15.693f)
                arcTo(2.922f, 2.922f, 0.0f, false, false, 6.282f, 16.0f)
                arcToRelative(2.764f, 2.764f, 0.0f, false, false, 2.833f, -2.5f)
                arcTo(2.779f, 2.779f, 0.0f, false, false, 11.949f, 16.0f)
                arcToRelative(2.764f, 2.764f, 0.0f, false, false, 2.833f, -2.5f)
                arcTo(2.778f, 2.778f, 0.0f, false, false, 17.615f, 16.0f)
                arcTo(2.928f, 2.928f, 0.0f, false, false, 19.0f, 15.64f)
                verticalLineTo(21.0f)
                horizontalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _cakeBirthday!!
    }

private var _cakeBirthday: ImageVector? = null
