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

public val Icons.Filled.LocationAlt: ImageVector
    get() {
        if (_locationAlt != null) {
            return _locationAlt!!
        }
        _locationAlt = Builder(name = "LocationAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.071f, 17.213f)
                arcToRelative(10.141f, 10.141f, 0.0f, false, false, 0.0f, -14.259f)
                arcToRelative(9.94f, 9.94f, 0.0f, false, false, -14.142f, 0.0f)
                arcToRelative(10.14f, 10.14f, 0.0f, false, false, 0.026f, 14.284f)
                lineToRelative(3.584f, 3.339f)
                arcToRelative(4.92f, 4.92f, 0.0f, false, false, 6.9f, 0.018f)
                close()
                moveTo(13.342f, 14.649f)
                arcToRelative(3.023f, 3.023f, 0.0f, false, true, -2.683f, 0.0f)
                lineToRelative(-2.0f, -1.0f)
                arcToRelative(2.986f, 2.986f, 0.0f, false, true, -1.659f, -2.684f)
                verticalLineToRelative(-2.965f)
                arcToRelative(2.986f, 2.986f, 0.0f, false, true, 1.658f, -2.685f)
                lineToRelative(2.0f, -1.0f)
                arcToRelative(3.014f, 3.014f, 0.0f, false, true, 2.683f, 0.0f)
                lineToRelative(2.0f, 1.0f)
                arcToRelative(2.986f, 2.986f, 0.0f, false, true, 1.659f, 2.685f)
                verticalLineToRelative(2.966f)
                arcToRelative(2.986f, 2.986f, 0.0f, false, true, -1.658f, 2.684f)
                close()
                moveTo(14.949f, 7.694f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.051f, 0.306f)
                verticalLineToRelative(2.966f)
                arcToRelative(0.994f, 0.994f, 0.0f, false, true, -0.553f, 0.895f)
                lineToRelative(-2.0f, 1.0f)
                arcToRelative(1.006f, 1.006f, 0.0f, false, true, -0.895f, 0.0f)
                lineToRelative(-2.0f, -1.0f)
                arcToRelative(0.994f, 0.994f, 0.0f, false, true, -0.552f, -0.896f)
                verticalLineToRelative(-2.965f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.051f, -0.3f)
                lineToRelative(2.18f, 1.09f)
                arcToRelative(1.72f, 1.72f, 0.0f, false, false, 1.538f, 0.0f)
                close()
                moveTo(20.0f, 23.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineToRelative(-14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineToRelative(14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _locationAlt!!
    }

private var _locationAlt: ImageVector? = null
