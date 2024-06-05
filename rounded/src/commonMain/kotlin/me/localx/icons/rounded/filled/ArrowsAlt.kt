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

public val Icons.Filled.ArrowsAlt: ImageVector
    get() {
        if (_arrowsAlt != null) {
            return _arrowsAlt!!
        }
        _arrowsAlt = Builder(name = "ArrowsAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.731f, 11.356f)
                lineToRelative(-3.343f, -3.3f)
                arcTo(0.816f, 0.816f, 0.0f, false, false, 19.0f, 8.638f)
                verticalLineTo(11.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(2.363f)
                arcToRelative(0.816f, 0.816f, 0.0f, false, false, 0.58f, -1.389f)
                lineTo(12.644f, 0.27f)
                arcToRelative(0.9f, 0.9f, 0.0f, false, false, -1.288f, 0.0f)
                lineToRelative(-3.3f, 3.342f)
                arcTo(0.816f, 0.816f, 0.0f, false, false, 8.637f, 5.0f)
                horizontalLineTo(11.0f)
                verticalLineToRelative(6.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(8.638f)
                arcToRelative(0.816f, 0.816f, 0.0f, false, false, -1.388f, -0.581f)
                lineToRelative(-3.343f, 3.3f)
                arcToRelative(0.906f, 0.906f, 0.0f, false, false, 0.0f, 1.289f)
                lineToRelative(3.343f, 3.3f)
                arcTo(0.816f, 0.816f, 0.0f, false, false, 5.0f, 15.363f)
                verticalLineTo(13.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(6.0f)
                horizontalLineTo(8.637f)
                arcToRelative(0.816f, 0.816f, 0.0f, false, false, -0.58f, 1.389f)
                lineToRelative(3.3f, 3.342f)
                arcToRelative(0.9f, 0.9f, 0.0f, false, false, 1.288f, 0.0f)
                lineToRelative(3.3f, -3.342f)
                arcTo(0.816f, 0.816f, 0.0f, false, false, 15.363f, 19.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.363f)
                arcToRelative(0.816f, 0.816f, 0.0f, false, false, 1.388f, 0.581f)
                lineToRelative(3.343f, -3.3f)
                arcTo(0.906f, 0.906f, 0.0f, false, false, 23.731f, 11.356f)
                close()
            }
        }
        .build()
        return _arrowsAlt!!
    }

private var _arrowsAlt: ImageVector? = null
