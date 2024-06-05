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
                moveTo(22.5f, 21.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(14.318f)
                arcTo(5.324f, 5.324f, 0.0f, false, false, 16.682f, 9.0f)
                horizontalLineTo(13.5f)
                verticalLineTo(6.333f)
                arcTo(2.993f, 2.993f, 0.0f, false, false, 15.0f, 3.75f)
                arcTo(5.718f, 5.718f, 0.0f, false, false, 13.555f, 0.69f)
                arcToRelative(2.168f, 2.168f, 0.0f, false, false, -3.109f, 0.0f)
                arcTo(5.726f, 5.726f, 0.0f, false, false, 9.0f, 3.75f)
                arcToRelative(2.993f, 2.993f, 0.0f, false, false, 1.5f, 2.583f)
                verticalLineTo(9.0f)
                horizontalLineTo(7.318f)
                arcTo(5.324f, 5.324f, 0.0f, false, false, 2.0f, 14.318f)
                verticalLineTo(21.0f)
                horizontalLineTo(1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineToRelative(21.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                close()
                moveTo(5.0f, 16.74f)
                arcToRelative(2.336f, 2.336f, 0.0f, false, false, 1.75f, -1.876f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 9.375f, 17.0f)
                arcTo(2.491f, 2.491f, 0.0f, false, false, 12.0f, 14.864f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 14.625f, 17.0f)
                arcToRelative(2.491f, 2.491f, 0.0f, false, false, 2.625f, -2.136f)
                arcTo(2.354f, 2.354f, 0.0f, false, false, 19.0f, 16.738f)
                verticalLineTo(21.0f)
                horizontalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _cakeBirthday!!
    }

private var _cakeBirthday: ImageVector? = null
