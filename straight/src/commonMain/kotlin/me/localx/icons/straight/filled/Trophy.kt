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

public val Icons.Filled.Trophy: ImageVector
    get() {
        if (_trophy != null) {
            return _trophy!!
        }
        _trophy = Builder(name = "Trophy", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.059f, 16.0f)
                horizontalLineToRelative(0.941f)
                curveToRelative(6.643f, 0.0f, 9.0f, -3.5f, 9.0f, -6.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -2.913f, -3.441f)
                arcToRelative(11.564f, 11.564f, 0.0f, false, false, 0.854f, -2.466f)
                arcToRelative(2.961f, 2.961f, 0.0f, false, false, -0.613f, -2.476f)
                arcToRelative(3.022f, 3.022f, 0.0f, false, false, -2.351f, -1.117f)
                horizontalLineToRelative(-13.954f)
                arcToRelative(3.022f, 3.022f, 0.0f, false, false, -2.351f, 1.117f)
                arcToRelative(2.961f, 2.961f, 0.0f, false, false, -0.613f, 2.476f)
                arcToRelative(11.688f, 11.688f, 0.0f, false, false, 0.852f, 2.467f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -2.911f, 3.44f)
                curveToRelative(0.0f, 3.0f, 2.357f, 6.5f, 9.0f, 6.5f)
                horizontalLineToRelative(0.933f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 0.067f, 0.637f)
                verticalLineToRelative(3.363f)
                arcToRelative(1.883f, 1.883f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(1.885f, 1.885f, 0.0f, false, true, -2.008f, -2.0f)
                verticalLineToRelative(-3.363f)
                arcToRelative(4.646f, 4.646f, 0.0f, false, true, 0.067f, -0.637f)
                close()
                moveTo(15.477f, 13.349f)
                arcToRelative(21.035f, 21.035f, 0.0f, false, false, 4.556f, -5.349f)
                horizontalLineToRelative(0.467f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.5f, 1.5f)
                curveToRelative(0.0f, 2.176f, -1.992f, 4.5f, -7.153f, 4.5f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, true, 0.63f, -0.651f)
                close()
                moveTo(2.0f, 9.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.5f, -1.5f)
                horizontalLineToRelative(0.464f)
                arcToRelative(20.978f, 20.978f, 0.0f, false, false, 4.551f, 5.349f)
                arcToRelative(3.668f, 3.668f, 0.0f, false, true, 0.63f, 0.651f)
                curveToRelative(-5.161f, 0.0f, -7.145f, -2.324f, -7.145f, -4.5f)
                close()
            }
        }
        .build()
        return _trophy!!
    }

private var _trophy: ImageVector? = null
