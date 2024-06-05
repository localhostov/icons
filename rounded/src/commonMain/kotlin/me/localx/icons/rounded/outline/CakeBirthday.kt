package me.localx.icons.rounded.outline

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

public val Icons.Outline.CakeBirthday: ImageVector
    get() {
        if (_cakeBirthday != null) {
            return _cakeBirthday!!
        }
        _cakeBirthday = Builder(name = "CakeBirthday", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 22.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(14.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, -5.0f, -5.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(6.039f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 14.5f, 3.75f)
                arcTo(7.293f, 7.293f, 0.0f, false, false, 12.738f, 0.327f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.476f, 0.0f)
                arcTo(7.293f, 7.293f, 0.0f, false, false, 9.5f, 3.75f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 11.0f, 6.039f)
                verticalLineTo(9.0f)
                horizontalLineTo(7.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, -5.0f, 5.0f)
                verticalLineToRelative(8.0f)
                horizontalLineTo(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineTo(23.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                close()
                moveTo(7.0f, 11.0f)
                horizontalLineTo(17.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                verticalLineToRelative(1.98f)
                curveToRelative(-0.936f, -0.1f, -1.5f, -0.7f, -1.5f, -0.98f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                curveToRelative(0.0f, 0.343f, -0.682f, 1.0f, -1.75f, 1.0f)
                curveTo(13.661f, 16.0f, 13.0f, 15.306f, 13.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                curveToRelative(0.0f, 0.343f, -0.682f, 1.0f, -1.75f, 1.0f)
                curveToRelative(-1.089f, 0.0f, -1.75f, -0.694f, -1.75f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                curveToRelative(0.0f, 0.315f, -0.579f, 0.888f, -1.5f, 0.981f)
                verticalLineTo(14.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 7.0f, 11.0f)
                close()
                moveTo(4.0f, 17.979f)
                arcTo(4.156f, 4.156f, 0.0f, false, false, 6.5f, 17.0f)
                arcToRelative(4.309f, 4.309f, 0.0f, false, false, 5.5f, 0.015f)
                arcTo(4.309f, 4.309f, 0.0f, false, false, 17.5f, 17.0f)
                arcToRelative(4.156f, 4.156f, 0.0f, false, false, 2.5f, 0.978f)
                verticalLineTo(22.0f)
                horizontalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _cakeBirthday!!
    }

private var _cakeBirthday: ImageVector? = null
