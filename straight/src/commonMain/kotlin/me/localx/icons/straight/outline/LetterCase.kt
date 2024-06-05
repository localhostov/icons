package me.localx.icons.straight.outline

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
import me.localx.icons.straight.Icons

public val Icons.Outline.LetterCase: ImageVector
    get() {
        if (_letterCase != null) {
            return _letterCase!!
        }
        _letterCase = Builder(name = "LetterCase", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 8.0f)
                lineTo(22.0f, 9.026f)
                arcTo(4.948f, 4.948f, 0.0f, false, false, 19.0f, 8.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 0.0f, 10.0f)
                arcToRelative(4.948f, 4.948f, 0.0f, false, false, 3.0f, -1.026f)
                lineTo(22.0f, 18.0f)
                horizontalLineToRelative(2.0f)
                lineTo(24.0f, 8.0f)
                close()
                moveTo(19.0f, 16.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 3.0f, -3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 19.0f, 16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 18.0f)
                horizontalLineToRelative(2.236f)
                lineTo(7.118f, 3.764f)
                lineTo(0.0f, 18.0f)
                horizontalLineTo(2.236f)
                lineToRelative(2.0f, -4.0f)
                horizontalLineTo(10.0f)
                close()
                moveTo(5.236f, 12.0f)
                lineTo(7.118f, 8.236f)
                lineTo(9.0f, 12.0f)
                close()
            }
        }
        .build()
        return _letterCase!!
    }

private var _letterCase: ImageVector? = null
