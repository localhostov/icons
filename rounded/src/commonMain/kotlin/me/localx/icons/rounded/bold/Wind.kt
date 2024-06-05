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

public val Icons.Bold.Wind: ImageVector
    get() {
        if (_wind != null) {
            return _wind!!
        }
        _wind = Builder(name = "Wind", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.5f, 13.0f)
                horizontalLineToRelative(-5.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                horizontalLineToRelative(5.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 6.5f, 13.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 13.0f)
                horizontalLineToRelative(-7.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                horizontalLineToRelative(7.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 21.0f, 7.468f)
                arcToRelative(2.031f, 2.031f, 0.0f, false, false, -1.656f, -1.941f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 17.0f, 7.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 15.5f, 9.0f)
                curveToRelative(-2.767f, -0.318f, -1.178f, -4.225f, 0.26f, -5.308f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 24.0f, 7.431f)
                arcTo(5.5f, 5.5f, 0.0f, false, true, 18.5f, 13.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 8.0f)
                horizontalLineTo(1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                horizontalLineTo(7.0f)
                arcToRelative(1.069f, 1.069f, 0.0f, false, false, 1.075f, -0.777f)
                arcToRelative(0.982f, 0.982f, 0.0f, false, false, -0.208f, -0.818f)
                arcToRelative(1.158f, 1.158f, 0.0f, false, false, -1.681f, 0.088f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 3.859f, 1.6f)
                arcToRelative(4.125f, 4.125f, 0.0f, false, true, 6.307f, -0.116f)
                arcToRelative(3.989f, 3.989f, 0.0f, false, true, 0.858f, 3.275f)
                arcTo(4.031f, 4.031f, 0.0f, false, true, 7.0f, 8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.585f, 24.008f)
                arcToRelative(4.832f, 4.832f, 0.0f, false, true, -3.709f, -1.752f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 2.323f, -1.9f)
                arcToRelative(1.736f, 1.736f, 0.0f, false, false, 2.542f, 0.11f)
                arcToRelative(1.508f, 1.508f, 0.0f, false, false, 0.322f, -1.256f)
                arcTo(1.606f, 1.606f, 0.0f, false, false, 15.438f, 18.0f)
                horizontalLineTo(1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                horizontalLineTo(15.438f)
                arcToRelative(4.577f, 4.577f, 0.0f, false, true, 4.577f, 3.678f)
                arcToRelative(4.506f, 4.506f, 0.0f, false, true, -4.43f, 5.33f)
                close()
            }
        }
        .build()
        return _wind!!
    }

private var _wind: ImageVector? = null
