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

public val Icons.Filled.Syringe: ImageVector
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
                lineToRelative(-2.475f, 2.475f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -5.487f, -0.265f)
                lineToRelative(2.583f, 2.583f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.414f, 1.414f)
                lineToRelative(-2.707f, -2.707f)
                lineToRelative(-1.586f, 1.586f)
                lineToRelative(2.707f, 2.707f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.414f, 1.414f)
                lineToRelative(-2.707f, -2.707f)
                lineToRelative(-1.586f, 1.588f)
                lineToRelative(2.705f, 2.705f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.414f, 1.414f)
                lineToRelative(-2.485f, -2.487f)
                arcToRelative(6.963f, 6.963f, 0.0f, false, false, -0.806f, 3.265f)
                verticalLineToRelative(3.1f)
                lineToRelative(-2.707f, 2.708f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.414f, 1.414f)
                lineToRelative(2.707f, -2.707f)
                horizontalLineToRelative(3.1f)
                arcToRelative(6.954f, 6.954f, 0.0f, false, false, 4.949f, -2.05f)
                lineToRelative(5.072f, -5.072f)
                arcToRelative(4.993f, 4.993f, 0.0f, false, false, 0.482f, -6.478f)
                lineToRelative(2.483f, -2.486f)
                lineToRelative(1.793f, 1.793f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.414f, -1.414f)
                close()
            }
        }
        .build()
        return _syringe!!
    }

private var _syringe: ImageVector? = null
