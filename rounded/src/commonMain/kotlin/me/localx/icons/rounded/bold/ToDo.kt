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

public val Icons.Bold.ToDo: ImageVector
    get() {
        if (_toDo != null) {
            return _toDo!!
        }
        _toDo = Builder(name = "ToDo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.5f, 18.0f)
                horizontalLineToRelative(-1.5f)
                lineTo(18.0f, 5.5f)
                curveToRelative(0.0f, -3.032f, -2.468f, -5.5f, -5.5f, -5.5f)
                horizontalLineToRelative(-7.0f)
                curveTo(2.468f, 0.0f, 0.0f, 2.468f, 0.0f, 5.5f)
                verticalLineToRelative(14.5f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(13.5f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(15.0f, 18.0f)
                lineTo(6.5f, 18.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                lineTo(3.0f, 5.5f)
                curveToRelative(0.0f, -1.379f, 1.121f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(7.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, 1.121f, 2.5f, 2.5f)
                verticalLineToRelative(12.5f)
                close()
                moveTo(11.061f, 5.211f)
                curveToRelative(0.586f, 0.586f, 0.586f, 1.535f, 0.0f, 2.121f)
                lineToRelative(-1.892f, 1.892f)
                curveToRelative(-0.517f, 0.517f, -1.195f, 0.775f, -1.875f, 0.775f)
                reflectiveCurveToRelative(-1.357f, -0.258f, -1.874f, -0.774f)
                lineToRelative(-0.981f, -0.981f)
                curveToRelative(-0.585f, -0.587f, -0.585f, -1.536f, 0.0f, -2.122f)
                curveToRelative(0.586f, -0.584f, 1.536f, -0.585f, 2.122f, 0.0f)
                lineToRelative(0.732f, 0.734f)
                lineToRelative(1.646f, -1.646f)
                curveToRelative(0.586f, -0.586f, 1.535f, -0.586f, 2.121f, 0.0f)
                close()
                moveTo(11.061f, 11.211f)
                curveToRelative(0.586f, 0.586f, 0.586f, 1.535f, 0.0f, 2.121f)
                lineToRelative(-1.892f, 1.892f)
                curveToRelative(-0.517f, 0.517f, -1.195f, 0.775f, -1.875f, 0.775f)
                reflectiveCurveToRelative(-1.357f, -0.258f, -1.874f, -0.774f)
                lineToRelative(-0.981f, -0.981f)
                curveToRelative(-0.585f, -0.587f, -0.585f, -1.536f, 0.0f, -2.122f)
                curveToRelative(0.586f, -0.584f, 1.536f, -0.585f, 2.122f, 0.0f)
                lineToRelative(0.732f, 0.734f)
                lineToRelative(1.646f, -1.646f)
                curveToRelative(0.586f, -0.586f, 1.535f, -0.586f, 2.121f, 0.0f)
                close()
                moveTo(24.0f, 2.114f)
                verticalLineToRelative(11.495f)
                curveToRelative(0.0f, 1.0f, -0.397f, 1.96f, -1.105f, 2.667f)
                lineToRelative(-0.588f, 0.588f)
                curveToRelative(-0.17f, 0.17f, -0.445f, 0.17f, -0.615f, 0.0f)
                lineToRelative(-0.588f, -0.588f)
                curveToRelative(-0.707f, -0.707f, -1.105f, -1.667f, -1.105f, -2.667f)
                lineTo(19.999f, 2.0f)
                curveTo(20.0f, 0.827f, 21.009f, -0.109f, 22.206f, 0.01f)
                curveToRelative(1.041f, 0.104f, 1.794f, 1.058f, 1.794f, 2.104f)
                close()
            }
        }
        .build()
        return _toDo!!
    }

private var _toDo: ImageVector? = null
