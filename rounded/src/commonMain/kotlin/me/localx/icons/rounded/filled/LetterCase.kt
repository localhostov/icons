package me.localx.icons.rounded.filled

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

public val Icons.Filled.LetterCase: ImageVector
    get() {
        if (_letterCase != null) {
            return _letterCase!!
        }
        _letterCase = Builder(name = "LetterCase", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.4f, 5.553f)
                arcToRelative(1.041f, 1.041f, 0.0f, false, false, -1.789f, 0.0f)
                lineToRelative(-5.5f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.789f, 0.894f)
                lineTo(3.619f, 14.0f)
                horizontalLineTo(9.383f)
                lineToRelative(1.724f, 3.447f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.789f, -0.894f)
                close()
                moveTo(4.619f, 12.0f)
                lineTo(6.5f, 8.236f)
                lineTo(8.383f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(0.026f)
                arcTo(4.948f, 4.948f, 0.0f, false, false, 19.0f, 8.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 0.0f, 10.0f)
                arcToRelative(4.948f, 4.948f, 0.0f, false, false, 3.0f, -1.026f)
                lineTo(22.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                lineTo(24.0f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 23.0f, 8.0f)
                close()
                moveTo(19.0f, 16.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 3.0f, -3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 19.0f, 16.0f)
                close()
            }
        }
        .build()
        return _letterCase!!
    }

private var _letterCase: ImageVector? = null
