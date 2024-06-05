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

public val Icons.Bold.LetterCase: ImageVector
    get() {
        if (_letterCase != null) {
            return _letterCase!!
        }
        _letterCase = Builder(name = "LetterCase", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.7f, 5.127f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.684f, 0.0f)
                lineToRelative(-4.856f, 9.7f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 1.5f, 17.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.343f, -0.83f)
                lineTo(3.435f, 15.0f)
                horizontalLineTo(9.283f)
                lineToRelative(0.585f, 1.17f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.343f, 0.83f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.344f, -2.175f)
                close()
                moveTo(4.935f, 12.0f)
                lineTo(6.359f, 9.152f)
                lineTo(7.783f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.5f, 6.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.4f, 0.978f)
                arcTo(4.944f, 4.944f, 0.0f, false, false, 19.0f, 7.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 0.0f, 10.0f)
                arcToRelative(4.944f, 4.944f, 0.0f, false, false, 2.1f, -0.478f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 24.0f, 16.0f)
                verticalLineTo(8.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 22.5f, 6.5f)
                close()
                moveTo(19.0f, 14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 2.0f, -2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 19.0f, 14.0f)
                close()
            }
        }
        .build()
        return _letterCase!!
    }

private var _letterCase: ImageVector? = null
