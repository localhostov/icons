package me.localx.icons.rounded.outline

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

public val Icons.Outline.Syringe: ImageVector
    get() {
        if (_syringe != null) {
            return _syringe!!
        }
        _syringe = Builder(name = "Syringe", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.707f, 5.293f)
                lineToRelative(-5.0f, -5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.414f, 1.414f)
                lineToRelative(1.793f, 1.793f)
                lineToRelative(-1.486f, 1.483f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -6.481f, 0.481f)
                lineToRelative(-6.069f, 6.072f)
                arcToRelative(6.954f, 6.954f, 0.0f, false, false, -2.05f, 4.949f)
                verticalLineToRelative(3.1f)
                lineToRelative(-2.707f, 2.708f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.414f, 1.414f)
                lineToRelative(2.707f, -2.707f)
                horizontalLineToRelative(3.1f)
                arcToRelative(6.954f, 6.954f, 0.0f, false, false, 4.949f, -2.05f)
                lineToRelative(6.072f, -6.072f)
                arcToRelative(4.993f, 4.993f, 0.0f, false, false, 0.482f, -6.478f)
                lineToRelative(1.483f, -1.486f)
                lineToRelative(1.793f, 1.793f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.414f, -1.414f)
                close()
                moveTo(17.122f, 11.464f)
                lineTo(11.05f, 17.536f)
                arcToRelative(4.967f, 4.967f, 0.0f, false, true, -3.535f, 1.464f)
                horizontalLineToRelative(-2.515f)
                verticalLineToRelative(-2.515f)
                arcToRelative(5.11f, 5.11f, 0.0f, false, true, 0.095f, -0.976f)
                lineToRelative(1.2f, 1.2f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.414f, -1.414f)
                lineToRelative(-1.741f, -1.741f)
                arcToRelative(4.989f, 4.989f, 0.0f, false, true, 0.5f, -0.6f)
                lineToRelative(1.032f, -1.04f)
                lineToRelative(1.793f, 1.793f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.414f, -1.414f)
                lineToRelative(-1.793f, -1.793f)
                lineToRelative(1.586f, -1.586f)
                lineToRelative(1.793f, 1.793f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.414f, -1.414f)
                lineToRelative(-1.793f, -1.793f)
                lineToRelative(0.622f, -0.622f)
                arcToRelative(3.073f, 3.073f, 0.0f, false, true, 4.242f, 0.0f)
                lineToRelative(0.344f, 0.344f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, 4.242f)
                close()
            }
        }
        .build()
        return _syringe!!
    }

private var _syringe: ImageVector? = null
