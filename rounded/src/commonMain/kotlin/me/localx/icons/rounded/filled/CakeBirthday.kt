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

public val Icons.Filled.CakeBirthday: ImageVector
    get() {
        if (_cakeBirthday != null) {
            return _cakeBirthday!!
        }
        _cakeBirthday = Builder(name = "CakeBirthday", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 23.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineTo(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineTo(23.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 24.0f, 23.0f)
                close()
                moveTo(3.75f, 15.0f)
                curveToRelative(1.068f, 0.0f, 1.75f, -0.657f, 1.75f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                curveToRelative(0.0f, 0.306f, 0.661f, 1.0f, 1.75f, 1.0f)
                curveToRelative(1.068f, 0.0f, 1.75f, -0.657f, 1.75f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                curveToRelative(0.0f, 0.306f, 0.661f, 1.0f, 1.75f, 1.0f)
                curveToRelative(1.068f, 0.0f, 1.75f, -0.657f, 1.75f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                curveToRelative(0.0f, 0.306f, 0.661f, 1.0f, 1.75f, 1.0f)
                reflectiveCurveTo(22.0f, 14.306f, 22.0f, 14.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, -5.0f, -5.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(6.816f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 15.0f, 4.0f)
                arcTo(6.683f, 6.683f, 0.0f, false, false, 13.332f, 0.59f)
                arcToRelative(1.856f, 1.856f, 0.0f, false, false, -2.663f, 0.0f)
                arcTo(6.676f, 6.676f, 0.0f, false, false, 9.0f, 4.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 2.0f, 2.816f)
                verticalLineTo(9.0f)
                horizontalLineTo(7.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, -5.0f, 5.0f)
                curveTo(2.0f, 14.306f, 2.661f, 15.0f, 3.75f, 15.0f)
                close()
                moveTo(3.0f, 20.0f)
                horizontalLineTo(21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineTo(16.625f)
                arcTo(4.359f, 4.359f, 0.0f, false, true, 20.25f, 17.0f)
                arcToRelative(4.194f, 4.194f, 0.0f, false, true, -2.75f, -1.0f)
                arcToRelative(4.309f, 4.309f, 0.0f, false, true, -5.5f, 0.015f)
                arcTo(4.309f, 4.309f, 0.0f, false, true, 6.5f, 16.0f)
                arcToRelative(4.194f, 4.194f, 0.0f, false, true, -2.75f, 1.0f)
                arcTo(4.359f, 4.359f, 0.0f, false, true, 2.0f, 16.625f)
                verticalLineTo(19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 3.0f, 20.0f)
                close()
            }
        }
        .build()
        return _cakeBirthday!!
    }

private var _cakeBirthday: ImageVector? = null
