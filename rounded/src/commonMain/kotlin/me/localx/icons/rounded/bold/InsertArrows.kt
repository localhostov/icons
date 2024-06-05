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

public val Icons.Bold.InsertArrows: ImageVector
    get() {
        if (_insertArrows != null) {
            return _insertArrows!!
        }
        _insertArrows = Builder(name = "InsertArrows", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 13.5f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 3.033f, -2.468f, 5.5f, -5.5f, 5.5f)
                lineTo(5.5f, 24.0f)
                curveToRelative(-3.032f, 0.0f, -5.5f, -2.467f, -5.5f, -5.5f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -0.829f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.671f, 1.5f, 1.5f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 1.378f, 1.121f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, -1.122f, 2.5f, -2.5f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -0.829f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.671f, 1.5f, 1.5f)
                close()
                moveTo(5.109f, 7.791f)
                curveToRelative(0.574f, 0.643f, 0.891f, 1.471f, 0.891f, 2.333f)
                verticalLineToRelative(4.876f)
                horizontalLineToRelative(-1.223f)
                curveToRelative(-0.776f, 0.0f, -1.165f, 0.939f, -0.616f, 1.488f)
                lineToRelative(2.757f, 2.757f)
                curveToRelative(0.34f, 0.34f, 0.892f, 0.34f, 1.232f, 0.0f)
                lineToRelative(2.757f, -2.757f)
                curveToRelative(0.549f, -0.549f, 0.16f, -1.488f, -0.616f, -1.488f)
                horizontalLineToRelative(-1.291f)
                verticalLineToRelative(-4.876f)
                curveToRelative(0.0f, -1.599f, -0.587f, -3.137f, -1.653f, -4.331f)
                lineTo(2.618f, 0.5f)
                curveTo(2.067f, -0.116f, 1.119f, -0.171f, 0.501f, 0.381f)
                curveTo(-0.117f, 0.934f, -0.171f, 1.882f, 0.382f, 2.5f)
                lineToRelative(4.728f, 5.292f)
                close()
                moveTo(15.917f, 19.245f)
                curveToRelative(0.34f, 0.34f, 0.892f, 0.34f, 1.232f, 0.0f)
                lineToRelative(2.757f, -2.757f)
                curveToRelative(0.549f, -0.549f, 0.16f, -1.488f, -0.616f, -1.488f)
                horizontalLineToRelative(-1.291f)
                verticalLineToRelative(-4.877f)
                curveToRelative(0.0f, -0.861f, 0.316f, -1.689f, 0.89f, -2.332f)
                lineToRelative(4.729f, -5.292f)
                curveToRelative(0.553f, -0.618f, 0.499f, -1.566f, -0.119f, -2.118f)
                curveToRelative(-0.618f, -0.553f, -1.566f, -0.498f, -2.117f, 0.119f)
                lineToRelative(-4.729f, 5.292f)
                curveToRelative(-1.065f, 1.193f, -1.652f, 2.731f, -1.652f, 4.33f)
                verticalLineToRelative(4.877f)
                horizontalLineToRelative(-1.223f)
                curveToRelative(-0.776f, 0.0f, -1.165f, 0.939f, -0.616f, 1.488f)
                lineToRelative(2.757f, 2.757f)
                close()
            }
        }
        .build()
        return _insertArrows!!
    }

private var _insertArrows: ImageVector? = null
