package me.localx.icons.straight.filled

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

public val Icons.Filled.Cocktail: ImageVector
    get() {
        if (_cocktail != null) {
            return _cocktail!!
        }
        _cocktail = Builder(name = "Cocktail", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.982f, 3.0f)
                horizontalLineTo(0.018f)
                arcToRelative(2.985f, 2.985f, 0.0f, false, true, 0.5f, -1.683f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 3.0f, 0.0f)
                horizontalLineTo(21.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.487f, 1.317f)
                arcTo(2.985f, 2.985f, 0.0f, false, true, 23.982f, 3.0f)
                close()
                moveTo(11.0f, 11.962f)
                verticalLineTo(22.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(11.962f)
                arcTo(12.565f, 12.565f, 0.0f, false, false, 23.385f, 5.0f)
                horizontalLineTo(0.615f)
                arcTo(12.565f, 12.565f, 0.0f, false, false, 11.0f, 11.962f)
                close()
            }
        }
        .build()
        return _cocktail!!
    }

private var _cocktail: ImageVector? = null
