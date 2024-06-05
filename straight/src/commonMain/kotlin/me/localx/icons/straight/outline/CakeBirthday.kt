package me.localx.icons.straight.outline

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
                moveTo(24.0f, 22.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(12.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(5.794f)
                arcToRelative(2.536f, 2.536f, 0.0f, false, false, 1.537f, -2.331f)
                curveTo(14.537f, 2.062f, 12.0f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(9.463f, 2.062f, 9.463f, 3.463f)
                arcTo(2.536f, 2.536f, 0.0f, false, false, 11.0f, 5.794f)
                verticalLineTo(9.0f)
                horizontalLineTo(5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(24.0f)
                close()
                moveTo(5.0f, 11.0f)
                horizontalLineTo(19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(2.98f)
                curveToRelative(-0.936f, -0.1f, -1.5f, -0.7f, -1.5f, -0.98f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, 0.343f, -0.682f, 1.0f, -1.75f, 1.0f)
                curveTo(13.661f, 15.0f, 13.0f, 14.306f, 13.0f, 14.0f)
                horizontalLineTo(11.0f)
                curveToRelative(0.0f, 0.343f, -0.682f, 1.0f, -1.75f, 1.0f)
                curveToRelative(-1.089f, 0.0f, -1.75f, -0.694f, -1.75f, -1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, 0.315f, -0.579f, 0.888f, -1.5f, 0.981f)
                verticalLineTo(12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 5.0f, 11.0f)
                close()
                moveTo(4.0f, 16.979f)
                arcTo(4.156f, 4.156f, 0.0f, false, false, 6.5f, 16.0f)
                arcToRelative(4.309f, 4.309f, 0.0f, false, false, 5.5f, 0.015f)
                arcTo(4.309f, 4.309f, 0.0f, false, false, 17.5f, 16.0f)
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
