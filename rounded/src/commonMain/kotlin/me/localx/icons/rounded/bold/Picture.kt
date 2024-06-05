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

public val Icons.Bold.Picture: ImageVector
    get() {
        if (_picture != null) {
            return _picture!!
        }
        _picture = Builder(name = "Picture", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5f, 0.0f)
                horizontalLineTo(4.5f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 0.0f, 4.5f)
                verticalLineToRelative(15.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 4.5f, 24.0f)
                horizontalLineToRelative(15.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 24.0f, 19.5f)
                verticalLineTo(4.5f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 19.5f, 0.0f)
                close()
                moveTo(4.5f, 3.0f)
                horizontalLineToRelative(15.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 21.0f, 4.5f)
                verticalLineToRelative(15.0f)
                arcToRelative(1.492f, 1.492f, 0.0f, false, true, -0.44f, 1.06f)
                lineToRelative(-8.732f, -8.732f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.656f, 0.0f)
                lineTo(3.0f, 15.0f)
                verticalLineTo(4.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 4.5f, 3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5f, 7.5f)
                moveToRelative(-2.5f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 5.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -5.0f, 0.0f)
            }
        }
        .build()
        return _picture!!
    }

private var _picture: ImageVector? = null
